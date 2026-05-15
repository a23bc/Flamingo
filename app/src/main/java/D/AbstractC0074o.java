package D;

import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import f0.InterfaceC0906p0;
import m5.AbstractC1209k;
import r0.AbstractC1383a;
import r0.C1385c;
import r0.C1390h;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: D.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0074o {

    /* JADX INFO: renamed from: a */
    public static final t.J f1358a = c(true);

    /* JADX INFO: renamed from: b */
    public static final t.J f1359b = c(false);

    /* JADX INFO: renamed from: c */
    public static final r f1360c = new r(C1385c.f15612o, false);

    /* JADX INFO: renamed from: d */
    public static final C0073n f1361d = C0073n.f1352b;

    public static final void a(InterfaceC1398p interfaceC1398p, C0912t c0912t, int i7) {
        c0912t.Z(-211209833);
        int i8 = (c0912t.f(interfaceC1398p) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 3) != 2)) {
            long j3 = c0912t.f11891T;
            int i9 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC1398p interfaceC1398pC = AbstractC1383a.c(c0912t, interfaceC1398p);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0879c.y(c0912t, f1361d, C0354j.f6019f);
            C0879c.y(c0912t, interfaceC0906p0L, C0354j.f6018e);
            C0879c.y(c0912t, interfaceC1398pC, C0354j.f6017d);
            C0351h c0351h = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(i9))) {
                n1.c.w(i9, c0912t, i9, c0351h);
            }
            c0912t.p(true);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0072m(interfaceC1398p, i7, 0);
        }
    }

    public static final void b(O0.l0 l0Var, O0.m0 m0Var, O0.Y y6, n1.n nVar, int i7, int i8, InterfaceC1386d interfaceC1386d) {
        C1390h c1390h;
        Object objI = y6.i();
        C0071l c0071l = objI instanceof C0071l ? (C0071l) objI : null;
        O0.l0.i(l0Var, m0Var, ((c0071l == null || (c1390h = c0071l.f1348C) == null) ? interfaceC1386d : c1390h).a((((long) m0Var.f5416o) << 32) | (((long) m0Var.f5417p) & 4294967295L), (((long) i7) << 32) | (((long) i8) & 4294967295L), nVar));
    }

    public static final t.J c(boolean z6) {
        t.J j3 = new t.J(9);
        C1390h c1390h = C1385c.f15612o;
        j3.m(c1390h, new r(c1390h, z6));
        C1390h c1390h2 = C1385c.f15613p;
        j3.m(c1390h2, new r(c1390h2, z6));
        C1390h c1390h3 = C1385c.f15614q;
        j3.m(c1390h3, new r(c1390h3, z6));
        C1390h c1390h4 = C1385c.f15615r;
        j3.m(c1390h4, new r(c1390h4, z6));
        C1390h c1390h5 = C1385c.f15616s;
        j3.m(c1390h5, new r(c1390h5, z6));
        C1390h c1390h6 = C1385c.f15617t;
        j3.m(c1390h6, new r(c1390h6, z6));
        C1390h c1390h7 = C1385c.f15618u;
        j3.m(c1390h7, new r(c1390h7, z6));
        C1390h c1390h8 = C1385c.f15619v;
        j3.m(c1390h8, new r(c1390h8, z6));
        C1390h c1390h9 = C1385c.f15620w;
        j3.m(c1390h9, new r(c1390h9, z6));
        return j3;
    }

    public static final O0.Z d(C1390h c1390h, boolean z6) {
        O0.Z z7 = (O0.Z) (z6 ? f1358a : f1359b).g(c1390h);
        return z7 == null ? new r(c1390h, z6) : z7;
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
    public static final r e(int i7, C0912t c0912t, boolean z6) {
        C1390h c1390h = C1385c.f15612o;
        if (c1390h.equals(c1390h) && !z6) {
            c0912t.X(244367063);
            c0912t.p(false);
            return f1360c;
        }
        c0912t.X(244414741);
        boolean zF = c0912t.f(c1390h);
        boolean z7 = true;
        if ((((i7 & 112) ^ 48) <= 32 || !c0912t.g(z6)) && (i7 & 48) != 32) {
            z7 = false;
        }
        boolean z8 = zF | z7;
        Object objK = c0912t.K();
        if (z8 || objK == C0903o.f11850a) {
            objK = new r(c1390h, z6);
            c0912t.i0(objK);
        }
        r rVar = (r) objK;
        c0912t.p(false);
        return rVar;
    }
}
