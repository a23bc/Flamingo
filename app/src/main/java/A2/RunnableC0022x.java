package A2;

import C2.RunnableC0044p;
import I4.C0226a;
import a3.C0519b;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.LongSparseArray;
import com.hchen.superlyricapi.BuildConfig;
import d.AbstractActivityC0759l;
import d.C0743I;
import d.C0753f;
import d2.C0821i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k.C1116d;
import t2.C1487p;
import w2.AbstractC1697a;
import w3.A0;
import w3.C1710a0;
import w3.C1716c0;
import w3.C1747r0;
import w3.C1751t0;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1737m;
import w3.K0;
import w3.i1;
import w3.r1;
import w3.z1;
import x3.BinderC1900B;
import x3.C1899A;
import x3.C1901C;
import x3.InterfaceC1923h;

/* JADX INFO: renamed from: A2.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0022x implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f469o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f470p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f471q;

    public /* synthetic */ RunnableC0022x(Object obj, int i7, Object obj2) {
        this.f469o = i7;
        this.f470p = obj;
        this.f471q = obj2;
    }

    private final void a() {
        V.o oVar = (V.o) this.f470p;
        C0007h c0007h = (C0007h) this.f471q;
        oVar.getClass();
        synchronized (c0007h) {
        }
        C2.r rVar = (C2.r) oVar.f7343q;
        int i7 = w2.t.f18881a;
        B2.i iVar = ((K) rVar).f83a.f135s;
        iVar.Z(iVar.b((H2.A) iVar.f758r.f753e), 1013, new r(26));
    }

    private final void b() {
        V.o oVar = (V.o) this.f470p;
        C0007h c0007h = (C0007h) this.f471q;
        oVar.getClass();
        synchronized (c0007h) {
        }
        L2.y yVar = (L2.y) oVar.f7343q;
        int i7 = w2.t.f18881a;
        B2.i iVar = ((K) yVar).f83a.f135s;
        B2.a aVarB = iVar.b((H2.A) iVar.f758r.f753e);
        iVar.Z(aVarB, 1020, new I(aVarB, c0007h));
    }

    private final void c() {
        C1716c0 c1716c0 = (C1716c0) this.f470p;
        V1.a aVar = new V1.a(c1716c0.f19153a, (x3.Y) this.f471q);
        c1716c0.f19159g = aVar;
        C1710a0 c1710a0 = c1716c0.f19157e;
        Handler handler = c1716c0.f19154b.f19401e;
        if (c1710a0 == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (((Set) aVar.f7390p).add(c1710a0)) {
            if (handler == null) {
                handler = new Handler();
            }
            c1710a0.j(handler);
            C1901C c1901c = (C1901C) aVar.f7389o;
            MediaController mediaController = c1901c.f19973a;
            C1899A c1899a = c1710a0.f19130a;
            c1899a.getClass();
            mediaController.registerCallback(c1899a, handler);
            synchronized (c1901c.f19974b) {
                InterfaceC1923h interfaceC1923hA = c1901c.f19977e.a();
                if (interfaceC1923hA != null) {
                    BinderC1900B binderC1900B = new BinderC1900B(c1710a0);
                    c1901c.f19976d.put(c1710a0, binderC1900B);
                    c1710a0.f19132c = binderC1900B;
                    try {
                        interfaceC1923hA.D0(binderC1900B);
                        c1710a0.i(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    c1710a0.f19132c = null;
                    c1901c.f19975c.add(c1710a0);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z6;
        z1 z1Var;
        long j7 = -9223372036854775807L;
        boolean z7 = true;
        z7 = true;
        boolean z8 = false;
        switch (this.f469o) {
            case 0:
                N n7 = (N) this.f470p;
                S s7 = (S) this.f471q;
                int i7 = n7.f97I - s7.f152a;
                n7.f97I = i7;
                if (s7.f154c) {
                    n7.f98J = s7.f155d;
                    n7.f99K = true;
                }
                if (i7 == 0) {
                    t2.h0 h0Var = ((o0) s7.f156e).f389a;
                    if (!n7.f123g0.f389a.p() && h0Var.p()) {
                        n7.f124h0 = -1;
                        n7.f126i0 = 0L;
                    }
                    if (!h0Var.p()) {
                        List listAsList = Arrays.asList(((t0) h0Var).f449k);
                        AbstractC1697a.i(listAsList.size() == n7.f132p.size());
                        for (int i8 = 0; i8 < listAsList.size(); i8++) {
                            ((M) n7.f132p.get(i8)).f88c = (t2.h0) listAsList.get(i8);
                        }
                    }
                    if (n7.f99K) {
                        if (((o0) s7.f156e).f390b.equals(n7.f123g0.f390b) && ((o0) s7.f156e).f392d == n7.f123g0.f405s) {
                            z7 = false;
                        }
                        if (z7) {
                            if (h0Var.p() || ((o0) s7.f156e).f390b.b()) {
                                j7 = ((o0) s7.f156e).f392d;
                            } else {
                                o0 o0Var = (o0) s7.f156e;
                                H2.A a4 = o0Var.f390b;
                                long j8 = o0Var.f392d;
                                Object obj = a4.f2973a;
                                t2.e0 e0Var = n7.f131o;
                                h0Var.g(obj, e0Var);
                                j7 = j8 + e0Var.f16430e;
                            }
                        }
                        j3 = j7;
                        z6 = z7;
                    } else {
                        j3 = -9223372036854775807L;
                        z6 = false;
                    }
                    n7.f99K = false;
                    n7.v1((o0) s7.f156e, 1, z6, n7.f98J, j3, -1, false);
                    return;
                }
                return;
            case 1:
                r0 r0Var = (r0) this.f471q;
                ((V) this.f470p).getClass();
                try {
                    synchronized (r0Var) {
                    }
                    try {
                        r0Var.f411a.a(r0Var.f414d, r0Var.f415e);
                        return;
                    } finally {
                        r0Var.b(true);
                    }
                } catch (C0013n e7) {
                    AbstractC1697a.n("Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 2:
                a();
                return;
            case 3:
                A.b bVar = (A.b) this.f470p;
                C2.T t7 = (C2.T) this.f471q;
                switch (bVar.f2o) {
                    case 4:
                        V.o oVar = ((androidx.media3.decoder.ffmpeg.c) bVar.f3p).f9804F;
                        Handler handler = (Handler) oVar.f7342p;
                        if (handler != null) {
                            handler.post(new RunnableC0044p(oVar, t7, 2));
                            return;
                        }
                        return;
                    default:
                        V.o oVar2 = ((C2.V) bVar.f3p).f1076U0;
                        Handler handler2 = (Handler) oVar2.f7342p;
                        if (handler2 != null) {
                            handler2.post(new RunnableC0044p(oVar2, t7, 2));
                            return;
                        }
                        return;
                }
            case 4:
                D2.h hVar = (D2.h) this.f470p;
                D2.i iVar = hVar.f1497r;
                if (iVar.f1500C == 0 || hVar.f1496q) {
                    return;
                }
                Looper looper = iVar.f1504G;
                looper.getClass();
                hVar.f1495p = iVar.d(looper, hVar.f1494o, (C1487p) this.f471q, false);
                iVar.f1498A.add(hVar);
                return;
            case 5:
                H2.N n8 = (H2.N) this.f470p;
                C0519b c0519b = n8.f3029G;
                N2.B b7 = (N2.B) this.f471q;
                n8.f3037O = c0519b == null ? b7 : new N2.r(-9223372036854775807L);
                n8.f3038P = b7.l();
                if (!n8.f3044V && b7.l() == -9223372036854775807L) {
                    z8 = true;
                }
                n8.f3039Q = z8;
                n8.f3040R = z8 ? 7 : 1;
                if (n8.f3033K) {
                    n8.f3054u.u(n8.f3038P, b7.h(), n8.f3039Q);
                    return;
                } else {
                    n8.v();
                    return;
                }
            case 6:
                V.o oVar3 = (V.o) this.f470p;
                oVar3.getClass();
                int i9 = w2.t.f18881a;
                N n9 = ((K) ((L2.y) oVar3.f7343q)).f83a;
                t2.s0 s0Var = (t2.s0) this.f471q;
                n9.f119e0 = s0Var;
                n9.f129m.f(25, new J(s0Var));
                return;
            case 7:
                b();
                return;
            case 8:
                AbstractActivityC0759l abstractActivityC0759l = (AbstractActivityC0759l) this.f470p;
                C0743I c0743i = (C0743I) this.f471q;
                int i10 = AbstractActivityC0759l.f10777G;
                abstractActivityC0759l.f17150o.a(new C0753f(c0743i, abstractActivityC0759l));
                return;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                Runnable runnable = (Runnable) this.f471q;
                k.m mVar = (k.m) this.f470p;
                mVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    mVar.a();
                }
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                j0.k.t((t0.c) this.f470p, (LongSparseArray) this.f471q);
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                ((K2.f) this.f471q).a(((w2.l) this.f470p).c());
                return;
            case 12:
                I4.E e8 = (I4.E) this.f470p;
                I4.y yVar = (I4.y) this.f471q;
                if (e8.f3528o instanceof C0226a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 13:
                c();
                return;
            case 14:
                w3.U u7 = (w3.U) this.f470p;
                if (u7.f19069m) {
                    return;
                }
                ((InterfaceC1722e0) this.f471q).h(u7);
                return;
            case 15:
                A0 a0 = (A0) this.f470p;
                K0 k02 = a0.h;
                r1 r1Var = (r1) this.f471q;
                a0.f18914s = r1Var;
                b6.u uVar = new b6.u(a0, r1Var);
                r1Var.A(uVar);
                a0.f18916u = uVar;
                try {
                    k02.f19003i.o(0, r1Var);
                    break;
                } catch (RemoteException e9) {
                    AbstractC1697a.n("Exception in using media1 API", e9);
                }
                x3.Z z9 = k02.f19005k;
                z9.f20025a.f20005a.setActive(true);
                Iterator it = z9.f20027c.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                a0.f18913r = r1Var.c1();
                a0.e(r1Var.y());
                return;
            case 16:
                ((A0) this.f470p).getClass();
                ((Runnable) this.f471q).run();
                return;
            case 17:
                ((I4.E) this.f471q).l(Boolean.valueOf(((A0) this.f470p).n()));
                return;
            case 18:
                try {
                    z1Var = (z1) ((I4.y) this.f470p).get();
                    AbstractC1697a.g(z1Var, "SessionResult must not be null");
                    break;
                } catch (InterruptedException e10) {
                    e = e10;
                    AbstractC1697a.x("Custom command failed", e);
                    z1Var = new z1(-1);
                } catch (CancellationException e11) {
                    AbstractC1697a.x("Custom command cancelled", e11);
                    z1Var = new z1(1);
                } catch (ExecutionException e12) {
                    e = e12;
                    AbstractC1697a.x("Custom command failed", e);
                    z1Var = new z1(-1);
                }
                ((ResultReceiver) this.f471q).send(z1Var.f19433a, z1Var.f19434b);
                return;
            case 19:
                A0 a02 = (A0) this.f470p;
                C1747r0 c1747r0D = a02.d();
                Intent intent = (Intent) this.f471q;
                if (c1747r0D == null) {
                    ComponentName component = intent.getComponent();
                    c1747r0D = new C1747r0(new x3.f0(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1004000300, 6, false, null, Bundle.EMPTY);
                }
                if (a02.m(c1747r0D, intent)) {
                    return;
                }
                AbstractC1697a.l("Ignored unrecognized media button intent.");
                return;
            case BuildConfig.API_VERSION /* 20 */:
                HashMap map = (HashMap) ((C1116d) this.f470p).f13889i;
                C1751t0 c1751t0 = (C1751t0) this.f471q;
                I4.y yVar2 = (I4.y) map.remove(c1751t0);
                if (yVar2 != null && !yVar2.cancel(false)) {
                    try {
                        ((C1760y) M3.a.O(yVar2)).a();
                    } catch (CancellationException | ExecutionException e13) {
                        AbstractC1697a.x("MediaController future failed (so we couldn't release it)", e13);
                    }
                }
                c1751t0.f19363a.f18917v = null;
                return;
            case 21:
                i1 i1Var = (i1) this.f470p;
                i1Var.getClass();
                IBinder iBinderAsBinder = ((InterfaceC1737m) this.f471q).asBinder();
                U3.h hVar2 = i1Var.f19226e;
                C1747r0 c1747r0S = hVar2.S(iBinderAsBinder);
                if (c1747r0S != null) {
                    hVar2.k0(c1747r0S);
                    return;
                }
                return;
            case 22:
                ((i1) this.f470p).f19226e.K((C1747r0) this.f471q);
                return;
            default:
                ((d1.e) this.f470p).n((Typeface) this.f471q);
                return;
        }
    }

    public /* synthetic */ RunnableC0022x(A0 a0, C1747r0 c1747r0, Runnable runnable) {
        this.f469o = 16;
        this.f470p = a0;
        this.f471q = runnable;
    }
}
