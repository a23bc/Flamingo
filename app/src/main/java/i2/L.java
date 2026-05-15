package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f13342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B2.g f13343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f13344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(w wVar, B2.g gVar, InterfaceC1765B interfaceC1765B, AtomicReference atomicReference, c5.d dVar) {
        super(2, dVar);
        this.f13342q = wVar;
        this.f13343r = gVar;
        this.f13344s = interfaceC1765B;
        this.f13345t = atomicReference;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        L l = new L(this.f13342q, this.f13343r, this.f13344s, this.f13345t, dVar);
        l.f13341p = obj;
        return l;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13340o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        K k7 = new K((InterfaceC1765B) this.f13341p, this.f13343r, this.f13344s, this.f13342q, this.f13345t);
        this.f13340o = 1;
        Object objInvoke = this.f13342q.invoke(k7, this);
        return objInvoke == enumC0830a ? enumC0830a : objInvoke;
    }
}
