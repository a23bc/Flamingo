package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f525o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f526p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC2111f f527q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC2111f interfaceC2111f, c5.d dVar) {
        super(2, dVar);
        this.f527q = interfaceC2111f;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C c7 = new C(this.f527q, dVar);
        c7.f526p = obj;
        return c7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create(obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f525o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            Object obj2 = this.f526p;
            this.f525o = 1;
            if (this.f527q.f(obj2, this) == enumC0830a) {
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
