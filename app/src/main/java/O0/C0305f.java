package O0;

import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: O0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0305f implements InterfaceC0307g, InterfaceC0301d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0301d f5388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n1.n f5389p;

    public C0305f(InterfaceC0301d interfaceC0301d, n1.n nVar) {
        this.f5388o = interfaceC0301d;
        this.f5389p = nVar;
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 B(int i7, int i8, Map map, K0.A a4, InterfaceC1182c interfaceC1182c) {
        int i9 = i7 < 0 ? 0 : i7;
        int i10 = i8 < 0 ? 0 : i8;
        if ((i9 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            N0.a.b("Size(" + i9 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0303e(i9, i10, map, a4, 0);
    }

    @Override // n1.d
    public final float E(long j3) {
        return this.f5388o.E(j3);
    }

    @Override // n1.d
    public final int L(float f7) {
        return this.f5388o.L(f7);
    }

    @Override // n1.d
    public final long V(long j3) {
        return this.f5388o.V(j3);
    }

    @Override // n1.d
    public final float Y(long j3) {
        return this.f5388o.Y(j3);
    }

    @Override // n1.d
    public final float b() {
        return this.f5388o.b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return this.f5388o.e0(f7);
    }

    @Override // O0.InterfaceC0327y
    public final n1.n getLayoutDirection() {
        return this.f5389p;
    }

    @Override // n1.d
    public final float i0(int i7) {
        return this.f5388o.i0(i7);
    }

    @Override // O0.InterfaceC0298b0
    public final InterfaceC0296a0 k(int i7, int i8, Map map, InterfaceC1182c interfaceC1182c) {
        return B(i7, i8, map, null, interfaceC1182c);
    }

    @Override // n1.d
    public final float k0(float f7) {
        return this.f5388o.k0(f7);
    }

    @Override // n1.d
    public final float n() {
        return this.f5388o.n();
    }

    @Override // O0.InterfaceC0327y
    public final boolean s() {
        return this.f5388o.s();
    }

    @Override // n1.d
    public final long t(long j3) {
        return this.f5388o.t(j3);
    }

    @Override // n1.d
    public final float v(float f7) {
        return this.f5388o.v(f7);
    }
}
