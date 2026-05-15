package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import w.C1670c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: h6.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1040r0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p0.p f13176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1670c f13177r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040r0(InterfaceC1180a interfaceC1180a, p0.p pVar, C1670c c1670c, c5.d dVar) {
        super(2, dVar);
        this.f13175p = interfaceC1180a;
        this.f13176q = pVar;
        this.f13177r = c1670c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1040r0 c1040r0 = new C1040r0(this.f13175p, this.f13176q, this.f13177r, dVar);
        c1040r0.f13174o = obj;
        return c1040r0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C1040r0 c1040r0 = (C1040r0) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c1040r0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f13174o;
        String str = (String) this.f13175p.a();
        p0.p pVar = this.f13176q;
        boolean zIsEmpty = pVar.isEmpty();
        Y4.o oVar = Y4.o.f8736a;
        if (!zIsEmpty && AbstractC1209k.a(Z4.n.x0(pVar), str)) {
            return oVar;
        }
        if (pVar.size() >= 2) {
            pVar.remove(0);
        }
        pVar.add(str);
        AbstractC1767D.t(interfaceC1765B, null, new C1039q0(this.f13177r, AbstractC1209k.a(str, "Lyric") ? 1.0f : 0.0f, null), 3);
        return oVar;
    }
}
