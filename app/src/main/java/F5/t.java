package F5;

import R0.C0408t0;
import X.C0469c0;
import a.AbstractC0509a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import b1.AbstractC0623h;
import b1.C0620e;
import b1.C0621f;
import b1.C0622g;
import b1.M;
import c1.AbstractC0721g;
import c1.C0718d;
import e4.C0853b;
import h1.AbstractC0996a;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import l5.InterfaceC1180a;
import m4.C1198a;
import m5.AbstractC1209k;
import q3.C1370a;
import q3.C1372c;
import q3.C1375f;
import u5.AbstractC1545g;
import v2.C1634a;
import v2.C1635b;
import x3.AbstractServiceC1940y;
import x3.C1931p;
import x3.C1932q;
import x3.f0;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public class t implements b1.s, k3.d {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2440o;

    /* JADX INFO: renamed from: p */
    public final Object f2441p;

    /* JADX INFO: renamed from: q */
    public Object f2442q;

    /* JADX INFO: renamed from: r */
    public Object f2443r;

    /* JADX INFO: renamed from: s */
    public final Object f2444s;

    /* JADX INFO: renamed from: t */
    public Object f2445t;

    public t(Map map) {
        this.f2440o = 4;
        AbstractC1209k.f(map, "initialState");
        this.f2441p = Z4.y.q0(map);
        this.f2442q = new LinkedHashMap();
        this.f2443r = new LinkedHashMap();
        this.f2444s = new LinkedHashMap();
        this.f2445t = new C0408t0(4, this);
    }

    @Override // k3.d
    public int D() {
        return ((long[]) this.f2442q).length;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y4.e, java.lang.Object] */
    @Override // b1.s
    public float a() {
        return ((Number) this.f2443r.getValue()).floatValue();
    }

    @Override // b1.s
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f2445t;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((b1.r) arrayList.get(i7)).f10003a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y4.e, java.lang.Object] */
    @Override // b1.s
    public float c() {
        return ((Number) this.f2444s.getValue()).floatValue();
    }

    @Override // k3.d
    public int d(long j3) {
        long[] jArr = (long[]) this.f2442q;
        int iB = w2.t.b(jArr, j3, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void e(j4.f fVar, Class cls) {
        ((ArrayList) this.f2444s).add(new Y4.h(fVar, cls));
    }

    public void f(C1198a c1198a, Class cls) {
        ((ArrayList) this.f2442q).add(new Y4.h(c1198a, cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.text.Bidi g(int r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2444s
            boolean[] r0 = (boolean[]) r0
            boolean r1 = r0[r14]
            java.lang.Object r2 = r13.f2443r
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r1 == 0) goto L13
            java.lang.Object r14 = r2.get(r14)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L13:
            java.lang.Object r1 = r13.f2442q
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r3 = 0
            if (r14 != 0) goto L1c
            r4 = r3
            goto L28
        L1c:
            int r4 = r14 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L28:
            java.lang.Object r1 = r1.get(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            java.lang.Object r5 = r13.f2445t
            char[] r5 = (char[]) r5
            if (r5 == 0) goto L40
            int r6 = r5.length
            if (r6 >= r10) goto L3e
            goto L40
        L3e:
            r6 = r5
            goto L43
        L40:
            char[] r5 = new char[r10]
            goto L3e
        L43:
            java.lang.Object r5 = r13.f2441p
            android.text.Layout r5 = (android.text.Layout) r5
            java.lang.CharSequence r7 = r5.getText()
            android.text.TextUtils.getChars(r7, r4, r1, r6, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r6, r3, r10)
            r4 = 1
            r12 = 0
            if (r1 == 0) goto L76
            int r1 = r13.n(r14)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L67
            r11 = r4
            goto L68
        L67:
            r11 = r3
        L68:
            java.text.Bidi r5 = new java.text.Bidi
            r9 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r1 = r5.getRunCount()
            if (r1 != r4) goto L77
        L76:
            r5 = r12
        L77:
            r2.set(r14, r5)
            r0[r14] = r4
            if (r5 == 0) goto L87
            java.lang.Object r14 = r13.f2445t
            char[] r14 = (char[]) r14
            if (r6 != r14) goto L86
            r6 = r12
            goto L87
        L86:
            r6 = r14
        L87:
            r13.f2445t = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.t.g(int):java.text.Bidi");
    }

    public c h() {
        c cVar = (c) this.f2445t;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f2324n;
        c cVarS = AbstractC0509a.S((m) this.f2443r);
        this.f2445t = cVarS;
        return cVarS;
    }

    public f0 i() {
        C1931p c1931p = ((AbstractServiceC1940y) this.f2444s).f20129t;
        if (c1931p != null) {
            return c1931p.f20095d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    @Override // k3.d
    public long j(int i7) {
        return ((long[]) this.f2442q)[i7];
    }

    public float k(int i7, boolean z6) {
        Layout layout = (Layout) this.f2441p;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        return z6 ? layout.getPrimaryHorizontal(i7) : layout.getSecondaryHorizontal(i7);
    }

    public float l(int i7, boolean z6, boolean z7) {
        int i8;
        int i9;
        int iO = i7;
        if (!z7) {
            return k(i7, z6);
        }
        Layout layout = (Layout) this.f2441p;
        int iD = AbstractC0721g.d(layout, iO, z7);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (iO != lineStart && iO != lineEnd) {
            return k(i7, z6);
        }
        if (iO == 0 || iO == layout.getText().length()) {
            return k(i7, z6);
        }
        int iM = m(iO, z7);
        boolean z8 = layout.getParagraphDirection(layout.getLineForOffset(n(iM))) == -1;
        int iO2 = o(lineEnd, lineStart);
        int iN = n(iM);
        int i10 = lineStart - iN;
        int i11 = iO2 - iN;
        Bidi bidiG = g(iM);
        Bidi bidiCreateLineBidi = bidiG != null ? bidiG.createLineBidi(i10, i11) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z6 || z8 == zIsRtlCharAt) {
                z8 = !z8;
            }
            return iO == lineStart ? z8 : !z8 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C0718d[] c0718dArr = new C0718d[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            c0718dArr[i12] = new C0718d(bidiCreateLineBidi.getRunStart(i12) + lineStart, bidiCreateLineBidi.getRunLimit(i12) + lineStart, bidiCreateLineBidi.getRunLevel(i12) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i13 = 0; i13 < runCount2; i13++) {
            bArr[i13] = (byte) bidiCreateLineBidi.getRunLevel(i13);
        }
        Bidi.reorderVisually(bArr, 0, c0718dArr, 0, runCount);
        if (iO == lineStart) {
            int i14 = 0;
            while (true) {
                if (i14 >= runCount) {
                    i9 = -1;
                    break;
                }
                if (c0718dArr[i14].f10623a == iO) {
                    i9 = i14;
                    break;
                }
                i14++;
            }
            boolean z9 = (z6 || z8 == c0718dArr[i9].f10625c) ? !z8 : z8;
            return (i9 == 0 && z9) ? layout.getLineLeft(iD) : (i9 != runCount - 1 || z9) ? z9 ? layout.getPrimaryHorizontal(c0718dArr[i9 - 1].f10623a) : layout.getPrimaryHorizontal(c0718dArr[i9 + 1].f10623a) : layout.getLineRight(iD);
        }
        if (iO > iO2) {
            iO = o(iO, lineStart);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= runCount) {
                i8 = -1;
                break;
            }
            if (c0718dArr[i15].f10624b == iO) {
                i8 = i15;
                break;
            }
            i15++;
        }
        boolean z10 = (z6 || z8 == c0718dArr[i8].f10625c) ? z8 : !z8;
        return (i8 == 0 && z10) ? layout.getLineLeft(iD) : (i8 != runCount - 1 || z10) ? z10 ? layout.getPrimaryHorizontal(c0718dArr[i8 - 1].f10624b) : layout.getPrimaryHorizontal(c0718dArr[i8 + 1].f10624b) : layout.getLineRight(iD);
    }

    public int m(int i7, boolean z6) {
        ArrayList arrayList = (ArrayList) this.f2442q;
        int iC0 = Z4.o.c0(arrayList, Integer.valueOf(i7));
        int i8 = iC0 < 0 ? -(iC0 + 1) : iC0 + 1;
        if (z6 && i8 > 0) {
            int i9 = i8 - 1;
            if (i7 == ((Number) arrayList.get(i9)).intValue()) {
                return i9;
            }
        }
        return i8;
    }

    public int n(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f2442q).get(i7 - 1)).intValue();
    }

    public int o(int i7, int i8) {
        while (i7 > i8) {
            char cCharAt = ((Layout) this.f2441p).getText().charAt(i7 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC1209k.g(cCharAt, 8192) < 0 || AbstractC1209k.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i7;
            }
            i7--;
        }
        return i7;
    }

    public U3.h p() {
        U3.h hVar = new U3.h();
        hVar.f7045r = new LinkedHashMap();
        hVar.f7042o = (o) this.f2441p;
        hVar.f7043p = (String) this.f2442q;
        Map map = (Map) this.f2444s;
        hVar.f7045r = map.isEmpty() ? new LinkedHashMap() : Z4.y.q0(map);
        hVar.f7044q = ((m) this.f2443r).g();
        return hVar;
    }

    public void q() {
        C1932q c1932q = new C1932q(this, (AbstractServiceC1940y) this.f2445t);
        this.f2442q = c1932q;
        c1932q.onCreate();
    }

    public void r(Object obj, String str) {
        AbstractC1209k.f(str, "key");
        ((LinkedHashMap) this.f2441p).put(str, obj);
        z5.s sVar = (z5.s) ((LinkedHashMap) this.f2443r).get(str);
        if (sVar != null) {
            ((J) sVar).i(obj);
        }
        z5.s sVar2 = (z5.s) ((LinkedHashMap) this.f2444s).get(str);
        if (sVar2 != null) {
            ((J) sVar2).i(obj);
        }
    }

    @Override // k3.d
    public List s(long j3) {
        C1372c c1372c = (C1372c) this.f2441p;
        ArrayList<Pair> arrayList = new ArrayList();
        c1372c.g(j3, c1372c.h, arrayList);
        TreeMap treeMap = new TreeMap();
        c1372c.i(j3, false, c1372c.h, treeMap);
        HashMap map = (HashMap) this.f2443r;
        c1372c.h(j3, (Map) this.f2444s, map, c1372c.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) ((HashMap) this.f2445t).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C1375f c1375f = (C1375f) map.get(pair.first);
                c1375f.getClass();
                arrayList2.add(new C1635b(null, null, null, bitmapDecodeByteArray, c1375f.f15558c, 0, c1375f.f15560e, c1375f.f15557b, 0, Integer.MIN_VALUE, -3.4028235E38f, c1375f.f15561f, c1375f.f15562g, false, -16777216, c1375f.f15564j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C1375f c1375f2 = (C1375f) map.get(entry.getKey());
            c1375f2.getClass();
            C1634a c1634a = (C1634a) entry.getValue();
            CharSequence charSequence = c1634a.f18222a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C1370a c1370a : (C1370a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1370a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c1370a), spannableStringBuilder.getSpanEnd(c1370a), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c1634a.f18226e = c1375f2.f15558c;
            c1634a.f18227f = c1375f2.f15559d;
            c1634a.f18228g = c1375f2.f15560e;
            c1634a.h = c1375f2.f15557b;
            c1634a.l = c1375f2.f15561f;
            c1634a.f18231k = c1375f2.f15563i;
            c1634a.f18230j = c1375f2.h;
            c1634a.f18235p = c1375f2.f15564j;
            arrayList2.add(c1634a.a());
        }
        return arrayList2;
    }

    public String toString() {
        switch (this.f2440o) {
            case 0:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f2442q);
                sb.append(", url=");
                sb.append((o) this.f2441p);
                m mVar = (m) this.f2443r;
                if (mVar.size() != 0) {
                    sb.append(", headers=[");
                    int i7 = 0;
                    for (Object obj : mVar) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            Z4.o.i0();
                            throw null;
                        }
                        Y4.h hVar = (Y4.h) obj;
                        String str = (String) hVar.f8726o;
                        String str2 = (String) hVar.f8727p;
                        if (i7 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i7 = i8;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f2444s;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String string = sb.toString();
                AbstractC1209k.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public t(o oVar, String str, m mVar, AbstractC0509a abstractC0509a, Map map) {
        this.f2440o = 0;
        AbstractC1209k.f(oVar, "url");
        AbstractC1209k.f(str, "method");
        this.f2441p = oVar;
        this.f2442q = str;
        this.f2443r = mVar;
        this.f2444s = map;
    }

    public t(Layout layout) {
        this.f2440o = 2;
        this.f2441p = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iW = AbstractC1545g.W(((Layout) this.f2441p).getText(), '\n', length, 4);
            length = iW < 0 ? ((Layout) this.f2441p).getText().length() : iW + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f2441p).getText().length());
        this.f2442q = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(null);
        }
        this.f2443r = arrayList2;
        this.f2444s = new boolean[((ArrayList) this.f2442q).size()];
        ((ArrayList) this.f2442q).size();
    }

    public t(C1372c c1372c, HashMap map, HashMap map2, HashMap map3) {
        this.f2440o = 5;
        this.f2441p = c1372c;
        this.f2443r = map2;
        this.f2445t = map3;
        this.f2444s = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        c1372c.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f2442q = jArr;
    }

    public t(C0622g c0622g, M m7, List list, n1.d dVar, f1.d dVar2) {
        String str;
        int i7;
        String strSubstring;
        int i8;
        ArrayList arrayList;
        int i9;
        C0622g c0622g2 = c0622g;
        M m8 = m7;
        final int i10 = 1;
        this.f2440o = 1;
        final int i11 = 0;
        this.f2441p = c0622g2;
        this.f2442q = list;
        Y4.f fVar = Y4.f.f8724p;
        this.f2443r = AbstractC0509a.N(fVar, new InterfaceC1180a(this) { // from class: b1.p

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ F5.t f9995p;

            {
                this.f9995p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f9995p.f2445t;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fA = ((r) obj3).f10003a.a();
                            int iD0 = Z4.o.d0(arrayList2);
                            int i12 = 1;
                            if (1 <= iD0) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i12);
                                    float fA2 = ((r) obj4).f10003a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i12 != iD0) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        return Float.valueOf(rVar != null ? rVar.f10003a.a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f9995p.f2445t;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((r) obj5).f10003a.f13656w.c();
                            int iD02 = Z4.o.d0(arrayList3);
                            int i13 = 1;
                            if (1 <= iD02) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((r) obj6).f10003a.f13656w.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iD02) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        return Float.valueOf(rVar2 != null ? rVar2.f10003a.f13656w.c() : 0.0f);
                }
            }
        });
        this.f2444s = AbstractC0509a.N(fVar, new InterfaceC1180a(this) { // from class: b1.p

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ F5.t f9995p;

            {
                this.f9995p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                Object obj;
                Object obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f9995p.f2445t;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fA = ((r) obj3).f10003a.a();
                            int iD0 = Z4.o.d0(arrayList2);
                            int i12 = 1;
                            if (1 <= iD0) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i12);
                                    float fA2 = ((r) obj4).f10003a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i12 != iD0) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        r rVar = (r) obj;
                        return Float.valueOf(rVar != null ? rVar.f10003a.a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f9995p.f2445t;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fC = ((r) obj5).f10003a.f13656w.c();
                            int iD02 = Z4.o.d0(arrayList3);
                            int i13 = 1;
                            if (1 <= iD02) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i13);
                                    float fC2 = ((r) obj6).f10003a.f13656w.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i13 != iD02) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        r rVar2 = (r) obj2;
                        return Float.valueOf(rVar2 != null ? rVar2.f10003a.f13656w.c() : 0.0f);
                }
            }
        });
        C0622g c0622g3 = AbstractC0623h.f9973a;
        ArrayList arrayList2 = c0622g2.f9972r;
        Z4.v vVar = Z4.v.f8818o;
        List listG0 = arrayList2 != null ? Z4.n.G0(arrayList2, new C0621f(1)) : vVar;
        ArrayList arrayList3 = new ArrayList();
        Z4.k kVar = new Z4.k();
        int size = listG0.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            b1.t tVar = m8.f9948b;
            if (i12 < size) {
                C0620e c0620e = (C0620e) listG0.get(i12);
                b1.t tVarA = tVar.a((b1.t) c0620e.f9964a);
                int i14 = c0620e.f9965b;
                int i15 = c0620e.f9966c;
                if (i14 > i15) {
                    AbstractC0996a.a("Reversed range is not supported");
                }
                while (i13 < i14 && !kVar.isEmpty()) {
                    int i16 = i10;
                    C0620e c0620e2 = (C0620e) kVar.last();
                    int i17 = c0620e2.f9966c;
                    List list2 = listG0;
                    Object obj = c0620e2.f9964a;
                    if (i14 < i17) {
                        arrayList3.add(new C0620e(i13, i14, obj));
                        listG0 = list2;
                        i13 = i14;
                        i10 = i16;
                    } else {
                        Z4.v vVar2 = vVar;
                        arrayList3.add(new C0620e(i13, i17, obj));
                        while (true) {
                            boolean zIsEmpty = kVar.isEmpty();
                            i13 = c0620e2.f9966c;
                            if (zIsEmpty || i13 != ((C0620e) kVar.last()).f9966c) {
                                break;
                            } else {
                                kVar.removeLast();
                            }
                        }
                        listG0 = list2;
                        i10 = i16;
                        vVar = vVar2;
                    }
                }
                int i18 = i10;
                List list3 = listG0;
                Z4.v vVar3 = vVar;
                if (i13 < i14) {
                    arrayList3.add(new C0620e(i13, i14, tVar));
                    i13 = i14;
                }
                C0620e c0620e3 = (C0620e) kVar.o();
                if (c0620e3 != null) {
                    int i19 = c0620e3.f9966c;
                    Object obj2 = c0620e3.f9964a;
                    int i20 = c0620e3.f9965b;
                    if (i20 == i14 && i19 == i15) {
                        kVar.removeLast();
                        kVar.addLast(new C0620e(i14, i15, ((b1.t) obj2).a(tVarA)));
                    } else if (i20 == i19) {
                        arrayList3.add(new C0620e(i20, i19, obj2));
                        kVar.removeLast();
                        kVar.addLast(new C0620e(i14, i15, tVarA));
                    } else if (i19 >= i15) {
                        kVar.addLast(new C0620e(i14, i15, ((b1.t) obj2).a(tVarA)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    kVar.addLast(new C0620e(i14, i15, tVarA));
                }
                i12++;
                listG0 = list3;
                i10 = i18;
                vVar = vVar3;
            } else {
                Z4.v vVar4 = vVar;
                while (true) {
                    str = c0622g2.f9970p;
                    if (i13 > str.length() || kVar.isEmpty()) {
                        break;
                    }
                    C0620e c0620e4 = (C0620e) kVar.last();
                    Object obj3 = c0620e4.f9964a;
                    int i21 = c0620e4.f9966c;
                    arrayList3.add(new C0620e(i13, i21, obj3));
                    while (!kVar.isEmpty() && i21 == ((C0620e) kVar.last()).f9966c) {
                        kVar.removeLast();
                    }
                    i13 = i21;
                }
                if (i13 < str.length()) {
                    arrayList3.add(new C0620e(i13, str.length(), tVar));
                }
                if (arrayList3.isEmpty()) {
                    i7 = 0;
                    arrayList3.add(new C0620e(0, 0, tVar));
                } else {
                    i7 = 0;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i22 = i7;
                while (i22 < size2) {
                    C0620e c0620e5 = (C0620e) arrayList3.get(i22);
                    int i23 = c0620e5.f9965b;
                    int i24 = c0620e5.f9966c;
                    if (i23 != i24) {
                        strSubstring = str.substring(i23, i24);
                        AbstractC1209k.e(strSubstring, "substring(...)");
                    } else {
                        strSubstring = "";
                    }
                    List listA = AbstractC0623h.a(c0622g2, i23, i24, new C0469c0(3));
                    C0622g c0622g4 = new C0622g(strSubstring, listA == null ? vVar4 : listA);
                    b1.t tVar2 = (b1.t) c0620e5.f9964a;
                    if (tVar2.f10007b == Integer.MIN_VALUE) {
                        i8 = size2;
                        arrayList = arrayList3;
                        tVar2 = new b1.t(tVar2.f10006a, tVar.f10007b, tVar2.f10008c, tVar2.f10009d, tVar2.f10010e, tVar2.f10011f, tVar2.f10012g, tVar2.h, tVar2.f10013i);
                    } else {
                        i8 = size2;
                        arrayList = arrayList3;
                    }
                    M m9 = new M(m8.f9947a, tVar.a(tVar2));
                    List list4 = c0622g4.f9969o;
                    List list5 = list4 == null ? vVar4 : list4;
                    List list6 = (List) this.f2442q;
                    ArrayList arrayList5 = new ArrayList(list6.size());
                    int size3 = list6.size();
                    int i25 = 0;
                    while (true) {
                        i9 = c0620e5.f9965b;
                        if (i25 < size3) {
                            C0620e c0620e6 = (C0620e) list6.get(i25);
                            String str2 = str;
                            int i26 = c0620e6.f9965b;
                            List list7 = list6;
                            int i27 = c0620e6.f9966c;
                            if (AbstractC0623h.b(i9, i24, i26, i27)) {
                                int i28 = c0620e6.f9965b;
                                if (i9 > i28 || i27 > i24) {
                                    AbstractC0996a.a("placeholder can not overlap with paragraph.");
                                }
                                arrayList5.add(new C0620e(i28 - i9, i27 - i9, c0620e6.f9964a));
                            }
                            i25++;
                            list6 = list7;
                            str = str2;
                        }
                    }
                    arrayList4.add(new b1.r(new j1.c(strSubstring, m9, list5, arrayList5, dVar2, dVar), i9, i24));
                    i22++;
                    c0622g2 = c0622g;
                    m8 = m7;
                    arrayList3 = arrayList;
                    str = str;
                    size2 = i8;
                }
                this.f2445t = arrayList4;
                return;
            }
        }
    }

    public t(C0853b c0853b) {
        this.f2440o = 3;
        this.f2441p = Z4.n.L0(c0853b.f11563a);
        this.f2442q = Z4.n.L0(c0853b.f11564b);
        this.f2443r = Z4.n.L0(c0853b.f11565c);
        this.f2444s = Z4.n.L0(c0853b.f11566d);
        this.f2445t = Z4.n.L0(c0853b.f11567e);
    }

    public t(AbstractServiceC1940y abstractServiceC1940y) {
        this.f2440o = 6;
        this.f2445t = abstractServiceC1940y;
        this.f2440o = 6;
        this.f2444s = abstractServiceC1940y;
        this.f2441p = new ArrayList();
    }
}
