package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0886f0;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import w.C1689w;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ float f17365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f17366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f17367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f17368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1689w f17371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17372v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g6, C0894j0 c0894j0, InterfaceC1765B interfaceC1765B, InterfaceC1180a interfaceC1180a, C0886f0 c0886f0, C1689w c1689w, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(3, dVar);
        this.f17366p = g6;
        this.f17367q = c0894j0;
        this.f17368r = interfaceC1765B;
        this.f17369s = interfaceC1180a;
        this.f17370t = c0886f0;
        this.f17371u = c1689w;
        this.f17372v = interfaceC0878b0;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        G g6 = this.f17366p;
        C1689w c1689w = this.f17371u;
        InterfaceC0878b0 interfaceC0878b0 = this.f17372v;
        D d4 = new D(g6, this.f17367q, this.f17368r, this.f17369s, this.f17370t, c1689w, interfaceC0878b0, (c5.d) obj3);
        d4.f17365o = fFloatValue;
        Y4.o oVar = Y4.o.f8736a;
        d4.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        float f7 = this.f17365o;
        this.f17366p.f17398d.setValue(Boolean.FALSE);
        if (!((Boolean) this.f17367q.getValue()).booleanValue()) {
            AbstractC1767D.t(this.f17368r, null, new C(this.f17369s, this.f17370t, f7, this.f17371u, this.f17372v, null), 3);
        }
        return Y4.o.f8736a;
    }
}
