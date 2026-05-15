package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.C0877b;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952j extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0952j f12298c = new C0952j(0, 2, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        int i7;
        n0.f fVar = (n0.f) c0535h.f(0);
        int iC = l02.c((C0877b) c0535h.f(1));
        if (!(l02.f11711t < iC)) {
            AbstractC0914u.c("Check failed");
        }
        N5.d.Q(l02, interfaceC0881d, iC);
        int i8 = l02.f11711t;
        int iD = l02.f11713v;
        while (iD >= 0 && !l02.x(iD)) {
            iD = l02.D(l02.f11695b, iD);
        }
        int iT = iD + 1;
        int iK = 0;
        while (iT < i8) {
            if (l02.u(i8, iT)) {
                if (l02.x(iT)) {
                    iK = 0;
                }
                iT++;
            } else {
                iK += l02.x(iT) ? 1 : l02.f11695b[(l02.r(iT) * 5) + 1] & 67108863;
                iT += l02.t(iT);
            }
        }
        while (true) {
            i7 = l02.f11711t;
            if (i7 >= iC) {
                break;
            }
            if (l02.u(iC, i7)) {
                int i9 = l02.f11711t;
                if (i9 < l02.f11712u && (l02.f11695b[(l02.r(i9) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0881d.l(l02.C(l02.f11711t));
                    iK = 0;
                }
                l02.O();
            } else {
                iK += l02.K();
            }
        }
        if (i7 != iC) {
            AbstractC0914u.c("Check failed");
        }
        fVar.f14486a = iK;
    }
}
