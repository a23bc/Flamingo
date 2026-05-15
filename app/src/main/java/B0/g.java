package B0;

import H.P;
import R0.C0415x;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import j5.AbstractC1107a;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.AbstractC1970c;
import y0.C1969b;
import y0.C1980m;
import y0.C1986s;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: A */
    public static final AtomicBoolean f639A = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b */
    public final C1986s f640b;

    /* JADX INFO: renamed from: c */
    public final A0.c f641c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f642d;

    /* JADX INFO: renamed from: e */
    public long f643e;

    /* JADX INFO: renamed from: f */
    public Paint f644f;

    /* JADX INFO: renamed from: g */
    public Matrix f645g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public long f646i;

    /* JADX INFO: renamed from: j */
    public int f647j;

    /* JADX INFO: renamed from: k */
    public int f648k;
    public float l;

    /* JADX INFO: renamed from: m */
    public boolean f649m;

    /* JADX INFO: renamed from: n */
    public float f650n;

    /* JADX INFO: renamed from: o */
    public float f651o;

    /* JADX INFO: renamed from: p */
    public float f652p;

    /* JADX INFO: renamed from: q */
    public float f653q;

    /* JADX INFO: renamed from: r */
    public float f654r;

    /* JADX INFO: renamed from: s */
    public long f655s;

    /* JADX INFO: renamed from: t */
    public long f656t;

    /* JADX INFO: renamed from: u */
    public float f657u;

    /* JADX INFO: renamed from: v */
    public float f658v;

    /* JADX INFO: renamed from: w */
    public boolean f659w;

    /* JADX INFO: renamed from: x */
    public boolean f660x;

    /* JADX INFO: renamed from: y */
    public boolean f661y;

    /* JADX INFO: renamed from: z */
    public P f662z;

    public g(C0415x c0415x, C1986s c1986s, A0.c cVar) {
        this.f640b = c1986s;
        this.f641c = cVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", c0415x);
        this.f642d = renderNodeCreate;
        this.f643e = 0L;
        this.f646i = 0L;
        if (f639A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                o.c(renderNodeCreate, o.a(renderNodeCreate));
                o.d(renderNodeCreate, o.b(renderNodeCreate));
            }
            if (i7 >= 24) {
                n.a(renderNodeCreate);
            } else {
                m.a(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.f647j = 0;
        this.f648k = 3;
        this.l = 1.0f;
        this.f650n = 1.0f;
        this.f651o = 1.0f;
        long j3 = C1987t.f20255b;
        this.f655s = j3;
        this.f656t = j3;
        this.f658v = 8.0f;
    }

    @Override // B0.f
    public final void A(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f656t = j3;
            o.d(this.f642d, AbstractC1959I.x(j3));
        }
    }

    @Override // B0.f
    public final void B(float f7) {
        this.f651o = f7;
        this.f642d.setScaleY(f7);
    }

    @Override // B0.f
    public final void C(P p7) {
        this.f662z = p7;
    }

    @Override // B0.f
    public final Matrix D() {
        Matrix matrix = this.f645g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f645g = matrix;
        }
        this.f642d.getMatrix(matrix);
        return matrix;
    }

    @Override // B0.f
    public final void E(InterfaceC1985r interfaceC1985r) {
        DisplayListCanvas displayListCanvasA = AbstractC1970c.a(interfaceC1985r);
        AbstractC1209k.d(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f642d);
    }

    @Override // B0.f
    public final void F(int i7, int i8, long j3) {
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (4294967295L & j3);
        this.f642d.setLeftTopRightBottom(i7, i8, i7 + i9, i8 + i10);
        if (n1.m.b(this.f643e, j3)) {
            return;
        }
        if (this.f649m) {
            this.f642d.setPivotX(i9 / 2.0f);
            this.f642d.setPivotY(i10 / 2.0f);
        }
        this.f643e = j3;
    }

    @Override // B0.f
    public final float G() {
        return 0.0f;
    }

    @Override // B0.f
    public final void H(float f7) {
        this.f658v = f7;
        this.f642d.setCameraDistance(-f7);
    }

    @Override // B0.f
    public final float I() {
        return this.f654r;
    }

    @Override // B0.f
    public final boolean J() {
        return this.f642d.isValid();
    }

    @Override // B0.f
    public final float K() {
        return this.f651o;
    }

    @Override // B0.f
    public final float L() {
        return this.f657u;
    }

    @Override // B0.f
    public final int M() {
        return this.f648k;
    }

    @Override // B0.f
    public final void N(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f649m = true;
            this.f642d.setPivotX(((int) (this.f643e >> 32)) / 2.0f);
            this.f642d.setPivotY(((int) (4294967295L & this.f643e)) / 2.0f);
        } else {
            this.f649m = false;
            this.f642d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f642d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // B0.f
    public final long O() {
        return this.f655s;
    }

    public final void P() {
        boolean z6 = this.f659w;
        boolean z7 = false;
        boolean z8 = z6 && !this.h;
        if (z6 && this.h) {
            z7 = true;
        }
        if (z8 != this.f660x) {
            this.f660x = z8;
            this.f642d.setClipToBounds(z8);
        }
        if (z7 != this.f661y) {
            this.f661y = z7;
            this.f642d.setClipToOutline(z7);
        }
    }

    public final void Q(int i7) {
        RenderNode renderNode = this.f642d;
        if (i7 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f644f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f644f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f644f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i7 = this.f647j;
        if (i7 != 1 && this.f648k == 3) {
            Q(i7);
        } else {
            Q(1);
        }
    }

    @Override // B0.f
    public final float a() {
        return this.l;
    }

    @Override // B0.f
    public final void b() {
        this.f642d.setRotationX(0.0f);
    }

    @Override // B0.f
    public final void c(n1.d dVar, n1.n nVar, d dVar2, b bVar) {
        Canvas canvasStart = this.f642d.start(Math.max((int) (this.f643e >> 32), (int) (this.f646i >> 32)), Math.max((int) (this.f643e & 4294967295L), (int) (4294967295L & this.f646i)));
        try {
            C1969b c1969b = this.f640b.f20254a;
            Canvas canvas = c1969b.f20227a;
            c1969b.f20227a = canvasStart;
            A0.c cVar = this.f641c;
            A0.b bVar2 = cVar.f54p;
            long jE = AbstractC1107a.E(this.f643e);
            n1.d dVarU = bVar2.U();
            n1.n nVarV = bVar2.V();
            InterfaceC1985r interfaceC1985rS = bVar2.S();
            long jW = bVar2.W();
            d dVar3 = (d) bVar2.f51q;
            bVar2.n0(dVar);
            bVar2.o0(nVar);
            bVar2.m0(c1969b);
            bVar2.p0(jE);
            bVar2.f51q = dVar2;
            c1969b.l();
            try {
                bVar.b(cVar);
                c1969b.k();
                bVar2.n0(dVarU);
                bVar2.o0(nVarV);
                bVar2.m0(interfaceC1985rS);
                bVar2.p0(jW);
                bVar2.f51q = dVar3;
                c1969b.f20227a = canvas;
                this.f642d.end(canvasStart);
            } catch (Throwable th) {
                c1969b.k();
                bVar2.n0(dVarU);
                bVar2.o0(nVarV);
                bVar2.m0(interfaceC1985rS);
                bVar2.p0(jW);
                bVar2.f51q = dVar3;
                throw th;
            }
        } catch (Throwable th2) {
            this.f642d.end(canvasStart);
            throw th2;
        }
    }

    @Override // B0.f
    public final void d(float f7) {
        this.l = f7;
        this.f642d.setAlpha(f7);
    }

    @Override // B0.f
    public final float e() {
        return this.f650n;
    }

    @Override // B0.f
    public final void f(float f7) {
        this.f654r = f7;
        this.f642d.setElevation(f7);
    }

    @Override // B0.f
    public final float g() {
        return this.f653q;
    }

    @Override // B0.f
    public final P h() {
        return this.f662z;
    }

    @Override // B0.f
    public final void i(float f7) {
        this.f657u = f7;
        this.f642d.setRotation(f7);
    }

    @Override // B0.f
    public final void j() {
        this.f642d.setRotationY(0.0f);
    }

    @Override // B0.f
    public final void k(float f7) {
        this.f653q = f7;
        this.f642d.setTranslationY(f7);
    }

    @Override // B0.f
    public final long l() {
        return this.f656t;
    }

    @Override // B0.f
    public final void m(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f655s = j3;
            o.c(this.f642d, AbstractC1959I.x(j3));
        }
    }

    @Override // B0.f
    public final void n(Outline outline, long j3) {
        this.f646i = j3;
        this.f642d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // B0.f
    public final void o() {
        R();
    }

    @Override // B0.f
    public final void p(float f7) {
        this.f650n = f7;
        this.f642d.setScaleX(f7);
    }

    @Override // B0.f
    public final void q(int i7) {
        if (this.f648k == i7) {
            return;
        }
        this.f648k = i7;
        Paint paint = this.f644f;
        if (paint == null) {
            paint = new Paint();
            this.f644f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC1959I.B(i7)));
        R();
    }

    @Override // B0.f
    public final float r() {
        return this.f658v;
    }

    @Override // B0.f
    public final void s() {
        if (Build.VERSION.SDK_INT >= 24) {
            n.a(this.f642d);
        } else {
            m.a(this.f642d);
        }
    }

    @Override // B0.f
    public final float t() {
        return this.f652p;
    }

    @Override // B0.f
    public final void u(boolean z6) {
        this.f659w = z6;
        P();
    }

    @Override // B0.f
    public final int v() {
        return this.f647j;
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
        this.f647j = i7;
        R();
    }

    @Override // B0.f
    public final void z(float f7) {
        this.f652p = f7;
        this.f642d.setTranslationX(f7);
    }
}
