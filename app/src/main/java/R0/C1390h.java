package r0;

/* JADX INFO: renamed from: r0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1390h implements InterfaceC1386d {

    /* JADX INFO: renamed from: a */
    public final float f15627a;

    /* JADX INFO: renamed from: b */
    public final float f15628b;

    public C1390h(float f7, float f8) {
        this.f15627a = f7;
        this.f15628b = f8;
    }

    @Override // r0.InterfaceC1386d
    public final long a(long j3, long j7, n1.n nVar) {
        float f7 = (((int) (j7 >> 32)) - ((int) (j3 >> 32))) / 2.0f;
        float f8 = (((int) (j7 & 4294967295L)) - ((int) (j3 & 4294967295L))) / 2.0f;
        n1.n nVar2 = n1.n.f14521o;
        float f9 = this.f15627a;
        if (nVar != nVar2) {
            f9 *= -1;
        }
        float f10 = 1;
        float f11 = (f9 + f10) * f7;
        return (((long) Math.round((f10 + this.f15628b) * f8)) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1390h)) {
            return false;
        }
        C1390h c1390h = (C1390h) obj;
        return Float.compare(this.f15627a, c1390h.f15627a) == 0 && Float.compare(this.f15628b, c1390h.f15628b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15628b) + (Float.floatToIntBits(this.f15627a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f15627a);
        sb.append(", verticalBias=");
        return n1.c.u(sb, this.f15628b, ')');
    }
}
