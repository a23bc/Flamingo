package b1;

import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0616a f9996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10002g;

    public q(C0616a c0616a, int i7, int i8, int i9, int i10, float f7, float f8) {
        this.f9996a = c0616a;
        this.f9997b = i7;
        this.f9998c = i8;
        this.f9999d = i9;
        this.f10000e = i10;
        this.f10001f = f7;
        this.f10002g = f8;
    }

    public final C1893c a(C1893c c1893c) {
        return c1893c.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f10001f)) & 4294967295L));
    }

    public final long b(long j3, boolean z6) {
        if (z6) {
            long j7 = L.f9943b;
            if (L.b(j3, j7)) {
                return j7;
            }
        }
        int i7 = L.f9944c;
        int i8 = (int) (j3 >> 32);
        int i9 = this.f9997b;
        return AbstractC0607C.b(i8 + i9, ((int) (j3 & 4294967295L)) + i9);
    }

    public final C1893c c(C1893c c1893c) {
        float f7 = -this.f10001f;
        return c1893c.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
    }

    public final int d(int i7) {
        int i8 = this.f9998c;
        int i9 = this.f9997b;
        return i6.h.q(i7, i9, i8) - i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9996a.equals(qVar.f9996a) && this.f9997b == qVar.f9997b && this.f9998c == qVar.f9998c && this.f9999d == qVar.f9999d && this.f10000e == qVar.f10000e && Float.compare(this.f10001f, qVar.f10001f) == 0 && Float.compare(this.f10002g, qVar.f10002g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10002g) + n1.c.n(this.f10001f, ((((((((this.f9996a.hashCode() * 31) + this.f9997b) * 31) + this.f9998c) * 31) + this.f9999d) * 31) + this.f10000e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f9996a);
        sb.append(", startIndex=");
        sb.append(this.f9997b);
        sb.append(", endIndex=");
        sb.append(this.f9998c);
        sb.append(", startLineIndex=");
        sb.append(this.f9999d);
        sb.append(", endLineIndex=");
        sb.append(this.f10000e);
        sb.append(", top=");
        sb.append(this.f10001f);
        sb.append(", bottom=");
        return n1.c.u(sb, this.f10002g, ')');
    }
}
