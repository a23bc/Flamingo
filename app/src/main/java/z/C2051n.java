package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x.C1870p0;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: renamed from: z.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2051n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2053o f20916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ EnumC1862l0 f20917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l5.e f20918r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2051n(C2053o c2053o, EnumC1862l0 enumC1862l0, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f20916p = c2053o;
        this.f20917q = enumC1862l0;
        this.f20918r = eVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C2051n(this.f20916p, this.f20917q, this.f20918r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2051n) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20915o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C2053o c2053o = this.f20916p;
            C1872q0 c1872q0 = c2053o.f20927c;
            I.B b7 = c2053o.f20926b;
            C2049m c2049m = new C2049m(c2053o, this.f20918r, null);
            this.f20915o = 1;
            c1872q0.getClass();
            if (AbstractC1767D.h(new C1870p0(this.f20917q, c1872q0, c2049m, b7, null), this) == enumC0830a) {
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
