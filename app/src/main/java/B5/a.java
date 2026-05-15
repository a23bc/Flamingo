package B5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;
import u5.AbstractC1552n;
import w5.InterfaceC1807z;
import w5.z0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    public static final u f876a = new u("NO_DECISION", 0);

    /* JADX INFO: renamed from: b */
    public static final u f877b = new u("CLOSED", 0);

    /* JADX INFO: renamed from: c */
    public static final u f878c = new u("UNDEFINED", 0);

    /* JADX INFO: renamed from: d */
    public static final u f879d = new u("REUSABLE_CLAIMED", 0);

    /* JADX INFO: renamed from: e */
    public static final u f880e = new u("CONDITION_FALSE", 0);

    /* JADX INFO: renamed from: f */
    public static final u f881f = new u("NO_THREAD_ELEMENTS", 0);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(n1.c.s(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j3, l5.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (sVar.f916c >= j3 && !sVar.d()) {
                return sVar;
            }
            Object obj = c.f883a.get(sVar);
            u uVar = f877b;
            if (obj == uVar) {
                return uVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) eVar.invoke(Long.valueOf(sVar.f916c + 1), sVar);
                do {
                    atomicReferenceFieldUpdater = c.f883a;
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.d()) {
                            sVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f877b) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(c5.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.f886a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC1807z) it.next()).z(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    N5.l.k(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            N5.l.k(th, new f(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f877b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(c5.i iVar, Object obj) {
        if (obj == f881f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objY = iVar.y(null, w.f922r);
            AbstractC1209k.d(objY, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            A0.e.G(objY);
            throw null;
        }
        y yVar = (y) obj;
        z0[] z0VarArr = yVar.f928b;
        int length = z0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        z0 z0Var = z0VarArr[length];
        AbstractC1209k.c(null);
        Object obj2 = yVar.f927a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x008d A[Catch: all -> 0x006c, DONT_GENERATE, TryCatch #2 {all -> 0x006c, blocks: (B:75:0x0049, B:77:0x0057, B:79:0x005d, B:92:0x0090, B:82:0x006e, B:84:0x007c, B:89:0x0087, B:91:0x008d, B:97:0x009d, B:100:0x00a6, B:99:0x00a3, B:87:0x0082), top: B:113:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(c5.d r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof B5.g
            if (r0 == 0) goto Lb1
            B5.g r9 = (B5.g) r9
            java.lang.Throwable r0 = Y4.k.a(r10)
            if (r0 != 0) goto Le
            r1 = r10
            goto L14
        Le:
            w5.s r1 = new w5.s
            r2 = 0
            r1.<init>(r0, r2)
        L14:
            e5.c r0 = r9.f890s
            r0.getContext()
            w5.x r2 = r9.f889r
            boolean r3 = r2.C()
            r4 = 1
            if (r3 == 0) goto L2e
            r9.f891t = r1
            r9.f19496q = r4
            c5.i r10 = r0.getContext()
            r2.A(r10, r9)
            return
        L2e:
            w5.W r2 = w5.A0.a()
            long r5 = r2.f19512q
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L45
            r9.f891t = r1
            r9.f19496q = r4
            r2.F(r9)
            goto Lab
        L45:
            r2.H(r4)
            r3 = 0
            c5.i r5 = r0.getContext()     // Catch: java.lang.Throwable -> L6c
            w5.y r6 = w5.C1806y.f19581p     // Catch: java.lang.Throwable -> L6c
            c5.g r5 = r5.n(r6)     // Catch: java.lang.Throwable -> L6c
            w5.g0 r5 = (w5.InterfaceC1786g0) r5     // Catch: java.lang.Throwable -> L6c
            if (r5 == 0) goto L6e
            boolean r6 = r5.b()     // Catch: java.lang.Throwable -> L6c
            if (r6 != 0) goto L6e
            java.util.concurrent.CancellationException r10 = r5.q()     // Catch: java.lang.Throwable -> L6c
            r9.b(r1, r10)     // Catch: java.lang.Throwable -> L6c
            Y4.j r10 = android.support.v4.media.session.b.l(r10)     // Catch: java.lang.Throwable -> L6c
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L6c
            goto L90
        L6c:
            r10 = move-exception
            goto La7
        L6e:
            java.lang.Object r1 = r9.f892u     // Catch: java.lang.Throwable -> L6c
            c5.i r5 = r0.getContext()     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = m(r5, r1)     // Catch: java.lang.Throwable -> L6c
            B5.u r6 = B5.a.f881f     // Catch: java.lang.Throwable -> L6c
            if (r1 == r6) goto L81
            w5.G0 r6 = w5.AbstractC1767D.B(r0, r5, r1)     // Catch: java.lang.Throwable -> L6c
            goto L82
        L81:
            r6 = r3
        L82:
            r0.resumeWith(r10)     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L8d
            boolean r10 = r6.i0()     // Catch: java.lang.Throwable -> L6c
            if (r10 == 0) goto L90
        L8d:
            g(r5, r1)     // Catch: java.lang.Throwable -> L6c
        L90:
            boolean r10 = r2.J()     // Catch: java.lang.Throwable -> L6c
            if (r10 != 0) goto L90
        L96:
            r2.E(r4)
            goto Lab
        L9a:
            r10 = move-exception
            if (r6 == 0) goto La3
            boolean r0 = r6.i0()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto La6
        La3:
            g(r5, r1)     // Catch: java.lang.Throwable -> L6c
        La6:
            throw r10     // Catch: java.lang.Throwable -> L6c
        La7:
            r9.g(r10, r3)     // Catch: java.lang.Throwable -> Lac
            goto L96
        Lab:
            return
        Lac:
            r9 = move-exception
            r2.E(r4)
            throw r9
        Lb1:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.a.h(c5.d, java.lang.Object):void");
    }

    public static final long j(String str, long j3, long j7, long j8) {
        String property;
        int i7 = v.f920a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j3;
        }
        Long lM = AbstractC1552n.M(property);
        if (lM == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM.longValue();
        if (j7 <= jLongValue && jLongValue <= j8) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j8 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i7, int i8) {
        return (int) j(str, i7, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object l(c5.i iVar) {
        Object objY = iVar.y(0, w.f921q);
        AbstractC1209k.c(objY);
        return objY;
    }

    public static final Object m(c5.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f881f;
        }
        if (obj instanceof Integer) {
            return iVar.y(new y(((Number) obj).intValue(), iVar), w.f923s);
        }
        A0.e.G(obj);
        throw null;
    }
}
