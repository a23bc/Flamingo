package y;

import y0.C1987t;

/* JADX INFO: renamed from: y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1947c {

    /* JADX INFO: renamed from: a */
    public final long f20149a;

    /* JADX INFO: renamed from: b */
    public final long f20150b;

    /* JADX INFO: renamed from: c */
    public final long f20151c;

    /* JADX INFO: renamed from: d */
    public final long f20152d;

    /* JADX INFO: renamed from: e */
    public final long f20153e;

    public C1947c(long j3, long j7, long j8, long j9, long j10) {
        this.f20149a = j3;
        this.f20150b = j7;
        this.f20151c = j8;
        this.f20152d = j9;
        this.f20153e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1947c)) {
            return false;
        }
        C1947c c1947c = (C1947c) obj;
        return C1987t.c(this.f20149a, c1947c.f20149a) && C1987t.c(this.f20150b, c1947c.f20150b) && C1987t.c(this.f20151c, c1947c.f20151c) && C1987t.c(this.f20152d, c1947c.f20152d) && C1987t.c(this.f20153e, c1947c.f20153e);
    }

    public final int hashCode() {
        return C1987t.i(this.f20153e) + n1.c.o(n1.c.o(n1.c.o(C1987t.i(this.f20149a) * 31, 31, this.f20150b), 31, this.f20151c), 31, this.f20152d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        n1.c.z(this.f20149a, sb, ", textColor=");
        n1.c.z(this.f20150b, sb, ", iconColor=");
        n1.c.z(this.f20151c, sb, ", disabledTextColor=");
        n1.c.z(this.f20152d, sb, ", disabledIconColor=");
        sb.append((Object) C1987t.j(this.f20153e));
        sb.append(')');
        return sb.toString();
    }
}
