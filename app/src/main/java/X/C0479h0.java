package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import f0.Z0;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: X.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479h0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f8080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1670c f8081r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479h0(Z0 z02, C1670c c1670c, c5.d dVar) {
        super(2, dVar);
        this.f8080q = z02;
        this.f8081r = c1670c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0479h0 c0479h0 = new C0479h0(this.f8080q, this.f8081r, dVar);
        c0479h0.f8079p = obj;
        return c0479h0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0479h0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8078o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f8079p;
            z3.t tVarZ = C0879c.z(new C0473e0(this.f8080q, 0));
            C0477g0 c0477g0 = new C0477g0(this.f8081r, interfaceC1765B, 0);
            this.f8078o = 1;
            if (tVarZ.b(c0477g0, this) == enumC0830a) {
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
