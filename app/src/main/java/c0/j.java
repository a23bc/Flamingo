package c0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.AbstractC1671d;
import w.AbstractC1692z;
import w.C1670c;
import w.n0;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f10567p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, c5.d dVar) {
        super(2, dVar);
        this.f10567p = pVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new j(this.f10567p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10566o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = this.f10567p.f10583f;
            Float f7 = new Float(1.0f);
            n0 n0VarL = AbstractC1671d.l(75, 0, AbstractC1692z.f18767b, 2);
            this.f10566o = 1;
            if (C1670c.c(c1670c, f7, n0VarL, null, null, this, 12) == enumC0830a) {
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
