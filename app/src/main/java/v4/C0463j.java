package V4;

import O0.l0;
import O0.m0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: V4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0463j extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m0 f7515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f7518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7520v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0463j(m0 m0Var, int i7, int i8, m0 m0Var2, int i9, int i10, int i11) {
        super(1);
        this.f7514p = i11;
        this.f7515q = m0Var;
        this.f7516r = i7;
        this.f7517s = i8;
        this.f7518t = m0Var2;
        this.f7519u = i9;
        this.f7520v = i10;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f7514p) {
            case 0:
                l0 l0Var = (l0) obj;
                AbstractC1209k.f(l0Var, "$this$layout");
                l0.j(l0Var, this.f7515q, this.f7516r, this.f7517s);
                l0.j(l0Var, this.f7518t, this.f7519u, this.f7520v);
                break;
            default:
                l0 l0Var2 = (l0) obj;
                l0.j(l0Var2, this.f7515q, this.f7516r, this.f7517s);
                l0.j(l0Var2, this.f7518t, this.f7519u, this.f7520v);
                break;
        }
        return Y4.o.f8736a;
    }
}
