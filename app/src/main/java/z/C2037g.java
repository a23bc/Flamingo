package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import x.EnumC1862l0;

/* JADX INFO: renamed from: z.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2037g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2039h f20836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1 f20837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2029c f20838s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2037g(C2039h c2039h, t1 t1Var, InterfaceC2029c interfaceC2029c, c5.d dVar) {
        super(2, dVar);
        this.f20836q = c2039h;
        this.f20837r = t1Var;
        this.f20838s = interfaceC2029c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2037g c2037g = new C2037g(this.f20836q, this.f20837r, this.f20838s, dVar);
        c2037g.f20835p = obj;
        return c2037g;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2037g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20834o;
        C2039h c2039h = this.f20836q;
        try {
            try {
                if (i7 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    InterfaceC1786g0 interfaceC1786g0N = AbstractC1767D.n(((InterfaceC1765B) this.f20835p).g());
                    c2039h.f20851L = true;
                    P0 p02 = c2039h.f20843D;
                    EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
                    C2035f c2035f = new C2035f(this.f20837r, c2039h, this.f20838s, interfaceC1786g0N, null);
                    this.f20834o = 1;
                    if (p02.f(enumC1862l0, c2035f, this) == enumC0830a) {
                        return enumC0830a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.b.K(obj);
                }
                c2039h.f20846G.b();
                c2039h.f20851L = false;
                c2039h.f20846G.a(null);
                c2039h.f20848I = false;
                return Y4.o.f8736a;
            } catch (CancellationException e7) {
                throw e7;
            }
        } catch (Throwable th) {
            c2039h.f20851L = false;
            c2039h.f20846G.a(null);
            c2039h.f20848I = false;
            throw th;
        }
    }
}
