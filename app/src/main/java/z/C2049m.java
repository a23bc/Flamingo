package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: z.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2049m extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2053o f20906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l5.e f20907r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2049m(C2053o c2053o, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f20906q = c2053o;
        this.f20907r = eVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2049m c2049m = new C2049m(this.f20906q, this.f20907r, dVar);
        c2049m.f20905p = obj;
        return c2049m;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2049m) create((InterfaceC2058q0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20904o;
        C2053o c2053o = this.f20906q;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                InterfaceC2058q0 interfaceC2058q0 = (InterfaceC2058q0) this.f20905p;
                c2053o.f20928d.setValue(Boolean.TRUE);
                l5.e eVar = this.f20907r;
                this.f20904o = 1;
                if (eVar.invoke(interfaceC2058q0, this) == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            c2053o.f20928d.setValue(Boolean.FALSE);
            return Y4.o.f8736a;
        } catch (Throwable th) {
            c2053o.f20928d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
