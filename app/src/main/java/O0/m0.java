package O0;

import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5419r = o0.f5430a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5420s = 0;

    public m0() {
        long j3 = 0;
        this.f5418q = (j3 & 4294967295L) | (j3 << 32);
    }

    public int S() {
        return (int) (this.f5418q & 4294967295L);
    }

    public int T() {
        return (int) (this.f5418q >> 32);
    }

    public final void X() {
        this.f5416o = i6.h.q((int) (this.f5418q >> 32), n1.a.j(this.f5419r), n1.a.h(this.f5419r));
        int iQ = i6.h.q((int) (this.f5418q & 4294967295L), n1.a.i(this.f5419r), n1.a.g(this.f5419r));
        this.f5417p = iQ;
        int i7 = this.f5416o;
        long j3 = this.f5418q;
        this.f5420s = (((long) ((i7 - ((int) (j3 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iQ - ((int) (j3 & 4294967295L))) / 2)));
    }

    public void Z(long j3, float f7, B0.d dVar) {
        a0(j3, f7, null);
    }

    public abstract void a0(long j3, float f7, InterfaceC1182c interfaceC1182c);

    public final void c0(long j3) {
        if (n1.m.b(this.f5418q, j3)) {
            return;
        }
        this.f5418q = j3;
        X();
    }

    public final void d0(long j3) {
        if (n1.a.b(this.f5419r, j3)) {
            return;
        }
        this.f5419r = j3;
        X();
    }

    public /* synthetic */ Object i() {
        return null;
    }
}
