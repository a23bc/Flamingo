package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0915u0;
import f0.InterfaceC0881d;
import f0.L0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f12265c = new D(0, 1, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        C0915u0 c0915u0 = (C0915u0) c0535h.f(0);
        t.J j3 = jVar.f14498i;
        n0.g gVar = j3 != null ? (n0.g) j3.g(c0915u0) : null;
        if (gVar != null) {
            ArrayList arrayList = jVar.f14499j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                jVar.f14499j = arrayList;
            }
            arrayList.add(jVar.f14495e);
            jVar.f14495e = gVar.f14488p;
        }
    }
}
