package K0;

import Q0.AbstractC0347f;
import Q0.D0;
import Q0.x0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d5.EnumC0830a;
import java.util.ArrayList;
import r0.AbstractC1397o;
import w5.AbstractC1767D;
import w5.C1793k;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import w5.w0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC1397o implements y, n1.d, x0 {

    /* JADX INFO: renamed from: C */
    public Object f3849C;

    /* JADX INFO: renamed from: D */
    public Object f3850D;

    /* JADX INFO: renamed from: E */
    public Object[] f3851E;

    /* JADX INFO: renamed from: F */
    public PointerInputEventHandler f3852F;

    /* JADX INFO: renamed from: G */
    public w0 f3853G;

    /* JADX INFO: renamed from: H */
    public C0245m f3854H = H.f3830a;

    /* JADX INFO: renamed from: I */
    public final h0.e f3855I;

    /* JADX INFO: renamed from: J */
    public final h0.e f3856J;

    /* JADX INFO: renamed from: K */
    public final h0.e f3857K;

    /* JADX INFO: renamed from: L */
    public C0245m f3858L;

    /* JADX INFO: renamed from: M */
    public long f3859M;

    public N(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f3849C = obj;
        this.f3850D = obj2;
        this.f3851E = objArr;
        this.f3852F = pointerInputEventHandler;
        h0.e eVar = new h0.e(new L[16]);
        this.f3855I = eVar;
        this.f3856J = eVar;
        this.f3857K = new h0.e(new L[16]);
        this.f3859M = 0L;
    }

    public final Object B0(l5.e eVar, c5.d dVar) {
        C1793k c1793k = new C1793k(1, I0.c.D(dVar));
        c1793k.r();
        L l = new L(this, c1793k);
        synchronized (this.f3856J) {
            this.f3855I.b(l);
            c5.d dVarD = I0.c.D(I0.c.p(l, l, eVar));
            EnumC0830a enumC0830a = EnumC0830a.f11264o;
            new c5.k(dVarD).resumeWith(Y4.o.f8736a);
        }
        c1793k.t(new B0.b(4, l));
        return c1793k.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:58:0x000d, B:65:0x001b, B:66:0x0020, B:69:0x0023, B:72:0x002f, B:74:0x0037, B:76:0x003b, B:77:0x0040, B:78:0x0043, B:80:0x004c, B:82:0x0054, B:84:0x0058), top: B:93:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C0(K0.C0245m r7, K0.EnumC0246n r8) {
        /*
            r6 = this;
            h0.e r0 = r6.f3856J
            monitor-enter(r0)
            h0.e r1 = r6.f3857K     // Catch: java.lang.Throwable -> L6c
            h0.e r2 = r6.f3855I     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f12548q     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            A2.W r7 = new A2.W     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            h0.e r0 = r6.f3857K     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f12548q     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f12546o     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            K0.L r2 = (K0.L) r2     // Catch: java.lang.Throwable -> L21
            K0.n r4 = r2.f3844r     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            w5.k r4 = r2.f3843q     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f3843q = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            h0.e r0 = r6.f3857K     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f12546o     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f12548q     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            K0.L r4 = (K0.L) r4     // Catch: java.lang.Throwable -> L21
            K0.n r5 = r4.f3844r     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            w5.k r5 = r4.f3843q     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f3843q = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            h0.e r7 = r6.f3857K
            r7.h()
            return
        L66:
            h0.e r8 = r6.f3857K
            r8.h()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.N.C0(K0.m, K0.n):void");
    }

    public final void D0() {
        w0 w0Var = this.f3853G;
        if (w0Var != null) {
            w0Var.D(new x("Pointer input was reset", 1));
            this.f3853G = null;
        }
    }

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // Q0.x0
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // Q0.x0
    public final void X() {
        D0();
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // Q0.x0
    public final void Z() {
        C0245m c0245m = this.f3858L;
        if (c0245m == null) {
            return;
        }
        ?? r12 = c0245m.f3896a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((u) r12.get(i7)).f3913d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    u uVar = (u) r12.get(i8);
                    long j3 = uVar.f3910a;
                    boolean z6 = uVar.f3913d;
                    int i9 = uVar.f3917i;
                    long j7 = uVar.f3911b;
                    long j8 = uVar.f3912c;
                    arrayList.add(new u(j3, j7, j8, false, uVar.f3914e, j7, j8, z6, z6, i9, 0L));
                }
                C0245m c0245m2 = new C0245m(arrayList, null);
                this.f3854H = c0245m2;
                C0(c0245m2, EnumC0246n.f3901o);
                C0(c0245m2, EnumC0246n.f3902p);
                C0(c0245m2, EnumC0246n.f3903q);
                this.f3858L = null;
                return;
            }
        }
    }

    @Override // n1.d
    public final float b() {
        return AbstractC0347f.x(this).f5814M.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
    }

    @Override // Q0.x0
    public final /* synthetic */ void g0() {
    }

    @Override // n1.d
    public final float i0(int i7) {
        return i7 / b();
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / b();
    }

    @Override // n1.d
    public final float n() {
        return AbstractC0347f.x(this).f5814M.n();
    }

    @Override // Q0.x0
    public final long q() {
        return D0.f5781a;
    }

    @Override // r0.AbstractC1397o
    public final void s0() {
        D0();
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    @Override // r0.AbstractC1397o
    public final void t0() {
        D0();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        this.f3859M = j3;
        if (enumC0246n == EnumC0246n.f3901o) {
            this.f3854H = c0245m;
        }
        if (this.f3853G == null) {
            InterfaceC1765B interfaceC1765BN0 = n0();
            EnumC1766C enumC1766C = EnumC1766C.f19467o;
            this.f3853G = AbstractC1767D.t(interfaceC1765BN0, null, new M(this, null), 1);
        }
        C0(c0245m, enumC0246n);
        ?? r52 = c0245m.f3896a;
        int size = r52.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c0245m = null;
                break;
            } else if (!t.c((u) r52.get(i7))) {
                break;
            } else {
                i7++;
            }
        }
        this.f3858L = c0245m;
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
