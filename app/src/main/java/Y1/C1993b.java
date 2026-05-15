package y1;

import Z1.l;
import android.graphics.Insets;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1993b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1993b f20270e = new C1993b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20274d;

    public C1993b(int i7, int i8, int i9, int i10) {
        this.f20271a = i7;
        this.f20272b = i8;
        this.f20273c = i9;
        this.f20274d = i10;
    }

    public static C1993b a(C1993b c1993b, C1993b c1993b2) {
        return b(Math.max(c1993b.f20271a, c1993b2.f20271a), Math.max(c1993b.f20272b, c1993b2.f20272b), Math.max(c1993b.f20273c, c1993b2.f20273c), Math.max(c1993b.f20274d, c1993b2.f20274d));
    }

    public static C1993b b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f20270e : new C1993b(i7, i8, i9, i10);
    }

    public static C1993b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return U0.b.h(this.f20271a, this.f20272b, this.f20273c, this.f20274d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1993b.class != obj.getClass()) {
            return false;
        }
        C1993b c1993b = (C1993b) obj;
        return this.f20274d == c1993b.f20274d && this.f20271a == c1993b.f20271a && this.f20273c == c1993b.f20273c && this.f20272b == c1993b.f20272b;
    }

    public final int hashCode() {
        return (((((this.f20271a * 31) + this.f20272b) * 31) + this.f20273c) * 31) + this.f20274d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f20271a);
        sb.append(", top=");
        sb.append(this.f20272b);
        sb.append(", right=");
        sb.append(this.f20273c);
        sb.append(", bottom=");
        return l.r(sb, this.f20274d, '}');
    }
}
