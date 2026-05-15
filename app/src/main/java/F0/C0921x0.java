package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: f0.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0921x0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A0 f11947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X f11948r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0921x0(A0 a0, X x6, c5.d dVar) {
        super(2, dVar);
        this.f11947q = a0;
        this.f11948r = x6;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0921x0 c0921x0 = new C0921x0(this.f11947q, this.f11948r, dVar);
        c0921x0.f11946p = obj;
        return c0921x0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0921x0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11945o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return Y4.o.f8736a;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f11946p;
        this.f11945o = 1;
        this.f11947q.d(interfaceC1765B, this.f11948r, this);
        return enumC0830a;
    }
}
