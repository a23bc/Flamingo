package androidx.compose.foundation.layout;

import D.D;
import D.D0;
import V4.z;
import n1.i;
import r0.C1385c;
import r0.C1390h;
import r0.C1395m;
import r0.InterfaceC1398p;
import y.AbstractC1949e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    public static final FillElement f9201a = new FillElement(D.f1214p, 1.0f);

    /* JADX INFO: renamed from: b */
    public static final FillElement f9202b = new FillElement(D.f1213o, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final FillElement f9203c;

    /* JADX INFO: renamed from: d */
    public static final WrapContentElement f9204d;

    /* JADX INFO: renamed from: e */
    public static final WrapContentElement f9205e;

    static {
        D d4 = D.f1215q;
        f9203c = new FillElement(d4, 1.0f);
        C1390h c1390h = C1385c.f15616s;
        f9204d = new WrapContentElement(d4, new D0(0, c1390h), c1390h);
        C1390h c1390h2 = C1385c.f15612o;
        f9205e = new WrapContentElement(d4, new D0(0, c1390h2), c1390h2);
    }

    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(f7 == 1.0f ? f9202b : new FillElement(D.f1213o, f7));
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(f7 == 1.0f ? f9201a : new FillElement(D.f1214p, f7));
    }

    public static final InterfaceC1398p c(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new SizeElement(0.0f, f7, 0.0f, f7, 5));
    }

    public static final InterfaceC1398p d(InterfaceC1398p interfaceC1398p, float f7, float f8) {
        return interfaceC1398p.f(new SizeElement(0.0f, f7, 0.0f, f8, 5));
    }

    public static final InterfaceC1398p e(InterfaceC1398p interfaceC1398p) {
        float f7 = z.f7605b;
        float f8 = z.f7606c;
        return interfaceC1398p.f(new SizeElement(f7, f8, f7, f8, false));
    }

    public static InterfaceC1398p f(InterfaceC1398p interfaceC1398p, float f7, float f8, float f9, float f10, int i7) {
        return interfaceC1398p.f(new SizeElement(f7, (i7 & 2) != 0 ? Float.NaN : f8, (i7 & 4) != 0 ? Float.NaN : f9, (i7 & 8) != 0 ? Float.NaN : f10, false));
    }

    public static final InterfaceC1398p g(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new SizeElement(f7, f7, f7, f7, true));
    }

    public static final InterfaceC1398p h(C1395m c1395m, long j3) {
        return i(c1395m, i.b(j3), i.a(j3));
    }

    public static final InterfaceC1398p i(InterfaceC1398p interfaceC1398p, float f7, float f8) {
        return interfaceC1398p.f(new SizeElement(f7, f8, f7, f8, true));
    }

    public static final InterfaceC1398p j(InterfaceC1398p interfaceC1398p) {
        float f7 = AbstractC1949e.f20155a;
        float f8 = AbstractC1949e.f20157c;
        return interfaceC1398p.f(new SizeElement(f7, f8, AbstractC1949e.f20156b, f8, true));
    }

    public static final InterfaceC1398p k(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new SizeElement(f7, 0.0f, f7, 0.0f, 10));
    }

    public static InterfaceC1398p l(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new SizeElement(Float.NaN, 0.0f, f7, 0.0f, 10));
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
    public static InterfaceC1398p m(InterfaceC1398p interfaceC1398p) {
        C1390h c1390h = C1385c.f15616s;
        return interfaceC1398p.f(c1390h.equals(c1390h) ? f9204d : c1390h.equals(C1385c.f15612o) ? f9205e : new WrapContentElement(D.f1215q, new D0(0, c1390h), c1390h));
    }
}
