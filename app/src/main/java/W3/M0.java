package w3;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends Binder implements InterfaceC1745q {

    /* JADX INFO: renamed from: c */
    public final WeakReference f19016c;

    /* JADX INFO: renamed from: d */
    public final Handler f19017d;

    /* JADX INFO: renamed from: e */
    public final x3.g0 f19018e;

    /* JADX INFO: renamed from: f */
    public final Set f19019f;

    public M0(N0 n02) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.f19016c = new WeakReference(n02);
        Context applicationContext = n02.getApplicationContext();
        this.f19017d = new Handler(applicationContext.getMainLooper());
        this.f19018e = x3.g0.a(applicationContext);
        this.f19019f = Collections.synchronizedSet(new HashSet());
    }

    public static InterfaceC1745q o1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1745q)) {
            return (InterfaceC1745q) iInterfaceQueryLocalInterface;
        }
        C1743p c1743p = new C1743p();
        c1743p.f19318c = iBinder;
        return c1743p;
    }

    @Override // w3.InterfaceC1745q
    public final void o(InterfaceC1737m interfaceC1737m, Bundle bundle) {
        if (interfaceC1737m == null || bundle == null) {
            return;
        }
        try {
            C1725g c1725gA = C1725g.a(bundle);
            if (this.f19016c.get() == null) {
                try {
                    interfaceC1737m.a();
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c1725gA.f19192d;
            }
            x3.f0 f0Var = new x3.f0(c1725gA.f19191c, callingPid, callingUid);
            boolean zB = this.f19018e.b(f0Var);
            this.f19019f.add(interfaceC1737m);
            try {
                this.f19017d.post(new RunnableC1732j0(this, interfaceC1737m, f0Var, c1725gA, zB, 1));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for ConnectionRequest", e7);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i7 != 3001) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        o(BinderC1724f0.o1(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
