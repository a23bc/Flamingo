package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: z.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2030c0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y5.c f20789q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2030c0(y5.c cVar, c5.d dVar) {
        super(2, dVar);
        this.f20789q = cVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2030c0 c2030c0 = new C2030c0(this.f20789q, dVar);
        c2030c0.f20788p = obj;
        return c2030c0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2030c0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1786g0 interfaceC1786g0;
        Throwable th;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20787o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            w5.w0 w0VarT = AbstractC1767D.t((InterfaceC1765B) this.f20788p, null, new C2028b0(2, null), 3);
            try {
                y5.c cVar = this.f20789q;
                this.f20788p = w0VarT;
                this.f20787o = 1;
                Object objA = cVar.a(this);
                if (objA == enumC0830a) {
                    return enumC0830a;
                }
                interfaceC1786g0 = w0VarT;
                obj = objA;
            } catch (Throwable th2) {
                interfaceC1786g0 = w0VarT;
                th = th2;
                interfaceC1786g0.c(null);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1786g0 = (InterfaceC1786g0) this.f20788p;
            try {
                android.support.v4.media.session.b.K(obj);
            } catch (Throwable th3) {
                th = th3;
                interfaceC1786g0.c(null);
                throw th;
            }
        }
        C2026a0 c2026a0 = (C2026a0) obj;
        interfaceC1786g0.c(null);
        return c2026a0;
    }
}
