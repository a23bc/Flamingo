package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.C0877b;
import f0.I0;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f12312c = new t(0, 3, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        V1.a aVar;
        I0 i02 = (I0) c0535h.f(1);
        C0877b c0877b = (C0877b) c0535h.f(0);
        C0945c c0945c = (C0945c) c0535h.f(2);
        L0 l0G = i02.g();
        if (k7 != null) {
            try {
                aVar = new V1.a(k7, l02);
            } catch (Throwable th) {
                l0G.e(false);
                throw th;
            }
        } else {
            aVar = null;
        }
        if (!c0945c.f12291v.e0()) {
            AbstractC0914u.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c0945c.f12290u.d0(interfaceC0881d, l0G, jVar, aVar);
        l0G.e(true);
        l02.d();
        c0877b.getClass();
        l02.z(i02, i02.b(c0877b));
        l02.k();
    }
}
