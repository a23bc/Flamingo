package b2;

import android.os.Bundle;
import d0.C0800o;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: b2.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641K extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f10076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f10077r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0641K(C0800o c0800o, l5.e eVar, c5.d dVar) {
        super(3, dVar);
        this.f10074o = 2;
        this.f10076q = c0800o;
        this.f10077r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [e5.i, l5.e] */
    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f10074o) {
            case 0:
                C0641K c0641k = new C0641K((Bundle) this.f10077r, (c5.d) obj3, 0);
                c0641k.f10076q = (C0671m) obj2;
                return c0641k.invokeSuspend(Y4.o.f8736a);
            case 1:
                C0641K c0641k2 = new C0641K((String) this.f10077r, (c5.d) obj3, 1);
                c0641k2.f10076q = (C0671m) obj2;
                return c0641k2.invokeSuspend(Y4.o.f8736a);
            default:
                ?? r42 = (AbstractC0871i) this.f10077r;
                return new C0641K((C0800o) this.f10076q, (l5.e) r42, (c5.d) obj3).invokeSuspend(Y4.o.f8736a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10074o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                int i7 = this.f10075p;
                Y4.o oVar = Y4.o.f8736a;
                if (i7 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    C0671m c0671m = (C0671m) this.f10076q;
                    this.f10075p = 1;
                    c0671m.getClass();
                    Object objE = c0671m.e(new C0655e((Bundle) this.f10077r), this);
                    if (objE != enumC0830a) {
                        objE = oVar;
                    }
                    if (objE == enumC0830a) {
                        return enumC0830a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return oVar;
            case 1:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                int i8 = this.f10075p;
                Y4.o oVar2 = Y4.o.f8736a;
                if (i8 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    C0671m c0671m2 = (C0671m) this.f10076q;
                    this.f10075p = 1;
                    String str = (String) this.f10077r;
                    c0671m2.getClass();
                    Object objE2 = c0671m2.e(new C0653d(str), this);
                    if (objE2 != enumC0830a2) {
                        objE2 = oVar2;
                    }
                    if (objE2 == enumC0830a2) {
                        return enumC0830a2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return oVar2;
            default:
                EnumC0830a enumC0830a3 = EnumC0830a.f11264o;
                int i9 = this.f10075p;
                if (i9 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    V4.F f7 = ((C0800o) this.f10076q).f11050a;
                    this.f10075p = 1;
                    if (((AbstractC0871i) this.f10077r).invoke(f7, this) == enumC0830a3) {
                        return enumC0830a3;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return Y4.o.f8736a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0641K(Object obj, c5.d dVar, int i7) {
        super(3, dVar);
        this.f10074o = i7;
        this.f10077r = obj;
    }
}
