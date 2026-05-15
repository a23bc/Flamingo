package i2;

import androidx.glance.session.SessionWorker;
import b2.C0671m;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ SessionWorker f13425p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SessionWorker sessionWorker, c5.d dVar) {
        super(2, dVar);
        this.f13425p = sessionWorker;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        v vVar = new v(this.f13425p, dVar);
        vVar.f13424o = obj;
        return vVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        o oVar = (o) this.f13424o;
        return (C0671m) oVar.f13407a.get(this.f13425p.f9672A);
    }
}
