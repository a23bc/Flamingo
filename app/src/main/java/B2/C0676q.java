package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import w5.AbstractC1767D;

/* JADX INFO: renamed from: b2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0676q extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10276o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ A0.b f10278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f10279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0651c f10280s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0676q(A0.b bVar, Context context, C0651c c0651c, c5.d dVar) {
        super(2, dVar);
        this.f10278q = bVar;
        this.f10279r = context;
        this.f10280s = c0651c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0676q c0676q = new C0676q(this.f10278q, this.f10279r, this.f10280s, dVar);
        c0676q.f10277p = obj;
        return c0676q;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0676q) create((y5.p) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10276o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0675p c0675p = new C0675p(new AtomicReference(null), (y5.p) this.f10277p);
            C0673n c0673n = new C0673n(this.f10278q, this.f10279r, this.f10280s, null);
            this.f10276o = 1;
            if (AbstractC1767D.C(c0675p, c0673n, this) == enumC0830a) {
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
