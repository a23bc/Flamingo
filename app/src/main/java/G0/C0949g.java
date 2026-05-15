package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.InterfaceC0881d;
import f0.L0;
import java.util.List;

/* JADX INFO: renamed from: g0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0949g extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0949g f12295c = new C0949g(0, 2, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        int i7 = ((n0.f) c0535h.f(0)).f14486a;
        List list = (List) c0535h.f(1);
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            int i9 = i7 + i8;
            interfaceC0881d.i(i9, obj);
            interfaceC0881d.p(i9, obj);
        }
    }
}
