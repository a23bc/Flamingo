package H;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import j5.AbstractC1110d;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: H.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0160b implements k0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: v */
    public static long f2841v;

    /* JADX INFO: renamed from: o */
    public final View f2842o;

    /* JADX INFO: renamed from: q */
    public boolean f2844q;

    /* JADX INFO: renamed from: t */
    public boolean f2847t;

    /* JADX INFO: renamed from: u */
    public long f2848u;

    /* JADX INFO: renamed from: p */
    public final PriorityQueue f2843p = new PriorityQueue(11, new C1.b(1));

    /* JADX INFO: renamed from: r */
    public final Choreographer f2845r = Choreographer.getInstance();

    /* JADX INFO: renamed from: s */
    public final C0159a f2846s = new C0159a();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewOnAttachStateChangeListenerC0160b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f2842o = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            C1.b r1 = new C1.b
            r2 = 1
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f2843p = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f2845r = r0
            H.a r0 = new H.a
            r0.<init>()
            r4.f2846s = r0
            long r0 = H.ViewOnAttachStateChangeListenerC0160b.f2841v
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            H.ViewOnAttachStateChangeListenerC0160b.f2841v = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f2847t = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.ViewOnAttachStateChangeListenerC0160b.<init>(android.view.View):void");
    }

    @Override // H.k0
    public final void a(j0 j0Var) {
        this.f2843p.add(new n0(1, j0Var));
        if (this.f2844q) {
            return;
        }
        this.f2844q = true;
        this.f2842o.post(this);
    }

    public final boolean b() {
        C0159a c0159a = this.f2846s;
        long jA = c0159a.a();
        AbstractC1110d.K("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z6 = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.f2843p;
            Object objPeek = priorityQueue.peek();
            AbstractC1209k.c(objPeek);
            if (!((n0) objPeek).f2912b.c(c0159a)) {
                priorityQueue.poll();
                z6 = false;
            }
            c0159a.f2838a = false;
        }
        return z6;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f2847t) {
            this.f2848u = j3;
            this.f2842o.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2847t = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2847t = false;
        this.f2842o.removeCallbacks(this);
        this.f2845r.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f2843p;
        if (!priorityQueue.isEmpty() && this.f2844q && this.f2847t) {
            View view = this.f2842o;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z6 = System.nanoTime() > (((long) 2) * f2841v) + nanos;
                C0159a c0159a = this.f2846s;
                c0159a.f2838a = z6;
                c0159a.f2839b = Math.max(this.f2848u, nanos) + f2841v;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (c0159a.f2838a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f2845r.postFrameCallback(this);
                } else {
                    this.f2844q = false;
                }
                AbstractC1110d.K("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f2844q = false;
    }
}
