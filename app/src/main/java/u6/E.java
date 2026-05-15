package u6;

import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements f0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f17377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f17378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.s f17381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.s f17382f;

    public E(G g6, InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, p0.s sVar, p0.s sVar2) {
        this.f17377a = g6;
        this.f17378b = interfaceC1765B;
        this.f17379c = interfaceC0878b0;
        this.f17380d = interfaceC0878b02;
        this.f17381e = sVar;
        this.f17382f = sVar2;
    }

    @Override // f0.I
    public final void a() {
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f17379c.getValue();
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
        InterfaceC1786g0 interfaceC1786g02 = (InterfaceC1786g0) this.f17380d.getValue();
        if (interfaceC1786g02 != null) {
            interfaceC1786g02.c(null);
        }
        this.f17377a.f17396b = null;
        AbstractC1767D.t(this.f17378b, null, new C1580x(this.f17381e, this.f17382f, null), 3);
    }
}
