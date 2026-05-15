package R;

import f0.C0879c;
import f0.C0912t;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f6187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0.d f6188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6189r;

    public /* synthetic */ i(InterfaceC1398p interfaceC1398p, n0.d dVar, int i7, int i8) {
        this.f6186o = i8;
        this.f6187p = interfaceC1398p;
        this.f6188q = dVar;
        this.f6189r = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f6186o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int iB = C0879c.B(this.f6189r | 1);
                I0.c.g(this.f6187p, this.f6188q, c0912t, iB);
                break;
            case 1:
                int iB2 = C0879c.B(this.f6189r | 1);
                I0.c.h(this.f6187p, this.f6188q, c0912t, iB2);
                break;
            case 2:
                int iB3 = C0879c.B(this.f6189r | 1);
                p.d(this.f6187p, this.f6188q, c0912t, iB3);
                break;
            case 3:
                int iB4 = C0879c.B(this.f6189r | 1);
                M3.a.q(this.f6187p, this.f6188q, c0912t, iB4);
                break;
            default:
                int iB5 = C0879c.B(this.f6189r | 1);
                M3.a.r(this.f6187p, this.f6188q, c0912t, iB5);
                break;
        }
        return Y4.o.f8736a;
    }
}
