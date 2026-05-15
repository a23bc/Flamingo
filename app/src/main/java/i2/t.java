package i2;

import b2.C0671m;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13419p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0671m f13420q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0671m c0671m, c5.d dVar) {
        super(2, dVar);
        this.f13420q = c0671m;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        t tVar = new t(this.f13420q, dVar);
        tVar.f13419p = obj;
        return tVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((o) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13418o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        o oVar2 = (o) this.f13419p;
        String str = this.f13420q.f10226a;
        this.f13418o = 1;
        C0671m c0671m = (C0671m) oVar2.f13407a.remove(str);
        if (c0671m != null) {
            c0671m.f10228c.h(null, false);
            c0671m.f10227b.set(false);
            c0671m.l.c(null);
        }
        return oVar == enumC0830a ? enumC0830a : oVar;
    }
}
