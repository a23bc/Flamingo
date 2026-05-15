package y0;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: y0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1977j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f20244a;

    public C1977j(PathMeasure pathMeasure) {
        this.f20244a = pathMeasure;
    }

    public final void a(float f7, float f8, C1976i c1976i) {
        if (!(c1976i instanceof C1976i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f20244a.getSegment(f7, f8, c1976i.f20241a, true);
    }
}
