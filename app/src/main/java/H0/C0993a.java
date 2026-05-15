package h0;

import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import t.C1444F;
import t.J;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f12536a;

    public static final Object a(J j3) {
        Object objG = j3.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof C1444F)) {
            j3.k(null);
            return objG;
        }
        C1444F c1444f = (C1444F) objG;
        if (c1444f.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i7 = c1444f.f15984b - 1;
        Object objE = c1444f.e(i7);
        c1444f.j(i7);
        AbstractC1209k.d(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c1444f.g()) {
            j3.k(null);
        }
        if (c1444f.f15984b == 1) {
            j3.m(null, c1444f.d());
        }
        return objE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final t.C1444F b(t.J r15) {
        /*
            boolean r0 = r15.i()
            if (r0 == 0) goto Le
            t.F r15 = t.O.f16030b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            m5.AbstractC1209k.d(r15, r0)
            return r15
        Le:
            t.F r0 = new t.F
            r0.<init>()
            java.lang.Object[] r1 = r15.f16005c
            long[] r15 = r15.f16003a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L92
            r3 = 0
            r4 = r3
        L1e:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L8d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L8b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L87
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof t.C1444F
            if (r11 == 0) goto L7f
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            m5.AbstractC1209k.d(r10, r11)
            t.F r10 = (t.C1444F) r10
            java.lang.String r11 = "elements"
            m5.AbstractC1209k.f(r10, r11)
            boolean r11 = r10.g()
            if (r11 == 0) goto L5f
            goto L87
        L5f:
            int r11 = r0.f15984b
            int r12 = r10.f15984b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f15983a
            int r13 = r12.length
            if (r13 >= r11) goto L6c
            r0.l(r11, r12)
        L6c:
            java.lang.Object[] r11 = r0.f15983a
            java.lang.Object[] r12 = r10.f15983a
            int r13 = r0.f15984b
            int r14 = r10.f15984b
            Z4.l.W(r13, r3, r14, r12, r11)
            int r11 = r0.f15984b
            int r10 = r10.f15984b
            int r11 = r11 + r10
            r0.f15984b = r11
            goto L87
        L7f:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            m5.AbstractC1209k.d(r10, r11)
            r0.a(r10)
        L87:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L8b:
            if (r7 != r8) goto L92
        L8d:
            if (r4 == r2) goto L92
            int r4 = r4 + 1
            goto L1e
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0993a.b(t.J):t.F");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0993a) {
            return AbstractC1209k.a(this.f12536a, ((C0993a) obj).f12536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12536a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f12536a + ')';
    }
}
