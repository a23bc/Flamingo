package D2;

import A2.x0;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import t2.AbstractC1479h;
import w2.AbstractC1697a;
import z2.InterfaceC2080a;

/* JADX INFO: renamed from: D2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f1472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V.o f1473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f1474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1477g;
    public final w2.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0 f1478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B2.p f1479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f1480k;
    public final UUID l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Looper f1481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HandlerC0087c f1482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f1485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HandlerC0085a f1486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC2080a f1487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f1488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f1489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f1490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f1491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v f1492x;

    public C0089e(UUID uuid, w wVar, V.o oVar, f fVar, List list, boolean z6, boolean z7, byte[] bArr, HashMap map, B b7, Looper looper, x0 x0Var, B2.p pVar) {
        this.l = uuid;
        this.f1473c = oVar;
        this.f1474d = fVar;
        this.f1472b = wVar;
        this.f1475e = z6;
        this.f1476f = z7;
        if (bArr != null) {
            this.f1490v = bArr;
            this.f1471a = null;
        } else {
            list.getClass();
            this.f1471a = Collections.unmodifiableList(list);
        }
        this.f1477g = map;
        this.f1480k = b7;
        this.h = new w2.d();
        this.f1478i = x0Var;
        this.f1479j = pVar;
        this.f1483o = 2;
        this.f1481m = looper;
        this.f1482n = new HandlerC0087c(this, looper, 0);
    }

    @Override // D2.k
    public final boolean a() {
        p();
        return this.f1475e;
    }

    @Override // D2.k
    public final UUID b() {
        p();
        return this.l;
    }

    @Override // D2.k
    public final void c(n nVar) {
        p();
        int i7 = this.f1484p;
        if (i7 <= 0) {
            AbstractC1697a.m("release() called on a session that's already fully released.");
            return;
        }
        int i8 = i7 - 1;
        this.f1484p = i8;
        if (i8 == 0) {
            this.f1483o = 0;
            HandlerC0087c handlerC0087c = this.f1482n;
            int i9 = w2.t.f18881a;
            handlerC0087c.removeCallbacksAndMessages(null);
            HandlerC0085a handlerC0085a = this.f1486r;
            synchronized (handlerC0085a) {
                handlerC0085a.removeCallbacksAndMessages(null);
                handlerC0085a.f1463b = true;
            }
            this.f1486r = null;
            this.f1485q.quit();
            this.f1485q = null;
            this.f1487s = null;
            this.f1488t = null;
            this.f1491w = null;
            this.f1492x = null;
            byte[] bArr = this.f1489u;
            if (bArr != null) {
                this.f1472b.j(bArr);
                this.f1489u = null;
            }
        }
        if (nVar != null) {
            this.h.b(nVar);
            if (this.h.a(nVar) == 0) {
                nVar.e();
            }
        }
        f fVar = this.f1474d;
        int i10 = this.f1484p;
        i iVar = fVar.f1493a;
        if (i10 == 1 && iVar.f1500C > 0 && iVar.f1519y != -9223372036854775807L) {
            iVar.f1499B.add(this);
            Handler handler = iVar.f1505H;
            handler.getClass();
            handler.postAtTime(new B2.e(3, this), this, SystemClock.uptimeMillis() + iVar.f1519y);
        } else if (i10 == 0) {
            iVar.f1520z.remove(this);
            if (iVar.f1502E == this) {
                iVar.f1502E = null;
            }
            if (iVar.f1503F == this) {
                iVar.f1503F = null;
            }
            V.o oVar = iVar.f1516v;
            HashSet hashSet = (HashSet) oVar.f7342p;
            hashSet.remove(this);
            if (((C0089e) oVar.f7343q) == this) {
                oVar.f7343q = null;
                if (!hashSet.isEmpty()) {
                    C0089e c0089e = (C0089e) hashSet.iterator().next();
                    oVar.f7343q = c0089e;
                    v vVarS = c0089e.f1472b.s();
                    c0089e.f1492x = vVarS;
                    HandlerC0085a handlerC0085a2 = c0089e.f1486r;
                    int i11 = w2.t.f18881a;
                    vVarS.getClass();
                    handlerC0085a2.getClass();
                    handlerC0085a2.obtainMessage(1, new C0086b(H2.r.f3226a.getAndIncrement(), true, SystemClock.elapsedRealtime(), vVarS)).sendToTarget();
                }
            }
            if (iVar.f1519y != -9223372036854775807L) {
                Handler handler2 = iVar.f1505H;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                iVar.f1499B.remove(this);
            }
        }
        iVar.i();
    }

    @Override // D2.k
    public final int d() {
        p();
        return this.f1483o;
    }

    @Override // D2.k
    public final void e(n nVar) {
        p();
        if (this.f1484p < 0) {
            AbstractC1697a.m("Session reference count less than zero: " + this.f1484p);
            this.f1484p = 0;
        }
        if (nVar != null) {
            w2.d dVar = this.h;
            synchronized (dVar.f18835o) {
                try {
                    ArrayList arrayList = new ArrayList(dVar.f18838r);
                    arrayList.add(nVar);
                    dVar.f18838r = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) dVar.f18836p.get(nVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(dVar.f18837q);
                        hashSet.add(nVar);
                        dVar.f18837q = Collections.unmodifiableSet(hashSet);
                    }
                    dVar.f18836p.put(nVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i7 = this.f1484p + 1;
        this.f1484p = i7;
        if (i7 == 1) {
            AbstractC1697a.i(this.f1483o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f1485q = handlerThread;
            handlerThread.start();
            this.f1486r = new HandlerC0085a(this, this.f1485q.getLooper());
            if (n()) {
                j(true);
            }
        } else if (nVar != null && k() && this.h.a(nVar) == 1) {
            nVar.c(this.f1483o);
        }
        i iVar = this.f1474d.f1493a;
        if (iVar.f1519y != -9223372036854775807L) {
            iVar.f1499B.remove(this);
            Handler handler = iVar.f1505H;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // D2.k
    public final boolean f(String str) {
        p();
        byte[] bArr = this.f1489u;
        AbstractC1697a.j(bArr);
        return this.f1472b.J(str, bArr);
    }

    @Override // D2.k
    public final j g() {
        p();
        if (this.f1483o == 1) {
            return this.f1488t;
        }
        return null;
    }

    @Override // D2.k
    public final InterfaceC2080a h() {
        p();
        return this.f1487s;
    }

    public final void i(B2.g gVar) {
        Set set;
        w2.d dVar = this.h;
        synchronized (dVar.f18835o) {
            set = dVar.f18837q;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((n) it.next()).a();
        }
    }

    public final void j(boolean z6) {
        long jMin;
        String str;
        Set set;
        boolean z7 = true;
        if (this.f1476f) {
            return;
        }
        byte[] bArr = this.f1489u;
        int i7 = w2.t.f18881a;
        if (this.f1490v == null) {
            o(1, z6, bArr);
            return;
        }
        if (this.f1483o != 4) {
            try {
                this.f1472b.g(this.f1489u, this.f1490v);
            } catch (Exception | NoSuchMethodError e7) {
                l(e7, 1);
                z7 = false;
            }
            if (!z7) {
                return;
            }
        }
        if (AbstractC1479h.f16470d.equals(this.l)) {
            p();
            byte[] bArr2 = this.f1489u;
            Pair pair = null;
            Map mapH = bArr2 == null ? null : this.f1472b.h(bArr2);
            if (mapH != null) {
                long j3 = -9223372036854775807L;
                try {
                    str = (String) mapH.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j7 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j7);
                try {
                    String str2 = (String) mapH.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j3 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j3));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            AbstractC1697a.l("Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            o(2, z6, bArr);
            return;
        }
        if (jMin <= 0) {
            l(new C(), 2);
            return;
        }
        this.f1483o = 4;
        w2.d dVar = this.h;
        synchronized (dVar.f18835o) {
            set = dVar.f18837q;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b();
        }
    }

    public final boolean k() {
        int i7 = this.f1483o;
        return i7 == 3 || i7 == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            D2.j r0 = new D2.j
            int r1 = w2.t.f18881a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = D2.r.a(r6)
            if (r2 == 0) goto L14
            int r7 = D2.r.b(r6)
            goto L5f
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r1 = D2.s.a(r6)
            if (r1 == 0) goto L22
        L20:
            r7 = r4
            goto L5f
        L22:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r2 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L57
            boolean r1 = N5.l.I(r6)
            if (r1 == 0) goto L2f
            goto L57
        L2f:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L36
            r7 = 6007(0x1777, float:8.418E-42)
            goto L5f
        L36:
            boolean r1 = r6 instanceof D2.E
            if (r1 == 0) goto L3d
            r7 = 6001(0x1771, float:8.409E-42)
            goto L5f
        L3d:
            boolean r1 = r6 instanceof D2.g
            if (r1 == 0) goto L44
            r7 = 6003(0x1773, float:8.412E-42)
            goto L5f
        L44:
            boolean r1 = r6 instanceof D2.C
            if (r1 == 0) goto L4b
            r7 = 6008(0x1778, float:8.419E-42)
            goto L5f
        L4b:
            if (r7 != r3) goto L4e
            goto L20
        L4e:
            r1 = 2
            if (r7 != r1) goto L54
            r7 = 6004(0x1774, float:8.413E-42)
            goto L5f
        L54:
            r1 = 3
            if (r7 != r1) goto L59
        L57:
            r7 = r2
            goto L5f
        L59:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L5f:
            r0.<init>(r6, r7)
            r5.f1488t = r0
            java.lang.String r7 = "DRM session error"
            w2.AbstractC1697a.n(r7, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L8f
            w2.d r7 = r5.h
            java.lang.Object r0 = r7.f18835o
            monitor-enter(r0)
            java.util.Set r7 = r7.f18837q     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r7 = r7.iterator()
        L79:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r7.next()
            D2.n r0 = (D2.n) r0
            r1 = r6
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L79
        L8c:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r6
        L8f:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto Lab
            boolean r7 = N5.l.J(r6)
            if (r7 != 0) goto La3
            boolean r7 = N5.l.I(r6)
            if (r7 == 0) goto La0
            goto La3
        La0:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        La3:
            int r6 = r5.f1483o
            r7 = 4
            if (r6 == r7) goto Laa
            r5.f1483o = r3
        Laa:
            return
        Lab:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.C0089e.l(java.lang.Throwable, int):void");
    }

    public final void m(Throwable th, boolean z6) {
        if ((th instanceof NotProvisionedException) || N5.l.I(th)) {
            this.f1473c.F(this);
        } else {
            l(th, z6 ? 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            r4 = this;
            boolean r0 = r4.k()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            D2.w r0 = r4.f1472b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.K()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f1489u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            D2.w r2 = r4.f1472b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            B2.p r3 = r4.f1479j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.G(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            D2.w r0 = r4.f1472b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.f1489u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            z2.a r0 = r0.D(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.f1487s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.f1483o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            w2.d r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.f18835o     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.f18837q     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            D2.n r3 = (D2.n) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.f1489u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = N5.l.I(r0)
            if (r2 == 0) goto L59
            V.o r0 = r4.f1473c
            r0.F(r4)
            goto L62
        L59:
            r4.l(r0, r1)
            goto L62
        L5d:
            V.o r0 = r4.f1473c
            r0.F(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.C0089e.n():boolean");
    }

    public final void o(int i7, boolean z6, byte[] bArr) {
        try {
            u uVarX = this.f1472b.x(bArr, this.f1471a, i7, this.f1477g);
            this.f1491w = uVarX;
            HandlerC0085a handlerC0085a = this.f1486r;
            int i8 = w2.t.f18881a;
            uVarX.getClass();
            handlerC0085a.getClass();
            handlerC0085a.obtainMessage(2, new C0086b(H2.r.f3226a.getAndIncrement(), z6, SystemClock.elapsedRealtime(), uVarX)).sendToTarget();
        } catch (Exception | NoSuchMethodError e7) {
            m(e7, true);
        }
    }

    public final void p() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f1481m;
        if (threadCurrentThread != looper.getThread()) {
            AbstractC1697a.x("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
