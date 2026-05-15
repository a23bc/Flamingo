package x3;

import A2.RunnableC0022x;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import q.S0;
import w2.AbstractC1697a;
import w3.C1716c0;
import w3.C1760y;
import w3.HandlerC1759x0;

/* JADX INFO: renamed from: x3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1924i extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ S0 f20050a;

    public C1924i(S0 s02) {
        this.f20050a = s02;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        InterfaceC1923h interfaceC1923h;
        S0 s02 = this.f20050a;
        C1925j c1925j = (C1925j) s02.f15226q;
        if (c1925j != null) {
            MediaBrowser mediaBrowser = c1925j.f20052b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        V1.a aVar = new V1.a();
                        aVar.f7389o = new Messenger(binder);
                        aVar.f7390p = c1925j.f20053c;
                        c1925j.f20056f = aVar;
                        HandlerC1759x0 handlerC1759x0 = c1925j.f20054d;
                        Messenger messenger = new Messenger(handlerC1759x0);
                        c1925j.f20057g = messenger;
                        handlerC1759x0.getClass();
                        handlerC1759x0.f19390c = new WeakReference(messenger);
                        try {
                            Context context = c1925j.f20051a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) aVar.f7390p);
                            aVar.M(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i7 = BinderC1915Q.f20003d;
                    if (binder2 == null) {
                        interfaceC1923h = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1923h)) {
                            C1922g c1922g = new C1922g();
                            c1922g.f20040c = binder2;
                            interfaceC1923h = c1922g;
                        } else {
                            interfaceC1923h = (InterfaceC1923h) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (interfaceC1923h != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        AbstractC1697a.i(sessionToken != null);
                        if (!(sessionToken instanceof MediaSession.Token)) {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                        c1925j.h = new Y(sessionToken, interfaceC1923h);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        C1716c0 c1716c0 = (C1716c0) s02.f15227r;
        C1928m c1928m = c1716c0.h;
        if (c1928m != null) {
            C1925j c1925j2 = c1928m.f20067a;
            if (c1925j2.h == null) {
                MediaSession.Token sessionToken2 = c1925j2.f20052b.getSessionToken();
                AbstractC1697a.i(sessionToken2 != null);
                if (!(sessionToken2 instanceof MediaSession.Token)) {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
                c1925j2.h = new Y(sessionToken2, null);
            }
            RunnableC0022x runnableC0022x = new RunnableC0022x(c1716c0, 13, c1925j2.h);
            C1760y c1760y = c1716c0.f19154b;
            c1760y.Q0(runnableC0022x);
            c1760y.f19401e.post(new w3.X(c1716c0, 0));
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        S0 s02 = this.f20050a;
        Object obj = s02.f15226q;
        ((C1716c0) s02.f15227r).f19154b.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        S0 s02 = this.f20050a;
        C1925j c1925j = (C1925j) s02.f15226q;
        if (c1925j != null) {
            c1925j.f20056f = null;
            c1925j.f20057g = null;
            c1925j.h = null;
            HandlerC1759x0 handlerC1759x0 = c1925j.f20054d;
            handlerC1759x0.getClass();
            handlerC1759x0.f19390c = new WeakReference(null);
        }
        ((C1716c0) s02.f15227r).f19154b.a();
    }
}
