package q4;

import j0.k;

/* JADX INFO: renamed from: q4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1377a extends k {

    /* JADX INFO: renamed from: a */
    public final int f15582a;

    public C1377a(int i7) {
        this.f15582a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1377a) {
            return this.f15582a == ((C1377a) obj).f15582a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15582a;
    }

    public final String toString() {
        return String.valueOf(this.f15582a);
    }
}
