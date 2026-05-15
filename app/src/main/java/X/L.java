package X;

import R0.C0386i;
import R0.C0391k0;
import R0.InterfaceC0393l0;
import b1.C0622g;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0393l0 f7964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0622g f7965q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InterfaceC0393l0 interfaceC0393l0, C0622g c0622g, c5.d dVar) {
        super(2, dVar);
        this.f7964p = interfaceC0393l0;
        this.f7965q = c0622g;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new L(this.f7964p, this.f7965q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7963o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        C0391k0 c0391k0A = C.d.a(this.f7965q);
        this.f7963o = 1;
        ((C0386i) this.f7964p).a(c0391k0A);
        return oVar == enumC0830a ? enumC0830a : oVar;
    }
}
