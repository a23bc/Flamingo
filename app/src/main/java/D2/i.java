package D2;

import A2.RunnableC0022x;
import A2.x0;
import E4.G;
import E4.I;
import E4.M;
import E4.b0;
import E4.p0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import t2.AbstractC1479h;
import t2.C1483l;
import t2.C1484m;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements q {

    /* JADX INFO: renamed from: A */
    public final Set f1498A;

    /* JADX INFO: renamed from: B */
    public final Set f1499B;

    /* JADX INFO: renamed from: C */
    public int f1500C;

    /* JADX INFO: renamed from: D */
    public w f1501D;

    /* JADX INFO: renamed from: E */
    public C0089e f1502E;

    /* JADX INFO: renamed from: F */
    public C0089e f1503F;

    /* JADX INFO: renamed from: G */
    public Looper f1504G;

    /* JADX INFO: renamed from: H */
    public Handler f1505H;

    /* JADX INFO: renamed from: I */
    public byte[] f1506I;

    /* JADX INFO: renamed from: J */
    public B2.p f1507J;

    /* JADX INFO: renamed from: K */
    public volatile HandlerC0087c f1508K;

    /* JADX INFO: renamed from: o */
    public final UUID f1509o;

    /* JADX INFO: renamed from: p */
    public final B2.g f1510p;

    /* JADX INFO: renamed from: q */
    public final B f1511q;

    /* JADX INFO: renamed from: r */
    public final HashMap f1512r;

    /* JADX INFO: renamed from: s */
    public final boolean f1513s;

    /* JADX INFO: renamed from: t */
    public final int[] f1514t;

    /* JADX INFO: renamed from: u */
    public final boolean f1515u;

    /* JADX INFO: renamed from: v */
    public final V.o f1516v;

    /* JADX INFO: renamed from: w */
    public final x0 f1517w;

    /* JADX INFO: renamed from: x */
    public final f f1518x;

    /* JADX INFO: renamed from: y */
    public final long f1519y;

    /* JADX INFO: renamed from: z */
    public final ArrayList f1520z;

    public i(UUID uuid, B b7, HashMap map, boolean z6, int[] iArr, boolean z7, x0 x0Var) {
        B2.g gVar = A.f1454r;
        uuid.getClass();
        AbstractC1697a.c("Use C.CLEARKEY_UUID instead", !AbstractC1479h.f16468b.equals(uuid));
        this.f1509o = uuid;
        this.f1510p = gVar;
        this.f1511q = b7;
        this.f1512r = map;
        this.f1513s = z6;
        this.f1514t = iArr;
        this.f1515u = z7;
        this.f1517w = x0Var;
        this.f1516v = new V.o(9, (byte) 0);
        this.f1518x = new f(this);
        this.f1520z = new ArrayList();
        this.f1498A = Collections.newSetFromMap(new IdentityHashMap());
        this.f1499B = Collections.newSetFromMap(new IdentityHashMap());
        this.f1519y = 300000L;
    }

    public static boolean e(C0089e c0089e) {
        c0089e.p();
        if (c0089e.f1483o != 1) {
            return false;
        }
        j jVarG = c0089e.g();
        jVarG.getClass();
        Throwable cause = jVarG.getCause();
        return (cause instanceof ResourceBusyException) || N5.l.J(cause);
    }

    public static ArrayList h(C1484m c1484m, UUID uuid, boolean z6) {
        ArrayList arrayList = new ArrayList(c1484m.f16525r);
        for (int i7 = 0; i7 < c1484m.f16525r; i7++) {
            C1483l c1483l = c1484m.f16522o[i7];
            if ((c1483l.a(uuid) || (AbstractC1479h.f16469c.equals(uuid) && c1483l.a(AbstractC1479h.f16468b))) && (c1483l.f16514s != null || z6)) {
                arrayList.add(c1483l);
            }
        }
        return arrayList;
    }

    @Override // D2.q, D2.w
    public final void a() {
        j(true);
        int i7 = this.f1500C - 1;
        this.f1500C = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f1519y != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f1520z);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((C0089e) arrayList.get(i8)).c(null);
            }
        }
        p0 it = M.p(this.f1498A).iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
        i();
    }

    @Override // D2.q
    public final void b() {
        w x0Var;
        j(true);
        int i7 = this.f1500C;
        this.f1500C = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.f1501D == null) {
            UUID uuid = this.f1509o;
            this.f1510p.getClass();
            try {
                try {
                    x0Var = new A(uuid);
                } catch (UnsupportedSchemeException e7) {
                    throw new E(e7);
                } catch (Exception e8) {
                    throw new E(e8);
                }
            } catch (E unused) {
                AbstractC1697a.m("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                x0Var = new x0(7);
            }
            this.f1501D = x0Var;
            x0Var.L(new f(this));
            return;
        }
        if (this.f1519y == -9223372036854775807L) {
            return;
        }
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f1520z;
            if (i8 >= arrayList.size()) {
                return;
            }
            ((C0089e) arrayList.get(i8)).e(null);
            i8++;
        }
    }

    @Override // D2.q
    public final int c(C1487p c1487p) {
        j(false);
        w wVar = this.f1501D;
        wVar.getClass();
        int iY = wVar.y();
        C1484m c1484m = c1487p.f16705q;
        if (c1484m == null) {
            int iE = t2.M.e(c1487p.f16701m);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f1514t;
                if (i7 >= iArr.length) {
                    i7 = -1;
                    break;
                }
                if (iArr[i7] == iE) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return 0;
            }
        } else if (this.f1506I == null) {
            UUID uuid = this.f1509o;
            if (h(c1484m, uuid, true).isEmpty()) {
                if (c1484m.f16525r == 1 && c1484m.f16522o[0].a(AbstractC1479h.f16468b)) {
                    AbstractC1697a.w("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c1484m.f16524q;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : w2.t.f18881a < 25)) {
                return 1;
            }
        }
        return iY;
    }

    public final k d(Looper looper, n nVar, C1487p c1487p, boolean z6) {
        ArrayList arrayListH;
        if (this.f1508K == null) {
            this.f1508K = new HandlerC0087c(this, looper, 1);
        }
        C1484m c1484m = c1487p.f16705q;
        int i7 = 0;
        C0089e c0089e = null;
        if (c1484m == null) {
            int iE = t2.M.e(c1487p.f16701m);
            w wVar = this.f1501D;
            wVar.getClass();
            if (wVar.y() != 2 || !x.f1537c) {
                int[] iArr = this.f1514t;
                while (true) {
                    if (i7 >= iArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (iArr[i7] == iE) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1 && wVar.y() != 1) {
                    C0089e c0089e2 = this.f1502E;
                    if (c0089e2 == null) {
                        G g6 = I.f1870p;
                        C0089e c0089eG = g(b0.f1913s, true, null, z6);
                        this.f1520z.add(c0089eG);
                        this.f1502E = c0089eG;
                    } else {
                        c0089e2.e(null);
                    }
                    return this.f1502E;
                }
            }
            return null;
        }
        if (this.f1506I == null) {
            arrayListH = h(c1484m, this.f1509o, false);
            if (arrayListH.isEmpty()) {
                g gVar = new g("Media does not support uuid: " + this.f1509o);
                AbstractC1697a.n("DRM error", gVar);
                nVar.d(gVar);
                return new t(new j(gVar, 6003));
            }
        } else {
            arrayListH = null;
        }
        if (this.f1513s) {
            Iterator it = this.f1520z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0089e c0089e3 = (C0089e) it.next();
                if (w2.t.a(c0089e3.f1471a, arrayListH)) {
                    c0089e = c0089e3;
                    break;
                }
            }
        } else {
            c0089e = this.f1503F;
        }
        if (c0089e != null) {
            c0089e.e(nVar);
            return c0089e;
        }
        C0089e c0089eG2 = g(arrayListH, false, nVar, z6);
        if (!this.f1513s) {
            this.f1503F = c0089eG2;
        }
        this.f1520z.add(c0089eG2);
        return c0089eG2;
    }

    public final C0089e f(List list, boolean z6, n nVar) {
        this.f1501D.getClass();
        boolean z7 = this.f1515u | z6;
        w wVar = this.f1501D;
        byte[] bArr = this.f1506I;
        Looper looper = this.f1504G;
        looper.getClass();
        B2.p pVar = this.f1507J;
        pVar.getClass();
        C0089e c0089e = new C0089e(this.f1509o, wVar, this.f1516v, this.f1518x, list, z7, z6, bArr, this.f1512r, this.f1511q, looper, this.f1517w, pVar);
        c0089e.e(nVar);
        if (this.f1519y != -9223372036854775807L) {
            c0089e.e(null);
        }
        return c0089e;
    }

    public final C0089e g(List list, boolean z6, n nVar, boolean z7) {
        C0089e c0089eF = f(list, z6, nVar);
        boolean zE = e(c0089eF);
        long j3 = this.f1519y;
        Set set = this.f1499B;
        if (zE && !set.isEmpty()) {
            p0 it = M.p(set).iterator();
            while (it.hasNext()) {
                ((k) it.next()).c(null);
            }
            c0089eF.c(nVar);
            if (j3 != -9223372036854775807L) {
                c0089eF.c(null);
            }
            c0089eF = f(list, z6, nVar);
        }
        if (e(c0089eF) && z7) {
            Set set2 = this.f1498A;
            if (!set2.isEmpty()) {
                p0 it2 = M.p(set2).iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).a();
                }
                if (!set.isEmpty()) {
                    p0 it3 = M.p(set).iterator();
                    while (it3.hasNext()) {
                        ((k) it3.next()).c(null);
                    }
                }
                c0089eF.c(nVar);
                if (j3 != -9223372036854775807L) {
                    c0089eF.c(null);
                }
                return f(list, z6, nVar);
            }
        }
        return c0089eF;
    }

    public final void i() {
        if (this.f1501D != null && this.f1500C == 0 && this.f1520z.isEmpty() && this.f1498A.isEmpty()) {
            w wVar = this.f1501D;
            wVar.getClass();
            wVar.a();
            this.f1501D = null;
        }
    }

    public final void j(boolean z6) {
        if (z6 && this.f1504G == null) {
            AbstractC1697a.x("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f1504G;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC1697a.x("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f1504G.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // D2.q
    public final k m(n nVar, C1487p c1487p) {
        j(false);
        AbstractC1697a.i(this.f1500C > 0);
        AbstractC1697a.j(this.f1504G);
        return d(this.f1504G, nVar, c1487p, true);
    }

    @Override // D2.q
    public final p t(n nVar, C1487p c1487p) {
        AbstractC1697a.i(this.f1500C > 0);
        AbstractC1697a.j(this.f1504G);
        h hVar = new h(this, nVar);
        Handler handler = this.f1505H;
        handler.getClass();
        handler.post(new RunnableC0022x(hVar, 4, c1487p));
        return hVar;
    }

    @Override // D2.q
    public final void z(Looper looper, B2.p pVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f1504G;
                if (looper2 == null) {
                    this.f1504G = looper;
                    this.f1505H = new Handler(looper);
                } else {
                    AbstractC1697a.i(looper2 == looper);
                    this.f1505H.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1507J = pVar;
    }
}
