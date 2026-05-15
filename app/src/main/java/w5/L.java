package w5;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import k5.C1156a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class L extends D5.i {

    /* JADX INFO: renamed from: q */
    public int f19496q;

    public L(int i7) {
        super(0L, D5.k.f1631g);
        this.f19496q = i7;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract c5.d c();

    public Throwable d(Object obj) {
        C1800s c1800s = obj instanceof C1800s ? (C1800s) obj : null;
        if (c1800s != null) {
            return c1800s.f19570a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            N5.l.k(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC1209k.c(th);
        AbstractC1767D.p(c().getContext(), new C1156a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Removed duplicated region for block: B:79:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r13 = this;
            Y4.o r0 = Y4.o.f8736a
            N3.p r1 = r13.f1623p
            c5.d r2 = r13.c()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            m5.AbstractC1209k.d(r2, r3)     // Catch: java.lang.Throwable -> L25
            B5.g r2 = (B5.g) r2     // Catch: java.lang.Throwable -> L25
            e5.c r3 = r2.f890s     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.f892u     // Catch: java.lang.Throwable -> L25
            c5.i r4 = r3.getContext()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = B5.a.m(r4, r2)     // Catch: java.lang.Throwable -> L25
            B5.u r5 = B5.a.f881f     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            w5.G0 r5 = w5.AbstractC1767D.B(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto L9f
        L28:
            r5 = r6
        L29:
            c5.i r7 = r3.getContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.h()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.d(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.f19496q     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            w5.y r10 = w5.C1806y.f19581p     // Catch: java.lang.Throwable -> L4c
            c5.g r7 = r7.n(r10)     // Catch: java.lang.Throwable -> L4c
            w5.g0 r7 = (w5.InterfaceC1786g0) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L93
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L66
            boolean r10 = r7.b()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L66
            java.util.concurrent.CancellationException r7 = r7.q()     // Catch: java.lang.Throwable -> L4c
            r13.b(r8, r7)     // Catch: java.lang.Throwable -> L4c
            Y4.j r7 = android.support.v4.media.session.b.l(r7)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L66:
            if (r9 == 0) goto L70
            Y4.j r7 = android.support.v4.media.session.b.l(r9)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L70:
            java.lang.Object r7 = r13.f(r8)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
        L77:
            if (r5 == 0) goto L7f
            boolean r3 = r5.i0()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L82
        L7f:
            B5.a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L82:
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            Y4.j r0 = android.support.v4.media.session.b.l(r0)
        L8b:
            java.lang.Throwable r0 = Y4.k.a(r0)
            r13.g(r6, r0)
            goto Laf
        L93:
            if (r5 == 0) goto L9b
            boolean r5 = r5.i0()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L9e
        L9b:
            B5.a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L9e:
            throw r3     // Catch: java.lang.Throwable -> L25
        L9f:
            r1.getClass()     // Catch: java.lang.Throwable -> La3
            goto La8
        La3:
            r0 = move-exception
            Y4.j r0 = android.support.v4.media.session.b.l(r0)
        La8:
            java.lang.Throwable r0 = Y4.k.a(r0)
            r13.g(r2, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.L.run():void");
    }

    public Object f(Object obj) {
        return obj;
    }
}
