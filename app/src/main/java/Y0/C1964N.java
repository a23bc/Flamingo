package y0;

import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import O0.Y;
import O0.m0;
import Q0.A0;
import Q0.T;
import r0.AbstractC1397o;
import v.C1628y;

/* JADX INFO: renamed from: y0.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1964N extends AbstractC1397o implements Q0.A, A0 {

    /* JADX INFO: renamed from: C */
    public float f20211C;

    /* JADX INFO: renamed from: D */
    public float f20212D;

    /* JADX INFO: renamed from: E */
    public float f20213E;

    /* JADX INFO: renamed from: F */
    public float f20214F;

    /* JADX INFO: renamed from: G */
    public float f20215G;

    /* JADX INFO: renamed from: H */
    public long f20216H;

    /* JADX INFO: renamed from: I */
    public InterfaceC1963M f20217I;

    /* JADX INFO: renamed from: J */
    public boolean f20218J;

    /* JADX INFO: renamed from: K */
    public long f20219K;

    /* JADX INFO: renamed from: L */
    public long f20220L;

    /* JADX INFO: renamed from: M */
    public int f20221M;

    /* JADX INFO: renamed from: N */
    public C1628y f20222N;

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A
    public final /* synthetic */ int c(T t7, Y y6, int i7) {
        return A0.e.d(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int d(T t7, Y y6, int i7) {
        return A0.e.m(this, t7, y6, i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, Y y6, long j3) {
        m0 m0VarD = y6.d(j3);
        return interfaceC0298b0.k(m0VarD.f5416o, m0VarD.f5417p, Z4.w.f8819o, new K0.A(m0VarD, 28, this));
    }

    @Override // Q0.A
    public final /* synthetic */ int g(T t7, Y y6, int i7) {
        return A0.e.j(this, t7, y6, i7);
    }

    @Override // Q0.A
    public final /* synthetic */ int h(T t7, Y y6, int i7) {
        return A0.e.g(this, t7, y6, i7);
    }

    @Override // Q0.A0
    public final boolean i() {
        return false;
    }

    @Override // r0.AbstractC1397o
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f20211C);
        sb.append(", scaleY=");
        sb.append(this.f20212D);
        sb.append(", alpha = ");
        sb.append(this.f20213E);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f20214F);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f20215G);
        sb.append(", transformOrigin=");
        sb.append((Object) C1967Q.d(this.f20216H));
        sb.append(", shape=");
        sb.append(this.f20217I);
        sb.append(", clip=");
        sb.append(this.f20218J);
        sb.append(", renderEffect=null, ambientShadowColor=");
        n1.c.z(this.f20219K, sb, ", spotShadowColor=");
        n1.c.z(this.f20220L, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC1959I.C(this.f20221M));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
    }
}
