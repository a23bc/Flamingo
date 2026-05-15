package u6;

import b1.C0615K;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.Z0;
import j5.AbstractC1110d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d6.f f17761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b1.M f17762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f17764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0615K f17765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f17767v;

    public /* synthetic */ n0(d6.f fVar, b1.M m7, boolean z6, List list, C0615K c0615k, long j3, long j7, int i7) {
        this.f17760o = i7;
        this.f17761p = fVar;
        this.f17762q = m7;
        this.f17763r = z6;
        this.f17764s = list;
        this.f17765t = c0615k;
        this.f17766u = j3;
        this.f17767v = j7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17760o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    c0912t.X(131464965);
                    boolean zF = c0912t.f(this.f17761p);
                    b1.M m7 = this.f17762q;
                    boolean zF2 = zF | c0912t.f(m7);
                    Object objK = c0912t.K();
                    if (zF2 || objK == C0903o.f11850a) {
                        objK = C0879c.o(new F.n(this.f17764s, m7, this.f17765t, 12));
                        c0912t.i0(objK);
                    }
                    Z0 z02 = (Z0) objK;
                    c0912t.p(false);
                    AbstractC1110d.n(n0.e.e(-31487070, new m0(z02, this.f17766u, this.f17762q, this.f17763r ? E0.f17384b.h() : 0L, this.f17763r, this.f17767v, this.f17765t), c0912t), c0912t, 6);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    AbstractC1110d.n(n0.e.e(-1114704699, new n0(this.f17761p, this.f17762q, this.f17763r, this.f17764s, this.f17765t, this.f17766u, this.f17767v, 0), c0912t2), c0912t2, 6);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
