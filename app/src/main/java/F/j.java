package F;

import H.K;
import M.V;
import X.K0;
import f0.C0879c;
import f0.C0912t;
import f0.C0913t0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2079r;

    public /* synthetic */ j(K k7, int i7, Object obj, int i8, int i9) {
        this.f2076o = i9;
        this.f2079r = k7;
        this.f2077p = i7;
        this.f2078q = obj;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        Integer num = (Integer) obj2;
        switch (this.f2076o) {
            case 0:
                num.getClass();
                int iB = C0879c.B(1);
                ((l) this.f2079r).e(this.f2077p, this.f2078q, c0912t, iB);
                break;
            case 1:
                num.getClass();
                int iB2 = C0879c.B(1);
                ((G.h) this.f2079r).e(this.f2077p, this.f2078q, c0912t, iB2);
                break;
            case 2:
                num.getClass();
                int iB3 = C0879c.B(1);
                ((I.w) this.f2079r).e(this.f2077p, this.f2078q, c0912t, iB3);
                break;
            case 3:
                num.getClass();
                V.d((K0) this.f2079r, (n0.d) this.f2078q, c0912t, C0879c.B(this.f2077p | 1));
                break;
            case 4:
                num.getClass();
                int iB4 = C0879c.B(this.f2077p | 1);
                C0879c.a((C0913t0) this.f2079r, (n0.d) this.f2078q, c0912t, iB4);
                break;
            case 5:
                num.getClass();
                C0879c.b((C0913t0[]) this.f2079r, (n0.d) this.f2078q, c0912t, C0879c.B(this.f2077p | 1));
                break;
            default:
                num.intValue();
                ((n0.d) this.f2079r).i(this.f2078q, c0912t, C0879c.B(this.f2077p) | 1);
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i7, int i8) {
        this.f2076o = i8;
        this.f2079r = obj;
        this.f2078q = obj2;
        this.f2077p = i7;
    }
}
