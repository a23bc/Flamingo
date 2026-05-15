package t2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: A */
    public static final String f16438A;

    /* JADX INFO: renamed from: B */
    public static final String f16439B;

    /* JADX INFO: renamed from: C */
    public static final String f16440C;

    /* JADX INFO: renamed from: D */
    public static final String f16441D;

    /* JADX INFO: renamed from: E */
    public static final String f16442E;

    /* JADX INFO: renamed from: p */
    public static final Object f16443p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f16444q = new Object();

    /* JADX INFO: renamed from: r */
    public static final G f16445r;

    /* JADX INFO: renamed from: s */
    public static final String f16446s;

    /* JADX INFO: renamed from: t */
    public static final String f16447t;

    /* JADX INFO: renamed from: u */
    public static final String f16448u;

    /* JADX INFO: renamed from: v */
    public static final String f16449v;

    /* JADX INFO: renamed from: w */
    public static final String f16450w;

    /* JADX INFO: renamed from: x */
    public static final String f16451x;

    /* JADX INFO: renamed from: y */
    public static final String f16452y;

    /* JADX INFO: renamed from: z */
    public static final String f16453z;

    /* JADX INFO: renamed from: b */
    public Object f16455b;

    /* JADX INFO: renamed from: d */
    public long f16457d;

    /* JADX INFO: renamed from: e */
    public long f16458e;

    /* JADX INFO: renamed from: f */
    public long f16459f;

    /* JADX INFO: renamed from: g */
    public boolean f16460g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public C1468A f16461i;

    /* JADX INFO: renamed from: j */
    public boolean f16462j;

    /* JADX INFO: renamed from: k */
    public long f16463k;
    public long l;

    /* JADX INFO: renamed from: m */
    public int f16464m;

    /* JADX INFO: renamed from: n */
    public int f16465n;

    /* JADX INFO: renamed from: o */
    public long f16466o;

    /* JADX INFO: renamed from: a */
    public Object f16454a = f16443p;

    /* JADX INFO: renamed from: c */
    public G f16456c = f16445r;

    static {
        C1469B c1469b;
        C1492v c1492v = new C1492v();
        C2.I i7 = new C2.I(2);
        List list = Collections.EMPTY_LIST;
        E4.b0 b0Var = E4.b0.f1913s;
        C1496z c1496z = new C1496z();
        C1470C c1470c = C1470C.f16192d;
        Uri uri = Uri.EMPTY;
        AbstractC1697a.i(((Uri) i7.f985e) == null || ((UUID) i7.f984d) != null);
        C1495y c1495y = null;
        if (uri != null) {
            if (((UUID) i7.f984d) != null) {
                c1495y = new C1495y(i7);
            }
            c1469b = new C1469B(uri, null, c1495y, null, list, null, b0Var, -9223372036854775807L);
        } else {
            c1469b = null;
        }
        f16445r = new G("androidx.media3.common.Timeline", new C1494x(c1492v), c1469b, new C1468A(c1496z), J.f16263J, c1470c);
        f16446s = Integer.toString(1, 36);
        f16447t = Integer.toString(2, 36);
        f16448u = Integer.toString(3, 36);
        f16449v = Integer.toString(4, 36);
        f16450w = Integer.toString(5, 36);
        f16451x = Integer.toString(6, 36);
        f16452y = Integer.toString(7, 36);
        f16453z = Integer.toString(8, 36);
        f16438A = Integer.toString(9, 36);
        f16439B = Integer.toString(10, 36);
        f16440C = Integer.toString(11, 36);
        f16441D = Integer.toString(12, 36);
        f16442E = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.f16461i != null;
    }

    public final void b(Object obj, G g6, long j3, long j7, long j8, boolean z6, boolean z7, C1468A c1468a, long j9, long j10, int i7, int i8, long j11) {
        this.f16454a = obj;
        this.f16456c = g6 != null ? g6 : f16445r;
        if (g6 != null) {
            C1469B c1469b = g6.f16224b;
        }
        this.f16455b = null;
        this.f16457d = j3;
        this.f16458e = j7;
        this.f16459f = j8;
        this.f16460g = z6;
        this.h = z7;
        this.f16461i = c1468a;
        this.f16463k = j9;
        this.l = j10;
        this.f16464m = i7;
        this.f16465n = i8;
        this.f16466o = j11;
        this.f16462j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !g0.class.equals(obj.getClass())) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return w2.t.a(this.f16454a, g0Var.f16454a) && w2.t.a(this.f16456c, g0Var.f16456c) && w2.t.a(this.f16461i, g0Var.f16461i) && this.f16457d == g0Var.f16457d && this.f16458e == g0Var.f16458e && this.f16459f == g0Var.f16459f && this.f16460g == g0Var.f16460g && this.h == g0Var.h && this.f16462j == g0Var.f16462j && this.f16463k == g0Var.f16463k && this.l == g0Var.l && this.f16464m == g0Var.f16464m && this.f16465n == g0Var.f16465n && this.f16466o == g0Var.f16466o;
    }

    public final int hashCode() {
        int iHashCode = (this.f16456c.hashCode() + ((this.f16454a.hashCode() + 217) * 31)) * 961;
        C1468A c1468a = this.f16461i;
        int iHashCode2 = c1468a == null ? 0 : c1468a.hashCode();
        long j3 = this.f16457d;
        int i7 = (((iHashCode + iHashCode2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f16458e;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f16459f;
        int i9 = (((((((i8 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f16460g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.f16462j ? 1 : 0)) * 31;
        long j9 = this.f16463k;
        int i10 = (i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.l;
        int i11 = (((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f16464m) * 31) + this.f16465n) * 31;
        long j11 = this.f16466o;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }
}
