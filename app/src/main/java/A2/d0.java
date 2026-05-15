package A2;

import H2.C0205w;
import I4.C0226a;
import a.AbstractC0509a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import d2.C0821i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import k.C1116d;
import m5.AbstractC1209k;
import m5.C1219u;
import m5.C1220v;
import w3.A0;
import w3.B1;
import w3.C0;
import w3.C1747r0;
import w3.C1749s0;
import w3.C1751t0;
import w3.C1760y;
import w3.C1762z;
import w3.HandlerC1759x0;
import w3.InterfaceC1758x;
import w3.K0;
import w3.N0;
import w3.RunnableC1718d;
import w3.RunnableC1754v;
import w3.V0;
import w3.k1;
import w3.r1;
import w3.v1;
import w3.w1;
import w3.z1;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f249o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f250p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f251q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f252r;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i7) {
        this.f249o = i7;
        this.f250p = obj;
        this.f251q = obj2;
        this.f252r = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [D2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [H2.E, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objL;
        String str;
        v1 v1Var;
        switch (this.f249o) {
            case 0:
                e0 e0Var = (e0) this.f250p;
                e0Var.getClass();
                E4.b0 b0VarF = ((E4.F) this.f251q).f();
                B2.i iVar = e0Var.f257c;
                N n7 = iVar.f761u;
                n7.getClass();
                B2.h hVar = iVar.f758r;
                hVar.getClass();
                hVar.f750b = E4.I.p(b0VarF);
                if (!b0VarF.isEmpty()) {
                    hVar.f753e = (H2.A) b0VarF.get(0);
                    H2.A a4 = (H2.A) this.f252r;
                    a4.getClass();
                    hVar.f754f = a4;
                }
                if (((H2.A) hVar.f752d) == null) {
                    hVar.f752d = B2.h.d(n7, (E4.I) hVar.f750b, (H2.A) hVar.f753e, (t2.e0) hVar.f749a);
                }
                hVar.i(n7.m0());
                return;
            case 1:
                B2.i iVar2 = ((n0) ((V.o) this.f250p).f7343q).h;
                Pair pair = (Pair) this.f251q;
                iVar2.m(((Integer) pair.first).intValue(), (H2.A) pair.second, (C0205w) this.f252r);
                return;
            case 2:
                B2.i iVar3 = ((n0) ((V.o) this.f250p).f7343q).h;
                Pair pair2 = (Pair) this.f251q;
                iVar3.N(((Integer) pair2.first).intValue(), (H2.A) pair2.second, (Exception) this.f252r);
                return;
            case 3:
                D2.n nVar = (D2.n) this.f250p;
                this.f251q.N(nVar.f1527a, nVar.f1528b, (Exception) this.f252r);
                return;
            case 4:
                D4.i iVar4 = (D4.i) this.f250p;
                this.f251q.m(iVar4.f1582p, (H2.A) iVar4.f1583q, (C0205w) this.f252r);
                return;
            case 5:
                R.h hVar2 = (R.h) this.f250p;
                ActionMode actionModeStartActionMode = hVar2.f6178a.startActionMode(new R.q((R.e) this.f251q), 1);
                AbstractC1209k.a(hVar2.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    ((R.f) this.f252r).close();
                    return;
                }
                return;
            case 6:
                O3.f fVar = (O3.f) this.f250p;
                android.support.v4.media.session.b bVar = (android.support.v4.media.session.b) this.f251q;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f252r;
                fVar.getClass();
                try {
                    T1.r rVarQ = AbstractC0509a.q(fVar.f5626o);
                    if (rVarQ == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    T1.q qVar = (T1.q) rVarQ.f6891a;
                    synchronized (qVar.f6885r) {
                        qVar.f6887t = threadPoolExecutor;
                        break;
                    }
                    rVarQ.f6891a.a(new T1.l(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bVar.y(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 7:
                C1220v c1220v = (C1220v) this.f250p;
                C1219u c1219u = (C1219u) this.f251q;
                YosPlaybackService yosPlaybackService = (YosPlaybackService) this.f252r;
                C1760y c1760y = b6.i.f10423c;
                Boolean boolValueOf = c1760y != null ? Boolean.valueOf(c1760y.L()) : null;
                c1220v.f14439o = boolValueOf;
                try {
                    if (AbstractC1209k.a(boolValueOf, Boolean.TRUE)) {
                        C1760y c1760y2 = b6.i.f10423c;
                        c1219u.f14438o = c1760y2 != null ? c1760y2.F0() : 0L;
                        List list = (List) a6.d.f8891a.getValue();
                        if (list.isEmpty()) {
                            YosPlaybackService.j(yosPlaybackService, -2);
                        } else {
                            Iterator it = list.iterator();
                            int i7 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    int i8 = i7 + 1;
                                    d6.f fVar2 = (d6.f) it.next();
                                    long j3 = fVar2.f11291p;
                                    long j7 = fVar2.f11292q;
                                    if (j3 != j7) {
                                        long j8 = j3 + 1;
                                        long j9 = c1219u.f14438o;
                                        if (j8 > j9 || j9 >= j7) {
                                            i7 = i8;
                                        }
                                    } else if (c1219u.f14438o <= j3 || i7 != list.size() - 1 || !fVar2.f11294s.isEmpty()) {
                                        i7 = i8;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 != -1 && i7 != yosPlaybackService.f20586z) {
                                YosPlaybackService.j(yosPlaybackService, i7);
                            }
                        }
                    }
                    objL = Y4.o.f8736a;
                    break;
                } catch (Throwable th2) {
                    objL = android.support.v4.media.session.b.l(th2);
                }
                Throwable thA = Y4.k.a(objL);
                if (thA != null) {
                    thA.toString();
                    System.out.getClass();
                    return;
                }
                return;
            case 8:
                I4.y yVar = (I4.y) this.f250p;
                I4.E e7 = (I4.E) this.f251q;
                try {
                    try {
                        e7.n(((I4.q) this.f252r).apply(M3.a.O(yVar)));
                        return;
                    } catch (Throwable th3) {
                        e7.m(th3);
                        return;
                    }
                } catch (Error e8) {
                    e = e8;
                    e7.m(e);
                    return;
                } catch (CancellationException unused) {
                    e7.cancel(false);
                    return;
                } catch (RuntimeException e9) {
                    e = e9;
                    e7.m(e);
                    return;
                } catch (ExecutionException e10) {
                    e = e10;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e7.m(e);
                    return;
                }
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                I4.E e11 = (I4.E) this.f250p;
                RunnableC0022x runnableC0022x = (RunnableC0022x) this.f251q;
                z1 z1Var = (z1) this.f252r;
                try {
                    if (e11.f3528o instanceof C0226a) {
                        return;
                    }
                    runnableC0022x.run();
                    e11.l(z1Var);
                    return;
                } catch (Throwable th4) {
                    e11.m(th4);
                    return;
                }
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1760y c1760y3 = (C1760y) this.f250p;
                c1760y3.R0();
                InterfaceC1758x interfaceC1758x = c1760y3.f19399c;
                E4.p0 it2 = (!interfaceC1758x.H0() ? w1.f19385b : interfaceC1758x.I0()).f19387a.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    str = (String) this.f251q;
                    if (zHasNext) {
                        v1Var = (v1) it2.next();
                        if (v1Var.f19382a != 0 || !v1Var.f19383b.equals(str)) {
                        }
                    } else {
                        v1Var = null;
                    }
                }
                if (v1Var != null) {
                    c1760y3.R0();
                    w1 w1VarI0 = !interfaceC1758x.H0() ? w1.f19385b : interfaceC1758x.I0();
                    w1VarI0.getClass();
                    if (w1VarI0.f19387a.contains(v1Var)) {
                        v1 v1Var2 = new v1(str, (Bundle) this.f252r);
                        Bundle bundle = Bundle.EMPTY;
                        c1760y3.R0();
                        I4.y yVarJ0 = interfaceC1758x.H0() ? interfaceC1758x.J0(v1Var2) : M3.a.U(new z1(-100));
                        yVarJ0.b(new I4.t(yVarJ0, 0, new B5.u(str, 8)), I4.r.f3531o);
                        return;
                    }
                    return;
                }
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                A0 a0 = (A0) this.f250p;
                a0.getClass();
                ((Runnable) this.f251q).run();
                a0.f18904g.f19226e.K((C1747r0) this.f252r);
                return;
            case 12:
                HandlerC1759x0 handlerC1759x0 = (HandlerC1759x0) this.f250p;
                A0 a02 = (A0) handlerC1759x0.f19390c;
                C1747r0 c1747r0 = (C1747r0) this.f251q;
                if (a02.g(c1747r0)) {
                    a02.a((KeyEvent) this.f252r, false);
                } else {
                    x3.f0 f0Var = c1747r0.f19336a;
                    f0Var.getClass();
                    K0 k02 = a02.h;
                    k02.getClass();
                    k02.H(1, new C0(k02, 1), f0Var, true);
                }
                handlerC1759x0.f19389b = null;
                return;
            case 13:
                N0 n02 = (N0) this.f250p;
                n02.getClass();
                C1116d c1116d = (C1116d) this.f251q;
                HashMap map = (HashMap) c1116d.f13889i;
                C1751t0 c1751t0 = (C1751t0) this.f252r;
                if (!map.containsKey(c1751t0)) {
                    N0 n03 = (N0) c1116d.f13884c;
                    b6.u uVar = new b6.u(n03, 1, c1751t0);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    B1 b12 = c1751t0.f19363a.f18906j;
                    n03.getClass();
                    b12.getClass();
                    Bundle bundle3 = Bundle.EMPTY;
                    w2.t.o();
                    Bundle bundle4 = new Bundle(bundle2);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    C1762z c1762z = new C1762z(mainLooper);
                    w2.t.G(new Handler(mainLooper), new RunnableC1754v(c1762z, new C1760y(n03, b12, bundle4, uVar, mainLooper, c1762z, b12.f18932a.o() ? new V1.a(new y2.j(n03)) : null), 0));
                    map.put(c1751t0, c1762z);
                    c1762z.b(new RunnableC1718d(c1116d, c1762z, uVar, c1751t0, 1), (C2.O) c1116d.f13888g);
                }
                c1751t0.f19363a.f18917v = new k.I(18, n02);
                return;
            default:
                A0 a03 = (A0) this.f250p;
                if (a03.h()) {
                    return;
                }
                r1 r1Var = a03.f18914s;
                V0 v02 = (V0) this.f251q;
                C1749s0 c1749s0 = (C1749s0) this.f252r;
                v02.getClass();
                k1.i(r1Var, c1749s0);
                return;
        }
    }

    public /* synthetic */ d0(C1116d c1116d, C1760y c1760y, String str, Bundle bundle) {
        this.f249o = 10;
        this.f250p = c1760y;
        this.f251q = str;
        this.f252r = bundle;
    }

    public /* synthetic */ d0(C1220v c1220v, I4.t tVar, C1219u c1219u, YosPlaybackService yosPlaybackService) {
        this.f249o = 7;
        this.f250p = c1220v;
        this.f251q = c1219u;
        this.f252r = yosPlaybackService;
    }
}
