package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1217s;
import w.AbstractC1671d;

/* JADX INFO: renamed from: d0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780c extends AbstractC0871i implements l5.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ C0799n f10970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ F f10971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0801p f10973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10974t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780c(C0801p c0801p, float f7, c5.d dVar) {
        super(4, dVar);
        this.f10973s = c0801p;
        this.f10974t = f7;
    }

    @Override // l5.g
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        C0780c c0780c = new C0780c(this.f10973s, this.f10974t, (c5.d) obj4);
        c0780c.f10970p = (C0799n) obj;
        c0780c.f10971q = (F) obj2;
        c0780c.f10972r = obj3;
        return c0780c.invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10969o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0799n c0799n = this.f10970p;
            float fD = this.f10971q.d(this.f10972r);
            if (!Float.isNaN(fD)) {
                C1217s c1217s = new C1217s();
                C0801p c0801p = this.f10973s;
                float fH = Float.isNaN(c0801p.f11063i.h()) ? 0.0f : c0801p.f11063i.h();
                c1217s.f14436o = fH;
                w.S s7 = AbstractC0778b.f10953a;
                O0.Q q7 = new O0.Q(c0799n, 4, c1217s);
                this.f10970p = null;
                this.f10971q = null;
                this.f10969o = 1;
                if (AbstractC1671d.c(fH, fD, this.f10974t, s7, q7, this) == enumC0830a) {
                    return enumC0830a;
                }
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
