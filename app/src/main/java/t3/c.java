package T3;

import N3.p;
import W3.i;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    static {
        p.i("NetworkMeteredCtrlr");
    }

    @Override // T3.b
    public final boolean a(i iVar) {
        return iVar.f7813j.f5118a == 5;
    }

    @Override // T3.b
    public final boolean b(Object obj) {
        S3.a aVar = (S3.a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (aVar.f6739a && aVar.f6741c) ? false : true;
        }
        p.d().b(new Throwable[0]);
        return !aVar.f6739a;
    }
}
