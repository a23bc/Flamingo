package x3;

/* JADX INFO: renamed from: x3.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1907I extends C1906H {
    @Override // x3.C1904F
    public final void L(float f7) {
        if (f7 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        this.f19983a.setPlaybackSpeed(f7);
    }
}
