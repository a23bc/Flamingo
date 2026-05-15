package j6;

import F.A;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ A f13736p;

    public /* synthetic */ a(A a4, int i7) {
        this.f13735o = i7;
        this.f13736p = a4;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f13735o) {
            case 0:
                A a4 = this.f13736p;
                AbstractC1209k.f(a4, "$state");
                return a4;
            default:
                A a7 = this.f13736p;
                AbstractC1209k.f(a7, "$state");
                return a7;
        }
    }
}
