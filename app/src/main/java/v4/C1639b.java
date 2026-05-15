package v4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

/* JADX INFO: renamed from: v4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1639b extends ImageView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Matrix f18291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1642e f18292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1641d f18293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f18294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RectF f18295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f18299w;

    public C1639b(Context context) {
        super(context, null, 0);
        this.f18291o = new Matrix();
        this.f18292p = new C1640c(10000L, new AccelerateDecelerateInterpolator());
        this.f18294r = new RectF();
        this.f18299w = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void a() {
        RectF rectFK;
        boolean z6;
        RectF rectF = this.f18294r;
        if (rectF.isEmpty()) {
            return;
        }
        InterfaceC1642e interfaceC1642e = this.f18292p;
        RectF rectF2 = this.f18295s;
        C1640c c1640c = (C1640c) interfaceC1642e;
        C1641d c1641d = (C1641d) c1640c.f18303r;
        boolean z7 = true;
        if (c1641d == null) {
            rectFK = null;
            z6 = true;
        } else {
            rectFK = c1641d.f18306b;
            boolean z8 = !rectF2.equals((RectF) c1640c.f18304s);
            float fWidth = rectFK.width() / rectFK.height();
            double d4 = 3;
            float fRound = Math.round(fWidth * r11) / ((float) Math.pow(10.0d, d4));
            float fWidth2 = rectF.width() / rectF.height();
            float fPow = (float) Math.pow(10.0d, d4);
            z6 = true ^ (Math.abs(fRound - (((float) Math.round(fWidth2 * fPow)) / fPow)) <= 0.01f);
            z7 = z8;
        }
        if (rectFK == null || z7 || z6) {
            rectFK = c1640c.k(rectF2, rectF);
        }
        c1640c.f18303r = new C1641d(rectFK, c1640c.k(rectF2, rectF), c1640c.f18300o, (AccelerateDecelerateInterpolator) c1640c.f18302q);
        c1640c.f18304s = new RectF(rectF2);
        this.f18293q = (C1641d) c1640c.f18303r;
        this.f18296t = 0L;
        this.f18297u = System.currentTimeMillis();
    }

    public final void b() {
        if (this.f18295s == null) {
            this.f18295s = new RectF();
        }
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            return;
        }
        this.f18295s.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (!this.f18298v && drawable != null) {
            if (this.f18295s.isEmpty()) {
                b();
            } else {
                RectF rectF = this.f18294r;
                if (!rectF.isEmpty()) {
                    if (this.f18293q == null) {
                        a();
                    }
                    if (this.f18293q.f18306b != null) {
                        long jCurrentTimeMillis = (System.currentTimeMillis() - this.f18297u) + this.f18296t;
                        this.f18296t = jCurrentTimeMillis;
                        C1641d c1641d = this.f18293q;
                        float interpolation = c1641d.f18312i.getInterpolation(Math.min(jCurrentTimeMillis / c1641d.h, 1.0f));
                        RectF rectF2 = c1641d.f18305a;
                        float fWidth = (c1641d.f18308d * interpolation) + rectF2.width();
                        float fHeight = (c1641d.f18309e * interpolation) + rectF2.height();
                        float fCenterX = ((c1641d.f18310f * interpolation) + rectF2.centerX()) - (fWidth / 2.0f);
                        float fCenterY = ((interpolation * c1641d.f18311g) + rectF2.centerY()) - (fHeight / 2.0f);
                        RectF rectF3 = c1641d.f18307c;
                        rectF3.set(fCenterX, fCenterY, fWidth + fCenterX, fHeight + fCenterY);
                        float fMin = Math.min(rectF.width() / rectF3.width(), rectF.height() / rectF3.height()) * Math.min(this.f18295s.width() / rectF3.width(), this.f18295s.height() / rectF3.height());
                        float fCenterX2 = (this.f18295s.centerX() - rectF3.left) * fMin;
                        float fCenterY2 = (this.f18295s.centerY() - rectF3.top) * fMin;
                        Matrix matrix = this.f18291o;
                        matrix.reset();
                        matrix.postTranslate((-this.f18295s.width()) / 2.0f, (-this.f18295s.height()) / 2.0f);
                        matrix.postScale(fMin, fMin);
                        matrix.postTranslate(fCenterX2, fCenterY2);
                        setImageMatrix(matrix);
                        if (this.f18296t >= this.f18293q.h) {
                            a();
                        }
                    }
                }
            }
            this.f18297u = System.currentTimeMillis();
            postInvalidateDelayed(16L);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        this.f18294r.set(0.0f, 0.0f, width, height);
        b();
        a();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b();
        if (this.f18299w) {
            a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        b();
        if (this.f18299w) {
            a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        b();
        if (this.f18299w) {
            a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b();
        if (this.f18299w) {
            a();
        }
    }

    public void setTransitionGenerator(InterfaceC1642e interfaceC1642e) {
        this.f18292p = interfaceC1642e;
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            this.f18298v = true;
            return;
        }
        this.f18298v = false;
        this.f18297u = System.currentTimeMillis();
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public void setTransitionListener(InterfaceC1638a interfaceC1638a) {
    }
}
