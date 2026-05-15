package A2;

import java.util.HashMap;
import java.util.Iterator;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: A2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0011l {

    /* JADX INFO: renamed from: a */
    public final K2.e f341a;

    /* JADX INFO: renamed from: b */
    public final long f342b;

    /* JADX INFO: renamed from: c */
    public final long f343c;

    /* JADX INFO: renamed from: d */
    public final long f344d;

    /* JADX INFO: renamed from: e */
    public final long f345e;

    /* JADX INFO: renamed from: f */
    public final int f346f;

    /* JADX INFO: renamed from: g */
    public final long f347g;
    public final HashMap h;

    /* JADX INFO: renamed from: i */
    public long f348i;

    public C0011l() {
        K2.e eVar = new K2.e();
        a("bufferForPlaybackMs", 2500, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f341a = eVar;
        long j3 = 50000;
        this.f342b = w2.t.D(j3);
        this.f343c = w2.t.D(j3);
        this.f344d = w2.t.D(2500);
        this.f345e = w2.t.D(5000);
        this.f346f = -1;
        this.f347g = w2.t.D(0);
        this.h = new HashMap();
        this.f348i = -1L;
    }

    public static void a(String str, int i7, int i8, String str2) {
        AbstractC1697a.c(str + " cannot be less than " + str2, i7 >= i8);
    }

    public final int b() {
        Iterator it = this.h.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((C0010k) it.next()).f336b;
        }
        return i7;
    }

    public final boolean c(X x6) {
        int i7;
        C0010k c0010k = (C0010k) this.h.get(x6.f209a);
        c0010k.getClass();
        K2.e eVar = this.f341a;
        synchronized (eVar) {
            i7 = eVar.f3998d * eVar.f3996b;
        }
        boolean z6 = i7 >= b();
        float f7 = x6.f211c;
        long j3 = this.f343c;
        long jMin = this.f342b;
        if (f7 > 1.0f) {
            jMin = Math.min(w2.t.r(jMin, f7), j3);
        }
        long jMax = Math.max(jMin, 500000L);
        long j7 = x6.f210b;
        if (j7 < jMax) {
            c0010k.f335a = !z6;
            if (z6 && j7 < 500000) {
                AbstractC1697a.w("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j7 >= j3 || z6) {
            c0010k.f335a = false;
        }
        return c0010k.f335a;
    }

    public final void d() {
        if (!this.h.isEmpty()) {
            this.f341a.a(b());
            return;
        }
        K2.e eVar = this.f341a;
        synchronized (eVar) {
            if (eVar.f3995a) {
                eVar.a(0);
            }
        }
    }
}
