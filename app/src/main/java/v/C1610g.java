package v;

import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1110d;
import k.AbstractC1113a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1610g extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18086p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w.j0 f18087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f18088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0.d f18089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f18090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y4.c f18091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f18092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1610g(w.j0 j0Var, InterfaceC1182c interfaceC1182c, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, n0.d dVar, int i7) {
        super(2);
        this.f18087q = j0Var;
        this.f18091u = (AbstractC1210l) interfaceC1182c;
        this.f18088r = interfaceC1398p;
        this.f18092v = c1598p;
        this.f18093w = c1599q;
        this.f18089s = dVar;
        this.f18090t = i7;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l5.c, m5.l] */
    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18086p) {
            case 0:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f18090t | 1);
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f18092v;
                n0.d dVar = this.f18089s;
                w.j0 j0Var = this.f18087q;
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) this.f18091u;
                InterfaceC1386d interfaceC1386d = (InterfaceC1386d) this.f18093w;
                AbstractC1110d.b(j0Var, this.f18088r, interfaceC1182c2, interfaceC1386d, interfaceC1182c, dVar, (C0912t) obj, iB);
                break;
            default:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(this.f18090t | 1);
                n0.d dVar2 = this.f18089s;
                AbstractC1113a.e(this.f18087q, (AbstractC1210l) this.f18091u, this.f18088r, (C1598P) this.f18092v, (C1599Q) this.f18093w, dVar2, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1610g(w.j0 j0Var, InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c, InterfaceC1386d interfaceC1386d, InterfaceC1182c interfaceC1182c2, n0.d dVar, int i7) {
        super(2);
        this.f18087q = j0Var;
        this.f18088r = interfaceC1398p;
        this.f18091u = interfaceC1182c;
        this.f18093w = interfaceC1386d;
        this.f18092v = interfaceC1182c2;
        this.f18089s = dVar;
        this.f18090t = i7;
    }
}
