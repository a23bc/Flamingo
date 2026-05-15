package x3;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* JADX INFO: renamed from: x3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1913O extends MediaSession.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1914P f19997a;

    public C1913O(AbstractC1914P abstractC1914P) {
        this.f19997a = abstractC1914P;
    }

    public static void b(S s7) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return;
        }
        MediaSession mediaSession = s7.f20005a;
        String str = null;
        if (i7 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        s7.f(new f0(str, -1, -1));
    }

    public final S a() {
        S s7;
        synchronized (this.f19997a.f19998a) {
            s7 = (S) this.f19997a.f20001d.get();
        }
        if (s7 == null || this.f19997a != s7.b()) {
            return null;
        }
        return s7;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        M3.d dVar;
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    Y y6 = sA.f20007c;
                    InterfaceC1923h interfaceC1923hA = y6.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC1923hA == null ? null : interfaceC1923hA.asBinder());
                    synchronized (y6.f20020o) {
                        dVar = y6.f20023r;
                    }
                    if (dVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f19997a.b((C1910L) j0.k.s(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C1910L.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f19997a.c((C1910L) j0.k.s(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C1910L.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f19997a.q((C1910L) j0.k.s(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C1910L.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                ArrayList arrayList = sA.h;
                if (arrayList != null && bundle != null) {
                    int i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    W w7 = (i7 < 0 || i7 >= arrayList.size()) ? null : (W) arrayList.get(i7);
                    if (w7 != null) {
                        this.f19997a.q(w7.f20016o);
                    }
                }
            } else {
                this.f19997a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
        }
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            AbstractC1914P abstractC1914P = this.f19997a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    Z.a(bundle2);
                    abstractC1914P.l(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                abstractC1914P.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    Z.a(bundle3);
                    abstractC1914P.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    Z.a(bundle4);
                    abstractC1914P.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    Z.a(bundle5);
                    abstractC1914P.p(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    abstractC1914P.getClass();
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    abstractC1914P.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    abstractC1914P.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    n0 n0Var = (n0) j0.k.s(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), n0.CREATOR);
                    Z.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    abstractC1914P.v(n0Var);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                abstractC1914P.e(str, bundle);
            } else if (bundle != null) {
                abstractC1914P.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
        }
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.f();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        S sA = a();
        if (sA == null) {
            return false;
        }
        b(sA);
        boolean zG = this.f19997a.g(intent);
        sA.f(null);
        return zG || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.h();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.i();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.j(str, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.k(str, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.l(uri, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.m();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.n(str, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.o(str, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        S sA = a();
        if (sA == null) {
            return;
        }
        Z.a(bundle);
        b(sA);
        this.f19997a.p(uri, bundle);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.r();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j3) {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.s(j3);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f7) {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.t(f7);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.u(n0.a(rating));
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.y();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.z();
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j3) {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.A(j3);
        sA.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        S sA = a();
        if (sA == null) {
            return;
        }
        b(sA);
        this.f19997a.B();
        sA.f(null);
    }
}
