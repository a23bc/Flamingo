package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0877b;
import f0.C0915u0;
import f0.D0;
import f0.InterfaceC0881d;
import f0.L0;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f12307e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f12309g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f12306d = new r(1, 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f12308f = new r(1, 2, 2);

    static {
        int i7 = 1;
        f12307e = new r(i7, i7, 1);
        int i8 = 1;
        f12309g = new r(i8, i8, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i8, int i9) {
        super(i7, i8);
        this.f12310c = i9;
    }

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        switch (this.f12310c) {
            case 0:
                Object objA = ((InterfaceC1180a) c0535h.f(0)).a();
                C0877b c0877b = (C0877b) c0535h.f(1);
                int iE = c0535h.e(0);
                c0877b.getClass();
                l02.T(l02.c(c0877b), objA);
                interfaceC0881d.p(iE, objA);
                interfaceC0881d.l(objA);
                break;
            case 1:
                C0877b c0877b2 = (C0877b) c0535h.f(0);
                int iE2 = c0535h.e(0);
                interfaceC0881d.G();
                c0877b2.getClass();
                interfaceC0881d.i(iE2, l02.C(l02.c(c0877b2)));
                break;
            case 2:
                Object objF = c0535h.f(0);
                C0877b c0877b3 = (C0877b) c0535h.f(1);
                int iE3 = c0535h.e(0);
                if (objF instanceof D0) {
                    D0 d02 = (D0) objF;
                    jVar.f14495e.b(d02);
                    jVar.f14494d.a(d02);
                }
                Object objJ = l02.J(l02.c(c0877b3), iE3, objF);
                if (objJ instanceof D0) {
                    jVar.e((D0) objJ);
                } else if (objJ instanceof C0915u0) {
                    ((C0915u0) objJ).d();
                }
                break;
            default:
                Object objF2 = c0535h.f(0);
                int iE4 = c0535h.e(0);
                if (objF2 instanceof D0) {
                    D0 d03 = (D0) objF2;
                    jVar.f14495e.b(d03);
                    jVar.f14494d.a(d03);
                }
                Object objJ2 = l02.J(l02.f11711t, iE4, objF2);
                if (objJ2 instanceof D0) {
                    jVar.e((D0) objJ2);
                } else if (objJ2 instanceof C0915u0) {
                    ((C0915u0) objJ2).d();
                }
                break;
        }
    }

    @Override // g0.J
    public C0877b b(C0535h c0535h) {
        switch (this.f12310c) {
            case 0:
                return (C0877b) c0535h.f(1);
            case 1:
                return (C0877b) c0535h.f(0);
            default:
                return super.b(c0535h);
        }
    }
}
