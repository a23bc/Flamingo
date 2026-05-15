package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: d0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777a0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0 f10952p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777a0(n0 n0Var, c5.d dVar) {
        super(2, dVar);
        this.f10952p = n0Var;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0777a0(this.f10952p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0777a0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10951o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        this.f10951o = 1;
        n0 n0Var = this.f10952p;
        F fD = n0Var.f11048a.d();
        o0 o0Var = o0.f11054q;
        if (!fD.f10847a.containsKey(o0Var)) {
            o0Var = o0.f11053p;
        }
        Object objA = n0.a(n0Var, o0Var, this);
        if (objA != enumC0830a) {
            objA = oVar;
        }
        return objA == enumC0830a ? enumC0830a : oVar;
    }
}
