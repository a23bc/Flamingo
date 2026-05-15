package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1219u;
import w5.InterfaceC1765B;
import z.C2064u;
import z.C2074z;
import z.r1;

/* JADX INFO: renamed from: M.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0255d0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f4541q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255d0(K0.y yVar, j0 j0Var, c5.d dVar) {
        super(2, dVar);
        this.f4540p = yVar;
        this.f4541q = j0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0255d0(this.f4540p, this.f4541q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0255d0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4539o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f4539o = 1;
        j0 j0Var = this.f4541q;
        C0249a0 c0249a0 = new C0249a0(j0Var, 0);
        C0251b0 c0251b0 = new C0251b0(j0Var, 0);
        C0251b0 c0251b02 = new C0251b0(j0Var, 1);
        D.D0 d02 = new D.D0(4, j0Var);
        D0 d03 = new D0(3, c0249a0);
        p6.f fVar = new p6.f(5, c0251b0);
        C2064u c2064u = new C2064u(0);
        float f7 = z.B.f20595a;
        Object objC = r1.c(this.f4540p, new C2074z(c2064u, new C1219u(), null, d03, d02, c0251b02, fVar, null), this);
        if (objC != enumC0830a) {
            objC = oVar;
        }
        if (objC != enumC0830a) {
            objC = oVar;
        }
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? enumC0830a : oVar;
    }
}
