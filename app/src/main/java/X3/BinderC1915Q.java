package x3;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: x3.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1915Q extends Binder implements InterfaceC1923h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20003d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f20004c;

    public BinderC1915Q(S s7) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f20004c = new AtomicReference(s7);
    }

    @Override // x3.InterfaceC1923h
    public final Bundle A0() {
        Bundle bundle;
        S s7 = (S) this.f20004c.get();
        if (s7 == null || (bundle = s7.f20009e) == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // x3.InterfaceC1923h
    public final String B() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void C(String str, Bundle bundle, X x6) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void D0(InterfaceC1921f interfaceC1921f) {
        S s7 = (S) this.f20004c.get();
        if (s7 == null || interfaceC1921f == null) {
            return;
        }
        s7.f20010f.register(interfaceC1921f, new f0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (s7.f20008d) {
        }
    }

    @Override // x3.InterfaceC1923h
    public final void E(boolean z6) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void F0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void H(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void H0(long j3) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void J0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void K0(int i7, int i8) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void L(C1910L c1910l) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final h0 M0() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void N0() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final boolean O() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final PendingIntent Q() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final int R() {
        S s7 = (S) this.f20004c.get();
        if (s7 != null) {
            return s7.f20014k;
        }
        return -1;
    }

    @Override // x3.InterfaceC1923h
    public final void R0(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void S(C1910L c1910l, int i7) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void U(int i7) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final int V() {
        return 0;
    }

    @Override // x3.InterfaceC1923h
    public final void W0(int i7) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void X(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final boolean a0() {
        return false;
    }

    @Override // x3.InterfaceC1923h
    public final void a1(n0 n0Var, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void b() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final m0 d() {
        S s7 = (S) this.f20004c.get();
        if (s7 == null) {
            return null;
        }
        m0 m0Var = s7.f20011g;
        C1911M c1911m = s7.f20012i;
        if (m0Var == null) {
            return m0Var;
        }
        long j3 = m0Var.f20069p;
        long jA = -1;
        if (j3 == -1) {
            return m0Var;
        }
        int i7 = m0Var.f20068o;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return m0Var;
        }
        if (m0Var.f20075v <= 0) {
            return m0Var;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = ((long) (m0Var.f20071r * (jElapsedRealtime - r7))) + j3;
        if (c1911m != null && c1911m.f19995o.containsKey("android.media.metadata.DURATION")) {
            jA = c1911m.a("android.media.metadata.DURATION");
        }
        long j8 = (jA < 0 || j7 <= jA) ? j7 < 0 ? 0L : j7 : jA;
        ArrayList arrayList = new ArrayList();
        AbstractCollection abstractCollection = m0Var.f20076w;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new m0(m0Var.f20068o, j8, m0Var.f20070q, m0Var.f20071r, m0Var.f20072s, m0Var.f20073t, m0Var.f20074u, jElapsedRealtime, arrayList, m0Var.f20077x, m0Var.f20078y);
    }

    @Override // x3.InterfaceC1923h
    public final void e() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void f(int i7) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void g() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final int i() {
        S s7 = (S) this.f20004c.get();
        if (s7 != null) {
            return s7.f20013j;
        }
        return -1;
    }

    @Override // x3.InterfaceC1923h
    public final void i0(C1910L c1910l) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final long j() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final List j0() {
        return null;
    }

    @Override // x3.InterfaceC1923h
    public final void k(long j3) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void l(float f7) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void l0(int i7, int i8) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final Bundle m() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final String n() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final boolean n1(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC1921f interfaceC1921f = null;
        InterfaceC1921f interfaceC1921f2 = null;
        switch (i7) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                C(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? X.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zN1 = n1(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zN1 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1921f)) {
                        C1920e c1920e = new C1920e();
                        c1920e.f20035c = strongBinder;
                        interfaceC1921f2 = c1920e;
                    } else {
                        interfaceC1921f2 = (InterfaceC1921f) iInterfaceQueryLocalInterface;
                    }
                }
                D0(interfaceC1921f2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1921f)) {
                        C1920e c1920e2 = new C1920e();
                        c1920e2.f20035c = strongBinder2;
                        interfaceC1921f = c1920e2;
                    } else {
                        interfaceC1921f = (InterfaceC1921f) iInterfaceQueryLocalInterface2;
                    }
                }
                t(interfaceC1921f);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zO = O();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String strN = n();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                String strB = B();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PendingIntent pendingIntentQ = Q();
                parcel2.getClass();
                parcel2.writeNoException();
                if (pendingIntentQ == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                pendingIntentQ.writeToParcel(parcel2, 1);
                return true;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                long j3 = j();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeLong(j3);
                return true;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                h0 h0VarM0 = M0();
                parcel2.getClass();
                parcel2.writeNoException();
                if (h0VarM0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                h0VarM0.writeToParcel(parcel2, 1);
                return true;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                parcel.readString();
                l0(i9, i10);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                parcel.readString();
                K0(i11, i12);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                e();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                F0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                J0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                R0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                H0(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                g();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                stop();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case BuildConfig.API_VERSION /* 20 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                next();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                previous();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                N0();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                q0();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                k(parcel.readLong());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                w0(parcel.readInt() != 0 ? n0.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                u(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                C1911M c1911mX0 = x0();
                parcel2.getClass();
                parcel2.writeNoException();
                if (c1911mX0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                parcel2.writeBundle(c1911mX0.f19995o);
                return true;
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                m0 m0VarD = d();
                parcel2.getClass();
                parcel2.writeNoException();
                if (m0VarD == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                m0VarD.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                List listJ0 = j0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ0);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                CharSequence charSequenceT0 = t0();
                parcel2.getClass();
                parcel2.writeNoException();
                if (charSequenceT0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceT0, parcel2, 1);
                return true;
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle bundleM = m();
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundleM == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleM.writeToParcel(parcel2, 1);
                return true;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iV = V();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iV);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                b();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                y0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                X(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                H(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i13 = i();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(i13);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                f(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                L(parcel.readInt() != 0 ? C1910L.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                S(parcel.readInt() != 0 ? C1910L.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                i0(parcel.readInt() != 0 ? C1910L.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                U(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 45:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zA0 = a0();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(zA0 ? 1 : 0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                E(parcel.readInt() != 0);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int iR = R();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(iR);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                W0(parcel.readInt());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                l(parcel.readFloat());
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                Bundle bundleA0 = A0();
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundleA0 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleA0.writeToParcel(parcel2, 1);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                a1(parcel.readInt() != 0 ? n0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // x3.InterfaceC1923h
    public final void previous() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void q0() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void stop() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void t(InterfaceC1921f interfaceC1921f) {
        S s7 = (S) this.f20004c.get();
        if (s7 == null || interfaceC1921f == null) {
            return;
        }
        s7.f20010f.unregister(interfaceC1921f);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (s7.f20008d) {
        }
    }

    @Override // x3.InterfaceC1923h
    public final CharSequence t0() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void u(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void w0(n0 n0Var) {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final C1911M x0() {
        throw new AssertionError();
    }

    @Override // x3.InterfaceC1923h
    public final void y0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
