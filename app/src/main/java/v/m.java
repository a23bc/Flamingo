package V;

import M.Z;
import X.K0;
import android.os.CancellationSignal;
import b1.L;
import w5.w0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7339b;

    public /* synthetic */ m(int i7, Object obj) {
        this.f7338a = i7;
        this.f7339b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f7338a) {
            case 0:
                K0 k02 = (K0) this.f7339b;
                if (k02 != null) {
                    Z z6 = k02.f7942d;
                    if (z6 != null) {
                        z6.e(L.f9943b);
                    }
                    Z z7 = k02.f7942d;
                    if (z7 != null) {
                        z7.f(L.f9943b);
                    }
                }
                break;
            default:
                ((w0) this.f7339b).c(null);
                break;
        }
    }
}
