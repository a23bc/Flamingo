package H;

import l5.InterfaceC1180a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f0 f2860p;

    public /* synthetic */ d0(f0 f0Var, int i7) {
        this.f2859o = i7;
        this.f2860p = f0Var;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f2859o) {
            case 0:
                return Float.valueOf(this.f2860p.f2867D.b());
            case 1:
                return Float.valueOf(this.f2860p.f2867D.f());
            default:
                f0 f0Var = this.f2860p;
                return Float.valueOf(f0Var.f2867D.a() - f0Var.f2867D.e());
        }
    }
}
