package y2;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f20332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20333c;

    public /* synthetic */ i(j jVar, Object obj, int i7) {
        this.f20331a = i7;
        this.f20332b = jVar;
        this.f20333c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20331a) {
            case 0:
                this.f20332b.getClass();
                byte[] bArr = (byte[]) this.f20333c;
                return i6.h.v(bArr.length, bArr);
            default:
                Uri uri = (Uri) this.f20333c;
                h hVarV = this.f20332b.f20336b.v();
                try {
                    n nVar = (n) hVarV;
                    nVar.e(new m(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
                    byte[] bArrCopyOf = new byte[1024];
                    int iN = 0;
                    int i7 = 0;
                    while (iN != -1) {
                        if (i7 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        iN = nVar.n(bArrCopyOf, i7, bArrCopyOf.length - i7);
                        if (iN != -1) {
                            i7 += iN;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i7);
                    Bitmap bitmapV = i6.h.v(bArrCopyOf2.length, bArrCopyOf2);
                    nVar.close();
                    return bitmapV;
                } catch (Throwable th) {
                    ((n) hVarV).close();
                    throw th;
                }
        }
    }
}
