package u3;

import N2.H;
import N2.o;
import g1.C0966h;
import java.math.RoundingMode;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.N;
import w2.m;
import w2.t;

/* JADX INFO: renamed from: u3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531a implements InterfaceC1532b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f17249m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f17250n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f17251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f17252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0966h f17253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f17255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f17256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17257g;
    public final C1487p h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17260k;
    public long l;

    public C1531a(o oVar, H h, C0966h c0966h) throws N {
        this.f17251a = oVar;
        this.f17252b = h;
        this.f17253c = c0966h;
        int i7 = c0966h.f12356q;
        int iMax = Math.max(1, i7 / 10);
        this.f17257g = iMax;
        m mVar = new m((byte[]) c0966h.f12359t);
        mVar.n();
        int iN = mVar.n();
        this.f17254d = iN;
        int i8 = c0966h.f12355p;
        int i9 = c0966h.f12357r;
        int i10 = (((i9 - (i8 * 4)) * 8) / (c0966h.f12358s * i8)) + 1;
        if (iN != i10) {
            throw N.a(null, "Expected frames per block: " + i10 + "; got: " + iN);
        }
        int iE = t.e(iMax, iN);
        this.f17255e = new byte[iE * i9];
        this.f17256f = new m(iN * 2 * i8 * iE);
        int i11 = ((i9 * i7) * 8) / iN;
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("audio/raw");
        c1486o.f16623g = i11;
        c1486o.h = i11;
        c1486o.f16627m = iMax * 2 * i8;
        c1486o.f16640z = i8;
        c1486o.f16608A = i7;
        c1486o.f16609B = 2;
        this.h = new C1487p(c1486o);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // u3.InterfaceC1532b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N2.C0293j r25, long r26) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C1531a.a(N2.j, long):boolean");
    }

    @Override // u3.InterfaceC1532b
    public final void b(long j3, int i7) {
        this.f17251a.H(new C1535e(this.f17253c, this.f17254d, i7, j3));
        this.f17252b.e(this.h);
    }

    @Override // u3.InterfaceC1532b
    public final void c(long j3) {
        this.f17258i = 0;
        this.f17259j = j3;
        this.f17260k = 0;
        this.l = 0L;
    }

    public final void d(int i7) {
        long j3 = this.f17259j;
        long j7 = this.l;
        C0966h c0966h = this.f17253c;
        long j8 = c0966h.f12356q;
        int i8 = t.f18881a;
        long J6 = j3 + t.J(j7, 1000000L, j8, RoundingMode.FLOOR);
        int i9 = i7 * 2 * c0966h.f12355p;
        this.f17252b.f(J6, 1, i9, this.f17260k - i9, null);
        this.l += (long) i7;
        this.f17260k -= i9;
    }
}
