package G1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f2679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2680d;

    public Y(int i7, Interpolator interpolator, long j3) {
        this.f2677a = i7;
        this.f2679c = interpolator;
        this.f2680d = j3;
    }

    public long a() {
        return this.f2680d;
    }

    public float b() {
        return this.f2678b;
    }

    public float c() {
        Interpolator interpolator = this.f2679c;
        return interpolator != null ? interpolator.getInterpolation(this.f2678b) : this.f2678b;
    }

    public int d() {
        return this.f2677a;
    }

    public void e(float f7) {
        this.f2678b = f7;
    }
}
