package B0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import j5.AbstractC1107a;
import java.util.Locale;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import x0.C1892b;
import x0.C1893c;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1976i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public final f f615a;

    /* JADX INFO: renamed from: f */
    public Outline f620f;

    /* JADX INFO: renamed from: j */
    public float f623j;

    /* JADX INFO: renamed from: k */
    public AbstractC1959I f624k;
    public C1976i l;

    /* JADX INFO: renamed from: m */
    public C1976i f625m;

    /* JADX INFO: renamed from: n */
    public boolean f626n;

    /* JADX INFO: renamed from: o */
    public A0.c f627o;

    /* JADX INFO: renamed from: p */
    public w2.l f628p;

    /* JADX INFO: renamed from: q */
    public int f629q;

    /* JADX INFO: renamed from: s */
    public boolean f631s;

    /* JADX INFO: renamed from: t */
    public long f632t;

    /* JADX INFO: renamed from: u */
    public long f633u;

    /* JADX INFO: renamed from: v */
    public long f634v;

    /* JADX INFO: renamed from: w */
    public boolean f635w;

    /* JADX INFO: renamed from: x */
    public RectF f636x;

    /* JADX INFO: renamed from: b */
    public n1.d f616b = A0.d.f57a;

    /* JADX INFO: renamed from: c */
    public n1.n f617c = n1.n.f14521o;

    /* JADX INFO: renamed from: d */
    public AbstractC1210l f618d = c.f612q;

    /* JADX INFO: renamed from: e */
    public final b f619e = new b(0, this);

    /* JADX INFO: renamed from: g */
    public boolean f621g = true;
    public long h = 0;

    /* JADX INFO: renamed from: i */
    public long f622i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final a f630r = new a();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC1209k.e(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public d(f fVar) {
        this.f615a = fVar;
        fVar.u(false);
        this.f632t = 0L;
        this.f633u = 0L;
        this.f634v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f621g) {
            boolean z6 = this.f635w;
            f fVar = this.f615a;
            Outline outline2 = null;
            if (z6 || fVar.I() > 0.0f) {
                C1976i c1976i = this.l;
                if (c1976i != null) {
                    RectF rectF = this.f636x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f636x = rectF;
                    }
                    Path path = c1976i.f20241a;
                    path.computeBounds(rectF, false);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 > 28 || path.isConvex()) {
                        outline = this.f620f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f620f = outline;
                        }
                        if (i7 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f626n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f620f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f626n = true;
                        outline = null;
                    }
                    this.l = c1976i;
                    if (outline != null) {
                        outline.setAlpha(fVar.a());
                        outline2 = outline;
                    }
                    fVar.n(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f626n && this.f635w) {
                        fVar.u(false);
                        fVar.s();
                    } else {
                        fVar.u(this.f635w);
                    }
                } else {
                    fVar.u(this.f635w);
                    Outline outline4 = this.f620f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f620f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jE = AbstractC1107a.E(this.f633u);
                    long j3 = this.h;
                    long j7 = this.f622i;
                    long j8 = j7 == 9205357640488583168L ? jE : j7;
                    int i8 = (int) (j3 >> 32);
                    int i9 = (int) (j3 & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i8)), Math.round(Float.intBitsToFloat((int) (4294967295L & j8)) + Float.intBitsToFloat(i9)), this.f623j);
                    outline5.setAlpha(fVar.a());
                    fVar.n(outline5, AbstractC1107a.w(j8));
                }
            } else {
                fVar.u(false);
                fVar.n(null, 0L);
            }
        }
        this.f621g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f631s
            if (r0 == 0) goto L75
            int r0 = r15.f629q
            if (r0 != 0) goto L75
            B0.a r0 = r15.f630r
            java.lang.Object r1 = r0.f606b
            B0.d r1 = (B0.d) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f629q
            int r2 = r2 + (-1)
            r1.f629q = r2
            r1.b()
            r1 = 0
            r0.f606b = r1
        L1c:
            java.lang.Object r0 = r0.f608d
            t.K r0 = (t.K) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f16010b
            long[] r2 = r0.f16009a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            B0.d r11 = (B0.d) r11
            int r12 = r11.f629q
            int r12 = r12 + (-1)
            r11.f629q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            B0.f r0 = r15.f615a
            r0.s()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    /* JADX WARN: Type inference failed for: r3v4, types: [l5.c, m5.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(A0.f r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            B0.a r2 = r0.f630r
            java.lang.Object r3 = r2.f606b
            B0.d r3 = (B0.d) r3
            r2.f607c = r3
            java.lang.Object r3 = r2.f608d
            t.K r3 = (t.K) r3
            if (r3 == 0) goto L2c
            boolean r4 = r3.h()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r2.f609e
            t.K r4 = (t.K) r4
            if (r4 != 0) goto L26
            t.K r4 = t.S.f16033a
            t.K r4 = new t.K
            r4.<init>()
            r2.f609e = r4
        L26:
            r4.k(r3)
            r3.b()
        L2c:
            r2.f605a = r1
            m5.l r3 = r0.f618d
            r4 = r18
            r3.b(r4)
            r3 = 0
            r2.f605a = r3
            java.lang.Object r4 = r2.f607c
            B0.d r4 = (B0.d) r4
            if (r4 == 0) goto L47
            int r5 = r4.f629q
            int r5 = r5 + (-1)
            r4.f629q = r5
            r4.b()
        L47:
            java.lang.Object r2 = r2.f609e
            t.K r2 = (t.K) r2
            if (r2 == 0) goto L9e
            boolean r4 = r2.h()
            if (r4 == 0) goto L9e
            java.lang.Object[] r4 = r2.f16010b
            long[] r5 = r2.f16009a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L9b
            r7 = r3
        L5d:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L97
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L77:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L92
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            B0.d r13 = (B0.d) r13
            int r14 = r13.f629q
            int r14 = r14 + (-1)
            r13.f629q = r14
            r13.b()
        L92:
            long r8 = r8 >> r11
            int r12 = r12 + r1
            goto L77
        L95:
            if (r10 != r11) goto L9b
        L97:
            if (r7 == r6) goto L9b
            int r7 = r7 + r1
            goto L5d
        L9b:
            r2.b()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.d.c(A0.f):void");
    }

    public final AbstractC1959I d() {
        AbstractC1959I c1955e;
        AbstractC1959I abstractC1959I = this.f624k;
        C1976i c1976i = this.l;
        if (abstractC1959I != null) {
            return abstractC1959I;
        }
        if (c1976i != null) {
            C1954D c1954d = new C1954D(c1976i);
            this.f624k = c1954d;
            return c1954d;
        }
        long jE = AbstractC1107a.E(this.f633u);
        long j3 = this.h;
        long j7 = this.f622i;
        if (j7 != 9205357640488583168L) {
            jE = j7;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE & 4294967295L)) + fIntBitsToFloat2;
        float f7 = this.f623j;
        if (f7 > 0.0f) {
            c1955e = new C1956F(i6.g.i(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f7)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f7)))));
        } else {
            c1955e = new C1955E(new C1893c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f624k = c1955e;
        return c1955e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(n1.d dVar, n1.n nVar, long j3, InterfaceC1182c interfaceC1182c) {
        boolean zB = n1.m.b(this.f633u, j3);
        f fVar = this.f615a;
        if (!zB) {
            this.f633u = j3;
            long j7 = this.f632t;
            fVar.F((int) (j7 >> 32), (int) (j7 & 4294967295L), j3);
            if (this.f622i == 9205357640488583168L) {
                this.f621g = true;
                a();
            }
        }
        this.f616b = dVar;
        this.f617c = nVar;
        this.f618d = (AbstractC1210l) interfaceC1182c;
        fVar.c(dVar, nVar, this, this.f619e);
    }

    public final void f(float f7) {
        f fVar = this.f615a;
        if (fVar.a() == f7) {
            return;
        }
        fVar.d(f7);
    }

    public final void g(float f7, long j3, long j7) {
        if (C1892b.b(this.h, j3) && C1895e.a(this.f622i, j7) && this.f623j == f7 && this.l == null) {
            return;
        }
        this.f624k = null;
        this.l = null;
        this.f621g = true;
        this.f626n = false;
        this.h = j3;
        this.f622i = j7;
        this.f623j = f7;
        a();
    }
}
