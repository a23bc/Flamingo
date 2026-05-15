package D;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: D.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0072m implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f1351p;

    public /* synthetic */ C0072m(InterfaceC1398p interfaceC1398p, int i7, int i8) {
        this.f1350o = i8;
        this.f1351p = interfaceC1398p;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f1350o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                AbstractC0074o.a(this.f1351p, c0912t, C0879c.B(1));
                break;
            case 1:
                AbstractC1113a.m(this.f1351p, c0912t, C0879c.B(1));
                break;
            default:
                AbstractC1113a.l(this.f1351p, c0912t, C0879c.B(1));
                break;
        }
        return Y4.o.f8736a;
    }
}
