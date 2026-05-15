package q1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: q1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1365f extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1368i f15465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f15466q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365f(AbstractC1368i abstractC1368i, long j3, c5.d dVar) {
        super(2, dVar);
        this.f15465p = abstractC1368i;
        this.f15466q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1365f(this.f15465p, this.f15466q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1365f) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f15464o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            AbstractC1368i abstractC1368i = this.f15465p;
            this.f15464o = 1;
            if (abstractC1368i.f15486o.c(this.f15466q, this) == enumC0830a) {
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
