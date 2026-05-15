package r1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1408b extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f15665o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408b(w wVar, c5.d dVar) {
        super(2, dVar);
        this.f15665o = wVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1408b(this.f15665o, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C1408b c1408b = (C1408b) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c1408b.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        this.f15665o.show();
        return Y4.o.f8736a;
    }
}
