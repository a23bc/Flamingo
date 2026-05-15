package t2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final String h;

    /* JADX INFO: renamed from: i */
    public static final String f16423i;

    /* JADX INFO: renamed from: j */
    public static final String f16424j;

    /* JADX INFO: renamed from: k */
    public static final String f16425k;
    public static final String l;

    /* JADX INFO: renamed from: a */
    public Object f16426a;

    /* JADX INFO: renamed from: b */
    public Object f16427b;

    /* JADX INFO: renamed from: c */
    public int f16428c;

    /* JADX INFO: renamed from: d */
    public long f16429d;

    /* JADX INFO: renamed from: e */
    public long f16430e;

    /* JADX INFO: renamed from: f */
    public boolean f16431f;

    /* JADX INFO: renamed from: g */
    public C1473b f16432g = C1473b.f16398f;

    static {
        int i7 = w2.t.f18881a;
        h = Integer.toString(0, 36);
        f16423i = Integer.toString(1, 36);
        f16424j = Integer.toString(2, 36);
        f16425k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i7, int i8) {
        C1472a c1472aA = this.f16432g.a(i7);
        if (c1472aA.f16385b != -1) {
            return c1472aA.f16390g[i8];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        int i7;
        C1472a c1472aA;
        int i8;
        C1473b c1473b = this.f16432g;
        long j7 = this.f16429d;
        c1473b.getClass();
        if (j3 != Long.MIN_VALUE && (j7 == -9223372036854775807L || j3 < j7)) {
            int i9 = c1473b.f16406d;
            while (true) {
                i7 = c1473b.f16403a;
                if (i9 >= i7 || ((c1473b.a(i9).f16384a == Long.MIN_VALUE || c1473b.a(i9).f16384a > j3) && ((i8 = (c1472aA = c1473b.a(i9)).f16385b) == -1 || c1472aA.a(-1) < i8))) {
                    break;
                }
                i9++;
            }
            if (i9 < i7) {
                return i9;
            }
        }
        return -1;
    }

    public final int c(long j3) {
        C1473b c1473b = this.f16432g;
        long j7 = this.f16429d;
        int i7 = c1473b.f16403a - 1;
        int i8 = i7 - (c1473b.b(i7) ? 1 : 0);
        while (i8 >= 0 && j3 != Long.MIN_VALUE) {
            C1472a c1472aA = c1473b.a(i8);
            long j8 = c1472aA.f16384a;
            if (j8 != Long.MIN_VALUE) {
                if (j3 >= j8) {
                    break;
                }
                i8--;
            } else {
                if (j7 != -9223372036854775807L && ((!c1472aA.f16391i || c1472aA.f16385b != -1) && j3 >= j7)) {
                    break;
                }
                i8--;
            }
        }
        if (i8 >= 0) {
            C1472a c1472aA2 = c1473b.a(i8);
            int i9 = c1472aA2.f16385b;
            if (i9 != -1) {
                for (int i10 = 0; i10 < i9; i10++) {
                    int i11 = c1472aA2.f16389f[i10];
                    if (i11 != 0 && i11 != 1) {
                    }
                }
            }
            return i8;
        }
        return -1;
    }

    public final long d(int i7) {
        return this.f16432g.a(i7).f16384a;
    }

    public final int e(int i7, int i8) {
        C1472a c1472aA = this.f16432g.a(i7);
        if (c1472aA.f16385b != -1) {
            return c1472aA.f16389f[i8];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class.equals(obj.getClass())) {
            e0 e0Var = (e0) obj;
            if (w2.t.a(this.f16426a, e0Var.f16426a) && w2.t.a(this.f16427b, e0Var.f16427b) && this.f16428c == e0Var.f16428c && this.f16429d == e0Var.f16429d && this.f16430e == e0Var.f16430e && this.f16431f == e0Var.f16431f && w2.t.a(this.f16432g, e0Var.f16432g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i7) {
        return this.f16432g.a(i7).a(-1);
    }

    public final boolean g(int i7) {
        C1473b c1473b = this.f16432g;
        return i7 == c1473b.f16403a - 1 && c1473b.b(i7);
    }

    public final boolean h(int i7) {
        return this.f16432g.a(i7).f16391i;
    }

    public final int hashCode() {
        Object obj = this.f16426a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f16427b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f16428c) * 31;
        long j3 = this.f16429d;
        int i7 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f16430e;
        return this.f16432g.hashCode() + ((((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f16431f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i7, long j3, long j7, C1473b c1473b, boolean z6) {
        this.f16426a = obj;
        this.f16427b = obj2;
        this.f16428c = i7;
        this.f16429d = j3;
        this.f16430e = j7;
        this.f16432g = c1473b;
        this.f16431f = z6;
    }
}
