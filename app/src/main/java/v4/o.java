package V4;

import A2.W;
import d0.C0799n;
import d0.C0801p;
import d0.n0;
import d0.o0;
import f0.C0890h0;
import java.util.LinkedHashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import o5.AbstractC1267a;
import w.j0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f7542p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ float f7543q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7544r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(float f7, InterfaceC1182c interfaceC1182c) {
        super(1);
        this.f7542p = 0;
        this.f7543q = f7;
        this.f7544r = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f7542p) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                if (fFloatValue != this.f7543q) {
                    ((InterfaceC1182c) this.f7544r).b(Float.valueOf(fFloatValue));
                }
                return Y4.o.f8736a;
            case 1:
                long j3 = ((n1.m) obj).f14520a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                o0 o0Var = o0.f11052o;
                float f7 = this.f7543q;
                linkedHashMap.put(o0Var, Float.valueOf(f7));
                int i7 = (int) (j3 & 4294967295L);
                float f8 = i7;
                float f9 = f7 / 2;
                o0 o0Var2 = o0.f11054q;
                n0 n0Var = (n0) this.f7544r;
                if (f8 > f9) {
                    n0Var.getClass();
                    linkedHashMap.put(o0Var2, Float.valueOf(f7 / 2.0f));
                }
                o0 o0Var3 = o0.f11053p;
                if (i7 != 0) {
                    linkedHashMap.put(o0Var3, Float.valueOf(Math.max(0.0f, f7 - f8)));
                }
                d0.F f10 = new d0.F(linkedHashMap);
                int iOrdinal = ((o0) n0Var.f11048a.f11062g.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        throw new W();
                    }
                    if (linkedHashMap.containsKey(o0Var2)) {
                        o0Var = o0Var2;
                    } else if (linkedHashMap.containsKey(o0Var3)) {
                        o0Var = o0Var3;
                    }
                }
                C0801p c0801p = n0Var.f11048a;
                if (!AbstractC1209k.a(c0801p.d(), f10)) {
                    c0801p.l.setValue(f10);
                    E5.d dVar = c0801p.f11059d.f10846b;
                    boolean zE = dVar.e();
                    if (zE) {
                        try {
                            C0799n c0799n = c0801p.f11066m;
                            float fD = c0801p.d().d(o0Var);
                            if (!Float.isNaN(fD)) {
                                Z1.l.g(c0799n, fD);
                                c0801p.h(null);
                            }
                            c0801p.g(o0Var);
                        } finally {
                            dVar.f(null);
                        }
                    }
                    if (!zE) {
                        c0801p.h(o0Var);
                    }
                }
                return Y4.o.f8736a;
            default:
                long jLongValue = ((Number) obj).longValue();
                j0 j0Var = (j0) this.f7544r;
                if (!j0Var.g()) {
                    C0890h0 c0890h0 = j0Var.f18694g;
                    if (c0890h0.h() == Long.MIN_VALUE) {
                        c0890h0.j(jLongValue);
                        j0Var.f18688a.f18534a.setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - c0890h0.h();
                    float f11 = this.f7543q;
                    if (f11 != 0.0f) {
                        jH = AbstractC1267a.I(jH / ((double) f11));
                    }
                    if (j0Var.f18689b == null) {
                        j0Var.f18693f.j(jH);
                    }
                    j0Var.h(jH, f11 == 0.0f);
                }
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, float f7, int i7) {
        super(1);
        this.f7542p = i7;
        this.f7544r = obj;
        this.f7543q = f7;
    }
}
