package x0;

import Z1.l;
import i6.g;
import j5.AbstractC1107a;
import j5.AbstractC1109c;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1894d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19879g;
    public final long h;

    static {
        g.i(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C1894d(float f7, float f8, float f9, float f10, long j3, long j7, long j8, long j9) {
        this.f19873a = f7;
        this.f19874b = f8;
        this.f19875c = f9;
        this.f19876d = f10;
        this.f19877e = j3;
        this.f19878f = j7;
        this.f19879g = j8;
        this.h = j9;
    }

    public final float a() {
        return this.f19876d - this.f19874b;
    }

    public final float b() {
        return this.f19875c - this.f19873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894d)) {
            return false;
        }
        C1894d c1894d = (C1894d) obj;
        return Float.compare(this.f19873a, c1894d.f19873a) == 0 && Float.compare(this.f19874b, c1894d.f19874b) == 0 && Float.compare(this.f19875c, c1894d.f19875c) == 0 && Float.compare(this.f19876d, c1894d.f19876d) == 0 && AbstractC1107a.p(this.f19877e, c1894d.f19877e) && AbstractC1107a.p(this.f19878f, c1894d.f19878f) && AbstractC1107a.p(this.f19879g, c1894d.f19879g) && AbstractC1107a.p(this.h, c1894d.h);
    }

    public final int hashCode() {
        int iN = n1.c.n(this.f19876d, n1.c.n(this.f19875c, n1.c.n(this.f19874b, Float.floatToIntBits(this.f19873a) * 31, 31), 31), 31);
        long j3 = this.f19877e;
        long j7 = this.f19878f;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) + ((((int) (j3 ^ (j3 >>> 32))) + iN) * 31)) * 31;
        long j8 = this.f19879g;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) + i7) * 31;
        long j9 = this.h;
        return ((int) (j9 ^ (j9 >>> 32))) + i8;
    }

    public final String toString() {
        String str = AbstractC1109c.B(this.f19873a) + ", " + AbstractC1109c.B(this.f19874b) + ", " + AbstractC1109c.B(this.f19875c) + ", " + AbstractC1109c.B(this.f19876d);
        long j3 = this.f19877e;
        long j7 = this.f19878f;
        boolean zP = AbstractC1107a.p(j3, j7);
        long j8 = this.f19879g;
        long j9 = this.h;
        if (!zP || !AbstractC1107a.p(j7, j8) || !AbstractC1107a.p(j8, j9)) {
            StringBuilder sbU = l.u("RoundRect(rect=", str, ", topLeft=");
            sbU.append((Object) AbstractC1107a.F(j3));
            sbU.append(", topRight=");
            sbU.append((Object) AbstractC1107a.F(j7));
            sbU.append(", bottomRight=");
            sbU.append((Object) AbstractC1107a.F(j8));
            sbU.append(", bottomLeft=");
            sbU.append((Object) AbstractC1107a.F(j9));
            sbU.append(')');
            return sbU.toString();
        }
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i8)) {
            StringBuilder sbU2 = l.u("RoundRect(rect=", str, ", radius=");
            sbU2.append(AbstractC1109c.B(Float.intBitsToFloat(i7)));
            sbU2.append(')');
            return sbU2.toString();
        }
        StringBuilder sbU3 = l.u("RoundRect(rect=", str, ", x=");
        sbU3.append(AbstractC1109c.B(Float.intBitsToFloat(i7)));
        sbU3.append(", y=");
        sbU3.append(AbstractC1109c.B(Float.intBitsToFloat(i8)));
        sbU3.append(')');
        return sbU3.toString();
    }
}
