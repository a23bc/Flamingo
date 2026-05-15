package V4;

import d0.D0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f7534p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, c5.d dVar, int i7) {
        super(3, dVar);
        this.f7533o = i7;
        this.f7534p = obj;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) throws Exception {
        int i7 = this.f7533o;
        ((Number) obj2).floatValue();
        c5.d dVar = (c5.d) obj3;
        switch (i7) {
            case 0:
                m mVar = new m((InterfaceC0878b0) this.f7534p, dVar, 0);
                Y4.o oVar = Y4.o.f8736a;
                mVar.invokeSuspend(oVar);
                return oVar;
            default:
                m mVar2 = new m((D0) this.f7534p, dVar, 1);
                Y4.o oVar2 = Y4.o.f8736a;
                mVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Exception {
        Y4.o oVar = Y4.o.f8736a;
        Object obj2 = this.f7534p;
        switch (this.f7533o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((InterfaceC1180a) ((InterfaceC0878b0) obj2).getValue()).a();
                break;
            default:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                ((D0) obj2).f10841j.a();
                break;
        }
        return oVar;
    }
}
