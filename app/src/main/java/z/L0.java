package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1219u;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P0 f20676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1219u f20677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f20680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P0 f20681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1219u f20682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f20683v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(P0 p02, C1219u c1219u, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20681t = p02;
        this.f20682u = c1219u;
        this.f20683v = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        L0 l02 = new L0(this.f20681t, this.f20682u, this.f20683v, dVar);
        l02.f20680s = obj;
        return l02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((M0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        P0 p02;
        C1219u c1219u;
        long j3;
        P0 p03;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20679r;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            M0 m02 = (M0) this.f20680s;
            p02 = this.f20681t;
            K0 k02 = new K0(p02, m02);
            S s7 = p02.f20713c;
            c1219u = this.f20682u;
            long j7 = c1219u.f14438o;
            EnumC2048l0 enumC2048l0 = p02.f20714d;
            EnumC2048l0 enumC2048l02 = EnumC2048l0.f20895p;
            long j8 = this.f20683v;
            float fD = p02.d(enumC2048l0 == enumC2048l02 ? n1.r.b(j8) : n1.r.c(j8));
            this.f20680s = p02;
            this.f20676o = p02;
            this.f20677p = c1219u;
            this.f20678q = j7;
            this.f20679r = 1;
            obj = s7.a(k02, fD, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
            j3 = j7;
            p03 = p02;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f20678q;
            c1219u = this.f20677p;
            p02 = this.f20676o;
            p03 = (P0) this.f20680s;
            android.support.v4.media.session.b.K(obj);
        }
        float fD2 = p03.d(((Number) obj).floatValue());
        c1219u.f14438o = p02.f20714d == EnumC2048l0.f20895p ? n1.r.a(j3, fD2, 0.0f, 2) : n1.r.a(j3, 0.0f, fD2, 1);
        return Y4.o.f8736a;
    }
}
