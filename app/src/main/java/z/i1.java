package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20865p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(C2054o0 c2054o0, c5.d dVar) {
        super(2, dVar);
        this.f20865p = c2054o0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new i1(this.f20865p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20864o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f20864o = 1;
            if (this.f20865p.d(this) == enumC0830a) {
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
