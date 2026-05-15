package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: renamed from: d0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797l extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11035o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11036p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0780c f11037q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0801p f11038r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797l(C0780c c0780c, C0801p c0801p, c5.d dVar) {
        super(2, dVar);
        this.f11037q = c0780c;
        this.f11038r = c0801p;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0797l c0797l = new C0797l(this.f11037q, this.f11038r, dVar);
        c0797l.f11036p = obj;
        return c0797l;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0797l) create((Y4.h) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f11035o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            Y4.h hVar = (Y4.h) this.f11036p;
            F f7 = (F) hVar.f8726o;
            C0799n c0799n = this.f11038r.f11066m;
            this.f11035o = 1;
            if (this.f11037q.h(c0799n, f7, hVar.f8727p, this) == enumC0830a) {
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
