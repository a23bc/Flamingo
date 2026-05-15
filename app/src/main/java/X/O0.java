package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7979o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f7980p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O0(InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f7980p = (AbstractC0871i) interfaceC1182c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new O0(this.f7980p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7979o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f7979o = 1;
            if (this.f7980p.b(this) == enumC0830a) {
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
