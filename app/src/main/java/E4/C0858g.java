package e4;

import B5.n;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.C1771H;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: renamed from: e4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0858g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f11575o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f11576p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ p4.h f11577q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0862k f11578r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0858g(c5.d dVar, C0862k c0862k, p4.h hVar) {
        super(2, dVar);
        this.f11577q = hVar;
        this.f11578r = c0862k;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0858g c0858g = new C0858g(dVar, this.f11578r, this.f11577q);
        c0858g.f11576p = obj;
        return c0858g;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0858g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11575o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f11576p;
        D5.e eVar = M.f19497a;
        C1771H c1771hD = AbstractC1767D.d(interfaceC1765B, n.f912a.f20145t, new C0857f(null, this.f11578r, this.f11577q), 2);
        this.f11575o = 1;
        Object objB = c1771hD.B(this);
        return objB == enumC0830a ? enumC0830a : objB;
    }
}
