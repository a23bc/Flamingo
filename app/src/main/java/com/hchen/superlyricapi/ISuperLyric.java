package com.hchen.superlyricapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface ISuperLyric extends IInterface {
    public static final String DESCRIPTOR = "com.hchen.superlyricapi.ISuperLyric";

    public static class Default implements ISuperLyric {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.hchen.superlyricapi.ISuperLyric
        public void onStop(SuperLyricData superLyricData) {
        }

        @Override // com.hchen.superlyricapi.ISuperLyric
        public void onSuperLyric(SuperLyricData superLyricData) {
        }
    }

    public static abstract class Stub extends Binder implements ISuperLyric {
        static final int TRANSACTION_onStop = 1;
        static final int TRANSACTION_onSuperLyric = 2;

        public static class Proxy implements ISuperLyric {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ISuperLyric.DESCRIPTOR;
            }

            @Override // com.hchen.superlyricapi.ISuperLyric
            public void onStop(SuperLyricData superLyricData) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISuperLyric.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, superLyricData, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hchen.superlyricapi.ISuperLyric
            public void onSuperLyric(SuperLyricData superLyricData) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ISuperLyric.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, superLyricData, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ISuperLyric.DESCRIPTOR);
        }

        public static ISuperLyric asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ISuperLyric.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISuperLyric)) ? new Proxy(iBinder) : (ISuperLyric) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(ISuperLyric.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(ISuperLyric.DESCRIPTOR);
                return true;
            }
            if (i7 == 1) {
                onStop((SuperLyricData) _Parcel.readTypedObject(parcel, SuperLyricData.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i7 != 2) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                onSuperLyric((SuperLyricData) _Parcel.readTypedObject(parcel, SuperLyricData.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class _Parcel {
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t7, int i7) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i7);
            }
        }
    }

    void onStop(SuperLyricData superLyricData);

    void onSuperLyric(SuperLyricData superLyricData);
}
