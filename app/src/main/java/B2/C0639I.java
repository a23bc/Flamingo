package b2;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: b2.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0639I extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10061o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10062p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0651c f10063q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0639I(C0651c c0651c, c5.d dVar) {
        super(2, dVar);
        this.f10063q = c0651c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0639I c0639i = new C0639I(this.f10063q, dVar);
        c0639i.f10062p = obj;
        return c0639i;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0639I) create((i2.o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10061o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        i2.o oVar2 = (i2.o) this.f10062p;
        String strQ = I0.c.q(this.f10063q.f10163a);
        this.f10061o = 1;
        C0671m c0671m = (C0671m) oVar2.f13407a.remove(strQ);
        if (c0671m != null) {
            c0671m.f10228c.h(null, false);
            c0671m.f10227b.set(false);
            c0671m.l.c(null);
        }
        return oVar == enumC0830a ? enumC0830a : oVar;
    }
}
