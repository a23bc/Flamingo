package w;

import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: w.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1678k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f18698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1210l f18701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0894j0 f18702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f18703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18704g;
    public long h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0894j0 f18705i = C0879c.t(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public C1678k(Object obj, o0 o0Var, r rVar, long j3, Object obj2, long j7, InterfaceC1180a interfaceC1180a) {
        this.f18698a = o0Var;
        this.f18699b = obj2;
        this.f18700c = j7;
        this.f18701d = (AbstractC1210l) interfaceC1180a;
        this.f18702e = C0879c.t(obj);
        this.f18703f = AbstractC1671d.g(rVar);
        this.f18704g = j3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l5.a, m5.l] */
    public final void a() {
        this.f18705i.setValue(Boolean.FALSE);
        this.f18701d.a();
    }
}
