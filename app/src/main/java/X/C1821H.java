package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1218t;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1821H extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1822I f19648p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821H(C1822I c1822i, c5.d dVar) {
        super(2, dVar);
        this.f19648p = c1822i;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1821H(this.f19648p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1821H) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19647o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return Y4.o.f8736a;
        }
        android.support.v4.media.session.b.K(obj);
        C1218t c1218t = new C1218t();
        C1218t c1218t2 = new C1218t();
        C1218t c1218t3 = new C1218t();
        C1822I c1822i = this.f19648p;
        z5.y yVar = c1822i.f19649C.f598a;
        A5.m mVar = new A5.m(c1218t, c1218t2, c1218t3, c1822i, 2);
        this.f19647o = 1;
        yVar.getClass();
        z5.y.k(yVar, mVar, this);
        return enumC0830a;
    }
}
