package O0;

import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f5370p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ n0.d f5371q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(n0.d dVar, int i7, int i8) {
        super(2);
        this.f5370p = i8;
        this.f5371q = dVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f5370p;
        C0912t c0912t = (C0912t) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                w0.a(this.f5371q, c0912t, C0879c.B(7));
                break;
            default:
                v.n0.b(this.f5371q, c0912t, C0879c.B(7));
                break;
        }
        return Y4.o.f8736a;
    }
}
