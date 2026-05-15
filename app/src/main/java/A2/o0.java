package A2;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final H2.A f388u = new H2.A(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.h0 f389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H2.A f390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0013n f394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f395g;
    public final H2.g0 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J2.t f396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H2.A f398k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t2.Q f401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f406t;

    public o0(t2.h0 h0Var, H2.A a4, long j3, long j7, int i7, C0013n c0013n, boolean z6, H2.g0 g0Var, J2.t tVar, List list, H2.A a7, boolean z7, int i8, int i9, t2.Q q7, long j8, long j9, long j10, long j11, boolean z8) {
        this.f389a = h0Var;
        this.f390b = a4;
        this.f391c = j3;
        this.f392d = j7;
        this.f393e = i7;
        this.f394f = c0013n;
        this.f395g = z6;
        this.h = g0Var;
        this.f396i = tVar;
        this.f397j = list;
        this.f398k = a7;
        this.l = z7;
        this.f399m = i8;
        this.f400n = i9;
        this.f401o = q7;
        this.f403q = j8;
        this.f404r = j9;
        this.f405s = j10;
        this.f406t = j11;
        this.f402p = z8;
    }

    public static o0 i(J2.t tVar) {
        t2.d0 d0Var = t2.h0.f16472a;
        H2.A a4 = f388u;
        return new o0(d0Var, a4, -9223372036854775807L, 0L, 1, null, false, H2.g0.f3185d, tVar, E4.b0.f1913s, a4, false, 1, 0, t2.Q.f16345d, 0L, 0L, 0L, 0L, false);
    }

    public final o0 a() {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, this.f393e, this.f394f, this.f395g, this.h, this.f396i, this.f397j, this.f398k, this.l, this.f399m, this.f400n, this.f401o, this.f403q, this.f404r, j(), SystemClock.elapsedRealtime(), this.f402p);
    }

    public final o0 b(H2.A a4) {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, this.f393e, this.f394f, this.f395g, this.h, this.f396i, this.f397j, a4, this.l, this.f399m, this.f400n, this.f401o, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final o0 c(H2.A a4, long j3, long j7, long j8, long j9, H2.g0 g0Var, J2.t tVar, List list) {
        return new o0(this.f389a, a4, j7, j8, this.f393e, this.f394f, this.f395g, g0Var, tVar, list, this.f398k, this.l, this.f399m, this.f400n, this.f401o, this.f403q, j9, j3, SystemClock.elapsedRealtime(), this.f402p);
    }

    public final o0 d(int i7, int i8, boolean z6) {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, this.f393e, this.f394f, this.f395g, this.h, this.f396i, this.f397j, this.f398k, z6, i7, i8, this.f401o, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final o0 e(C0013n c0013n) {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, this.f393e, c0013n, this.f395g, this.h, this.f396i, this.f397j, this.f398k, this.l, this.f399m, this.f400n, this.f401o, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final o0 f(t2.Q q7) {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, this.f393e, this.f394f, this.f395g, this.h, this.f396i, this.f397j, this.f398k, this.l, this.f399m, this.f400n, q7, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final o0 g(int i7) {
        return new o0(this.f389a, this.f390b, this.f391c, this.f392d, i7, this.f394f, this.f395g, this.h, this.f396i, this.f397j, this.f398k, this.l, this.f399m, this.f400n, this.f401o, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final o0 h(t2.h0 h0Var) {
        return new o0(h0Var, this.f390b, this.f391c, this.f392d, this.f393e, this.f394f, this.f395g, this.h, this.f396i, this.f397j, this.f398k, this.l, this.f399m, this.f400n, this.f401o, this.f403q, this.f404r, this.f405s, this.f406t, this.f402p);
    }

    public final long j() {
        long j3;
        long j7;
        if (!k()) {
            return this.f405s;
        }
        do {
            j3 = this.f406t;
            j7 = this.f405s;
        } while (j3 != this.f406t);
        return w2.t.D(w2.t.N(j7) + ((long) ((SystemClock.elapsedRealtime() - j3) * this.f401o.f16348a)));
    }

    public final boolean k() {
        return this.f393e == 3 && this.l && this.f400n == 0;
    }
}
