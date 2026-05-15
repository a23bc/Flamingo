package E5;

import B5.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w5.AbstractC1767D;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = e.f2006a;
    }

    public final boolean c() {
        return Math.max(i.f2013g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = E5.d.h;
        r3 = r0.f2005p;
        r2.set(r3, null);
        r0.f2004o.e(r1, new E5.b(r3, r0, 0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(e5.AbstractC0865c r6) {
        /*
            r5 = this;
            boolean r0 = r5.e()
            Y4.o r1 = Y4.o.f8736a
            if (r0 == 0) goto L9
            goto L49
        L9:
            c5.d r6 = I0.c.D(r6)
            w5.k r6 = w5.AbstractC1767D.o(r6)
            E5.c r0 = new E5.c     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = E5.i.f2013g     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4a
            int r3 = r5.f2014a     // Catch: java.lang.Throwable -> L4a
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L36
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = E5.d.h     // Catch: java.lang.Throwable -> L4a
            E5.d r3 = r0.f2005p     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L4a
            E5.b r2 = new E5.b     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L4a
            w5.k r0 = r0.f2004o     // Catch: java.lang.Throwable -> L4a
            r0.e(r1, r2)     // Catch: java.lang.Throwable -> L4a
            goto L3c
        L36:
            boolean r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L16
        L3c:
            java.lang.Object r6 = r6.q()
            d5.a r0 = d5.EnumC0830a.f11264o
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r1
        L46:
            if (r6 != r0) goto L49
            return r6
        L49:
            return r1
        L4a:
            r0 = move-exception
            r6.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.d.d(e5.c):java.lang.Object");
    }

    public final boolean e() {
        int i7;
        char c7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f2013g;
            int i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = this.f2014a;
            if (i8 > i9) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > i9) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i9));
            } else {
                if (i8 <= 0) {
                    c7 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    h.set(this, null);
                    c7 = 0;
                    break;
                }
            }
        }
        if (c7 == 0) {
            return true;
        }
        if (c7 == 1) {
            return false;
        }
        if (c7 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = e.f2006a;
            if (obj2 != uVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC1767D.m(this) + "[isLocked=" + c() + ",owner=" + h.get(this) + ']';
    }
}
