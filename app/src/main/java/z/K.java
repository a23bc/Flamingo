package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f20671o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, c5.d dVar, int i8) {
        super(i7, dVar);
        this.f20671o = i8;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f20671o) {
            case 0:
                long j3 = ((C1892b) obj2).f19867a;
                K k7 = new K(3, (c5.d) obj3, 0);
                Y4.o oVar = Y4.o.f8736a;
                k7.invokeSuspend(oVar);
                return oVar;
            case 1:
                ((Number) obj2).floatValue();
                K k8 = new K(3, (c5.d) obj3, 1);
                Y4.o oVar2 = Y4.o.f8736a;
                k8.invokeSuspend(oVar2);
                return oVar2;
            default:
                long j7 = ((C1892b) obj2).f19867a;
                K k9 = new K(3, (c5.d) obj3, 2);
                Y4.o oVar3 = Y4.o.f8736a;
                k9.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        switch (this.f20671o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                break;
            case 1:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                break;
            default:
                EnumC0830a enumC0830a3 = EnumC0830a.f11264o;
                android.support.v4.media.session.b.K(obj);
                break;
        }
        return oVar;
    }
}
