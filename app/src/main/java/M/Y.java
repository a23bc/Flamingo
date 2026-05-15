package M;

import g1.C0968j;
import g1.C0970l;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4494b;

    public Y(int i7) {
        int i8 = (i7 & 4) != 0 ? 0 : 1;
        int i9 = (i7 & 8) != 0 ? -1 : 3;
        this.f4493a = i8;
        this.f4494b = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        y6.getClass();
        return this.f4493a == y6.f4493a && this.f4494b == y6.f4494b;
    }

    public final int hashCode() {
        return (((((-31) * 31) + this.f4493a) * 31) + this.f4494b) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) C0970l.a(this.f4493a)) + ", imeAction=" + ((Object) C0968j.a(this.f4494b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
