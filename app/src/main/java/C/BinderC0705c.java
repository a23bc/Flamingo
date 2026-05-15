package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: c.c */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0705c extends Binder implements InterfaceC0704b {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f10511d = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0706d f10512c;

    public BinderC0705c(C0706d c0706d) {
        this.f10512c = c0706d;
        attachInterface(this, InterfaceC0704b.f10510b);
    }

    @Override // c.InterfaceC0704b
    public final void m1(int i7, Bundle bundle) {
        this.f10512c.a(i7, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC0704b.f10510b;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        m1(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
