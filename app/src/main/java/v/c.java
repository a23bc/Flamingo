package V;

import A2.W;
import M.k0;
import R0.U;
import android.view.View;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7303o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f7304p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ U f7305q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ k0 f7306r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ e f7307s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ q f7308t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(U u7, k0 k0Var, e eVar, q qVar, c5.d dVar) {
        super(2, dVar);
        this.f7305q = u7;
        this.f7306r = k0Var;
        this.f7307s = eVar;
        this.f7308t = qVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        c cVar = new c(this.f7305q, this.f7306r, this.f7307s, this.f7308t, dVar);
        cVar.f7304p = obj;
        return cVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        ((c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7303o;
        e eVar = this.f7307s;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
                throw new W();
            }
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f7304p;
            s sVar = t.f7367a;
            U u7 = this.f7305q;
            View view = u7.f6378o;
            sVar.getClass();
            o oVar = new o(view);
            u uVar = new u(u7.f6378o, new b(this.f7308t), oVar);
            if (U.c.f7025a) {
                AbstractC1767D.t(interfaceC1765B, null, new a(eVar, oVar, null), 3);
            }
            k0 k0Var = this.f7306r;
            if (k0Var != null) {
                k0Var.b(uVar);
            }
            eVar.f7316c = uVar;
            this.f7303o = 1;
            u7.a(uVar, this);
            return enumC0830a;
        } catch (Throwable th) {
            eVar.f7316c = null;
            throw th;
        }
    }
}
