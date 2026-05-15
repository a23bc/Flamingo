package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0600x extends Service implements InterfaceC0597u {

    /* JADX INFO: renamed from: o */
    public final A0.b f9761o = new A0.b(this);

    @Override // androidx.lifecycle.InterfaceC0597u
    public final K h() {
        return (C0599w) this.f9761o.f50p;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC1209k.f(intent, "intent");
        A0.b bVar = this.f9761o;
        bVar.getClass();
        bVar.h0(EnumC0592o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        A0.b bVar = this.f9761o;
        bVar.getClass();
        bVar.h0(EnumC0592o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        A0.b bVar = this.f9761o;
        bVar.getClass();
        bVar.h0(EnumC0592o.ON_STOP);
        bVar.h0(EnumC0592o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        A0.b bVar = this.f9761o;
        bVar.getClass();
        bVar.h0(EnumC0592o.ON_START);
        super.onStart(intent, i7);
    }
}
