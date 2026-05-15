package A2;

import H2.InterfaceC0206x;
import H2.InterfaceC0207y;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import t2.C1468A;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class V implements Handler.Callback, InterfaceC0206x, p0 {

    /* JADX INFO: renamed from: h0 */
    public static final long f166h0 = w2.t.N(10000);

    /* JADX INFO: renamed from: A */
    public final long f167A;

    /* JADX INFO: renamed from: B */
    public final C0012m f168B;

    /* JADX INFO: renamed from: C */
    public final ArrayList f169C;

    /* JADX INFO: renamed from: D */
    public final w2.o f170D;

    /* JADX INFO: renamed from: E */
    public final C0024z f171E;

    /* JADX INFO: renamed from: F */
    public final e0 f172F;

    /* JADX INFO: renamed from: G */
    public final n0 f173G;

    /* JADX INFO: renamed from: H */
    public final C0009j f174H;

    /* JADX INFO: renamed from: I */
    public final long f175I;

    /* JADX INFO: renamed from: J */
    public final B2.p f176J;

    /* JADX INFO: renamed from: K */
    public v0 f177K;

    /* JADX INFO: renamed from: L */
    public o0 f178L;

    /* JADX INFO: renamed from: M */
    public S f179M;

    /* JADX INFO: renamed from: N */
    public boolean f180N;

    /* JADX INFO: renamed from: O */
    public boolean f181O;

    /* JADX INFO: renamed from: P */
    public boolean f182P;

    /* JADX INFO: renamed from: Q */
    public boolean f183Q;

    /* JADX INFO: renamed from: R */
    public long f184R;

    /* JADX INFO: renamed from: S */
    public boolean f185S;

    /* JADX INFO: renamed from: T */
    public int f186T;

    /* JADX INFO: renamed from: U */
    public boolean f187U;

    /* JADX INFO: renamed from: V */
    public boolean f188V;

    /* JADX INFO: renamed from: W */
    public boolean f189W;

    /* JADX INFO: renamed from: X */
    public boolean f190X;

    /* JADX INFO: renamed from: Y */
    public int f191Y;
    public U Z;
    public long a0;
    public long b0;

    /* JADX INFO: renamed from: c0 */
    public int f192c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f193d0;

    /* JADX INFO: renamed from: e0 */
    public C0013n f194e0;

    /* JADX INFO: renamed from: f0 */
    public long f195f0;

    /* JADX INFO: renamed from: g0 */
    public C0018t f196g0;

    /* JADX INFO: renamed from: o */
    public final AbstractC0006g[] f197o;

    /* JADX INFO: renamed from: p */
    public final Set f198p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0006g[] f199q;

    /* JADX INFO: renamed from: r */
    public final J2.s f200r;

    /* JADX INFO: renamed from: s */
    public final J2.t f201s;

    /* JADX INFO: renamed from: t */
    public final C0011l f202t;

    /* JADX INFO: renamed from: u */
    public final K2.d f203u;

    /* JADX INFO: renamed from: v */
    public final w2.q f204v;

    /* JADX INFO: renamed from: w */
    public final HandlerThread f205w;

    /* JADX INFO: renamed from: x */
    public final Looper f206x;

    /* JADX INFO: renamed from: y */
    public final t2.g0 f207y;

    /* JADX INFO: renamed from: z */
    public final t2.e0 f208z;

    public V(AbstractC0006g[] abstractC0006gArr, J2.s sVar, J2.t tVar, C0011l c0011l, K2.d dVar, int i7, boolean z6, B2.i iVar, v0 v0Var, C0009j c0009j, long j3, Looper looper, w2.o oVar, C0024z c0024z, B2.p pVar) {
        C0018t c0018t = C0018t.f442a;
        this.f171E = c0024z;
        this.f197o = abstractC0006gArr;
        this.f200r = sVar;
        this.f201s = tVar;
        this.f202t = c0011l;
        this.f203u = dVar;
        this.f186T = i7;
        this.f187U = z6;
        this.f177K = v0Var;
        this.f174H = c0009j;
        this.f175I = j3;
        this.f181O = false;
        this.f170D = oVar;
        this.f176J = pVar;
        this.f196g0 = c0018t;
        this.f195f0 = -9223372036854775807L;
        this.f184R = -9223372036854775807L;
        this.f167A = c0011l.f347g;
        t2.d0 d0Var = t2.h0.f16472a;
        o0 o0VarI = o0.i(tVar);
        this.f178L = o0VarI;
        this.f179M = new S(o0VarI);
        this.f199q = new AbstractC0006g[abstractC0006gArr.length];
        J2.o oVar2 = (J2.o) sVar;
        oVar2.getClass();
        for (int i8 = 0; i8 < abstractC0006gArr.length; i8++) {
            AbstractC0006g abstractC0006g = abstractC0006gArr[i8];
            abstractC0006g.f284s = i8;
            abstractC0006g.f285t = pVar;
            abstractC0006g.f286u = oVar;
            this.f199q[i8] = abstractC0006g;
            AbstractC0006g abstractC0006g2 = this.f199q[i8];
            synchronized (abstractC0006g2.f280o) {
                abstractC0006g2.f279E = oVar2;
            }
        }
        this.f168B = new C0012m(this, oVar);
        this.f169C = new ArrayList();
        this.f198p = Collections.newSetFromMap(new IdentityHashMap());
        this.f207y = new t2.g0();
        this.f208z = new t2.e0();
        sVar.f3731a = this;
        sVar.f3732b = dVar;
        this.f193d0 = true;
        w2.q qVarA = oVar.a(looper, null);
        this.f172F = new e0(iVar, qVarA, new I(4, this));
        this.f173G = new n0(this, iVar, qVarA, pVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f205w = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f206x = looper2;
        this.f204v = oVar.a(looper2, this);
    }

    public static Pair F(t2.h0 h0Var, U u7, boolean z6, int i7, boolean z7, t2.g0 g0Var, t2.e0 e0Var) {
        int iG;
        t2.h0 h0Var2 = u7.f163a;
        if (h0Var.p()) {
            return null;
        }
        t2.h0 h0Var3 = h0Var2.p() ? h0Var : h0Var2;
        try {
            Pair pairI = h0Var3.i(g0Var, e0Var, u7.f164b, u7.f165c);
            if (!h0Var.equals(h0Var3)) {
                if (h0Var.b(pairI.first) == -1) {
                    if (!z6 || (iG = G(g0Var, e0Var, i7, z7, pairI.first, h0Var3, h0Var)) == -1) {
                        return null;
                    }
                    return h0Var.i(g0Var, e0Var, iG, -9223372036854775807L);
                }
                if (h0Var3.g(pairI.first, e0Var).f16431f && h0Var3.m(e0Var.f16428c, g0Var, 0L).f16464m == h0Var3.b(pairI.first)) {
                    return h0Var.i(g0Var, e0Var, h0Var.g(pairI.first, e0Var).f16428c, u7.f165c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int G(t2.g0 g0Var, t2.e0 e0Var, int i7, boolean z6, Object obj, t2.h0 h0Var, t2.h0 h0Var2) {
        t2.g0 g0Var2 = g0Var;
        t2.h0 h0Var3 = h0Var;
        Object obj2 = h0Var3.m(h0Var3.g(obj, e0Var).f16428c, g0Var, 0L).f16454a;
        for (int i8 = 0; i8 < h0Var2.o(); i8++) {
            if (h0Var2.m(i8, g0Var, 0L).f16454a.equals(obj2)) {
                return i8;
            }
        }
        int iB = h0Var3.b(obj);
        int iH = h0Var3.h();
        int iB2 = -1;
        int i9 = 0;
        while (i9 < iH && iB2 == -1) {
            t2.h0 h0Var4 = h0Var3;
            int iD = h0Var4.d(iB, e0Var, g0Var2, i7, z6);
            if (iD == -1) {
                break;
            }
            iB2 = h0Var2.b(h0Var4.l(iD));
            i9++;
            h0Var3 = h0Var4;
            iB = iD;
            g0Var2 = g0Var;
        }
        if (iB2 == -1) {
            return -1;
        }
        return h0Var2.f(iB2, e0Var, false).f16428c;
    }

    public static void N(AbstractC0006g abstractC0006g, long j3) {
        abstractC0006g.f276B = true;
        if (abstractC0006g instanceof I2.d) {
            I2.d dVar = (I2.d) abstractC0006g;
            AbstractC1697a.i(dVar.f276B);
            dVar.f3470Y = j3;
        }
    }

    public static boolean q(AbstractC0006g abstractC0006g) {
        return abstractC0006g.f287v != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.A():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00bd A[PHI: r5 r6 r8
  0x00bd: PHI (r5v4 H2.A) = (r5v3 H2.A), (r5v19 H2.A) binds: [B:144:0x0092, B:146:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r6v2 long) = (r6v1 long), (r6v23 long) binds: [B:144:0x0092, B:146:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r8v2 long) = (r8v1 long), (r8v9 long) binds: [B:144:0x0092, B:146:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        b0 b0Var = this.f172F.f262i;
        this.f182P = b0Var != null && b0Var.f230f.h && this.f181O;
    }

    public final void D(long j3) {
        b0 b0Var = this.f172F.f262i;
        long j7 = j3 + (b0Var == null ? 1000000000000L : b0Var.f237o);
        this.a0 = j7;
        this.f168B.f352o.a(j7);
        for (AbstractC0006g abstractC0006g : this.f197o) {
            if (q(abstractC0006g)) {
                long j8 = this.a0;
                abstractC0006g.f276B = false;
                abstractC0006g.f291z = j8;
                abstractC0006g.f275A = j8;
                abstractC0006g.p(j8, false);
            }
        }
        for (b0 b0Var2 = r0.f262i; b0Var2 != null; b0Var2 = b0Var2.l) {
            for (J2.q qVar : b0Var2.f236n.f3735c) {
                if (qVar != null) {
                    qVar.j();
                }
            }
        }
    }

    public final void E(t2.h0 h0Var, t2.h0 h0Var2) {
        if (h0Var.p() && h0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.f169C;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            A0.e.G(arrayList.get(size));
            throw null;
        }
    }

    public final void H(long j3) {
        this.f204v.f18876a.sendEmptyMessageAtTime(2, j3 + ((this.f178L.f393e != 3 || Y()) ? f166h0 : 1000L));
    }

    public final void I(boolean z6) throws C0013n {
        H2.A a4 = this.f172F.f262i.f230f.f238a;
        long jK = K(a4, this.f178L.f405s, true, false);
        if (jK != this.f178L.f405s) {
            o0 o0Var = this.f178L;
            this.f178L = o(a4, jK, o0Var.f391c, o0Var.f392d, z6, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(7:(11:220|150|211|151|(1:159)(1:157)|160|(1:167)|168|169|170|171)(1:176)|216|196|197|198|170|171)|213|177|(1:179)(1:180)|181|(1:183)(1:185)|184|186|187|(1:189)(1:190)|191|222|192|193|218|194|195) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x015b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x015c, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x015d, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x015f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00a1 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:134:0x0097, B:136:0x00a1, B:143:0x00ad, B:145:0x00b3, B:146:0x00b6, B:148:0x00be, B:153:0x00ce, B:157:0x00d6), top: B:215:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00aa  */
    /* JADX WARN: Type inference failed for: r0v17, types: [H2.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(A2.U r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.J(A2.U):void");
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [H2.y, java.lang.Object] */
    public final long K(H2.A a4, long j3, boolean z6, boolean z7) throws C0013n {
        c0();
        i0(false, true);
        if (z7 || this.f178L.f393e == 3) {
            X(2);
        }
        e0 e0Var = this.f172F;
        b0 b0Var = e0Var.f262i;
        b0 b0Var2 = b0Var;
        while (b0Var2 != null && !a4.equals(b0Var2.f230f.f238a)) {
            b0Var2 = b0Var2.l;
        }
        if (z6 || b0Var != b0Var2 || (b0Var2 != null && b0Var2.f237o + j3 < 0)) {
            AbstractC0006g[] abstractC0006gArr = this.f197o;
            for (AbstractC0006g abstractC0006g : abstractC0006gArr) {
                c(abstractC0006g);
            }
            if (b0Var2 != null) {
                while (e0Var.f262i != b0Var2) {
                    e0Var.a();
                }
                e0Var.l(b0Var2);
                b0Var2.f237o = 1000000000000L;
                e(new boolean[abstractC0006gArr.length], e0Var.f263j.e());
            }
        }
        if (b0Var2 != null) {
            e0Var.l(b0Var2);
            if (!b0Var2.f228d) {
                b0Var2.f230f = b0Var2.f230f.b(j3);
            } else if (b0Var2.f229e) {
                ?? r9 = b0Var2.f225a;
                j3 = r9.o(j3);
                r9.p(j3 - this.f167A);
            }
            D(j3);
            s();
        } else {
            e0Var.b();
            D(j3);
        }
        j(false);
        this.f204v.e(2);
        return j3;
    }

    public final void L(r0 r0Var) {
        Looper looper = r0Var.f416f;
        Looper looper2 = this.f206x;
        w2.q qVar = this.f204v;
        if (looper != looper2) {
            qVar.a(15, r0Var).b();
            return;
        }
        synchronized (r0Var) {
        }
        try {
            r0Var.f411a.a(r0Var.f414d, r0Var.f415e);
            r0Var.b(true);
            int i7 = this.f178L.f393e;
            if (i7 == 3 || i7 == 2) {
                qVar.e(2);
            }
        } catch (Throwable th) {
            r0Var.b(true);
            throw th;
        }
    }

    public final void M(r0 r0Var) {
        Looper looper = r0Var.f416f;
        if (looper.getThread().isAlive()) {
            this.f170D.a(looper, null).c(new RunnableC0022x(this, 1, r0Var));
        } else {
            AbstractC1697a.w("Trying to send message on a dead thread.");
            r0Var.b(false);
        }
    }

    public final void O(boolean z6, AtomicBoolean atomicBoolean) {
        if (this.f188V != z6) {
            this.f188V = z6;
            if (!z6) {
                for (AbstractC0006g abstractC0006g : this.f197o) {
                    if (!q(abstractC0006g) && this.f198p.remove(abstractC0006g)) {
                        abstractC0006g.y();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void P(P p7) throws Throwable {
        this.f179M.c(1);
        int i7 = p7.f146c;
        ArrayList arrayList = p7.f144a;
        H2.Y y6 = p7.f145b;
        if (i7 != -1) {
            this.Z = new U(new t0(arrayList, y6), p7.f146c, p7.f147d);
        }
        n0 n0Var = this.f173G;
        ArrayList arrayList2 = n0Var.f377b;
        n0Var.g(0, arrayList2.size());
        l(n0Var.a(arrayList2.size(), arrayList, y6), false);
    }

    public final void Q(boolean z6) throws C0013n {
        this.f181O = z6;
        C();
        if (this.f182P) {
            e0 e0Var = this.f172F;
            if (e0Var.f263j != e0Var.f262i) {
                I(true);
                j(false);
            }
        }
    }

    public final void R(int i7, int i8, boolean z6, boolean z7) {
        this.f179M.c(z7 ? 1 : 0);
        this.f178L = this.f178L.d(i8, i7, z6);
        i0(false, false);
        for (b0 b0Var = this.f172F.f262i; b0Var != null; b0Var = b0Var.l) {
            for (J2.q qVar : b0Var.f236n.f3735c) {
                if (qVar != null) {
                    qVar.a(z6);
                }
            }
        }
        if (!Y()) {
            c0();
            g0();
            return;
        }
        int i9 = this.f178L.f393e;
        w2.q qVar2 = this.f204v;
        if (i9 != 3) {
            if (i9 == 2) {
                qVar2.e(2);
            }
        } else {
            C0012m c0012m = this.f168B;
            c0012m.f357t = true;
            c0012m.f352o.b();
            a0();
            qVar2.e(2);
        }
    }

    public final void S(t2.Q q7) {
        this.f204v.d(16);
        C0012m c0012m = this.f168B;
        c0012m.h(q7);
        t2.Q qJ = c0012m.j();
        n(qJ, qJ.f16348a, true, true);
    }

    public final void T(C0018t c0018t) {
        this.f196g0 = c0018t;
        t2.h0 h0Var = this.f178L.f389a;
        e0 e0Var = this.f172F;
        e0Var.getClass();
        c0018t.getClass();
        if (e0Var.f267o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < e0Var.f267o.size(); i7++) {
            ((b0) e0Var.f267o.get(i7)).g();
        }
        e0Var.f267o = arrayList;
    }

    public final void U(int i7) throws C0013n {
        this.f186T = i7;
        t2.h0 h0Var = this.f178L.f389a;
        e0 e0Var = this.f172F;
        e0Var.f261g = i7;
        if (!e0Var.p(h0Var)) {
            I(true);
        }
        j(false);
    }

    public final void V(boolean z6) throws C0013n {
        this.f187U = z6;
        t2.h0 h0Var = this.f178L.f389a;
        e0 e0Var = this.f172F;
        e0Var.h = z6;
        if (!e0Var.p(h0Var)) {
            I(true);
        }
        j(false);
    }

    public final void W(H2.Y y6) throws Throwable {
        this.f179M.c(1);
        n0 n0Var = this.f173G;
        int size = n0Var.f377b.size();
        if (y6.f3114b.length != size) {
            y6 = new H2.Y(new Random(y6.f3113a.nextLong())).a(0, size);
        }
        n0Var.f384j = y6;
        l(n0Var.b(), false);
    }

    public final void X(int i7) {
        o0 o0Var = this.f178L;
        if (o0Var.f393e != i7) {
            if (i7 != 2) {
                this.f195f0 = -9223372036854775807L;
            }
            this.f178L = o0Var.g(i7);
        }
    }

    public final boolean Y() {
        o0 o0Var = this.f178L;
        return o0Var.l && o0Var.f400n == 0;
    }

    public final boolean Z(t2.h0 h0Var, H2.A a4) {
        if (a4.b() || h0Var.p()) {
            return false;
        }
        int i7 = h0Var.g(a4.f2973a, this.f208z).f16428c;
        t2.g0 g0Var = this.f207y;
        h0Var.n(i7, g0Var);
        return g0Var.a() && g0Var.h && g0Var.f16458e != -9223372036854775807L;
    }

    @Override // H2.InterfaceC0206x
    public final void a(H2.X x6) {
        this.f204v.a(9, (InterfaceC0207y) x6).b();
    }

    public final void a0() {
        b0 b0Var = this.f172F.f262i;
        if (b0Var == null) {
            return;
        }
        J2.t tVar = b0Var.f236n;
        int i7 = 0;
        while (true) {
            AbstractC0006g[] abstractC0006gArr = this.f197o;
            if (i7 >= abstractC0006gArr.length) {
                return;
            }
            if (tVar.b(i7)) {
                AbstractC0006g abstractC0006g = abstractC0006gArr[i7];
                int i8 = abstractC0006g.f287v;
                if (i8 == 1) {
                    AbstractC1697a.i(i8 == 1);
                    abstractC0006g.f287v = 2;
                    abstractC0006g.s();
                }
            }
            i7++;
        }
    }

    public final void b(P p7, int i7) throws Throwable {
        this.f179M.c(1);
        n0 n0Var = this.f173G;
        if (i7 == -1) {
            i7 = n0Var.f377b.size();
        }
        l(n0Var.a(i7, p7.f144a, p7.f145b), false);
    }

    public final void b0(boolean z6, boolean z7) {
        B(z6 || !this.f188V, false, true, false);
        this.f179M.c(z7 ? 1 : 0);
        C0011l c0011l = this.f202t;
        if (c0011l.h.remove(this.f176J) != null) {
            c0011l.d();
        }
        X(1);
    }

    public final void c(AbstractC0006g abstractC0006g) {
        if (q(abstractC0006g)) {
            C0012m c0012m = this.f168B;
            if (abstractC0006g == c0012m.f354q) {
                c0012m.f355r = null;
                c0012m.f354q = null;
                c0012m.f356s = true;
            }
            int i7 = abstractC0006g.f287v;
            if (i7 == 2) {
                AbstractC1697a.i(i7 == 2);
                abstractC0006g.f287v = 1;
                abstractC0006g.t();
            }
            AbstractC1697a.i(abstractC0006g.f287v == 1);
            abstractC0006g.f282q.e();
            abstractC0006g.f287v = 0;
            abstractC0006g.f288w = null;
            abstractC0006g.f289x = null;
            abstractC0006g.f276B = false;
            abstractC0006g.n();
            this.f191Y--;
        }
    }

    public final void c0() {
        int i7;
        C0012m c0012m = this.f168B;
        c0012m.f357t = false;
        w0 w0Var = c0012m.f352o;
        if (w0Var.f465p) {
            w0Var.a(w0Var.l());
            w0Var.f465p = false;
        }
        for (AbstractC0006g abstractC0006g : this.f197o) {
            if (q(abstractC0006g) && (i7 = abstractC0006g.f287v) == 2) {
                AbstractC1697a.i(i7 == 2);
                abstractC0006g.f287v = 1;
                abstractC0006g.t();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:926:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:965:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:967:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:988:0x0355 A[EDGE_INSN: B:988:0x0355->B:722:0x0355 BREAK  A[LOOP:0: B:688:0x02d7->B:721:0x0352], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v54, types: [J2.t] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [int] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [int] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r2v18, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v71, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v63, types: [H2.X, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 1889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.d():void");
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [H2.X, java.lang.Object] */
    public final void d0() {
        b0 b0Var = this.f172F.f264k;
        boolean z6 = this.f185S || (b0Var != null && b0Var.f225a.c());
        o0 o0Var = this.f178L;
        if (z6 != o0Var.f395g) {
            this.f178L = new o0(o0Var.f389a, o0Var.f390b, o0Var.f391c, o0Var.f392d, o0Var.f393e, o0Var.f394f, z6, o0Var.h, o0Var.f396i, o0Var.f397j, o0Var.f398k, o0Var.l, o0Var.f399m, o0Var.f400n, o0Var.f401o, o0Var.f403q, o0Var.f404r, o0Var.f405s, o0Var.f406t, o0Var.f402p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(boolean[] r20, long r21) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.e(boolean[], long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e0(J2.t tVar) {
        t2.h0 h0Var = this.f178L.f389a;
        J2.q[] qVarArr = tVar.f3735c;
        C0011l c0011l = this.f202t;
        C0010k c0010k = (C0010k) c0011l.h.get(this.f176J);
        c0010k.getClass();
        int iMax = c0011l.f346f;
        if (iMax == -1) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                AbstractC0006g[] abstractC0006gArr = this.f197o;
                int i9 = 13107200;
                if (i7 < abstractC0006gArr.length) {
                    if (qVarArr[i7] != null) {
                        switch (abstractC0006gArr[i7].f281p) {
                            case 0:
                                i9 = 144310272;
                                i8 += i9;
                                break;
                            case 1:
                                i8 += i9;
                                break;
                            case 2:
                                i9 = 131072000;
                                i8 += i9;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i9 = 131072;
                                i8 += i9;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i7++;
                } else {
                    iMax = Math.max(13107200, i8);
                }
            }
        }
        c0010k.f336b = iMax;
        c0011l.d();
    }

    public final long f(t2.h0 h0Var, Object obj, long j3) {
        t2.e0 e0Var = this.f208z;
        int i7 = h0Var.g(obj, e0Var).f16428c;
        t2.g0 g0Var = this.f207y;
        h0Var.n(i7, g0Var);
        if (g0Var.f16458e == -9223372036854775807L || !g0Var.a() || !g0Var.h) {
            return -9223372036854775807L;
        }
        long j7 = g0Var.f16459f;
        return w2.t.D((j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime()) - g0Var.f16458e) - (j3 + e0Var.f16430e);
    }

    public final void f0(int i7, int i8, List list) throws Throwable {
        this.f179M.c(1);
        n0 n0Var = this.f173G;
        n0Var.getClass();
        ArrayList arrayList = n0Var.f377b;
        AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i8 <= arrayList.size());
        AbstractC1697a.d(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((m0) arrayList.get(i9)).f358a.s((t2.G) list.get(i9 - i7));
        }
        l(n0Var.b(), false);
    }

    public final Pair g(t2.h0 h0Var) {
        if (h0Var.p()) {
            return Pair.create(o0.f388u, 0L);
        }
        Pair pairI = h0Var.i(this.f207y, this.f208z, h0Var.a(this.f187U), -9223372036854775807L);
        H2.A aN = this.f172F.n(h0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (aN.b()) {
            Object obj = aN.f2973a;
            t2.e0 e0Var = this.f208z;
            h0Var.g(obj, e0Var);
            jLongValue = aN.f2975c == e0Var.f(aN.f2974b) ? e0Var.f16432g.f16404b : 0L;
        }
        return Pair.create(aN, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d0  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r2v24, types: [H2.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0() {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.g0():void");
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [H2.X, java.lang.Object] */
    public final void h(InterfaceC0207y interfaceC0207y) {
        b0 b0Var = this.f172F.f264k;
        if (b0Var == null || b0Var.f225a != interfaceC0207y) {
            return;
        }
        long j3 = this.a0;
        if (b0Var != null) {
            AbstractC1697a.i(b0Var.l == null);
            if (b0Var.f228d) {
                b0Var.f225a.q(j3 - b0Var.f237o);
            }
        }
        s();
    }

    public final void h0(t2.h0 h0Var, H2.A a4, t2.h0 h0Var2, H2.A a7, long j3, boolean z6) {
        if (!Z(h0Var, a4)) {
            t2.Q q7 = a4.b() ? t2.Q.f16345d : this.f178L.f401o;
            C0012m c0012m = this.f168B;
            if (c0012m.j().equals(q7)) {
                return;
            }
            this.f204v.d(16);
            c0012m.h(q7);
            n(this.f178L.f401o, q7.f16348a, false, false);
            return;
        }
        Object obj = a4.f2973a;
        t2.e0 e0Var = this.f208z;
        int i7 = h0Var.g(obj, e0Var).f16428c;
        t2.g0 g0Var = this.f207y;
        h0Var.n(i7, g0Var);
        C1468A c1468a = g0Var.f16461i;
        C0009j c0009j = this.f174H;
        c0009j.getClass();
        c0009j.f318c = w2.t.D(c1468a.f16173a);
        c0009j.f321f = w2.t.D(c1468a.f16174b);
        c0009j.f322g = w2.t.D(c1468a.f16175c);
        float f7 = c1468a.f16176d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        c0009j.f324j = f7;
        float f8 = c1468a.f16177e;
        if (f8 == -3.4028235E38f) {
            f8 = 1.03f;
        }
        c0009j.f323i = f8;
        if (f7 == 1.0f && f8 == 1.0f) {
            c0009j.f318c = -9223372036854775807L;
        }
        c0009j.a();
        if (j3 != -9223372036854775807L) {
            c0009j.f319d = f(h0Var, obj, j3);
            c0009j.a();
            return;
        }
        if (!w2.t.a(!h0Var2.p() ? h0Var2.m(h0Var2.g(a7.f2973a, e0Var).f16428c, g0Var, 0L).f16454a : null, g0Var.f16454a) || z6) {
            c0009j.f319d = -9223372036854775807L;
            c0009j.a();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i7;
        b0 b0Var;
        int i8;
        b0 b0Var2;
        try {
            switch (message.what) {
                case 1:
                    boolean z6 = message.arg1 != 0;
                    int i9 = message.arg2;
                    R(i9 >> 4, i9 & 15, z6, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((U) message.obj);
                    break;
                case 4:
                    S((t2.Q) message.obj);
                    break;
                case 5:
                    this.f177K = (v0) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    m((InterfaceC0207y) message.obj);
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    h((InterfaceC0207y) message.obj);
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    A();
                    break;
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    r0 r0Var = (r0) message.obj;
                    r0Var.getClass();
                    L(r0Var);
                    break;
                case 15:
                    M((r0) message.obj);
                    break;
                case 16:
                    t2.Q q7 = (t2.Q) message.obj;
                    n(q7, q7.f16348a, true, false);
                    break;
                case 17:
                    P((P) message.obj);
                    break;
                case 18:
                    b((P) message.obj, message.arg1);
                    break;
                case 19:
                    v((Q) message.obj);
                    break;
                case BuildConfig.API_VERSION /* 20 */:
                    z(message.arg1, message.arg2, (H2.Y) message.obj);
                    break;
                case 21:
                    W((H2.Y) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    Q(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    A();
                    I(true);
                    break;
                case 26:
                    A();
                    I(true);
                    break;
                case 27:
                    f0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    T((C0018t) message.obj);
                    break;
                case 29:
                    w();
                    break;
            }
        } catch (C0013n e7) {
            e = e7;
            int i10 = e.f373x;
            e0 e0Var = this.f172F;
            if (i10 == 1 && (b0Var2 = e0Var.f263j) != null) {
                e = e.c(b0Var2.f230f.f238a);
            }
            if (e.f372D && (this.f194e0 == null || (i8 = e.f16342o) == 5004 || i8 == 5003)) {
                AbstractC1697a.x("Recoverable renderer error", e);
                C0013n c0013n = this.f194e0;
                if (c0013n != null) {
                    c0013n.addSuppressed(e);
                    e = this.f194e0;
                } else {
                    this.f194e0 = e;
                }
                w2.q qVar = this.f204v;
                w2.p pVarA = qVar.a(25, e);
                qVar.getClass();
                Message message2 = pVarA.f18874a;
                message2.getClass();
                qVar.f18876a.sendMessageAtFrontOfQueue(message2);
                pVarA.a();
            } else {
                C0013n c0013n2 = this.f194e0;
                if (c0013n2 != null) {
                    c0013n2.addSuppressed(e);
                    e = this.f194e0;
                }
                AbstractC1697a.n("Playback error", e);
                if (e.f373x == 1 && e0Var.f262i != e0Var.f263j) {
                    while (true) {
                        b0Var = e0Var.f262i;
                        if (b0Var == e0Var.f263j) {
                            break;
                        }
                        e0Var.a();
                    }
                    b0Var.getClass();
                    t();
                    c0 c0Var = b0Var.f230f;
                    H2.A a4 = c0Var.f238a;
                    long j3 = c0Var.f239b;
                    this.f178L = o(a4, j3, c0Var.f240c, j3, true, 0);
                }
                b0(true, false);
                this.f178L = this.f178L.e(e);
            }
        } catch (D2.j e8) {
            i(e8.f1521o, e8);
        } catch (t2.N e9) {
            boolean z7 = e9.f16332o;
            int i11 = e9.f16333p;
            if (i11 == 1) {
                i7 = z7 ? 3001 : 3003;
            } else {
                if (i11 == 4) {
                    i7 = z7 ? 3002 : 3004;
                }
                i(i, e9);
            }
            i = i7;
            i(i, e9);
        } catch (y2.k e10) {
            i(e10.f20338o, e10);
        } catch (IOException e11) {
            i(2000, e11);
        } catch (RuntimeException e12) {
            C0013n c0013n3 = new C0013n(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC1697a.n("Playback error", c0013n3);
            b0(true, false);
            this.f178L = this.f178L.e(c0013n3);
        }
        t();
        return true;
    }

    public final void i(int i7, IOException iOException) {
        C0013n c0013n = new C0013n(0, iOException, i7);
        b0 b0Var = this.f172F.f262i;
        if (b0Var != null) {
            c0013n = c0013n.c(b0Var.f230f.f238a);
        }
        AbstractC1697a.n("Playback error", c0013n);
        b0(false, false);
        this.f178L = this.f178L.e(c0013n);
    }

    public final void i0(boolean z6, boolean z7) {
        long jElapsedRealtime;
        this.f183Q = z6;
        if (!z6 || z7) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f170D.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f184R = jElapsedRealtime;
    }

    public final void j(boolean z6) {
        b0 b0Var = this.f172F.f264k;
        H2.A a4 = b0Var == null ? this.f178L.f390b : b0Var.f230f.f238a;
        boolean zEquals = this.f178L.f398k.equals(a4);
        if (!zEquals) {
            this.f178L = this.f178L.b(a4);
        }
        o0 o0Var = this.f178L;
        o0Var.f403q = b0Var == null ? o0Var.f405s : b0Var.d();
        o0 o0Var2 = this.f178L;
        long j3 = o0Var2.f403q;
        b0 b0Var2 = this.f172F.f264k;
        o0Var2.f404r = b0Var2 != null ? Math.max(0L, j3 - (this.a0 - b0Var2.f237o)) : 0L;
        if ((!zEquals || z6) && b0Var != null && b0Var.f228d) {
            e0(b0Var.f236n);
        }
    }

    public final synchronized void j0(C0014o c0014o, long j3) {
        this.f170D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j3;
        boolean z6 = false;
        while (!((Boolean) c0014o.get()).booleanValue() && j3 > 0) {
            try {
                this.f170D.getClass();
                wait(j3);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            this.f170D.getClass();
            j3 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // H2.InterfaceC0206x
    public final void k(InterfaceC0207y interfaceC0207y) {
        this.f204v.a(8, interfaceC0207y).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0466  */
    /* JADX WARN: Type inference failed for: r0v36, types: [A2.o0] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [t2.h0] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [t2.h0] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [A2.U] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v25, types: [t2.h0] */
    /* JADX WARN: Type inference failed for: r2v30, types: [A2.o0] */
    /* JADX WARN: Type inference failed for: r2v49, types: [t2.h0] */
    /* JADX WARN: Type inference failed for: r2v57, types: [A2.e0] */
    /* JADX WARN: Type inference failed for: r36v0, types: [A2.V] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [int] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [t2.h0] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(t2.h0 r37, boolean r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1139
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.V.l(t2.h0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [H2.y, java.lang.Object] */
    public final void m(InterfaceC0207y interfaceC0207y) throws C0013n {
        e0 e0Var = this.f172F;
        b0 b0Var = e0Var.f264k;
        if (b0Var == null || b0Var.f225a != interfaceC0207y) {
            return;
        }
        float f7 = this.f168B.j().f16348a;
        t2.h0 h0Var = this.f178L.f389a;
        b0Var.f228d = true;
        b0Var.f235m = b0Var.f225a.h();
        J2.t tVarH = b0Var.h(f7, h0Var);
        c0 c0Var = b0Var.f230f;
        long j3 = c0Var.f242e;
        long jMax = c0Var.f239b;
        if (j3 != -9223372036854775807L && jMax >= j3) {
            jMax = Math.max(0L, j3 - 1);
        }
        long jA = b0Var.a(tVarH, jMax, false, new boolean[b0Var.f232i.length]);
        long j7 = b0Var.f237o;
        c0 c0Var2 = b0Var.f230f;
        b0Var.f237o = (c0Var2.f239b - jA) + j7;
        b0Var.f230f = c0Var2.b(jA);
        e0(b0Var.f236n);
        if (b0Var == e0Var.f262i) {
            D(b0Var.f230f.f239b);
            e(new boolean[this.f197o.length], e0Var.f263j.e());
            o0 o0Var = this.f178L;
            H2.A a4 = o0Var.f390b;
            long j8 = b0Var.f230f.f239b;
            this.f178L = o(a4, j8, o0Var.f391c, j8, false, 5);
        }
        s();
    }

    public final void n(t2.Q q7, float f7, boolean z6, boolean z7) {
        int i7;
        if (z6) {
            if (z7) {
                this.f179M.c(1);
            }
            this.f178L = this.f178L.f(q7);
        }
        float f8 = q7.f16348a;
        b0 b0Var = this.f172F.f262i;
        while (true) {
            i7 = 0;
            if (b0Var == null) {
                break;
            }
            J2.q[] qVarArr = b0Var.f236n.f3735c;
            int length = qVarArr.length;
            while (i7 < length) {
                J2.q qVar = qVarArr[i7];
                if (qVar != null) {
                    qVar.i(f8);
                }
                i7++;
            }
            b0Var = b0Var.l;
        }
        AbstractC0006g[] abstractC0006gArr = this.f197o;
        int length2 = abstractC0006gArr.length;
        while (i7 < length2) {
            AbstractC0006g abstractC0006g = abstractC0006gArr[i7];
            if (abstractC0006g != null) {
                abstractC0006g.z(f7, q7.f16348a);
            }
            i7++;
        }
    }

    public final o0 o(H2.A a4, long j3, long j7, long j8, boolean z6, int i7) {
        E4.b0 b0VarF;
        boolean z7;
        int i8;
        this.f193d0 = (!this.f193d0 && j3 == this.f178L.f405s && a4.equals(this.f178L.f390b)) ? false : true;
        C();
        o0 o0Var = this.f178L;
        H2.g0 g0Var = o0Var.h;
        J2.t tVar = o0Var.f396i;
        List list = o0Var.f397j;
        if (this.f173G.f385k) {
            b0 b0Var = this.f172F.f262i;
            g0Var = b0Var == null ? H2.g0.f3185d : b0Var.f235m;
            tVar = b0Var == null ? this.f201s : b0Var.f236n;
            J2.q[] qVarArr = tVar.f3735c;
            E4.F f7 = new E4.F(4);
            boolean z8 = false;
            for (J2.q qVar : qVarArr) {
                if (qVar != null) {
                    t2.L l = qVar.b(0).f16700k;
                    if (l == null) {
                        f7.a(new t2.L(new t2.K[0]));
                    } else {
                        f7.a(l);
                        z8 = true;
                    }
                }
            }
            int i9 = 1;
            if (z8) {
                b0VarF = f7.f();
            } else {
                E4.G g6 = E4.I.f1870p;
                b0VarF = E4.b0.f1913s;
            }
            list = b0VarF;
            if (b0Var != null) {
                c0 c0Var = b0Var.f230f;
                if (c0Var.f240c != j7) {
                    b0Var.f230f = c0Var.a(j7);
                }
            }
            b0 b0Var2 = this.f172F.f262i;
            if (b0Var2 != null) {
                J2.t tVar2 = b0Var2.f236n;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    AbstractC0006g[] abstractC0006gArr = this.f197o;
                    if (i10 >= abstractC0006gArr.length) {
                        z7 = true;
                        break;
                    }
                    if (tVar2.b(i10)) {
                        i8 = i9;
                        if (abstractC0006gArr[i10].f281p != i8) {
                            z7 = false;
                            break;
                        }
                        if (tVar2.f3734b[i10].f454a != 0) {
                            i11 = i8;
                        }
                    } else {
                        i8 = i9;
                    }
                    i10 += i8;
                    i9 = i8;
                }
                boolean z9 = i11 != 0 && z7;
                if (z9 != this.f190X) {
                    this.f190X = z9;
                    if (!z9 && this.f178L.f402p) {
                        this.f204v.e(2);
                    }
                }
            }
        } else if (!a4.equals(o0Var.f390b)) {
            g0Var = H2.g0.f3185d;
            tVar = this.f201s;
            list = E4.b0.f1913s;
        }
        H2.g0 g0Var2 = g0Var;
        J2.t tVar3 = tVar;
        List list2 = list;
        if (z6) {
            S s7 = this.f179M;
            if (!s7.f154c || s7.f155d == 5) {
                s7.f153b = true;
                s7.f154c = true;
                s7.f155d = i7;
            } else {
                AbstractC1697a.d(i7 == 5);
            }
        }
        o0 o0Var2 = this.f178L;
        long j9 = o0Var2.f403q;
        b0 b0Var3 = this.f172F.f264k;
        return o0Var2.c(a4, j3, j7, j8, b0Var3 == null ? 0L : Math.max(0L, j9 - (this.a0 - b0Var3.f237o)), g0Var2, tVar3, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [H2.X, java.lang.Object] */
    public final boolean p() {
        b0 b0Var = this.f172F.f264k;
        if (b0Var == null) {
            return false;
        }
        return (!b0Var.f228d ? 0L : b0Var.f225a.e()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        b0 b0Var = this.f172F.f262i;
        long j3 = b0Var.f230f.f242e;
        if (b0Var.f228d) {
            return j3 == -9223372036854775807L || this.f178L.f405s < j3 || !Y();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [H2.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [H2.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [H2.X, java.lang.Object] */
    public final void s() {
        boolean zC;
        if (p()) {
            b0 b0Var = this.f172F.f264k;
            long jE = !b0Var.f228d ? 0L : b0Var.f225a.e();
            b0 b0Var2 = this.f172F.f264k;
            long jMax = b0Var2 == null ? 0L : Math.max(0L, jE - (this.a0 - b0Var2.f237o));
            b0 b0Var3 = this.f172F.f262i;
            long j3 = Z(this.f178L.f389a, b0Var.f230f.f238a) ? this.f174H.h : -9223372036854775807L;
            B2.p pVar = this.f176J;
            t2.h0 h0Var = this.f178L.f389a;
            float f7 = this.f168B.j().f16348a;
            boolean z6 = this.f178L.l;
            X x6 = new X(pVar, jMax, f7, this.f183Q, j3);
            zC = this.f202t.c(x6);
            b0 b0Var4 = this.f172F.f262i;
            if (!zC && b0Var4.f228d && jMax < 500000 && this.f167A > 0) {
                b0Var4.f225a.p(this.f178L.f405s);
                zC = this.f202t.c(x6);
            }
        } else {
            zC = false;
        }
        this.f185S = zC;
        if (zC) {
            b0 b0Var5 = this.f172F.f264k;
            long j7 = this.a0;
            float f8 = this.f168B.j().f16348a;
            long j8 = this.f184R;
            AbstractC1697a.i(b0Var5.l == null);
            long j9 = j7 - b0Var5.f237o;
            ?? r12 = b0Var5.f225a;
            Y y6 = new Y();
            y6.f213b = -3.4028235E38f;
            y6.f214c = -9223372036854775807L;
            y6.f212a = j9;
            AbstractC1697a.d(f8 > 0.0f || f8 == -3.4028235E38f);
            y6.f213b = f8;
            AbstractC1697a.d(j8 >= 0 || j8 == -9223372036854775807L);
            y6.f214c = j8;
            r12.d(new Z(y6));
        }
        d0();
    }

    public final void t() {
        S s7 = this.f179M;
        o0 o0Var = this.f178L;
        boolean z6 = s7.f153b | (((o0) s7.f156e) != o0Var);
        s7.f153b = z6;
        s7.f156e = o0Var;
        if (z6) {
            N n7 = this.f171E.f476p;
            n7.f127j.c(new RunnableC0022x(n7, 0, s7));
            this.f179M = new S(this.f178L);
        }
    }

    public final void u() throws Throwable {
        l(this.f173G.b(), true);
    }

    public final void v(Q q7) throws Throwable {
        t2.h0 h0VarB;
        this.f179M.c(1);
        int i7 = q7.f148a;
        n0 n0Var = this.f173G;
        n0Var.getClass();
        ArrayList arrayList = n0Var.f377b;
        int i8 = q7.f149b;
        int i9 = q7.f150c;
        AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i8 <= arrayList.size() && i9 >= 0);
        n0Var.f384j = q7.f151d;
        if (i7 == i8 || i7 == i9) {
            h0VarB = n0Var.b();
        } else {
            int iMin = Math.min(i7, i9);
            int iMax = Math.max(((i8 - i7) + i9) - 1, i8 - 1);
            int iO = ((m0) arrayList.get(iMin)).f361d;
            w2.t.C(arrayList, i7, i8, i9);
            while (iMin <= iMax) {
                m0 m0Var = (m0) arrayList.get(iMin);
                m0Var.f361d = iO;
                iO += m0Var.f358a.f3239o.f3220e.o();
                iMin++;
            }
            h0VarB = n0Var.b();
        }
        l(h0VarB, false);
    }

    public final void w() {
        this.f179M.c(1);
        int i7 = 0;
        B(false, false, false, true);
        C0011l c0011l = this.f202t;
        c0011l.getClass();
        long id = Thread.currentThread().getId();
        long j3 = c0011l.f348i;
        AbstractC1697a.h("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id);
        c0011l.f348i = id;
        HashMap map = c0011l.h;
        B2.p pVar = this.f176J;
        if (!map.containsKey(pVar)) {
            map.put(pVar, new C0010k());
        }
        C0010k c0010k = (C0010k) map.get(pVar);
        c0010k.getClass();
        int i8 = c0011l.f346f;
        if (i8 == -1) {
            i8 = 13107200;
        }
        c0010k.f336b = i8;
        c0010k.f335a = false;
        X(this.f178L.f389a.p() ? 4 : 2);
        K2.g gVar = (K2.g) this.f203u;
        gVar.getClass();
        n0 n0Var = this.f173G;
        AbstractC1697a.i(!n0Var.f385k);
        n0Var.l = gVar;
        while (true) {
            ArrayList arrayList = n0Var.f377b;
            if (i7 >= arrayList.size()) {
                n0Var.f385k = true;
                this.f204v.e(2);
                return;
            } else {
                m0 m0Var = (m0) arrayList.get(i7);
                n0Var.e(m0Var);
                n0Var.f382g.add(m0Var);
                i7++;
            }
        }
    }

    public final void x() {
        try {
            B(true, false, true, false);
            y();
            C0011l c0011l = this.f202t;
            if (c0011l.h.remove(this.f176J) != null) {
                c0011l.d();
            }
            if (c0011l.h.isEmpty()) {
                c0011l.f348i = -1L;
            }
            X(1);
            HandlerThread handlerThread = this.f205w;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.f180N = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f205w;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.f180N = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void y() {
        for (int i7 = 0; i7 < this.f197o.length; i7++) {
            AbstractC0006g abstractC0006g = this.f199q[i7];
            synchronized (abstractC0006g.f280o) {
                abstractC0006g.f279E = null;
            }
            AbstractC0006g abstractC0006g2 = this.f197o[i7];
            AbstractC1697a.i(abstractC0006g2.f287v == 0);
            abstractC0006g2.q();
        }
    }

    public final void z(int i7, int i8, H2.Y y6) throws Throwable {
        this.f179M.c(1);
        n0 n0Var = this.f173G;
        n0Var.getClass();
        AbstractC1697a.d(i7 >= 0 && i7 <= i8 && i8 <= n0Var.f377b.size());
        n0Var.f384j = y6;
        n0Var.g(i7, i8);
        l(n0Var.b(), false);
    }
}
