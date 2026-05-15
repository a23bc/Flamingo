package r1;

import r0.C1385c;
import r0.C1390h;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1407a implements InterfaceC1404C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f15664o;

    public C1407a(long j3) {
        this.f15664o = j3;
    }

    @Override // r1.InterfaceC1404C
    public final long c(n1.l lVar, long j3, n1.n nVar, long j7) {
        int i7 = lVar.f14518c - lVar.f14516a;
        int i8 = lVar.f14519d - lVar.f14517b;
        C1390h c1390h = C1385c.f15612o;
        long jA = c1390h.a(0L, (((long) i7) << 32) | (((long) i8) & 4294967295L), nVar);
        long jA2 = c1390h.a(0L, j7, nVar);
        long j8 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j9 = this.f15664o;
        return n1.k.d(n1.k.d(n1.k.d(lVar.a(), jA), j8), (4294967295L & ((long) ((int) (j9 & 4294967295L)))) | (((long) (((int) (j9 >> 32)) * (nVar == n1.n.f14521o ? 1 : -1))) << 32));
    }
}
