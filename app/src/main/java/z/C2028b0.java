package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import o0.C1247d;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: z.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2028b0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20784p;

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2028b0 c2028b0 = new C2028b0(2, dVar);
        c2028b0.f20784p = obj;
        return c2028b0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2028b0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1765B interfaceC1765B;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20783o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            interfaceC1765B = (InterfaceC1765B) this.f20784p;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1765B = (InterfaceC1765B) this.f20784p;
            android.support.v4.media.session.b.K(obj);
        }
        while (AbstractC1767D.r(interfaceC1765B.g())) {
            C1247d c1247d = new C1247d(17);
            this.f20784p = interfaceC1765B;
            this.f20783o = 1;
            if (C0879c.q(getContext()).s(c1247d, this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return Y4.o.f8736a;
    }
}
