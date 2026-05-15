package M;

import X.K0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z.q1;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K0.y f4398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0 f4399q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K0.y yVar, K0 k02, c5.d dVar) {
        super(2, dVar);
        this.f4398p = yVar;
        this.f4399q = k02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new G(this.f4398p, this.f4399q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4397o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            r rVar = new r(this.f4399q, 1);
            this.f4397o = 1;
            if (q1.e(this.f4398p, null, rVar, this, 7) == enumC0830a) {
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
