package androidx.compose.foundation.layout;

import D.j0;
import Q0.AbstractC0344d0;
import n1.g;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9190d;

    public PaddingElement(float f7, float f8, float f9, float f10) {
        this.f9187a = f7;
        this.f9188b = f8;
        this.f9189c = f9;
        this.f9190d = f10;
        boolean z6 = true;
        boolean z7 = (f7 >= 0.0f || Float.isNaN(f7)) & (f8 >= 0.0f || Float.isNaN(f8)) & (f9 >= 0.0f || Float.isNaN(f9));
        if (f10 < 0.0f && !Float.isNaN(f10)) {
            z6 = false;
        }
        if (!z7 || !z6) {
            E.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && g.a(this.f9187a, paddingElement.f9187a) && g.a(this.f9188b, paddingElement.f9188b) && g.a(this.f9189c, paddingElement.f9189c) && g.a(this.f9190d, paddingElement.f9190d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f9190d) + n1.c.n(this.f9189c, n1.c.n(this.f9188b, Float.floatToIntBits(this.f9187a) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        j0 j0Var = new j0();
        j0Var.f1338C = this.f9187a;
        j0Var.f1339D = this.f9188b;
        j0Var.f1340E = this.f9189c;
        j0Var.f1341F = this.f9190d;
        j0Var.f1342G = true;
        return j0Var;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        j0 j0Var = (j0) abstractC1397o;
        j0Var.f1338C = this.f9187a;
        j0Var.f1339D = this.f9188b;
        j0Var.f1340E = this.f9189c;
        j0Var.f1341F = this.f9190d;
        j0Var.f1342G = true;
    }
}
