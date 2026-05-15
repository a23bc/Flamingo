package H2;

import A2.v0;
import A2.x0;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements InterfaceC0207y, K2.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public byte[] f3144A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f3145B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y2.m f3146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V1.a f3147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y2.C f3148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f3149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D4.i f3150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f3151t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f3153v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1487p f3155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3157z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f3152u = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K2.m f3154w = new K2.m("SingleSampleMediaPeriod");

    public c0(y2.m mVar, V1.a aVar, y2.C c7, C1487p c1487p, long j3, x0 x0Var, D4.i iVar, boolean z6) {
        this.f3146o = mVar;
        this.f3147p = aVar;
        this.f3148q = c7;
        this.f3155x = c1487p;
        this.f3153v = j3;
        this.f3149r = x0Var;
        this.f3150s = iVar;
        this.f3156y = z6;
        this.f3151t = new g0(new t2.i0("", c1487p));
    }

    @Override // K2.h
    public final void a(K2.k kVar) {
        b0 b0Var = (b0) kVar;
        this.f3145B = (int) b0Var.f3135b.f20301p;
        byte[] bArr = b0Var.f3136c;
        bArr.getClass();
        this.f3144A = bArr;
        this.f3157z = true;
        Uri uri = b0Var.f3135b.f20302q;
        r rVar = new r();
        this.f3149r.getClass();
        this.f3150s.u(rVar, new C0205w(-1, this.f3155x, w2.t.N(0L), w2.t.N(this.f3153v)));
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        return -9223372036854775807L;
    }

    @Override // H2.X
    public final boolean c() {
        return this.f3154w.a();
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        if (!this.f3157z) {
            K2.m mVar = this.f3154w;
            if (!mVar.a() && mVar.f4035c == null) {
                y2.h hVarV = this.f3147p.v();
                y2.C c7 = this.f3148q;
                if (c7 != null) {
                    ((y2.n) hVarV).a(c7);
                }
                y2.m mVar2 = this.f3146o;
                b0 b0Var = new b0(mVar2, hVarV);
                this.f3149r.getClass();
                Looper looperMyLooper = Looper.myLooper();
                AbstractC1697a.j(looperMyLooper);
                mVar.f4035c = null;
                K2.j jVar = new K2.j(mVar, looperMyLooper, b0Var, this, 3, SystemClock.elapsedRealtime());
                AbstractC1697a.i(mVar.f4034b == null);
                mVar.f4034b = jVar;
                jVar.f4025r = null;
                mVar.f4033a.execute(jVar);
                this.f3150s.x(new r(mVar2), new C0205w(-1, this.f3155x, w2.t.N(0L), w2.t.N(this.f3153v)));
                return true;
            }
        }
        return false;
    }

    @Override // H2.X
    public final long e() {
        return (this.f3157z || this.f3154w.a()) ? Long.MIN_VALUE : 0L;
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        interfaceC0206x.k(this);
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        return this.f3151t;
    }

    @Override // H2.X
    public final long i() {
        return this.f3157z ? Long.MIN_VALUE : 0L;
    }

    @Override // K2.h
    public final void l(K2.k kVar, boolean z6) {
        Uri uri = ((b0) kVar).f3135b.f20302q;
        r rVar = new r();
        this.f3149r.getClass();
        this.f3150s.t(rVar, new C0205w(-1, null, w2.t.N(0L), w2.t.N(this.f3153v)));
    }

    @Override // K2.h
    public final K2.i m(K2.k kVar, IOException iOException, int i7) {
        long jMin;
        K2.i iVar;
        Uri uri = ((b0) kVar).f3135b.f20302q;
        r rVar = new r();
        int i8 = w2.t.f18881a;
        this.f3149r.getClass();
        if ((iOException instanceof t2.N) || (iOException instanceof FileNotFoundException) || (iOException instanceof y2.u) || (iOException instanceof K2.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i9 = y2.k.f20337p;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof y2.k) && ((y2.k) cause).f20338o == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i7 - 1) * 1000, 5000);
        boolean z6 = jMin == -9223372036854775807L || i7 >= 3;
        if (this.f3156y && z6) {
            AbstractC1697a.x("Loading failed, treating as end-of-stream.", iOException);
            this.f3157z = true;
            iVar = K2.m.f4031d;
        } else {
            iVar = jMin != -9223372036854775807L ? new K2.i(jMin, 0) : K2.m.f4032e;
        }
        int i10 = iVar.f4020a;
        this.f3150s.v(rVar, new C0205w(-1, this.f3155x, w2.t.N(0L), w2.t.N(this.f3153v)), iOException, !(i10 == 0 || i10 == 1));
        return iVar;
    }

    @Override // H2.InterfaceC0207y
    public final long n(J2.q[] qVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j3) {
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            W w7 = wArr[i7];
            ArrayList arrayList = this.f3152u;
            if (w7 != null && (qVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(w7);
                wArr[i7] = null;
            }
            if (wArr[i7] == null && qVarArr[i7] != null) {
                a0 a0Var = new a0(this);
                arrayList.add(a0Var);
                wArr[i7] = a0Var;
                zArr2[i7] = true;
            }
        }
        return j3;
    }

    @Override // H2.InterfaceC0207y
    public final long o(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3152u;
            if (i7 >= arrayList.size()) {
                return j3;
            }
            a0 a0Var = (a0) arrayList.get(i7);
            if (a0Var.f3128o == 2) {
                a0Var.f3128o = 1;
            }
            i7++;
        }
    }

    @Override // H2.InterfaceC0207y
    public final void j() {
    }

    @Override // H2.InterfaceC0207y
    public final void p(long j3) {
    }

    @Override // H2.X
    public final void q(long j3) {
    }

    @Override // H2.InterfaceC0207y
    public final long f(long j3, v0 v0Var) {
        return j3;
    }
}
