package y5;

import B5.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B5.s {

    /* JADX INFO: renamed from: e */
    public final c f20567e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f20568f;

    public k(long j3, k kVar, c cVar, int i7) {
        super(j3, kVar, i7);
        this.f20567e = cVar;
        this.f20568f = new AtomicReferenceArray(e.f20547b * 2);
    }

    @Override // B5.s
    public final int g() {
        return e.f20547b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x005e, code lost:
    
        m5.AbstractC1209k.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005c, code lost:
    
        if (r0 == false) goto L124;
     */
    @Override // B5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, c5.i r6) {
        /*
            r4 = this;
            int r6 = y5.e.f20547b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f20568f
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof w5.I0
            y5.c r2 = r4.f20567e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof y5.s
            if (r1 == 0) goto L21
            goto L62
        L21:
            B5.u r1 = y5.e.f20554j
            if (r6 == r1) goto L59
            B5.u r1 = y5.e.f20555k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            B5.u r1 = y5.e.f20552g
            if (r6 == r1) goto L11
            B5.u r1 = y5.e.f20551f
            if (r6 != r1) goto L33
            goto L11
        L33:
            B5.u r5 = y5.e.f20553i
            if (r6 == r5) goto L7c
            B5.u r5 = y5.e.f20549d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            B5.u r5 = y5.e.l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            m5.AbstractC1209k.c(r2)
            return
        L62:
            if (r0 == 0) goto L67
            B5.u r1 = y5.e.f20554j
            goto L69
        L67:
            B5.u r1 = y5.e.f20555k
        L69:
            boolean r6 = r4.k(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            m5.AbstractC1209k.c(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.k.h(int, c5.i):void");
    }

    public final boolean k(Object obj, int i7, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f20568f;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i7) {
        return this.f20568f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z6) {
        if (z6) {
            c cVar = this.f20567e;
            AbstractC1209k.c(cVar);
            cVar.E((this.f916c * ((long) e.f20547b)) + ((long) i7));
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f20568f.set(i7 * 2, obj);
    }

    public final void o(int i7, u uVar) {
        this.f20568f.set((i7 * 2) + 1, uVar);
    }
}
