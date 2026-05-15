package Q0;

import O0.InterfaceC0298b0;
import R0.C0415x;
import android.graphics.Canvas;
import androidx.lifecycle.InterfaceC0597u;
import d.C0743I;
import d0.C0783d0;
import d0.C0785e0;
import d2.C0821i;
import i2.C1065D;
import i2.C1074i;
import java.util.concurrent.atomic.AtomicReference;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1220v;
import o0.C1248e;
import u0.ViewOnDragListenerC1526a;
import v.C1598P;
import v.C1599Q;
import v.C1618o;
import v.C1629z;
import v.EnumC1588F;
import v5.AbstractC1643a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1893c;
import y0.AbstractC1970c;
import y0.C1960J;
import y0.C1967Q;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f5849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5852s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f5849p = i7;
        this.f5850q = obj;
        this.f5851r = obj2;
        this.f5852s = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v64, types: [l5.c, m5.l] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean zBooleanValue;
        switch (this.f5849p) {
            case 0:
                A0.f fVar = (A0.f) obj;
                N n7 = (N) this.f5850q;
                InterfaceC0360p interfaceC0360p = n7.f5854p;
                n7.f5854p = (InterfaceC0360p) this.f5851r;
                try {
                    n1.d dVarU = fVar.A().U();
                    n1.n nVarV = fVar.A().V();
                    InterfaceC1985r interfaceC1985rS = fVar.A().S();
                    long jW = fVar.A().W();
                    B0.d dVar = (B0.d) fVar.A().f51q;
                    InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f5852s;
                    n1.d dVarU2 = n7.A().U();
                    n1.n nVarV2 = n7.A().V();
                    InterfaceC1985r interfaceC1985rS2 = n7.A().S();
                    long jW2 = n7.A().W();
                    B0.d dVar2 = (B0.d) n7.A().f51q;
                    A0.b bVarA = n7.A();
                    bVarA.n0(dVarU);
                    bVarA.o0(nVarV);
                    bVarA.m0(interfaceC1985rS);
                    bVarA.p0(jW);
                    bVarA.f51q = dVar;
                    interfaceC1985rS.l();
                    try {
                        interfaceC1182c.b(n7);
                        n7.f5854p = interfaceC0360p;
                        return Y4.o.f8736a;
                    } finally {
                        interfaceC1985rS.k();
                        A0.b bVarA2 = n7.A();
                        bVarA2.n0(dVarU2);
                        bVarA2.o0(nVarV2);
                        bVarA2.m0(interfaceC1985rS2);
                        bVarA2.p0(jW2);
                        bVarA2.f51q = dVar2;
                    }
                } catch (Throwable th) {
                    n7.f5854p = interfaceC0360p;
                    throw th;
                }
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                d0.n0 n0Var = (d0.n0) this.f5851r;
                AbstractC1767D.t((InterfaceC1765B) this.f5850q, null, new C0785e0(n0Var, fFloatValue, null), 3).t(new C0783d0(n0Var, (InterfaceC1180a) this.f5852s, 1));
                return Y4.o.f8736a;
            case 2:
                C0743I c0743i = (C0743I) this.f5850q;
                InterfaceC0597u interfaceC0597u = (InterfaceC0597u) this.f5851r;
                e.e eVar = (e.e) this.f5852s;
                c0743i.a(interfaceC0597u, eVar);
                return new H.F(12, eVar);
            case 3:
                i2.K k7 = (i2.K) this.f5850q;
                long jA = k7.a();
                i2.I i7 = (i2.I) this.f5851r;
                if (AbstractC1643a.c(jA, i7.f13326b) < 0) {
                    AtomicReference atomicReference = k7.f13335p;
                    while (true) {
                        Object obj2 = atomicReference.get();
                        Long l = (Long) obj2;
                        if (l == null) {
                            throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                        }
                        long j3 = i7.f13326b;
                        if (j3 <= 0) {
                            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
                        }
                        Long lValueOf = Long.valueOf(AbstractC1643a.d(j3) + l.longValue());
                        while (!atomicReference.compareAndSet(obj2, lValueOf)) {
                            if (atomicReference.get() != obj2) {
                            }
                            break;
                        }
                    }
                }
                AbstractC1767D.t(k7, null, new C1065D((C1074i) this.f5852s, null), 3);
                return Y4.o.f8736a;
            case 4:
                InterfaceC1985r interfaceC1985rS3 = ((A0.f) obj).A().S();
                q1.q qVar = (q1.q) this.f5850q;
                if (qVar.getView().getVisibility() != 8) {
                    qVar.f15484L = true;
                    C0415x c0415x = ((K) this.f5851r).f5803B;
                    if (!(c0415x instanceof C0415x)) {
                        c0415x = null;
                    }
                    if (c0415x != null) {
                        Canvas canvasA = AbstractC1970c.a(interfaceC1985rS3);
                        c0415x.getAndroidViewsHandler$ui_release().getClass();
                        ((q1.q) this.f5852s).draw(canvasA);
                    }
                    qVar.f15484L = false;
                }
                return Y4.o.f8736a;
            case 5:
                F0 f02 = (F0) obj;
                u0.d dVar3 = (u0.d) f02;
                u0.d dVar4 = (u0.d) this.f5851r;
                dVar4.getClass();
                if (!((ViewOnDragListenerC1526a) ((C0415x) AbstractC0347f.y(dVar4)).m3getDragAndDropManager()).f17130b.contains(dVar3) || !AbstractC1113a.r(dVar3, i6.g.w((k.I) this.f5852s))) {
                    return E0.f5783o;
                }
                ((C1220v) this.f5850q).f14439o = f02;
                return E0.f5785q;
            case 6:
                return new C1248e((p0.p) this.f5850q, this.f5851r, (C1618o) this.f5852s, 1);
            case 7:
                return ((Boolean) obj).booleanValue() == ((Boolean) ((C1629z) this.f5850q).f18196b.f18691d.getValue()).booleanValue() ? (C1893c) this.f5851r : (C1893c) this.f5852s;
            case 8:
                C1960J c1960j = (C1960J) obj;
                w.b0 b0Var = (w.b0) this.f5850q;
                c1960j.a(b0Var != null ? ((Number) b0Var.getValue()).floatValue() : 1.0f);
                w.b0 b0Var2 = (w.b0) this.f5851r;
                c1960j.i(b0Var2 != null ? ((Number) b0Var2.getValue()).floatValue() : 1.0f);
                c1960j.j(b0Var2 != null ? ((Number) b0Var2.getValue()).floatValue() : 1.0f);
                w.b0 b0Var3 = (w.b0) this.f5852s;
                c1960j.q(b0Var3 != null ? ((C1967Q) b0Var3.getValue()).f20226a : C1967Q.f20224b);
                return Y4.o.f8736a;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                int iOrdinal = ((EnumC1588F) obj).ordinal();
                C1967Q c1967q = null;
                C1598P c1598p = (C1598P) this.f5851r;
                C1599Q c1599q = (C1599Q) this.f5852s;
                if (iOrdinal == 0) {
                    v.W w7 = c1598p.f18004a.f18188c;
                    if (w7 != null) {
                        c1967q = new C1967Q(w7.f18016b);
                    } else {
                        v.W w8 = c1599q.f18007a.f18188c;
                        if (w8 != null) {
                            c1967q = new C1967Q(w8.f18016b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    c1967q = (C1967Q) this.f5850q;
                } else {
                    if (iOrdinal != 2) {
                        throw new A2.W();
                    }
                    v.W w9 = c1599q.f18007a.f18188c;
                    if (w9 != null) {
                        c1967q = new C1967Q(w9.f18016b);
                    } else {
                        v.W w10 = c1598p.f18004a.f18188c;
                        if (w10 != null) {
                            c1967q = new C1967Q(w10.f18016b);
                        }
                    }
                }
                return new C1967Q(c1967q != null ? c1967q.f20226a : C1967Q.f20224b);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                O0.l0 l0Var = (O0.l0) obj;
                O0.C cD = l0Var.d();
                if (cD != null) {
                    boolean zS = ((InterfaceC0298b0) this.f5850q).s();
                    v.k0 k0Var = (v.k0) this.f5851r;
                    if (zS) {
                        k0Var.f18117u = cD;
                    } else {
                        k0Var.f18116t = cD;
                    }
                }
                O0.l0.h(l0Var, (O0.m0) this.f5852s, 0, 0);
                return Y4.o.f8736a;
            default:
                w0.u uVar = (w0.u) obj;
                if (AbstractC1209k.a(uVar, (w0.u) this.f5850q)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC1209k.a(uVar, ((w0.k) this.f5851r).f18788c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((AbstractC1210l) this.f5852s).b(uVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(w0.u uVar, w0.k kVar, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f5849p = 11;
        this.f5850q = uVar;
        this.f5851r = kVar;
        this.f5852s = (AbstractC1210l) interfaceC1182c;
    }
}
