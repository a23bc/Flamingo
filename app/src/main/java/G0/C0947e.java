package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.C0877b;
import f0.D0;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947e extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0947e f12293c = new C0947e(0, 2, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        C0877b c0877b = (C0877b) c0535h.f(0);
        Object objF = c0535h.f(1);
        if (objF instanceof D0) {
            D0 d02 = (D0) objF;
            jVar.f14495e.b(d02);
            jVar.f14494d.a(d02);
        }
        if (l02.f11705n != 0) {
            AbstractC0914u.c("Can only append a slot if not current inserting");
        }
        int i7 = l02.f11701i;
        int i8 = l02.f11702j;
        int iC = l02.c(c0877b);
        int iG = l02.g(l02.f11695b, l02.r(iC + 1));
        l02.f11701i = iG;
        l02.f11702j = iG;
        l02.w(1, iC);
        if (i7 >= iG) {
            i7++;
            i8++;
        }
        l02.f11696c[iG] = objF;
        l02.f11701i = i7;
        l02.f11702j = i8;
    }
}
