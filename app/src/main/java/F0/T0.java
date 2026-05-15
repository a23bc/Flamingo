package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l5.e f11751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f11752r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(l5.e eVar, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f11751q = eVar;
        this.f11752r = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        T0 t02 = new T0(this.f11751q, this.f11752r, dVar);
        t02.f11750p = obj;
        return t02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11749o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0909r0 c0909r0 = new C0909r0(this.f11752r, ((InterfaceC1765B) this.f11750p).g());
            this.f11749o = 1;
            if (this.f11751q.invoke(c0909r0, this) == enumC0830a) {
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
