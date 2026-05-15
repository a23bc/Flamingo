package O0;

import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0352h0;
import R0.C0415x;
import h0.C0994b;
import r0.AbstractC1397o;
import t.AbstractC1459n;

/* JADX INFO: loaded from: classes.dex */
public final class P implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.z f5345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f5346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5347c;

    public P(S s7, Object obj) {
        this.f5346b = s7;
        this.f5347c = obj;
        int[] iArr = AbstractC1459n.f16089a;
        this.f5345a = new t.z();
    }

    @Override // O0.y0
    public final void a() throws Exception {
        S s7 = this.f5346b;
        s7.c();
        Q0.K k7 = (Q0.K) s7.f5364x.k(this.f5347c);
        if (k7 != null) {
            if (s7.f5353C <= 0) {
                N0.a.b("No pre-composed items to dispose");
            }
            Q0.K k8 = s7.f5355o;
            int iJ = ((h0.e) ((C0994b) k8.p()).f12538p).j(k7);
            if (iJ < ((h0.e) ((C0994b) k8.p()).f12538p).f12548q - s7.f5353C) {
                N0.a.b("Item is not in pre-composed item range");
            }
            s7.f5352B++;
            s7.f5353C--;
            J j3 = (J) s7.f5360t.g(k7);
            if (j3 != null) {
                S.a(j3);
            }
            int i7 = (((h0.e) ((C0994b) k8.p()).f12538p).f12548q - s7.f5353C) - s7.f5352B;
            k8.f5806E = true;
            k8.M(iJ, i7, 1);
            k8.f5806E = false;
            s7.b(i7);
        }
    }

    @Override // O0.y0
    public final int b() {
        Q0.K k7 = (Q0.K) this.f5346b.f5364x.g(this.f5347c);
        if (k7 != null) {
            return ((h0.e) ((C0994b) k7.o()).f12538p).f12548q;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [D.J] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // O0.y0
    public final void c(D.J j3) {
        C0352h0 c0352h0;
        AbstractC1397o abstractC1397o;
        Q0.E0 e02;
        Q0.K k7 = (Q0.K) this.f5346b.f5364x.g(this.f5347c);
        if (k7 == null || (c0352h0 = k7.f5821T) == null || (abstractC1397o = c0352h0.f6005f) == null) {
            return;
        }
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitSubtreeIf called on an unattached node");
        }
        h0.e eVar = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o;
        AbstractC1397o abstractC1397o3 = abstractC1397o2.f15642t;
        if (abstractC1397o3 == null) {
            AbstractC0347f.b(eVar, abstractC1397o2);
        } else {
            eVar.b(abstractC1397o3);
        }
        while (true) {
            int i7 = eVar.f12548q;
            if (i7 == 0) {
                return;
            }
            AbstractC1397o abstractC1397o4 = (AbstractC1397o) eVar.l(i7 - 1);
            if ((abstractC1397o4.f15640r & 262144) != 0) {
                for (AbstractC1397o abstractC1397o5 = abstractC1397o4; abstractC1397o5 != null; abstractC1397o5 = abstractC1397o5.f15642t) {
                    if ((abstractC1397o5.f15639q & 262144) != 0) {
                        ?? F6 = abstractC1397o5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof Q0.F0) {
                                Q0.F0 f02 = (Q0.F0) F6;
                                if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(f02.o())) {
                                    j3.b(f02);
                                    e02 = Q0.E0.f5784p;
                                } else {
                                    e02 = Q0.E0.f5783o;
                                }
                                if (e02 == Q0.E0.f5785q) {
                                    return;
                                }
                                if (e02 == Q0.E0.f5784p) {
                                    break;
                                }
                            } else if ((F6.f15639q & 262144) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o6 = ((AbstractC0358n) F6).f6056D;
                                int i8 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC1397o6 != null) {
                                    if ((abstractC1397o6.f15639q & 262144) != 0) {
                                        i8++;
                                        eVar2 = eVar2;
                                        if (i8 == 1) {
                                            F6 = abstractC1397o6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.b(F6);
                                                F6 = 0;
                                            }
                                            eVar2.b(abstractC1397o6);
                                        }
                                    }
                                    abstractC1397o6 = abstractC1397o6.f15642t;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i8 == 1) {
                                }
                            }
                            F6 = AbstractC0347f.f(eVar2);
                        }
                    }
                }
            }
            AbstractC0347f.b(eVar, abstractC1397o4);
        }
    }

    @Override // O0.y0
    public final long d(int i7) {
        Q0.K k7 = (Q0.K) this.f5346b.f5364x.g(this.f5347c);
        if (k7 == null || !k7.I()) {
            return 0L;
        }
        int i8 = ((h0.e) ((C0994b) k7.o()).f12538p).f12548q;
        if (i7 < 0 || i7 >= i8) {
            N0.a.d("Index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
        if (!this.f5345a.b(i7)) {
            return 0L;
        }
        return (((long) ((Q0.K) ((C0994b) k7.o()).get(i7)).f5822U.f5869p.f5416o) << 32) | (((long) ((Q0.K) ((C0994b) k7.o()).get(i7)).f5822U.f5869p.f5417p) & 4294967295L);
    }

    @Override // O0.y0
    public final void e(long j3, int i7) {
        S s7 = this.f5346b;
        Q0.K k7 = (Q0.K) s7.f5364x.g(this.f5347c);
        if (k7 == null || !k7.I()) {
            return;
        }
        int i8 = ((h0.e) ((C0994b) k7.o()).f12538p).f12548q;
        if (i7 < 0 || i7 >= i8) {
            N0.a.d("Index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
        if (k7.J()) {
            N0.a.a("Pre-measure called on node that is not placed");
        }
        Q0.K k8 = s7.f5355o;
        k8.f5806E = true;
        ((C0415x) Q0.O.a(k7)).z((Q0.K) ((C0994b) k7.o()).get(i7), j3);
        k8.f5806E = false;
        this.f5345a.a(i7);
    }
}
