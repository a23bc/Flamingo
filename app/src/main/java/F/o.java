package F;

import H.N;
import H.O;
import H.P;
import r0.C1388f;

/* JADX INFO: loaded from: classes.dex */
public final class o extends P {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f2093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f2094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N f2096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2097g;
    public final /* synthetic */ int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1388f f2098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2100k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f2101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j3, l lVar, N n7, int i7, int i8, C1388f c1388f, int i9, int i10, long j7, A a4) {
        super(0);
        this.f2096f = n7;
        this.f2097g = i7;
        this.h = i8;
        this.f2098i = c1388f;
        this.f2099j = i9;
        this.f2100k = i10;
        this.l = j7;
        this.f2101m = a4;
        this.f2093c = lVar;
        this.f2094d = n7;
        this.f2095e = n1.b.b(n1.a.h(j3), Integer.MAX_VALUE, 5);
    }

    @Override // H.P
    public final O S0(int i7, int i8, int i9, long j3) {
        return b1(j3, i7);
    }

    public final s b1(long j3, int i7) {
        l lVar = this.f2093c;
        Object objB = lVar.b(i7);
        Object objL = lVar.f2084b.l(i7);
        return new s(i7, T0(this.f2094d, i7, j3), this.f2098i, this.f2096f.f2809p.getLayoutDirection(), this.f2099j, this.f2100k, i7 == this.f2097g + (-1) ? 0 : this.h, this.l, objB, objL, this.f2101m.f2035n, j3);
    }
}
