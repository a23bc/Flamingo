package x3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import d2.C0821i;
import java.lang.ref.WeakReference;
import java.util.List;
import w3.C1710a0;

/* JADX INFO: renamed from: x3.B */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1900B extends Binder implements InterfaceC1921f {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f19971d = 0;

    /* JADX INFO: renamed from: c */
    public final WeakReference f19972c;

    public BinderC1900B(C1710a0 c1710a0) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f19972c = new WeakReference(c1710a0);
    }

    @Override // x3.InterfaceC1921f
    public final void P0(h0 h0Var) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1921f
    public final void c(int i7) {
        C1710a0 c1710a0 = (C1710a0) this.f19972c.get();
        if (c1710a0 != null) {
            c1710a0.i(9, Integer.valueOf(i7), null);
        }
    }

    @Override // x3.InterfaceC1921f
    public final void e0(int i7) {
        C1710a0 c1710a0 = (C1710a0) this.f19972c.get();
        if (c1710a0 != null) {
            c1710a0.i(12, Integer.valueOf(i7), null);
        }
    }

    @Override // x3.InterfaceC1921f
    public final void f0(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1921f
    public final void o0(List list) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f19972c;
        switch (i7) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String string = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                C1710a0 c1710a0 = (C1710a0) weakReference.get();
                if (c1710a0 != null) {
                    c1710a0.i(1, string, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                z();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                r(parcel.readInt() != 0 ? m0.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                x(parcel.readInt() != 0 ? C1911M.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                o0(parcel.createTypedArrayList(W.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                s(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                f0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                P0(parcel.readInt() != 0 ? h0.CREATOR.createFromParcel(parcel) : null);
                return true;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                c(parcel.readInt());
                return true;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z6 = parcel.readInt() != 0;
                C1710a0 c1710a02 = (C1710a0) weakReference.get();
                if (c1710a02 != null) {
                    c1710a02.i(11, Boolean.valueOf(z6), null);
                    return true;
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                e0(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                C1710a0 c1710a03 = (C1710a0) weakReference.get();
                if (c1710a03 != null) {
                    c1710a03.i(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // x3.InterfaceC1921f
    public final void r(m0 m0Var) {
        C1710a0 c1710a0 = (C1710a0) this.f19972c.get();
        if (c1710a0 != null) {
            c1710a0.i(2, m0Var, null);
        }
    }

    @Override // x3.InterfaceC1921f
    public final void s(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1921f
    public final void x(C1911M c1911m) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1921f
    public final void z() {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
