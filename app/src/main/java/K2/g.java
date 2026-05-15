package K2;

import A2.RunnableC0022x;
import E4.AbstractC0119q;
import E4.I;
import E4.K;
import E4.b0;
import H2.A;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import y2.C;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d, C {

    /* JADX INFO: renamed from: n */
    public static final b0 f4002n = I.s(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o */
    public static final b0 f4003o = I.s(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p */
    public static final b0 f4004p = I.s(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q */
    public static final b0 f4005q = I.s(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r */
    public static final b0 f4006r = I.s(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s */
    public static final b0 f4007s = I.s(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t */
    public static g f4008t;

    /* JADX INFO: renamed from: a */
    public final K f4009a;

    /* JADX INFO: renamed from: b */
    public final A.b f4010b = new A.b(29);

    /* JADX INFO: renamed from: c */
    public final w2.o f4011c;

    /* JADX INFO: renamed from: d */
    public final boolean f4012d;

    /* JADX INFO: renamed from: e */
    public final o f4013e;

    /* JADX INFO: renamed from: f */
    public int f4014f;

    /* JADX INFO: renamed from: g */
    public long f4015g;
    public long h;

    /* JADX INFO: renamed from: i */
    public long f4016i;

    /* JADX INFO: renamed from: j */
    public long f4017j;

    /* JADX INFO: renamed from: k */
    public long f4018k;
    public long l;

    /* JADX INFO: renamed from: m */
    public int f4019m;

    public g(Context context, HashMap map, int i7, w2.o oVar, boolean z6) {
        this.f4009a = K.b(map);
        this.f4013e = new o(i7);
        this.f4011c = oVar;
        this.f4012d = z6;
        if (context == null) {
            this.f4019m = 0;
            this.f4018k = a(0);
            return;
        }
        w2.l lVarB = w2.l.b(context);
        int iC = lVarB.c();
        this.f4019m = iC;
        this.f4018k = a(iC);
        f fVar = new f(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) lVarB.f18862c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(fVar));
        ((Handler) lVarB.f18861b).post(new RunnableC0022x(lVarB, 11, fVar));
    }

    public final long a(int i7) {
        Integer numValueOf = Integer.valueOf(i7);
        K k7 = this.f4009a;
        Long l = (Long) k7.get(numValueOf);
        if (l == null) {
            l = (Long) k7.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void b(int i7, long j3, long j7) {
        final int i8;
        final long j8;
        final long j9;
        if (i7 == 0 && j3 == 0 && j7 == this.l) {
            return;
        }
        this.l = j7;
        for (final c cVar : (CopyOnWriteArrayList) this.f4010b.f3p) {
            if (cVar.f3994c) {
                i8 = i7;
                j8 = j3;
                j9 = j7;
            } else {
                i8 = i7;
                j8 = j3;
                j9 = j7;
                cVar.f3992a.post(new Runnable() { // from class: K2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        B2.i iVar = cVar.f3993b;
                        B2.h hVar = iVar.f758r;
                        B2.a aVarB = iVar.b(((I) hVar.f750b).isEmpty() ? null : (A) AbstractC0119q.j((I) hVar.f750b));
                        iVar.Z(aVarB, 1006, new B2.f(aVarB, i8, j8, j9));
                    }
                });
            }
            i7 = i8;
            j3 = j8;
            j7 = j9;
        }
    }
}
