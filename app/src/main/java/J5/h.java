package J5;

import F5.o;
import F5.r;
import F5.t;
import F5.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile boolean f3767A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile B0.a f3768B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile k f3769C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f3770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f3771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f3772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f3773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f3774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3775t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f3776u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k f3777v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B0.a f3778w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3779x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3780y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3781z;

    public h(r rVar, t tVar) {
        AbstractC1209k.f(rVar, "client");
        AbstractC1209k.f(tVar, "originalRequest");
        this.f3770o = rVar;
        this.f3771p = tVar;
        this.f3772q = (l) rVar.f2421p.f3p;
        rVar.f2424s.getClass();
        g gVar = new g(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar.g(0);
        this.f3773r = gVar;
        this.f3774s = new AtomicBoolean();
        this.f3781z = true;
    }

    public static final String a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(hVar.f3767A ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((o) hVar.f3771p.f2441p).f());
        return sb.toString();
    }

    public final void b(k kVar) {
        byte[] bArr = G5.b.f2765a;
        if (this.f3777v != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3777v = kVar;
        kVar.f3799p.add(new f(this, this.f3775t));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        byte[] bArr = G5.b.f2765a;
        k kVar = this.f3777v;
        if (kVar != null) {
            synchronized (kVar) {
                socketI = i();
            }
            if (this.f3777v == null) {
                if (socketI != null) {
                    G5.b.c(socketI);
                }
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f3773r.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            AbstractC1209k.c(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new h(this.f3770o, this.f3771p);
    }

    public final void d() {
        Socket socket;
        if (this.f3767A) {
            return;
        }
        this.f3767A = true;
        B0.a aVar = this.f3768B;
        if (aVar != null) {
            ((K5.e) aVar.f608d).cancel();
        }
        k kVar = this.f3769C;
        if (kVar == null || (socket = kVar.f3788c) == null) {
            return;
        }
        G5.b.c(socket);
    }

    public final void e(boolean z6) {
        B0.a aVar;
        synchronized (this) {
            if (!this.f3781z) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (aVar = this.f3768B) != null) {
            ((K5.e) aVar.f608d).cancel();
            ((h) aVar.f606b).g(aVar, true, true, null);
        }
        this.f3778w = null;
    }

    public final v f() {
        ArrayList arrayList = new ArrayList();
        Z4.t.l0(arrayList, this.f3770o.f2422q);
        arrayList.add(new K5.a(this.f3770o));
        arrayList.add(new K5.a(this.f3770o.f2429x));
        this.f3770o.getClass();
        arrayList.add(new H5.b());
        arrayList.add(a.f3743a);
        Z4.t.l0(arrayList, this.f3770o.f2423r);
        arrayList.add(new K5.b());
        t tVar = this.f3771p;
        r rVar = this.f3770o;
        try {
            try {
                v vVarF = new G.t(this, arrayList, 0, null, tVar, rVar.f2416J, rVar.f2417K, rVar.f2418L).f(this.f3771p);
                if (this.f3767A) {
                    G5.b.b(vVarF);
                    throw new IOException("Canceled");
                }
                h(null);
                return vVarF;
            } catch (IOException e7) {
                IOException iOExceptionH = h(e7);
                AbstractC1209k.d(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                h(null);
            }
            throw th;
        }
    }

    public final IOException g(B0.a aVar, boolean z6, boolean z7, IOException iOException) {
        boolean z8;
        boolean z9;
        AbstractC1209k.f(aVar, "exchange");
        if (aVar.equals(this.f3768B)) {
            synchronized (this) {
                z8 = false;
                if (z6) {
                    try {
                        if (!this.f3779x) {
                            if (z7 || !this.f3780y) {
                                z9 = false;
                            }
                        }
                        if (z6) {
                            this.f3779x = false;
                        }
                        if (z7) {
                            this.f3780y = false;
                        }
                        boolean z10 = this.f3779x;
                        boolean z11 = (z10 || this.f3780y) ? false : true;
                        if (!z10 && !this.f3780y) {
                            if (!this.f3781z) {
                                z8 = true;
                            }
                        }
                        z9 = z8;
                        z8 = z11;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z7) {
                    }
                    z9 = false;
                }
            }
            if (z8) {
                this.f3768B = null;
                k kVar = this.f3777v;
                if (kVar != null) {
                    kVar.h();
                }
            }
            if (z9) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f3781z) {
                this.f3781z = false;
                if (!this.f3779x) {
                    if (!this.f3780y) {
                        z6 = true;
                    }
                }
            }
        }
        return z6 ? c(iOException) : iOException;
    }

    public final Socket i() {
        k kVar = this.f3777v;
        AbstractC1209k.c(kVar);
        byte[] bArr = G5.b.f2765a;
        ArrayList arrayList = kVar.f3799p;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (AbstractC1209k.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f3777v = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f3800q = System.nanoTime();
        l lVar = this.f3772q;
        lVar.getClass();
        byte[] bArr2 = G5.b.f2765a;
        boolean z6 = kVar.f3794j;
        I5.c cVar = lVar.f3802b;
        if (!z6) {
            cVar.c(lVar.f3803c, 0L);
            return null;
        }
        kVar.f3794j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = lVar.f3804d;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f3789d;
        AbstractC1209k.c(socket);
        return socket;
    }
}
