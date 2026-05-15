package w3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: w3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1735l implements InterfaceC1737m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f19241c;

    @Override // w3.InterfaceC1737m
    public final void S0(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            this.f19241c.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void Y0(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            this.f19241c.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void Z0(int i7, Bundle bundle, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            parcelObtain.writeInt(z6 ? 1 : 0);
            this.f19241c.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void a() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(0);
            this.f19241c.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19241c;
    }

    @Override // w3.InterfaceC1737m
    public final void h(int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            this.f19241c.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void h1(int i7, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            k1.j(parcelObtain, bundle2);
            this.f19241c.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void l1(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            this.f19241c.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void p(int i7, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int i8 = ((E4.b0) list).f1915r;
                parcelObtain.writeInt(i8);
                for (int i9 = 0; i9 < i8; i9++) {
                    k1.j(parcelObtain, (Parcelable) ((E4.b0) list).get(i9));
                }
            }
            this.f19241c.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void u0(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            this.f19241c.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void w(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i7);
            k1.j(parcelObtain, bundle);
            this.f19241c.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
