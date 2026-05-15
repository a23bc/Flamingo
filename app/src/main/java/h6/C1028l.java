package h6;

import I.C0211c;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: h6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028l extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0211c f13089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13091r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028l(InterfaceC1182c interfaceC1182c, C0211c c0211c, String str, String str2, c5.d dVar) {
        super(2, dVar);
        this.f13088o = interfaceC1182c;
        this.f13089p = c0211c;
        this.f13090q = str;
        this.f13091r = str2;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1028l(this.f13088o, this.f13089p, this.f13090q, this.f13091r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C1028l c1028l = (C1028l) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c1028l.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        int iK = this.f13089p.k();
        String str = this.f13090q;
        if (iK != 0 && iK == 1) {
            str = this.f13091r;
        }
        this.f13088o.b(str);
        return Y4.o.f8736a;
    }
}
