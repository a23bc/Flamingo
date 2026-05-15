package D4;

import A2.RunnableC0022x;
import A2.d0;
import A2.j0;
import E4.J;
import E4.K;
import E4.M;
import E4.g0;
import G1.I;
import H.C0167i;
import H.E;
import H.r;
import H2.A;
import H2.C;
import H2.C0205w;
import H2.D;
import I4.s;
import N2.AbstractC0285b;
import N2.C0293j;
import N2.InterfaceC0291h;
import N2.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;
import f0.C0888g0;
import j.AbstractC1089a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import m5.AbstractC1209k;
import q.AbstractC1322k0;
import q.C1336s;
import q.S0;
import t.C1443E;
import w.C1670c;
import w2.m;
import w2.t;
import w3.A0;
import w3.C1747r0;
import w3.K0;
import w3.RunnableC1736l0;

/* JADX INFO: loaded from: classes.dex */
public class i implements InterfaceC0291h, s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1581o;

    /* JADX INFO: renamed from: p */
    public int f1582p;

    /* JADX INFO: renamed from: q */
    public Object f1583q;

    /* JADX INFO: renamed from: r */
    public Object f1584r;

    public /* synthetic */ i(int i7, byte b7) {
        this.f1581o = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x01e7, code lost:
    
        if (r11.size() <= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01e9, code lost:
    
        r0 = new R0.C0387i0(r11, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01ef, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01f0, code lost:
    
        if (r0 == null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01f4, code lost:
    
        if (r20 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01f6, code lost:
    
        r0 = new R0.C0387i0(r7, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01fc, code lost:
    
        r0 = new R0.C0387i0(r7, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0202, code lost:
    
        if (r9 == 1) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0205, code lost:
    
        if (r9 == 2) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0209, code lost:
    
        if (r8 == 1) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x020b, code lost:
    
        if (r8 == 2) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x020d, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0212, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0215, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0218, code lost:
    
        r13 = new android.graphics.LinearGradient(r25, r26, r16, r17, r0.f6465a, r0.f6466b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0228, code lost:
    
        r13 = new android.graphics.SweepGradient(r10, r2, r0.f6465a, r0.f6466b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0236, code lost:
    
        if (r24 <= 0.0f) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x023c, code lost:
    
        if (r8 == 1) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x023e, code lost:
    
        if (r8 == 2) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0240, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0243, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0246, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0248, code lost:
    
        r13 = new android.graphics.RadialGradient(r10, r2, r24, r0.f6465a, r0.f6466b, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0266, code lost:
    
        return new D4.i(r13, (java.lang.Object) null, 0, 17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x026e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D4.i e(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.i.e(android.content.res.Resources, int, android.content.res.Resources$Theme):D4.i");
    }

    private final /* synthetic */ void y() {
    }

    public List A(CharSequence charSequence) {
        charSequence.getClass();
        A.b bVar = (A.b) this.f1584r;
        bVar.getClass();
        h hVar = new h(bVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void B(int i7, l5.g gVar) {
        int i8 = i7 & 67108863;
        long[] jArr = (long[]) this.f1583q;
        int i9 = this.f1582p;
        for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
            if ((((int) jArr[i10 + 2]) & 67108863) == i8) {
                long j3 = jArr[i10];
                long j7 = jArr[i10 + 1];
                gVar.h(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j7 >> 32)), Integer.valueOf((int) j7));
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00aa  */
    @Override // N2.InterfaceC0291h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N2.C0290g a(N2.C0293j r23, long r24) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.i.a(N2.j, long):N2.g");
    }

    public void b(int i7, r rVar) {
        if (i7 < 0) {
            C.b.a("size should be >=0");
        }
        if (i7 == 0) {
            return;
        }
        C0167i c0167i = new C0167i(this.f1582p, i7, rVar);
        this.f1582p += i7;
        ((h0.e) this.f1583q).b(c0167i);
    }

    public void c() {
        F5.h hVar;
        ImageView imageView = (ImageView) this.f1583q;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1322k0.a(drawable);
        }
        if (drawable == null || (hVar = (F5.h) this.f1584r) == null) {
            return;
        }
        C1336s.d(drawable, hVar, imageView.getDrawableState());
    }

    public K d() {
        g0 g0Var;
        J j3 = (J) this.f1584r;
        if (j3 != null) {
            throw j3.a();
        }
        int i7 = this.f1582p;
        Object[] objArrCopyOf = (Object[]) this.f1583q;
        if (i7 == 0) {
            g0Var = g0.f1938u;
        } else if (i7 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            g0Var = new g0(1, null, objArrCopyOf);
        } else {
            N5.d.s(i7, objArrCopyOf.length >> 1);
            Object objG = g0.g(objArrCopyOf, i7, M.n(i7), 0);
            if (objG instanceof Object[]) {
                Object[] objArr = (Object[]) objG;
                this.f1584r = (J) objArr[2];
                Object obj = objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                objG = obj;
                i7 = iIntValue;
            }
            g0Var = new g0(i7, objG, objArrCopyOf);
        }
        J j7 = (J) this.f1584r;
        if (j7 == null) {
            return g0Var;
        }
        throw j7.a();
    }

    @Override // I4.s
    public void g(Object obj) {
        List list = (List) obj;
        A0 a0 = ((K0) this.f1584r).f19002g;
        Handler handler = a0.l;
        C1747r0 c1747r0 = (C1747r0) this.f1583q;
        t.G(handler, new RunnableC0022x(a0, c1747r0, new RunnableC1736l0(this.f1582p, 1, this, list, c1747r0)));
    }

    public void h(C0205w c0205w) {
        for (D d4 : (CopyOnWriteArrayList) this.f1584r) {
            t.G(d4.f2983a, new d0(this, d4.f2984b, c0205w, 4));
        }
    }

    public long i(C0293j c0293j) throws EOFException, InterruptedIOException {
        long j3;
        q qVar;
        N2.s sVar;
        long j7;
        boolean zB;
        int iQ;
        while (true) {
            long j8 = c0293j.j();
            j3 = c0293j.f5053q;
            long j9 = j3 - 6;
            qVar = (q) this.f1584r;
            sVar = (N2.s) this.f1583q;
            if (j8 >= j9) {
                j7 = 6;
                break;
            }
            long j10 = c0293j.j();
            byte[] bArr = new byte[2];
            c0293j.i(bArr, 0, 2, false);
            int i7 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i8 = this.f1582p;
            if (i7 != i8) {
                c0293j.f5056t = 0;
                c0293j.k((int) (j10 - c0293j.f5054r), false);
                j7 = 6;
                zB = false;
            } else {
                j7 = 6;
                m mVar = new m(16);
                System.arraycopy(bArr, 0, mVar.f18867a, 0, 2);
                byte[] bArr2 = mVar.f18867a;
                int i9 = 0;
                for (int i10 = 2; i9 < 14 && (iQ = c0293j.q(bArr2, i10 + i9, 14 - i9)) != -1; i10 = 2) {
                    i9 += iQ;
                }
                mVar.F(i9);
                c0293j.f5056t = 0;
                c0293j.k((int) (j10 - c0293j.f5054r), false);
                zB = AbstractC0285b.b(mVar, sVar, i8, qVar);
            }
            if (zB) {
                break;
            }
            c0293j.k(1, false);
        }
        if (c0293j.j() < j3 - j7) {
            return qVar.f5067a;
        }
        c0293j.k((int) (j3 - c0293j.j()), false);
        return sVar.f5079j;
    }

    public C0167i j(int i7) {
        if (i7 < 0 || i7 >= this.f1582p) {
            StringBuilder sbV = n1.c.v(i7, "Index ", ", size ");
            sbV.append(this.f1582p);
            C.b.e(sbV.toString());
        }
        C0167i c0167i = (C0167i) this.f1584r;
        if (c0167i != null) {
            int i8 = c0167i.f2880a;
            if (i7 < c0167i.f2881b + i8 && i8 <= i7) {
                return c0167i;
            }
        }
        h0.e eVar = (h0.e) this.f1583q;
        C0167i c0167i2 = (C0167i) eVar.f12546o[E.g(i7, eVar)];
        this.f1584r = c0167i2;
        return c0167i2;
    }

    public Object k(int i7) {
        SparseArray sparseArray;
        if (this.f1582p == -1) {
            this.f1582p = 0;
        }
        while (true) {
            int i8 = this.f1582p;
            sparseArray = (SparseArray) this.f1583q;
            if (i8 <= 0 || i7 >= sparseArray.keyAt(i8)) {
                break;
            }
            this.f1582p--;
        }
        while (this.f1582p < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f1582p + 1)) {
            this.f1582p++;
        }
        return sparseArray.valueAt(this.f1582p);
    }

    public int l(Object obj) {
        C1443E c1443e = (C1443E) this.f1583q;
        int iD = c1443e.d(obj);
        if (iD >= 0) {
            return c1443e.f15979c[iD];
        }
        return -1;
    }

    @Override // N2.InterfaceC0291h
    public void m() {
        switch (this.f1581o) {
            case 7:
                break;
            default:
                byte[] bArr = t.f18886f;
                m mVar = (m) this.f1584r;
                mVar.getClass();
                mVar.E(bArr.length, bArr);
                break;
        }
    }

    public Object n(int i7) {
        int i8 = i7 - this.f1582p;
        if (i8 < 0) {
            return null;
        }
        Object[] objArr = (Object[]) this.f1584r;
        if (i8 < objArr.length) {
            return objArr[i8];
        }
        return null;
    }

    public float o() {
        return 1.0f - p();
    }

    public float p() {
        if (((C0888g0) this.f1583q).h() == 0) {
            return 0.0f;
        }
        return i6.h.p(Math.abs(((Number) ((C1670c) this.f1584r).e()).floatValue() / r0.h()), 0.0f, 1.0f);
    }

    public int q() {
        int i7 = this.f1582p;
        if (i7 != 2) {
            return i7 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void r(int i7, int i8, int i9, int i10, int i11, int i12, boolean z6, boolean z7) {
        long[] jArr = (long[]) this.f1583q;
        int i13 = this.f1582p;
        int i14 = i13 + 3;
        this.f1582p = i14;
        int length = jArr.length;
        if (length <= i14) {
            int iMax = Math.max(length * 2, i14);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC1209k.e(jArrCopyOf, "copyOf(...)");
            this.f1583q = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f1584r, iMax);
            AbstractC1209k.e(jArrCopyOf2, "copyOf(...)");
            this.f1584r = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f1583q;
        jArr2[i13] = (((long) i8) << 32) | (((long) i9) & 4294967295L);
        jArr2[i13 + 1] = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        int i15 = i12 & 67108863;
        jArr2[i13 + 2] = ((z7 ? 1L : 0L) << 63) | ((z6 ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i15) << 26) | ((long) (i7 & 67108863));
        if (i12 < 0) {
            return;
        }
        for (int i16 = i13 - 3; i16 >= 0; i16 -= 3) {
            int i17 = i16 + 2;
            long j3 = jArr2[i17];
            if ((((int) j3) & 67108863) == i15) {
                jArr2[i17] = (j3 & (-2301339409586323457L)) | (((long) ((i13 - i16) & 511)) << 52);
                return;
            }
        }
    }

    public boolean s() {
        ColorStateList colorStateList;
        return ((Shader) this.f1583q) == null && (colorStateList = (ColorStateList) this.f1584r) != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [H2.E, java.lang.Object] */
    public void t(H2.r rVar, C0205w c0205w) {
        for (D d4 : (CopyOnWriteArrayList) this.f1584r) {
            H2.r rVar2 = rVar;
            t.G(d4.f2983a, new C(this, d4.f2984b, rVar2, c0205w, 2));
            rVar = rVar2;
        }
    }

    public String toString() {
        switch (this.f1581o) {
            case 6:
                StringBuilder sb = new StringBuilder();
                if (((F5.s) this.f1583q) == F5.s.f2432p) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1582p);
                sb.append(' ');
                sb.append((String) this.f1584r);
                String string = sb.toString();
                AbstractC1209k.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [H2.E, java.lang.Object] */
    public void u(H2.r rVar, C0205w c0205w) {
        for (D d4 : (CopyOnWriteArrayList) this.f1584r) {
            H2.r rVar2 = rVar;
            t.G(d4.f2983a, new C(this, d4.f2984b, rVar2, c0205w, 1));
            rVar = rVar2;
        }
    }

    public void v(H2.r rVar, C0205w c0205w, IOException iOException, boolean z6) {
        for (D d4 : (CopyOnWriteArrayList) this.f1584r) {
            H2.r rVar2 = rVar;
            t.G(d4.f2983a, new j0(this, d4.f2984b, rVar2, c0205w, iOException, z6, 1));
            rVar = rVar2;
        }
    }

    public void w(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1583q;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1089a.f13599f;
        S0 s0K = S0.k(context, attributeSet, iArr, i7);
        I.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) s0K.f15226q, i7);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) s0K.f15226q;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = i6.g.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1322k0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(s0K.f(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1322k0.b(typedArray.getInt(3, -1), null));
            }
            s0K.l();
        } catch (Throwable th) {
            s0K.l();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [H2.E, java.lang.Object] */
    public void x(H2.r rVar, C0205w c0205w) {
        for (D d4 : (CopyOnWriteArrayList) this.f1584r) {
            H2.r rVar2 = rVar;
            t.G(d4.f2983a, new C(this, d4.f2984b, rVar2, c0205w, 0));
            rVar = rVar2;
        }
    }

    public i z(Object obj, Object obj2) {
        int i7 = (this.f1582p + 1) * 2;
        Object[] objArr = (Object[]) this.f1583q;
        if (i7 > objArr.length) {
            this.f1583q = Arrays.copyOf(objArr, E4.C.d(objArr.length, i7));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f1583q;
        int i8 = this.f1582p;
        int i9 = i8 * 2;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f1582p = i8 + 1;
        return this;
    }

    public /* synthetic */ i(Object obj, int i7, Serializable serializable, int i8) {
        this.f1581o = i8;
        this.f1583q = obj;
        this.f1582p = i7;
        this.f1584r = serializable;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i7, int i8) {
        this.f1581o = i8;
        this.f1583q = obj;
        this.f1584r = obj2;
        this.f1582p = i7;
    }

    public i(ImageView imageView) {
        this.f1581o = 13;
        this.f1582p = 0;
        this.f1583q = imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[LOOP:1: B:68:0x00c3->B:74:0x00e5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(r5.C1423d r13, H.E r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.i.<init>(r5.d, H.E):void");
    }

    @Override // I4.s
    public void f(Throwable th) {
    }

    public i(B2.g gVar) {
        this.f1581o = 5;
        this.f1583q = new SparseArray();
        this.f1584r = gVar;
        this.f1582p = -1;
    }

    public i(N2.s sVar, int i7) {
        this.f1581o = 7;
        this.f1583q = sVar;
        this.f1582p = i7;
        this.f1584r = new q();
    }

    public i(int i7, w2.r rVar) {
        this.f1581o = 14;
        this.f1582p = i7;
        this.f1583q = rVar;
        this.f1584r = new m();
    }

    public i() {
        this.f1581o = 2;
        this.f1583q = new h0.e(new C0167i[16]);
    }

    public i(A.b bVar) {
        this.f1581o = 0;
        this.f1584r = bVar;
        this.f1583q = c.f1566o;
        this.f1582p = Integer.MAX_VALUE;
    }

    public i(int i7, String str, int i8, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f1581o = 15;
        this.f1582p = i8;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f1583q = listUnmodifiableList;
        this.f1584r = bArr;
    }

    public i(CopyOnWriteArrayList copyOnWriteArrayList, int i7, A a4) {
        this.f1581o = 4;
        this.f1584r = copyOnWriteArrayList;
        this.f1582p = i7;
        this.f1583q = a4;
    }

    public i(R0.S0 s02) {
        this.f1581o = 9;
        this.f1583q = s02;
    }

    public i(int i7) {
        this.f1581o = 1;
        this.f1583q = new Object[i7 * 2];
        this.f1582p = 0;
    }

    public i(K0 k02, C1747r0 c1747r0, int i7) {
        this.f1581o = 16;
        this.f1584r = k02;
        this.f1583q = c1747r0;
        this.f1582p = i7;
    }
}
