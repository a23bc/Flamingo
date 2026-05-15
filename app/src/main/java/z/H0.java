package z;

import I.C0223o;
import K0.C0245m;
import K0.EnumC0246n;
import Q0.AbstractC0347f;
import Q0.InterfaceC0356l;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import d5.EnumC0830a;
import m5.AbstractC1209k;
import o0.C1247d;
import o5.AbstractC1267a;
import s5.InterfaceC1438c;
import w.C1689w;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x.AbstractC1881v;
import x.C1808A;
import x.C1825L;
import x.C1830Q;
import x.C1875s;
import x.EnumC1862l0;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends J implements I0.d, Q0.A0, InterfaceC0356l {

    /* JADX INFO: renamed from: N */
    public C1875s f20642N;

    /* JADX INFO: renamed from: O */
    public S f20643O;

    /* JADX INFO: renamed from: P */
    public final J0.d f20644P;

    /* JADX INFO: renamed from: Q */
    public final C2059r0 f20645Q;

    /* JADX INFO: renamed from: R */
    public final C2047l f20646R;

    /* JADX INFO: renamed from: S */
    public final P0 f20647S;

    /* JADX INFO: renamed from: T */
    public final C2073y0 f20648T;

    /* JADX INFO: renamed from: U */
    public final C2039h f20649U;

    /* JADX INFO: renamed from: V */
    public D.D0 f20650V;

    /* JADX INFO: renamed from: W */
    public G0 f20651W;

    /* JADX INFO: renamed from: X */
    public A3.b f20652X;

    public H0(B.k kVar, C0223o c0223o, C1875s c1875s, S s7, EnumC2048l0 enumC2048l0, I0 i02, boolean z6, boolean z7) {
        super(androidx.compose.foundation.gestures.a.f9176a, z6, kVar, enumC2048l0);
        this.f20642N = c1875s;
        this.f20643O = s7;
        J0.d dVar = new J0.d();
        this.f20644P = dVar;
        C2059r0 c2059r0 = new C2059r0();
        c2059r0.f20948C = z6;
        B0(c2059r0);
        this.f20645Q = c2059r0;
        C2047l c2047l = new C2047l(new C1689w(new k.I(androidx.compose.foundation.gestures.a.f9179d)));
        this.f20646R = c2047l;
        C1875s c1875s2 = this.f20642N;
        S s8 = this.f20643O;
        P0 p02 = new P0(i02, c1875s2, s8 == null ? c2047l : s8, enumC2048l0, z7, dVar, this, new C1808A(3, this));
        this.f20647S = p02;
        C2073y0 c2073y0 = new C2073y0(p02, z6);
        this.f20648T = c2073y0;
        C2039h c2039h = new C2039h(enumC2048l0, p02, z7, c0223o);
        B0(c2039h);
        this.f20649U = c2039h;
        B0(new J0.g(c2073y0, dVar));
        B0(new w0.u(2, null, 4));
        J.h hVar = new J.h();
        hVar.f3587C = c2039h;
        B0(hVar);
        p6.f fVar = new p6.f(6, this);
        C1830Q c1830q = new C1830Q();
        c1830q.f19681C = fVar;
        B0(c1830q);
    }

    @Override // z.J
    public final Object I0(H h, I i7) {
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19773p;
        P0 p02 = this.f20647S;
        Object objF = p02.f(enumC1862l0, new A0(h, p02, null), i7);
        return objF == EnumC0830a.f11264o ? objF : Y4.o.f8736a;
    }

    @Override // z.J
    public final void K0(long j3) {
        AbstractC1767D.t(this.f20644P.e(), null, new B0(this, j3, null), 3);
    }

    @Override // z.J
    public final boolean L0() {
        P0 p02 = this.f20647S;
        if (p02.f20711a.b()) {
            return true;
        }
        C1875s c1875s = p02.f20712b;
        if (c1875s == null) {
            return false;
        }
        C1825L c1825l = c1875s.f19831c;
        EdgeEffect edgeEffect = c1825l.f19660d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1881v.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c1825l.f19661e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1881v.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c1825l.f19662f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1881v.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c1825l.f19663g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1881v.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    @Override // I0.d
    public final boolean N(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        long j3;
        if (!this.f20660G || ((!I0.a.a(I0.c.A(keyEvent), I0.a.f3436n) && !I0.a.a(AbstractC1267a.b(keyEvent.getKeyCode()), I0.a.f3435m)) || I0.c.B(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z6 = this.f20647S.f20714d == EnumC2048l0.f20894o;
        C2039h c2039h = this.f20649U;
        if (z6) {
            int i7 = (int) (c2039h.f20850K & 4294967295L);
            float f7 = I0.a.a(AbstractC1267a.b(keyEvent.getKeyCode()), I0.a.f3435m) ? i7 : -i7;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f7);
            j3 = jFloatToRawIntBits2 << 32;
        } else {
            int i8 = (int) (c2039h.f20850K >> 32);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(I0.a.a(AbstractC1267a.b(keyEvent.getKeyCode()), I0.a.f3435m) ? i8 : -i8);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j3 = jFloatToRawIntBits3 << 32;
        }
        AbstractC1767D.t(n0(), null, new D0(this, j3 | (4294967295L & jFloatToRawIntBits), null), 3);
        return true;
    }

    public final void N0(B.k kVar, C0223o c0223o, C1875s c1875s, S s7, EnumC2048l0 enumC2048l0, I0 i02, boolean z6, boolean z7) {
        boolean z8;
        boolean z9 = true;
        boolean z10 = false;
        if (this.f20660G != z6) {
            this.f20648T.f21002p = z6;
            this.f20645Q.f20948C = z6;
            z8 = true;
        } else {
            z8 = false;
        }
        S s8 = s7 == null ? this.f20646R : s7;
        P0 p02 = this.f20647S;
        if (!AbstractC1209k.a(p02.f20711a, i02)) {
            p02.f20711a = i02;
            z10 = true;
        }
        p02.f20712b = c1875s;
        if (p02.f20714d != enumC2048l0) {
            p02.f20714d = enumC2048l0;
            z10 = true;
        }
        if (p02.f20715e != z7) {
            p02.f20715e = z7;
        } else {
            z9 = z10;
        }
        p02.f20713c = s8;
        p02.f20716f = this.f20644P;
        C2039h c2039h = this.f20649U;
        c2039h.f20842C = enumC2048l0;
        c2039h.f20844E = z7;
        c2039h.f20845F = c0223o;
        this.f20642N = c1875s;
        this.f20643O = s7;
        C1247d c1247d = androidx.compose.foundation.gestures.a.f9176a;
        EnumC2048l0 enumC2048l02 = p02.f20714d;
        EnumC2048l0 enumC2048l03 = EnumC2048l0.f20894o;
        if (enumC2048l02 != enumC2048l03) {
            enumC2048l03 = EnumC2048l0.f20895p;
        }
        M0(c1247d, z6, kVar, enumC2048l03, z9);
        if (z8) {
            this.f20650V = null;
            this.f20651W = null;
            AbstractC0347f.o(this);
        }
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        if (this.f20660G && (this.f20650V == null || this.f20651W == null)) {
            this.f20650V = new D.D0(17, this);
            this.f20651W = new G0(this, null);
        }
        D.D0 d02 = this.f20650V;
        if (d02 != null) {
            InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
            jVar.i(Y0.i.f8452d, new Y0.a(null, d02));
        }
        G0 g02 = this.f20651W;
        if (g02 != null) {
            InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
            jVar.i(Y0.i.f8453e, g02);
        }
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // I0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        if (this.f15636B) {
            n1.d dVar = AbstractC0347f.x(this).f5814M;
            C2047l c2047l = this.f20646R;
            c2047l.getClass();
            c2047l.f20893a = new C1689w(new k.I(dVar));
        }
        A3.b bVar = this.f20652X;
        if (bVar != null) {
            bVar.f481e = AbstractC0347f.x(this).f5814M;
        }
    }

    @Override // z.J, r0.AbstractC1397o
    public final void s0() {
        Z();
        if (this.f15636B) {
            n1.d dVar = AbstractC0347f.x(this).f5814M;
            C2047l c2047l = this.f20646R;
            c2047l.getClass();
            c2047l.f20893a = new C1689w(new k.I(dVar));
        }
        A3.b bVar = this.f20652X;
        if (bVar != null) {
            bVar.f481e = AbstractC0347f.x(this).f5814M;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z.J, Q0.x0
    public final void u(C0245m c0245m, EnumC0246n enumC0246n, long j3) {
        long j7;
        ?? r02 = c0245m.f3896a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((Boolean) this.f20659F.b((K0.u) r02.get(i7))).booleanValue()) {
                super.u(c0245m, enumC0246n, j3);
                break;
            }
            i7++;
        }
        if (this.f20660G) {
            if (enumC0246n == EnumC0246n.f3901o && c0245m.f3900e == 6) {
                if (this.f20652X == null) {
                    this.f20652X = new A3.b(this.f20647S, new k.I(26, ViewConfiguration.get(AbstractC0347f.z(this).getContext())), new n0.c(2, this, H0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC0347f.x(this).f5814M);
                }
                A3.b bVar = this.f20652X;
                if (bVar != null) {
                    InterfaceC1765B interfaceC1765BN0 = n0();
                    if (((w5.w0) bVar.f483g) == null) {
                        bVar.f483g = AbstractC1767D.t(interfaceC1765BN0, null, new C2040h0(bVar, null), 3);
                    }
                }
            }
            A3.b bVar2 = this.f20652X;
            if (bVar2 != null && enumC0246n == EnumC0246n.f3902p && c0245m.f3900e == 6) {
                ?? r12 = c0245m.f3896a;
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    if (((K0.u) r12.get(i8)).b()) {
                        return;
                    }
                }
                n1.d dVar = (n1.d) bVar2.f481e;
                k.I i9 = (k.I) bVar2.f479c;
                int i10 = Build.VERSION.SDK_INT;
                ViewConfiguration viewConfiguration = (ViewConfiguration) i9.f13847p;
                float f7 = -(i10 > 26 ? u1.b(viewConfiguration) : dVar.v(64));
                float f8 = -(i10 > 26 ? u1.a(viewConfiguration) : dVar.v(64));
                C1892b c1892b = new C1892b(0L);
                int size3 = r12.size();
                int i11 = 0;
                while (true) {
                    j7 = c1892b.f19867a;
                    if (i11 >= size3) {
                        break;
                    }
                    c1892b = new C1892b(C1892b.h(j7, ((K0.u) r12.get(i11)).f3918j));
                    i11++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32)) * f8)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * f7)));
                P0 p02 = (P0) bVar2.f478b;
                float fG = p02.g(p02.e(jFloatToRawIntBits));
                if ((fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) == 0 ? false : (fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) > 0 ? p02.f20711a.d() : p02.f20711a.a() ? !(((y5.c) bVar2.f482f).k(new C2026a0(jFloatToRawIntBits, ((K0.u) Z4.n.q0(r12)).f3911b, false)) instanceof y5.i) : bVar2.f477a) {
                    int size4 = r12.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        ((K0.u) r12.get(i12)).a();
                    }
                }
            }
        }
    }

    @Override // z.J
    public final void J0(long j3) {
    }
}
