package B0;

import H.P;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import j5.AbstractC1107a;
import y0.AbstractC1959I;
import y0.AbstractC1970c;
import y0.C1969b;
import y0.C1980m;
import y0.C1986s;
import y0.C1987t;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b */
    public final C1986s f663b;

    /* JADX INFO: renamed from: c */
    public final A0.c f664c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f665d;

    /* JADX INFO: renamed from: e */
    public long f666e;

    /* JADX INFO: renamed from: f */
    public Paint f667f;

    /* JADX INFO: renamed from: g */
    public Matrix f668g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public float f669i;

    /* JADX INFO: renamed from: j */
    public int f670j;

    /* JADX INFO: renamed from: k */
    public float f671k;
    public float l;

    /* JADX INFO: renamed from: m */
    public float f672m;

    /* JADX INFO: renamed from: n */
    public float f673n;

    /* JADX INFO: renamed from: o */
    public float f674o;

    /* JADX INFO: renamed from: p */
    public long f675p;

    /* JADX INFO: renamed from: q */
    public long f676q;

    /* JADX INFO: renamed from: r */
    public float f677r;

    /* JADX INFO: renamed from: s */
    public float f678s;

    /* JADX INFO: renamed from: t */
    public boolean f679t;

    /* JADX INFO: renamed from: u */
    public boolean f680u;

    /* JADX INFO: renamed from: v */
    public boolean f681v;

    /* JADX INFO: renamed from: w */
    public P f682w;

    /* JADX INFO: renamed from: x */
    public int f683x;

    public i() {
        C1986s c1986s = new C1986s();
        A0.c cVar = new A0.c();
        this.f663b = c1986s;
        this.f664c = cVar;
        RenderNode renderNodeA = h.a();
        this.f665d = renderNodeA;
        this.f666e = 0L;
        renderNodeA.setClipToBounds(false);
        Q(renderNodeA, 0);
        this.f669i = 1.0f;
        this.f670j = 3;
        this.f671k = 1.0f;
        this.l = 1.0f;
        long j3 = C1987t.f20255b;
        this.f675p = j3;
        this.f676q = j3;
        this.f678s = 8.0f;
        this.f683x = 0;
    }

    @Override // B0.f
    public final void A(long j3) {
        this.f676q = j3;
        this.f665d.setSpotShadowColor(AbstractC1959I.x(j3));
    }

    @Override // B0.f
    public final void B(float f7) {
        this.l = f7;
        this.f665d.setScaleY(f7);
    }

    @Override // B0.f
    public final void C(P p7) {
        this.f682w = p7;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f665d.setRenderEffect(p7 != null ? p7.P0() : null);
        }
    }

    @Override // B0.f
    public final Matrix D() {
        Matrix matrix = this.f668g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f668g = matrix;
        }
        this.f665d.getMatrix(matrix);
        return matrix;
    }

    @Override // B0.f
    public final void E(InterfaceC1985r interfaceC1985r) {
        AbstractC1970c.a(interfaceC1985r).drawRenderNode(this.f665d);
    }

    @Override // B0.f
    public final void F(int i7, int i8, long j3) {
        this.f665d.setPosition(i7, i8, ((int) (j3 >> 32)) + i7, ((int) (4294967295L & j3)) + i8);
        this.f666e = AbstractC1107a.E(j3);
    }

    @Override // B0.f
    public final float G() {
        return 0.0f;
    }

    @Override // B0.f
    public final void H(float f7) {
        this.f678s = f7;
        this.f665d.setCameraDistance(f7);
    }

    @Override // B0.f
    public final float I() {
        return this.f674o;
    }

    @Override // B0.f
    public final boolean J() {
        return this.f665d.hasDisplayList();
    }

    @Override // B0.f
    public final float K() {
        return this.l;
    }

    @Override // B0.f
    public final float L() {
        return this.f677r;
    }

    @Override // B0.f
    public final int M() {
        return this.f670j;
    }

    @Override // B0.f
    public final void N(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f665d.resetPivot();
        } else {
            this.f665d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f665d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // B0.f
    public final long O() {
        return this.f675p;
    }

    public final void P() {
        boolean z6 = this.f679t;
        boolean z7 = false;
        boolean z8 = z6 && !this.h;
        if (z6 && this.h) {
            z7 = true;
        }
        if (z8 != this.f680u) {
            this.f680u = z8;
            this.f665d.setClipToBounds(z8);
        }
        if (z7 != this.f681v) {
            this.f681v = z7;
            this.f665d.setClipToOutline(z7);
        }
    }

    public final void Q(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setUseCompositingLayer(true, this.f667f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, this.f667f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f667f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i7 = this.f683x;
        if (i7 != 1 && this.f670j == 3 && this.f682w == null) {
            Q(this.f665d, i7);
        } else {
            Q(this.f665d, 1);
        }
    }

    @Override // B0.f
    public final float a() {
        return this.f669i;
    }

    @Override // B0.f
    public final void b() {
        this.f665d.setRotationX(0.0f);
    }

    @Override // B0.f
    public final void c(n1.d dVar, n1.n nVar, d dVar2, b bVar) {
        A0.c cVar = this.f664c;
        RecordingCanvas recordingCanvasBeginRecording = this.f665d.beginRecording();
        try {
            C1986s c1986s = this.f663b;
            C1969b c1969b = c1986s.f20254a;
            Canvas canvas = c1969b.f20227a;
            c1969b.f20227a = recordingCanvasBeginRecording;
            A0.b bVar2 = cVar.f54p;
            bVar2.n0(dVar);
            bVar2.o0(nVar);
            bVar2.f51q = dVar2;
            bVar2.p0(this.f666e);
            bVar2.m0(c1969b);
            bVar.b(cVar);
            c1986s.f20254a.f20227a = canvas;
        } finally {
            this.f665d.endRecording();
        }
    }

    @Override // B0.f
    public final void d(float f7) {
        this.f669i = f7;
        this.f665d.setAlpha(f7);
    }

    @Override // B0.f
    public final float e() {
        return this.f671k;
    }

    @Override // B0.f
    public final void f(float f7) {
        this.f674o = f7;
        this.f665d.setElevation(f7);
    }

    @Override // B0.f
    public final float g() {
        return this.f673n;
    }

    @Override // B0.f
    public final P h() {
        return this.f682w;
    }

    @Override // B0.f
    public final void i(float f7) {
        this.f677r = f7;
        this.f665d.setRotationZ(f7);
    }

    @Override // B0.f
    public final void j() {
        this.f665d.setRotationY(0.0f);
    }

    @Override // B0.f
    public final void k(float f7) {
        this.f673n = f7;
        this.f665d.setTranslationY(f7);
    }

    @Override // B0.f
    public final long l() {
        return this.f676q;
    }

    @Override // B0.f
    public final void m(long j3) {
        this.f675p = j3;
        this.f665d.setAmbientShadowColor(AbstractC1959I.x(j3));
    }

    @Override // B0.f
    public final void n(Outline outline, long j3) {
        this.f665d.setOutline(outline);
        this.h = outline != null;
        P();
    }

    @Override // B0.f
    public final void o() {
        Paint paint = this.f667f;
        if (paint == null) {
            paint = new Paint();
            this.f667f = paint;
        }
        paint.setColorFilter(null);
        R();
    }

    @Override // B0.f
    public final void p(float f7) {
        this.f671k = f7;
        this.f665d.setScaleX(f7);
    }

    @Override // B0.f
    public final void q(int i7) {
        this.f670j = i7;
        Paint paint = this.f667f;
        if (paint == null) {
            paint = new Paint();
            this.f667f = paint;
        }
        paint.setBlendMode(AbstractC1959I.s(i7));
        R();
    }

    @Override // B0.f
    public final float r() {
        return this.f678s;
    }

    @Override // B0.f
    public final void s() {
        this.f665d.discardDisplayList();
    }

    @Override // B0.f
    public final float t() {
        return this.f672m;
    }

    @Override // B0.f
    public final void u(boolean z6) {
        this.f679t = z6;
        P();
    }

    @Override // B0.f
    public final int v() {
        return this.f683x;
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
        this.f683x = i7;
        R();
    }

    @Override // B0.f
    public final void z(float f7) {
        this.f672m = f7;
        this.f665d.setTranslationX(f7);
    }
}
