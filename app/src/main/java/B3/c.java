package B3;

import B5.u;
import G1.I;
import H2.N;
import H2.V;
import I4.t;
import N3.p;
import N3.x;
import R0.C0415x;
import Y1.q;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import d2.C0821i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import m.C1188e;
import m5.AbstractC1209k;
import q.C1321k;
import q.C1334q0;
import s.C1425b;
import t.C1450e;
import x3.C1931p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f820o;

    /* JADX INFO: renamed from: p */
    public final Object f821p;

    public /* synthetic */ c(int i7, Object obj) {
        this.f820o = i7;
        this.f821p = obj;
    }

    private final void b() {
        I5.a aVarC;
        long jNanoTime;
        while (true) {
            I5.d dVar = (I5.d) this.f821p;
            synchronized (dVar) {
                aVarC = dVar.c();
            }
            if (aVarC == null) {
                return;
            }
            I5.c cVar = aVarC.f3544c;
            AbstractC1209k.c(cVar);
            I5.d dVar2 = (I5.d) this.f821p;
            boolean zIsLoggable = I5.d.f3555j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                A.b bVar = cVar.f3548a.f3556a;
                jNanoTime = System.nanoTime();
                N5.d.f(aVarC, cVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                I5.d.a(dVar2, aVarC);
                if (zIsLoggable) {
                    A.b bVar2 = cVar.f3548a.f3556a;
                    N5.d.f(aVarC, cVar, "finished run in ".concat(N5.d.C(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    private final void c() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f821p;
        Object obj = constraintTrackingWorker.f9838p.f9844b.f5135a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            p pVarD = p.d();
            int i7 = ConstraintTrackingWorker.f9867y;
            pVarD.c(new Throwable[0]);
            constraintTrackingWorker.f9871w.j(new N3.l());
            return;
        }
        x xVar = constraintTrackingWorker.f9838p.f9848f;
        Context context = constraintTrackingWorker.f9837o;
        WorkerParameters workerParameters = constraintTrackingWorker.f9868t;
        xVar.getClass();
        ListenableWorker listenableWorkerA = x.a(context, str, workerParameters);
        constraintTrackingWorker.f9872x = listenableWorkerA;
        if (listenableWorkerA == null) {
            p pVarD2 = p.d();
            int i8 = ConstraintTrackingWorker.f9867y;
            pVarD2.b(new Throwable[0]);
            constraintTrackingWorker.f9871w.j(new N3.l());
            return;
        }
        W3.i iVarJ = O3.l.l0(constraintTrackingWorker.f9837o).f5642e.n().j(constraintTrackingWorker.f9838p.f9843a.toString());
        if (iVarJ == null) {
            constraintTrackingWorker.f9871w.j(new N3.l());
            return;
        }
        Context context2 = constraintTrackingWorker.f9837o;
        S3.c cVar = new S3.c(context2, O3.l.l0(context2).f5643f, constraintTrackingWorker);
        cVar.c(Collections.singletonList(iVarJ));
        if (!cVar.a(constraintTrackingWorker.f9838p.f9843a.toString())) {
            p pVarD3 = p.d();
            int i9 = ConstraintTrackingWorker.f9867y;
            pVarD3.b(new Throwable[0]);
            constraintTrackingWorker.f9871w.j(new N3.m());
            return;
        }
        p pVarD4 = p.d();
        int i10 = ConstraintTrackingWorker.f9867y;
        pVarD4.b(new Throwable[0]);
        try {
            Y3.j jVarF = constraintTrackingWorker.f9872x.f();
            jVarF.b(new t(8, constraintTrackingWorker, jVarF, false), constraintTrackingWorker.f9838p.f9846d);
        } catch (Throwable th) {
            p pVarD5 = p.d();
            int i11 = ConstraintTrackingWorker.f9867y;
            pVarD5.b(th);
            synchronized (constraintTrackingWorker.f9869u) {
                try {
                    if (constraintTrackingWorker.f9870v) {
                        p.d().b(new Throwable[0]);
                        constraintTrackingWorker.f9871w.j(new N3.m());
                    } else {
                        constraintTrackingWorker.f9871w.j(new N3.l());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((f) this.f821p).f830c.g(new u("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 2));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((f) this.f821p).f833f.r();
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? A6;
        HashSet hashSetA;
        C1321k c1321k;
        switch (this.f820o) {
            case 0:
                ReentrantReadWriteLock.ReadLock lock = ((f) this.f821p).f830c.h.readLock();
                try {
                    try {
                        lock.lock();
                    } catch (SQLiteException | IllegalStateException unused) {
                        A6 = 0;
                    }
                    if (((f) this.f821p).a()) {
                        A6 = ((f) this.f821p).f831d;
                        if (A6.compareAndSet(true, false) && !((SQLiteDatabase) ((f) this.f821p).f830c.f851c.x().f3474p).inTransaction()) {
                            WorkDatabase_Impl workDatabase_Impl = ((f) this.f821p).f830c;
                            if (workDatabase_Impl.f854f) {
                                try {
                                    I3.b bVarX = workDatabase_Impl.f851c.x();
                                    bVarX.b();
                                    try {
                                        hashSetA = a();
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        bVarX.q();
                                        bVarX.i();
                                        A6 = hashSetA;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVarX.i();
                                        throw th;
                                    }
                                    break;
                                } catch (SQLiteException | IllegalStateException unused2) {
                                }
                            } else {
                                A6 = a();
                            }
                            break;
                        }
                        lock.unlock();
                        if (A6 == 0 || A6.isEmpty()) {
                            return;
                        }
                        synchronized (((f) this.f821p).h) {
                            try {
                                C1425b c1425b = (C1425b) ((f) this.f821p).h.iterator();
                                if (c1425b.hasNext()) {
                                    ((e) ((Map.Entry) c1425b.next()).getValue()).getClass();
                                    throw null;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            case 1:
                b();
                return;
            case 2:
                K1.d dVar = (K1.d) this.f821p;
                if (dVar.f3951C) {
                    boolean z6 = dVar.f3949A;
                    K1.a aVar = dVar.f3954o;
                    if (z6) {
                        dVar.f3949A = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3944e = jCurrentAnimationTimeMillis;
                        aVar.f3946g = -1L;
                        aVar.f3945f = jCurrentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f3946g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3946g + ((long) aVar.f3947i)) || !dVar.e()) {
                        dVar.f3951C = false;
                        return;
                    }
                    boolean z7 = dVar.f3950B;
                    ListView listView = dVar.f3956q;
                    if (z7) {
                        dVar.f3950B = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f3945f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - aVar.f3945f;
                    aVar.f3945f = jCurrentAnimationTimeMillis2;
                    dVar.f3953E.scrollListBy((int) (j3 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f3943d));
                    WeakHashMap weakHashMap = I.f2641a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                N n7 = (N) this.f821p;
                V[] vArr = n7.f3030H;
                int length = vArr.length;
                while (i < length) {
                    V v3 = vArr[i];
                    v3.p(true);
                    D2.k kVar = v3.h;
                    if (kVar != null) {
                        kVar.c(v3.f3093e);
                        v3.h = null;
                        v3.f3095g = null;
                    }
                    i++;
                }
                A0.b bVar = n7.f3023A;
                N2.m mVar = (N2.m) bVar.f51q;
                if (mVar != null) {
                    mVar.a();
                    bVar.f51q = null;
                }
                bVar.f52r = null;
                return;
            case 4:
                if (((CoroutineWorker) this.f821p).f9835u.f8716o instanceof Y3.a) {
                    ((CoroutineWorker) this.f821p).f9834t.c(null);
                    return;
                }
                return;
            case 5:
                Worker worker = (Worker) this.f821p;
                try {
                    worker.f9842t.j(worker.h());
                    return;
                } catch (Throwable th3) {
                    worker.f9842t.k(th3);
                    return;
                }
            case 6:
                C0415x c0415x = (C0415x) this.f821p;
                c0415x.removeCallbacks(this);
                MotionEvent motionEvent = c0415x.f6574G0;
                if (motionEvent != null) {
                    i = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (i != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i7 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i7 = 2;
                    }
                    C0415x c0415x2 = (C0415x) this.f821p;
                    c0415x2.M(motionEvent, i7, c0415x2.f6576H0, false);
                    return;
                }
                return;
            case 7:
                ((q) this.f821p).e(true);
                return;
            case 8:
                c();
                return;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                C1188e c1188e = (C1188e) this.f821p;
                c1188e.a(true);
                c1188e.invalidateSelf();
                return;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                C1334q0 c1334q0 = (C1334q0) this.f821p;
                c1334q0.f15383z = null;
                c1334q0.drawableStateChanged();
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f821p;
                if (searchView$SearchAutoComplete.f9055t) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f9055t = false;
                    return;
                }
                return;
            case 12:
                ActionMenuView actionMenuView = ((Toolbar) this.f821p).f9086o;
                if (actionMenuView == null || (c1321k = actionMenuView.f9035H) == null) {
                    return;
                }
                c1321k.l();
                return;
            default:
                C1931p c1931p = (C1931p) this.f821p;
                C1450e c1450e = c1931p.f20098g.f20128s;
                k.I i8 = c1931p.f20096e;
                i8.getClass();
                c1450e.remove(((Messenger) i8.f13847p).getBinder());
                return;
        }
    }
}
