package C2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import t2.C1476e;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: C2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0040l {

    /* JADX INFO: renamed from: a */
    public final Context f1128a;

    /* JADX INFO: renamed from: b */
    public final A2.I f1129b;

    /* JADX INFO: renamed from: c */
    public final Handler f1130c;

    /* JADX INFO: renamed from: d */
    public final C0037i f1131d;

    /* JADX INFO: renamed from: e */
    public final C0039k f1132e;

    /* JADX INFO: renamed from: f */
    public final C0038j f1133f;

    /* JADX INFO: renamed from: g */
    public C0035g f1134g;
    public C0041m h;

    /* JADX INFO: renamed from: i */
    public C1476e f1135i;

    /* JADX INFO: renamed from: j */
    public boolean f1136j;

    public C0040l(YosPlaybackService yosPlaybackService, A2.I i7, C1476e c1476e, C0041m c0041m) {
        Context applicationContext = yosPlaybackService.getApplicationContext();
        this.f1128a = applicationContext;
        this.f1129b = i7;
        this.f1135i = c1476e;
        this.h = c0041m;
        Handler handler = new Handler(w2.t.o(), null);
        this.f1130c = handler;
        int i8 = w2.t.f18881a;
        this.f1131d = i8 >= 23 ? new C0037i(this) : null;
        this.f1132e = i8 >= 21 ? new C0039k(0, this) : null;
        C0035g c0035g = C0035g.f1117c;
        String str = w2.t.f18883c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f1133f = uriFor != null ? new C0038j(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0035g c0035g) {
        J2.o oVar;
        if (!this.f1136j || c0035g.equals(this.f1134g)) {
            return;
        }
        this.f1134g = c0035g;
        S s7 = (S) this.f1129b.f80p;
        s7.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = s7.f1055i0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        if (c0035g.equals(s7.f1072x)) {
            return;
        }
        s7.f1072x = c0035g;
        A.b bVar = s7.f1067s;
        if (bVar != null) {
            switch (bVar.f2o) {
                case 4:
                    return;
                default:
                    V v3 = (V) bVar.f3p;
                    synchronized (v3.f280o) {
                        oVar = v3.f279E;
                        break;
                    }
                    if (oVar != null) {
                        oVar.h();
                        return;
                    }
                    return;
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        C0041m c0041m = this.h;
        if (w2.t.a(audioDeviceInfo, c0041m == null ? null : c0041m.f1137a)) {
            return;
        }
        C0041m c0041m2 = audioDeviceInfo != null ? new C0041m(audioDeviceInfo) : null;
        this.h = c0041m2;
        a(C0035g.c(this.f1128a, this.f1135i, c0041m2));
    }
}
