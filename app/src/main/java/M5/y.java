package M5;

import android.util.SparseArray;
import f0.AbstractC0914u;
import f0.InterfaceC0881d;
import h3.C1000b;
import t2.C1487p;
import w.C1656E;
import w.InterfaceC1690x;
import w.r0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC0881d, h3.e, r0, y2.g {

    /* JADX INFO: renamed from: o */
    public final int f4949o;

    /* JADX INFO: renamed from: p */
    public int f4950p;

    /* JADX INFO: renamed from: q */
    public final Object f4951q;

    public y(int i7) {
        switch (i7) {
            case 5:
                this.f4951q = new V1.a(26);
                this.f4949o = 8000;
                this.f4950p = 8000;
                break;
            default:
                this.f4951q = new y[256];
                this.f4949o = 0;
                this.f4950p = 0;
                break;
        }
    }

    @Override // f0.InterfaceC0881d
    public void G() {
        if (!(this.f4950p > 0)) {
            AbstractC0914u.c("OffsetApplier up called with no corresponding down");
        }
        this.f4950p--;
        ((InterfaceC0881d) this.f4951q).G();
    }

    @Override // w.q0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // h3.e
    public int b() {
        return this.f4949o;
    }

    @Override // h3.e
    public int c() {
        return this.f4950p;
    }

    @Override // h3.e
    public int d() {
        int i7 = this.f4949o;
        return i7 == -1 ? ((w2.m) this.f4951q).y() : i7;
    }

    @Override // w.q0
    public long e(w.r rVar, w.r rVar2, w.r rVar3) {
        return ((long) (v() + n())) * 1000000;
    }

    @Override // w.q0
    public w.r f(w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f4951q).w(e(rVar, rVar2, rVar3), rVar, rVar2, rVar3);
    }

    public y2.h g() {
        return new y2.q(this.f4949o, this.f4950p, (V1.a) this.f4951q);
    }

    @Override // f0.InterfaceC0881d
    public void i(int i7, Object obj) {
        ((InterfaceC0881d) this.f4951q).i(i7 + (this.f4950p == 0 ? this.f4949o : 0), obj);
    }

    @Override // f0.InterfaceC0881d
    public void l(Object obj) {
        this.f4950p++;
        ((InterfaceC0881d) this.f4951q).l(obj);
    }

    @Override // f0.InterfaceC0881d
    public void m() {
        ((InterfaceC0881d) this.f4951q).m();
    }

    @Override // w.r0
    public int n() {
        return this.f4950p;
    }

    @Override // w.q0
    public w.r o(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f4951q).o(j3, rVar, rVar2, rVar3);
    }

    @Override // f0.InterfaceC0881d
    public void p(int i7, Object obj) {
        ((InterfaceC0881d) this.f4951q).p(i7 + (this.f4950p == 0 ? this.f4949o : 0), obj);
    }

    @Override // f0.InterfaceC0881d
    public /* synthetic */ void q() {
    }

    @Override // f0.InterfaceC0881d
    public void r(int i7, int i8, int i9) {
        int i10 = this.f4950p == 0 ? this.f4949o : 0;
        ((InterfaceC0881d) this.f4951q).r(i7 + i10, i8 + i10, i9);
    }

    @Override // f0.InterfaceC0881d
    public void t(int i7, int i8) {
        ((InterfaceC0881d) this.f4951q).t(i7 + (this.f4950p == 0 ? this.f4949o : 0), i8);
    }

    @Override // w.r0
    public int v() {
        return this.f4949o;
    }

    @Override // w.q0
    public w.r w(long j3, w.r rVar, w.r rVar2, w.r rVar3) {
        return ((U3.h) this.f4951q).w(j3, rVar, rVar2, rVar3);
    }

    @Override // f0.InterfaceC0881d
    public void z(Object obj, l5.e eVar) {
        ((InterfaceC0881d) this.f4951q).z(obj, eVar);
    }

    public y(int i7, int i8) {
        this.f4951q = null;
        this.f4949o = i7;
        int i9 = i8 & 7;
        this.f4950p = i9 == 0 ? 8 : i9;
    }

    public y(InterfaceC0881d interfaceC0881d, int i7) {
        this.f4951q = interfaceC0881d;
        this.f4949o = i7;
    }

    public y(int i7, int i8, InterfaceC1690x interfaceC1690x) {
        this.f4949o = i7;
        this.f4950p = i8;
        this.f4951q = new U3.h(new C1656E(i7, i8, interfaceC1690x));
    }

    public y(int i7, int i8, SparseArray sparseArray) {
        this.f4949o = i7;
        this.f4950p = i8;
        this.f4951q = sparseArray;
    }

    public y(C1000b c1000b, C1487p c1487p) {
        w2.m mVar = c1000b.f12564q;
        this.f4951q = mVar;
        mVar.G(12);
        int iY = mVar.y();
        if ("audio/raw".equals(c1487p.f16701m)) {
            int iU = w2.t.u(c1487p.f16682C, c1487p.f16680A);
            if (iY == 0 || iY % iU != 0) {
                AbstractC1697a.w("Audio sample size mismatch. stsd sample size: " + iU + ", stsz sample size: " + iY);
                iY = iU;
            }
        }
        this.f4949o = iY == 0 ? -1 : iY;
        this.f4950p = mVar.y();
    }
}
