package w3;

import A2.RunnableC0003d;
import A2.RunnableC0022x;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1724f0 extends Binder implements InterfaceC1737m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f19184c;

    public BinderC1724f0(U u7) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.f19184c = new WeakReference(u7);
    }

    public static InterfaceC1737m o1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1737m)) {
            return (InterfaceC1737m) iInterfaceQueryLocalInterface;
        }
        C1735l c1735l = new C1735l();
        c1735l.f19241c = iBinder;
        return c1735l;
    }

    @Override // w3.InterfaceC1737m
    public final void S0(int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            p1(new C1719d0(t2.T.b(bundle)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for Commands", e7);
        }
    }

    @Override // w3.InterfaceC1737m
    public final void Y0(int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            p1(new A2.I(22, y1.b(bundle)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for SessionPositionInfo", e7);
        }
    }

    @Override // w3.InterfaceC1737m
    public final void Z0(int i7, Bundle bundle, boolean z6) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(l1.f19248d, z6);
        bundle2.putBoolean(l1.f19249e, true);
        h1(i7, bundle, bundle2);
    }

    @Override // w3.InterfaceC1737m
    public final void a() {
        p1(new t2.c0(11));
    }

    @Override // w3.InterfaceC1737m
    public final void h(int i7) {
        p1(new t2.c0(10));
    }

    @Override // w3.InterfaceC1737m
    public final void h1(int i7, Bundle bundle, Bundle bundle2) {
        B1 b12;
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            U u7 = (U) this.f19184c.get();
            int iS = (u7 == null || (b12 = u7.f19068k) == null) ? -1 : b12.f18932a.s();
            if (iS == -1) {
                return;
            }
            try {
                p1(new B2.b(n1.r(iS, bundle), 13, new l1(bundle2.getBoolean(l1.f19248d, false), bundle2.getBoolean(l1.f19249e, false))));
            } catch (RuntimeException e7) {
                AbstractC1697a.x("Ignoring malformed Bundle for BundlingExclusions", e7);
            }
        } catch (RuntimeException e8) {
            AbstractC1697a.x("Ignoring malformed Bundle for PlayerInfo", e8);
        }
    }

    @Override // w3.InterfaceC1737m
    public final void l1(int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            q1(i7, z1.a(bundle));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for SessionResult", e7);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        int i9;
        String str;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i7 == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i9 = parcel.readInt();
            Bundle bundle = (Bundle) k1.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                AbstractC1697a.w("onChildrenChanged(): Ignoring empty parentId");
            } else if (i9 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                n1.c.x(i9, str);
            } else if (bundle == null) {
                p1(new t2.c0(12));
            } else {
                try {
                    C1726g0.a(bundle);
                    p1(new t2.c0(12));
                } catch (RuntimeException e7) {
                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e7);
                }
            }
        } else if (i7 != 4002) {
            switch (i7) {
                case 3001:
                    u0(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR));
                    return true;
                case 3002:
                    l1(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR));
                    return true;
                case 3003:
                    w(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR));
                    return true;
                case 3004:
                    p(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                    return true;
                case 3005:
                    int i10 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) k1.a(parcel, creator);
                    Bundle bundle3 = (Bundle) k1.a(parcel, creator);
                    if (bundle2 == null || bundle3 == null) {
                        AbstractC1697a.w("Ignoring custom command with null args.");
                    } else {
                        try {
                            p1(new A2.F(i10, v1.a(bundle2), bundle3, 3));
                        } catch (RuntimeException e8) {
                            AbstractC1697a.x("Ignoring malformed Bundle for SessionCommand", e8);
                        }
                    }
                    break;
                case 3006:
                    parcel.readInt();
                    a();
                    return true;
                case 3007:
                    Z0(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3008:
                    Y0(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR));
                    return true;
                case 3009:
                    S0(parcel.readInt(), (Bundle) k1.a(parcel, Bundle.CREATOR));
                    return true;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle4 = (Bundle) k1.a(parcel, creator2);
                    Bundle bundle5 = (Bundle) k1.a(parcel, creator2);
                    if (bundle4 != null && bundle5 != null) {
                        try {
                            try {
                                p1(new B2.b(w1.a(bundle4), 14, t2.T.b(bundle5)));
                            } catch (RuntimeException e9) {
                                AbstractC1697a.x("Ignoring malformed Bundle for Commands", e9);
                            }
                        } catch (RuntimeException e10) {
                            AbstractC1697a.x("Ignoring malformed Bundle for SessionCommands", e10);
                        }
                    }
                    break;
                case 3011:
                    h(parcel.readInt());
                    return true;
                case 3012:
                    parcel.readInt();
                    Bundle bundle6 = (Bundle) k1.a(parcel, Bundle.CREATOR);
                    if (bundle6 == null) {
                        AbstractC1697a.w("Ignoring null Bundle for extras");
                        return true;
                    }
                    p1(new t2.c0(14, bundle6));
                    return true;
                case 3013:
                    int i11 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    h1(i11, (Bundle) k1.a(parcel, creator3), (Bundle) k1.a(parcel, creator3));
                    return true;
                case 3014:
                    int i12 = parcel.readInt();
                    PendingIntent pendingIntent = (PendingIntent) k1.a(parcel, PendingIntent.CREATOR);
                    if (pendingIntent == null) {
                        AbstractC1697a.w("Ignoring null session activity intent");
                        return true;
                    }
                    p1(new t2.c0(i12, 13, pendingIntent));
                    return true;
                case 3015:
                    try {
                        p1(new t2.c0(parcel.readInt(), 9, x1.a((Bundle) k1.a(parcel, Bundle.CREATOR))));
                    } catch (RuntimeException e11) {
                        AbstractC1697a.x("Ignoring malformed Bundle for SessionError", e11);
                    }
                    break;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i9 = parcel.readInt();
            Bundle bundle7 = (Bundle) k1.a(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                AbstractC1697a.w("onSearchResultChanged(): Ignoring empty query");
            } else if (i9 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                n1.c.x(i9, str);
            } else if (bundle7 == null) {
                p1(new t2.c0(12));
            } else {
                try {
                    C1726g0.a(bundle7);
                    p1(new t2.c0(12));
                } catch (RuntimeException e12) {
                    AbstractC1697a.x("Ignoring malformed Bundle for LibraryParams", e12);
                }
            }
        }
        return true;
    }

    @Override // w3.InterfaceC1737m
    public final void p(int i7, List list) {
        B1 b12;
        if (list == null) {
            return;
        }
        try {
            U u7 = (U) this.f19184c.get();
            int iS = (u7 == null || (b12 = u7.f19068k) == null) ? -1 : b12.f18932a.s();
            if (iS == -1) {
                return;
            }
            E4.F fO = E4.I.o();
            for (int i8 = 0; i8 < list.size(); i8++) {
                Bundle bundle = (Bundle) list.get(i8);
                bundle.getClass();
                fO.a(C1709a.b(iS, bundle));
            }
            p1(new A2.E(i7, fO.f()));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for CommandButton", e7);
        }
    }

    public final void p1(InterfaceC1722e0 interfaceC1722e0) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            U u7 = (U) this.f19184c.get();
            if (u7 == null) {
                return;
            }
            w2.t.G(u7.f19059a.f19401e, new RunnableC0022x(u7, 14, interfaceC1722e0));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void q1(int i7, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            U u7 = (U) this.f19184c.get();
            if (u7 == null) {
                return;
            }
            u7.f19060b.d(i7, obj);
            u7.f19059a.Q0(new RunnableC0003d(i7, 2, u7));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // w3.InterfaceC1737m
    public final void u0(int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            p1(new A2.I(21, C1729i.a(bundle)));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Malformed Bundle for ConnectionResult. Disconnected from the session.", e7);
            a();
        }
    }

    @Override // w3.InterfaceC1737m
    public final void w(int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            q1(i7, C1750t.a(bundle));
        } catch (RuntimeException e7) {
            AbstractC1697a.x("Ignoring malformed Bundle for LibraryResult", e7);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
