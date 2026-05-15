package F5;

import E0.C0096g;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f2446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f2447b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f2450e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f2452g;
    public v h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v f2453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v f2454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2455k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public B0.a f2456m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2448c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0096g f2451f = new C0096g(1);

    public static void b(v vVar, String str) {
        if (vVar != null) {
            if (vVar.f2465u != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (vVar.f2466v != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (vVar.f2467w != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (vVar.f2468x != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final v a() {
        int i7 = this.f2448c;
        if (i7 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f2448c).toString());
        }
        t tVar = this.f2446a;
        if (tVar == null) {
            throw new IllegalStateException("request == null");
        }
        s sVar = this.f2447b;
        if (sVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f2449d;
        if (str != null) {
            return new v(tVar, sVar, str, i7, this.f2450e, this.f2451f.h(), this.f2452g, this.h, this.f2453i, this.f2454j, this.f2455k, this.l, this.f2456m);
        }
        throw new IllegalStateException("message == null");
    }
}
