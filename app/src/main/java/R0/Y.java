package R0;

import a.AbstractC0509a;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import w5.AbstractC1805x;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1805x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Y4.m f6387A = AbstractC0509a.O(N.f6355v);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final K5.c f6388B = new K5.c(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Choreographer f6389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f6390r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6396x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0371a0 f6398z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f6391s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z4.k f6392t = new Z4.k();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f6393u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f6394v = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final X f6397y = new X(this);

    public Y(Choreographer choreographer, Handler handler) {
        this.f6389q = choreographer;
        this.f6390r = handler;
        this.f6398z = new C0371a0(choreographer, this);
    }

    public static final void E(Y y6) {
        boolean z6;
        do {
            Runnable runnableF = y6.F();
            while (runnableF != null) {
                runnableF.run();
                runnableF = y6.F();
            }
            synchronized (y6.f6391s) {
                if (y6.f6392t.isEmpty()) {
                    z6 = false;
                    y6.f6395w = false;
                } else {
                    z6 = true;
                }
            }
        } while (z6);
    }

    @Override // w5.AbstractC1805x
    public final void A(c5.i iVar, Runnable runnable) {
        synchronized (this.f6391s) {
            this.f6392t.addLast(runnable);
            if (!this.f6395w) {
                this.f6395w = true;
                this.f6390r.post(this.f6397y);
                if (!this.f6396x) {
                    this.f6396x = true;
                    this.f6389q.postFrameCallback(this.f6397y);
                }
            }
        }
    }

    public final Runnable F() {
        Runnable runnable;
        synchronized (this.f6391s) {
            Z4.k kVar = this.f6392t;
            runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
        }
        return runnable;
    }
}
