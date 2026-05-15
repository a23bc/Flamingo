package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: i2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1070e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f13365p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070e(s sVar, c5.d dVar) {
        super(2, dVar);
        this.f13365p = sVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1070e(this.f13365p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1070e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13364o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f13364o = 1;
            this.f13365p.b(this);
            if (oVar == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return oVar;
    }
}
