package B3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder implements IInterface {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MultiInstanceInvalidationService f837c;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f837c = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final void o1(int i7, String[] strArr) {
        synchronized (this.f837c.f9831q) {
            try {
                String str = (String) this.f837c.f9830p.get(Integer.valueOf(i7));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = this.f837c.f9831q.beginBroadcast();
                for (int i8 = 0; i8 < iBeginBroadcast; i8++) {
                    try {
                        Integer num = (Integer) this.f837c.f9831q.getBroadcastCookie(i8);
                        int iIntValue = num.intValue();
                        String str2 = (String) this.f837c.f9830p.get(num);
                        if (i7 != iIntValue && str.equals(str2)) {
                            try {
                                ((b) this.f837c.f9831q.getBroadcastItem(i8)).o1(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        this.f837c.f9831q.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        b bVar = null;
        if (i7 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                    bVar = new b();
                    bVar.f819c = strongBinder;
                } else {
                    bVar = (b) iInterfaceQueryLocalInterface;
                }
            }
            int iP1 = p1(bVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iP1);
            return true;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                o1(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof b)) {
                bVar = new b();
                bVar.f819c = strongBinder2;
            } else {
                bVar = (b) iInterfaceQueryLocalInterface2;
            }
        }
        int i9 = parcel.readInt();
        synchronized (this.f837c.f9831q) {
            this.f837c.f9831q.unregister(bVar);
            this.f837c.f9830p.remove(Integer.valueOf(i9));
        }
        parcel2.writeNoException();
        return true;
    }

    public final int p1(b bVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f837c.f9831q) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f837c;
                int i7 = multiInstanceInvalidationService.f9829o + 1;
                multiInstanceInvalidationService.f9829o = i7;
                if (multiInstanceInvalidationService.f9831q.register(bVar, Integer.valueOf(i7))) {
                    this.f837c.f9830p.put(Integer.valueOf(i7), str);
                    return i7;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f837c;
                multiInstanceInvalidationService2.f9829o--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
