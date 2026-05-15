package P2;

import N2.A;
import N2.C;
import N2.H;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public final H f5733a;

    /* JADX INFO: renamed from: b */
    public final int f5734b;

    /* JADX INFO: renamed from: c */
    public final int f5735c;

    /* JADX INFO: renamed from: d */
    public final long f5736d;

    /* JADX INFO: renamed from: e */
    public final int f5737e;

    /* JADX INFO: renamed from: f */
    public int f5738f;

    /* JADX INFO: renamed from: g */
    public int f5739g;
    public int h;

    /* JADX INFO: renamed from: i */
    public int f5740i;

    /* JADX INFO: renamed from: j */
    public int f5741j;

    /* JADX INFO: renamed from: k */
    public long[] f5742k;
    public int[] l;

    public e(int i7, int i8, long j3, int i9, H h) {
        boolean z6 = true;
        if (i8 != 1 && i8 != 2) {
            z6 = false;
        }
        AbstractC1697a.d(z6);
        this.f5736d = j3;
        this.f5737e = i9;
        this.f5733a = h;
        int i10 = (((i7 % 10) + 48) << 8) | ((i7 / 10) + 48);
        this.f5734b = (i8 == 2 ? 1667497984 : 1651965952) | i10;
        this.f5735c = i8 == 2 ? i10 | 1650720768 : -1;
        this.f5742k = new long[512];
        this.l = new int[512];
    }

    public final C a(int i7) {
        return new C(((this.f5736d * ((long) 1)) / ((long) this.f5737e)) * ((long) this.l[i7]), this.f5742k[i7]);
    }

    public final A b(long j3) {
        int i7 = (int) (j3 / ((this.f5736d * ((long) 1)) / ((long) this.f5737e)));
        int iC = t.c(this.l, i7, true, true);
        if (this.l[iC] == i7) {
            C cA = a(iC);
            return new A(cA, cA);
        }
        C cA2 = a(iC);
        int i8 = iC + 1;
        return i8 < this.f5742k.length ? new A(cA2, a(i8)) : new A(cA2, cA2);
    }
}
