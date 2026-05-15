package X;

import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: a */
    public final long f7986a;

    /* JADX INFO: renamed from: b */
    public final long f7987b;

    public Q0(long j3, long j7) {
        this.f7986a = j3;
        this.f7987b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return C1987t.c(this.f7986a, q02.f7986a) && C1987t.c(this.f7987b, q02.f7987b);
    }

    public final int hashCode() {
        return C1987t.i(this.f7987b) + (C1987t.i(this.f7986a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        n1.c.z(this.f7986a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C1987t.j(this.f7987b));
        sb.append(')');
        return sb.toString();
    }
}
