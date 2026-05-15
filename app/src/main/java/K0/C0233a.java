package K0;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: K0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0233a implements r {

    /* JADX INFO: renamed from: b */
    public final int f3860b;

    public C0233a(int i7) {
        this.f3860b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0233a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f3860b == ((C0233a) obj).f3860b;
    }

    public final int hashCode() {
        return this.f3860b;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("AndroidPointerIcon(type="), this.f3860b, ')');
    }
}
