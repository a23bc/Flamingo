package f4;

import O0.C0318o;
import O0.InterfaceC0319p;
import Q0.N;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e4.C0862k;
import f0.C0;
import f0.C0879c;
import f0.C0886f0;
import f0.C0894j0;
import l5.InterfaceC1182c;
import w5.AbstractC1767D;
import w5.M;
import w5.y0;
import x0.C1895e;
import y0.C1973f;
import y0.C1980m;
import y4.C2022a;
import z5.J;
import z5.z;

/* JADX INFO: loaded from: classes.dex */
public final class p extends D0.b implements C0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public InterfaceC0319p f12204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12205B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0894j0 f12207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0894j0 f12208E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0894j0 f12209F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B5.d f12210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J f12211t = z.b(new C1895e(0));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0894j0 f12212u = C0879c.t(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0886f0 f12213v = new C0886f0(1.0f);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0894j0 f12214w = C0879c.t(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f12215x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public D0.b f12216y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public InterfaceC1182c f12217z;

    public p(p4.h hVar, C0862k c0862k) {
        e eVar = e.f12186a;
        this.f12215x = eVar;
        this.f12217z = C0931b.f12176r;
        this.f12204A = C0318o.f5426b;
        this.f12205B = 1;
        this.f12207D = C0879c.t(eVar);
        this.f12208E = C0879c.t(hVar);
        this.f12209F = C0879c.t(c0862k);
    }

    @Override // f0.C0
    public final void a() {
        if (this.f12210s != null) {
            return;
        }
        y0 y0VarC = AbstractC1767D.c();
        D5.e eVar = M.f19497a;
        B5.d dVarA = AbstractC1767D.a(I0.c.L(y0VarC, B5.n.f912a.f20145t));
        this.f12210s = dVarA;
        Object obj = this.f12216y;
        C0 c02 = obj instanceof C0 ? (C0) obj : null;
        if (c02 != null) {
            c02.a();
        }
        if (!this.f12206C) {
            AbstractC1767D.t(dVarA, null, new l(this, null), 3);
            return;
        }
        p4.g gVarA = p4.h.a((p4.h) this.f12208E.getValue());
        gVarA.f15026b = ((C0862k) this.f12209F.getValue()).f11594a;
        gVarA.f15046x = null;
        p4.h hVarA = gVarA.a();
        hVarA.f15052F.getClass();
        Drawable drawableB = s4.d.b(hVarA, hVarA.f15048B);
        k(new g(drawableB != null ? j(drawableB) : null));
    }

    @Override // D0.b
    public final void b(float f7) {
        this.f12213v.j(f7);
    }

    @Override // D0.b
    public final void c(C1980m c1980m) {
        this.f12214w.setValue(c1980m);
    }

    @Override // f0.C0
    public final void e() {
        B5.d dVar = this.f12210s;
        if (dVar != null) {
            AbstractC1767D.f(dVar, null);
        }
        this.f12210s = null;
        Object obj = this.f12216y;
        C0 c02 = obj instanceof C0 ? (C0) obj : null;
        if (c02 != null) {
            c02.e();
        }
    }

    @Override // f0.C0
    public final void f() {
        B5.d dVar = this.f12210s;
        if (dVar != null) {
            AbstractC1767D.f(dVar, null);
        }
        this.f12210s = null;
        Object obj = this.f12216y;
        C0 c02 = obj instanceof C0 ? (C0) obj : null;
        if (c02 != null) {
            c02.f();
        }
    }

    @Override // D0.b
    public final long h() {
        D0.b bVar = (D0.b) this.f12212u.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // D0.b
    public final void i(N n7) {
        C1895e c1895e = new C1895e(n7.f());
        J j3 = this.f12211t;
        j3.getClass();
        j3.j(null, c1895e);
        D0.b bVar = (D0.b) this.f12212u.getValue();
        if (bVar != null) {
            bVar.g(n7, n7.f(), this.f12213v.h(), (C1980m) this.f12214w.getValue());
        }
    }

    public final D0.b j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new C2022a(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C1973f c1973f = new C1973f(bitmap);
        int i7 = this.f12205B;
        D0.a aVar = new D0.a(c1973f, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.f1443u = i7;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(f4.i r13) {
        /*
            r12 = this;
            f4.i r0 = r12.f12215x
            l5.c r1 = r12.f12217z
            java.lang.Object r13 = r1.b(r13)
            f4.i r13 = (f4.i) r13
            r12.f12215x = r13
            f0.j0 r1 = r12.f12207D
            r1.setValue(r13)
            boolean r1 = r13 instanceof f4.h
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r13
            f4.h r1 = (f4.h) r1
            p4.n r1 = r1.f12191b
            goto L25
        L1c:
            boolean r1 = r13 instanceof f4.f
            if (r1 == 0) goto L60
            r1 = r13
            f4.f r1 = (f4.f) r1
            p4.d r1 = r1.f12188b
        L25:
            p4.h r3 = r1.b()
            r4.e r3 = r3.f15060i
            f4.q r4 = f4.r.f12218a
            r4.f r3 = r3.a(r4, r1)
            boolean r4 = r3 instanceof r4.C1418b
            if (r4 == 0) goto L60
            D0.b r4 = r0.a()
            boolean r5 = r0 instanceof f4.g
            if (r5 == 0) goto L3f
            r7 = r4
            goto L40
        L3f:
            r7 = r2
        L40:
            D0.b r8 = r13.a()
            O0.p r9 = r12.f12204A
            r4.b r3 = (r4.C1418b) r3
            boolean r4 = r1 instanceof p4.n
            if (r4 == 0) goto L56
            p4.n r1 = (p4.n) r1
            boolean r1 = r1.f15098g
            if (r1 != 0) goto L53
            goto L56
        L53:
            r1 = 0
        L54:
            r11 = r1
            goto L58
        L56:
            r1 = 1
            goto L54
        L58:
            f4.v r6 = new f4.v
            int r10 = r3.f15775c
            r6.<init>(r7, r8, r9, r10, r11)
            goto L61
        L60:
            r6 = r2
        L61:
            if (r6 == 0) goto L64
            goto L68
        L64:
            D0.b r6 = r13.a()
        L68:
            r12.f12216y = r6
            f0.j0 r1 = r12.f12212u
            r1.setValue(r6)
            B5.d r1 = r12.f12210s
            if (r1 == 0) goto L9e
            D0.b r1 = r0.a()
            D0.b r3 = r13.a()
            if (r1 == r3) goto L9e
            D0.b r0 = r0.a()
            boolean r1 = r0 instanceof f0.C0
            if (r1 == 0) goto L88
            f0.C0 r0 = (f0.C0) r0
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8e
            r0.f()
        L8e:
            D0.b r13 = r13.a()
            boolean r0 = r13 instanceof f0.C0
            if (r0 == 0) goto L99
            r2 = r13
            f0.C0 r2 = (f0.C0) r2
        L99:
            if (r2 == 0) goto L9e
            r2.a()
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.p.k(f4.i):void");
    }
}
