package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0888g0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import o5.AbstractC1267a;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G f17861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17862r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(InterfaceC0878b0 interfaceC0878b0, G g6, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f17860p = interfaceC0878b0;
        this.f17861q = g6;
        this.f17862r = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new t0(this.f17860p, this.f17861q, this.f17862r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f17859o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f17859o = 1;
            if (AbstractC1767D.i(240L, this) != enumC0830a) {
            }
            return enumC0830a;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        if (((Boolean) this.f17860p.getValue()).booleanValue()) {
            C0888g0 c0888g0 = a6.b.f8883a;
            int iH = c0888g0.h() + 1;
            if (iH < 0) {
                iH = 0;
            }
            int iH2 = AbstractC1267a.H(((Number) this.f17862r.b(new Integer(c0888g0.h()))).floatValue());
            this.f17859o = 2;
            if (this.f17861q.a(iH, iH2, false, this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return oVar;
    }
}
