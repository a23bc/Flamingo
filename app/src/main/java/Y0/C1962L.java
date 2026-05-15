package y0;

import x0.C1892b;

/* JADX INFO: renamed from: y0.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1962L {

    /* JADX INFO: renamed from: d */
    public static final C1962L f20207d = new C1962L(0.0f, AbstractC1959I.d(4278190080L), 0);

    /* JADX INFO: renamed from: a */
    public final long f20208a;

    /* JADX INFO: renamed from: b */
    public final long f20209b;

    /* JADX INFO: renamed from: c */
    public final float f20210c;

    public C1962L(float f7, long j3, long j7) {
        this.f20208a = j3;
        this.f20209b = j7;
        this.f20210c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1962L)) {
            return false;
        }
        C1962L c1962l = (C1962L) obj;
        return C1987t.c(this.f20208a, c1962l.f20208a) && C1892b.b(this.f20209b, c1962l.f20209b) && this.f20210c == c1962l.f20210c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f20210c) + ((C1892b.f(this.f20209b) + (C1987t.i(this.f20208a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        n1.c.z(this.f20208a, sb, ", offset=");
        sb.append((Object) C1892b.j(this.f20209b));
        sb.append(", blurRadius=");
        return n1.c.u(sb, this.f20210c, ')');
    }
}
