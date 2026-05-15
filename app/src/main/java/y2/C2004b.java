package y2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: y2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2004b extends AbstractC2005c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AssetManager f20312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Uri f20313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InputStream f20314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f20315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20316w;

    public C2004b(Context context) {
        super(false);
        this.f20312s = context.getAssets();
    }

    @Override // y2.h
    public final void close() {
        this.f20313t = null;
        try {
            try {
                InputStream inputStream = this.f20314u;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C2003a(e7, 2000);
            }
        } finally {
            this.f20314u = null;
            if (this.f20316w) {
                this.f20316w = false;
                p();
            }
        }
    }

    @Override // y2.h
    public final long e(m mVar) throws C2003a {
        try {
            Uri uri = mVar.f20345a;
            long j3 = mVar.f20349e;
            this.f20313t = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q();
            InputStream inputStreamOpen = this.f20312s.open(path, 1);
            this.f20314u = inputStreamOpen;
            if (inputStreamOpen.skip(j3) < j3) {
                throw new C2003a(null, 2008);
            }
            long j7 = mVar.f20350f;
            if (j7 != -1) {
                this.f20315v = j7;
            } else {
                long jAvailable = this.f20314u.available();
                this.f20315v = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f20315v = -1L;
                }
            }
            this.f20316w = true;
            r(mVar);
            return this.f20315v;
        } catch (C2003a e7) {
            throw e7;
        } catch (IOException e8) {
            throw new C2003a(e8, e8 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // y2.h
    public final Uri h() {
        return this.f20313t;
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) throws C2003a {
        if (i8 == 0) {
            return 0;
        }
        long j3 = this.f20315v;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i8 = (int) Math.min(j3, i8);
                } catch (IOException e7) {
                    throw new C2003a(e7, 2000);
                }
            }
            InputStream inputStream = this.f20314u;
            int i9 = w2.t.f18881a;
            int i10 = inputStream.read(bArr, i7, i8);
            if (i10 != -1) {
                long j7 = this.f20315v;
                if (j7 != -1) {
                    this.f20315v = j7 - ((long) i10);
                }
                k(i10);
                return i10;
            }
        }
        return -1;
    }
}
