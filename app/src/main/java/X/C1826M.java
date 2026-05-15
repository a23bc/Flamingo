package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1826M extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19667o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ B.k f19668p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ B.j f19669q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ w5.N f19670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826M(B.k kVar, B.j jVar, w5.N n7, c5.d dVar) {
        super(2, dVar);
        this.f19668p = kVar;
        this.f19669q = jVar;
        this.f19670r = n7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1826M(this.f19668p, this.f19669q, this.f19670r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1826M) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19667o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f19667o = 1;
            if (this.f19668p.a(this.f19669q, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        w5.N n7 = this.f19670r;
        if (n7 != null) {
            n7.a();
        }
        return Y4.o.f8736a;
    }
}
