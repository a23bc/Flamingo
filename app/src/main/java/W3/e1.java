package w3;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements InterfaceC1746q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1737m f19176o;

    public e1(InterfaceC1737m interfaceC1737m) {
        this.f19176o = interfaceC1737m;
    }

    @Override // w3.InterfaceC1746q0
    public final void a() {
        this.f19176o.a();
    }

    @Override // w3.InterfaceC1746q0
    public final void b(int i7, n1 n1Var, t2.T t7, boolean z6, boolean z7, int i8) {
        Bundle bundleT;
        AbstractC1697a.i(i8 != 0);
        boolean z8 = z6 || !t7.a(17);
        boolean z9 = z7 || !t7.a(30);
        InterfaceC1737m interfaceC1737m = this.f19176o;
        if (i8 < 2) {
            interfaceC1737m.Z0(i7, n1Var.q(t7, z6, true).t(i8), z8);
            return;
        }
        n1 n1VarQ = n1Var.q(t7, z6, z7);
        if (interfaceC1737m instanceof BinderC1724f0) {
            bundleT = new Bundle();
            bundleT.putBinder(n1.f19283l0, new m1(n1VarQ));
        } else {
            bundleT = n1VarQ.t(i8);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(l1.f19248d, z8);
        bundle.putBoolean(l1.f19249e, z9);
        interfaceC1737m.h1(i7, bundleT, bundle);
    }

    @Override // w3.InterfaceC1746q0
    public final void c(int i7, z1 z1Var) {
        this.f19176o.l1(i7, z1Var.b());
    }

    @Override // w3.InterfaceC1746q0
    public final void d(int i7, List list) {
        E4.F fO = E4.I.o();
        for (int i8 = 0; i8 < list.size(); i8++) {
            fO.a(((C1709a) list.get(i8)).c());
        }
        this.f19176o.p(i7, fO.f());
    }

    @Override // w3.InterfaceC1746q0
    public final void e(int i7, t2.T t7) {
        this.f19176o.S0(i7, t7.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != e1.class) {
            return false;
        }
        return w2.t.a(this.f19176o.asBinder(), ((e1) obj).f19176o.asBinder());
    }

    @Override // w3.InterfaceC1746q0
    public final void h(int i7) {
        this.f19176o.h(i7);
    }

    public final int hashCode() {
        return Objects.hash(this.f19176o.asBinder());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // w3.InterfaceC1746q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r8, w3.C1750t r9) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = w3.C1750t.f19351g
            int r2 = r9.f19355a
            r0.putInt(r1, r2)
            java.lang.String r1 = w3.C1750t.h
            long r2 = r9.f19356b
            r0.putLong(r1, r2)
            w3.g0 r1 = r9.f19359e
            if (r1 == 0) goto L3d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = w3.C1726g0.f19194e
            android.os.Bundle r4 = r1.f19197a
            r2.putBundle(r3, r4)
            java.lang.String r3 = w3.C1726g0.f19195f
            boolean r4 = r1.f19198b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = w3.C1726g0.f19196g
            boolean r4 = r1.f19199c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = w3.C1726g0.h
            boolean r1 = r1.f19200d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = w3.C1750t.f19352i
            r0.putBundle(r1, r2)
        L3d:
            w3.x1 r1 = r9.f19360f
            if (r1 == 0) goto L4a
            android.os.Bundle r1 = r1.b()
            java.lang.String r2 = w3.C1750t.l
            r0.putBundle(r2, r1)
        L4a:
            java.lang.String r1 = w3.C1750t.f19354k
            int r2 = r9.f19358d
            r0.putInt(r1, r2)
            java.lang.Object r9 = r9.f19357c
            if (r9 != 0) goto L56
            goto L99
        L56:
            r1 = 1
            if (r2 == r1) goto L9f
            java.lang.String r1 = w3.C1750t.f19353j
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L90
            r3 = 3
            if (r2 == r3) goto L66
            r9 = 4
            if (r2 == r9) goto L9f
            goto L99
        L66:
            t2.g r2 = new t2.g
            E4.I r9 = (E4.I) r9
            E4.F r3 = E4.I.o()
            r5 = r4
        L6f:
            int r6 = r9.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r9.get(r5)
            t2.G r6 = (t2.G) r6
            android.os.Bundle r6 = r6.b(r4)
            r3.a(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            E4.b0 r9 = r3.f()
            r2.<init>(r9)
            r0.putBinder(r1, r2)
            goto L99
        L90:
            t2.G r9 = (t2.G) r9
            android.os.Bundle r9 = r9.b(r4)
            r0.putBundle(r1, r9)
        L99:
            w3.m r9 = r7.f19176o
            r9.w(r8, r0)
            return
        L9f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.e1.i(int, w3.t):void");
    }

    @Override // w3.InterfaceC1746q0
    public final void j(int i7, y1 y1Var, boolean z6, boolean z7, int i8) {
        this.f19176o.Y0(i7, y1Var.a(z6, z7).c(i8));
    }
}
