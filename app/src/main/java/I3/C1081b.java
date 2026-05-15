package i3;

import N2.B;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: renamed from: i3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081b implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1085f f13450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f13451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f13452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f13453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f13459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13460y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f13461z;

    public C1081b(i iVar, long j3, long j7, long j8, long j9, boolean z6) {
        AbstractC1697a.d(j3 >= 0 && j7 > j3);
        this.f13453r = iVar;
        this.f13451p = j3;
        this.f13452q = j7;
        if (j8 == j7 - j3 || z6) {
            this.f13455t = j9;
            this.f13454s = 4;
        } else {
            this.f13454s = 0;
        }
        this.f13450o = new C1085f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // i3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(N2.C0293j r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1081b.e(N2.j):long");
    }

    @Override // i3.g
    public final B f() {
        if (this.f13455t != 0) {
            return new C1080a(this);
        }
        return null;
    }

    @Override // i3.g
    public final void h(long j3) {
        this.f13457v = t.h(j3, 0L, this.f13455t - 1);
        this.f13454s = 2;
        this.f13458w = this.f13451p;
        this.f13459x = this.f13452q;
        this.f13460y = 0L;
        this.f13461z = this.f13455t;
    }
}
