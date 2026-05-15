package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f553o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ o f554p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC2111f f555q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f556r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC2111f interfaceC2111f, Object obj, c5.d dVar) {
        super(2, dVar);
        this.f554p = oVar;
        this.f555q = interfaceC2111f;
        this.f556r = obj;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new k(this.f554p, this.f555q, this.f556r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f553o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            ?? r42 = this.f554p.f571s;
            this.f553o = 1;
            if (r42.d(this.f555q, this.f556r, this) == enumC0830a) {
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
