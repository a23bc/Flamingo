package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0886f0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import w.C1689w;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f17343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f17345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f17346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1689w f17347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17348t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC1180a interfaceC1180a, C0886f0 c0886f0, float f7, C1689w c1689w, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f17344p = interfaceC1180a;
        this.f17345q = c0886f0;
        this.f17346r = f7;
        this.f17347s = c1689w;
        this.f17348t = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C c7 = new C(this.f17344p, this.f17345q, this.f17346r, this.f17347s, this.f17348t, dVar);
        c7.f17343o = obj;
        return c7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C c7 = (C) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c7.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f17343o;
        Y4.h hVar = (Y4.h) this.f17344p.a();
        this.f17348t.setValue(AbstractC1767D.t(interfaceC1765B, null, new B(this.f17345q, this.f17346r, this.f17347s, ((Number) hVar.f8726o).floatValue(), ((Number) hVar.f8727p).floatValue(), null), 3));
        return Y4.o.f8736a;
    }
}
