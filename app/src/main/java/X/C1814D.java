package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import x0.C1892b;
import z.C2054o0;

/* JADX INFO: renamed from: x.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1814D extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ C2054o0 f19611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ long f19612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1820G f19613r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814D(C1820G c1820g, c5.d dVar) {
        super(3, dVar);
        this.f19613r = c1820g;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1892b) obj2).f19867a;
        C1814D c1814d = new C1814D(this.f19613r, (c5.d) obj3);
        c1814d.f19611p = (C2054o0) obj;
        c1814d.f19612q = j3;
        return c1814d.invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Object objH;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19610o;
        Y4.o oVar = Y4.o.f8736a;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C2054o0 c2054o0 = this.f19611p;
            long j3 = this.f19612q;
            C1820G c1820g = this.f19613r;
            if (c1820g.f19795J) {
                this.f19610o = 1;
                B.k kVar = c1820g.f19790E;
                if (kVar == null || (objH = AbstractC1767D.h(new C1847e(c2054o0, j3, kVar, c1820g, null), this)) != enumC0830a) {
                    objH = oVar;
                }
                if (objH == enumC0830a) {
                    return enumC0830a;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return oVar;
    }
}
