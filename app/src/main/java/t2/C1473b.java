package t2;

import java.util.Arrays;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1473b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1473b f16398f = new C1473b(new C1472a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1472a f16399g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f16400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16402k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1472a[] f16407e;

    static {
        C1472a c1472a = new C1472a(0L, -1, -1, new int[0], new G[0], new long[0], 0L, false);
        int[] iArr = c1472a.f16389f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c1472a.f16390g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f16399g = new C1472a(c1472a.f16384a, 0, c1472a.f16386c, iArrCopyOf, (G[]) Arrays.copyOf(c1472a.f16388e, 0), jArrCopyOf, c1472a.h, c1472a.f16391i);
        int i7 = w2.t.f18881a;
        h = Integer.toString(1, 36);
        f16400i = Integer.toString(2, 36);
        f16401j = Integer.toString(3, 36);
        f16402k = Integer.toString(4, 36);
    }

    public C1473b(C1472a[] c1472aArr, long j3, long j7, int i7) {
        this.f16404b = j3;
        this.f16405c = j7;
        this.f16403a = c1472aArr.length + i7;
        this.f16407e = c1472aArr;
        this.f16406d = i7;
    }

    public final C1472a a(int i7) {
        int i8 = this.f16406d;
        return i7 < i8 ? f16399g : this.f16407e[i7 - i8];
    }

    public final boolean b(int i7) {
        if (i7 != this.f16403a - 1) {
            return false;
        }
        C1472a c1472aA = a(i7);
        return c1472aA.f16391i && c1472aA.f16384a == Long.MIN_VALUE && c1472aA.f16385b == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1473b.class != obj.getClass()) {
            return false;
        }
        C1473b c1473b = (C1473b) obj;
        int i7 = w2.t.f18881a;
        return this.f16403a == c1473b.f16403a && this.f16404b == c1473b.f16404b && this.f16405c == c1473b.f16405c && this.f16406d == c1473b.f16406d && Arrays.equals(this.f16407e, c1473b.f16407e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16407e) + (((((((this.f16403a * 961) + ((int) this.f16404b)) * 31) + ((int) this.f16405c)) * 31) + this.f16406d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.f16404b);
        sb.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            C1472a[] c1472aArr = this.f16407e;
            if (i7 >= c1472aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c1472aArr[i7].f16384a);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < c1472aArr[i7].f16389f.length; i8++) {
                sb.append("ad(state=");
                int i9 = c1472aArr[i7].f16389f[i8];
                if (i9 == 0) {
                    sb.append('_');
                } else if (i9 == 1) {
                    sb.append('R');
                } else if (i9 == 2) {
                    sb.append('S');
                } else if (i9 == 3) {
                    sb.append('P');
                } else if (i9 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c1472aArr[i7].f16390g[i8]);
                sb.append(')');
                if (i8 < c1472aArr[i7].f16389f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < c1472aArr.length - 1) {
                sb.append(", ");
            }
            i7++;
        }
    }
}
