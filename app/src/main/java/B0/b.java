package B0;

import E0.C0092c;
import E0.D;
import H.d0;
import K0.B;
import K0.C;
import K0.L;
import O0.C0322t;
import O1.C0336h;
import O1.F;
import Q0.AbstractC0347f;
import Q0.E0;
import Q0.H0;
import Q0.InterfaceC0337a;
import Q0.K;
import Q0.j0;
import R0.A0;
import R0.AbstractC0420z0;
import R0.C0;
import R0.C0406s0;
import R0.M;
import V.v;
import Z4.AbstractC0507a;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import f0.InterfaceC0878b0;
import f0.Z0;
import g1.InputConnectionC0971m;
import i2.C1074i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k.I;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import r0.InterfaceC1396n;
import t.y;
import v.C1618o;
import w5.C1793k;
import w5.InterfaceC1786g0;
import y0.C1976i;
import y0.InterfaceC1985r;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f610p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f611q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, Object obj) {
        super(1);
        this.f610p = i7;
        this.f611q = obj;
    }

    private final Object e(Object obj) {
        C1074i c1074i = (C1074i) this.f611q;
        synchronized (c1074i.f13380q) {
            c1074i.f13381r = 5;
            c1074i.f13383t = null;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [O0.m0, Q0.a] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l5.c, m5.l] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) throws Exception {
        int i7 = 0;
        switch (this.f610p) {
            case 0:
                A0.f fVar = (A0.f) obj;
                d dVar = (d) this.f611q;
                C1976i c1976i = dVar.l;
                if (dVar.f626n && dVar.f635w && c1976i != null) {
                    A0.b bVarA = fVar.A();
                    long jW = bVarA.W();
                    bVarA.S().l();
                    try {
                        ((A0.b) ((A.b) bVarA.f50p).f3p).S().b(c1976i);
                        dVar.c(fVar);
                    } finally {
                        n1.c.A(bVarA, jW);
                    }
                } else {
                    dVar.c(fVar);
                }
                return Y4.o.f8736a;
            case 1:
                D d4 = (D) obj;
                C0092c c0092c = (C0092c) this.f611q;
                c0092c.g(d4);
                ?? r02 = c0092c.f1704i;
                if (r02 != 0) {
                    r02.b(d4);
                }
                return Y4.o.f8736a;
            case 2:
                ((E5.i) this.f611q).b();
                return Y4.o.f8736a;
            case 3:
                ((C) ((B) this.f611q).k()).b((MotionEvent) obj);
                return Y4.o.f8736a;
            case 4:
                Throwable th = (Throwable) obj;
                L l = (L) this.f611q;
                C1793k c1793k = l.f3843q;
                if (c1793k != null) {
                    c1793k.l(th);
                }
                l.f3843q = null;
                return Y4.o.f8736a;
            case 5:
                Throwable th2 = (Throwable) obj;
                N3.k kVar = (N3.k) this.f611q;
                if (th2 == null) {
                    if (!kVar.f5140o.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    kVar.f5140o.cancel(true);
                } else {
                    Y3.j jVar = kVar.f5140o;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    jVar.k(th2);
                }
                return Y4.o.f8736a;
            case 6:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    J j3 = ((F) this.f611q).f5512g;
                    C0336h c0336h = new C0336h(th3);
                    j3.getClass();
                    j3.j(null, c0336h);
                }
                Object obj2 = F.f5505k;
                F f7 = (F) this.f611q;
                synchronized (obj2) {
                    F.f5504j.remove(f7.d().getAbsolutePath());
                }
                return Y4.o.f8736a;
            case 7:
                InterfaceC0337a interfaceC0337a = (InterfaceC0337a) obj;
                if (interfaceC0337a.u()) {
                    if (interfaceC0337a.a().f5843b) {
                        interfaceC0337a.r();
                    }
                    Iterator it = interfaceC0337a.a().f5848g.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        Q0.L l7 = (Q0.L) this.f611q;
                        if (zHasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Q0.L.a(l7, (C0322t) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0337a.o());
                        } else {
                            j0 j0Var = interfaceC0337a.o().f6028G;
                            AbstractC1209k.c(j0Var);
                            while (!j0Var.equals(l7.f5842a.o())) {
                                for (C0322t c0322t : l7.b(j0Var).keySet()) {
                                    Q0.L.a(l7, c0322t, l7.c(j0Var, c0322t), j0Var);
                                }
                                j0Var = j0Var.f6028G;
                                AbstractC1209k.c(j0Var);
                            }
                        }
                    }
                }
                return Y4.o.f8736a;
            case 8:
                ((h0.e) this.f611q).b((InterfaceC1396n) obj);
                return Boolean.TRUE;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return Boolean.valueOf(((y) this.f611q).a(((Y0.o) obj).f8487g));
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(M.n((Y0.o) obj, (Resources) this.f611q));
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                Configuration configuration = new Configuration((Configuration) obj);
                f0.D d7 = AndroidCompositionLocals_androidKt.f9323a;
                ((InterfaceC0878b0) this.f611q).setValue(configuration);
                return Y4.o.f8736a;
            case 12:
                return new H.F(6, (C0406s0) this.f611q);
            case 13:
                boolean zCompareAndSet = AbstractC0420z0.f6652b.compareAndSet(false, true);
                Y4.o oVar = Y4.o.f8736a;
                if (zCompareAndSet) {
                    ((y5.c) this.f611q).k(oVar);
                }
                return oVar;
            case 14:
                A0.f fVar2 = (A0.f) obj;
                InterfaceC1985r interfaceC1985rS = fVar2.A().S();
                l5.e eVar = ((A0) this.f611q).f6238r;
                if (eVar != null) {
                    eVar.invoke(interfaceC1985rS, (d) fVar2.A().f51q);
                }
                return Y4.o.f8736a;
            case 15:
                InputConnectionC0971m inputConnectionC0971m = (InputConnectionC0971m) obj;
                v vVar = inputConnectionC0971m.f12370b;
                if (vVar != null) {
                    inputConnectionC0971m.a(vVar);
                    inputConnectionC0971m.f12370b = null;
                }
                C0 c02 = (C0) this.f611q;
                h0.e eVar2 = c02.f6259d;
                Object[] objArr = eVar2.f12546o;
                int i8 = eVar2.f12548q;
                while (true) {
                    if (i7 >= i8) {
                        i7 = -1;
                    } else if (!AbstractC1209k.a((H0) objArr[i7], inputConnectionC0971m)) {
                        i7++;
                    }
                }
                h0.e eVar3 = c02.f6259d;
                if (i7 >= 0) {
                    eVar3.l(i7);
                }
                if (eVar3.f12548q == 0) {
                    c02.f6257b.a();
                }
                return Y4.o.f8736a;
            case 16:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f611q).cancel();
                }
                return Y4.o.f8736a;
            case 17:
                Y0.v.c((Y0.j) obj, ((Y0.g) this.f611q).f8444a);
                return Y4.o.f8736a;
            case 18:
                ((List) obj).add((Float) ((d0) this.f611q).a());
                return true;
            case 19:
                return obj == ((AbstractC0507a) this.f611q) ? "(this Collection)" : String.valueOf(obj);
            case BuildConfig.API_VERSION /* 20 */:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC1209k.f(entry2, "it");
                Z4.f fVar3 = (Z4.f) this.f611q;
                StringBuilder sb = new StringBuilder();
                Object key = entry2.getKey();
                sb.append(key == fVar3 ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry2.getValue();
                sb.append(value != fVar3 ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 21:
                ((y5.o) ((y5.p) this.f611q)).k(null);
                return Y4.o.f8736a;
            case 22:
                ((h4.f) this.f611q).f12738y = true;
                return Y4.o.f8736a;
            case 23:
                return e(obj);
            case 24:
                ((InterfaceC1786g0) this.f611q).c(null);
                return Y4.o.f8736a;
            case 25:
                ((K) this.f611q).Z((n1.d) obj);
                return Y4.o.f8736a;
            case 26:
                ((Y3.j) this.f611q).cancel(false);
                return Y4.o.f8736a;
            case 27:
                u0.d dVar2 = (u0.d) obj;
                if (!dVar2.f15637o.f15636B) {
                    return E0.f5784p;
                }
                u0.d dVar3 = dVar2.f17134D;
                if (dVar3 != null) {
                    b bVar = new b(27, (I) this.f611q);
                    if (bVar.b(dVar3) == E0.f5783o) {
                        AbstractC0347f.C(dVar3, bVar);
                    }
                }
                dVar2.f17134D = null;
                dVar2.f17133C = null;
                return E0.f5783o;
            case 28:
                return Boolean.valueOf(AbstractC1209k.a(obj, this.f611q));
            default:
                Z0 z02 = (Z0) ((C1618o) this.f611q).f18135d.g(obj);
                return new n1.m(z02 != null ? ((n1.m) z02.getValue()).f14520a : 0L);
        }
    }
}
