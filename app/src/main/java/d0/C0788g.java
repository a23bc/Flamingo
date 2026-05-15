package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0879c;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import m5.C1220v;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: d0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1210l f11001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f11002r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0788g(InterfaceC1180a interfaceC1180a, l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f11001q = (AbstractC1210l) interfaceC1180a;
        this.f11002r = (AbstractC0871i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0788g c0788g = new C0788g(this.f11001q, this.f11002r, dVar);
        c0788g.f11000p = obj;
        return c0788g;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0788g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l5.a, m5.l] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10999o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f11000p;
            C1220v c1220v = new C1220v();
            z3.t tVarZ = C0879c.z(this.f11001q);
            A5.D d4 = new A5.D(c1220v, interfaceC1765B, (l5.e) this.f11002r);
            this.f10999o = 1;
            if (tVarZ.b(d4, this) == enumC0830a) {
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
