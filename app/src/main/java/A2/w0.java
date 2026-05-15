package A2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements a0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.o f464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t2.Q f468s = t2.Q.f16345d;

    public w0(w2.o oVar) {
        this.f464o = oVar;
    }

    public final void a(long j3) {
        this.f466q = j3;
        if (this.f465p) {
            this.f464o.getClass();
            this.f467r = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f465p) {
            return;
        }
        this.f464o.getClass();
        this.f467r = SystemClock.elapsedRealtime();
        this.f465p = true;
    }

    @Override // A2.a0
    public final void h(t2.Q q7) {
        if (this.f465p) {
            a(l());
        }
        this.f468s = q7;
    }

    @Override // A2.a0
    public final t2.Q j() {
        return this.f468s;
    }

    @Override // A2.a0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // A2.a0
    public final long l() {
        long j3 = this.f466q;
        if (!this.f465p) {
            return j3;
        }
        this.f464o.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f467r;
        t2.Q q7 = this.f468s;
        return q7.f16348a == 1.0f ? w2.t.D(jElapsedRealtime) + j3 : (jElapsedRealtime * ((long) q7.f16350c)) + j3;
    }
}
