package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ long f20635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H0 f20636q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h02, c5.d dVar) {
        super(2, dVar);
        this.f20636q = h02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        G0 g02 = new G0(this.f20636q, dVar);
        g02.f20635p = ((C1892b) obj).f19867a;
        return g02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        long j3 = ((C1892b) obj).f19867a;
        G0 g02 = new G0(this.f20636q, (c5.d) obj2);
        g02.f20635p = j3;
        return g02.invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20634o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return obj;
        }
        android.support.v4.media.session.b.K(obj);
        long j3 = this.f20635p;
        P0 p02 = this.f20636q.f20647S;
        this.f20634o = 1;
        Object objA = androidx.compose.foundation.gestures.a.a(p02, j3, this);
        return objA == enumC0830a ? enumC0830a : objA;
    }
}
