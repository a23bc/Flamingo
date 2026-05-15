package d0;

import b2.C0641K;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: d0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0794j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0641K f11023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0801p f11024r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0794j(C0641K c0641k, C0801p c0801p, c5.d dVar) {
        super(2, dVar);
        this.f11023q = c0641k;
        this.f11024r = c0801p;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0794j c0794j = new C0794j(this.f11023q, this.f11024r, dVar);
        c0794j.f11022p = obj;
        return c0794j;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0794j) create((F) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11021o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            F f7 = (F) this.f11022p;
            C0799n c0799n = this.f11024r.f11066m;
            this.f11021o = 1;
            if (this.f11023q.d(c0799n, f7, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
