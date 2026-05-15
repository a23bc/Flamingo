package B3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f819c;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f819c;
    }

    public final void o1(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcelObtain.writeStringArray(strArr);
            this.f819c.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
