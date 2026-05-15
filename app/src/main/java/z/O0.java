package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0 f20703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f20704r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O0(P0 p02, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f20703q = p02;
        this.f20704r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        O0 o02 = new O0(this.f20703q, this.f20704r, dVar);
        o02.f20702p = obj;
        return o02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O0) create((InterfaceC2058q0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20701o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC2058q0 interfaceC2058q0 = (InterfaceC2058q0) this.f20702p;
            P0 p02 = this.f20703q;
            p02.f20720k = interfaceC2058q0;
            M0 m02 = p02.l;
            this.f20701o = 1;
            if (this.f20704r.invoke(m02, this) == enumC0830a) {
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
