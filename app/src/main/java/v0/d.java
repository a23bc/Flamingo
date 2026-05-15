package v0;

import k.I;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n1.d {

    /* JADX INFO: renamed from: o */
    public b f18208o;

    /* JADX INFO: renamed from: p */
    public I f18209p;

    @Override // n1.d
    public final /* synthetic */ float E(long j3) {
        return n1.c.h(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ int L(float f7) {
        return n1.c.f(f7, this);
    }

    @Override // n1.d
    public final /* synthetic */ long V(long j3) {
        return n1.c.k(j3, this);
    }

    @Override // n1.d
    public final /* synthetic */ float Y(long j3) {
        return n1.c.j(j3, this);
    }

    public final I a(InterfaceC1182c interfaceC1182c) {
        I i7 = new I(14);
        i7.f13847p = interfaceC1182c;
        this.f18209p = i7;
        return i7;
    }

    @Override // n1.d
    public final float b() {
        return this.f18208o.b().b();
    }

    @Override // n1.d
    public final long e0(float f7) {
        return n1.c.l(k0(f7), this);
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
        return this.f18208o.b().n();
    }

    @Override // n1.d
    public final /* synthetic */ long t(long j3) {
        return n1.c.i(j3, this);
    }

    @Override // n1.d
    public final float v(float f7) {
        return b() * f7;
    }
}
