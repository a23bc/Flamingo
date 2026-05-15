package F5;

import b5.C0701a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f2362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f2363f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f2366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f2367d;

    static {
        g gVar = g.f2354r;
        g gVar2 = g.f2355s;
        g gVar3 = g.f2356t;
        g gVar4 = g.l;
        g gVar5 = g.f2350n;
        g gVar6 = g.f2349m;
        g gVar7 = g.f2351o;
        g gVar8 = g.f2353q;
        g gVar9 = g.f2352p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f2347j, g.f2348k, g.h, g.f2346i, g.f2344f, g.f2345g, g.f2343e};
        h hVar = new h();
        hVar.b((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        z zVar = z.f2476p;
        z zVar2 = z.f2477q;
        hVar.d(zVar, zVar2);
        if (!hVar.f2358a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar.f2359b = true;
        hVar.a();
        h hVar2 = new h();
        hVar2.b((g[]) Arrays.copyOf(gVarArr, 16));
        hVar2.d(zVar, zVar2);
        if (!hVar2.f2358a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar2.f2359b = true;
        f2362e = hVar2.a();
        h hVar3 = new h();
        hVar3.b((g[]) Arrays.copyOf(gVarArr, 16));
        hVar3.d(zVar, zVar2, z.f2478r, z.f2479s);
        if (!hVar3.f2358a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        hVar3.f2359b = true;
        hVar3.a();
        f2363f = new i(false, false, null, null);
    }

    public i(boolean z6, boolean z7, String[] strArr, String[] strArr2) {
        this.f2364a = z6;
        this.f2365b = z7;
        this.f2366c = strArr;
        this.f2367d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2366c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f2340b.c(str));
        }
        return Z4.n.K0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2364a) {
            return false;
        }
        String[] strArr = this.f2367d;
        if (strArr != null && !G5.b.h(strArr, sSLSocket.getEnabledProtocols(), C0701a.f10401p)) {
            return false;
        }
        String[] strArr2 = this.f2366c;
        return strArr2 == null || G5.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), g.f2341c);
    }

    public final List c() {
        String[] strArr = this.f2367d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(android.support.v4.media.session.b.p(str));
        }
        return Z4.n.K0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z6 = iVar.f2364a;
        boolean z7 = this.f2364a;
        if (z7 != z6) {
            return false;
        }
        if (z7) {
            return Arrays.equals(this.f2366c, iVar.f2366c) && Arrays.equals(this.f2367d, iVar.f2367d) && this.f2365b == iVar.f2365b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f2364a) {
            return 17;
        }
        String[] strArr = this.f2366c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f2367d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2365b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2364a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2365b + ')';
    }
}
