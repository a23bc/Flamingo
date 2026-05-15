package H;

import O0.y0;
import android.os.Trace;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1182c;
import m5.C1220v;
import v5.AbstractC1646d;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements W {

    /* JADX INFO: renamed from: a */
    public final int f2890a;

    /* JADX INFO: renamed from: b */
    public final A0.b f2891b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1182c f2892c;

    /* JADX INFO: renamed from: d */
    public n1.a f2893d;

    /* JADX INFO: renamed from: e */
    public y0 f2894e;

    /* JADX INFO: renamed from: f */
    public boolean f2895f;

    /* JADX INFO: renamed from: g */
    public boolean f2896g;
    public boolean h;

    /* JADX INFO: renamed from: i */
    public Object f2897i;

    /* JADX INFO: renamed from: j */
    public boolean f2898j;

    /* JADX INFO: renamed from: k */
    public i0 f2899k;
    public boolean l;

    /* JADX INFO: renamed from: m */
    public long f2900m;

    /* JADX INFO: renamed from: n */
    public long f2901n;

    /* JADX INFO: renamed from: o */
    public long f2902o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ D2.B f2903p;

    public j0(D2.B b7, int i7, A0.b bVar, InterfaceC1182c interfaceC1182c) {
        this.f2903p = b7;
        this.f2890a = i7;
        this.f2891b = bVar;
        this.f2892c = interfaceC1182c;
        int i8 = AbstractC1646d.f18326b;
        this.f2902o = System.nanoTime() - AbstractC1646d.f18325a;
    }

    @Override // H.W
    public final void a() {
        this.l = true;
    }

    public final void b() {
        y0 y0Var = this.f2894e;
        if (y0Var != null) {
            y0Var.a();
        }
        this.f2894e = null;
        this.f2899k = null;
    }

    public final boolean c(C0159a c0159a) {
        boolean zD;
        if (!this.f2903p.f1458o) {
            return false;
        }
        if (this.l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(c0159a);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(c0159a);
        }
        AbstractC1110d.K("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override // H.W
    public final void cancel() {
        if (this.f2896g) {
            return;
        }
        this.f2896g = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(H.C0159a r21) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.j0.d(H.a):boolean");
    }

    public final boolean e() {
        return this.h;
    }

    public final void f(long j3) {
        if (this.f2896g) {
            C.b.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f2895f) {
            C.b.a("Request was already measured!");
        }
        this.f2895f = true;
        y0 y0Var = this.f2894e;
        if (y0Var == null) {
            C.b.b("performComposition() must be called before performMeasure()");
            throw new A2.W();
        }
        int iB = y0Var.b();
        for (int i7 = 0; i7 < iB; i7++) {
            y0Var.e(j3, i7);
        }
    }

    public final i0 g() {
        y0 y0Var = this.f2894e;
        if (y0Var == null) {
            C.b.b("Should precompose before resolving nested prefetch states");
            throw new A2.W();
        }
        C1220v c1220v = new C1220v();
        y0Var.c(new D.J(8, c1220v));
        List list = (List) c1220v.f14439o;
        if (list != null) {
            return new i0(this, list);
        }
        return null;
    }

    public final boolean h(long j3, long j7) {
        if (this.l) {
            j7 = 0;
        }
        return j3 > j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.j0.i():void");
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f2890a + ", constraints = " + this.f2893d + ", isComposed = " + e() + ", isMeasured = " + this.f2895f + ", isCanceled = " + this.f2896g + " }";
    }
}
