package w;

import f0.C0879c;
import f0.C0894j0;
import f0.Z0;

/* JADX INFO: renamed from: w.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1658G implements Z0 {

    /* JADX INFO: renamed from: o */
    public Float f18516o;

    /* JADX INFO: renamed from: p */
    public Float f18517p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f18518q;

    /* JADX INFO: renamed from: r */
    public a0 f18519r;

    /* JADX INFO: renamed from: s */
    public boolean f18520s;

    /* JADX INFO: renamed from: t */
    public boolean f18521t;

    /* JADX INFO: renamed from: u */
    public long f18522u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1661J f18523v;

    public C1658G(C1661J c1661j, Float f7, Float f8, C1657F c1657f) {
        o0 o0Var = p0.f18727a;
        this.f18523v = c1661j;
        this.f18516o = f7;
        this.f18517p = f8;
        this.f18518q = C0879c.t(f7);
        this.f18519r = new a0(c1657f, o0Var, this.f18516o, this.f18517p, null);
    }

    @Override // f0.Z0
    public final Object getValue() {
        return this.f18518q.getValue();
    }
}
