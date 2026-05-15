package z;

import M.C0271p;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.C1217s;
import w.AbstractC1671d;

/* JADX INFO: renamed from: z.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2069w0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20980o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20981p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ P0 f20982q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long f20983r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C1217s f20984s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2069w0(P0 p02, long j3, C1217s c1217s, c5.d dVar) {
        super(2, dVar);
        this.f20982q = p02;
        this.f20983r = j3;
        this.f20984s = c1217s;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2069w0 c2069w0 = new C2069w0(this.f20982q, this.f20983r, this.f20984s, dVar);
        c2069w0.f20981p = obj;
        return c2069w0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2069w0) create((M0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20980o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            M0 m02 = (M0) this.f20981p;
            P0 p02 = this.f20982q;
            float fG = p02.g(this.f20983r);
            C0271p c0271p = new C0271p(this.f20984s, p02, m02, 10);
            this.f20980o = 1;
            if (AbstractC1671d.c(0.0f, fG, 0.0f, AbstractC1671d.k(0.0f, 0.0f, null, 7), c0271p, this) == enumC0830a) {
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
