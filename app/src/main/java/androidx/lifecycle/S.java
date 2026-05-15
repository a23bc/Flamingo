package androidx.lifecycle;

import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import m5.C1203e;
import p2.AbstractC1292b;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Y4.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1203e f9720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC1210l f9721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1210l f9722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC1210l f9723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Q f9724s;

    /* JADX WARN: Multi-variable type inference failed */
    public S(C1203e c1203e, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3) {
        this.f9720o = c1203e;
        this.f9721p = (AbstractC1210l) interfaceC1180a;
        this.f9722q = (AbstractC1210l) interfaceC1180a2;
        this.f9723r = (AbstractC1210l) interfaceC1180a3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l5.a, m5.l] */
    @Override // Y4.e
    public final Object getValue() {
        Q q7 = this.f9724s;
        if (q7 != null) {
            return q7;
        }
        X x6 = (X) this.f9721p.a();
        U u7 = (U) this.f9722q.a();
        AbstractC1292b abstractC1292b = (AbstractC1292b) this.f9723r.a();
        AbstractC1209k.f(x6, "store");
        AbstractC1209k.f(u7, "factory");
        AbstractC1209k.f(abstractC1292b, "extras");
        Q qA = new W(x6, u7, abstractC1292b).a(this.f9720o);
        this.f9724s = qA;
        return qA;
    }
}
