package M;

import l5.InterfaceC1180a;

/* JADX INFO: renamed from: M.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0251b0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4529o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j0 f4530p;

    public /* synthetic */ C0251b0(j0 j0Var, int i7) {
        this.f4529o = i7;
        this.f4530p = j0Var;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f4529o) {
            case 0:
                this.f4530p.a();
                break;
            default:
                this.f4530p.onCancel();
                break;
        }
        return Y4.o.f8736a;
    }
}
