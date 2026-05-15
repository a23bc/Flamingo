package H2;

import N2.C0293j;
import a3.C0519b;
import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class K implements K2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f3006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2.B f3007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.b f3008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f3009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N2.K f3010e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f3012g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y2.m f3014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N2.H f3015k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f3016m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N2.q f3011f = new N2.q();
    public boolean h = true;

    public K(N n7, Uri uri, y2.h hVar, A0.b bVar, N n8, N2.K k7) {
        this.f3016m = n7;
        this.f3006a = uri;
        this.f3007b = new y2.B(hVar);
        this.f3008c = bVar;
        this.f3009d = n8;
        this.f3010e = k7;
        r.f3226a.getAndIncrement();
        this.f3014j = c(0L);
    }

    @Override // K2.k
    public final void a() {
        y2.h c0200q;
        N2.m mVar;
        int i7;
        int iG = 0;
        while (iG == 0 && !this.f3012g) {
            try {
                long j3 = this.f3011f.f5067a;
                y2.m mVarC = c(j3);
                this.f3014j = mVarC;
                long jE = this.f3007b.e(mVarC);
                if (this.f3012g) {
                    if (iG != 1 && this.f3008c.T() != -1) {
                        this.f3011f.f5067a = this.f3008c.T();
                    }
                    y2.B b7 = this.f3007b;
                    if (b7 != null) {
                        try {
                            b7.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (jE != -1) {
                    jE += j3;
                    N n7 = this.f3016m;
                    n7.f3027E.post(new I(n7, 0));
                }
                long j7 = jE;
                this.f3016m.f3029G = C0519b.a(this.f3007b.f20300o.d());
                y2.B b8 = this.f3007b;
                C0519b c0519b = this.f3016m.f3029G;
                if (c0519b == null || (i7 = c0519b.f8846t) == -1) {
                    c0200q = b8;
                } else {
                    c0200q = new C0200q(b8, i7, this);
                    N n8 = this.f3016m;
                    n8.getClass();
                    N2.H hY = n8.y(new M(0, true));
                    this.f3015k = hY;
                    hY.e(N.f3022d0);
                }
                this.f3008c.Z(c0200q, this.f3006a, this.f3007b.f20300o.d(), j3, j7, this.f3009d);
                if (this.f3016m.f3029G != null && (mVar = (N2.m) this.f3008c.f51q) != null) {
                    N2.m mVarB = mVar.b();
                    if (mVarB instanceof g3.d) {
                        ((g3.d) mVarB).f12481p = true;
                    }
                }
                if (this.h) {
                    A0.b bVar = this.f3008c;
                    long j8 = this.f3013i;
                    N2.m mVar2 = (N2.m) bVar.f51q;
                    mVar2.getClass();
                    mVar2.e(j3, j8);
                    this.h = false;
                }
                while (iG == 0 && !this.f3012g) {
                    try {
                        this.f3010e.c();
                        A0.b bVar2 = this.f3008c;
                        N2.q qVar = this.f3011f;
                        N2.m mVar3 = (N2.m) bVar2.f51q;
                        mVar3.getClass();
                        C0293j c0293j = (C0293j) bVar2.f52r;
                        c0293j.getClass();
                        iG = mVar3.g(c0293j, qVar);
                        long jT = this.f3008c.T();
                        if (jT > this.f3016m.f3057x + j3) {
                            this.f3010e.d();
                            N n9 = this.f3016m;
                            n9.f3027E.post(n9.f3026D);
                            j3 = jT;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else if (this.f3008c.T() != -1) {
                    this.f3011f.f5067a = this.f3008c.T();
                }
                y2.B b9 = this.f3007b;
                if (b9 != null) {
                    try {
                        b9.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (iG != 1 && this.f3008c.T() != -1) {
                    this.f3011f.f5067a = this.f3008c.T();
                }
                y2.B b10 = this.f3007b;
                if (b10 != null) {
                    try {
                        b10.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // K2.k
    public final void b() {
        this.f3012g = true;
    }

    public final y2.m c(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.f3016m.f3056w;
        Map map2 = N.f3021c0;
        Uri uri = this.f3006a;
        AbstractC1697a.k(uri, "The uri must be set.");
        return new y2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}
