package V4;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.InterfaceC1765B;
import z.r1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f7575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f7576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f7578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f7579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y4.e f7580u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f7581v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z6, int i7, InterfaceC1765B interfaceC1765B, G g6, Y4.e eVar, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f7576q = z6;
        this.f7577r = i7;
        this.f7578s = interfaceC1765B;
        this.f7579t = g6;
        this.f7580u = eVar;
        this.f7581v = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        InterfaceC0878b0 interfaceC0878b0 = this.f7581v;
        v vVar = new v(this.f7576q, this.f7577r, this.f7578s, this.f7579t, this.f7580u, interfaceC0878b0, dVar);
        vVar.f7575p = obj;
        return vVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((K0.y) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7574o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            K0.y yVar = (K0.y) this.f7575p;
            InterfaceC0878b0 interfaceC0878b0 = this.f7581v;
            u uVar = new u(this.f7576q, this.f7577r, this.f7578s, this.f7579t, this.f7580u, interfaceC0878b0, null);
            this.f7574o = 1;
            if (r1.c(yVar, uVar, this) == enumC0830a) {
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
