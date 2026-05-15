package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l5.e f5495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5496q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(l5.e eVar, Object obj, c5.d dVar) {
        super(2, dVar);
        this.f5495p = eVar;
        this.f5496q = obj;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new D(this.f5495p, this.f5496q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5494o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        this.f5494o = 1;
        Object objInvoke = this.f5495p.invoke(this.f5496q, this);
        return objInvoke == enumC0830a ? enumC0830a : objInvoke;
    }
}
