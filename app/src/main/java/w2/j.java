package w2;

import A2.k0;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import t2.C1485n;
import t2.V;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    public final o f18850a;

    /* JADX INFO: renamed from: b */
    public final q f18851b;

    /* JADX INFO: renamed from: c */
    public final h f18852c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f18853d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f18854e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f18855f;

    /* JADX INFO: renamed from: g */
    public final Object f18856g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public final boolean f18857i;

    public j(Looper looper, o oVar, h hVar) {
        this(new CopyOnWriteArraySet(), looper, oVar, hVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f18856g) {
            try {
                if (this.h) {
                    return;
                }
                this.f18853d.add(new i(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f18855f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        q qVar = this.f18851b;
        if (!qVar.f18876a.hasMessages(1)) {
            qVar.getClass();
            p pVarB = q.b();
            pVarB.f18874a = qVar.f18876a.obtainMessage(1);
            qVar.getClass();
            Message message = pVarB.f18874a;
            message.getClass();
            qVar.f18876a.sendMessageAtFrontOfQueue(message);
            pVarB.a();
        }
        ArrayDeque arrayDeque2 = this.f18854e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i7, g gVar) {
        g();
        this.f18855f.add(new k0(new CopyOnWriteArraySet(this.f18853d), i7, gVar, 5));
    }

    public final void d() {
        g();
        synchronized (this.f18856g) {
            this.h = true;
        }
        for (i iVar : this.f18853d) {
            h hVar = this.f18852c;
            iVar.f18849d = true;
            if (iVar.f18848c) {
                iVar.f18848c = false;
                hVar.d(iVar.f18846a, iVar.f18847b.d());
            }
        }
        this.f18853d.clear();
    }

    public final void e(V v3) {
        g();
        CopyOnWriteArraySet<i> copyOnWriteArraySet = this.f18853d;
        for (i iVar : copyOnWriteArraySet) {
            if (iVar.f18846a.equals(v3)) {
                iVar.f18849d = true;
                if (iVar.f18848c) {
                    iVar.f18848c = false;
                    C1485n c1485nD = iVar.f18847b.d();
                    this.f18852c.d(iVar.f18846a, c1485nD);
                }
                copyOnWriteArraySet.remove(iVar);
            }
        }
    }

    public final void f(int i7, g gVar) {
        c(i7, gVar);
        b();
    }

    public final void g() {
        if (this.f18857i) {
            AbstractC1697a.i(Thread.currentThread() == this.f18851b.f18876a.getLooper().getThread());
        }
    }

    public j(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, o oVar, h hVar, boolean z6) {
        this.f18850a = oVar;
        this.f18853d = copyOnWriteArraySet;
        this.f18852c = hVar;
        this.f18856g = new Object();
        this.f18854e = new ArrayDeque();
        this.f18855f = new ArrayDeque();
        this.f18851b = oVar.a(looper, new com.hchen.superlyricapi.a(1, this));
        this.f18857i = z6;
    }
}
