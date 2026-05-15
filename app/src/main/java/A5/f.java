package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f544p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f545q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c5.d dVar) {
        super(2, dVar);
        this.f545q = gVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        f fVar = new f(this.f545q, dVar);
        fVar.f544p = obj;
        return fVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((y5.p) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f543o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            y5.p pVar = (y5.p) this.f544p;
            this.f543o = 1;
            if (this.f545q.c(pVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
