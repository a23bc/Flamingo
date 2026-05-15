package u4;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f17297o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ e f17298p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c5.d dVar) {
        super(2, dVar);
        this.f17298p = eVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f17298p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17297o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670cA = this.f17298p.a();
            this.f17297o = 1;
            if (c1670cA.h(this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return o.f8736a;
    }
}
