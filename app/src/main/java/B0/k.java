package B0;

import H.P;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import y0.AbstractC1959I;
import y0.AbstractC1970c;
import y0.C1969b;
import y0.C1980m;
import y0.C1986s;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class k implements f {

    /* JADX INFO: renamed from: A */
    public static final j f684A = new j();

    /* JADX INFO: renamed from: b */
    public final C0.a f685b;

    /* JADX INFO: renamed from: c */
    public final C1986s f686c;

    /* JADX INFO: renamed from: d */
    public final q f687d;

    /* JADX INFO: renamed from: e */
    public final Resources f688e;

    /* JADX INFO: renamed from: f */
    public final Rect f689f;

    /* JADX INFO: renamed from: g */
    public Paint f690g;
    public int h;

    /* JADX INFO: renamed from: i */
    public int f691i;

    /* JADX INFO: renamed from: j */
    public long f692j;

    /* JADX INFO: renamed from: k */
    public boolean f693k;
    public boolean l;

    /* JADX INFO: renamed from: m */
    public boolean f694m;

    /* JADX INFO: renamed from: n */
    public int f695n;

    /* JADX INFO: renamed from: o */
    public int f696o;

    /* JADX INFO: renamed from: p */
    public float f697p;

    /* JADX INFO: renamed from: q */
    public boolean f698q;

    /* JADX INFO: renamed from: r */
    public float f699r;

    /* JADX INFO: renamed from: s */
    public float f700s;

    /* JADX INFO: renamed from: t */
    public float f701t;

    /* JADX INFO: renamed from: u */
    public float f702u;

    /* JADX INFO: renamed from: v */
    public float f703v;

    /* JADX INFO: renamed from: w */
    public long f704w;

    /* JADX INFO: renamed from: x */
    public long f705x;

    /* JADX INFO: renamed from: y */
    public float f706y;

    /* JADX INFO: renamed from: z */
    public P f707z;

    public k(C0.a aVar) {
        C1986s c1986s = new C1986s();
        A0.c cVar = new A0.c();
        this.f685b = aVar;
        this.f686c = c1986s;
        q qVar = new q(aVar, c1986s, cVar);
        this.f687d = qVar;
        this.f688e = aVar.getResources();
        this.f689f = new Rect();
        aVar.addView(qVar);
        qVar.setClipBounds(null);
        this.f692j = 0L;
        View.generateViewId();
        this.f695n = 3;
        this.f696o = 0;
        this.f697p = 1.0f;
        this.f699r = 1.0f;
        this.f700s = 1.0f;
        long j3 = C1987t.f20255b;
        this.f704w = j3;
        this.f705x = j3;
    }

    @Override // B0.f
    public final void A(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f705x = j3;
            this.f687d.setOutlineSpotShadowColor(AbstractC1959I.x(j3));
        }
    }

    @Override // B0.f
    public final void B(float f7) {
        this.f700s = f7;
        this.f687d.setScaleY(f7);
    }

    @Override // B0.f
    public final void C(P p7) {
        this.f707z = p7;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f687d.setRenderEffect(p7 != null ? p7.P0() : null);
        }
    }

    @Override // B0.f
    public final Matrix D() {
        return this.f687d.getMatrix();
    }

    @Override // B0.f
    public final void E(InterfaceC1985r interfaceC1985r) {
        Rect rect;
        boolean z6 = this.f693k;
        q qVar = this.f687d;
        if (z6) {
            if ((this.f694m || qVar.getClipToOutline()) && !this.l) {
                rect = this.f689f;
                rect.left = 0;
                rect.top = 0;
                rect.right = qVar.getWidth();
                rect.bottom = qVar.getHeight();
            } else {
                rect = null;
            }
            qVar.setClipBounds(rect);
        }
        if (AbstractC1970c.a(interfaceC1985r).isHardwareAccelerated()) {
            this.f685b.a(interfaceC1985r, qVar, qVar.getDrawingTime());
        }
    }

    @Override // B0.f
    public final void F(int i7, int i8, long j3) {
        boolean zB = n1.m.b(this.f692j, j3);
        q qVar = this.f687d;
        if (zB) {
            int i9 = this.h;
            if (i9 != i7) {
                qVar.offsetLeftAndRight(i7 - i9);
            }
            int i10 = this.f691i;
            if (i10 != i8) {
                qVar.offsetTopAndBottom(i8 - i10);
            }
        } else {
            if (this.f694m || qVar.getClipToOutline()) {
                this.f693k = true;
            }
            int i11 = (int) (j3 >> 32);
            int i12 = (int) (4294967295L & j3);
            qVar.layout(i7, i8, i7 + i11, i8 + i12);
            this.f692j = j3;
            if (this.f698q) {
                qVar.setPivotX(i11 / 2.0f);
                qVar.setPivotY(i12 / 2.0f);
            }
        }
        this.h = i7;
        this.f691i = i8;
    }

    @Override // B0.f
    public final float G() {
        return 0.0f;
    }

    @Override // B0.f
    public final void H(float f7) {
        this.f687d.setCameraDistance(f7 * this.f688e.getDisplayMetrics().densityDpi);
    }

    @Override // B0.f
    public final float I() {
        return this.f703v;
    }

    @Override // B0.f
    public final /* synthetic */ boolean J() {
        return true;
    }

    @Override // B0.f
    public final float K() {
        return this.f700s;
    }

    @Override // B0.f
    public final float L() {
        return this.f706y;
    }

    @Override // B0.f
    public final int M() {
        return this.f695n;
    }

    @Override // B0.f
    public final void N(long j3) {
        long j7 = 9223372034707292159L & j3;
        q qVar = this.f687d;
        if (j7 != 9205357640488583168L) {
            this.f698q = false;
            qVar.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            qVar.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                qVar.resetPivot();
                return;
            }
            this.f698q = true;
            qVar.setPivotX(((int) (this.f692j >> 32)) / 2.0f);
            qVar.setPivotY(((int) (4294967295L & this.f692j)) / 2.0f);
        }
    }

    @Override // B0.f
    public final long O() {
        return this.f704w;
    }

    public final void P(int i7) {
        q qVar = this.f687d;
        boolean z6 = true;
        if (i7 == 1) {
            qVar.setLayerType(2, this.f690g);
        } else if (i7 == 2) {
            qVar.setLayerType(0, this.f690g);
            z6 = false;
        } else {
            qVar.setLayerType(0, this.f690g);
        }
        qVar.setCanUseCompositingLayer$ui_graphics_release(z6);
    }

    public final void Q() {
        int i7 = this.f696o;
        if (i7 != 1 && this.f695n == 3) {
            P(i7);
        } else {
            P(1);
        }
    }

    @Override // B0.f
    public final float a() {
        return this.f697p;
    }

    @Override // B0.f
    public final void b() {
        this.f687d.setRotationX(0.0f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // B0.f
    public final void c(n1.d dVar, n1.n nVar, d dVar2, b bVar) {
        q qVar = this.f687d;
        ViewParent parent = qVar.getParent();
        C0.a aVar = this.f685b;
        if (parent == null) {
            aVar.addView(qVar);
        }
        qVar.f716u = dVar;
        qVar.f717v = nVar;
        qVar.f718w = bVar;
        qVar.f719x = dVar2;
        if (qVar.isAttachedToWindow()) {
            qVar.setVisibility(4);
            qVar.setVisibility(0);
            try {
                C1986s c1986s = this.f686c;
                j jVar = f684A;
                C1969b c1969b = c1986s.f20254a;
                Canvas canvas = c1969b.f20227a;
                c1969b.f20227a = jVar;
                aVar.a(c1969b, qVar, qVar.getDrawingTime());
                c1986s.f20254a.f20227a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // B0.f
    public final void d(float f7) {
        this.f697p = f7;
        this.f687d.setAlpha(f7);
    }

    @Override // B0.f
    public final float e() {
        return this.f699r;
    }

    @Override // B0.f
    public final void f(float f7) {
        this.f703v = f7;
        this.f687d.setElevation(f7);
    }

    @Override // B0.f
    public final float g() {
        return this.f702u;
    }

    @Override // B0.f
    public final P h() {
        return this.f707z;
    }

    @Override // B0.f
    public final void i(float f7) {
        this.f706y = f7;
        this.f687d.setRotation(f7);
    }

    @Override // B0.f
    public final void j() {
        this.f687d.setRotationY(0.0f);
    }

    @Override // B0.f
    public final void k(float f7) {
        this.f702u = f7;
        this.f687d.setTranslationY(f7);
    }

    @Override // B0.f
    public final long l() {
        return this.f705x;
    }

    @Override // B0.f
    public final void m(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f704w = j3;
            this.f687d.setOutlineAmbientShadowColor(AbstractC1959I.x(j3));
        }
    }

    @Override // B0.f
    public final void n(Outline outline, long j3) {
        q qVar = this.f687d;
        qVar.f714s = outline;
        qVar.invalidateOutline();
        if ((this.f694m || qVar.getClipToOutline()) && outline != null) {
            qVar.setClipToOutline(true);
            if (this.f694m) {
                this.f694m = false;
                this.f693k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // B0.f
    public final void o() {
        Paint paint = this.f690g;
        if (paint == null) {
            paint = new Paint();
            this.f690g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }

    @Override // B0.f
    public final void p(float f7) {
        this.f699r = f7;
        this.f687d.setScaleX(f7);
    }

    @Override // B0.f
    public final void q(int i7) {
        this.f695n = i7;
        Paint paint = this.f690g;
        if (paint == null) {
            paint = new Paint();
            this.f690g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC1959I.B(i7)));
        Q();
    }

    @Override // B0.f
    public final float r() {
        return this.f687d.getCameraDistance() / this.f688e.getDisplayMetrics().densityDpi;
    }

    @Override // B0.f
    public final void s() {
        this.f685b.removeViewInLayout(this.f687d);
    }

    @Override // B0.f
    public final float t() {
        return this.f701t;
    }

    @Override // B0.f
    public final void u(boolean z6) {
        boolean z7 = false;
        this.f694m = z6 && !this.l;
        this.f693k = true;
        if (z6 && this.l) {
            z7 = true;
        }
        this.f687d.setClipToOutline(z7);
    }

    @Override // B0.f
    public final int v() {
        return this.f696o;
    }

    @Override // B0.f
    public final float w() {
        return 0.0f;
    }

    @Override // B0.f
    public final C1980m x() {
        return null;
    }

    @Override // B0.f
    public final void y(int i7) {
        this.f696o = i7;
        Q();
    }

    @Override // B0.f
    public final void z(float f7) {
        this.f701t = f7;
        this.f687d.setTranslationX(f7);
    }
}
