package w;

import android.os.Bundle;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import f0.Z0;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1216r;
import m5.C1217s;
import v.C1585C;
import v.C1598P;
import v.C1599Q;
import v.C1618o;
import w5.InterfaceC1765B;
import y3.C2019h;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1668a extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f18603p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f18604q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f18605r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f18606s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f18607t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1668a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(1);
        this.f18603p = i7;
        this.f18604q = obj;
        this.f18605r = obj2;
        this.f18606s = obj3;
        this.f18607t = obj4;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6;
        switch (this.f18603p) {
            case 0:
                C1678k c1678k = (C1678k) obj;
                C1670c c1670c = (C1670c) this.f18604q;
                AbstractC1671d.m(c1678k, c1670c.f18630c);
                C0894j0 c0894j0 = c1678k.f18702e;
                Object objD = c1670c.d(c0894j0.getValue());
                boolean zA = AbstractC1209k.a(objD, c0894j0.getValue());
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f18606s;
                if (!zA) {
                    c1670c.f18630c.f18710p.setValue(objD);
                    ((C1680m) this.f18605r).f18710p.setValue(objD);
                    if (interfaceC1182c != null) {
                        interfaceC1182c.b(c1670c);
                    }
                    c1678k.a();
                    ((C1216r) this.f18607t).f14435o = true;
                } else if (interfaceC1182c != null) {
                    interfaceC1182c.b(c1670c);
                }
                return Y4.o.f8736a;
            case 1:
                long jLongValue = ((Number) obj).longValue();
                Z0 z02 = (Z0) ((InterfaceC0878b0) this.f18604q).getValue();
                long jLongValue2 = z02 != null ? ((Number) z02.getValue()).longValue() : jLongValue;
                C1661J c1661j = (C1661J) this.f18605r;
                long j3 = c1661j.f18532c;
                h0.e eVar = c1661j.f18530a;
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f18607t;
                int i7 = 0;
                C1217s c1217s = (C1217s) this.f18606s;
                if (j3 == Long.MIN_VALUE || c1217s.f14436o != AbstractC1671d.j(interfaceC1765B.g())) {
                    c1661j.f18532c = jLongValue;
                    int i8 = eVar.f12548q;
                    if (i8 > 0) {
                        Object[] objArr = eVar.f12546o;
                        int i9 = 0;
                        do {
                            ((C1658G) objArr[i9]).f18521t = true;
                            i9++;
                        } while (i9 < i8);
                    }
                    c1217s.f14436o = AbstractC1671d.j(interfaceC1765B.g());
                }
                float f7 = c1217s.f14436o;
                if (f7 == 0.0f) {
                    int i10 = eVar.f12548q;
                    if (i10 > 0) {
                        Object[] objArr2 = eVar.f12546o;
                        do {
                            C1658G c1658g = (C1658G) objArr2[i7];
                            c1658g.f18518q.setValue(c1658g.f18519r.f18610c);
                            c1658g.f18521t = true;
                            i7++;
                        } while (i7 < i10);
                    }
                } else {
                    long j7 = (long) ((jLongValue2 - c1661j.f18532c) / f7);
                    int i11 = eVar.f12548q;
                    if (i11 > 0) {
                        Object[] objArr3 = eVar.f12546o;
                        z6 = true;
                        int i12 = 0;
                        do {
                            C1658G c1658g2 = (C1658G) objArr3[i12];
                            if (!c1658g2.f18520s) {
                                c1658g2.f18523v.f18531b.setValue(Boolean.FALSE);
                                if (c1658g2.f18521t) {
                                    c1658g2.f18521t = false;
                                    c1658g2.f18522u = j7;
                                }
                                long j8 = j7 - c1658g2.f18522u;
                                c1658g2.f18518q.setValue(c1658g2.f18519r.b(j8));
                                a0 a0Var = c1658g2.f18519r;
                                a0Var.getClass();
                                c1658g2.f18520s = AbstractC1676i.a(a0Var, j8);
                            }
                            if (!c1658g2.f18520s) {
                                z6 = false;
                            }
                            i12++;
                        } while (i12 < i11);
                    } else {
                        z6 = true;
                    }
                    c1661j.f18533d.setValue(Boolean.valueOf(!z6));
                }
                return Y4.o.f8736a;
            case 2:
                C2019h c2019h = (C2019h) obj;
                AbstractC1209k.f(c2019h, "it");
                ((C1216r) this.f18607t).f14435o = true;
                ((y3.x) this.f18604q).a((y3.s) this.f18605r, (Bundle) this.f18606s, c2019h, Z4.v.f8818o);
                return Y4.o.f8736a;
            default:
                C1618o c1618o = (C1618o) obj;
                AbstractC1209k.f(c1618o, "$this$AnimatedContent");
                return ((List) ((InterfaceC0878b0) this.f18607t).getValue()).contains(c1618o.a()) ? new C1585C((C1598P) ((InterfaceC1182c) this.f18606s).b(c1618o), (C1599Q) ((InterfaceC1182c) this.f18605r).b(c1618o), ((List) ((z5.J) ((z3.g) this.f18604q).b().f20426e.f21324o).getValue()).size(), 8) : AbstractC1110d.I(C1598P.f18003b, C1599Q.f18005b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668a(C1216r c1216r, y3.x xVar, y3.s sVar, Bundle bundle) {
        super(1);
        this.f18603p = 2;
        this.f18607t = c1216r;
        this.f18604q = xVar;
        this.f18605r = sVar;
        this.f18606s = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668a(z3.g gVar, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC0878b0 interfaceC0878b0) {
        super(1);
        this.f18603p = 3;
        this.f18604q = gVar;
        this.f18606s = interfaceC1182c;
        this.f18605r = interfaceC1182c2;
        this.f18607t = interfaceC0878b0;
    }
}
