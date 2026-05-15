package B2;

import H2.A;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import t2.C1469B;
import t2.C1487p;
import t2.P;
import t2.e0;
import t2.g0;
import t2.h0;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f781A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaybackSession f784c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlaybackMetrics.Builder f790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f791k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public P f793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V.o f794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public V.o f795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public V.o f796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1487p f797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1487p f798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1487p f799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f804y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f805z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f786e = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e0 f787f = new e0();
    public final HashMap h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f788g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f785d = SystemClock.elapsedRealtime();
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f792m = 0;

    public n(Context context, PlaybackSession playbackSession) {
        this.f782a = context.getApplicationContext();
        this.f784c = playbackSession;
        k kVar = new k();
        this.f783b = kVar;
        kVar.f775d = this;
    }

    public final boolean a(V.o oVar) {
        String str;
        if (oVar == null) {
            return false;
        }
        String str2 = (String) oVar.f7343q;
        k kVar = this.f783b;
        synchronized (kVar) {
            str = kVar.f777f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f790j;
        if (builder != null && this.f781A) {
            builder.setAudioUnderrunCount(this.f805z);
            this.f790j.setVideoFramesDropped(this.f803x);
            this.f790j.setVideoFramesPlayed(this.f804y);
            Long l = (Long) this.f788g.get(this.f789i);
            this.f790j.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l7 = (Long) this.h.get(this.f789i);
            this.f790j.setNetworkBytesRead(l7 == null ? 0L : l7.longValue());
            this.f790j.setStreamSource((l7 == null || l7.longValue() <= 0) ? 0 : 1);
            this.f784c.reportPlaybackMetrics(this.f790j.build());
        }
        this.f790j = null;
        this.f789i = null;
        this.f805z = 0;
        this.f803x = 0;
        this.f804y = 0;
        this.f797r = null;
        this.f798s = null;
        this.f799t = null;
        this.f781A = false;
    }

    public final void c(h0 h0Var, A a4) {
        int iB;
        PlaybackMetrics.Builder builder = this.f790j;
        if (a4 == null || (iB = h0Var.b(a4.f2973a)) == -1) {
            return;
        }
        e0 e0Var = this.f787f;
        int i7 = 0;
        h0Var.f(iB, e0Var, false);
        int i8 = e0Var.f16428c;
        g0 g0Var = this.f786e;
        h0Var.n(i8, g0Var);
        C1469B c1469b = g0Var.f16456c.f16224b;
        if (c1469b != null) {
            int iY = t.y(c1469b.f16185a, c1469b.f16186b);
            i7 = iY != 0 ? iY != 1 ? iY != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        if (g0Var.l != -9223372036854775807L && !g0Var.f16462j && !g0Var.h && !g0Var.a()) {
            builder.setMediaDurationMillis(t.N(g0Var.l));
        }
        builder.setPlaybackType(g0Var.a() ? 2 : 1);
        this.f781A = true;
    }

    public final void d(a aVar, String str) {
        A a4 = aVar.f731d;
        if ((a4 == null || !a4.b()) && str.equals(this.f789i)) {
            b();
        }
        this.f788g.remove(str);
        this.h.remove(str);
    }

    public final void e(int i7, long j3, C1487p c1487p) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = l.k(i7).setTimeSinceCreatedMillis(j3 - this.f785d);
        if (c1487p != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = c1487p.l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1487p.f16701m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1487p.f16699j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = c1487p.f16698i;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i9 = c1487p.f16707s;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = c1487p.f16708t;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = c1487p.f16680A;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = c1487p.f16681B;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = c1487p.f16694d;
            if (str4 != null) {
                int i13 = t.f18881a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = c1487p.f16709u;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f781A = true;
        this.f784c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
