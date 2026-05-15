package C2;

import E4.p0;
import java.util.Set;

/* JADX INFO: renamed from: C2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0034f f1113d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E4.M f1116c;

    static {
        C0034f c0034f;
        if (w2.t.f18881a >= 33) {
            E4.L l = new E4.L(4);
            for (int i7 = 1; i7 <= 10; i7++) {
                l.a(Integer.valueOf(w2.t.n(i7)));
            }
            c0034f = new C0034f(2, l.f());
        } else {
            c0034f = new C0034f(2, 10);
        }
        f1113d = c0034f;
    }

    public C0034f(int i7, Set set) {
        this.f1114a = i7;
        E4.M mP = E4.M.p(set);
        this.f1116c = mP;
        p0 it = mP.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f1115b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034f)) {
            return false;
        }
        C0034f c0034f = (C0034f) obj;
        return this.f1114a == c0034f.f1114a && this.f1115b == c0034f.f1115b && w2.t.a(this.f1116c, c0034f.f1116c);
    }

    public final int hashCode() {
        int i7 = ((this.f1114a * 31) + this.f1115b) * 31;
        E4.M m7 = this.f1116c;
        return i7 + (m7 == null ? 0 : m7.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f1114a + ", maxChannelCount=" + this.f1115b + ", channelMasks=" + this.f1116c + "]";
    }

    public C0034f(int i7, int i8) {
        this.f1114a = i7;
        this.f1115b = i8;
        this.f1116c = null;
    }
}
