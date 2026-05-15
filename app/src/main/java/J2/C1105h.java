package j2;

import F5.k;
import N2.z;
import O1.C0331c;
import O1.F;
import Z4.v;
import android.content.Context;
import b2.q0;
import java.io.File;
import o5.AbstractC1267a;
import w5.AbstractC1767D;
import w5.M;
import w5.y0;

/* JADX INFO: renamed from: j2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1105h implements InterfaceC1104g {

    /* JADX INFO: renamed from: a */
    public static final C1105h f13701a = new C1105h();

    @Override // j2.InterfaceC1104g
    public final File a(Context context, String str) {
        return AbstractC1267a.D(context, str);
    }

    @Override // j2.InterfaceC1104g
    public final Object b(Context context, String str) {
        q0 q0Var = new q0(context, str, 1);
        D5.d dVar = M.f19498b;
        y0 y0VarC = AbstractC1767D.c();
        dVar.getClass();
        B5.d dVarA = AbstractC1767D.a(I0.c.L(dVar, y0VarC));
        v vVar = v.f8818o;
        R1.h hVar = R1.h.f6662a;
        return new R1.d(new F(new k(q0Var, 1), hVar, I0.c.G(new C0331c(vVar, null)), new z(), dVarA));
    }
}
