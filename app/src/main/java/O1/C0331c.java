package O1;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.List;

/* JADX INFO: renamed from: O1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0331c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f5518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f5519q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331c(List list, c5.d dVar) {
        super(2, dVar);
        this.f5519q = list;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0331c c0331c = new C0331c(this.f5519q, dVar);
        c0331c.f5518p = obj;
        return c0331c;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0331c) create((x) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f5517o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            x xVar = (x) this.f5518p;
            this.f5517o = 1;
            if (N5.d.g(this.f5519q, xVar, this) == enumC0830a) {
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
