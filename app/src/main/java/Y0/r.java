package Y0;

import L2.C0247a;
import O0.w0;
import Q0.AbstractC0347f;
import Q0.K;
import Q0.j0;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import t.AbstractC1458m;
import t.y;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1893c f8494a = new C1893c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Y0.o a(Q0.K r8, boolean r9) {
        /*
            Q0.h0 r0 = r8.f5821T
            r0.o r0 = r0.f6005f
            int r1 = r0.f15640r
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L64
        Lb:
            if (r0 == 0) goto L64
            int r1 = r0.f15639q
            r1 = r1 & 8
            if (r1 == 0) goto L5b
            r1 = r0
            r3 = r2
        L15:
            if (r1 == 0) goto L5b
            boolean r4 = r1 instanceof Q0.A0
            if (r4 == 0) goto L1d
            r2 = r1
            goto L64
        L1d:
            int r4 = r1.f15639q
            r4 = r4 & 8
            if (r4 == 0) goto L56
            boolean r4 = r1 instanceof Q0.AbstractC0358n
            if (r4 == 0) goto L56
            r4 = r1
            Q0.n r4 = (Q0.AbstractC0358n) r4
            r0.o r4 = r4.f6056D
            r5 = 0
        L2d:
            r6 = 1
            if (r4 == 0) goto L53
            int r7 = r4.f15639q
            r7 = r7 & 8
            if (r7 == 0) goto L50
            int r5 = r5 + 1
            if (r5 != r6) goto L3c
            r1 = r4
            goto L50
        L3c:
            if (r3 != 0) goto L47
            h0.e r3 = new h0.e
            r6 = 16
            r0.o[] r6 = new r0.AbstractC1397o[r6]
            r3.<init>(r6)
        L47:
            if (r1 == 0) goto L4d
            r3.b(r1)
            r1 = r2
        L4d:
            r3.b(r4)
        L50:
            r0.o r4 = r4.f15642t
            goto L2d
        L53:
            if (r5 != r6) goto L56
            goto L15
        L56:
            r0.o r1 = Q0.AbstractC0347f.f(r3)
            goto L15
        L5b:
            int r1 = r0.f15640r
            r1 = r1 & 8
            if (r1 == 0) goto L64
            r0.o r0 = r0.f15642t
            goto Lb
        L64:
            m5.AbstractC1209k.c(r2)
            Q0.A0 r2 = (Q0.A0) r2
            r0.o r2 = (r0.AbstractC1397o) r2
            r0.o r0 = r2.f15637o
            Y0.j r1 = r8.y()
            if (r1 != 0) goto L78
            Y0.j r1 = new Y0.j
            r1.<init>()
        L78:
            Y0.o r2 = new Y0.o
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.r.a(Q0.K, boolean):Y0.o");
    }

    public static final y b(q qVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            o oVarA = qVar.a();
            K k7 = oVarA.f8483c;
            if (k7.J() && k7.I()) {
                y yVar = new y(48);
                C0247a c0247a = new C0247a(17);
                n1.l lVarC = j0.k.C(oVarA.g());
                ((Region) c0247a.f4105p).set(lVarC.f14516a, lVarC.f14517b, lVarC.f14518c, lVarC.f14519d);
                c(c0247a, oVarA, yVar, oVarA, new C0247a(17));
                return yVar;
            }
            y yVar2 = AbstractC1458m.f16088a;
            AbstractC1209k.d(yVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return yVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(C0247a c0247a, o oVar, y yVar, o oVar2, C0247a c0247a2) {
        C1893c c1893cD1;
        K k7;
        boolean zJ = oVar2.f8483c.J();
        K k8 = oVar2.f8483c;
        boolean z6 = (zJ && k8.I()) ? false : true;
        Region region = (Region) c0247a.f4105p;
        boolean zIsEmpty = region.isEmpty();
        int i7 = oVar.f8487g;
        int i8 = oVar2.f8487g;
        if (!zIsEmpty || i8 == i7) {
            if (!z6 || oVar2.f8485e) {
                Object objF = oVar2.f();
                if (objF == null) {
                    c1893cD1 = k8.f5821T.f6002c.d1();
                } else {
                    AbstractC1397o abstractC1397o = ((AbstractC1397o) objF).f15637o;
                    Object objG = oVar2.f8484d.f8473o.g(i.f8450b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z7 = objG != null;
                    if (!abstractC1397o.f15637o.f15636B) {
                        c1893cD1 = C1893c.f19868e;
                    } else if (z7) {
                        c1893cD1 = AbstractC0347f.v(abstractC1397o, 8).d1();
                    } else {
                        j0 j0VarV = AbstractC0347f.v(abstractC1397o, 8);
                        c1893cD1 = w0.i(j0VarV).m(j0VarV, true);
                    }
                }
                n1.l lVarC = j0.k.C(c1893cD1);
                Region region2 = (Region) c0247a2.f4105p;
                region2.set(lVarC.f14516a, lVarC.f14517b, lVarC.f14518c, lVarC.f14519d);
                if (i8 == i7) {
                    i8 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (oVar2.f8485e) {
                        o oVarL = oVar2.l();
                        yVar.h(i8, new p(oVar2, j0.k.C((oVarL == null || (k7 = oVarL.f8483c) == null || !k7.J()) ? f8494a : oVarL.g())));
                        return;
                    } else {
                        if (i8 == -1) {
                            Rect bounds = region2.getBounds();
                            yVar.h(i8, new p(oVar2, new n1.l(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region2.getBounds();
                yVar.h(i8, new p(oVar2, new n1.l(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = o.j(4, oVar2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((o) listJ.get(size)).k().f8473o.c(t.f8553z)) {
                        c(c0247a, oVar, yVar, (o) listJ.get(size), c0247a2);
                    }
                }
                if (f(oVar2)) {
                    region.op(lVarC.f14516a, lVarC.f14517b, lVarC.f14518c, lVarC.f14519d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(j jVar, w wVar) {
        Object objG = jVar.f8473o.g(wVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(o oVar) {
        j0 j0VarD = oVar.d();
        if (j0VarD != null ? j0VarD.R0() : false) {
            return true;
        }
        w wVar = t.f8530a;
        w wVar2 = t.f8543p;
        j jVar = oVar.f8484d;
        if (jVar.f8473o.c(wVar2)) {
            return true;
        }
        return jVar.f8473o.c(t.f8542o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(Y0.o r14) {
        /*
            boolean r0 = e(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            Y0.j r14 = r14.f8484d
            boolean r0 = r14.f8475q
            if (r0 != 0) goto L59
            t.J r14 = r14.f8473o
            java.lang.Object[] r0 = r14.f16004b
            java.lang.Object[] r2 = r14.f16005c
            long[] r14 = r14.f16003a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            Y0.w r11 = (Y0.w) r11
            boolean r10 = r11.f8559c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.r.f(Y0.o):boolean");
    }
}
