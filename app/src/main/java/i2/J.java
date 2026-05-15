package i2;

import A2.W;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;
import v5.AbstractC1643a;
import v5.EnumC1645c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K f13330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B2.g f13331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f13332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f13333s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k7, B2.g gVar, InterfaceC1765B interfaceC1765B, w wVar, c5.d dVar) {
        super(2, dVar);
        this.f13330p = k7;
        this.f13331q = gVar;
        this.f13332r = interfaceC1765B;
        this.f13333s = wVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new J(this.f13330p, this.f13331q, this.f13332r, this.f13333s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13329o;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.K(obj);
        do {
            K k7 = this.f13330p;
            Object obj3 = k7.f13335p.get();
            AbstractC1209k.c(obj3);
            long jLongValue = ((Number) obj3).longValue();
            this.f13331q.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            obj2 = Y4.o.f8736a;
            if (jLongValue <= jCurrentTimeMillis) {
                AbstractC1767D.f(this.f13332r, new H("Timed out of executing block.", this.f13333s.hashCode()));
                return obj2;
            }
            long jA = k7.a();
            this.f13329o = 1;
            int i8 = AbstractC1643a.f18315q;
            long jD = 0;
            boolean z6 = jA > 0;
            if (z6) {
                jD = AbstractC1643a.d(AbstractC1643a.f(jA, i6.g.D(999999L, EnumC1645c.f18317p)));
            } else if (z6) {
                throw new W();
            }
            Object objI = AbstractC1767D.i(jD, this);
            if (objI == EnumC0830a.f11264o) {
                obj2 = objI;
            }
        } while (obj2 != enumC0830a);
        return enumC0830a;
    }
}
