package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0915u0;
import f0.D0;
import f0.InterfaceC0881d;
import f0.L0;
import java.util.Set;
import t.Q;

/* JADX INFO: loaded from: classes.dex */
public final class x extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f12316c = new x(0, 1, 1);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        C0915u0 c0915u0 = (C0915u0) c0535h.f(0);
        Set set = jVar.f14491a;
        if (set == null) {
            return;
        }
        n0.g gVar = new n0.g(set);
        t.J j3 = jVar.f14498i;
        if (j3 == null) {
            long[] jArr = Q.f16032a;
            j3 = new t.J();
            jVar.f14498i = j3;
        }
        j3.m(c0915u0, gVar);
        jVar.f14495e.b(new D0(gVar, null));
    }
}
