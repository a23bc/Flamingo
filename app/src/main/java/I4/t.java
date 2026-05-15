package I4;

import A2.d0;
import android.app.Activity;
import android.app.Application;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import d2.C0821i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k.I;
import m5.AbstractC1209k;
import m5.C1219u;
import m5.C1220v;
import u1.C1530b;
import w5.AbstractC1767D;
import w5.AbstractC1805x;
import w5.C1793k;
import x3.C1932q;
import x3.InterfaceC1923h;
import x3.Y;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f3533o;

    /* JADX INFO: renamed from: p */
    public Object f3534p;

    /* JADX INFO: renamed from: q */
    public final Object f3535q;

    public /* synthetic */ t(int i7, Object obj, Object obj2, boolean z6) {
        this.f3533o = i7;
        this.f3535q = obj;
        this.f3534p = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Throwable th = null;
        int i7 = 0;
        switch (this.f3533o) {
            case 0:
                y yVar = (y) this.f3534p;
                boolean z6 = yVar instanceof J4.a;
                s sVar = (s) this.f3535q;
                if (z6) {
                    p pVar = (p) ((J4.a) yVar);
                    pVar.getClass();
                    if (pVar instanceof h) {
                        Object obj = pVar.f3528o;
                        if (obj instanceof C0228c) {
                            th = ((C0228c) obj).f3504a;
                        }
                    }
                    if (th != null) {
                        sVar.f(th);
                        return;
                    }
                }
                try {
                    sVar.g(M3.a.O(yVar));
                    return;
                } catch (ExecutionException e7) {
                    sVar.f(e7.getCause());
                    return;
                } catch (Throwable th2) {
                    sVar.f(th2);
                    return;
                }
            case 1:
                break;
            case 2:
                d1.e eVar = (d1.e) ((I) this.f3534p).f13847p;
                if (eVar != null) {
                    eVar.n((Typeface) this.f3535q);
                    return;
                }
                return;
            case 3:
                ((C1.h) this.f3534p).c(this.f3535q);
                return;
            case 4:
                O3.m mVar = (O3.m) this.f3535q;
                try {
                    try {
                        N3.o oVar = (N3.o) ((Y3.j) this.f3534p).get();
                        if (oVar == null) {
                            N3.p pVarD = N3.p.d();
                            int i8 = O3.m.f5648G;
                            String str = mVar.f5658r.f7807c;
                            pVarD.c(new Throwable[0]);
                        } else {
                            N3.p pVarD2 = N3.p.d();
                            int i9 = O3.m.f5648G;
                            String.format("%s returned a %s result.", mVar.f5658r.f7807c, oVar);
                            pVarD2.b(new Throwable[0]);
                            mVar.f5661u = oVar;
                        }
                        break;
                    } catch (InterruptedException e8) {
                        e = e8;
                        N3.p pVarD3 = N3.p.d();
                        int i10 = O3.m.f5648G;
                        pVarD3.c(e);
                    } catch (CancellationException e9) {
                        N3.p pVarD4 = N3.p.d();
                        int i11 = O3.m.f5648G;
                        pVarD4.h(e9);
                    } catch (ExecutionException e10) {
                        e = e10;
                        N3.p pVarD32 = N3.p.d();
                        int i102 = O3.m.f5648G;
                        pVarD32.c(e);
                    }
                    mVar.c();
                    return;
                } catch (Throwable th3) {
                    mVar.c();
                    throw th3;
                }
            case 5:
                N3.p pVarD5 = N3.p.d();
                int i12 = P3.a.f5747d;
                W3.i iVar = (W3.i) this.f3534p;
                pVarD5.b(new Throwable[0]);
                ((P3.a) this.f3535q).f5748a.f(iVar);
                return;
            case 6:
                for (T3.b bVar : (ArrayList) this.f3534p) {
                    Object obj2 = ((U3.d) this.f3535q).f7035e;
                    bVar.f6939b = obj2;
                    bVar.d(bVar.f6941d, obj2);
                }
                return;
            case 7:
                X3.g gVar = (X3.g) this.f3534p;
                try {
                    ((Runnable) this.f3535q).run();
                    return;
                } finally {
                    gVar.b();
                }
            case 8:
                synchronized (((ConstraintTrackingWorker) this.f3535q).f9869u) {
                    if (((ConstraintTrackingWorker) this.f3535q).f9870v) {
                        ((ConstraintTrackingWorker) this.f3535q).f9871w.j(new N3.m());
                    } else {
                        ((ConstraintTrackingWorker) this.f3535q).f9871w.l((y) this.f3534p);
                    }
                    break;
                }
                return;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                Y4.m mVar2 = (Y4.m) this.f3534p;
                YosPlaybackService yosPlaybackService = (YosPlaybackService) this.f3535q;
                try {
                    C1220v c1220v = new C1220v();
                    C1219u c1219u = new C1219u();
                    int i13 = YosPlaybackService.f20580B;
                    ((Handler) mVar2.getValue()).post(new d0(c1220v, this, c1219u, yosPlaybackService));
                    ((Handler) mVar2.getValue()).postDelayed(this, 10L);
                    return;
                } catch (Throwable th4) {
                    android.support.v4.media.session.b.l(th4);
                    return;
                }
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                Y3.j jVar = (Y3.j) this.f3534p;
                boolean z7 = jVar.f8716o instanceof Y3.a;
                C1793k c1793k = (C1793k) this.f3535q;
                if (z7) {
                    c1793k.l(null);
                    return;
                }
                try {
                    c1793k.resumeWith(s1.g.f(jVar));
                    return;
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    if (cause != null) {
                        c1793k.resumeWith(android.support.v4.media.session.b.l(cause));
                        return;
                    } else {
                        Y4.d dVar = new Y4.d();
                        AbstractC1209k.k(dVar, AbstractC1209k.class.getName());
                        throw dVar;
                    }
                }
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                try {
                    Window window = ((Activity) this.f3534p).getWindow();
                    if (window != null) {
                        window.setSoftInputMode(((Integer) this.f3535q).intValue());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((C1530b) this.f3534p).f17136a = this.f3535q;
                return;
            case 13:
                ((Application) this.f3534p).unregisterActivityLifecycleCallbacks((C1530b) this.f3535q);
                return;
            case 14:
                try {
                    Method method = u1.c.f17145d;
                    Object obj3 = this.f3535q;
                    Object obj4 = this.f3534p;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        u1.c.f17146e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 15:
                F5.t tVar = (F5.t) this.f3535q;
                ArrayList arrayList = (ArrayList) tVar.f2441p;
                boolean zIsEmpty = arrayList.isEmpty();
                Y y6 = (Y) this.f3534p;
                if (!zIsEmpty) {
                    InterfaceC1923h interfaceC1923hA = y6.a();
                    if (interfaceC1923hA != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Bundle) it.next()).putBinder("extra_session_binder", interfaceC1923hA.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                C1932q c1932q = (C1932q) tVar.f2442q;
                c1932q.getClass();
                MediaSession.Token token = (MediaSession.Token) y6.f20021p;
                token.getClass();
                c1932q.setSessionToken(token);
                return;
            default:
                ((C1793k) this.f3534p).B((x5.d) this.f3535q);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f3534p).run();
            } catch (Throwable th5) {
                AbstractC1767D.p(c5.j.f10685o, th5);
            }
            B5.h hVar = (B5.h) this.f3535q;
            Runnable runnableE = hVar.E();
            if (runnableE == null) {
                return;
            }
            this.f3534p = runnableE;
            i7++;
            if (i7 >= 16) {
                AbstractC1805x abstractC1805x = hVar.f894q;
                if (abstractC1805x.C()) {
                    abstractC1805x.A(hVar, this);
                    return;
                }
            }
        }
    }

    public String toString() {
        switch (this.f3533o) {
            case 0:
                A0.b bVar = new A0.b(t.class.getSimpleName());
                V.o oVar = new V.o((char) 0, 10);
                ((V.o) bVar.f52r).f7342p = oVar;
                bVar.f52r = oVar;
                oVar.f7343q = (s) this.f3535q;
                return bVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(Object obj, int i7, Object obj2) {
        this.f3533o = i7;
        this.f3534p = obj;
        this.f3535q = obj2;
    }

    public t(Y3.j jVar, C1793k c1793k) {
        this.f3533o = 10;
        if (jVar != null) {
            this.f3534p = jVar;
            this.f3535q = c1793k;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AbstractC1209k.i("futureToObserve"));
            AbstractC1209k.k(illegalArgumentException, AbstractC1209k.class.getName());
            throw illegalArgumentException;
        }
    }

    public t(O3.m mVar, Y3.j jVar, String str) {
        this.f3533o = 4;
        this.f3535q = mVar;
        this.f3534p = jVar;
    }
}
