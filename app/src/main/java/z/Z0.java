package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0.y f20768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f20769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f20770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2054o0 f20771t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Z0(K0.y yVar, l5.f fVar, InterfaceC1182c interfaceC1182c, C2054o0 c2054o0, c5.d dVar) {
        super(2, dVar);
        this.f20768q = yVar;
        this.f20769r = (AbstractC0871i) fVar;
        this.f20770s = interfaceC1182c;
        this.f20771t = c2054o0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        InterfaceC1182c interfaceC1182c = this.f20770s;
        C2054o0 c2054o0 = this.f20771t;
        Z0 z02 = new Z0(this.f20768q, this.f20769r, interfaceC1182c, c2054o0, dVar);
        z02.f20767p = obj;
        return z02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [e5.i, l5.f] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20766o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            Y0 y02 = new Y0((InterfaceC1765B) this.f20767p, this.f20769r, this.f20770s, this.f20771t, null);
            this.f20766o = 1;
            if (r1.c(this.f20768q, y02, this) == enumC0830a) {
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
