package w;

import f0.C0879c;
import f0.C0894j0;
import f0.Z0;

/* JADX INFO: renamed from: w.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1680m implements Z0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f18709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0894j0 f18710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f18711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f18714t;

    public /* synthetic */ C1680m(o0 o0Var, Object obj, r rVar, int i7) {
        this(o0Var, obj, (i7 & 4) != 0 ? null : rVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.f18709o.f18723b.b(this.f18711q);
    }

    @Override // f0.Z0
    public final Object getValue() {
        return this.f18710p.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f18710p.getValue() + ", velocity=" + b() + ", isRunning=" + this.f18714t + ", lastFrameTimeNanos=" + this.f18712r + ", finishedTimeNanos=" + this.f18713s + ')';
    }

    public C1680m(o0 o0Var, Object obj, r rVar, long j3, long j7, boolean z6) {
        r rVarG;
        this.f18709o = o0Var;
        this.f18710p = C0879c.t(obj);
        if (rVar != null) {
            rVarG = AbstractC1671d.g(rVar);
        } else {
            rVarG = (r) o0Var.f18722a.b(obj);
            rVarG.d();
        }
        this.f18711q = rVarG;
        this.f18712r = j3;
        this.f18713s = j7;
        this.f18714t = z6;
    }
}
