package O0;

import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: O0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311i implements InterfaceC0307g, InterfaceC0298b0, V {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Q0.D f5401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v.Y f5402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5403q;

    public C0311i(Q0.D d4, v.Y y6) {
        this.f5401o = d4;
        this.f5402p = y6;
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i8) != 0) {
            N0.a.b("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0309h(i7, i8, map, a4, (p0) interfaceC1182c, this, 0);
    }

    @Override // n1.d
    public final float E(long j3) {
        Q0.D d4 = this.f5401o;
        d4.getClass();
        return n1.c.h(j3, d4);
    }

    @Override // n1.d
    public final int L(float f7) {
        Q0.D d4 = this.f5401o;
        d4.getClass();
        return n1.c.f(f7, d4);
    }

    @Override // n1.d
    public final long V(long j3) {
        Q0.D d4 = this.f5401o;
        d4.getClass();
        return n1.c.k(j3, d4);
    }

    @Override // n1.d
    public final float Y(long j3) {
        Q0.D d4 = this.f5401o;
        d4.getClass();
        return n1.c.j(j3, d4);
    }

    @Override // O0.V
    public final C a(Q0.j0 j0Var) {
        U u7;
        Q0.U uH0 = j0Var.H0();
        return (uH0 == null || (u7 = uH0.f5891F) == null) ? j0Var : u7;
    }

    @Override // n1.d
    public final float b() {
        return this.f5401o.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f5401o.e0(f7);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5401o.f6024C.f5815N;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f5401o.i0(i7);
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return this.f5401o.B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return f7 / this.f5401o.b();
    }

    @Override // n1.d
    public final float n() {
        return this.f5401o.n();
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        return false;
    }

    @Override // n1.d
    public final long t(long j3) {
        Q0.D d4 = this.f5401o;
        d4.getClass();
        return n1.c.i(j3, d4);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f5401o.b() * f7;
    }
}
