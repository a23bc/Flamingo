package X;

import r0.InterfaceC1386d;
import r1.InterfaceC1404C;

/* JADX INFO: renamed from: X.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0486l implements InterfaceC1404C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1386d f8097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC0494p f8098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8099q = 0;

    public C0486l(InterfaceC1386d interfaceC1386d, InterfaceC0494p interfaceC0494p) {
        this.f8097o = interfaceC1386d;
        this.f8098p = interfaceC0494p;
    }

    @Override // r1.InterfaceC1404C
    public final long c(n1.l lVar, long j3, n1.n nVar, long j7) {
        long jB = this.f8098p.b();
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = this.f8099q;
        }
        this.f8099q = jB;
        return n1.k.d(n1.k.d(lVar.a(), i6.h.H(jB)), this.f8097o.a(j7, 0L, nVar));
    }
}
