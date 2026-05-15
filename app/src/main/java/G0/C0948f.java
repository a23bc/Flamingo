package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948f extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0948f f12294c = new C0948f(0, 2, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        n0.f fVar = (n0.f) c0535h.f(1);
        int i7 = fVar != null ? fVar.f14486a : 0;
        C0943a c0943a = (C0943a) c0535h.f(0);
        if (i7 > 0) {
            interfaceC0881d = new M5.y(interfaceC0881d, i7);
        }
        c0943a.c0(interfaceC0881d, l02, jVar, k7 != null ? new V1.a(k7, l02) : null);
    }
}
