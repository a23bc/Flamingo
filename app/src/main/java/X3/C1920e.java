package x3;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: x3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1920e implements InterfaceC1921f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f20035c;

    @Override // x3.InterfaceC1921f
    public final void P0(h0 h0Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            h0Var.writeToParcel(parcelObtain, 0);
            if (!this.f20035c.transact(8, parcelObtain, null, 1)) {
                int i7 = BinderC1900B.f19971d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20035c;
    }

    @Override // x3.InterfaceC1921f
    public final void c(int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i7);
            if (!this.f20035c.transact(9, parcelObtain, null, 1)) {
                int i8 = BinderC1900B.f19971d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1921f
    public final void e0(int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i7);
            if (!this.f20035c.transact(12, parcelObtain, null, 1)) {
                int i8 = BinderC1900B.f19971d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1921f
    public final void o0(List list) {
        throw null;
    }

    @Override // x3.InterfaceC1921f
    public final void r(m0 m0Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (m0Var != null) {
                parcelObtain.writeInt(1);
                m0Var.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f20035c.transact(3, parcelObtain, null, 1)) {
                int i7 = BinderC1900B.f19971d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // x3.InterfaceC1921f
    public final void s(CharSequence charSequence) {
        throw null;
    }

    @Override // x3.InterfaceC1921f
    public final void x(C1911M c1911m) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c1911m != null) {
                parcelObtain.writeInt(1);
                parcelObtain.writeBundle(c1911m.f19995o);
            } else {
                parcelObtain.writeInt(0);
            }
            if (!this.f20035c.transact(4, parcelObtain, null, 1)) {
                int i7 = BinderC1900B.f19971d;
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // x3.InterfaceC1921f
    public final void z() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (!this.f20035c.transact(2, parcelObtain, null, 1)) {
                int i7 = BinderC1900B.f19971d;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
