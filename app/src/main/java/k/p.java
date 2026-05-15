package k;

import G1.N;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C1111A f13936p;

    public /* synthetic */ p(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A, int i7) {
        this.f13935o = i7;
        this.f13936p = layoutInflaterFactory2C1111A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f13935o) {
            case 0:
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A = this.f13936p;
                if ((layoutInflaterFactory2C1111A.f13816o0 & 1) != 0) {
                    layoutInflaterFactory2C1111A.s(0);
                }
                if ((layoutInflaterFactory2C1111A.f13816o0 & 4096) != 0) {
                    layoutInflaterFactory2C1111A.s(108);
                }
                layoutInflaterFactory2C1111A.f13815n0 = false;
                layoutInflaterFactory2C1111A.f13816o0 = 0;
                break;
            default:
                LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A2 = this.f13936p;
                layoutInflaterFactory2C1111A2.f13789K.showAtLocation(layoutInflaterFactory2C1111A2.f13788J, 55, 0, 0);
                N n7 = layoutInflaterFactory2C1111A2.f13791M;
                if (n7 != null) {
                    n7.b();
                }
                if (!(layoutInflaterFactory2C1111A2.f13793O && (viewGroup = layoutInflaterFactory2C1111A2.f13794P) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C1111A2.f13788J.setAlpha(1.0f);
                    layoutInflaterFactory2C1111A2.f13788J.setVisibility(0);
                } else {
                    layoutInflaterFactory2C1111A2.f13788J.setAlpha(0.0f);
                    N nA = G1.I.a(layoutInflaterFactory2C1111A2.f13788J);
                    nA.a(1.0f);
                    layoutInflaterFactory2C1111A2.f13791M = nA;
                    nA.d(new r(0, this));
                }
                break;
        }
    }
}
