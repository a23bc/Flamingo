package O2;

import D4.d;
import E4.G;
import E4.I;
import E4.b0;
import N2.B;
import N2.C0293j;
import N2.H;
import N2.m;
import N2.n;
import N2.o;
import g3.C0987a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import t2.N;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5590n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f5592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f5593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f5594r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5600f;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f5603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public H f5604k;
    public B l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5605m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5595a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5601g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f5591o = iArr;
        int i7 = t.f18881a;
        Charset charset = d.f1569c;
        f5592p = "#!AMR\n".getBytes(charset);
        f5593q = "#!AMR-WB\n".getBytes(charset);
        f5594r = iArr[8];
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f5603j = oVar;
        this.f5604k = oVar.E(0, 1);
        oVar.k();
    }

    public final int d(C0293j c0293j) throws N {
        boolean z6;
        c0293j.f5056t = 0;
        byte[] bArr = this.f5595a;
        c0293j.i(bArr, 0, 1, false);
        byte b7 = bArr[0];
        if ((b7 & 131) > 0) {
            throw N.a(null, "Invalid padding bits for frame header " + ((int) b7));
        }
        int i7 = (b7 >> 3) & 15;
        if (i7 >= 0 && i7 <= 15 && (((z6 = this.f5596b) && (i7 < 10 || i7 > 13)) || (!z6 && (i7 < 12 || i7 > 14)))) {
            return z6 ? f5591o[i7] : f5590n[i7];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f5596b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        throw N.a(null, sb.toString());
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.f5597c = 0L;
        this.f5598d = 0;
        this.f5599e = 0;
        if (j3 != 0) {
            B b7 = this.l;
            if (b7 instanceof C0987a) {
                C0987a c0987a = (C0987a) b7;
                this.f5602i = (Math.max(0L, j3 - c0987a.f12459b) * 8000000) / ((long) c0987a.f12462e);
                return;
            }
        }
        this.f5602i = 0L;
    }

    @Override // N2.m
    public final List f() {
        G g6 = I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r10, N2.q r11) throws t2.N {
        /*
            r9 = this;
            N2.H r11 = r9.f5604k
            w2.AbstractC1697a.j(r11)
            int r11 = w2.t.f18881a
            r11 = r10
            N2.j r11 = (N2.C0293j) r11
            long r0 = r11.f5054r
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 != 0) goto L24
            r11 = r10
            N2.j r11 = (N2.C0293j) r11
            boolean r11 = r9.h(r11)
            if (r11 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r10 = "Could not find AMR header."
            r11 = 0
            t2.N r10 = t2.N.a(r11, r10)
            throw r10
        L24:
            boolean r11 = r9.f5605m
            r0 = 1
            if (r11 != 0) goto L58
            r9.f5605m = r0
            boolean r11 = r9.f5596b
            if (r11 == 0) goto L32
            java.lang.String r1 = "audio/amr-wb"
            goto L34
        L32:
            java.lang.String r1 = "audio/3gpp"
        L34:
            if (r11 == 0) goto L39
            r11 = 16000(0x3e80, float:2.2421E-41)
            goto L3b
        L39:
            r11 = 8000(0x1f40, float:1.121E-41)
        L3b:
            N2.H r2 = r9.f5604k
            t2.o r3 = new t2.o
            r3.<init>()
            java.lang.String r1 = t2.M.j(r1)
            r3.l = r1
            int r1 = O2.a.f5594r
            r3.f16627m = r1
            r3.f16640z = r0
            r3.f16608A = r11
            t2.p r11 = new t2.p
            r11.<init>(r3)
            r2.e(r11)
        L58:
            int r11 = r9.f5599e
            r1 = -1
            if (r11 != 0) goto L7c
            r11 = r10
            N2.j r11 = (N2.C0293j) r11     // Catch: java.io.EOFException -> La6
            int r11 = r9.d(r11)     // Catch: java.io.EOFException -> La6
            r9.f5598d = r11     // Catch: java.io.EOFException -> La6
            r9.f5599e = r11
            int r2 = r9.f5601g
            if (r2 != r1) goto L73
            r2 = r10
            N2.j r2 = (N2.C0293j) r2
            long r2 = r2.f5054r
            r9.f5601g = r11
        L73:
            int r2 = r9.f5601g
            if (r2 != r11) goto L7c
            int r11 = r9.h
            int r11 = r11 + r0
            r9.h = r11
        L7c:
            N2.H r11 = r9.f5604k
            int r2 = r9.f5599e
            int r10 = r11.a(r10, r2, r0)
            if (r10 != r1) goto L87
            goto La6
        L87:
            int r11 = r9.f5599e
            int r11 = r11 - r10
            r9.f5599e = r11
            r1 = 0
            if (r11 <= 0) goto L90
            goto La6
        L90:
            N2.H r2 = r9.f5604k
            long r10 = r9.f5602i
            long r3 = r9.f5597c
            long r3 = r3 + r10
            int r6 = r9.f5598d
            r5 = 1
            r7 = 0
            r8 = 0
            r2.f(r3, r5, r6, r7, r8)
            long r10 = r9.f5597c
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r10 = r10 + r2
            r9.f5597c = r10
        La6:
            boolean r10 = r9.f5600f
            if (r10 == 0) goto Lab
            goto Lbe
        Lab:
            N2.r r10 = new N2.r
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.<init>(r2)
            r9.l = r10
            N2.o r11 = r9.f5603j
            r11.H(r10)
            r9.f5600f = r0
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.g(N2.n, N2.q):int");
    }

    public final boolean h(C0293j c0293j) {
        c0293j.f5056t = 0;
        byte[] bArr = f5592p;
        byte[] bArr2 = new byte[bArr.length];
        c0293j.i(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f5596b = false;
            c0293j.g(bArr.length);
            return true;
        }
        c0293j.f5056t = 0;
        byte[] bArr3 = f5593q;
        byte[] bArr4 = new byte[bArr3.length];
        c0293j.i(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f5596b = true;
        c0293j.g(bArr3.length);
        return true;
    }

    @Override // N2.m
    public final boolean m(n nVar) {
        return h((C0293j) nVar);
    }

    @Override // N2.m
    public final void a() {
    }
}
