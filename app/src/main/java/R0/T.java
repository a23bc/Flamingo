package R0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import g1.C0956B;
import g1.C0981w;
import g1.InterfaceC0975q;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f6375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ U f6376q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u7, c5.d dVar) {
        super(2, dVar);
        this.f6376q = u7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        T t7 = new T(this.f6376q, dVar);
        t7.f6375p = obj;
        return t7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((T) create((C0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f6374o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0 c02 = (C0) this.f6375p;
            this.f6375p = c02;
            U u7 = this.f6376q;
            this.f6374o = 1;
            C1793k c1793k = new C1793k(1, I0.c.D(this));
            c1793k.r();
            C0981w c0981w = u7.f6379p;
            InterfaceC0975q interfaceC0975q = c0981w.f12387a;
            interfaceC0975q.d();
            c0981w.f12388b.set(new C0956B(c0981w, interfaceC0975q));
            c1793k.t(new K0.A(c02, 6, u7));
            if (c1793k.q() == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        throw new A2.W();
    }
}
