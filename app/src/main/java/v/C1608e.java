package v;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1608e extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0.p f18074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f18075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1618o f18076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0.d f18077s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608e(p0.p pVar, Object obj, C1618o c1618o, n0.d dVar) {
        super(3);
        this.f18074p = pVar;
        this.f18075q = obj;
        this.f18076r = c1618o;
        this.f18077s = dVar;
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
    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC1626w interfaceC1626w = (InterfaceC1626w) obj;
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? c0912t.f(interfaceC1626w) : c0912t.h(interfaceC1626w) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            p0.p pVar = this.f18074p;
            boolean zF = c0912t.f(pVar);
            Object obj4 = this.f18075q;
            boolean zH = zF | c0912t.h(obj4);
            C1618o c1618o = this.f18076r;
            boolean zH2 = zH | c0912t.h(c1618o);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zH2 || objK == w7) {
                objK = new Q0.M(pVar, obj4, c1618o, 6);
                c0912t.i0(objK);
            }
            C0879c.d(interfaceC1626w, (InterfaceC1182c) objK, c0912t);
            t.J j3 = c1618o.f18135d;
            AbstractC1209k.d(interfaceC1626w, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            j3.m(obj4, ((C1627x) interfaceC1626w).f18192b);
            Object objK2 = c0912t.K();
            if (objK2 == w7) {
                objK2 = new C1614k(interfaceC1626w);
                c0912t.i0(objK2);
            }
            this.f18077s.h((C1614k) objK2, obj4, c0912t, 0);
        }
        return Y4.o.f8736a;
    }
}
