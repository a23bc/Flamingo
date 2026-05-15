package w3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: renamed from: w3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1739n implements InterfaceC1741o {

    /* JADX INFO: renamed from: c */
    public IBinder f19253c;

    @Override // w3.InterfaceC1741o
    public final void A(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void B0(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeInt(i9);
            parcelObtain.writeStrongBinder(iBinder);
            this.f19253c.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void C0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void D(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(z6 ? 1 : 0);
            this.f19253c.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void E0(InterfaceC1737m interfaceC1737m, int i7, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, surface);
            this.f19253c.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void F(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void G(InterfaceC1737m interfaceC1737m, int i7, int i8, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void G0(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeInt(i9);
            parcelObtain.writeInt(i10);
            this.f19253c.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void I(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void I0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void J(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.f19253c.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void K(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeInt(i9);
            this.f19253c.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void L0(InterfaceC1737m interfaceC1737m) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            this.f19253c.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void M(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void N(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void O0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void P(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.f19253c.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void Q0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            parcelObtain.writeInt(z6 ? 1 : 0);
            this.f19253c.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void T(InterfaceC1737m interfaceC1737m, int i7, int i8, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void T0(InterfaceC1737m interfaceC1737m, int i7, boolean z6, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(z6 ? 1 : 0);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void U0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void V0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void W(InterfaceC1737m interfaceC1737m, int i7, float f7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeFloat(f7);
            this.f19253c.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void X0(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void Y(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void Z(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeStrongBinder(iBinder);
            this.f19253c.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19253c;
    }

    @Override // w3.InterfaceC1741o
    public final void b0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void b1(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void c0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void c1(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void d0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            k1.c(parcelObtain, bundle3);
            this.f19253c.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void d1(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void e1(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void f1(InterfaceC1737m interfaceC1737m, int i7, IBinder iBinder, int i8, long j3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i8);
            parcelObtain.writeLong(j3);
            this.f19253c.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void g0(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(z6 ? 1 : 0);
            this.f19253c.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void g1(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            this.f19253c.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void h0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void i1(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void j1(InterfaceC1737m interfaceC1737m, int i7, boolean z6) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(z6 ? 1 : 0);
            this.f19253c.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void k0(InterfaceC1737m interfaceC1737m, int i7, long j3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeLong(j3);
            this.f19253c.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void k1(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void m0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void n0(InterfaceC1737m interfaceC1737m, int i7, int i8, long j3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeLong(j3);
            this.f19253c.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void p0(InterfaceC1737m interfaceC1737m, int i7, int i8, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeStrongBinder(iBinder);
            this.f19253c.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void q(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeInt(i9);
            this.f19253c.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void r0(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void s0(InterfaceC1737m interfaceC1737m, int i7, float f7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeFloat(f7);
            this.f19253c.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void v(InterfaceC1737m interfaceC1737m, int i7, int i8, int i9) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            parcelObtain.writeInt(i9);
            this.f19253c.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void v0(InterfaceC1737m interfaceC1737m, int i7, Bundle bundle, long j3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            k1.c(parcelObtain, bundle);
            parcelObtain.writeLong(j3);
            this.f19253c.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void y(InterfaceC1737m interfaceC1737m, int i7) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            this.f19253c.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // w3.InterfaceC1741o
    public final void z0(InterfaceC1737m interfaceC1737m, int i7, int i8) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1737m);
            parcelObtain.writeInt(i7);
            parcelObtain.writeInt(i8);
            this.f19253c.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
