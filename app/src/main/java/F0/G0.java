package f0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0912t f11664a;

    public /* synthetic */ G0(C0912t c0912t) {
        this.f11664a = c0912t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof G0) {
            return AbstractC1209k.a(this.f11664a, ((G0) obj).f11664a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11664a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f11664a + ')';
    }
}
