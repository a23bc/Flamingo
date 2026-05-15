package w3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class T implements ServiceConnection {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f19053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f19054p;

    public T(U u7, Bundle bundle) {
        this.f19054p = u7;
        this.f19053o = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C1760y c1760y = this.f19054p.f19059a;
        Objects.requireNonNull(c1760y);
        c1760y.Q0(new B2.e(23, c1760y));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        B2.e eVar;
        U u7 = this.f19054p;
        try {
            try {
                boolean zEquals = u7.f19063e.f18932a.n().equals(componentName.getPackageName());
                C1760y c1760y = u7.f19059a;
                if (zEquals) {
                    InterfaceC1745q interfaceC1745qO1 = M0.o1(iBinder);
                    if (interfaceC1745qO1 != null) {
                        interfaceC1745qO1.o(u7.f19061c, new C1725g(u7.f19062d.getPackageName(), Process.myPid(), this.f19053o).b());
                        return;
                    } else {
                        AbstractC1697a.m("Service interface is missing.");
                        Objects.requireNonNull(c1760y);
                        eVar = new B2.e(23, c1760y);
                    }
                } else {
                    AbstractC1697a.m("Expected connection to " + u7.f19063e.f18932a.n() + " but is connected to " + componentName);
                    Objects.requireNonNull(c1760y);
                    eVar = new B2.e(23, c1760y);
                }
                c1760y.Q0(eVar);
            } catch (RemoteException unused) {
                AbstractC1697a.w("Service " + componentName + " has died prematurely");
                C1760y c1760y2 = u7.f19059a;
                Objects.requireNonNull(c1760y2);
                c1760y2.Q0(new B2.e(23, c1760y2));
            }
        } catch (Throwable th) {
            C1760y c1760y3 = u7.f19059a;
            Objects.requireNonNull(c1760y3);
            c1760y3.Q0(new B2.e(23, c1760y3));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1760y c1760y = this.f19054p.f19059a;
        Objects.requireNonNull(c1760y);
        c1760y.Q0(new B2.e(23, c1760y));
    }
}
