package y5;

import m5.AbstractC1221w;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f20569y;

    public n(int i7, a aVar) {
        super(i7);
        this.f20569y = aVar;
        if (aVar != a.f20528o) {
            if (i7 < 1) {
                throw new IllegalArgumentException(Z1.l.o(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC1221w.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            y5.a r1 = y5.a.f20530q
            Y4.o r8 = Y4.o.f8736a
            y5.a r2 = r15.f20569y
            if (r2 != r1) goto L17
            java.lang.Object r1 = super.k(r16)
            boolean r2 = r1 instanceof y5.i
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof y5.h
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            B5.u r6 = y5.e.f20549d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = y5.c.f20539t
            java.lang.Object r1 = r1.get(r15)
            y5.k r1 = (y5.k) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = y5.c.f20535p
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.u(r2, r7)
            int r9 = y5.e.f20547b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f916c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            y5.k r2 = y5.c.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = y5.c.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = y5.c.f20536q
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.r()
            y5.h r2 = new y5.h
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof w5.I0
            if (r3 == 0) goto La6
            w5.I0 r6 = (w5.I0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f916c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.l(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.n.F(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // y5.c, y5.r
    public final Object k(Object obj) {
        return F(obj, false);
    }

    @Override // y5.c, y5.r
    public final Object p(c5.d dVar, Object obj) throws Throwable {
        if (F(obj, true) instanceof h) {
            throw r();
        }
        return Y4.o.f8736a;
    }

    @Override // y5.c
    public final boolean v() {
        return this.f20569y == a.f20529p;
    }
}
