package p0;

import A2.I;
import A2.W;
import D.D0;
import D.J;
import f0.AbstractC0908q0;
import f0.AbstractC0914u;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1182c f14971a;

    /* JADX INFO: renamed from: c */
    public boolean f14973c;
    public I h;

    /* JADX INFO: renamed from: i */
    public t f14978i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f14972b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final D0 f14974d = new D0(15, this);

    /* JADX INFO: renamed from: e */
    public final J f14975e = new J(29, this);

    /* JADX INFO: renamed from: f */
    public final h0.e f14976f = new h0.e(new t[16]);

    /* JADX INFO: renamed from: g */
    public final Object f14977g = new Object();

    /* JADX INFO: renamed from: j */
    public long f14979j = -1;

    public u(InterfaceC1182c interfaceC1182c) {
        this.f14971a = interfaceC1182c;
    }

    public final void a() {
        synchronized (this.f14977g) {
            h0.e eVar = this.f14976f;
            Object[] objArr = eVar.f12546o;
            int i7 = eVar.f12548q;
            for (int i8 = 0; i8 < i7; i8++) {
                t tVar = (t) objArr[i8];
                tVar.f14965e.a();
                tVar.f14966f.a();
                tVar.f14970k.a();
                tVar.l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f14977g
            monitor-enter(r2)
            h0.e r3 = r1.f14976f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.f12548q     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L98
            java.lang.Object[] r8 = r3.f12546o     // Catch: java.lang.Throwable -> L90
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            p0.t r8 = (p0.t) r8     // Catch: java.lang.Throwable -> L90
            t.J r9 = r8.f14966f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            t.E r9 = (t.C1443E) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f15978b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.f15979c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.f15977a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            t.J r1 = r8.f14966f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.f12546o     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La3
        L92:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L98:
            java.lang.Object[] r0 = r3.f12546o     // Catch: java.lang.Throwable -> L90
            int r1 = r4 - r7
            Z4.l.d0(r0, r1, r4)     // Catch: java.lang.Throwable -> L90
            r3.f12548q = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La3:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.u.b(java.lang.Object):void");
    }

    public final boolean c() {
        boolean z6;
        Set set;
        synchronized (this.f14977g) {
            z6 = this.f14973c;
        }
        if (z6) {
            return false;
        }
        boolean z7 = false;
        while (true) {
            AtomicReference atomicReference = this.f14972b;
            Object obj = atomicReference.get();
            Set set2 = null;
            Object obj2 = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0914u.d("Unexpected notification");
                        throw new W();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z7;
            }
            synchronized (this.f14977g) {
                h0.e eVar = this.f14976f;
                Object[] objArr = eVar.f12546o;
                int i7 = eVar.f12548q;
                for (int i8 = 0; i8 < i7; i8++) {
                    z7 = ((t) objArr[i8]).b(set2) || z7;
                }
            }
        }
    }

    public final void d(Object obj, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a) {
        Object obj2;
        t tVar;
        synchronized (this.f14977g) {
            h0.e eVar = this.f14976f;
            Object[] objArr = eVar.f12546o;
            int i7 = eVar.f12548q;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i8];
                if (((t) obj2).f14961a == interfaceC1182c) {
                    break;
                } else {
                    i8++;
                }
            }
            tVar = (t) obj2;
            if (tVar == null) {
                AbstractC1209k.d(interfaceC1182c, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC1223y.c(1, interfaceC1182c);
                tVar = new t(interfaceC1182c);
                eVar.b(tVar);
            }
        }
        t tVar2 = this.f14978i;
        long j3 = this.f14979j;
        if (j3 != -1 && j3 != n0.e.c()) {
            AbstractC0908q0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + n0.e.c() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f14978i = tVar;
            this.f14979j = n0.e.c();
            tVar.a(obj, this.f14975e, interfaceC1180a);
        } finally {
            this.f14978i = tVar2;
            this.f14979j = j3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        D0 d02 = this.f14974d;
        l.f(l.f14939a);
        synchronized (l.f14941c) {
            l.h = Z4.n.C0(l.h, d02);
        }
        this.h = new I(20, d02);
    }
}
