package U3;

import C2.C0039k;
import N3.p;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0039k f7029g;

    static {
        p.i("BrdcstRcvrCnstrntTrckr");
    }

    public c(Context context, A0.b bVar) {
        super(context, bVar);
        this.f7029g = new C0039k(1, this);
    }

    @Override // U3.d
    public final void d() {
        p pVarD = p.d();
        getClass().getSimpleName().concat(": registering receiver");
        pVarD.b(new Throwable[0]);
        this.f7032b.registerReceiver(this.f7029g, f());
    }

    @Override // U3.d
    public final void e() {
        p pVarD = p.d();
        getClass().getSimpleName().concat(": unregistering receiver");
        pVarD.b(new Throwable[0]);
        this.f7032b.unregisterReceiver(this.f7029g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
