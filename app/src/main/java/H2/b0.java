package H2;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements K2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.m f3134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.B f3135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3136c;

    public b0(y2.m mVar, y2.h hVar) {
        r.f3226a.getAndIncrement();
        this.f3134a = mVar;
        this.f3135b = new y2.B(hVar);
    }

    @Override // K2.k
    public final void a() {
        y2.B b7 = this.f3135b;
        b7.f20301p = 0L;
        try {
            b7.e(this.f3134a);
            int iN = 0;
            while (iN != -1) {
                int i7 = (int) b7.f20301p;
                byte[] bArr = this.f3136c;
                if (bArr == null) {
                    this.f3136c = new byte[1024];
                } else if (i7 == bArr.length) {
                    this.f3136c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f3136c;
                iN = b7.n(bArr2, i7, bArr2.length - i7);
            }
            try {
                b7.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                b7.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // K2.k
    public final void b() {
    }
}
