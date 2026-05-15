package P0;

import D.Y;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0341c;
import Q0.K;
import R0.C0415x;
import java.util.HashSet;
import r0.AbstractC1397o;
import t.C1444F;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0415x f5703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.e f5704b = new h0.e(new C0341c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.e f5705c = new h0.e(new f[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.e f5706d = new h0.e(new K[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.e f5707e = new h0.e(new f[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5708f;

    public c(C0415x c0415x) {
        this.f5703a = c0415x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(AbstractC1397o abstractC1397o, f fVar, HashSet hashSet) {
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
            if ((abstractC1397o4.f15640r & 32) != 0) {
                for (AbstractC1397o abstractC1397o5 = abstractC1397o4; abstractC1397o5 != null; abstractC1397o5 = abstractC1397o5.f15642t) {
                    if ((abstractC1397o5.f15639q & 32) != 0) {
                        ?? F6 = abstractC1397o5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof d) {
                                d dVar = (d) F6;
                                if (dVar instanceof C0341c) {
                                    C0341c c0341c = (C0341c) dVar;
                                    if ((c0341c.f5937C instanceof Y) && c0341c.f5939E.contains(fVar)) {
                                        hashSet.add(dVar);
                                    }
                                }
                                if (dVar.j().s(fVar)) {
                                    break;
                                }
                            } else if ((F6.f15639q & 32) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o6 = ((AbstractC0358n) F6).f6056D;
                                int i8 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC1397o6 != null) {
                                    if ((abstractC1397o6.f15639q & 32) != 0) {
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

    public final void a() {
        if (this.f5708f) {
            return;
        }
        this.f5708f = true;
        E0.K k7 = new E0.K(7, this);
        C1444F c1444f = this.f5703a.f6580J0;
        if (c1444f.f(k7) >= 0) {
            return;
        }
        c1444f.a(k7);
    }
}
