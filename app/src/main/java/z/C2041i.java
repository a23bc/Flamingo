package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x.C1870p0;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: renamed from: z.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2041i extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2043j f20857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ EnumC1862l0 f20858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f20859r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2041i(C2043j c2043j, EnumC1862l0 enumC1862l0, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f20857p = c2043j;
        this.f20858q = enumC1862l0;
        this.f20859r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C2041i(this.f20857p, this.f20858q, this.f20859r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2041i) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20856o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C2043j c2043j = this.f20857p;
            C1872q0 c1872q0 = c2043j.f20868c;
            V4.F f7 = c2043j.f20867b;
            this.f20856o = 1;
            ?? r62 = this.f20859r;
            c1872q0.getClass();
            if (AbstractC1767D.h(new C1870p0(this.f20858q, c1872q0, r62, f7, null), this) == enumC0830a) {
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
