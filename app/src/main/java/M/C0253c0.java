package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z.r1;

/* JADX INFO: renamed from: M.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0253c0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f4536q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253c0(K0.y yVar, j0 j0Var, c5.d dVar) {
        super(2, dVar);
        this.f4535p = yVar;
        this.f4536q = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0253c0(this.f4535p, this.f4536q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0253c0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4534o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f4534o = 1;
        Object objC = r1.c(this.f4535p, new C0259f0(this.f4536q, null), this);
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? enumC0830a : oVar;
    }
}
