package G1;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class X extends Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f2676e;

    public X(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2676e = windowInsetsAnimation;
    }

    @Override // G1.Y
    public final long a() {
        return this.f2676e.getDurationMillis();
    }

    @Override // G1.Y
    public final float b() {
        return this.f2676e.getFraction();
    }

    @Override // G1.Y
    public final float c() {
        return this.f2676e.getInterpolatedFraction();
    }

    @Override // G1.Y
    public final int d() {
        return this.f2676e.getTypeMask();
    }

    @Override // G1.Y
    public final void e(float f7) {
        this.f2676e.setFraction(f7);
    }
}
