package x;

import android.content.Context;
import android.widget.EdgeEffect;
import j5.AbstractC1109c;

/* JADX INFO: renamed from: x.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1831S extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19683b;

    public C1831S(Context context) {
        super(context);
        this.f19682a = AbstractC1109c.b(context).f14508o * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i7) {
        this.f19683b = 0.0f;
        super.onAbsorb(i7);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7, float f8) {
        this.f19683b = 0.0f;
        super.onPull(f7, f8);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f19683b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f7) {
        this.f19683b = 0.0f;
        super.onPull(f7);
    }
}
