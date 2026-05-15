package b2;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f10026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10028c;

    public A0(s0 s0Var, boolean z6, boolean z7) {
        this.f10026a = s0Var;
        this.f10027b = z6;
        this.f10028c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a0 = (A0) obj;
        return this.f10026a == a0.f10026a && this.f10027b == a0.f10027b && this.f10028c == a0.f10028c;
    }

    public final int hashCode() {
        return (((this.f10026a.hashCode() * 31) + (this.f10027b ? 1231 : 1237)) * 31) + (this.f10028c ? 1231 : 1237);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.f10026a + ", expandWidth=" + this.f10027b + ", expandHeight=" + this.f10028c + ')';
    }
}
