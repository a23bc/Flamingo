package A2;

import H2.AbstractC0184a;
import H2.InterfaceC0208z;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.C0535h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import t2.C1476e;
import t2.C1482k;
import t2.C1485n;
import v2.C1636c;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class N extends H.P {

    /* JADX INFO: renamed from: A */
    public final L f89A;

    /* JADX INFO: renamed from: B */
    public final C0001b f90B;

    /* JADX INFO: renamed from: C */
    public final C0005f f91C;

    /* JADX INFO: renamed from: D */
    public final x0 f92D;

    /* JADX INFO: renamed from: E */
    public final x0 f93E;

    /* JADX INFO: renamed from: F */
    public final long f94F;

    /* JADX INFO: renamed from: G */
    public int f95G;

    /* JADX INFO: renamed from: H */
    public boolean f96H;

    /* JADX INFO: renamed from: I */
    public int f97I;

    /* JADX INFO: renamed from: J */
    public int f98J;

    /* JADX INFO: renamed from: K */
    public boolean f99K;

    /* JADX INFO: renamed from: L */
    public H2.Y f100L;

    /* JADX INFO: renamed from: M */
    public t2.T f101M;

    /* JADX INFO: renamed from: N */
    public t2.J f102N;

    /* JADX INFO: renamed from: O */
    public t2.J f103O;

    /* JADX INFO: renamed from: P */
    public AudioTrack f104P;

    /* JADX INFO: renamed from: Q */
    public Surface f105Q;

    /* JADX INFO: renamed from: R */
    public Surface f106R;

    /* JADX INFO: renamed from: S */
    public final int f107S;

    /* JADX INFO: renamed from: T */
    public w2.n f108T;

    /* JADX INFO: renamed from: U */
    public final int f109U;

    /* JADX INFO: renamed from: V */
    public C1476e f110V;

    /* JADX INFO: renamed from: W */
    public float f111W;

    /* JADX INFO: renamed from: X */
    public boolean f112X;

    /* JADX INFO: renamed from: Y */
    public C1636c f113Y;
    public final boolean Z;
    public boolean a0;
    public final int b0;

    /* JADX INFO: renamed from: c */
    public final J2.t f114c;

    /* JADX INFO: renamed from: c0 */
    public boolean f115c0;

    /* JADX INFO: renamed from: d */
    public final t2.T f116d;

    /* JADX INFO: renamed from: d0 */
    public final C1482k f117d0;

    /* JADX INFO: renamed from: e */
    public final N2.K f118e;

    /* JADX INFO: renamed from: e0 */
    public t2.s0 f119e0;

    /* JADX INFO: renamed from: f */
    public final Context f120f;

    /* JADX INFO: renamed from: f0 */
    public t2.J f121f0;

    /* JADX INFO: renamed from: g */
    public final N f122g;

    /* JADX INFO: renamed from: g0 */
    public o0 f123g0;
    public final AbstractC0006g[] h;

    /* JADX INFO: renamed from: h0 */
    public int f124h0;

    /* JADX INFO: renamed from: i */
    public final J2.s f125i;

    /* JADX INFO: renamed from: i0 */
    public long f126i0;

    /* JADX INFO: renamed from: j */
    public final w2.q f127j;

    /* JADX INFO: renamed from: k */
    public final C0024z f128k;
    public final V l;

    /* JADX INFO: renamed from: m */
    public final w2.j f129m;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet f130n;

    /* JADX INFO: renamed from: o */
    public final t2.e0 f131o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f132p;

    /* JADX INFO: renamed from: q */
    public final boolean f133q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0208z f134r;

    /* JADX INFO: renamed from: s */
    public final B2.i f135s;

    /* JADX INFO: renamed from: t */
    public final Looper f136t;

    /* JADX INFO: renamed from: u */
    public final K2.d f137u;

    /* JADX INFO: renamed from: v */
    public final long f138v;

    /* JADX INFO: renamed from: w */
    public final long f139w;

    /* JADX INFO: renamed from: x */
    public final long f140x;

    /* JADX INFO: renamed from: y */
    public final w2.o f141y;

    /* JADX INFO: renamed from: z */
    public final K f142z;

    static {
        t2.H.a("media3.exoplayer");
    }

    public N(C0017s c0017s) {
        C1476e c1476e;
        super(3);
        this.f118e = new N2.K();
        try {
            AbstractC1697a.q("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "]");
            YosPlaybackService yosPlaybackService = c0017s.f419a;
            Context applicationContext = yosPlaybackService.getApplicationContext();
            this.f120f = applicationContext;
            w2.o oVar = c0017s.f420b;
            B2.i iVar = new B2.i(oVar);
            this.f135s = iVar;
            this.b0 = c0017s.h;
            this.f110V = c0017s.f426i;
            this.f107S = c0017s.l;
            this.f112X = false;
            this.f94F = c0017s.f436t;
            K k7 = new K(this);
            this.f142z = k7;
            this.f89A = new L();
            Handler handler = new Handler(c0017s.f425g);
            AbstractC0006g[] abstractC0006gArrA = ((f6.b) c0017s.f421c.f387p).a(handler, k7, k7, k7, k7);
            this.h = abstractC0006gArrA;
            AbstractC1697a.i(abstractC0006gArrA.length > 0);
            J2.s sVar = (J2.s) c0017s.f423e.get();
            this.f125i = sVar;
            this.f134r = (InterfaceC0208z) c0017s.f422d.get();
            K2.d dVar = (K2.d) c0017s.f424f.get();
            this.f137u = dVar;
            this.f133q = c0017s.f429m;
            v0 v0Var = c0017s.f430n;
            this.f138v = c0017s.f431o;
            this.f139w = c0017s.f432p;
            this.f140x = c0017s.f433q;
            Looper looper = c0017s.f425g;
            this.f136t = looper;
            this.f141y = oVar;
            this.f122g = this;
            this.f129m = new w2.j(looper, oVar, new C0024z(this, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f130n = copyOnWriteArraySet;
            this.f132p = new ArrayList();
            this.f100L = new H2.Y();
            boolean z6 = true;
            J2.t tVar = new J2.t(new u0[abstractC0006gArrA.length], new J2.q[abstractC0006gArrA.length], t2.p0.f16715b, null);
            this.f114c = tVar;
            this.f131o = new t2.e0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7;
                int i9 = iArr[i8];
                AbstractC1697a.i(!false);
                AbstractC0006g[] abstractC0006gArr = abstractC0006gArrA;
                boolean z7 = z6;
                sparseBooleanArray.append(i9, z7);
                i7 = i8 + 1;
                z6 = z7;
                abstractC0006gArrA = abstractC0006gArr;
            }
            AbstractC0006g[] abstractC0006gArr2 = abstractC0006gArrA;
            AbstractC1697a.i(!false);
            sparseBooleanArray.append(29, z6);
            AbstractC1697a.i(!false);
            C1485n c1485n = new C1485n(sparseBooleanArray);
            this.f116d = new t2.T(c1485n);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i10 = 0; i10 < c1485n.f16552a.size(); i10++) {
                int iB = c1485n.b(i10);
                AbstractC1697a.i(!false);
                sparseBooleanArray2.append(iB, true);
            }
            AbstractC1697a.i(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1697a.i(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1697a.i(!false);
            this.f101M = new t2.T(new C1485n(sparseBooleanArray2));
            this.f127j = oVar.a(looper, null);
            C0024z c0024z = new C0024z(this, 3);
            this.f128k = c0024z;
            this.f123g0 = o0.i(tVar);
            iVar.a0(this, looper);
            int i11 = w2.t.f18881a;
            String str = c0017s.f439w;
            this.l = new V(abstractC0006gArr2, sVar, tVar, new C0011l(), dVar, this.f95G, this.f96H, iVar, v0Var, c0017s.f434r, c0017s.f435s, looper, oVar, c0024z, i11 < 31 ? new B2.p(str) : H.a(applicationContext, this, c0017s.f437u, str));
            this.f111W = 1.0f;
            this.f95G = 0;
            t2.J j3 = t2.J.f16263J;
            this.f102N = j3;
            this.f103O = j3;
            this.f121f0 = j3;
            this.f124h0 = -1;
            if (i11 < 21) {
                AudioTrack audioTrack = this.f104P;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    c1476e = null;
                } else {
                    this.f104P.release();
                    c1476e = null;
                    this.f104P = null;
                }
                if (this.f104P == null) {
                    this.f104P = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f109U = this.f104P.getAudioSessionId();
            } else {
                c1476e = null;
                AudioManager audioManager = (AudioManager) this.f120f.getSystemService("audio");
                this.f109U = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f113Y = C1636c.f18271c;
            this.Z = true;
            A(this.f135s);
            Handler handler2 = new Handler(looper);
            B2.i iVar2 = this.f135s;
            K2.g gVar = (K2.g) dVar;
            gVar.getClass();
            iVar2.getClass();
            A.b bVar = gVar.f4010b;
            bVar.getClass();
            CopyOnWriteArrayList<K2.c> copyOnWriteArrayList = (CopyOnWriteArrayList) bVar.f3p;
            for (K2.c cVar : copyOnWriteArrayList) {
                if (cVar.f3993b == iVar2) {
                    cVar.f3994c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new K2.c(handler2, iVar2));
            copyOnWriteArraySet.add(this.f142z);
            C0001b c0001b = new C0001b(yosPlaybackService, handler, this.f142z);
            this.f90B = c0001b;
            c0001b.i(c0017s.f428k);
            C0005f c0005f = new C0005f(yosPlaybackService, handler, this.f142z);
            this.f91C = c0005f;
            c0005f.b(c0017s.f427j ? this.f110V : c1476e);
            x0 x0Var = new x0(0);
            yosPlaybackService.getApplicationContext();
            this.f92D = x0Var;
            this.f93E = new x0(yosPlaybackService);
            C0535h c0535h = new C0535h(0);
            c0535h.f9480c = 0;
            c0535h.f9481d = 0;
            this.f117d0 = c0535h.b();
            this.f119e0 = t2.s0.f16725e;
            this.f108T = w2.n.f18870c;
            this.f125i.b(this.f110V);
            p1(1, 10, Integer.valueOf(this.f109U));
            p1(2, 10, Integer.valueOf(this.f109U));
            p1(1, 3, this.f110V);
            p1(2, 4, Integer.valueOf(this.f107S));
            p1(2, 5, 0);
            p1(1, 9, Boolean.valueOf(this.f112X));
            p1(2, 7, this.f89A);
            p1(6, 8, this.f89A);
            p1(-1, 16, Integer.valueOf(this.b0));
            this.f118e.e();
        } catch (Throwable th) {
            this.f118e.e();
            throw th;
        }
    }

    public static long j1(o0 o0Var) {
        t2.g0 g0Var = new t2.g0();
        t2.e0 e0Var = new t2.e0();
        o0Var.f389a.g(o0Var.f390b.f2973a, e0Var);
        long j3 = o0Var.f391c;
        if (j3 != -9223372036854775807L) {
            return e0Var.f16430e + j3;
        }
        return o0Var.f389a.m(e0Var.f16428c, g0Var, 0L).f16463k;
    }

    @Override // H.P, t2.X
    public final void A(t2.V v3) {
        v3.getClass();
        this.f129m.a(v3);
    }

    @Override // H.P, t2.X
    public final void A0(float f7) {
        x1();
        float f8 = w2.t.f(f7, 0.0f, 1.0f);
        if (this.f111W == f8) {
            return;
        }
        this.f111W = f8;
        p1(1, 2, Float.valueOf(this.f91C.f274g * f8));
        this.f129m.f(22, new C0023y(0, f8));
    }

    @Override // H.P, t2.X
    public final long B() {
        x1();
        if (!r()) {
            return t0();
        }
        o0 o0Var = this.f123g0;
        return o0Var.f398k.equals(o0Var.f390b) ? w2.t.N(this.f123g0.f403q) : l0();
    }

    @Override // H.P, t2.X
    public final t2.J B0() {
        x1();
        return this.f102N;
    }

    @Override // H.P, t2.X
    public final boolean C() {
        x1();
        return this.f123g0.l;
    }

    @Override // H.P, t2.X
    public final void C0(List list) {
        x1();
        ArrayList arrayListE1 = e1(list);
        x1();
        q1(arrayListE1, -1, -9223372036854775807L, true);
    }

    @Override // H.P, t2.X
    public final void E(boolean z6) {
        x1();
        if (this.f96H != z6) {
            this.f96H = z6;
            w2.q qVar = this.l.f204v;
            qVar.getClass();
            w2.p pVarB = w2.q.b();
            pVarB.f18874a = qVar.f18876a.obtainMessage(12, z6 ? 1 : 0, 0);
            pVarB.b();
            B b7 = new B(0, z6);
            w2.j jVar = this.f129m;
            jVar.c(9, b7);
            t1();
            jVar.b();
        }
    }

    @Override // H.P, t2.X
    public final long F0() {
        x1();
        return w2.t.N(g1(this.f123g0));
    }

    @Override // H.P, t2.X
    public final void G(int i7) {
        x1();
    }

    @Override // H.P, t2.X
    public final long G0() {
        x1();
        return this.f138v;
    }

    @Override // H.P, t2.X
    public final t2.p0 H() {
        x1();
        return this.f123g0.f396i.f3736d;
    }

    @Override // H.P, t2.X
    public final long J() {
        x1();
        return this.f140x;
    }

    @Override // H.P, t2.X
    public final void J0(t2.V v3) {
        x1();
        this.f129m.e(v3);
    }

    @Override // H.P, t2.X
    public final t2.J K() {
        x1();
        return this.f103O;
    }

    @Override // H.P, t2.X
    public final Looper M0() {
        return this.f136t;
    }

    @Override // H.P, t2.X
    public final int N() {
        x1();
        if (this.f123g0.f389a.p()) {
            return 0;
        }
        o0 o0Var = this.f123g0;
        return o0Var.f389a.b(o0Var.f390b.f2973a);
    }

    @Override // H.P, t2.X
    public final C1636c O() {
        x1();
        return this.f113Y;
    }

    @Override // H.P, t2.X
    public final t2.s0 P() {
        x1();
        return this.f119e0;
    }

    @Override // H.P, t2.X
    public final float R() {
        x1();
        return this.f111W;
    }

    @Override // H.P, t2.X
    public final C1476e T() {
        x1();
        return this.f110V;
    }

    @Override // H.P, t2.X
    public final int U() {
        x1();
        if (r()) {
            return this.f123g0.f390b.f2974b;
        }
        return -1;
    }

    @Override // H.P, t2.X
    public final int V() {
        x1();
        int iH1 = h1(this.f123g0);
        if (iH1 == -1) {
            return 0;
        }
        return iH1;
    }

    @Override // H.P, t2.X
    public final void W(int i7, boolean z6) {
        x1();
    }

    @Override // H.P, t2.X
    public final C1482k X() {
        x1();
        return this.f117d0;
    }

    @Override // H.P, t2.X
    public final void Y() {
        x1();
    }

    @Override // H.P
    public final void Y0(int i7, long j3, boolean z6) {
        x1();
        if (i7 == -1) {
            return;
        }
        AbstractC1697a.d(i7 >= 0);
        t2.h0 h0Var = this.f123g0.f389a;
        if (h0Var.p() || i7 < h0Var.o()) {
            B2.i iVar = this.f135s;
            if (!iVar.f763w) {
                B2.a aVarA = iVar.a();
                iVar.f763w = true;
                iVar.Z(aVarA, -1, new B2.d(1));
            }
            this.f97I++;
            if (r()) {
                AbstractC1697a.w("seekTo ignored because an ad is playing");
                S s7 = new S(this.f123g0);
                s7.c(1);
                N n7 = this.f128k.f476p;
                n7.f127j.c(new RunnableC0022x(n7, 0, s7));
                return;
            }
            o0 o0VarG = this.f123g0;
            int i8 = o0VarG.f393e;
            if (i8 == 3 || (i8 == 4 && !h0Var.p())) {
                o0VarG = this.f123g0.g(2);
            }
            int iV = V();
            o0 o0VarK1 = k1(o0VarG, h0Var, l1(h0Var, i7, j3));
            this.l.f204v.a(3, new U(h0Var, i7, w2.t.D(j3))).b();
            v1(o0VarK1, 0, true, 1, g1(o0VarK1), iV, z6);
        }
    }

    @Override // H.P, t2.X
    public final void Z(t2.n0 n0Var) {
        x1();
        J2.s sVar = this.f125i;
        sVar.getClass();
        J2.o oVar = (J2.o) sVar;
        if (n0Var.equals(oVar.e())) {
            return;
        }
        if (n0Var instanceof J2.i) {
            oVar.k((J2.i) n0Var);
        }
        J2.h hVar = new J2.h(oVar.e());
        hVar.d(n0Var);
        oVar.k(new J2.i(hVar));
        this.f129m.f(19, new D(n0Var, 0));
    }

    @Override // H.P, t2.X
    public final void a() {
        boolean z6;
        AudioTrack audioTrack;
        AbstractC1697a.q("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0] [" + w2.t.f18885e + "] [" + t2.H.b() + "]");
        x1();
        if (w2.t.f18881a < 21 && (audioTrack = this.f104P) != null) {
            audioTrack.release();
            this.f104P = null;
        }
        this.f90B.i(false);
        this.f92D.getClass();
        this.f93E.getClass();
        C0005f c0005f = this.f91C;
        c0005f.f270c = null;
        c0005f.a();
        c0005f.c(0);
        V v3 = this.l;
        synchronized (v3) {
            if (v3.f180N || !v3.f206x.getThread().isAlive()) {
                z6 = true;
            } else {
                v3.f204v.e(7);
                v3.j0(new C0014o(1, v3), v3.f175I);
                z6 = v3.f180N;
            }
        }
        if (!z6) {
            this.f129m.f(10, new r(1));
        }
        this.f129m.d();
        this.f127j.f18876a.removeCallbacksAndMessages(null);
        K2.d dVar = this.f137u;
        B2.i iVar = this.f135s;
        CopyOnWriteArrayList<K2.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((K2.g) dVar).f4010b.f3p;
        for (K2.c cVar : copyOnWriteArrayList) {
            if (cVar.f3993b == iVar) {
                cVar.f3994c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        o0 o0Var = this.f123g0;
        if (o0Var.f402p) {
            this.f123g0 = o0Var.a();
        }
        o0 o0VarG = this.f123g0.g(1);
        this.f123g0 = o0VarG;
        o0 o0VarB = o0VarG.b(o0VarG.f390b);
        this.f123g0 = o0VarB;
        o0VarB.f403q = o0VarB.f405s;
        this.f123g0.f404r = 0L;
        B2.i iVar2 = this.f135s;
        w2.q qVar = iVar2.f762v;
        AbstractC1697a.j(qVar);
        qVar.c(new B2.e(0, iVar2));
        this.f125i.a();
        Surface surface = this.f106R;
        if (surface != null) {
            surface.release();
            this.f106R = null;
        }
        this.f113Y = C1636c.f18271c;
        this.f115c0 = true;
    }

    @Override // H.P, t2.X
    public final void a0(C1476e c1476e, boolean z6) {
        x1();
        if (this.f115c0) {
            return;
        }
        boolean zA = w2.t.a(this.f110V, c1476e);
        w2.j jVar = this.f129m;
        if (!zA) {
            this.f110V = c1476e;
            p1(1, 3, c1476e);
            jVar.c(20, new C(c1476e, 0));
        }
        C1476e c1476e2 = z6 ? c1476e : null;
        C0005f c0005f = this.f91C;
        c0005f.b(c1476e2);
        this.f125i.b(c1476e);
        boolean zC = C();
        int iD = c0005f.d(d(), zC);
        u1(iD, iD == -1 ? 2 : 1, zC);
        jVar.b();
    }

    @Override // H.P, t2.X
    public final void b() {
        x1();
        boolean zC = C();
        int iD = this.f91C.d(2, zC);
        u1(iD, iD == -1 ? 2 : 1, zC);
        o0 o0Var = this.f123g0;
        if (o0Var.f393e != 1) {
            return;
        }
        o0 o0VarE = o0Var.e(null);
        o0 o0VarG = o0VarE.g(o0VarE.f389a.p() ? 4 : 2);
        this.f97I++;
        w2.q qVar = this.l.f204v;
        qVar.getClass();
        w2.p pVarB = w2.q.b();
        pVarB.f18874a = qVar.f18876a.obtainMessage(29);
        pVarB.b();
        v1(o0VarG, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // H.P, t2.X
    public final void b0(int i7, int i8) {
        x1();
    }

    public final ArrayList b1(int i7, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            m0 m0Var = new m0((AbstractC0184a) arrayList.get(i8), this.f133q);
            arrayList2.add(m0Var);
            this.f132p.add(i8 + i7, new M(m0Var.f359b, m0Var.f358a));
        }
        this.f100L = this.f100L.a(i7, arrayList2.size());
        return arrayList2;
    }

    @Override // H.P, t2.X
    public final boolean c() {
        x1();
        return this.f123g0.f395g;
    }

    @Override // H.P, t2.X
    public final void c0(boolean z6) {
        x1();
    }

    public final o0 c1(o0 o0Var, int i7, ArrayList arrayList) {
        t2.h0 h0Var = o0Var.f389a;
        this.f97I++;
        ArrayList arrayListB1 = b1(i7, arrayList);
        t0 t0Var = new t0(this.f132p, this.f100L);
        o0 o0VarK1 = k1(o0Var, t0Var, i1(h0Var, t0Var, h1(o0Var), f1(o0Var)));
        H2.Y y6 = this.f100L;
        w2.q qVar = this.l.f204v;
        P p7 = new P(arrayListB1, y6, -1, -9223372036854775807L);
        qVar.getClass();
        w2.p pVarB = w2.q.b();
        pVarB.f18874a = qVar.f18876a.obtainMessage(18, i7, 0, p7);
        pVarB.b();
        return o0VarK1;
    }

    @Override // H.P, t2.X
    public final int d() {
        x1();
        return this.f123g0.f393e;
    }

    @Override // H.P, t2.X
    public final void d0(int i7) {
        x1();
    }

    public final t2.J d1() {
        t2.h0 h0VarM0 = m0();
        if (h0VarM0.p()) {
            return this.f121f0;
        }
        t2.G g6 = h0VarM0.m(V(), (t2.g0) this.f2813b, 0L).f16456c;
        t2.I iA = this.f121f0.a();
        t2.J j3 = g6.f16226d;
        if (j3 != null) {
            CharSequence charSequence = j3.f16304a;
            if (charSequence != null) {
                iA.f16239a = charSequence;
            }
            CharSequence charSequence2 = j3.f16305b;
            if (charSequence2 != null) {
                iA.f16240b = charSequence2;
            }
            CharSequence charSequence3 = j3.f16306c;
            if (charSequence3 != null) {
                iA.f16241c = charSequence3;
            }
            CharSequence charSequence4 = j3.f16307d;
            if (charSequence4 != null) {
                iA.f16242d = charSequence4;
            }
            CharSequence charSequence5 = j3.f16308e;
            if (charSequence5 != null) {
                iA.f16243e = charSequence5;
            }
            CharSequence charSequence6 = j3.f16309f;
            if (charSequence6 != null) {
                iA.f16244f = charSequence6;
            }
            CharSequence charSequence7 = j3.f16310g;
            if (charSequence7 != null) {
                iA.f16245g = charSequence7;
            }
            Long l = j3.h;
            if (l != null) {
                iA.c(l);
            }
            t2.Y y6 = j3.f16311i;
            if (y6 != null) {
                iA.f16246i = y6;
            }
            t2.Y y7 = j3.f16312j;
            if (y7 != null) {
                iA.f16247j = y7;
            }
            byte[] bArr = j3.f16313k;
            Uri uri = j3.f16314m;
            if (uri != null || bArr != null) {
                iA.f16249m = uri;
                iA.b(bArr, j3.l);
            }
            Integer num = j3.f16315n;
            if (num != null) {
                iA.f16250n = num;
            }
            Integer num2 = j3.f16316o;
            if (num2 != null) {
                iA.f16251o = num2;
            }
            Integer num3 = j3.f16317p;
            if (num3 != null) {
                iA.f16252p = num3;
            }
            Boolean bool = j3.f16318q;
            if (bool != null) {
                iA.f16253q = bool;
            }
            Boolean bool2 = j3.f16319r;
            if (bool2 != null) {
                iA.f16254r = bool2;
            }
            Integer num4 = j3.f16320s;
            if (num4 != null) {
                iA.f16255s = num4;
            }
            Integer num5 = j3.f16321t;
            if (num5 != null) {
                iA.f16255s = num5;
            }
            Integer num6 = j3.f16322u;
            if (num6 != null) {
                iA.f16256t = num6;
            }
            Integer num7 = j3.f16323v;
            if (num7 != null) {
                iA.f16257u = num7;
            }
            Integer num8 = j3.f16324w;
            if (num8 != null) {
                iA.f16258v = num8;
            }
            Integer num9 = j3.f16325x;
            if (num9 != null) {
                iA.f16259w = num9;
            }
            Integer num10 = j3.f16326y;
            if (num10 != null) {
                iA.f16260x = num10;
            }
            CharSequence charSequence8 = j3.f16327z;
            if (charSequence8 != null) {
                iA.f16261y = charSequence8;
            }
            CharSequence charSequence9 = j3.f16295A;
            if (charSequence9 != null) {
                iA.f16262z = charSequence9;
            }
            CharSequence charSequence10 = j3.f16296B;
            if (charSequence10 != null) {
                iA.f16231A = charSequence10;
            }
            Integer num11 = j3.f16297C;
            if (num11 != null) {
                iA.f16232B = num11;
            }
            Integer num12 = j3.f16298D;
            if (num12 != null) {
                iA.f16233C = num12;
            }
            CharSequence charSequence11 = j3.f16299E;
            if (charSequence11 != null) {
                iA.f16234D = charSequence11;
            }
            CharSequence charSequence12 = j3.f16300F;
            if (charSequence12 != null) {
                iA.f16235E = charSequence12;
            }
            CharSequence charSequence13 = j3.f16301G;
            if (charSequence13 != null) {
                iA.f16236F = charSequence13;
            }
            Integer num13 = j3.f16302H;
            if (num13 != null) {
                iA.f16237G = num13;
            }
            Bundle bundle = j3.f16303I;
            if (bundle != null) {
                iA.f16238H = bundle;
            }
        }
        return new t2.J(iA);
    }

    @Override // H.P, t2.X
    public final int e0() {
        x1();
        if (r()) {
            return this.f123g0.f390b.f2975c;
        }
        return -1;
    }

    public final ArrayList e1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f134r.c((t2.G) list.get(i7)));
        }
        return arrayList;
    }

    @Override // H.P, t2.X
    public final void f(int i7) {
        x1();
        if (this.f95G != i7) {
            this.f95G = i7;
            w2.q qVar = this.l.f204v;
            qVar.getClass();
            w2.p pVarB = w2.q.b();
            pVarB.f18874a = qVar.f18876a.obtainMessage(11, i7, 0);
            pVarB.b();
            A a4 = new A(i7, 0);
            w2.j jVar = this.f129m;
            jVar.c(8, a4);
            t1();
            jVar.b();
        }
    }

    @Override // H.P, t2.X
    public final void f0(t2.J j3) {
        x1();
        if (j3.equals(this.f103O)) {
            return;
        }
        this.f103O = j3;
        this.f129m.f(15, new C0024z(this, 1));
    }

    public final long f1(o0 o0Var) {
        if (!o0Var.f390b.b()) {
            return w2.t.N(g1(o0Var));
        }
        Object obj = o0Var.f390b.f2973a;
        t2.h0 h0Var = o0Var.f389a;
        t2.e0 e0Var = this.f131o;
        h0Var.g(obj, e0Var);
        long j3 = o0Var.f391c;
        if (j3 == -9223372036854775807L) {
            return w2.t.N(h0Var.m(h1(o0Var), (t2.g0) this.f2813b, 0L).f16463k);
        }
        return w2.t.N(j3) + w2.t.N(e0Var.f16430e);
    }

    public final long g1(o0 o0Var) {
        if (o0Var.f389a.p()) {
            return w2.t.D(this.f126i0);
        }
        long j3 = o0Var.f402p ? o0Var.j() : o0Var.f405s;
        if (o0Var.f390b.b()) {
            return j3;
        }
        t2.h0 h0Var = o0Var.f389a;
        Object obj = o0Var.f390b.f2973a;
        t2.e0 e0Var = this.f131o;
        h0Var.g(obj, e0Var);
        return j3 + e0Var.f16430e;
    }

    @Override // H.P, t2.X
    public final void h(t2.Q q7) {
        x1();
        if (this.f123g0.f401o.equals(q7)) {
            return;
        }
        o0 o0VarF = this.f123g0.f(q7);
        this.f97I++;
        this.l.f204v.a(4, q7).b();
        v1(o0VarF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // H.P, t2.X
    public final void h0(int i7, int i8, int i9) {
        x1();
        AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i9 >= 0);
        ArrayList arrayList = this.f132p;
        int size = arrayList.size();
        int iMin = Math.min(i8, size);
        int iMin2 = Math.min(i9, size - (iMin - i7));
        if (i7 >= size || i7 == iMin || i7 == iMin2) {
            return;
        }
        t2.h0 h0VarM0 = m0();
        this.f97I++;
        w2.t.C(arrayList, i7, iMin, iMin2);
        t0 t0Var = new t0(arrayList, this.f100L);
        o0 o0Var = this.f123g0;
        o0 o0VarK1 = k1(o0Var, t0Var, i1(h0VarM0, t0Var, h1(o0Var), f1(this.f123g0)));
        H2.Y y6 = this.f100L;
        V v3 = this.l;
        v3.getClass();
        v3.f204v.a(19, new Q(i7, iMin, iMin2, y6)).b();
        v1(o0VarK1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final int h1(o0 o0Var) {
        if (o0Var.f389a.p()) {
            return this.f124h0;
        }
        return o0Var.f389a.g(o0Var.f390b.f2973a, this.f131o).f16428c;
    }

    @Override // H.P, t2.X
    public final int i() {
        x1();
        return this.f95G;
    }

    @Override // H.P, t2.X
    public final int i0() {
        x1();
        return this.f123g0.f400n;
    }

    public final Pair i1(t2.h0 h0Var, t0 t0Var, int i7, long j3) {
        if (h0Var.p() || t0Var.p()) {
            boolean z6 = !h0Var.p() && t0Var.p();
            return l1(t0Var, z6 ? -1 : i7, z6 ? -9223372036854775807L : j3);
        }
        Pair pairI = h0Var.i((t2.g0) this.f2813b, this.f131o, i7, w2.t.D(j3));
        Object obj = pairI.first;
        if (t0Var.b(obj) != -1) {
            return pairI;
        }
        int iG = V.G((t2.g0) this.f2813b, this.f131o, this.f95G, this.f96H, obj, h0Var, t0Var);
        if (iG == -1) {
            return l1(t0Var, -1, -9223372036854775807L);
        }
        t2.g0 g0Var = (t2.g0) this.f2813b;
        t0Var.m(iG, g0Var, 0L);
        return l1(t0Var, iG, w2.t.N(g0Var.f16463k));
    }

    @Override // H.P, t2.X
    public final t2.Q j() {
        x1();
        return this.f123g0.f401o;
    }

    @Override // H.P, t2.X
    public final void j0(int i7, int i8, List list) {
        x1();
        AbstractC1697a.d(i7 >= 0 && i8 >= i7);
        ArrayList arrayList = this.f132p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int iMin = Math.min(i8, size);
        if (iMin - i7 == list.size()) {
            for (int i9 = i7; i9 < iMin; i9++) {
                if (((M) arrayList.get(i9)).f87b.f3195k.a((t2.G) list.get(i9 - i7))) {
                }
            }
            this.f97I++;
            w2.q qVar = this.l.f204v;
            qVar.getClass();
            w2.p pVarB = w2.q.b();
            pVarB.f18874a = qVar.f18876a.obtainMessage(27, i7, iMin, list);
            pVarB.b();
            for (int i10 = i7; i10 < iMin; i10++) {
                M m7 = (M) arrayList.get(i10);
                m7.f88c = new s0(m7.f88c, (t2.G) list.get(i10 - i7));
            }
            v1(this.f123g0.h(new t0(arrayList, this.f100L)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList arrayListE1 = e1(list);
        if (!arrayList.isEmpty()) {
            o0 o0VarN1 = n1(c1(this.f123g0, iMin, arrayListE1), i7, iMin);
            v1(o0VarN1, 0, !o0VarN1.f390b.f2973a.equals(this.f123g0.f390b.f2973a), 4, g1(o0VarN1), -1, false);
        } else {
            boolean z6 = this.f124h0 == -1;
            x1();
            q1(arrayListE1, -1, -9223372036854775807L, z6);
        }
    }

    public final o0 k1(o0 o0Var, t2.h0 h0Var, Pair pair) {
        List list;
        AbstractC1697a.d(h0Var.p() || pair != null);
        t2.h0 h0Var2 = o0Var.f389a;
        long jF1 = f1(o0Var);
        o0 o0VarH = o0Var.h(h0Var);
        if (h0Var.p()) {
            H2.A a4 = o0.f388u;
            long jD = w2.t.D(this.f126i0);
            o0 o0VarB = o0VarH.c(a4, jD, jD, jD, 0L, H2.g0.f3185d, this.f114c, E4.b0.f1913s).b(a4);
            o0VarB.f403q = o0VarB.f405s;
            return o0VarB;
        }
        Object obj = o0VarH.f390b.f2973a;
        int i7 = w2.t.f18881a;
        boolean zEquals = obj.equals(pair.first);
        H2.A a7 = !zEquals ? new H2.A(pair.first) : o0VarH.f390b;
        long jLongValue = ((Long) pair.second).longValue();
        long jD2 = w2.t.D(jF1);
        if (!h0Var2.p()) {
            jD2 -= h0Var2.g(obj, this.f131o).f16430e;
        }
        if (!zEquals || jLongValue < jD2) {
            H2.A a8 = a7;
            AbstractC1697a.i(!a8.b());
            H2.g0 g0Var = !zEquals ? H2.g0.f3185d : o0VarH.h;
            J2.t tVar = !zEquals ? this.f114c : o0VarH.f396i;
            if (zEquals) {
                list = o0VarH.f397j;
            } else {
                E4.G g6 = E4.I.f1870p;
                list = E4.b0.f1913s;
            }
            o0 o0VarB2 = o0VarH.c(a8, jLongValue, jLongValue, jLongValue, 0L, g0Var, tVar, list).b(a8);
            o0VarB2.f403q = jLongValue;
            return o0VarB2;
        }
        if (jLongValue != jD2) {
            H2.A a9 = a7;
            AbstractC1697a.i(!a9.b());
            long jMax = Math.max(0L, o0VarH.f404r - (jLongValue - jD2));
            long j3 = o0VarH.f403q;
            if (o0VarH.f398k.equals(o0VarH.f390b)) {
                j3 = jLongValue + jMax;
            }
            o0 o0VarC = o0VarH.c(a9, jLongValue, jLongValue, jLongValue, jMax, o0VarH.h, o0VarH.f396i, o0VarH.f397j);
            o0VarC.f403q = j3;
            return o0VarC;
        }
        int iB = h0Var.b(o0VarH.f398k.f2973a);
        if (iB != -1 && h0Var.f(iB, this.f131o, false).f16428c == h0Var.g(a7.f2973a, this.f131o).f16428c) {
            return o0VarH;
        }
        h0Var.g(a7.f2973a, this.f131o);
        long jA = a7.b() ? this.f131o.a(a7.f2974b, a7.f2975c) : this.f131o.f16429d;
        H2.A a10 = a7;
        o0 o0VarB3 = o0VarH.c(a10, o0VarH.f405s, o0VarH.f405s, o0VarH.f392d, jA - o0VarH.f405s, o0VarH.h, o0VarH.f396i, o0VarH.f397j).b(a10);
        o0VarB3.f403q = jA;
        return o0VarB3;
    }

    @Override // H.P, t2.X
    public final long l0() {
        x1();
        if (!r()) {
            return M();
        }
        o0 o0Var = this.f123g0;
        H2.A a4 = o0Var.f390b;
        t2.h0 h0Var = o0Var.f389a;
        Object obj = a4.f2973a;
        t2.e0 e0Var = this.f131o;
        h0Var.g(obj, e0Var);
        return w2.t.N(e0Var.a(a4.f2974b, a4.f2975c));
    }

    public final Pair l1(t2.h0 h0Var, int i7, long j3) {
        if (h0Var.p()) {
            this.f124h0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f126i0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= h0Var.o()) {
            i7 = h0Var.a(this.f96H);
            j3 = w2.t.N(h0Var.m(i7, (t2.g0) this.f2813b, 0L).f16463k);
        }
        return h0Var.i((t2.g0) this.f2813b, this.f131o, i7, w2.t.D(j3));
    }

    @Override // H.P, t2.X
    public final void m(List list, int i7, long j3) {
        x1();
        ArrayList arrayListE1 = e1(list);
        x1();
        q1(arrayListE1, i7, j3, false);
    }

    @Override // H.P, t2.X
    public final t2.h0 m0() {
        x1();
        return this.f123g0.f389a;
    }

    public final void m1(int i7, int i8) {
        w2.n nVar = this.f108T;
        if (i7 == nVar.f18871a && i8 == nVar.f18872b) {
            return;
        }
        this.f108T = new w2.n(i7, i8);
        this.f129m.f(24, new C0021w(i7, i8, 0));
        p1(2, 14, new w2.n(i7, i8));
    }

    @Override // H.P, t2.X
    public final t2.P n() {
        x1();
        return this.f123g0.f394f;
    }

    @Override // H.P, t2.X
    public final boolean n0() {
        x1();
        return false;
    }

    public final o0 n1(o0 o0Var, int i7, int i8) {
        int iH1 = h1(o0Var);
        long jF1 = f1(o0Var);
        ArrayList arrayList = this.f132p;
        int size = arrayList.size();
        this.f97I++;
        o1(i7, i8);
        t0 t0Var = new t0(arrayList, this.f100L);
        o0 o0VarK1 = k1(o0Var, t0Var, i1(o0Var.f389a, t0Var, iH1, jF1));
        int i9 = o0VarK1.f393e;
        if (i9 != 1 && i9 != 4 && i7 < i8 && i8 == size && iH1 >= o0VarK1.f389a.o()) {
            o0VarK1 = o0VarK1.g(4);
        }
        H2.Y y6 = this.f100L;
        w2.q qVar = this.l.f204v;
        qVar.getClass();
        w2.p pVarB = w2.q.b();
        pVarB.f18874a = qVar.f18876a.obtainMessage(20, i7, i8, y6);
        pVarB.b();
        return o0VarK1;
    }

    @Override // H.P, t2.X
    public final int o() {
        x1();
        return 0;
    }

    public final void o1(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            this.f132p.remove(i9);
        }
        H2.Y y6 = this.f100L;
        int i10 = i8 - i7;
        int[] iArr = y6.f3114b;
        int[] iArr2 = new int[iArr.length - i10];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 < i7 || i13 >= i8) {
                int i14 = i12 - i11;
                if (i13 >= i7) {
                    i13 -= i10;
                }
                iArr2[i14] = i13;
            } else {
                i11++;
            }
        }
        this.f100L = new H2.Y(iArr2, new Random(y6.f3113a.nextLong()));
    }

    @Override // H.P, t2.X
    public final void p(boolean z6) {
        x1();
        int iD = this.f91C.d(d(), z6);
        u1(iD, iD == -1 ? 2 : 1, z6);
    }

    public final void p1(int i7, int i8, Object obj) {
        for (AbstractC0006g abstractC0006g : this.h) {
            if (i7 == -1 || abstractC0006g.f281p == i7) {
                int iH1 = h1(this.f123g0);
                t2.h0 h0Var = this.f123g0.f389a;
                if (iH1 == -1) {
                    iH1 = 0;
                }
                V v3 = this.l;
                r0 r0Var = new r0(v3, abstractC0006g, h0Var, iH1, this.f141y, v3.f206x);
                AbstractC1697a.i(!r0Var.f417g);
                r0Var.f414d = i8;
                AbstractC1697a.i(!r0Var.f417g);
                r0Var.f415e = obj;
                r0Var.c();
            }
        }
    }

    @Override // H.P, t2.X
    public final void q(Surface surface) {
        x1();
        r1(surface);
        int i7 = surface == null ? 0 : -1;
        m1(i7, i7);
    }

    @Override // H.P, t2.X
    public final void q0() {
        x1();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1(java.util.ArrayList r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r1 = r17
            A2.o0 r2 = r15.f123g0
            int r2 = r15.h1(r2)
            long r3 = r15.F0()
            int r5 = r15.f97I
            r6 = 1
            int r5 = r5 + r6
            r15.f97I = r5
            java.util.ArrayList r5 = r15.f132p
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L22
            int r7 = r5.size()
            r15.o1(r8, r7)
        L22:
            r7 = r16
            java.util.ArrayList r10 = r15.b1(r8, r7)
            A2.t0 r7 = new A2.t0
            H2.Y r9 = r15.f100L
            r7.<init>(r5, r9)
            boolean r5 = r7.p()
            int r9 = r7.f446g
            if (r5 != 0) goto L40
            if (r1 >= r9) goto L3a
            goto L40
        L3a:
            t2.s r1 = new t2.s
            r1.<init>()
            throw r1
        L40:
            r5 = -1
            if (r20 == 0) goto L50
            boolean r1 = r15.f96H
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            r12 = r1
            goto L58
        L50:
            if (r1 != r5) goto L55
            r12 = r2
            r2 = r3
            goto L58
        L55:
            r2 = r18
            goto L4e
        L58:
            A2.o0 r1 = r15.f123g0
            android.util.Pair r4 = r15.l1(r7, r12, r2)
            A2.o0 r1 = r15.k1(r1, r7, r4)
            int r4 = r1.f393e
            if (r12 == r5) goto L74
            if (r4 == r6) goto L74
            boolean r4 = r7.p()
            if (r4 != 0) goto L73
            if (r12 < r9) goto L71
            goto L73
        L71:
            r4 = 2
            goto L74
        L73:
            r4 = 4
        L74:
            A2.o0 r1 = r1.g(r4)
            long r13 = w2.t.D(r2)
            H2.Y r11 = r15.f100L
            A2.V r2 = r15.l
            w2.q r2 = r2.f204v
            A2.P r9 = new A2.P
            r9.<init>(r10, r11, r12, r13)
            r3 = 17
            w2.p r2 = r2.a(r3, r9)
            r2.b()
            A2.o0 r2 = r15.f123g0
            H2.A r2 = r2.f390b
            java.lang.Object r2 = r2.f2973a
            H2.A r3 = r1.f390b
            java.lang.Object r3 = r3.f2973a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lac
            A2.o0 r2 = r15.f123g0
            t2.h0 r2 = r2.f389a
            boolean r2 = r2.p()
            if (r2 != 0) goto Lac
            r3 = r6
            goto Lad
        Lac:
            r3 = r8
        Lad:
            long r5 = r15.g1(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.v1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.N.q1(java.util.ArrayList, int, long, boolean):void");
    }

    @Override // H.P, t2.X
    public final boolean r() {
        x1();
        return this.f123g0.f390b.b();
    }

    @Override // H.P, t2.X
    public final boolean r0() {
        x1();
        return this.f96H;
    }

    public final void r1(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (AbstractC0006g abstractC0006g : this.h) {
            if (abstractC0006g.f281p == 2) {
                int iH1 = h1(this.f123g0);
                t2.h0 h0Var = this.f123g0.f389a;
                int i7 = iH1 == -1 ? 0 : iH1;
                V v3 = this.l;
                r0 r0Var = new r0(v3, abstractC0006g, h0Var, i7, this.f141y, v3.f206x);
                AbstractC1697a.i(!r0Var.f417g);
                r0Var.f414d = 1;
                AbstractC1697a.i(!r0Var.f417g);
                r0Var.f415e = surface;
                r0Var.c();
                arrayList.add(r0Var);
            }
        }
        Surface surface2 = this.f105Q;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((r0) it.next()).a(this.f94F);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z6 = true;
            }
            Surface surface3 = this.f105Q;
            Surface surface4 = this.f106R;
            if (surface3 == surface4) {
                surface4.release();
                this.f106R = null;
            }
        }
        this.f105Q = surface;
        if (z6) {
            s1(new C0013n(2, new W("Detaching surface timed out."), 1003));
        }
    }

    @Override // H.P, t2.X
    public final t2.n0 s0() {
        x1();
        return ((J2.o) this.f125i).e();
    }

    public final void s1(C0013n c0013n) {
        o0 o0Var = this.f123g0;
        o0 o0VarB = o0Var.b(o0Var.f390b);
        o0VarB.f403q = o0VarB.f405s;
        o0VarB.f404r = 0L;
        o0 o0VarG = o0VarB.g(1);
        if (c0013n != null) {
            o0VarG = o0VarG.e(c0013n);
        }
        o0 o0Var2 = o0VarG;
        this.f97I++;
        w2.q qVar = this.l.f204v;
        qVar.getClass();
        w2.p pVarB = w2.q.b();
        pVarB.f18874a = qVar.f18876a.obtainMessage(6);
        pVarB.b();
        v1(o0Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // H.P, t2.X
    public final void stop() {
        x1();
        this.f91C.d(1, C());
        s1(null);
        this.f113Y = new C1636c(E4.b0.f1913s, this.f123g0.f405s);
    }

    @Override // H.P, t2.X
    public final long t() {
        x1();
        return this.f139w;
    }

    @Override // H.P, t2.X
    public final long t0() {
        x1();
        if (this.f123g0.f389a.p()) {
            return this.f126i0;
        }
        o0 o0Var = this.f123g0;
        if (o0Var.f398k.f2976d != o0Var.f390b.f2976d) {
            return w2.t.N(o0Var.f389a.m(V(), (t2.g0) this.f2813b, 0L).l);
        }
        long j3 = o0Var.f403q;
        if (this.f123g0.f398k.b()) {
            o0 o0Var2 = this.f123g0;
            t2.e0 e0VarG = o0Var2.f389a.g(o0Var2.f398k.f2973a, this.f131o);
            long jD = e0VarG.d(this.f123g0.f398k.f2974b);
            j3 = jD == Long.MIN_VALUE ? e0VarG.f16429d : jD;
        }
        o0 o0Var3 = this.f123g0;
        t2.h0 h0Var = o0Var3.f389a;
        Object obj = o0Var3.f398k.f2973a;
        t2.e0 e0Var = this.f131o;
        h0Var.g(obj, e0Var);
        return w2.t.N(j3 + e0Var.f16430e);
    }

    public final void t1() {
        t2.T t7 = this.f101M;
        int i7 = w2.t.f18881a;
        N n7 = this.f122g;
        boolean zR = n7.r();
        boolean zH0 = n7.H0();
        boolean zV0 = n7.V0();
        boolean zU0 = n7.U0();
        boolean zO0 = n7.O0();
        boolean zL0 = n7.L0();
        boolean zP = n7.m0().p();
        t2.S s7 = new t2.S();
        s7.f16352a = new B3.l();
        C1485n c1485n = this.f116d.f16355a;
        B3.l lVar = (B3.l) s7.f16352a;
        lVar.b(c1485n);
        boolean z6 = !zR;
        s7.a(4, z6);
        s7.a(5, zH0 && !zR);
        s7.a(6, zV0 && !zR);
        s7.a(7, !zP && (zV0 || !zO0 || zH0) && !zR);
        s7.a(8, zU0 && !zR);
        s7.a(9, !zP && (zU0 || (zO0 && zL0)) && !zR);
        s7.a(10, z6);
        s7.a(11, zH0 && !zR);
        s7.a(12, zH0 && !zR);
        t2.T t8 = new t2.T(lVar.d());
        this.f101M = t8;
        if (t8.equals(t7)) {
            return;
        }
        this.f129m.c(13, new C0024z(this, 2));
    }

    @Override // H.P, t2.X
    public final void u0(int i7, int i8) {
        x1();
        AbstractC1697a.d(i7 >= 0 && i8 >= i7);
        int size = this.f132p.size();
        int iMin = Math.min(i8, size);
        if (i7 >= size || i7 == iMin) {
            return;
        }
        o0 o0VarN1 = n1(this.f123g0, i7, iMin);
        v1(o0VarN1, 0, !o0VarN1.f390b.f2973a.equals(this.f123g0.f390b.f2973a), 4, g1(o0VarN1), -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void u1(int i7, int i8, boolean z6) {
        ?? r14 = (!z6 || i7 == -1) ? 0 : 1;
        int i9 = i7 == 0 ? 1 : 0;
        o0 o0Var = this.f123g0;
        if (o0Var.l == r14 && o0Var.f400n == i9 && o0Var.f399m == i8) {
            return;
        }
        this.f97I++;
        boolean z7 = o0Var.f402p;
        o0 o0VarA = o0Var;
        if (z7) {
            o0VarA = o0Var.a();
        }
        o0 o0VarD = o0VarA.d(i8, i9, r14);
        int i10 = (i9 << 4) | i8;
        w2.q qVar = this.l.f204v;
        qVar.getClass();
        w2.p pVarB = w2.q.b();
        pVarB.f18874a = qVar.f18876a.obtainMessage(1, r14, i10);
        pVarB.b();
        v1(o0VarD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // H.P, t2.X
    public final long v() {
        x1();
        return f1(this.f123g0);
    }

    @Override // H.P, t2.X
    public final void v0(int i7) {
        x1();
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d3 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v1(final A2.o0 r34, int r35, boolean r36, int r37, long r38, int r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.N.v1(A2.o0, int, boolean, int, long, int, boolean):void");
    }

    @Override // H.P, t2.X
    public final long w() {
        x1();
        return w2.t.N(this.f123g0.f404r);
    }

    public final void w1() {
        int iD = d();
        x0 x0Var = this.f93E;
        x0 x0Var2 = this.f92D;
        if (iD != 1) {
            if (iD == 2 || iD == 3) {
                x1();
                boolean z6 = this.f123g0.f402p;
                C();
                x0Var2.getClass();
                C();
                x0Var.getClass();
                return;
            }
            if (iD != 4) {
                throw new IllegalStateException();
            }
        }
        x0Var2.getClass();
        x0Var.getClass();
    }

    @Override // H.P, t2.X
    public final void x(int i7, List list) {
        x1();
        ArrayList arrayListE1 = e1(list);
        x1();
        AbstractC1697a.d(i7 >= 0);
        ArrayList arrayList = this.f132p;
        int iMin = Math.min(i7, arrayList.size());
        if (!arrayList.isEmpty()) {
            v1(c1(this.f123g0, iMin, arrayListE1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z6 = this.f124h0 == -1;
        x1();
        q1(arrayListE1, -1, -9223372036854775807L, z6);
    }

    public final void x1() {
        N2.K k7 = this.f118e;
        synchronized (k7) {
            boolean z6 = false;
            while (!k7.f4991a) {
                try {
                    k7.wait();
                } catch (InterruptedException unused) {
                    z6 = true;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f136t.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f136t.getThread().getName();
            int i7 = w2.t.f18881a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.Z) {
                throw new IllegalStateException(str);
            }
            AbstractC1697a.x(str, this.a0 ? null : new IllegalStateException());
            this.a0 = true;
        }
    }

    @Override // H.P, t2.X
    public final t2.T y() {
        x1();
        return this.f101M;
    }
}
