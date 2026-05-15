package y0;

import android.graphics.Path;
import android.graphics.RectF;
import m5.AbstractC1209k;
import x0.C1893c;

/* JADX INFO: renamed from: y0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1976i {

    /* JADX INFO: renamed from: a */
    public final Path f20241a;

    /* JADX INFO: renamed from: b */
    public RectF f20242b;

    /* JADX INFO: renamed from: c */
    public float[] f20243c;

    public C1976i(Path path) {
        this.f20241a = path;
    }

    public final void a(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f20241a.cubicTo(f7, f8, f9, f10, f11, f12);
    }

    public final C1893c b() {
        if (this.f20242b == null) {
            this.f20242b = new RectF();
        }
        RectF rectF = this.f20242b;
        AbstractC1209k.c(rectF);
        this.f20241a.computeBounds(rectF, true);
        return new C1893c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c(float f7, float f8) {
        this.f20241a.lineTo(f7, f8);
    }

    public final void d() {
        this.f20241a.reset();
    }
}
