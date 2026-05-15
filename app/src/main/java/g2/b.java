package G2;

import A0.e;
import A2.AbstractC0006g;
import A2.K;
import A2.N;
import N5.d;
import V.o;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import t2.C1487p;
import t2.I;
import t2.J;
import t2.L;
import w2.AbstractC1697a;
import w2.j;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC0006g implements Handler.Callback {

    /* JADX INFO: renamed from: F */
    public final a f2747F;

    /* JADX INFO: renamed from: G */
    public final K f2748G;

    /* JADX INFO: renamed from: H */
    public final Handler f2749H;

    /* JADX INFO: renamed from: I */
    public final W2.a f2750I;

    /* JADX INFO: renamed from: J */
    public d f2751J;

    /* JADX INFO: renamed from: K */
    public boolean f2752K;

    /* JADX INFO: renamed from: L */
    public boolean f2753L;

    /* JADX INFO: renamed from: M */
    public long f2754M;

    /* JADX INFO: renamed from: N */
    public L f2755N;

    /* JADX INFO: renamed from: O */
    public long f2756O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(K k7, Looper looper) {
        Handler handler;
        super(5);
        a aVar = a.f2746a;
        this.f2748G = k7;
        if (looper == null) {
            handler = null;
        } else {
            int i7 = t.f18881a;
            handler = new Handler(looper, this);
        }
        this.f2749H = handler;
        this.f2747F = aVar;
        this.f2750I = new W2.a(1, 0);
        this.f2756O = -9223372036854775807L;
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) {
        if (this.f2747F.b(c1487p)) {
            return e.r(c1487p.f16689J == 0 ? 4 : 2, 0, 0, 0);
        }
        return e.r(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(t2.L r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            t2.K[] r1 = r6.f16328o
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            t2.p r2 = r2.i()
            if (r2 == 0) goto L3e
            G2.a r3 = r5.f2747F
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L3e
            N5.d r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.n()
            r1.getClass()
            W2.a r3 = r5.f2750I
            r3.f()
            int r4 = r1.length
            r3.h(r4)
            java.nio.ByteBuffer r4 = r3.f21115s
            r4.put(r1)
            r3.i()
            t2.L r1 = r2.y(r3)
            if (r1 == 0) goto L43
            r5.C(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.b.C(t2.L, java.util.ArrayList):void");
    }

    public final long D(long j3) {
        AbstractC1697a.i(j3 != -9223372036854775807L);
        AbstractC1697a.i(this.f2756O != -9223372036854775807L);
        return j3 - this.f2756O;
    }

    public final void E(L l) {
        K k7 = this.f2748G;
        N n7 = k7.f83a;
        I iA = n7.f121f0.a();
        int i7 = 0;
        while (true) {
            t2.K[] kArr = l.f16328o;
            if (i7 >= kArr.length) {
                break;
            }
            kArr[i7].b(iA);
            i7++;
        }
        n7.f121f0 = new J(iA);
        J jD1 = n7.d1();
        boolean zEquals = jD1.equals(n7.f102N);
        j jVar = n7.f129m;
        if (!zEquals) {
            n7.f102N = jD1;
            jVar.c(14, new A2.I(1, k7));
        }
        jVar.c(28, new A2.I(2, l));
        jVar.b();
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "MetadataRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return this.f2753L;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        E((L) message.obj);
        return true;
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        return true;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        this.f2755N = null;
        this.f2751J = null;
        this.f2756O = -9223372036854775807L;
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) {
        this.f2755N = null;
        this.f2752K = false;
        this.f2753L = false;
    }

    @Override // A2.AbstractC0006g
    public final void u(C1487p[] c1487pArr, long j3, long j7) {
        this.f2751J = this.f2747F.a(c1487pArr[0]);
        L l = this.f2755N;
        if (l != null) {
            long j8 = this.f2756O;
            long j9 = l.f16329p;
            long j10 = (j8 + j9) - j7;
            if (j9 != j10) {
                l = new L(j10, l.f16328o);
            }
            this.f2755N = l;
        }
        this.f2756O = j7;
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) {
        boolean z6 = true;
        while (z6) {
            if (!this.f2752K && this.f2755N == null) {
                W2.a aVar = this.f2750I;
                aVar.f();
                o oVar = this.f282q;
                oVar.e();
                int iV = v(oVar, aVar, 0);
                if (iV == -4) {
                    if (aVar.c(4)) {
                        this.f2752K = true;
                    } else if (aVar.f21117u >= this.f291z) {
                        aVar.f7785y = this.f2754M;
                        aVar.i();
                        d dVar = this.f2751J;
                        int i7 = t.f18881a;
                        L lY = dVar.y(aVar);
                        if (lY != null) {
                            ArrayList arrayList = new ArrayList(lY.f16328o.length);
                            C(lY, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f2755N = new L(D(aVar.f21117u), (t2.K[]) arrayList.toArray(new t2.K[0]));
                            }
                        }
                    }
                } else if (iV == -5) {
                    C1487p c1487p = (C1487p) oVar.f7343q;
                    c1487p.getClass();
                    this.f2754M = c1487p.f16706r;
                }
            }
            L l = this.f2755N;
            if (l == null || l.f16329p > D(j3)) {
                z6 = false;
            } else {
                L l7 = this.f2755N;
                Handler handler = this.f2749H;
                if (handler != null) {
                    handler.obtainMessage(1, l7).sendToTarget();
                } else {
                    E(l7);
                }
                this.f2755N = null;
                z6 = true;
            }
            if (this.f2752K && this.f2755N == null) {
                this.f2753L = true;
            }
        }
    }
}
