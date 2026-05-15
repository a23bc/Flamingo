package z5;

import A5.AbstractC0026b;
import A5.AbstractC0028d;
import w5.C1793k;

/* JADX INFO: renamed from: z5.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2103A extends AbstractC0028d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1793k f21247b;

    @Override // A5.AbstractC0028d
    public final boolean a(AbstractC0026b abstractC0026b) {
        y yVar = (y) abstractC0026b;
        if (this.f21246a >= 0) {
            return false;
        }
        long j3 = yVar.f21340w;
        if (j3 < yVar.f21341x) {
            yVar.f21341x = j3;
        }
        this.f21246a = j3;
        return true;
    }

    @Override // A5.AbstractC0028d
    public final c5.d[] b(AbstractC0026b abstractC0026b) {
        long j3 = this.f21246a;
        this.f21246a = -1L;
        this.f21247b = null;
        return ((y) abstractC0026b).v(j3);
    }
}
