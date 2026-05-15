package V4;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import l5.InterfaceC1180a;
import w5.InterfaceC1765B;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f7560o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ G f7561p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Y4.e f7562q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ float f7563r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0878b0 f7564s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(G g6, Y4.e eVar, float f7, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f7561p = g6;
        this.f7562q = eVar;
        this.f7563r = f7;
        this.f7564s = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new t(this.f7561p, this.f7562q, this.f7563r, this.f7564s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7560o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            float fFloatValue = ((Number) ((Z0) this.f7562q.getValue()).getValue()).floatValue();
            this.f7560o = 1;
            float f7 = x.f7589a;
            q qVar = new q(fFloatValue, this.f7563r, null);
            Object objA = this.f7561p.a(EnumC1862l0.f19772o, qVar, this);
            if (objA != enumC0830a) {
                objA = oVar;
            }
            if (objA == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        ((InterfaceC1180a) this.f7564s.getValue()).a();
        return oVar;
    }
}
