package Y0;

import java.util.Iterator;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;
import t.C1453h;
import t.C1466v;
import t.J;
import t.Q;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o */
    public final J f8473o;

    /* JADX INFO: renamed from: p */
    public C1466v f8474p;

    /* JADX INFO: renamed from: q */
    public boolean f8475q;

    /* JADX INFO: renamed from: r */
    public boolean f8476r;

    public j() {
        long[] jArr = Q.f16032a;
        this.f8473o = new J();
    }

    public final boolean b(w wVar) {
        return this.f8473o.c(wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Y0.j c() {
        /*
            r18 = this;
            r0 = r18
            Y0.j r1 = new Y0.j
            r1.<init>()
            boolean r2 = r0.f8475q
            r1.f8475q = r2
            boolean r2 = r0.f8476r
            r1.f8476r = r2
            t.J r2 = r1.f8473o
            r2.getClass()
            java.lang.String r3 = "from"
            t.J r4 = r0.f8473o
            m5.AbstractC1209k.f(r4, r3)
            java.lang.Object[] r3 = r4.f16004b
            java.lang.Object[] r5 = r4.f16005c
            long[] r4 = r4.f16003a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.c():Y0.j");
    }

    public final Object e(w wVar) {
        Object objG = this.f8473o.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC1209k.a(this.f8473o, jVar.f8473o) && this.f8475q == jVar.f8475q && this.f8476r == jVar.f8476r;
    }

    public final void g(j jVar) {
        J j3 = jVar.f8473o;
        Object[] objArr = j3.f16004b;
        Object[] objArr2 = j3.f16005c;
        long[] jArr = j3.f16003a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        int i10 = (i7 << 3) + i9;
                        Object obj = objArr[i10];
                        Object obj2 = objArr2[i10];
                        w wVar = (w) obj;
                        J j8 = this.f8473o;
                        Object objG = j8.g(wVar);
                        AbstractC1209k.d(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = wVar.f8558b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            j8.m(wVar, objInvoke);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final int hashCode() {
        return (((this.f8473o.hashCode() * 31) + (this.f8475q ? 1231 : 1237)) * 31) + (this.f8476r ? 1231 : 1237);
    }

    public final void i(w wVar, Object obj) {
        boolean z6 = obj instanceof a;
        J j3 = this.f8473o;
        if (z6 && j3.c(wVar)) {
            Object objG = j3.g(wVar);
            AbstractC1209k.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f8430a;
            if (str == null) {
                str = aVar.f8430a;
            }
            Y4.c cVar = aVar2.f8431b;
            if (cVar == null) {
                cVar = aVar.f8431b;
            }
            j3.m(wVar, new a(str, cVar));
        } else {
            j3.m(wVar, obj);
        }
        wVar.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1466v c1466v = this.f8474p;
        if (c1466v == null) {
            J j3 = this.f8473o;
            j3.getClass();
            C1466v c1466v2 = new C1466v(j3);
            this.f8474p = c1466v2;
            c1466v = c1466v2;
        }
        return ((C1453h) c1466v.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:43:0x003f, B:50:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f8475q
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f8476r
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            t.J r4 = r0.f8473o
            java.lang.Object[] r5 = r4.f16004b
            java.lang.Object[] r6 = r4.f16005c
            long[] r4 = r4.f16003a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            Y0.w r8 = (Y0.w) r8
            r1.append(r2)
            java.lang.String r2 = r8.f8557a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = R0.M.F(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.j.toString():java.lang.String");
    }
}
