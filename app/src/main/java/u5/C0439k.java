package U5;

import androidx.compose.foundation.layout.FillElement;
import d0.F0;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import y0.C1987t;
import yos.music.player.CrashActivity;
import z4.AbstractC2102u;

/* JADX INFO: renamed from: U5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439k implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7241o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CrashActivity f7242p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f7243q;

    public /* synthetic */ C0439k(CrashActivity crashActivity, String str, int i7) {
        this.f7241o = i7;
        this.f7242p = crashActivity;
        this.f7243q = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7241o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    boolean zA = t6.a.a(c0912t);
                    B4.a aVarA = B4.c.a(c0912t);
                    long j3 = C1987t.f20261i;
                    boolean z6 = !zA;
                    A0.e.M(aVarA, j3, z6, 12);
                    A0.e.N(aVarA, j3, z6);
                    c0912t.X(-979058926);
                    CrashActivity crashActivity = this.f7242p;
                    boolean zF = c0912t.f(crashActivity);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        objK = new E3.e(11, crashActivity);
                        c0912t.i0(objK);
                    }
                    c0912t.p(false);
                    crashActivity.l(crashActivity, this.f7243q, (InterfaceC1180a) objK, c0912t, 0);
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f9203c;
                    long j7 = C1987t.f20259f;
                    long j8 = C1987t.f20255b;
                    F0.a(fillElement, null, t6.a.b(j7, j8, c0912t2), t6.a.b(j8, j7, c0912t2), 0.0f, n0.e.e(239403018, new C0439k(this.f7242p, this.f7243q, 0), c0912t2), c0912t2, 12582918, 114);
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    AbstractC2102u.a(false, false, n0.e.e(1934979631, new C0439k(this.f7242p, this.f7243q, 1), c0912t3), c0912t3, 384);
                }
                break;
            default:
                C0912t c0912t4 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t4.z()) {
                    c0912t4.Q();
                } else {
                    t6.b.a(false, n0.e.e(-1538553399, new C0439k(this.f7242p, this.f7243q, 2), c0912t4), c0912t4, 384);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
