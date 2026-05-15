package y2;

import E4.b0;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: y2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2005c implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20317o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f20318p = new ArrayList(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f20320r;

    public AbstractC2005c(boolean z6) {
        this.f20317o = z6;
    }

    @Override // y2.h
    public final void a(C c7) {
        c7.getClass();
        ArrayList arrayList = this.f20318p;
        if (arrayList.contains(c7)) {
            return;
        }
        arrayList.add(c7);
        this.f20319q++;
    }

    @Override // y2.h
    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final void k(int i7) {
        boolean z6;
        m mVar = this.f20320r;
        int i8 = w2.t.f18881a;
        for (int i9 = 0; i9 < this.f20319q; i9++) {
            C c7 = (C) this.f20318p.get(i9);
            boolean z7 = this.f20317o;
            K2.g gVar = (K2.g) c7;
            synchronized (gVar) {
                b0 b0Var = K2.g.f4002n;
                if (z7) {
                    int i10 = mVar.h;
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    gVar.h += (long) i7;
                }
            }
        }
    }

    public final void p() {
        boolean z6;
        m mVar = this.f20320r;
        int i7 = w2.t.f18881a;
        for (int i8 = 0; i8 < this.f20319q; i8++) {
            C c7 = (C) this.f20318p.get(i8);
            boolean z7 = this.f20317o;
            K2.g gVar = (K2.g) c7;
            synchronized (gVar) {
                try {
                    b0 b0Var = K2.g.f4002n;
                    if (z7) {
                        int i9 = mVar.h;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        AbstractC1697a.i(gVar.f4014f > 0);
                        gVar.f4011c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i10 = (int) (jElapsedRealtime - gVar.f4015g);
                        gVar.f4016i += (long) i10;
                        long j3 = gVar.f4017j;
                        long j7 = gVar.h;
                        gVar.f4017j = j3 + j7;
                        if (i10 > 0) {
                            gVar.f4013e.a((int) Math.sqrt(j7), (j7 * 8000.0f) / i10);
                            if (gVar.f4016i >= 2000 || gVar.f4017j >= 524288) {
                                gVar.f4018k = (long) gVar.f4013e.b();
                            }
                            gVar.b(i10, gVar.h, gVar.f4018k);
                            gVar.f4015g = jElapsedRealtime;
                            gVar.h = 0L;
                        }
                        gVar.f4014f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f20320r = null;
    }

    public final void q() {
        for (int i7 = 0; i7 < this.f20319q; i7++) {
            ((C) this.f20318p.get(i7)).getClass();
        }
    }

    public final void r(m mVar) {
        boolean z6;
        this.f20320r = mVar;
        for (int i7 = 0; i7 < this.f20319q; i7++) {
            C c7 = (C) this.f20318p.get(i7);
            boolean z7 = this.f20317o;
            K2.g gVar = (K2.g) c7;
            synchronized (gVar) {
                try {
                    b0 b0Var = K2.g.f4002n;
                    if (z7) {
                        int i8 = mVar.h;
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (gVar.f4014f == 0) {
                            gVar.f4011c.getClass();
                            gVar.f4015g = SystemClock.elapsedRealtime();
                        }
                        gVar.f4014f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
