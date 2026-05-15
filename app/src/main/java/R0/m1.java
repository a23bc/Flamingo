package R0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f6486a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:52:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final R0.l1 a(R0.AbstractC0370a r6, f0.AbstractC0918w r7, n0.d r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = R0.AbstractC0420z0.f6651a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            y5.c r0 = y5.j.a(r2, r0, r3)
            Y4.m r2 = R0.Y.f6387A
            java.lang.Object r2 = r2.getValue()
            c5.i r2 = (c5.i) r2
            B5.d r2 = w5.AbstractC1767D.a(r2)
            R0.y0 r4 = new R0.y0
            r4.<init>(r0, r3)
            r5 = 3
            w5.AbstractC1767D.t(r2, r3, r4, r5)
            B0.b r2 = new B0.b
            r4 = 13
            r2.<init>(r4, r0)
            java.lang.Object r0 = p0.l.f14941c
            monitor-enter(r0)
            java.lang.Object r4 = p0.l.f14946i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = Z4.n.C0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            p0.l.f14946i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            p0.l.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof R0.C0415x
            if (r1 == 0) goto L50
            R0.x r0 = (R0.C0415x) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            R0.x r0 = new R0.x
            android.content.Context r1 = r6.getContext()
            c5.i r2 = r7.j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = R0.m1.f6486a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2131231030(0x7f080136, float:1.807813E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof R0.l1
            if (r2 == 0) goto L80
            r3 = r6
            R0.l1 r3 = (R0.l1) r3
        L80:
            if (r3 != 0) goto L9c
            R0.l1 r3 = new R0.l1
            Q0.G0 r6 = new Q0.G0
            Q0.K r2 = r0.getRoot()
            r6.<init>(r2)
            f0.z r2 = new f0.z
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9c:
            r3.e(r8)
            c5.i r6 = r0.getCoroutineContext()
            c5.i r8 = r7.j()
            boolean r6 = m5.AbstractC1209k.a(r6, r8)
            if (r6 != 0) goto Lb4
            c5.i r6 = r7.j()
            r0.setCoroutineContext(r6)
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.m1.a(R0.a, f0.w, n0.d):R0.l1");
    }
}
