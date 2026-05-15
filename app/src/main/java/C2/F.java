package C2;

import A2.RunnableC0022x;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f975o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f976p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f977q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f978r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f979s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f980t;

    public /* synthetic */ F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f975o = i7;
        this.f976p = obj;
        this.f977q = obj2;
        this.f978r = obj3;
        this.f979s = obj4;
        this.f980t = obj5;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f976p;
        A.b bVar = (A.b) this.f977q;
        Handler handler = (Handler) this.f978r;
        T t7 = (T) this.f979s;
        N2.K k7 = (N2.K) this.f980t;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC0022x(bVar, 3, t7));
            }
            k7.e();
            synchronized (S.f1013m0) {
                try {
                    int i7 = S.f1015o0 - 1;
                    S.f1015o0 = i7;
                    if (i7 == 0) {
                        S.f1014n0.shutdown();
                        S.f1014n0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC0022x(bVar, 3, t7));
            }
            k7.e();
            synchronized (S.f1013m0) {
                try {
                    int i8 = S.f1015o0 - 1;
                    S.f1015o0 = i8;
                    if (i8 == 0) {
                        S.f1014n0.shutdown();
                        S.f1014n0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x00b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.F.run():void");
    }
}
