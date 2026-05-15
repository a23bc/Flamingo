package D;

import t.C1455j;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1235d;

    public I(P p7, long j3, int i7, int i8) {
        this.f1232a = p7;
        this.f1233b = j3;
        this.f1234c = i7;
        this.f1235d = i8;
    }

    public final AbstractC0060d a(H h, boolean z6, int i7, int i8, int i9, int i10) {
        if (!h.f1231b) {
            return null;
        }
        this.f1232a.getClass();
        N n7 = N.f1254o;
        return null;
    }

    public final H b(boolean z6, int i7, long j3, C1455j c1455j, int i8, int i9, int i10, boolean z7, boolean z8) {
        int i11 = i9 + i10;
        if (c1455j == null) {
            return new H(true, true);
        }
        this.f1232a.getClass();
        N n7 = N.f1254o;
        N n8 = N.f1254o;
        if (i8 < Integer.MAX_VALUE) {
            int i12 = (int) (j3 & 4294967295L);
            long j7 = c1455j.f16081a;
            if (i12 - ((int) (j7 & 4294967295L)) >= 0) {
                if (i7 != 0 && (i7 >= Integer.MAX_VALUE || ((int) (j3 >> 32)) - ((int) (j7 >> 32)) < 0)) {
                    return z7 ? new H(true, true) : new H(true, b(z6, 0, C1455j.a(n1.a.h(this.f1233b), (((int) (j3 & 4294967295L)) - this.f1235d) - i10), new C1455j(C1455j.a(((int) (j7 >> 32)) - this.f1234c, (int) (4294967295L & j7))), i8 + 1, i11, 0, true, false).f1231b);
                }
                Math.max(i10, (int) (j7 & 4294967295L));
                return new H(false, false);
            }
        }
        return new H(true, true);
    }
}
