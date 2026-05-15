package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;
import x.C1812C;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20897o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0.y f20899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l5.f f20900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1812C f20901s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1812C f20902t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f20903u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(K0.y yVar, l5.f fVar, C1812C c1812c, C1812C c1812c2, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f20899q = yVar;
        this.f20900r = fVar;
        this.f20901s = c1812c;
        this.f20902t = c1812c2;
        this.f20903u = interfaceC1182c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        InterfaceC1182c interfaceC1182c = this.f20903u;
        l1 l1Var = new l1(this.f20899q, this.f20900r, this.f20901s, this.f20902t, interfaceC1182c, dVar);
        l1Var.f20898p = obj;
        return l1Var;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20897o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f20898p;
            K0.y yVar = this.f20899q;
            C2054o0 c2054o0 = new C2054o0(yVar);
            InterfaceC1182c interfaceC1182c = this.f20903u;
            k1 k1Var = new k1(interfaceC1765B, this.f20900r, this.f20901s, this.f20902t, interfaceC1182c, c2054o0, null);
            this.f20897o = 1;
            if (r1.c(yVar, k1Var, this) == enumC0830a) {
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
