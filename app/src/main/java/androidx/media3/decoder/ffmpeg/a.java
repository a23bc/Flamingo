package androidx.media3.decoder.ffmpeg;

import A2.AbstractC0006g;
import A2.C0007h;
import A2.C0008i;
import A2.C0013n;
import D2.k;
import L2.w;
import L2.x;
import L2.y;
import V.o;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import t2.C1487p;
import t2.s0;
import w2.AbstractC1697a;
import w2.t;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0006g {

    /* JADX INFO: renamed from: F */
    public final long f9786F;

    /* JADX INFO: renamed from: G */
    public final o f9787G;

    /* JADX INFO: renamed from: H */
    public final d1.e f9788H;

    /* JADX INFO: renamed from: I */
    public final f f9789I;

    /* JADX INFO: renamed from: J */
    public C1487p f9790J;

    /* JADX INFO: renamed from: K */
    public int f9791K;

    /* JADX INFO: renamed from: L */
    public Surface f9792L;

    /* JADX INFO: renamed from: M */
    public Surface f9793M;

    /* JADX INFO: renamed from: N */
    public k f9794N;

    /* JADX INFO: renamed from: O */
    public k f9795O;

    /* JADX INFO: renamed from: P */
    public int f9796P;

    /* JADX INFO: renamed from: Q */
    public long f9797Q;

    /* JADX INFO: renamed from: R */
    public boolean f9798R;

    /* JADX INFO: renamed from: S */
    public s0 f9799S;

    /* JADX INFO: renamed from: T */
    public long f9800T;

    /* JADX INFO: renamed from: U */
    public int f9801U;

    /* JADX INFO: renamed from: V */
    public C0007h f9802V;

    public a(long j3, Handler handler, y yVar, int i7) {
        super(2);
        this.f9786F = j3;
        this.f9797Q = -9223372036854775807L;
        this.f9788H = new d1.e(4, (byte) 0);
        this.f9789I = new f(0, 0);
        this.f9787G = new o(handler, yVar);
        this.f9791K = -1;
        this.f9796P = 0;
        this.f9802V = new C0007h();
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) {
        return A0.e.r(0, 0, 0, 0);
    }

    public final void C() throws C0013n {
        k kVar = this.f9795O;
        A0.e.K(this.f9794N, kVar);
        this.f9794N = kVar;
        if (kVar != null && kVar.h() == null && this.f9794N.g() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.f9790J.getClass();
            Trace.beginSection("createFfmpegVideoDecoder");
            Trace.endSection();
            throw null;
        } catch (OutOfMemoryError e7) {
            throw b(e7, this.f9790J, false, 4001);
        } catch (z2.d e8) {
            AbstractC1697a.n("Video codec error", e8);
            o oVar = this.f9787G;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new w(oVar, e8, 3));
            }
            throw b(e8, this.f9790J, false, 4001);
        }
    }

    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) {
        Surface surface;
        Handler handler;
        if (i7 != 1) {
            if (i7 == 7) {
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f9793M = (Surface) obj;
            this.f9791K = 1;
        } else {
            this.f9793M = null;
            this.f9791K = -1;
            obj = null;
        }
        Surface surface2 = this.f9792L;
        o oVar = this.f9787G;
        if (surface2 == obj) {
            if (obj != null) {
                s0 s0Var = this.f9799S;
                if (s0Var != null) {
                    oVar.O(s0Var);
                }
                if (this.f9796P != 3 || (surface = this.f9792L) == null || (handler = (Handler) oVar.f7342p) == null) {
                    return;
                }
                handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f9792L = (Surface) obj;
        if (obj == null) {
            this.f9799S = null;
            this.f9796P = Math.min(this.f9796P, 1);
            return;
        }
        s0 s0Var2 = this.f9799S;
        if (s0Var2 != null) {
            oVar.O(s0Var2);
        }
        this.f9796P = Math.min(this.f9796P, 1);
        if (this.f287v == 2) {
            long j3 = this.f9786F;
            this.f9797Q = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // A2.AbstractC0006g
    public final void c() {
        if (this.f9796P == 0) {
            this.f9796P = 1;
        }
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return this.f9798R;
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        if (this.f9790J != null && m() && (this.f9796P == 3 || this.f9791K == -1)) {
            this.f9797Q = -9223372036854775807L;
            return true;
        }
        if (this.f9797Q == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f9797Q) {
            return true;
        }
        this.f9797Q = -9223372036854775807L;
        return false;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        o oVar = this.f9787G;
        this.f9790J = null;
        this.f9799S = null;
        this.f9796P = Math.min(this.f9796P, 0);
        try {
            A0.e.K(this.f9795O, null);
            this.f9795O = null;
            A0.e.K(this.f9794N, null);
            this.f9794N = null;
        } finally {
            oVar.i(this.f9802V);
        }
    }

    @Override // A2.AbstractC0006g
    public final void o(boolean z6, boolean z7) {
        C0007h c0007h = new C0007h();
        this.f9802V = c0007h;
        o oVar = this.f9787G;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new w(oVar, c0007h, 4));
        }
        this.f9796P = z7 ? 1 : 0;
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) {
        this.f9798R = false;
        this.f9796P = Math.min(this.f9796P, 1);
        if (z6) {
            long j7 = this.f9786F;
            this.f9797Q = j7 > 0 ? SystemClock.elapsedRealtime() + j7 : -9223372036854775807L;
        } else {
            this.f9797Q = -9223372036854775807L;
        }
        this.f9788H.d();
    }

    @Override // A2.AbstractC0006g
    public final void s() {
        this.f9801U = 0;
        this.f9800T = SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        int i7 = t.f18881a;
    }

    @Override // A2.AbstractC0006g
    public final void t() {
        this.f9797Q = -9223372036854775807L;
        if (this.f9801U > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = jElapsedRealtime - this.f9800T;
            int i7 = this.f9801U;
            o oVar = this.f9787G;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new w(oVar, i7, j3));
            }
            this.f9801U = 0;
            this.f9800T = jElapsedRealtime;
        }
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) throws C0013n {
        if (this.f9798R) {
            return;
        }
        if (this.f9790J == null) {
            o oVar = this.f282q;
            oVar.e();
            f fVar = this.f9789I;
            fVar.f();
            int iV = v(oVar, fVar, 2);
            if (iV != -5) {
                if (iV == -4) {
                    AbstractC1697a.i(fVar.c(4));
                    this.f9798R = true;
                    return;
                }
                return;
            }
            C1487p c1487p = (C1487p) oVar.f7343q;
            c1487p.getClass();
            k kVar = (k) oVar.f7342p;
            A0.e.K(this.f9795O, kVar);
            this.f9795O = kVar;
            this.f9790J = c1487p;
            C();
            C1487p c1487p2 = this.f9790J;
            c1487p2.getClass();
            o oVar2 = this.f9787G;
            Handler handler = (Handler) oVar2.f7342p;
            if (handler != null) {
                handler.post(new w(oVar2, c1487p2, (C0008i) null));
            }
        }
        C();
    }

    @Override // A2.AbstractC0006g
    public final void u(C1487p[] c1487pArr, long j3, long j7) {
    }
}
