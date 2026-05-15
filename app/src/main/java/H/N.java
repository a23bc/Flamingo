package H;

import O0.B0;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import t.AbstractC1458m;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0298b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H f2808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B0 f2809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K f2810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t.y f2811r;

    public N(H h, B0 b0) {
        this.f2808o = h;
        this.f2809p = b0;
        this.f2810q = (K) h.f2792b.a();
        AbstractC1458m.a();
        this.f2811r = new t.y();
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        return this.f2809p.B(i7, i8, map, a4, interfaceC1182c);
    }

    @Override // n1.d
    public final float E(long j3) {
        return this.f2809p.E(j3);
    }

    @Override // n1.d
    public final int L(float f7) {
        return this.f2809p.L(f7);
    }

    @Override // n1.d
    public final long V(long j3) {
        return this.f2809p.V(j3);
    }

    @Override // n1.d
    public final float Y(long j3) {
        return this.f2809p.Y(j3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int i7) {
        t.y yVar = this.f2811r;
        List list = (List) yVar.b(i7);
        if (list != null) {
            return list;
        }
        K k7 = this.f2810q;
        Object objB = k7.b(i7);
        List listD = this.f2809p.D(objB, this.f2808o.a(objB, i7, k7.c(i7)));
        yVar.h(i7, listD);
        return listD;
    }

    @Override // n1.d
    public final float b() {
        return this.f2809p.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f2809p.e0(f7);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f2809p.getLayoutDirection();
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f2809p.i0(i7);
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return this.f2809p.k(i7, i8, map, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return this.f2809p.k0(f7);
    }

    @Override // n1.d
    public final float n() {
        return this.f2809p.n();
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        return this.f2809p.s();
    }

    @Override // n1.d
    public final long t(long j3) {
        return this.f2809p.t(j3);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f2809p.v(f7);
    }
}
