package x3;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1917b extends k.I {
    @Override // k.I
    public final C1916a E() {
        return new C1918c(((AudioAttributes.Builder) this.f13847p).build());
    }

    @Override // k.I
    public final k.I N(int i7) {
        ((AudioAttributes.Builder) this.f13847p).setUsage(i7);
        return this;
    }

    @Override // k.I
    public final k.I O(int i7) {
        ((AudioAttributes.Builder) this.f13847p).setUsage(i7);
        return this;
    }
}
