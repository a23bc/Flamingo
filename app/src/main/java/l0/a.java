package L0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public long f4087a;

    /* JADX INFO: renamed from: b */
    public float f4088b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4087a == aVar.f4087a && Float.compare(this.f4088b, aVar.f4088b) == 0;
    }

    public final int hashCode() {
        long j3 = this.f4087a;
        return Float.floatToIntBits(this.f4088b) + (((int) (j3 ^ (j3 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f4087a);
        sb.append(", dataPoint=");
        return n1.c.u(sb, this.f4088b, ')');
    }
}
