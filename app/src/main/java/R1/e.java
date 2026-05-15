package R1;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6660a;

    public e(String str) {
        AbstractC1209k.f(str, "name");
        this.f6660a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return AbstractC1209k.a(this.f6660a, ((e) obj).f6660a);
    }

    public final int hashCode() {
        return this.f6660a.hashCode();
    }

    public final String toString() {
        return this.f6660a;
    }
}
