package t2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: t2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1478g extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16436d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E4.I f16437c;

    static {
        f16436d = w2.t.f18881a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public BinderC1478g(List list) {
        this.f16437c = E4.I.p(list);
    }

    public static E4.I a(IBinder iBinder) {
        int i7;
        if (iBinder instanceof BinderC1478g) {
            return ((BinderC1478g) iBinder).f16437c;
        }
        E4.F fO = E4.I.o();
        int i8 = 1;
        int i9 = 0;
        while (i8 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i9);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i7 = parcelObtain2.readInt();
                        if (i7 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            fO.a(bundle);
                            i9++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i8 = i7;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return fO.f();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        if (parcel2 == null) {
            return false;
        }
        E4.I i9 = this.f16437c;
        int size = i9.size();
        int i10 = parcel.readInt();
        while (i10 < size && parcel2.dataSize() < f16436d) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) i9.get(i10));
            i10++;
        }
        parcel2.writeInt(i10 < size ? 2 : 0);
        return true;
    }
}
