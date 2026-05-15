package N3;

import androidx.work.CoroutineWorker;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f5128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k f5130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5131r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, CoroutineWorker coroutineWorker, c5.d dVar) {
        super(2, dVar);
        this.f5130q = kVar;
        this.f5131r = coroutineWorker;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new f(this.f5130q, this.f5131r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        fVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5129p;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f5128o = this.f5130q;
            this.f5129p = 1;
            this.f5131r.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = this.f5128o;
        android.support.v4.media.session.b.K(obj);
        kVar.f5140o.j(obj);
        return Y4.o.f8736a;
    }
}
