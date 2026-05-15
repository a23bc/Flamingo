package x3;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.util.ArrayList;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public class S {

    /* JADX INFO: renamed from: a */
    public final MediaSession f20005a;

    /* JADX INFO: renamed from: b */
    public final BinderC1915Q f20006b;

    /* JADX INFO: renamed from: c */
    public final Y f20007c;

    /* JADX INFO: renamed from: e */
    public final Bundle f20009e;

    /* JADX INFO: renamed from: g */
    public m0 f20011g;
    public ArrayList h;

    /* JADX INFO: renamed from: i */
    public C1911M f20012i;

    /* JADX INFO: renamed from: j */
    public int f20013j;

    /* JADX INFO: renamed from: k */
    public int f20014k;
    public AbstractC1914P l;

    /* JADX INFO: renamed from: m */
    public f0 f20015m;

    /* JADX INFO: renamed from: d */
    public final Object f20008d = new Object();

    /* JADX INFO: renamed from: f */
    public final RemoteCallbackList f20010f = new RemoteCallbackList();

    public S(YosPlaybackService yosPlaybackService, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(yosPlaybackService, str, bundle);
        this.f20005a = mediaSessionA;
        BinderC1915Q binderC1915Q = new BinderC1915Q(this);
        this.f20006b = binderC1915Q;
        this.f20007c = new Y(mediaSessionA.getSessionToken(), binderC1915Q);
        this.f20009e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(YosPlaybackService yosPlaybackService, String str, Bundle bundle) {
        return new MediaSession(yosPlaybackService, str);
    }

    public final AbstractC1914P b() {
        AbstractC1914P abstractC1914P;
        synchronized (this.f20008d) {
            abstractC1914P = this.l;
        }
        return abstractC1914P;
    }

    public f0 c() {
        f0 f0Var;
        synchronized (this.f20008d) {
            f0Var = this.f20015m;
        }
        return f0Var;
    }

    public final m0 d() {
        return this.f20011g;
    }

    public final void e(AbstractC1914P abstractC1914P, Handler handler) {
        synchronized (this.f20008d) {
            try {
                this.l = abstractC1914P;
                this.f20005a.setCallback(abstractC1914P == null ? null : abstractC1914P.f19999b, handler);
                if (abstractC1914P != null) {
                    abstractC1914P.C(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(f0 f0Var) {
        synchronized (this.f20008d) {
            this.f20015m = f0Var;
        }
    }
}
