package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0915u0;
import f0.InterfaceC0881d;
import f0.L0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f12303c = new o(0, 1, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        h0.e eVar;
        C0915u0 c0915u0 = (C0915u0) c0535h.f(0);
        t.J j3 = jVar.f14498i;
        if (j3 == null || ((n0.g) j3.g(c0915u0)) == null) {
            return;
        }
        ArrayList arrayList = jVar.f14499j;
        if (arrayList != null && (eVar = (h0.e) arrayList.remove(arrayList.size() - 1)) != null) {
            jVar.f14495e = eVar;
        }
        j3.k(c0915u0);
    }
}
