package A5;

import d5.EnumC0830a;
import z5.InterfaceC2110e;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC2110e f552r;

    public i(InterfaceC2110e interfaceC2110e, c5.i iVar, int i7, y5.a aVar) {
        super(iVar, i7, aVar);
        this.f552r = interfaceC2110e;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // A5.g, z5.InterfaceC2110e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(z5.InterfaceC2111f r6, c5.d r7) {
        /*
            r5 = this;
            Y4.o r0 = Y4.o.f8736a
            int r1 = r5.f547p
            r2 = -3
            if (r1 != r2) goto L6e
            c5.i r1 = r7.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            w5.u r3 = w5.C1802u.f19574r
            c5.i r4 = r5.f546o
            java.lang.Object r2 = r4.y(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L22
            c5.i r2 = r1.h(r4)
            goto L27
        L22:
            r2 = 0
            c5.i r2 = w5.AbstractC1767D.k(r1, r4, r2)
        L27:
            boolean r3 = m5.AbstractC1209k.a(r2, r1)
            if (r3 == 0) goto L36
            java.lang.Object r6 = r5.f(r6, r7)
            d5.a r7 = d5.EnumC0830a.f11264o
            if (r6 != r7) goto L77
            return r6
        L36:
            c5.e r3 = c5.e.f10684o
            c5.g r4 = r2.n(r3)
            c5.g r1 = r1.n(r3)
            boolean r1 = m5.AbstractC1209k.a(r4, r1)
            if (r1 == 0) goto L6e
            c5.i r1 = r7.getContext()
            boolean r3 = r6 instanceof A5.z
            if (r3 == 0) goto L50
            r3 = 1
            goto L52
        L50:
            boolean r3 = r6 instanceof A5.t
        L52:
            if (r3 == 0) goto L55
            goto L5b
        L55:
            A5.D r3 = new A5.D
            r3.<init>(r6, r1)
            r6 = r3
        L5b:
            A5.h r1 = new A5.h
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r3 = B5.a.l(r2)
            java.lang.Object r6 = A5.AbstractC0027c.a(r2, r6, r3, r1, r7)
            d5.a r7 = d5.EnumC0830a.f11264o
            if (r6 != r7) goto L77
            return r6
        L6e:
            java.lang.Object r6 = super.b(r6, r7)
            d5.a r7 = d5.EnumC0830a.f11264o
            if (r6 != r7) goto L77
            return r6
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.i.b(z5.f, c5.d):java.lang.Object");
    }

    @Override // A5.g
    public final Object c(y5.p pVar, f fVar) {
        Object objF = f(new z(pVar), fVar);
        return objF == EnumC0830a.f11264o ? objF : Y4.o.f8736a;
    }

    public abstract Object f(InterfaceC2111f interfaceC2111f, c5.d dVar);

    @Override // A5.g
    public final String toString() {
        return this.f552r + " -> " + super.toString();
    }
}
