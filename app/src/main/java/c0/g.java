package c0;

import X.C0477g0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B.k f10556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0709a f10557r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(B.k kVar, C0709a c0709a, c5.d dVar) {
        super(2, dVar);
        this.f10556q = kVar;
        this.f10557r = c0709a;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        g gVar = new g(this.f10556q, this.f10557r, dVar);
        gVar.f10555p = obj;
        return gVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10554o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return Y4.o.f8736a;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f10555p;
        z5.y yVar = this.f10556q.f598a;
        C0477g0 c0477g0 = new C0477g0(this.f10557r, interfaceC1765B, 1);
        this.f10554o = 1;
        yVar.getClass();
        z5.y.k(yVar, c0477g0, this);
        return enumC0830a;
    }
}
