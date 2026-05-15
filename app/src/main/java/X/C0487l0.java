package X;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: X.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0487l0 extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0495p0 f8102q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0487l0(C0495p0 c0495p0, c5.d dVar, int i7) {
        super(1, dVar);
        this.f8100o = i7;
        this.f8102q = c0495p0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        c5.d dVar = (c5.d) obj;
        switch (this.f8100o) {
            case 0:
                return new C0487l0(this.f8102q, dVar, 0).invokeSuspend(Y4.o.f8736a);
            default:
                return new C0487l0(this.f8102q, dVar, 1).invokeSuspend(Y4.o.f8736a);
        }
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8100o) {
            case 0:
                EnumC0830a enumC0830a = EnumC0830a.f11264o;
                int i7 = this.f8101p;
                if (i7 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    this.f8101p = 1;
                    if (C0495p0.a(this.f8102q, this) == enumC0830a) {
                        return enumC0830a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return Y4.o.f8736a;
            default:
                EnumC0830a enumC0830a2 = EnumC0830a.f11264o;
                int i8 = this.f8101p;
                if (i8 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    this.f8101p = 1;
                    if (C0495p0.a(this.f8102q, this) == enumC0830a2) {
                        return enumC0830a2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                return Y4.o.f8736a;
        }
    }
}
