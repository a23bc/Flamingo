package i2;

import m5.AbstractC1209k;
import v5.AbstractC1643a;
import v5.EnumC1645c;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a */
    public final long f13325a;

    /* JADX INFO: renamed from: b */
    public final long f13326b;

    /* JADX INFO: renamed from: c */
    public final long f13327c;

    /* JADX INFO: renamed from: d */
    public final B2.g f13328d;

    public I() {
        int i7 = AbstractC1643a.f18315q;
        EnumC1645c enumC1645c = EnumC1645c.f18319r;
        long jC = i6.g.C(45, enumC1645c);
        long jC2 = i6.g.C(5, enumC1645c);
        long jC3 = i6.g.C(5, enumC1645c);
        B2.g gVar = G.f13322a;
        this.f13325a = jC;
        this.f13326b = jC2;
        this.f13327c = jC3;
        this.f13328d = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            I i7 = (I) obj;
            long j3 = i7.f13325a;
            int i8 = AbstractC1643a.f18315q;
            if (this.f13325a == j3 && this.f13326b == i7.f13326b && this.f13327c == i7.f13327c && AbstractC1209k.a(this.f13328d, i7.f13328d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = AbstractC1643a.f18315q;
        long j3 = this.f13325a;
        long j7 = this.f13326b;
        int i8 = (((int) (j7 ^ (j7 >>> 32))) + (((int) (j3 ^ (j3 >>> 32))) * 31)) * 31;
        long j8 = this.f13327c;
        return this.f13328d.hashCode() + ((((int) (j8 ^ (j8 >>> 32))) + i8) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) AbstractC1643a.h(this.f13325a)) + ", additionalTime=" + ((Object) AbstractC1643a.h(this.f13326b)) + ", idleTimeout=" + ((Object) AbstractC1643a.h(this.f13327c)) + ", timeSource=" + this.f13328d + ')';
    }
}
