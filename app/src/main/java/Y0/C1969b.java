package y0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1969b implements InterfaceC1985r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f20227a = AbstractC1970c.f20230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f20228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f20229c;

    @Override // y0.InterfaceC1985r
    public final void a(C1893c c1893c) {
        g(c1893c.f19869a, c1893c.f19870b, c1893c.f19871c, c1893c.f19872d, 1);
    }

    @Override // y0.InterfaceC1985r
    public final void b(C1976i c1976i) {
        Canvas canvas = this.f20227a;
        if (!(c1976i instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c1976i.f20241a, Region.Op.INTERSECT);
    }

    @Override // y0.InterfaceC1985r
    public final void c(float f7, float f8, float f9, float f10, float f11, float f12, w2.l lVar) {
        this.f20227a.drawRoundRect(f7, f8, f9, f10, f11, f12, (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void d(float f7, float f8) {
        this.f20227a.scale(f7, f8);
    }

    @Override // y0.InterfaceC1985r
    public final void e(C1976i c1976i, w2.l lVar) {
        Canvas canvas = this.f20227a;
        if (!(c1976i instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c1976i.f20241a, (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void f(long j3, long j7, w2.l lVar) {
        this.f20227a.drawLine(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void g(float f7, float f8, float f9, float f10, int i7) {
        this.f20227a.clipRect(f7, f8, f9, f10, i7 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // y0.InterfaceC1985r
    public final void h(float f7, float f8) {
        this.f20227a.translate(f7, f8);
    }

    @Override // y0.InterfaceC1985r
    public final void i() {
        this.f20227a.rotate(45.0f);
    }

    @Override // y0.InterfaceC1985r
    public final void j(float f7, long j3, w2.l lVar) {
        this.f20227a.drawCircle(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f7, (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void k() {
        this.f20227a.restore();
    }

    @Override // y0.InterfaceC1985r
    public final void l() {
        this.f20227a.save();
    }

    @Override // y0.InterfaceC1985r
    public final void m(C1973f c1973f, long j3, long j7, long j8, w2.l lVar) {
        if (this.f20228b == null) {
            this.f20228b = new Rect();
            this.f20229c = new Rect();
        }
        Canvas canvas = this.f20227a;
        Bitmap bitmapI = AbstractC1959I.i(c1973f);
        Rect rect = this.f20228b;
        AbstractC1209k.c(rect);
        int i7 = (int) (j3 >> 32);
        rect.left = i7;
        int i8 = (int) (j3 & 4294967295L);
        rect.top = i8;
        rect.right = i7 + ((int) (j7 >> 32));
        rect.bottom = i8 + ((int) (j7 & 4294967295L));
        Rect rect2 = this.f20229c;
        AbstractC1209k.c(rect2);
        int i9 = (int) 0;
        rect2.left = i9;
        int i10 = (int) 0;
        rect2.top = i10;
        rect2.right = i9 + ((int) (j8 >> 32));
        rect2.bottom = i10 + ((int) (4294967295L & j8));
        canvas.drawBitmap(bitmapI, rect, rect2, (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void n() {
        AbstractC1959I.l(this.f20227a, false);
    }

    @Override // y0.InterfaceC1985r
    public final void o(C1893c c1893c, w2.l lVar) {
        t(c1893c.f19869a, c1893c.f19870b, c1893c.f19871c, c1893c.f19872d, lVar);
    }

    @Override // y0.InterfaceC1985r
    public final void p(C1973f c1973f, w2.l lVar) {
        this.f20227a.drawBitmap(AbstractC1959I.i(c1973f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) lVar.f18861b);
    }

    @Override // y0.InterfaceC1985r
    public final void q(C1893c c1893c, w2.l lVar) {
        Canvas canvas = this.f20227a;
        Paint paint = (Paint) lVar.f18861b;
        canvas.saveLayer(c1893c.f19869a, c1893c.f19870b, c1893c.f19871c, c1893c.f19872d, paint, 31);
    }

    @Override // y0.InterfaceC1985r
    public final void r(float[] fArr) {
        if (AbstractC1959I.n(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC1959I.p(matrix, fArr);
        this.f20227a.concat(matrix);
    }

    @Override // y0.InterfaceC1985r
    public final void s() {
        AbstractC1959I.l(this.f20227a, true);
    }

    @Override // y0.InterfaceC1985r
    public final void t(float f7, float f8, float f9, float f10, w2.l lVar) {
        this.f20227a.drawRect(f7, f8, f9, f10, (Paint) lVar.f18861b);
    }
}
