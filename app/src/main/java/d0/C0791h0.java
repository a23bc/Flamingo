package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1180a;
import z.q1;

/* JADX INFO: renamed from: d0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0791h0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f11013q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0791h0(InterfaceC1180a interfaceC1180a, c5.d dVar) {
        super(2, dVar);
        this.f11013q = interfaceC1180a;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0791h0 c0791h0 = new C0791h0(this.f11013q, dVar);
        c0791h0.f11012p = obj;
        return c0791h0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0791h0) create((K0.y) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11011o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            K0.y yVar = (K0.y) this.f11012p;
            P p7 = new P(this.f11013q, 1);
            this.f11011o = 1;
            if (q1.e(yVar, null, p7, this, 7) == enumC0830a) {
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
