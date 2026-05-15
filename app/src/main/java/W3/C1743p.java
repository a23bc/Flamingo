package w3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: w3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1743p implements InterfaceC1745q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f19318c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19318c;
    }

    @Override // w3.InterfaceC1745q
    public final void o(InterfaceC1737m interfaceC1737m, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f19318c.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
