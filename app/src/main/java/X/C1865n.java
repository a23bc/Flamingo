package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1865n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1869p f19778o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1865n(AbstractC1869p abstractC1869p, c5.d dVar) {
        super(2, dVar);
        this.f19778o = abstractC1869p;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1865n(this.f19778o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C1865n c1865n = (C1865n) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c1865n.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        AbstractC1869p abstractC1869p = this.f19778o;
        if (abstractC1869p.f19802Q == null) {
            B.h hVar = new B.h();
            B.k kVar = abstractC1869p.f19790E;
            if (kVar != null) {
                AbstractC1767D.t(abstractC1869p.n0(), null, new C1841b(kVar, hVar, null), 3);
            }
            abstractC1869p.f19802Q = hVar;
        }
        return Y4.o.f8736a;
    }
}
