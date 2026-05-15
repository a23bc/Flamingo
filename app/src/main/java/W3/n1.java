package w3;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.C0535h;
import java.util.ArrayList;
import java.util.Arrays;
import t2.BinderC1478g;
import t2.C1468A;
import t2.C1472a;
import t2.C1473b;
import t2.C1476e;
import t2.C1482k;
import v2.C1635b;
import v2.C1636c;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: F */
    public static final n1 f19254F;

    /* JADX INFO: renamed from: G */
    public static final String f19255G;

    /* JADX INFO: renamed from: H */
    public static final String f19256H;

    /* JADX INFO: renamed from: I */
    public static final String f19257I;

    /* JADX INFO: renamed from: J */
    public static final String f19258J;

    /* JADX INFO: renamed from: K */
    public static final String f19259K;

    /* JADX INFO: renamed from: L */
    public static final String f19260L;

    /* JADX INFO: renamed from: M */
    public static final String f19261M;

    /* JADX INFO: renamed from: N */
    public static final String f19262N;

    /* JADX INFO: renamed from: O */
    public static final String f19263O;

    /* JADX INFO: renamed from: P */
    public static final String f19264P;

    /* JADX INFO: renamed from: Q */
    public static final String f19265Q;

    /* JADX INFO: renamed from: R */
    public static final String f19266R;

    /* JADX INFO: renamed from: S */
    public static final String f19267S;

    /* JADX INFO: renamed from: T */
    public static final String f19268T;

    /* JADX INFO: renamed from: U */
    public static final String f19269U;

    /* JADX INFO: renamed from: V */
    public static final String f19270V;

    /* JADX INFO: renamed from: W */
    public static final String f19271W;

    /* JADX INFO: renamed from: X */
    public static final String f19272X;

    /* JADX INFO: renamed from: Y */
    public static final String f19273Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;

    /* JADX INFO: renamed from: c0 */
    public static final String f19274c0;

    /* JADX INFO: renamed from: d0 */
    public static final String f19275d0;

    /* JADX INFO: renamed from: e0 */
    public static final String f19276e0;

    /* JADX INFO: renamed from: f0 */
    public static final String f19277f0;

    /* JADX INFO: renamed from: g0 */
    public static final String f19278g0;

    /* JADX INFO: renamed from: h0 */
    public static final String f19279h0;

    /* JADX INFO: renamed from: i0 */
    public static final String f19280i0;

    /* JADX INFO: renamed from: j0 */
    public static final String f19281j0;

    /* JADX INFO: renamed from: k0 */
    public static final String f19282k0;

    /* JADX INFO: renamed from: l0 */
    public static final String f19283l0;

    /* JADX INFO: renamed from: A */
    public final long f19284A;

    /* JADX INFO: renamed from: B */
    public final long f19285B;

    /* JADX INFO: renamed from: C */
    public final long f19286C;

    /* JADX INFO: renamed from: D */
    public final t2.p0 f19287D;

    /* JADX INFO: renamed from: E */
    public final t2.n0 f19288E;

    /* JADX INFO: renamed from: a */
    public final t2.P f19289a;

    /* JADX INFO: renamed from: b */
    public final int f19290b;

    /* JADX INFO: renamed from: c */
    public final y1 f19291c;

    /* JADX INFO: renamed from: d */
    public final t2.W f19292d;

    /* JADX INFO: renamed from: e */
    public final t2.W f19293e;

    /* JADX INFO: renamed from: f */
    public final int f19294f;

    /* JADX INFO: renamed from: g */
    public final t2.Q f19295g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final boolean f19296i;

    /* JADX INFO: renamed from: j */
    public final t2.h0 f19297j;

    /* JADX INFO: renamed from: k */
    public final int f19298k;
    public final t2.s0 l;

    /* JADX INFO: renamed from: m */
    public final t2.J f19299m;

    /* JADX INFO: renamed from: n */
    public final float f19300n;

    /* JADX INFO: renamed from: o */
    public final C1476e f19301o;

    /* JADX INFO: renamed from: p */
    public final C1636c f19302p;

    /* JADX INFO: renamed from: q */
    public final C1482k f19303q;

    /* JADX INFO: renamed from: r */
    public final int f19304r;

    /* JADX INFO: renamed from: s */
    public final boolean f19305s;

    /* JADX INFO: renamed from: t */
    public final boolean f19306t;

    /* JADX INFO: renamed from: u */
    public final int f19307u;

    /* JADX INFO: renamed from: v */
    public final boolean f19308v;

    /* JADX INFO: renamed from: w */
    public final boolean f19309w;

    /* JADX INFO: renamed from: x */
    public final int f19310x;

    /* JADX INFO: renamed from: y */
    public final int f19311y;

    /* JADX INFO: renamed from: z */
    public final t2.J f19312z;

    static {
        y1 y1Var = y1.l;
        t2.W w7 = y1.f19407k;
        t2.Q q7 = t2.Q.f16345d;
        t2.s0 s0Var = t2.s0.f16725e;
        t2.d0 d0Var = t2.h0.f16472a;
        t2.J j3 = t2.J.f16263J;
        f19254F = new n1(null, 0, y1Var, w7, w7, 0, q7, 0, false, s0Var, d0Var, 0, j3, 1.0f, C1476e.f16413g, C1636c.f18271c, C1482k.f16499e, 0, false, false, 1, 0, 1, false, false, j3, 5000L, 15000L, 3000L, t2.p0.f16715b, t2.n0.f16553C);
        int i7 = w2.t.f18881a;
        f19255G = Integer.toString(1, 36);
        f19256H = Integer.toString(2, 36);
        f19257I = Integer.toString(3, 36);
        f19258J = Integer.toString(4, 36);
        f19259K = Integer.toString(5, 36);
        f19260L = Integer.toString(6, 36);
        f19261M = Integer.toString(7, 36);
        f19262N = Integer.toString(8, 36);
        f19263O = Integer.toString(9, 36);
        f19264P = Integer.toString(10, 36);
        f19265Q = Integer.toString(11, 36);
        f19266R = Integer.toString(12, 36);
        f19267S = Integer.toString(13, 36);
        f19268T = Integer.toString(14, 36);
        f19269U = Integer.toString(15, 36);
        f19270V = Integer.toString(16, 36);
        f19271W = Integer.toString(17, 36);
        f19272X = Integer.toString(18, 36);
        f19273Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        f19274c0 = Integer.toString(23, 36);
        f19275d0 = Integer.toString(24, 36);
        f19276e0 = Integer.toString(25, 36);
        f19277f0 = Integer.toString(26, 36);
        f19278g0 = Integer.toString(27, 36);
        f19279h0 = Integer.toString(28, 36);
        f19280i0 = Integer.toString(29, 36);
        f19281j0 = Integer.toString(30, 36);
        f19282k0 = Integer.toString(31, 36);
        f19283l0 = Integer.toString(32, 36);
    }

    public n1(t2.P p7, int i7, y1 y1Var, t2.W w7, t2.W w8, int i8, t2.Q q7, int i9, boolean z6, t2.s0 s0Var, t2.h0 h0Var, int i10, t2.J j3, float f7, C1476e c1476e, C1636c c1636c, C1482k c1482k, int i11, boolean z7, boolean z8, int i12, int i13, int i14, boolean z9, boolean z10, t2.J j7, long j8, long j9, long j10, t2.p0 p0Var, t2.n0 n0Var) {
        this.f19289a = p7;
        this.f19290b = i7;
        this.f19291c = y1Var;
        this.f19292d = w7;
        this.f19293e = w8;
        this.f19294f = i8;
        this.f19295g = q7;
        this.h = i9;
        this.f19296i = z6;
        this.l = s0Var;
        this.f19297j = h0Var;
        this.f19298k = i10;
        this.f19299m = j3;
        this.f19300n = f7;
        this.f19301o = c1476e;
        this.f19302p = c1636c;
        this.f19303q = c1482k;
        this.f19304r = i11;
        this.f19305s = z7;
        this.f19306t = z8;
        this.f19307u = i12;
        this.f19310x = i13;
        this.f19311y = i14;
        this.f19308v = z9;
        this.f19309w = z10;
        this.f19312z = j7;
        this.f19284A = j8;
        this.f19285B = j9;
        this.f19286C = j10;
        this.f19287D = p0Var;
        this.f19288E = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n1 r(int i7, Bundle bundle) {
        t2.P p7;
        E4.b0 b0VarO;
        E4.b0 b0VarO2;
        int i8;
        t2.h0 f0Var;
        int i9;
        t2.s0 s0Var;
        t2.J j3;
        float f7;
        E4.b0 b0VarF;
        C1636c c1636c;
        t2.s0 s0Var2;
        C1482k c1482kB;
        t2.p0 p0Var;
        IBinder binder = bundle.getBinder(f19283l0);
        if (binder instanceof m1) {
            return ((m1) binder).f19252c;
        }
        Bundle bundle2 = bundle.getBundle(f19272X);
        if (bundle2 == null) {
            p7 = null;
        } else {
            String string = bundle2.getString(t2.P.f16338t);
            String string2 = bundle2.getString(t2.P.f16339u);
            String string3 = bundle2.getString(t2.P.f16340v);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, t2.P.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i10 = bundle2.getInt(t2.P.f16336r, 1000);
            Bundle bundle3 = bundle2.getBundle(t2.P.f16341w);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            p7 = new t2.P(string, th, i10, bundle3, bundle2.getLong(t2.P.f16337s, SystemClock.elapsedRealtime()));
        }
        int i11 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(f19273Y);
        y1 y1VarB = bundle4 == null ? y1.l : y1.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        t2.W wC = bundle5 == null ? y1.f19407k : t2.W.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        t2.W wC2 = bundle6 == null ? y1.f19407k : t2.W.c(bundle6);
        int i12 = bundle.getInt(f19274c0, 0);
        Bundle bundle7 = bundle.getBundle(f19255G);
        t2.Q q7 = bundle7 == null ? t2.Q.f16345d : new t2.Q(bundle7.getFloat(t2.Q.f16346e, 1.0f), bundle7.getFloat(t2.Q.f16347f, 1.0f));
        int i13 = bundle.getInt(f19256H, 0);
        boolean z6 = bundle.getBoolean(f19257I, false);
        Bundle bundle8 = bundle.getBundle(f19258J);
        if (bundle8 == null) {
            f0Var = t2.h0.f16472a;
            i8 = 1;
        } else {
            t2.c0 c0Var = new t2.c0(0);
            IBinder binder2 = bundle8.getBinder(t2.h0.f16473b);
            if (binder2 == null) {
                E4.G g6 = E4.I.f1870p;
                b0VarO = E4.b0.f1913s;
            } else {
                b0VarO = AbstractC1697a.o(c0Var, BinderC1478g.a(binder2));
            }
            t2.c0 c0Var2 = new t2.c0(1);
            IBinder binder3 = bundle8.getBinder(t2.h0.f16474c);
            if (binder3 == null) {
                E4.G g7 = E4.I.f1870p;
                b0VarO2 = E4.b0.f1913s;
            } else {
                b0VarO2 = AbstractC1697a.o(c0Var2, BinderC1478g.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(t2.h0.f16475d);
            if (intArray == null) {
                int i14 = b0VarO.f1915r;
                i8 = 1;
                int[] iArr = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr[i15] = i15;
                }
                intArray = iArr;
            } else {
                i8 = 1;
            }
            f0Var = new t2.f0(b0VarO, b0VarO2, intArray);
        }
        int i16 = bundle.getInt(f19282k0, 0);
        Bundle bundle9 = bundle.getBundle(f19259K);
        if (bundle9 == null) {
            s0Var = t2.s0.f16725e;
            i9 = i16;
        } else {
            i9 = i16;
            s0Var = new t2.s0(bundle9.getInt(t2.s0.f16726f, 0), bundle9.getInt(t2.s0.f16727g, 0), bundle9.getInt(t2.s0.h, 0), bundle9.getFloat(t2.s0.f16728i, 1.0f));
        }
        Bundle bundle10 = bundle.getBundle(f19260L);
        t2.J jB = bundle10 == null ? t2.J.f16263J : t2.J.b(bundle10);
        float f8 = bundle.getFloat(f19261M, 1.0f);
        Bundle bundle11 = bundle.getBundle(f19262N);
        C1476e c1476eA = bundle11 == null ? C1476e.f16413g : C1476e.a(bundle11);
        Bundle bundle12 = bundle.getBundle(f19275d0);
        if (bundle12 == null) {
            c1636c = C1636c.f18271c;
            j3 = jB;
            f7 = f8;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(C1636c.f18272d);
            if (parcelableArrayList == null) {
                b0VarF = E4.b0.f1913s;
                j3 = jB;
                f7 = f8;
            } else {
                E4.F fO = E4.I.o();
                j3 = jB;
                f7 = f8;
                for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i17);
                    bundle13.getClass();
                    fO.a(C1635b.a(bundle13));
                }
                b0VarF = fO.f();
            }
            c1636c = new C1636c(b0VarF, bundle12.getLong(C1636c.f18273e));
        }
        Bundle bundle14 = bundle.getBundle(f19263O);
        if (bundle14 == null) {
            c1482kB = C1482k.f16499e;
            s0Var2 = s0Var;
        } else {
            int i18 = bundle14.getInt(C1482k.f16500f, 0);
            int i19 = bundle14.getInt(C1482k.f16501g, 0);
            s0Var2 = s0Var;
            int i20 = bundle14.getInt(C1482k.h, 0);
            String string4 = bundle14.getString(C1482k.f16502i);
            C0535h c0535h = new C0535h(i18);
            c0535h.f9480c = i19;
            c0535h.f9481d = i20;
            AbstractC1697a.d((i18 != 0 || string4 == null) ? i8 : 0);
            c0535h.f9482e = string4;
            c1482kB = c0535h.b();
        }
        int i21 = bundle.getInt(f19264P, 0);
        boolean z7 = bundle.getBoolean(f19265Q, false);
        boolean z8 = bundle.getBoolean(f19266R, false);
        int i22 = i8;
        int i23 = bundle.getInt(f19267S, i22);
        int i24 = bundle.getInt(f19268T, 0);
        int i25 = bundle.getInt(f19269U, i22);
        boolean z9 = bundle.getBoolean(f19270V, false);
        boolean z10 = bundle.getBoolean(f19271W, false);
        Bundle bundle15 = bundle.getBundle(f19276e0);
        t2.J jB2 = bundle15 == null ? t2.J.f16263J : t2.J.b(bundle15);
        long j7 = bundle.getLong(f19277f0, i7 < 4 ? 0L : 5000L);
        C1482k c1482k = c1482kB;
        long j8 = bundle.getLong(f19278g0, i7 < 4 ? 0L : 15000L);
        long j9 = bundle.getLong(f19279h0, i7 < 4 ? 0L : 3000L);
        Bundle bundle16 = bundle.getBundle(f19281j0);
        if (bundle16 == null) {
            p0Var = t2.p0.f16715b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(t2.p0.f16716c);
            p0Var = new t2.p0(parcelableArrayList2 == null ? E4.b0.f1913s : AbstractC1697a.o(new t2.c0(4), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(f19280i0);
        return new n1(p7, i11, y1VarB, wC, wC2, i12, q7, i13, z6, s0Var2, f0Var, i9, j3, f7, c1476eA, c1636c, c1482k, i21, z7, z8, i23, i24, i25, z9, z10, jB2, j7, j8, j9, p0Var, bundle17 == null ? t2.n0.f16553C : t2.n0.b(bundle17));
    }

    public final n1 a(C1476e c1476e) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, c1476e, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 b(t2.p0 p0Var) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, p0Var, this.f19288E);
    }

    public final n1 c(int i7, boolean z6) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, i7, z6, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 d(int i7, int i8, boolean z6) {
        boolean z7 = this.f19311y == 3 && z6 && i8 == 0;
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, z6, i7, i8, this.f19311y, z7, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 e(t2.Q q7) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, q7, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 f(int i7, t2.P p7) {
        boolean z6 = i7 == 3 && this.f19306t && this.f19310x == 0;
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(p7, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, i7, z6, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 g(t2.J j3) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, j3, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 h(t2.W w7, t2.W w8, int i7) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, w7, w8, i7, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 i(int i7) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, i7, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 j(y1 y1Var) {
        t2.h0 h0Var = this.f19297j;
        AbstractC1697a.i(h0Var.p() || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 k(boolean z6) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, z6, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 l(t2.h0 h0Var) {
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 m(t1 t1Var, int i7) {
        y1 y1Var = this.f19291c;
        t2.W w7 = y1Var.f19418a;
        y1 y1Var2 = new y1(new t2.W(w7.f16363a, i7, w7.f16365c, w7.f16366d, w7.f16367e, w7.f16368f, w7.f16369g, w7.h, w7.f16370i), y1Var.f19419b, y1Var.f19420c, y1Var.f19421d, y1Var.f19422e, y1Var.f19423f, y1Var.f19424g, y1Var.h, y1Var.f19425i, y1Var.f19426j);
        AbstractC1697a.i(t1Var.p() || y1Var2.f19418a.f16364b < t1Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var2, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, t1Var, 0, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 n(t2.h0 h0Var, y1 y1Var, int i7) {
        AbstractC1697a.i(h0Var.p() || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, i7, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 o(t2.n0 n0Var) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, this.f19300n, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, n0Var);
    }

    public final n1 p(float f7) {
        t2.h0 h0Var = this.f19297j;
        boolean zP = h0Var.p();
        y1 y1Var = this.f19291c;
        AbstractC1697a.i(zP || y1Var.f19418a.f16364b < h0Var.o());
        return new n1(this.f19289a, this.f19290b, y1Var, this.f19292d, this.f19293e, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, this.f19299m, f7, this.f19301o, this.f19302p, this.f19303q, this.f19304r, this.f19305s, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, this.f19312z, this.f19284A, this.f19285B, this.f19286C, this.f19287D, this.f19288E);
    }

    public final n1 q(t2.T t7, boolean z6, boolean z7) {
        int i7;
        boolean z8;
        int i8;
        boolean zA = t7.a(16);
        boolean zA2 = t7.a(17);
        y1 y1Var = this.f19291c;
        y1 y1VarA = y1Var.a(zA, zA2);
        t2.W wB = this.f19292d.b(zA, zA2);
        t2.W wB2 = this.f19293e.b(zA, zA2);
        boolean z9 = true;
        t2.h0 f0Var = this.f19297j;
        if (!zA2 && zA && !f0Var.p()) {
            int i9 = y1Var.f19418a.f16364b;
            if (f0Var.o() != 1) {
                t2.g0 g0VarM = f0Var.m(i9, new t2.g0(), 0L);
                E4.F fO = E4.I.o();
                int i10 = g0VarM.f16464m;
                while (true) {
                    i8 = g0VarM.f16465n;
                    if (i10 > i8) {
                        break;
                    }
                    t2.e0 e0VarF = f0Var.f(i10, new t2.e0(), true);
                    e0VarF.f16428c = 0;
                    fO.a(e0VarF);
                    i10++;
                }
                g0VarM.f16465n = i8 - g0VarM.f16464m;
                g0VarM.f16464m = 0;
                f0Var = new t2.f0(E4.I.t(g0VarM), fO.f(), new int[]{0});
            }
        } else if (z6 || !zA2) {
            f0Var = t2.h0.f16472a;
        }
        t2.h0 h0Var = f0Var;
        t2.J j3 = !t7.a(18) ? t2.J.f16263J : this.f19299m;
        float f7 = !t7.a(22) ? 1.0f : this.f19300n;
        C1476e c1476e = !t7.a(21) ? C1476e.f16413g : this.f19301o;
        C1636c c1636c = !t7.a(28) ? C1636c.f18271c : this.f19302p;
        if (t7.a(23)) {
            i7 = this.f19304r;
            z8 = this.f19305s;
        } else {
            i7 = 0;
            z8 = false;
        }
        t2.J j7 = !t7.a(18) ? t2.J.f16263J : this.f19312z;
        t2.p0 p0Var = (z7 || !t7.a(30)) ? t2.p0.f16715b : this.f19287D;
        if (!h0Var.p() && y1VarA.f19418a.f16364b >= h0Var.o()) {
            z9 = false;
        }
        AbstractC1697a.i(z9);
        return new n1(this.f19289a, this.f19290b, y1VarA, wB, wB2, this.f19294f, this.f19295g, this.h, this.f19296i, this.l, h0Var, this.f19298k, j3, f7, c1476e, c1636c, this.f19303q, i7, z8, this.f19306t, this.f19307u, this.f19310x, this.f19311y, this.f19308v, this.f19309w, j7, this.f19284A, this.f19285B, this.f19286C, p0Var, this.f19288E);
    }

    public final t2.G s() {
        t2.h0 h0Var = this.f19297j;
        if (h0Var.p()) {
            return null;
        }
        return h0Var.m(this.f19291c.f19418a.f16364b, new t2.g0(), 0L).f16456c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bundle t(int i7) {
        long j3;
        boolean z6;
        int i8;
        t2.e0 e0Var;
        int i9;
        int i10;
        Bundle bundleB;
        long j7;
        Bundle bundle = new Bundle();
        t2.P p7 = this.f19289a;
        if (p7 != null) {
            bundle.putBundle(f19272X, p7.b());
        }
        int i11 = this.f19290b;
        if (i11 != 0) {
            bundle.putInt(Z, i11);
        }
        y1 y1Var = this.f19291c;
        if (i7 < 3 || !y1Var.equals(y1.l)) {
            bundle.putBundle(f19273Y, y1Var.c(i7));
        }
        t2.W w7 = this.f19292d;
        if (i7 < 3 || !y1.f19407k.a(w7)) {
            bundle.putBundle(a0, w7.d(i7));
        }
        t2.W w8 = this.f19293e;
        if (i7 < 3 || !y1.f19407k.a(w8)) {
            bundle.putBundle(b0, w8.d(i7));
        }
        int i12 = this.f19294f;
        if (i12 != 0) {
            bundle.putInt(f19274c0, i12);
        }
        t2.Q q7 = t2.Q.f16345d;
        t2.Q q8 = this.f19295g;
        if (!q8.equals(q7)) {
            Bundle bundle2 = new Bundle();
            bundle2.putFloat(t2.Q.f16346e, q8.f16348a);
            bundle2.putFloat(t2.Q.f16347f, q8.f16349b);
            bundle.putBundle(f19255G, bundle2);
        }
        int i13 = this.h;
        if (i13 != 0) {
            bundle.putInt(f19256H, i13);
        }
        boolean z7 = this.f19296i;
        if (z7) {
            bundle.putBoolean(f19257I, z7);
        }
        t2.d0 d0Var = t2.h0.f16472a;
        t2.h0 h0Var = this.f19297j;
        boolean z8 = false;
        long j8 = 0;
        if (h0Var.equals(d0Var)) {
            j3 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iO = h0Var.o();
            t2.g0 g0Var = new t2.g0();
            int i14 = 0;
            while (i14 < iO) {
                t2.g0 g0VarM = h0Var.m(i14, g0Var, j8);
                g0VarM.getClass();
                Bundle bundle3 = new Bundle();
                long j9 = j8;
                if (!t2.G.f16218g.equals(g0VarM.f16456c)) {
                    bundle3.putBundle(t2.g0.f16446s, g0VarM.f16456c.b(false));
                }
                long j10 = g0VarM.f16457d;
                if (j10 != -9223372036854775807L) {
                    j7 = -9223372036854775807L;
                    bundle3.putLong(t2.g0.f16447t, j10);
                } else {
                    j7 = -9223372036854775807L;
                }
                long j11 = g0VarM.f16458e;
                if (j11 != j7) {
                    bundle3.putLong(t2.g0.f16448u, j11);
                }
                long j12 = g0VarM.f16459f;
                if (j12 != j7) {
                    bundle3.putLong(t2.g0.f16449v, j12);
                }
                boolean z9 = g0VarM.f16460g;
                if (z9) {
                    bundle3.putBoolean(t2.g0.f16450w, z9);
                }
                boolean z10 = g0VarM.h;
                if (z10) {
                    bundle3.putBoolean(t2.g0.f16451x, z10);
                }
                C1468A c1468a = g0VarM.f16461i;
                if (c1468a != null) {
                    bundle3.putBundle(t2.g0.f16452y, c1468a.c());
                }
                boolean z11 = g0VarM.f16462j;
                if (z11) {
                    bundle3.putBoolean(t2.g0.f16453z, z11);
                }
                long j13 = g0VarM.f16463k;
                if (j13 != j9) {
                    bundle3.putLong(t2.g0.f16438A, j13);
                }
                long j14 = g0VarM.l;
                if (j14 != j7) {
                    bundle3.putLong(t2.g0.f16439B, j14);
                }
                int i15 = g0VarM.f16464m;
                if (i15 != 0) {
                    bundle3.putInt(t2.g0.f16440C, i15);
                }
                int i16 = g0VarM.f16465n;
                if (i16 != 0) {
                    bundle3.putInt(t2.g0.f16441D, i16);
                }
                long j15 = g0VarM.f16466o;
                if (j15 != j9) {
                    bundle3.putLong(t2.g0.f16442E, j15);
                }
                arrayList.add(bundle3);
                i14++;
                j8 = j9;
            }
            j3 = j8;
            ArrayList arrayList2 = new ArrayList();
            int iH = h0Var.h();
            t2.e0 e0Var2 = new t2.e0();
            int i17 = 0;
            while (i17 < iH) {
                t2.e0 e0VarF = h0Var.f(i17, e0Var2, z8);
                e0VarF.getClass();
                Bundle bundle4 = new Bundle();
                int i18 = e0VarF.f16428c;
                if (i18 != 0) {
                    bundle4.putInt(t2.e0.h, i18);
                }
                long j16 = e0VarF.f16429d;
                if (j16 != -9223372036854775807L) {
                    z6 = z8;
                    bundle4.putLong(t2.e0.f16423i, j16);
                } else {
                    z6 = z8;
                }
                long j17 = e0VarF.f16430e;
                if (j17 != j3) {
                    bundle4.putLong(t2.e0.f16424j, j17);
                }
                boolean z12 = e0VarF.f16431f;
                if (z12) {
                    bundle4.putBoolean(t2.e0.f16425k, z12);
                }
                if (e0VarF.f16432g.equals(C1473b.f16398f)) {
                    i8 = iH;
                    e0Var = e0Var2;
                    i9 = i17;
                } else {
                    C1473b c1473b = e0VarF.f16432g;
                    c1473b.getClass();
                    Bundle bundle5 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    C1472a[] c1472aArr = c1473b.f16407e;
                    int length = c1472aArr.length;
                    i8 = iH;
                    ?? r8 = z6;
                    while (r8 < length) {
                        int i19 = length;
                        C1472a c1472a = c1472aArr[r8];
                        c1472a.getClass();
                        ?? r23 = r8;
                        Bundle bundle6 = new Bundle();
                        t2.e0 e0Var3 = e0Var2;
                        bundle6.putLong(C1472a.f16376j, c1472a.f16384a);
                        bundle6.putInt(C1472a.f16377k, c1472a.f16385b);
                        bundle6.putInt(C1472a.f16382q, c1472a.f16386c);
                        bundle6.putParcelableArrayList(C1472a.l, new ArrayList<>(Arrays.asList(c1472a.f16387d)));
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        t2.G[] gArr = c1472a.f16388e;
                        int length2 = gArr.length;
                        ?? r12 = z6;
                        while (r12 < length2) {
                            ?? r26 = r12;
                            t2.G g6 = gArr[r26 == true ? 1 : 0];
                            if (g6 == null) {
                                bundleB = null;
                                i10 = length2;
                            } else {
                                i10 = length2;
                                bundleB = g6.b(true);
                            }
                            arrayList4.add(bundleB);
                            length2 = i10;
                            r12 = (r26 == true ? 1 : 0) + 1;
                        }
                        bundle6.putParcelableArrayList(C1472a.f16383r, arrayList4);
                        bundle6.putIntArray(C1472a.f16378m, c1472a.f16389f);
                        bundle6.putLongArray(C1472a.f16379n, c1472a.f16390g);
                        bundle6.putLong(C1472a.f16380o, c1472a.h);
                        bundle6.putBoolean(C1472a.f16381p, c1472a.f16391i);
                        arrayList3.add(bundle6);
                        i17 = i17;
                        length = i19;
                        e0Var2 = e0Var3;
                        r8 = (r23 == true ? 1 : 0) + 1;
                    }
                    e0Var = e0Var2;
                    i9 = i17;
                    if (!arrayList3.isEmpty()) {
                        bundle5.putParcelableArrayList(C1473b.h, arrayList3);
                    }
                    long j18 = c1473b.f16404b;
                    if (j18 != j3) {
                        bundle5.putLong(C1473b.f16400i, j18);
                    }
                    long j19 = c1473b.f16405c;
                    if (j19 != -9223372036854775807L) {
                        bundle5.putLong(C1473b.f16401j, j19);
                    }
                    int i20 = c1473b.f16406d;
                    if (i20 != 0) {
                        bundle5.putInt(C1473b.f16402k, i20);
                    }
                    bundle4.putBundle(t2.e0.l, bundle5);
                }
                arrayList2.add(bundle4);
                i17 = i9 + 1;
                z8 = z6;
                iH = i8;
                e0Var2 = e0Var;
            }
            boolean z13 = z8;
            int[] iArr = new int[iO];
            boolean z14 = true;
            if (iO > 0) {
                iArr[z13 ? 1 : 0] = h0Var.a(true);
            }
            int i21 = 1;
            while (i21 < iO) {
                iArr[i21] = h0Var.e(iArr[i21 - 1], z13 ? 1 : 0, z14);
                i21++;
                z14 = true;
                z13 = false;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putBinder(t2.h0.f16473b, new BinderC1478g(arrayList));
            bundle7.putBinder(t2.h0.f16474c, new BinderC1478g(arrayList2));
            bundle7.putIntArray(t2.h0.f16475d, iArr);
            bundle.putBundle(f19258J, bundle7);
        }
        int i22 = this.f19298k;
        if (i22 != 0) {
            bundle.putInt(f19282k0, i22);
        }
        t2.s0 s0Var = t2.s0.f16725e;
        t2.s0 s0Var2 = this.l;
        if (!s0Var2.equals(s0Var)) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt(t2.s0.f16726f, s0Var2.f16729a);
            bundle8.putInt(t2.s0.f16727g, s0Var2.f16730b);
            bundle8.putInt(t2.s0.h, s0Var2.f16731c);
            bundle8.putFloat(t2.s0.f16728i, s0Var2.f16732d);
            bundle.putBundle(f19259K, bundle8);
        }
        t2.J j20 = t2.J.f16263J;
        t2.J j21 = this.f19299m;
        if (!j21.equals(j20)) {
            bundle.putBundle(f19260L, j21.c());
        }
        float f7 = this.f19300n;
        if (f7 != 1.0f) {
            bundle.putFloat(f19261M, f7);
        }
        C1476e c1476e = C1476e.f16413g;
        C1476e c1476e2 = this.f19301o;
        if (!c1476e2.equals(c1476e)) {
            bundle.putBundle(f19262N, c1476e2.c());
        }
        C1636c c1636c = C1636c.f18271c;
        C1636c c1636c2 = this.f19302p;
        if (!c1636c2.equals(c1636c)) {
            Bundle bundle9 = new Bundle();
            E4.F fO = E4.I.o();
            int i23 = 0;
            while (true) {
                E4.I i24 = c1636c2.f18274a;
                if (i23 >= i24.size()) {
                    break;
                }
                if (((C1635b) i24.get(i23)).f18259d == null) {
                    fO.a((C1635b) i24.get(i23));
                }
                i23++;
            }
            E4.b0 b0VarF = fO.f();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(b0VarF.f1915r);
            E4.G gListIterator = b0VarF.listIterator(0);
            while (gListIterator.hasNext()) {
                C1635b c1635b = (C1635b) gListIterator.next();
                Bundle bundleB2 = c1635b.b();
                Bitmap bitmap = c1635b.f18259d;
                if (bitmap != null) {
                    bundleB2.putParcelable(C1635b.f18251v, bitmap);
                }
                arrayList5.add(bundleB2);
            }
            bundle9.putParcelableArrayList(C1636c.f18272d, arrayList5);
            bundle9.putLong(C1636c.f18273e, c1636c2.f18275b);
            bundle.putBundle(f19275d0, bundle9);
        }
        C1482k c1482k = C1482k.f16499e;
        C1482k c1482k2 = this.f19303q;
        if (!c1482k2.equals(c1482k)) {
            Bundle bundle10 = new Bundle();
            int i25 = c1482k2.f16503a;
            if (i25 != 0) {
                bundle10.putInt(C1482k.f16500f, i25);
            }
            int i26 = c1482k2.f16504b;
            if (i26 != 0) {
                bundle10.putInt(C1482k.f16501g, i26);
            }
            int i27 = c1482k2.f16505c;
            if (i27 != 0) {
                bundle10.putInt(C1482k.h, i27);
            }
            String str = c1482k2.f16506d;
            if (str != null) {
                bundle10.putString(C1482k.f16502i, str);
            }
            bundle.putBundle(f19263O, bundle10);
        }
        int i28 = this.f19304r;
        if (i28 != 0) {
            bundle.putInt(f19264P, i28);
        }
        boolean z15 = this.f19305s;
        if (z15) {
            bundle.putBoolean(f19265Q, z15);
        }
        boolean z16 = this.f19306t;
        if (z16) {
            bundle.putBoolean(f19266R, z16);
        }
        int i29 = this.f19307u;
        if (i29 != 1) {
            bundle.putInt(f19267S, i29);
        }
        int i30 = this.f19310x;
        if (i30 != 0) {
            bundle.putInt(f19268T, i30);
        }
        int i31 = this.f19311y;
        if (i31 != 1) {
            bundle.putInt(f19269U, i31);
        }
        boolean z17 = this.f19308v;
        if (z17) {
            bundle.putBoolean(f19270V, z17);
        }
        boolean z18 = this.f19309w;
        if (z18) {
            bundle.putBoolean(f19271W, z18);
        }
        t2.J j22 = t2.J.f16263J;
        t2.J j23 = this.f19312z;
        if (!j23.equals(j22)) {
            bundle.putBundle(f19276e0, j23.c());
        }
        long j24 = i7 < 6 ? j3 : 5000L;
        long j25 = this.f19284A;
        if (j25 != j24) {
            bundle.putLong(f19277f0, j25);
        }
        long j26 = i7 < 6 ? j3 : 15000L;
        long j27 = this.f19285B;
        if (j27 != j26) {
            bundle.putLong(f19278g0, j27);
        }
        long j28 = i7 < 6 ? j3 : 3000L;
        long j29 = this.f19286C;
        if (j29 != j28) {
            bundle.putLong(f19279h0, j29);
        }
        t2.p0 p0Var = t2.p0.f16715b;
        t2.p0 p0Var2 = this.f19287D;
        if (!p0Var2.equals(p0Var)) {
            Bundle bundle11 = new Bundle();
            bundle11.putParcelableArrayList(t2.p0.f16716c, AbstractC1697a.v(p0Var2.f16717a, new t2.c0(3)));
            bundle.putBundle(f19281j0, bundle11);
        }
        t2.n0 n0Var = t2.n0.f16553C;
        t2.n0 n0Var2 = this.f19288E;
        if (!n0Var2.equals(n0Var)) {
            bundle.putBundle(f19280i0, n0Var2.c());
        }
        return bundle;
    }
}
