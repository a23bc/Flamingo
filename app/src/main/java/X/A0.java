package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7870o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7871p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0 f7872q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(K0 k02, c5.d dVar, int i7) {
        super(1, dVar);
        this.f7870o = i7;
        this.f7872q = k02;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f7870o) {
            case 0:
                return new A0(this.f7872q, dVar, 0).invokeSuspend(Y4.o.f8736a);
            default:
                return new A0(this.f7872q, dVar, 1).invokeSuspend(Y4.o.f8736a);
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7870o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                int i7 = this.f7871p;
                K0 k02 = this.f7872q;
                if (i7 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    this.f7871p = 1;
                    if (k02.r(this) == enumC0830a) {
                        return enumC0830a;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        android.support.v4.media.session.b.K(obj);
                        return Y4.o.f8736a;
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                this.f7871p = 2;
                if (K0.b(k02, this) == enumC0830a) {
                    return enumC0830a;
                }
                return Y4.o.f8736a;
            default:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                int i8 = this.f7871p;
                K0 k03 = this.f7872q;
                if (i8 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    this.f7871p = 1;
                    if (k03.r(this) == enumC0830a2) {
                        return enumC0830a2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        android.support.v4.media.session.b.K(obj);
                        k03.f7938A = true;
                        return Y4.o.f8736a;
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                this.f7871p = 2;
                if (K0.b(k03, this) == enumC0830a2) {
                    return enumC0830a2;
                }
                k03.f7938A = true;
                return Y4.o.f8736a;
        }
    }
}
