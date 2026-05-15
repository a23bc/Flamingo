package g0;

import A2.W;
import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0876a0;
import f0.AbstractC0914u;
import f0.AbstractC0918w;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950h extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0950h f12296c = new C0950h(0, 4, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        AbstractC0876a0 abstractC0876a0 = (AbstractC0876a0) c0535h.f(2);
        AbstractC0918w abstractC0918w = (AbstractC0918w) c0535h.f(1);
        abstractC0918w.l(abstractC0876a0);
        AbstractC0914u.d("Could not resolve state for movable content");
        throw new W();
    }
}
