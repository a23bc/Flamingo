package D;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: D.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0069j implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O0.m0 f1337p;

    public /* synthetic */ C0069j(O0.m0 m0Var, int i7) {
        this.f1336o = i7;
        this.f1337p = m0Var;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        O0.l0 l0Var = (O0.l0) obj;
        switch (this.f1336o) {
            case 0:
                O0.l0.j(l0Var, this.f1337p, 0, 0);
                break;
            case 1:
                O0.l0.j(l0Var, this.f1337p, 0, 0);
                break;
            case 2:
                O0.l0.l(l0Var, this.f1337p, 0L);
                break;
            case 3:
                O0.l0.j(l0Var, this.f1337p, 0, 0);
                break;
            case 4:
                O0.l0.h(l0Var, this.f1337p, 0, 0);
                break;
            case 5:
                O0.l0.j(l0Var, this.f1337p, 0, 0);
                break;
            case 6:
                O0.m0 m0Var = this.f1337p;
                AbstractC1209k.f(l0Var, "$this$layout");
                O0.l0.j(l0Var, m0Var, 0, 0);
                break;
            case 7:
                O0.l0.h(l0Var, this.f1337p, 0, 0);
                break;
            default:
                O0.l0.h(l0Var, this.f1337p, 0, 0);
                break;
        }
        return Y4.o.f8736a;
    }
}
