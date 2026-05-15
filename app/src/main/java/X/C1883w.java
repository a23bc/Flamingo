package x;

import Q0.AbstractC0347f;
import Q0.InterfaceC0360p;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x0.C1893c;
import x0.C1894d;
import x0.C1895e;
import y0.AbstractC1959I;
import y0.AbstractC1983p;
import y0.C1954D;
import y0.C1955E;
import y0.C1956F;
import y0.C1976i;
import y0.C1987t;
import y0.InterfaceC1963M;

/* JADX INFO: renamed from: x.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1883w extends AbstractC1397o implements InterfaceC0360p, Q0.n0, Q0.A0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f19846C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AbstractC1983p f19847D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f19848E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1963M f19849F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f19850G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public n1.n f19851H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC1959I f19852I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC1963M f19853J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AbstractC1959I f19854K;

    @Override // Q0.n0
    public final void F() {
        this.f19850G = 9205357640488583168L;
        this.f19851H = null;
        this.f19852I = null;
        this.f19853J = null;
        AbstractC0347f.m(this);
    }

    @Override // Q0.InterfaceC0360p
    public final void a(Q0.N n7) {
        AbstractC1959I abstractC1959I;
        AbstractC1959I abstractC1959I2;
        Q0.N n8;
        C1976i c1976i;
        if (this.f19849F == AbstractC1959I.f20180a) {
            if (!C1987t.c(this.f19846C, C1987t.f20262j)) {
                A0.e.x(0.0f, 126, this.f19846C, 0L, n7);
            }
            AbstractC1983p abstractC1983p = this.f19847D;
            if (abstractC1983p != null) {
                A0.e.w(n7, abstractC1983p, 0L, 0L, this.f19848E, null, null, 118);
            }
        } else {
            A0.c cVar = n7.f5853o;
            if (C1895e.a(cVar.f54p.W(), this.f19850G) && n7.getLayoutDirection() == this.f19851H && AbstractC1209k.a(this.f19853J, this.f19849F)) {
                abstractC1959I = this.f19852I;
                AbstractC1209k.c(abstractC1959I);
            } else {
                AbstractC0347f.t(this, new G.i(this, 25, n7));
                abstractC1959I = this.f19854K;
                this.f19854K = null;
            }
            this.f19852I = abstractC1959I;
            this.f19850G = cVar.f54p.W();
            this.f19851H = n7.getLayoutDirection();
            this.f19853J = this.f19849F;
            AbstractC1209k.c(abstractC1959I);
            if (C1987t.c(this.f19846C, C1987t.f20262j)) {
                abstractC1959I2 = abstractC1959I;
            } else {
                abstractC1959I2 = abstractC1959I;
                AbstractC1959I.k(n7, abstractC1959I2, this.f19846C, null, 60);
            }
            AbstractC1983p abstractC1983p2 = this.f19847D;
            if (abstractC1983p2 != null) {
                float f7 = this.f19848E;
                A0.h hVar = A0.h.f59b;
                if (abstractC1959I2 instanceof C1955E) {
                    C1893c c1893c = ((C1955E) abstractC1959I2).f20176e;
                    n7.J(abstractC1983p2, (4294967295L & ((long) Float.floatToRawIntBits(c1893c.f19870b))) | (Float.floatToRawIntBits(c1893c.f19869a) << 32), AbstractC1959I.r(c1893c), f7, hVar, null, 3);
                } else {
                    if (abstractC1959I2 instanceof C1956F) {
                        C1956F c1956f = (C1956F) abstractC1959I2;
                        c1976i = c1956f.f20178f;
                        if (c1976i != null) {
                            n8 = n7;
                        } else {
                            C1894d c1894d = c1956f.f20177e;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c1894d.h >> 32));
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c1894d.f19873a)) << 32) | (((long) Float.floatToRawIntBits(c1894d.f19874b)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c1894d.b())) << 32) | (((long) Float.floatToRawIntBits(c1894d.a())) & 4294967295L);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            A0.c cVar2 = n7.f5853o;
                            int i7 = (int) (jFloatToRawIntBits >> 32);
                            int i8 = (int) (jFloatToRawIntBits & 4294967295L);
                            cVar2.f53o.f46c.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)), cVar2.c(abstractC1983p2, hVar, f7, null, 3, 1));
                        }
                    } else {
                        n8 = n7;
                        if (!(abstractC1959I2 instanceof C1954D)) {
                            throw new A2.W();
                        }
                        c1976i = ((C1954D) abstractC1959I2).f20175e;
                    }
                    n8.W(c1976i, abstractC1983p2, f7, hVar, 3);
                }
            }
        }
        n7.a();
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.InterfaceC0360p
    public final /* synthetic */ void f0() {
    }

    @Override // Q0.A0
    public final boolean i() {
        return false;
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
    }
}
