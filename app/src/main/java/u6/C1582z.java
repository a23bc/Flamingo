package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import x0.C1892b;

/* JADX INFO: renamed from: u6.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1582z extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0894j0 f17935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f17936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f17937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0.s f17940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0.s f17941u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582z(C0894j0 c0894j0, G g6, InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, p0.s sVar, p0.s sVar2, c5.d dVar) {
        super(3, dVar);
        this.f17935o = c0894j0;
        this.f17936p = g6;
        this.f17937q = interfaceC1765B;
        this.f17938r = interfaceC0878b0;
        this.f17939s = interfaceC0878b02;
        this.f17940t = sVar;
        this.f17941u = sVar2;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1892b) obj2).f19867a;
        G g6 = this.f17936p;
        p0.s sVar = this.f17940t;
        p0.s sVar2 = this.f17941u;
        C1582z c1582z = new C1582z(this.f17935o, g6, this.f17937q, this.f17938r, this.f17939s, sVar, sVar2, (c5.d) obj3);
        Y4.o oVar = Y4.o.f8736a;
        c1582z.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) this.f17938r.getValue();
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
        InterfaceC1786g0 interfaceC1786g02 = (InterfaceC1786g0) this.f17939s.getValue();
        if (interfaceC1786g02 != null) {
            interfaceC1786g02.c(null);
        }
        this.f17935o.setValue(Boolean.FALSE);
        this.f17936p.f17398d.setValue(Boolean.TRUE);
        AbstractC1767D.t(this.f17937q, null, new C1581y(this.f17940t, this.f17941u, null), 3);
        return Y4.o.f8736a;
    }
}
