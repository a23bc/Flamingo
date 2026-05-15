package R0;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: R0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375c0 implements S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f6424a;

    public C0375c0(ViewConfiguration viewConfiguration) {
        this.f6424a = viewConfiguration;
    }

    @Override // R0.S0
    public final float a() {
        return this.f6424a.getScaledMaximumFlingVelocity();
    }

    @Override // R0.S0
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // R0.S0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // R0.S0
    public final float d() {
        return this.f6424a.getScaledTouchSlop();
    }

    @Override // R0.S0
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f6424a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // R0.S0
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f6424a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }

    @Override // R0.S0
    public final long g() {
        float f7 = 48;
        return i6.g.d(f7, f7);
    }
}
