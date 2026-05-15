package i2;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import d0.C0798m;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f13426o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f13427p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ SessionWorker f13428q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SessionWorker sessionWorker, c5.d dVar) {
        super(2, dVar);
        this.f13428q = sessionWorker;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        w wVar = new w(this.f13428q, dVar);
        wVar.f13427p = obj;
        return wVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((K) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13426o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        K k7 = (K) this.f13427p;
        SessionWorker sessionWorker = this.f13428q;
        Context context = sessionWorker.f9837o;
        s sVar = new s(k7, sessionWorker, null, 0);
        C0798m c0798m = new C0798m(sessionWorker, k7, null);
        this.f13426o = 1;
        Object objH = AbstractC1767D.h(new C1071f(context, c0798m, sVar, null), this);
        return objH == enumC0830a ? enumC0830a : objH;
    }
}
