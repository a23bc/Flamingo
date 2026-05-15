package A5;

import R0.AbstractC0370a;
import R0.C0401p0;
import d0.M;
import d2.C0821i;
import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.AbstractC1223y;
import r0.AbstractC1383a;
import r0.C1393k;
import r0.C1395m;
import r0.InterfaceC1396n;
import r0.InterfaceC1398p;
import u5.AbstractC1545g;
import v.C1599Q;
import v.EnumC1588F;
import w.C1661J;
import w5.C1806y;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f585p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f586q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, int i8, Object obj) {
        super(2);
        this.f585p = i8;
        this.f586q = obj;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f585p) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                c5.g gVar = (c5.g) obj2;
                c5.h key = gVar.getKey();
                c5.g gVarN = ((v) this.f586q).f579p.n(key);
                if (key != C1806y.f19581p) {
                    return Integer.valueOf(gVar != gVarN ? Integer.MIN_VALUE : iIntValue + 1);
                }
                InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) gVarN;
                InterfaceC1786g0 parent = (InterfaceC1786g0) gVar;
                while (true) {
                    if (parent == null) {
                        parent = null;
                    } else if (parent != interfaceC1786g0 && (parent instanceof B5.r)) {
                        parent = parent.getParent();
                    }
                }
                if (parent == interfaceC1786g0) {
                    if (interfaceC1786g0 != null) {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC1786g0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            case 1:
                C0912t c0912t = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0912t.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((AbstractC0370a) this.f586q).a(0, c0912t);
                } else {
                    c0912t.Q();
                }
                return Y4.o.f8736a;
            case 2:
                ((Number) obj2).intValue();
                ((C0401p0) this.f586q).a(C0879c.B(1), (C0912t) obj);
                return Y4.o.f8736a;
            case 3:
                ((Number) obj2).intValue();
                ((M) this.f586q).a(C0879c.B(1), (C0912t) obj);
                return Y4.o.f8736a;
            case 4:
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj;
                InterfaceC1398p interfaceC1398pB = (InterfaceC1396n) obj2;
                if (interfaceC1398pB instanceof C1393k) {
                    l5.f fVar = ((C1393k) interfaceC1398pB).f15632b;
                    AbstractC1223y.c(3, fVar);
                    C1395m c1395m = C1395m.f15634a;
                    C0912t c0912t2 = (C0912t) this.f586q;
                    interfaceC1398pB = AbstractC1383a.b(c0912t2, (InterfaceC1398p) fVar.d(c1395m, c0912t2, 0));
                }
                return interfaceC1398p.f(interfaceC1398pB);
            case 5:
                ((Number) obj2).intValue();
                ((r1.t) this.f586q).a(C0879c.B(1), (C0912t) obj);
                return Y4.o.f8736a;
            case 6:
                ((Number) obj2).intValue();
                ((r1.z) this.f586q).a(C0879c.B(1), (C0912t) obj);
                return Y4.o.f8736a;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                AbstractC1209k.f(charSequence, "$this$$receiver");
                int iY = AbstractC1545g.Y(charSequence, (char[]) this.f586q, iIntValue3, false);
                if (iY < 0) {
                    return null;
                }
                return new Y4.h(Integer.valueOf(iY), 1);
            case 8:
                EnumC1588F enumC1588F = (EnumC1588F) obj;
                EnumC1588F enumC1588F2 = (EnumC1588F) obj2;
                EnumC1588F enumC1588F3 = EnumC1588F.f17964q;
                return Boolean.valueOf(enumC1588F == enumC1588F3 && enumC1588F2 == enumC1588F3 && !((C1599Q) this.f586q).f18007a.f18189d);
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((Number) obj2).intValue();
                ((C1661J) this.f586q).a(C0879c.B(1), (C0912t) obj);
                return Y4.o.f8736a;
            default:
                ((Number) obj2).intValue();
                j0.k.b((z3.l) this.f586q, (C0912t) obj, C0879c.B(1));
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, Object obj) {
        super(2);
        this.f585p = i7;
        this.f586q = obj;
    }
}
