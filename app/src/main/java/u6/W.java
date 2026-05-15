package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.AbstractC1671d;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f17542p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C1670c c1670c, c5.d dVar) {
        super(2, dVar);
        this.f17542p = c1670c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new W(this.f17542p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17541o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            Float f7 = new Float(0.0f);
            w.n0 n0VarL = AbstractC1671d.l((int) (1400 * 0.4f), 0, E0.f17383a, 2);
            this.f17541o = 1;
            if (C1670c.c(this.f17542p, f7, n0VarL, null, null, this, 12) == enumC0830a) {
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
