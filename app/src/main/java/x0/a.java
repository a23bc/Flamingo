package X0;

import L2.C0247a;
import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f8223o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ f f8224p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Runnable f8225q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, c5.d dVar) {
        super(2, dVar);
        this.f8224p = fVar;
        this.f8225q = runnable;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new a(this.f8224p, this.f8225q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8223o;
        f fVar = this.f8224p;
        o oVar = o.f8736a;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            i iVar = fVar.f8250f;
            this.f8223o = 1;
            Object objB = iVar.b(0.0f - iVar.f8256b, this);
            if (objB != enumC0830a) {
                objB = oVar;
            }
            if (objB == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        C0247a c0247a = fVar.f8247c;
        ((C0894j0) c0247a.f4105p).setValue(Boolean.FALSE);
        this.f8225q.run();
        return oVar;
    }
}
