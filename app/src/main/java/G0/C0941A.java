package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: renamed from: g0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941A extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0941A f12262c = new C0941A(0, 0, 3);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        if (l02.f11705n != 0) {
            AbstractC0914u.c("Cannot reset when inserting");
        }
        l02.F();
        l02.f11711t = 0;
        l02.f11712u = l02.o() - l02.h;
        l02.f11701i = 0;
        l02.f11702j = 0;
        l02.f11706o = 0;
    }
}
