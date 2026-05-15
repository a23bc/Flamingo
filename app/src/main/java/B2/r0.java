package b2;

import O1.C0331c;
import android.content.Context;
import d2.C0824l;
import j2.InterfaceC1104g;
import java.io.File;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements InterfaceC1104g {

    /* JADX INFO: renamed from: a */
    public static final r0 f10285a = new r0();

    @Override // j2.InterfaceC1104g
    public final File a(Context context, String str) {
        return android.support.v4.media.session.b.o(context, str);
    }

    @Override // j2.InterfaceC1104g
    public final Object b(Context context, String str) {
        C0824l c0824l = C0824l.f11225a;
        q0 q0Var = new q0(context, str, 0);
        Z4.v vVar = Z4.v.f8818o;
        D5.d dVar = w5.M.f19498b;
        w5.y0 y0VarC = AbstractC1767D.c();
        dVar.getClass();
        B5.d dVarA = AbstractC1767D.a(I0.c.L(dVar, y0VarC));
        return new O1.F(q0Var, c0824l, I0.c.G(new C0331c(vVar, null)), new N2.z(), dVarA);
    }
}
