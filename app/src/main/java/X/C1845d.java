package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B.m f19718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1869p f19720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f19721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B.k f19722s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1845d(AbstractC1869p abstractC1869p, long j3, B.k kVar, c5.d dVar) {
        super(2, dVar);
        this.f19720q = abstractC1869p;
        this.f19721r = j3;
        this.f19722s = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1845d(this.f19720q, this.f19721r, this.f19722s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1845d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        B.m mVar;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19719p;
        AbstractC1869p abstractC1869p = this.f19720q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            if (abstractC1869p.G0()) {
                long j3 = AbstractC1887y.f19857a;
                this.f19719p = 1;
                if (AbstractC1767D.i(j3, this) != enumC0830a) {
                }
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = this.f19718o;
                android.support.v4.media.session.b.K(obj);
                abstractC1869p.f19801P = mVar;
                return Y4.o.f8736a;
            }
            android.support.v4.media.session.b.K(obj);
        }
        B.m mVar2 = new B.m(this.f19721r);
        this.f19718o = mVar2;
        this.f19719p = 2;
        if (this.f19722s.a(mVar2, this) != enumC0830a) {
            mVar = mVar2;
            abstractC1869p.f19801P = mVar;
            return Y4.o.f8736a;
        }
        return enumC0830a;
    }
}
