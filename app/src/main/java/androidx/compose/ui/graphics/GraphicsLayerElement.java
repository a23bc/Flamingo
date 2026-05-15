package androidx.compose.ui.graphics;

import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.j0;
import m5.AbstractC1209k;
import n1.c;
import r0.AbstractC1397o;
import v.C1628y;
import y0.AbstractC1959I;
import y0.C1964N;
import y0.C1967Q;
import y0.C1987t;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1963M f9300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9303g;

    public GraphicsLayerElement(float f7, float f8, long j3, InterfaceC1963M interfaceC1963M, boolean z6, long j7, long j8) {
        this.f9297a = f7;
        this.f9298b = f8;
        this.f9299c = j3;
        this.f9300d = interfaceC1963M;
        this.f9301e = z6;
        this.f9302f = j7;
        this.f9303g = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        graphicsLayerElement.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f9297a, graphicsLayerElement.f9297a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f9298b, graphicsLayerElement.f9298b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C1967Q.a(this.f9299c, graphicsLayerElement.f9299c) && AbstractC1209k.a(this.f9300d, graphicsLayerElement.f9300d) && this.f9301e == graphicsLayerElement.f9301e && C1987t.c(this.f9302f, graphicsLayerElement.f9302f) && C1987t.c(this.f9303g, graphicsLayerElement.f9303g);
    }

    public final int hashCode() {
        int iN = c.n(8.0f, c.n(0.0f, c.n(0.0f, c.n(0.0f, c.n(this.f9298b, c.n(0.0f, c.n(0.0f, c.n(this.f9297a, c.n(1.0f, Float.floatToIntBits(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = C1967Q.f20225c;
        long j3 = this.f9299c;
        return (((C1987t.i(this.f9303g) + c.o((((this.f9300d.hashCode() + ((((int) (j3 ^ (j3 >>> 32))) + iN) * 31)) * 31) + (this.f9301e ? 1231 : 1237)) * 961, 31, this.f9302f)) * 961) + 3) * 31;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1964N c1964n = new C1964N();
        c1964n.f20211C = 1.0f;
        c1964n.f20212D = 1.0f;
        c1964n.f20213E = this.f9297a;
        c1964n.f20214F = this.f9298b;
        c1964n.f20215G = 8.0f;
        c1964n.f20216H = this.f9299c;
        c1964n.f20217I = this.f9300d;
        c1964n.f20218J = this.f9301e;
        c1964n.f20219K = this.f9302f;
        c1964n.f20220L = this.f9303g;
        c1964n.f20221M = 3;
        c1964n.f20222N = new C1628y(8, c1964n);
        return c1964n;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1964N c1964n = (C1964N) abstractC1397o;
        c1964n.f20211C = 1.0f;
        c1964n.f20212D = 1.0f;
        c1964n.f20213E = this.f9297a;
        c1964n.f20214F = this.f9298b;
        c1964n.f20215G = 8.0f;
        c1964n.f20216H = this.f9299c;
        c1964n.f20217I = this.f9300d;
        c1964n.f20218J = this.f9301e;
        c1964n.f20219K = this.f9302f;
        c1964n.f20220L = this.f9303g;
        c1964n.f20221M = 3;
        j0 j0Var = AbstractC0347f.v(c1964n, 2).f6027F;
        if (j0Var != null) {
            j0Var.g1(c1964n.f20222N, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f9297a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f9298b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C1967Q.d(this.f9299c));
        sb.append(", shape=");
        sb.append(this.f9300d);
        sb.append(", clip=");
        sb.append(this.f9301e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        c.z(this.f9302f, sb, ", spotShadowColor=");
        sb.append((Object) C1987t.j(this.f9303g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC1959I.C(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
