package N2;

import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public class r implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5070c;

    public /* synthetic */ r(int i7, long j3, Object obj) {
        this.f5068a = i7;
        this.f5070c = obj;
        this.f5069b = j3;
    }

    @Override // N2.B
    public final boolean h() {
        switch (this.f5068a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // N2.B
    public final A j(long j3) {
        switch (this.f5068a) {
            case 0:
                s sVar = (s) this.f5070c;
                AbstractC1697a.j(sVar.f5080k);
                V.o oVar = sVar.f5080k;
                long[] jArr = (long[]) oVar.f7342p;
                int iD = w2.t.d(jArr, w2.t.h((((long) sVar.f5075e) * j3) / 1000000, 0L, sVar.f5079j - 1), false);
                long j7 = iD == -1 ? 0L : jArr[iD];
                long[] jArr2 = (long[]) oVar.f7343q;
                long j8 = iD != -1 ? jArr2[iD] : 0L;
                int i7 = sVar.f5075e;
                long j9 = (j7 * 1000000) / ((long) i7);
                long j10 = this.f5069b;
                C c7 = new C(j9, j8 + j10);
                if (j9 == j3 || iD == jArr.length - 1) {
                    return new A(c7, c7);
                }
                int i8 = iD + 1;
                return new A(c7, new C((jArr[i8] * 1000000) / ((long) i7), j10 + jArr2[i8]));
            case 1:
                return (A) this.f5070c;
            default:
                P2.b bVar = (P2.b) this.f5070c;
                A aB = bVar.f5718i[0].b(j3);
                int i9 = 1;
                while (true) {
                    P2.e[] eVarArr = bVar.f5718i;
                    if (i9 >= eVarArr.length) {
                        return aB;
                    }
                    A aB2 = eVarArr[i9].b(j3);
                    if (aB2.f4963a.f4967b < aB.f4963a.f4967b) {
                        aB = aB2;
                    }
                    i9++;
                }
                break;
        }
    }

    @Override // N2.B
    public final long l() {
        switch (this.f5068a) {
        }
        return this.f5069b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(long j3) {
        this(j3, 0L);
        this.f5068a = 1;
    }

    public r(long j3, long j7) {
        this.f5068a = 1;
        this.f5069b = j3;
        C c7 = j7 == 0 ? C.f4965c : new C(0L, j7);
        this.f5070c = new A(c7, c7);
    }
}
