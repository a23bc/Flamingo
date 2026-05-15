package I5;

import A2.x0;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3553f;

    public c(d dVar, String str) {
        AbstractC1209k.f(dVar, "taskRunner");
        AbstractC1209k.f(str, "name");
        this.f3548a = dVar;
        this.f3549b = str;
        this.f3552e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = G5.b.f2765a;
        synchronized (this.f3548a) {
            if (b()) {
                this.f3548a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f3551d;
        if (aVar != null && aVar.f3543b) {
            this.f3553f = true;
        }
        ArrayList arrayList = this.f3552e;
        boolean z6 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f3543b) {
                a aVar2 = (a) arrayList.get(size);
                x0 x0Var = d.h;
                if (d.f3555j.isLoggable(Level.FINE)) {
                    N5.d.f(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    public final void c(a aVar, long j3) {
        AbstractC1209k.f(aVar, "task");
        synchronized (this.f3548a) {
            if (!this.f3550c) {
                if (d(aVar, j3, false)) {
                    this.f3548a.d(this);
                }
            } else if (aVar.f3543b) {
                x0 x0Var = d.h;
                if (d.f3555j.isLoggable(Level.FINE)) {
                    N5.d.f(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                x0 x0Var2 = d.h;
                if (d.f3555j.isLoggable(Level.FINE)) {
                    N5.d.f(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(I5.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "task"
            m5.AbstractC1209k.f(r12, r1)
            I5.c r1 = r12.f3544c
            if (r1 != r11) goto Lb
            goto Lf
        Lb:
            if (r1 != 0) goto L91
            r12.f3544c = r11
        Lf:
            I5.d r1 = r11.f3548a
            A.b r1 = r1.f3556a
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f3552e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L3e
            long r9 = r12.f3545d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L3b
            A2.x0 r13 = I5.d.h
            java.util.logging.Logger r13 = I5.d.f3555j
            java.util.logging.Level r14 = java.util.logging.Level.FINE
            boolean r13 = r13.isLoggable(r14)
            if (r13 == 0) goto L90
            java.lang.String r13 = "already scheduled"
            N5.d.f(r12, r11, r13)
            return r7
        L3b:
            r5.remove(r6)
        L3e:
            r12.f3545d = r3
            A2.x0 r6 = I5.d.h
            java.util.logging.Logger r6 = I5.d.f3555j
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r6 = r6.isLoggable(r9)
            if (r6 == 0) goto L68
            if (r15 == 0) goto L5a
            long r3 = r3 - r1
            java.lang.String r15 = N5.d.C(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L65
        L5a:
            long r3 = r3 - r1
            java.lang.String r15 = N5.d.C(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L65:
            N5.d.f(r12, r11, r15)
        L68:
            java.util.Iterator r15 = r5.iterator()
            r3 = r7
        L6d:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r15.next()
            I5.a r4 = (I5.a) r4
            long r9 = r4.f3545d
            long r9 = r9 - r1
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L81
            goto L84
        L81:
            int r3 = r3 + r0
            goto L6d
        L83:
            r3 = r8
        L84:
            if (r3 != r8) goto L8a
            int r3 = r5.size()
        L8a:
            r5.add(r3, r12)
            if (r3 != 0) goto L90
            return r0
        L90:
            return r7
        L91:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.c.d(I5.a, long, boolean):boolean");
    }

    public final void e() {
        byte[] bArr = G5.b.f2765a;
        synchronized (this.f3548a) {
            this.f3550c = true;
            if (b()) {
                this.f3548a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f3549b;
    }
}
