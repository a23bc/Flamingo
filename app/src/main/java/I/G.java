package I;

import D.C0078t;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0886f0;
import m5.C1217s;
import o5.AbstractC1267a;
import w.AbstractC1671d;
import w.InterfaceC1679l;
import z.InterfaceC2058q0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f3268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f3269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f3271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1679l f3272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k7, int i7, float f7, InterfaceC1679l interfaceC1679l, c5.d dVar) {
        super(2, dVar);
        this.f3269q = k7;
        this.f3270r = i7;
        this.f3271s = f7;
        this.f3272t = interfaceC1679l;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        G g6 = new G(this.f3269q, this.f3270r, this.f3271s, this.f3272t, dVar);
        g6.f3268p = obj;
        return g6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC2058q0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        int i7;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i8 = this.f3267o;
        Y4.o oVar = Y4.o.f8736a;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        android.support.v4.media.session.b.K(obj);
        InterfaceC2058q0 interfaceC2058q0 = (InterfaceC2058q0) this.f3268p;
        K k7 = this.f3269q;
        B b7 = new B(interfaceC2058q0, k7);
        this.f3267o = 1;
        float f7 = O.f3317a;
        int i9 = this.f3270r;
        k7.f3307s.j(k7.j(new Integer(i9).intValue()));
        boolean z6 = i9 > k7.f3295e;
        int i10 = (((C0218j) Z4.n.x0(k7.l().f3408a)).f3361a - k7.f3295e) + 1;
        if (((z6 && i9 > ((C0218j) Z4.n.x0(k7.l().f3408a)).f3361a) || (!z6 && i9 < k7.f3295e)) && Math.abs(i9 - k7.f3295e) >= 3) {
            if (z6) {
                int i11 = i7;
                k7.u(0 / k7.o(), i11, true);
            } else {
                int i112 = i7;
                k7.u(0 / k7.o(), i112, true);
            }
        }
        Object objC = AbstractC1671d.c(0.0f, ((int) (i6.h.r(android.support.v4.media.session.b.n(k7) + ((long) AbstractC1267a.H(((k7.o() * (i9 - k7.k())) - (((C0886f0) k7.f3294d.f3207e).h() * k7.o())) + 0)), k7.h, k7.f3297g) - android.support.v4.media.session.b.n(k7))) + this.f3271s, 0.0f, this.f3272t, new C0078t(new C1217s(), 3, b7), this);
        if (objC != enumC0830a) {
            objC = oVar;
        }
        return objC == enumC0830a ? enumC0830a : oVar;
    }
}
