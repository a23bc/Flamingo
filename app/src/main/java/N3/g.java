package N3;

import androidx.work.CoroutineWorker;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5133p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CoroutineWorker coroutineWorker, c5.d dVar) {
        super(2, dVar);
        this.f5133p = coroutineWorker;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new g(this.f5133p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5132o;
        CoroutineWorker coroutineWorker = this.f5133p;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                this.f5132o = 1;
                obj = coroutineWorker.h(this);
                if (obj == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            coroutineWorker.f9835u.j((o) obj);
        } catch (Throwable th) {
            coroutineWorker.f9835u.k(th);
        }
        return Y4.o.f8736a;
    }
}
