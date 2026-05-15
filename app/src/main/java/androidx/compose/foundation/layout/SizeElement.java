package androidx.compose.foundation.layout;

import D.t0;
import Q0.AbstractC0344d0;
import n1.g;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9196e;

    public SizeElement(float f7, float f8, float f9, float f10, boolean z6) {
        this.f9192a = f7;
        this.f9193b = f8;
        this.f9194c = f9;
        this.f9195d = f10;
        this.f9196e = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return g.a(this.f9192a, sizeElement.f9192a) && g.a(this.f9193b, sizeElement.f9193b) && g.a(this.f9194c, sizeElement.f9194c) && g.a(this.f9195d, sizeElement.f9195d) && this.f9196e == sizeElement.f9196e;
    }

    public final int hashCode() {
        return n1.c.n(this.f9195d, n1.c.n(this.f9194c, n1.c.n(this.f9193b, Float.floatToIntBits(this.f9192a) * 31, 31), 31), 31) + (this.f9196e ? 1231 : 1237);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        t0 t0Var = new t0();
        t0Var.f1390C = this.f9192a;
        t0Var.f1391D = this.f9193b;
        t0Var.f1392E = this.f9194c;
        t0Var.f1393F = this.f9195d;
        t0Var.f1394G = this.f9196e;
        return t0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        t0 t0Var = (t0) abstractC1397o;
        t0Var.f1390C = this.f9192a;
        t0Var.f1391D = this.f9193b;
        t0Var.f1392E = this.f9194c;
        t0Var.f1393F = this.f9195d;
        t0Var.f1394G = this.f9196e;
    }

    public /* synthetic */ SizeElement(float f7, float f8, float f9, float f10, int i7) {
        this((i7 & 1) != 0 ? Float.NaN : f7, (i7 & 2) != 0 ? Float.NaN : f8, (i7 & 4) != 0 ? Float.NaN : f9, (i7 & 8) != 0 ? Float.NaN : f10, true);
    }
}
