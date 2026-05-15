package U3;

import N3.p;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7037b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f7036a = i7;
        this.f7037b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f7036a) {
            case 1:
                A0.b.J((A0.b) this.f7037b, network, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f7036a) {
            case 0:
                p pVarD = p.d();
                int i7 = f.f7038j;
                Objects.toString(networkCapabilities);
                pVarD.b(new Throwable[0]);
                f fVar = (f) this.f7037b;
                fVar.c(fVar.f());
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Object obj = this.f7037b;
        switch (this.f7036a) {
            case 0:
                p pVarD = p.d();
                int i7 = f.f7038j;
                pVarD.b(new Throwable[0]);
                f fVar = (f) obj;
                fVar.c(fVar.f());
                break;
            default:
                A0.b.J((A0.b) obj, network, false);
                break;
        }
    }
}
