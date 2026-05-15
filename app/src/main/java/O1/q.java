package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f5545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f5546p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G g6, c5.d dVar) {
        super(2, dVar);
        this.f5546p = g6;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        q qVar = new q(this.f5546p, dVar);
        qVar.f5545o = obj;
        return qVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((G) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        G g6 = (G) this.f5545o;
        G g7 = this.f5546p;
        boolean z6 = false;
        if (!(g7 instanceof C0330b) && !(g7 instanceof C0336h) && g6 == g7) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
