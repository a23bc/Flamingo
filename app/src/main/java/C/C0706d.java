package c;

import K1.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0706d implements Parcelable {
    public static final Parcelable.Creator<C0706d> CREATOR = new h(28);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0704b f10513o;

    public final void c(int i7, Bundle bundle) {
        InterfaceC0704b interfaceC0704b = this.f10513o;
        if (interfaceC0704b != null) {
            try {
                interfaceC0704b.m1(i7, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f10513o == null) {
                    this.f10513o = new BinderC0705c(this);
                }
                parcel.writeStrongBinder(this.f10513o.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
