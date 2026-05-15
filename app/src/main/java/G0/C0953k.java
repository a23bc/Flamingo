package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0953k extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0953k f12299c = new C0953k(0, 1, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        for (Object obj : (Object[]) c0535h.f(0)) {
            interfaceC0881d.l(obj);
        }
    }
}
