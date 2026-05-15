package z2;

import java.util.ArrayDeque;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21125a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f[] f21129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g[] f21130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21131g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f21132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f21133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21134k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21135m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21126b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21136n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f21127c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f21128d = new ArrayDeque();

    public i(f[] fVarArr, g[] gVarArr) {
        this.f21129e = fVarArr;
        this.f21131g = fVarArr.length;
        for (int i7 = 0; i7 < this.f21131g; i7++) {
            this.f21129e[i7] = g();
        }
        this.f21130f = gVarArr;
        this.h = gVarArr.length;
        for (int i8 = 0; i8 < this.h; i8++) {
            this.f21130f[i8] = h();
        }
        h hVar = new h(this);
        this.f21125a = hVar;
        hVar.start();
    }

    @Override // z2.c
    public void a() {
        synchronized (this.f21126b) {
            this.l = true;
            this.f21126b.notify();
        }
        try {
            this.f21125a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // z2.c
    public final void b(long j3) {
        synchronized (this.f21126b) {
            try {
                AbstractC1697a.i(this.f21131g == this.f21129e.length || this.f21134k);
                this.f21136n = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z2.c
    public final Object f() {
        f fVar;
        synchronized (this.f21126b) {
            try {
                d dVar = this.f21133j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC1697a.i(this.f21132i == null);
                int i7 = this.f21131g;
                if (i7 == 0) {
                    fVar = null;
                } else {
                    f[] fVarArr = this.f21129e;
                    int i8 = i7 - 1;
                    this.f21131g = i8;
                    fVar = fVarArr[i8];
                }
                this.f21132i = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // z2.c
    public final void flush() {
        synchronized (this.f21126b) {
            try {
                this.f21134k = true;
                this.f21135m = 0;
                f fVar = this.f21132i;
                if (fVar != null) {
                    fVar.f();
                    int i7 = this.f21131g;
                    this.f21131g = i7 + 1;
                    this.f21129e[i7] = fVar;
                    this.f21132i = null;
                }
                while (!this.f21127c.isEmpty()) {
                    f fVar2 = (f) this.f21127c.removeFirst();
                    fVar2.f();
                    int i8 = this.f21131g;
                    this.f21131g = i8 + 1;
                    this.f21129e[i8] = fVar2;
                }
                while (!this.f21128d.isEmpty()) {
                    ((g) this.f21128d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract f g();

    public abstract g h();

    public abstract d i(Throwable th);

    public abstract d j(f fVar, g gVar, boolean z6);

    public final boolean k() {
        d dVarI;
        synchronized (this.f21126b) {
            while (!this.l) {
                try {
                    if (!this.f21127c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.f21126b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            f fVar = (f) this.f21127c.removeFirst();
            g[] gVarArr = this.f21130f;
            int i7 = this.h - 1;
            this.h = i7;
            g gVar = gVarArr[i7];
            boolean z6 = this.f21134k;
            this.f21134k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                gVar.f21121q = fVar.f21117u;
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                if (!m(fVar.f21117u)) {
                    gVar.f21123s = true;
                }
                try {
                    dVarI = j(fVar, gVar, z6);
                } catch (OutOfMemoryError e7) {
                    dVarI = i(e7);
                } catch (RuntimeException e8) {
                    dVarI = i(e8);
                }
                if (dVarI != null) {
                    synchronized (this.f21126b) {
                        this.f21133j = dVarI;
                    }
                    return false;
                }
            }
            synchronized (this.f21126b) {
                try {
                    if (this.f21134k) {
                        gVar.g();
                    } else if (gVar.f21123s) {
                        this.f21135m++;
                        gVar.g();
                    } else {
                        gVar.f21122r = this.f21135m;
                        this.f21135m = 0;
                        this.f21128d.addLast(gVar);
                    }
                    fVar.f();
                    int i8 = this.f21131g;
                    this.f21131g = i8 + 1;
                    this.f21129e[i8] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // z2.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final g e() {
        synchronized (this.f21126b) {
            try {
                d dVar = this.f21133j;
                if (dVar != null) {
                    throw dVar;
                }
                if (this.f21128d.isEmpty()) {
                    return null;
                }
                return (g) this.f21128d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(long j3) {
        boolean z6;
        synchronized (this.f21126b) {
            long j7 = this.f21136n;
            z6 = j7 == -9223372036854775807L || j3 >= j7;
        }
        return z6;
    }

    @Override // z2.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void c(f fVar) {
        synchronized (this.f21126b) {
            try {
                d dVar = this.f21133j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC1697a.d(fVar == this.f21132i);
                this.f21127c.addLast(fVar);
                if (!this.f21127c.isEmpty() && this.h > 0) {
                    this.f21126b.notify();
                }
                this.f21132i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(g gVar) {
        synchronized (this.f21126b) {
            gVar.f();
            int i7 = this.h;
            this.h = i7 + 1;
            this.f21130f[i7] = gVar;
            if (!this.f21127c.isEmpty() && this.h > 0) {
                this.f21126b.notify();
            }
        }
    }
}
