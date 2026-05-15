package A5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2111f f541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f542r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC2111f interfaceC2111f, g gVar, c5.d dVar) {
        super(2, dVar);
        this.f541q = interfaceC2111f;
        this.f542r = gVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        e eVar = new e(this.f541q, this.f542r, dVar);
        eVar.f540p = obj;
        return eVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f539o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f540p;
        g gVar = this.f542r;
        int i8 = gVar.f547p;
        if (i8 == -3) {
            i8 = -2;
        }
        EnumC1766C enumC1766C = EnumC1766C.f19469q;
        l5.e fVar = new f(gVar, null);
        y5.o oVar2 = new y5.o(AbstractC1767D.u(interfaceC1765B, gVar.f546o), y5.j.a(i8, 4, gVar.f548q));
        oVar2.h0(enumC1766C, oVar2, fVar);
        this.f539o = 1;
        Object objF = z5.z.f(this.f541q, oVar2, true, this);
        if (objF != enumC0830a) {
            objF = oVar;
        }
        return objF == enumC0830a ? enumC0830a : oVar;
    }
}
