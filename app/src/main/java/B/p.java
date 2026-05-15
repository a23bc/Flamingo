package B;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.ArrayList;
import w5.InterfaceC1765B;
import z5.y;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f604q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f603p = kVar;
        this.f604q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new p(this.f603p, this.f604q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f602o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return Y4.o.f8736a;
        }
        android.support.v4.media.session.b.K(obj);
        ArrayList arrayList = new ArrayList();
        y yVar = this.f603p.f598a;
        f fVar = new f(arrayList, this.f604q, 1);
        this.f602o = 1;
        yVar.getClass();
        y.k(yVar, fVar, this);
        return enumC0830a;
    }
}
