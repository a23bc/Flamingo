package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.f8715u;
        }
        if (!h.f8714t.m(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!h.f8714t.m(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(I4.y r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f8716o
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = Y3.h.f(r6)
            N5.d r0 = Y3.h.f8714t
            boolean r6 = r0.m(r5, r3, r6)
            if (r6 == 0) goto L4f
            Y3.h.c(r5)
            return r2
        L20:
            Y3.e r0 = new Y3.e
            r0.<init>(r5, r6)
            N5.d r4 = Y3.h.f8714t
            boolean r3 = r4.m(r5, r3, r0)
            if (r3 == 0) goto L42
            Y3.i r1 = Y3.i.f8719o     // Catch: java.lang.Throwable -> L33
            r6.b(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            Y3.b r1 = new Y3.b     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            Y3.b r1 = Y3.b.f8696b
        L3c:
            N5.d r6 = Y3.h.f8714t
            r6.m(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f8716o
        L44:
            boolean r2 = r0 instanceof Y3.a
            if (r2 == 0) goto L4f
            Y3.a r0 = (Y3.a) r0
            boolean r0 = r0.f8694a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.j.l(I4.y):boolean");
    }
}
