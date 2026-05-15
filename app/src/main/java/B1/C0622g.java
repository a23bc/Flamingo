package b1;

import h1.AbstractC0996a;
import java.util.ArrayList;
import java.util.List;
import m5.AbstractC1209k;
import t.AbstractC1456k;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0622g implements CharSequence {

    /* JADX INFO: renamed from: o */
    public final List f9969o;

    /* JADX INFO: renamed from: p */
    public final String f9970p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f9971q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f9972r;

    static {
        V1.a aVar = AbstractC0606B.f9878a;
    }

    public C0622g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f9969o = list;
        this.f9970p = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i7 = 0; i7 < size; i7++) {
                C0620e c0620e = (C0620e) list.get(i7);
                Object obj = c0620e.f9964a;
                if (obj instanceof C0608D) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0620e);
                } else if (obj instanceof t) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0620e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f9971q = arrayList;
        this.f9972r = arrayList2;
        List listG0 = arrayList2 != null ? Z4.n.G0(arrayList2, new C0621f(0)) : null;
        if (listG0 == null || listG0.isEmpty()) {
            return;
        }
        int i8 = ((C0620e) Z4.n.q0(listG0)).f9966c;
        t.x xVar = AbstractC1456k.f16082a;
        t.x xVar2 = new t.x(1);
        xVar2.a(i8);
        int size2 = listG0.size();
        for (int i9 = 1; i9 < size2; i9++) {
            C0620e c0620e2 = (C0620e) listG0.get(i9);
            while (true) {
                if (xVar2.f16127b == 0) {
                    break;
                }
                int iC = xVar2.c();
                if (c0620e2.f9965b >= iC) {
                    xVar2.d(xVar2.f16127b - 1);
                } else {
                    int i10 = c0620e2.f9966c;
                    if (i10 > iC) {
                        AbstractC0996a.a("Paragraph overlap not allowed, end " + i10 + " should be less than or equal to " + iC);
                    }
                }
            }
            xVar2.a(c0620e2.f9966c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b1.C0622g subSequence(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 > r13) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            r3 = 41
            java.lang.String r4 = "start ("
            if (r2 != 0) goto L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r12)
            java.lang.String r5 = ") should be less or equal to end ("
            r2.append(r5)
            r2.append(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            h1.AbstractC0996a.a(r2)
        L27:
            java.lang.String r2 = r11.f9970p
            if (r12 != 0) goto L32
            int r5 = r2.length()
            if (r13 != r5) goto L32
            return r11
        L32:
            java.lang.String r2 = r2.substring(r12, r13)
            java.lang.String r5 = "substring(...)"
            m5.AbstractC1209k.e(r2, r5)
            b1.g r5 = b1.AbstractC0623h.f9973a
            if (r12 > r13) goto L40
            goto L5a
        L40:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r12)
            java.lang.String r4 = ") should be less than or equal to end ("
            r5.append(r4)
            r5.append(r13)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            h1.AbstractC0996a.a(r3)
        L5a:
            java.util.List r3 = r11.f9969o
            if (r3 != 0) goto L5f
            goto L9e
        L5f:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            r4.<init>(r5)
            int r5 = r3.size()
        L6c:
            if (r1 >= r5) goto L98
            java.lang.Object r6 = r3.get(r1)
            b1.e r6 = (b1.C0620e) r6
            int r7 = r6.f9965b
            int r8 = r6.f9966c
            boolean r7 = b1.AbstractC0623h.b(r12, r13, r7, r8)
            if (r7 == 0) goto L96
            b1.e r7 = new b1.e
            int r9 = r6.f9965b
            int r9 = java.lang.Math.max(r12, r9)
            int r9 = r9 - r12
            int r8 = java.lang.Math.min(r13, r8)
            int r8 = r8 - r12
            java.lang.String r10 = r6.f9967d
            java.lang.Object r6 = r6.f9964a
            r7.<init>(r6, r9, r8, r10)
            r4.add(r7)
        L96:
            int r1 = r1 + r0
            goto L6c
        L98:
            boolean r12 = r4.isEmpty()
            if (r12 == 0) goto L9f
        L9e:
            r4 = 0
        L9f:
            b1.g r12 = new b1.g
            r12.<init>(r4, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0622g.subSequence(int, int):b1.g");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f9970p.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622g)) {
            return false;
        }
        C0622g c0622g = (C0622g) obj;
        return AbstractC1209k.a(this.f9970p, c0622g.f9970p) && AbstractC1209k.a(this.f9969o, c0622g.f9969o);
    }

    public final int hashCode() {
        int iHashCode = this.f9970p.hashCode() * 31;
        List list = this.f9969o;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9970p.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f9970p;
    }

    public /* synthetic */ C0622g(String str) {
        this(str, Z4.v.f8818o);
    }

    public C0622g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
