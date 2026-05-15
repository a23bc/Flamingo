package T3;

import N3.p;
import W3.i;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    static {
        p.i("NetworkNotRoamingCtrlr");
    }

    @Override // T3.b
    public final boolean a(i iVar) {
        return iVar.f7813j.f5118a == 4;
    }

    @Override // T3.b
    public final boolean b(Object obj) {
        S3.a aVar = (S3.a) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return (aVar.f6739a && aVar.f6742d) ? false : true;
        }
        p.d().b(new Throwable[0]);
        return !aVar.f6739a;
    }
}
