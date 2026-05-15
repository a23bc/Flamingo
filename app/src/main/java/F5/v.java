package F5;

import java.io.Closeable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Closeable {

    /* JADX INFO: renamed from: A */
    public final B0.a f2457A;

    /* JADX INFO: renamed from: B */
    public c f2458B;

    /* JADX INFO: renamed from: o */
    public final t f2459o;

    /* JADX INFO: renamed from: p */
    public final s f2460p;

    /* JADX INFO: renamed from: q */
    public final String f2461q;

    /* JADX INFO: renamed from: r */
    public final int f2462r;

    /* JADX INFO: renamed from: s */
    public final l f2463s;

    /* JADX INFO: renamed from: t */
    public final m f2464t;

    /* JADX INFO: renamed from: u */
    public final x f2465u;

    /* JADX INFO: renamed from: v */
    public final v f2466v;

    /* JADX INFO: renamed from: w */
    public final v f2467w;

    /* JADX INFO: renamed from: x */
    public final v f2468x;

    /* JADX INFO: renamed from: y */
    public final long f2469y;

    /* JADX INFO: renamed from: z */
    public final long f2470z;

    public v(t tVar, s sVar, String str, int i7, l lVar, m mVar, x xVar, v vVar, v vVar2, v vVar3, long j3, long j7, B0.a aVar) {
        AbstractC1209k.f(tVar, "request");
        AbstractC1209k.f(sVar, "protocol");
        AbstractC1209k.f(str, "message");
        this.f2459o = tVar;
        this.f2460p = sVar;
        this.f2461q = str;
        this.f2462r = i7;
        this.f2463s = lVar;
        this.f2464t = mVar;
        this.f2465u = xVar;
        this.f2466v = vVar;
        this.f2467w = vVar2;
        this.f2468x = vVar3;
        this.f2469y = j3;
        this.f2470z = j7;
        this.f2457A = aVar;
    }

    public static String b(v vVar, String str) {
        vVar.getClass();
        String strB = vVar.f2464t.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final u c() {
        u uVar = new u();
        uVar.f2446a = this.f2459o;
        uVar.f2447b = this.f2460p;
        uVar.f2448c = this.f2462r;
        uVar.f2449d = this.f2461q;
        uVar.f2450e = this.f2463s;
        uVar.f2451f = this.f2464t.g();
        uVar.f2452g = this.f2465u;
        uVar.h = this.f2466v;
        uVar.f2453i = this.f2467w;
        uVar.f2454j = this.f2468x;
        uVar.f2455k = this.f2469y;
        uVar.l = this.f2470z;
        uVar.f2456m = this.f2457A;
        return uVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.f2465u;
        if (xVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        xVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f2460p + ", code=" + this.f2462r + ", message=" + this.f2461q + ", url=" + ((o) this.f2459o.f2441p) + '}';
    }
}
