package d0;

import D.AbstractC0068i;
import D.AbstractC0074o;
import D.AbstractC0082x;
import D.C0084z;
import Q0.C0351h;
import Q0.C0353i;
import Q0.C0354j;
import Q0.InterfaceC0355k;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0906p0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.C1385c;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ n0.d f10920p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ n0 f10921q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1180a f10922r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1765B f10923s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ n0.d f10924t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(n0.d dVar, n0 n0Var, InterfaceC1180a interfaceC1180a, InterfaceC1765B interfaceC1765B, n0.d dVar2) {
        super(2);
        this.f10920p = dVar;
        this.f10921q = n0Var;
        this.f10922r = interfaceC1180a;
        this.f10923s = interfaceC1765B;
        this.f10924t = dVar2;
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
        boolean z6;
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            InterfaceC1398p interfaceC1398pB = androidx.compose.foundation.layout.c.b(C1395m.f15634a, 1.0f);
            c0912t.Y(-483455358);
            C0084z c0084zA = AbstractC0082x.a(AbstractC0068i.f1329c, C1385c.f15608A, c0912t, 0);
            c0912t.Y(-1323940314);
            int iP = C0879c.p(c0912t);
            InterfaceC0906p0 interfaceC0906p0L = c0912t.l();
            InterfaceC0355k.f6047i.getClass();
            C0353i c0353i = C0354j.f6015b;
            n0.d dVarK = O0.w0.k(interfaceC1398pB);
            c0912t.b0();
            if (c0912t.f11890S) {
                c0912t.k(c0353i);
            } else {
                c0912t.l0();
            }
            C0351h c0351h = C0354j.f6019f;
            C0879c.y(c0912t, c0084zA, c0351h);
            C0351h c0351h2 = C0354j.f6018e;
            C0879c.y(c0912t, interfaceC0906p0L, c0351h2);
            C0351h c0351h3 = C0354j.f6020g;
            if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP))) {
                n1.c.w(iP, c0912t, iP, c0351h3);
            }
            dVarK.d(new f0.G0(c0912t), c0912t, 0);
            c0912t.Y(2058660585);
            D.A a4 = D.A.f1206a;
            c0912t.Y(-11289086);
            n0.d dVar = this.f10920p;
            if (dVar != null) {
                String strG = H.g(R.string.m3c_bottom_sheet_collapse_description, c0912t);
                String strG2 = H.g(R.string.m3c_bottom_sheet_dismiss_description, c0912t);
                String strG3 = H.g(R.string.m3c_bottom_sheet_expand_description, c0912t);
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C1385c.f15609B);
                c0912t.Y(-11288530);
                n0 n0Var = this.f10921q;
                boolean zF = c0912t.f(n0Var) | c0912t.f(strG2);
                InterfaceC1180a interfaceC1180a = this.f10922r;
                boolean zF2 = zF | c0912t.f(interfaceC1180a) | c0912t.f(strG3);
                InterfaceC1765B interfaceC1765B = this.f10923s;
                boolean zH = zF2 | c0912t.h(interfaceC1765B) | c0912t.f(strG);
                Object objK = c0912t.K();
                if (zH || objK == C0903o.f11850a) {
                    W w7 = new W(n0Var, strG2, strG3, strG, interfaceC1180a, interfaceC1765B);
                    c0912t.i0(w7);
                    objK = w7;
                }
                c0912t.p(false);
                InterfaceC1398p interfaceC1398pA = Y0.l.a(horizontalAlignElement, true, (InterfaceC1182c) objK);
                c0912t.Y(733328855);
                D.r rVarE = AbstractC0074o.e(0, c0912t, false);
                c0912t.Y(-1323940314);
                int iP2 = C0879c.p(c0912t);
                InterfaceC0906p0 interfaceC0906p0L2 = c0912t.l();
                n0.d dVarK2 = O0.w0.k(interfaceC1398pA);
                c0912t.b0();
                if (c0912t.f11890S) {
                    c0912t.k(c0353i);
                } else {
                    c0912t.l0();
                }
                C0879c.y(c0912t, rVarE, c0351h);
                C0879c.y(c0912t, interfaceC0906p0L2, c0351h2);
                if (c0912t.f11890S || !AbstractC1209k.a(c0912t.K(), Integer.valueOf(iP2))) {
                    n1.c.w(iP2, c0912t, iP2, c0351h3);
                }
                z6 = false;
                dVarK2.d(new f0.G0(c0912t), c0912t, 0);
                c0912t.Y(2058660585);
                dVar.invoke(c0912t, 0);
                c0912t.p(false);
                c0912t.p(true);
                c0912t.p(false);
                c0912t.p(false);
            } else {
                z6 = false;
            }
            c0912t.p(z6);
            this.f10924t.d(a4, c0912t, 6);
            c0912t.p(z6);
            c0912t.p(true);
            c0912t.p(z6);
            c0912t.p(z6);
        }
        return Y4.o.f8736a;
    }
}
