package O0;

import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0298b0, InterfaceC0327y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0327y f5283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1.n f5284p;

    public B(InterfaceC0327y interfaceC0327y, n1.n nVar) {
        this.f5283o = interfaceC0327y;
        this.f5284p = nVar;
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        int i9 = i7 < 0 ? 0 : i7;
        int i10 = i8 < 0 ? 0 : i8;
        if ((i9 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            N0.a.b("Size(" + i9 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0303e(i9, i10, map, a4, 1);
    }

    @Override // n1.d
    public final float E(long j3) {
        return this.f5283o.E(j3);
    }

    @Override // n1.d
    public final int L(float f7) {
        return this.f5283o.L(f7);
    }

    @Override // n1.d
    public final long V(long j3) {
        return this.f5283o.V(j3);
    }

    @Override // n1.d
    public final float Y(long j3) {
        return this.f5283o.Y(j3);
    }

    @Override // n1.d
    public final float b() {
        return this.f5283o.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f5283o.e0(f7);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5284p;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f5283o.i0(i7);
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return this.f5283o.k0(f7);
    }

    @Override // n1.d
    public final float n() {
        return this.f5283o.n();
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        return this.f5283o.s();
    }

    @Override // n1.d
    public final long t(long j3) {
        return this.f5283o.t(j3);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f5283o.v(f7);
    }
}
