package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.C0915u0;
import f0.D0;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f12266c = new E(1, 0, 2);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        int iE = c0535h.e(0);
        int i7 = l02.f11713v;
        int iM = l02.M(l02.f11695b, l02.r(i7));
        int iG = l02.g(l02.f11695b, l02.r(i7 + 1));
        for (int iMax = Math.max(iM, iG - iE); iMax < iG; iMax++) {
            Object obj = l02.f11696c[l02.h(iMax)];
            if (obj instanceof D0) {
                jVar.e((D0) obj);
            } else if (obj instanceof C0915u0) {
                ((C0915u0) obj).d();
            }
        }
        if (!(iE > 0)) {
            AbstractC0914u.c("Check failed");
        }
        int i8 = l02.f11713v;
        int iM2 = l02.M(l02.f11695b, l02.r(i8));
        int iG2 = l02.g(l02.f11695b, l02.r(i8 + 1)) - iE;
        if (iG2 < iM2) {
            AbstractC0914u.c("Check failed");
        }
        l02.I(iG2, iE, i8);
        int i9 = l02.f11701i;
        if (i9 >= iM2) {
            l02.f11701i = i9 - iE;
        }
    }
}
