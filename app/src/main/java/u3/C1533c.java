package u3;

import N2.C0293j;
import N2.H;
import N2.o;
import g1.C0966h;
import java.math.RoundingMode;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.N;
import w2.t;

/* JADX INFO: renamed from: u3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1533c implements InterfaceC1532b {

    /* JADX INFO: renamed from: a */
    public int f17261a;

    /* JADX INFO: renamed from: b */
    public long f17262b;

    /* JADX INFO: renamed from: c */
    public long f17263c;

    /* JADX INFO: renamed from: d */
    public int f17264d;

    /* JADX INFO: renamed from: e */
    public Object f17265e;

    /* JADX INFO: renamed from: f */
    public Object f17266f;

    /* JADX INFO: renamed from: g */
    public Object f17267g;
    public Object h;

    public C1533c(o oVar, H h, C0966h c0966h, String str, int i7) throws N {
        this.f17265e = oVar;
        this.f17266f = h;
        this.f17267g = c0966h;
        int i8 = c0966h.f12358s;
        int i9 = c0966h.f12355p;
        int i10 = (i8 * i9) / 8;
        int i11 = c0966h.f12357r;
        if (i11 != i10) {
            throw N.a(null, "Expected block size: " + i10 + "; got: " + i11);
        }
        int i12 = c0966h.f12356q;
        int i13 = i12 * i10;
        int i14 = i13 * 8;
        int iMax = Math.max(i10, i13 / 10);
        this.f17261a = iMax;
        C1486o c1486o = new C1486o();
        c1486o.l = M.j(str);
        c1486o.f16623g = i14;
        c1486o.h = i14;
        c1486o.f16627m = iMax;
        c1486o.f16640z = i9;
        c1486o.f16608A = i12;
        c1486o.f16609B = i7;
        this.h = new C1487p(c1486o);
    }

    @Override // u3.InterfaceC1532b
    public boolean a(C0293j c0293j, long j3) {
        int i7;
        int i8;
        long j7 = j3;
        while (j7 > 0 && (i7 = this.f17264d) < (i8 = this.f17261a)) {
            int iA = ((H) this.f17266f).a(c0293j, (int) Math.min(i8 - i7, j7), true);
            if (iA == -1) {
                j7 = 0;
            } else {
                this.f17264d += iA;
                j7 -= (long) iA;
            }
        }
        C0966h c0966h = (C0966h) this.f17267g;
        int i9 = this.f17264d;
        int i10 = c0966h.f12357r;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long j8 = this.f17262b;
            long j9 = this.f17263c;
            long j10 = c0966h.f12356q;
            int i12 = t.f18881a;
            long J6 = j8 + t.J(j9, 1000000L, j10, RoundingMode.FLOOR);
            int i13 = i11 * i10;
            int i14 = this.f17264d - i13;
            ((H) this.f17266f).f(J6, 1, i13, i14, null);
            this.f17263c += (long) i11;
            this.f17264d = i14;
        }
        return j7 <= 0;
    }

    @Override // u3.InterfaceC1532b
    public void b(long j3, int i7) {
        ((o) this.f17265e).H(new C1535e((C0966h) this.f17267g, 1, i7, j3));
        ((H) this.f17266f).e((C1487p) this.h);
    }

    @Override // u3.InterfaceC1532b
    public void c(long j3) {
        this.f17262b = j3;
        this.f17264d = 0;
        this.f17263c = 0L;
    }
}
