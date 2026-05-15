package K2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f4001a;

    public final void a(int i7) {
        g gVar = this.f4001a;
        synchronized (gVar) {
            int i8 = gVar.f4019m;
            if (i8 == 0 || gVar.f4012d) {
                if (i8 == i7) {
                    return;
                }
                gVar.f4019m = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    gVar.f4018k = gVar.a(i7);
                    gVar.f4011c.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    gVar.b(gVar.f4014f > 0 ? (int) (jElapsedRealtime - gVar.f4015g) : 0, gVar.h, gVar.f4018k);
                    gVar.f4015g = jElapsedRealtime;
                    gVar.h = 0L;
                    gVar.f4017j = 0L;
                    gVar.f4016i = 0L;
                    o oVar = gVar.f4013e;
                    oVar.f4041b.clear();
                    oVar.f4043d = -1;
                    oVar.f4044e = 0;
                    oVar.f4045f = 0;
                }
            }
        }
    }
}
