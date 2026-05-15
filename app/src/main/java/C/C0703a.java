package c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0703a implements InterfaceC0704b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f10509c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10509c;
    }

    @Override // c.InterfaceC0704b
    public final void m1(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0704b.f10510b);
            parcelObtain.writeInt(i7);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f10509c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
