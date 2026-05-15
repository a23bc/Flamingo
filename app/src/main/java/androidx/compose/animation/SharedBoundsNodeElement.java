package androidx.compose.animation;

import A0.e;
import P0.f;
import Q0.AbstractC0344d0;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import v.X;
import v.Y;
import v.Z;
import v.b0;

/* JADX INFO: loaded from: classes.dex */
public final class SharedBoundsNodeElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f9108a;

    public SharedBoundsNodeElement(b0 b0Var) {
        this.f9108a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && AbstractC1209k.a(this.f9108a, ((SharedBoundsNodeElement) obj).f9108a);
    }

    public final int hashCode() {
        return this.f9108a.hashCode();
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new Y(this.f9108a);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        Y y6 = (Y) abstractC1397o;
        b0 b0Var = y6.f18020C;
        b0 b0Var2 = this.f9108a;
        if (b0Var2.equals(b0Var)) {
            return;
        }
        y6.f18020C = b0Var2;
        if (y6.f15636B) {
            f fVar = Z.f18023a;
            e.n(y6, fVar, b0Var2);
            y6.f18020C.f18044y = (b0) e.a(y6, fVar);
            b0 b0Var3 = y6.f18020C;
            b0Var3.f18045z.setValue(y6.f18021D);
            y6.f18020C.f18043x = new X(y6, 1);
        }
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.f9108a + ')';
    }
}
