package t2;

import android.net.Uri;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1472a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f16376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f16377k;
    public static final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f16378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f16380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f16381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f16382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16383r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f16387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G[] f16388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f16389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f16390g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16391i;

    static {
        int i7 = w2.t.f18881a;
        f16376j = Integer.toString(0, 36);
        f16377k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        f16378m = Integer.toString(3, 36);
        f16379n = Integer.toString(4, 36);
        f16380o = Integer.toString(5, 36);
        f16381p = Integer.toString(6, 36);
        f16382q = Integer.toString(7, 36);
        f16383r = Integer.toString(8, 36);
    }

    public C1472a(long j3, int i7, int i8, int[] iArr, G[] gArr, long[] jArr, long j7, boolean z6) {
        Uri uri;
        int i9 = 0;
        AbstractC1697a.d(iArr.length == gArr.length);
        this.f16384a = j3;
        this.f16385b = i7;
        this.f16386c = i8;
        this.f16389f = iArr;
        this.f16388e = gArr;
        this.f16390g = jArr;
        this.h = j7;
        this.f16391i = z6;
        this.f16387d = new Uri[gArr.length];
        while (true) {
            Uri[] uriArr = this.f16387d;
            if (i9 >= uriArr.length) {
                return;
            }
            G g6 = gArr[i9];
            if (g6 == null) {
                uri = null;
            } else {
                C1469B c1469b = g6.f16224b;
                c1469b.getClass();
                uri = c1469b.f16185a;
            }
            uriArr[i9] = uri;
            i9++;
        }
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f16389f;
            if (i9 >= iArr.length || this.f16391i || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1472a.class == obj.getClass()) {
            C1472a c1472a = (C1472a) obj;
            if (this.f16384a == c1472a.f16384a && this.f16385b == c1472a.f16385b && this.f16386c == c1472a.f16386c && Arrays.equals(this.f16388e, c1472a.f16388e) && Arrays.equals(this.f16389f, c1472a.f16389f) && Arrays.equals(this.f16390g, c1472a.f16390g) && this.h == c1472a.h && this.f16391i == c1472a.f16391i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((this.f16385b * 31) + this.f16386c) * 31;
        long j3 = this.f16384a;
        int iHashCode = (Arrays.hashCode(this.f16390g) + ((Arrays.hashCode(this.f16389f) + ((Arrays.hashCode(this.f16388e) + ((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j7 = this.h;
        return ((iHashCode + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.f16391i ? 1 : 0);
    }
}
