package t;

/* JADX INFO: renamed from: t.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1455j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16081a;

    public static long a(int i7, int i8) {
        return (((long) i8) & 4294967295L) | (((long) i7) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1455j) {
            return this.f16081a == ((C1455j) obj).f16081a;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f16081a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j3 = this.f16081a;
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return Z1.l.r(sb, (int) (j3 & 4294967295L), ')');
    }
}
