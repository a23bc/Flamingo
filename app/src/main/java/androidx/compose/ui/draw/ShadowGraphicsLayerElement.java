package androidx.compose.ui.draw;

import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.j0;
import m5.AbstractC1209k;
import n1.c;
import n1.g;
import r0.AbstractC1397o;
import v.C1628y;
import y0.C1981n;
import y0.C1987t;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1963M f9288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9291e;

    public ShadowGraphicsLayerElement(float f7, InterfaceC1963M interfaceC1963M, boolean z6, long j3, long j7) {
        this.f9287a = f7;
        this.f9288b = interfaceC1963M;
        this.f9289c = z6;
        this.f9290d = j3;
        this.f9291e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return g.a(this.f9287a, shadowGraphicsLayerElement.f9287a) && AbstractC1209k.a(this.f9288b, shadowGraphicsLayerElement.f9288b) && this.f9289c == shadowGraphicsLayerElement.f9289c && C1987t.c(this.f9290d, shadowGraphicsLayerElement.f9290d) && C1987t.c(this.f9291e, shadowGraphicsLayerElement.f9291e);
    }

    public final int hashCode() {
        return C1987t.i(this.f9291e) + c.o((((this.f9288b.hashCode() + (Float.floatToIntBits(this.f9287a) * 31)) * 31) + (this.f9289c ? 1231 : 1237)) * 31, 31, this.f9290d);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new C1981n(new C1628y(5, this));
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1981n c1981n = (C1981n) abstractC1397o;
        c1981n.f20249C = new C1628y(5, this);
        j0 j0Var = AbstractC0347f.v(c1981n, 2).f6027F;
        if (j0Var != null) {
            j0Var.g1(c1981n.f20249C, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) g.b(this.f9287a));
        sb.append(", shape=");
        sb.append(this.f9288b);
        sb.append(", clip=");
        sb.append(this.f9289c);
        sb.append(", ambientColor=");
        c.z(this.f9290d, sb, ", spotColor=");
        sb.append((Object) C1987t.j(this.f9291e));
        sb.append(')');
        return sb.toString();
    }
}
