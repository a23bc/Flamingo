package z;

import I.C0224p;
import M.C0265j;
import M.C0271p;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import m5.C1219u;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f20604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K0.y f20605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f20606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0224p f20607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0265j f20608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f20609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C f20610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0271p f20611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(K0.y yVar, J j3, C0224p c0224p, C0265j c0265j, C c7, C c8, C0271p c0271p, c5.d dVar) {
        super(2, dVar);
        this.f20605q = yVar;
        this.f20606r = j3;
        this.f20607s = c0224p;
        this.f20608t = c0265j;
        this.f20609u = c7;
        this.f20610v = c8;
        this.f20611w = c0271p;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C c7 = this.f20610v;
        C0271p c0271p = this.f20611w;
        D d4 = new D(this.f20605q, this.f20606r, this.f20607s, this.f20608t, this.f20609u, c7, c0271p, dVar);
        d4.f20604p = obj;
        return d4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w5.B] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, w5.B] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [w5.B] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        ?? r12 = this.f20603o;
        Y4.o oVar = Y4.o.f8736a;
        J j3 = this.f20606r;
        try {
            if (r12 == 0) {
                android.support.v4.media.session.b.K(obj);
                r12 = (InterfaceC1765B) this.f20604p;
                K0.y yVar = this.f20605q;
                EnumC2048l0 enumC2048l0 = j3.f20658E;
                C0224p c0224p = this.f20607s;
                C0265j c0265j = this.f20608t;
                C c7 = this.f20609u;
                C c8 = this.f20610v;
                C0271p c0271p = this.f20611w;
                this.f20604p = r12;
                this.f20603o = 1;
                float f7 = B.f20595a;
                Object objC = r1.c(yVar, new C2074z(c8, new C1219u(), enumC2048l0, c0224p, c0271p, c7, c0265j, null), this);
                if (objC != enumC0830a) {
                    objC = oVar;
                }
                if (objC == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r12 = (InterfaceC1765B) this.f20604p;
                android.support.v4.media.session.b.K(obj);
            }
        } catch (CancellationException e7) {
            y5.c cVar = j3.f20662I;
            if (cVar != null) {
                cVar.k(C2055p.f20939a);
            }
            if (!AbstractC1767D.s(r12)) {
                throw e7;
            }
        }
        return oVar;
    }
}
