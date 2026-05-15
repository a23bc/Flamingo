package x3;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: renamed from: x3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1922g implements InterfaceC1923h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBinder f20040c;

    @Override // x3.InterfaceC1923h
    public final void C(String str, Bundle bundle, X x6) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void D0(InterfaceC1921f interfaceC1921f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((BinderC1900B) interfaceC1921f);
            if (!this.f20040c.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void F0(String str, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void H(Uri uri, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void H0(long j3) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void J0(String str, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void K0(int i7, int i8) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final h0 M0() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void N0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(22, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final int R() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void R0(Uri uri, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void S(C1910L c1910l, int i7) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final int V() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(32, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void W0(int i7) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void X(String str, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final boolean a0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20040c;
    }

    @Override // x3.InterfaceC1923h
    public final void b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(33, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final m0 d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? m0.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void e() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(13, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void f(int i7) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(18, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final int i() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void i0(C1910L c1910l) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final long j() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final List j0() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void k(long j3) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void l(float f7) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void l0(int i7, int i8) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final Bundle m() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final String n() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(6, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final boolean n1(KeyEvent keyEvent) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void next() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(20, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void previous() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(21, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void q0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(23, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void stop() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f20040c.transact(19, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final void t(InterfaceC1921f interfaceC1921f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((BinderC1900B) interfaceC1921f);
            if (!this.f20040c.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = BinderC1915Q.f20003d;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // x3.InterfaceC1923h
    public final CharSequence t0() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void u(String str, Bundle bundle) {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final C1911M x0() {
        throw null;
    }

    @Override // x3.InterfaceC1923h
    public final void y0(String str, Bundle bundle) {
        throw null;
    }
}
