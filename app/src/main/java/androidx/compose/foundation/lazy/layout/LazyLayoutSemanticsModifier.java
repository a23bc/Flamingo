package androidx.compose.foundation.lazy.layout;

import B5.i;
import H.b0;
import H.f0;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f9212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2048l0 f9213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9214d;

    public LazyLayoutSemanticsModifier(i iVar, b0 b0Var, EnumC2048l0 enumC2048l0, boolean z6) {
        this.f9211a = iVar;
        this.f9212b = b0Var;
        this.f9213c = enumC2048l0;
        this.f9214d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f9211a == lazyLayoutSemanticsModifier.f9211a && AbstractC1209k.a(this.f9212b, lazyLayoutSemanticsModifier.f9212b) && this.f9213c == lazyLayoutSemanticsModifier.f9213c && this.f9214d == lazyLayoutSemanticsModifier.f9214d;
    }

    public final int hashCode() {
        return ((((this.f9213c.hashCode() + ((this.f9212b.hashCode() + (this.f9211a.hashCode() * 31)) * 31)) * 31) + (this.f9214d ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        EnumC2048l0 enumC2048l0 = this.f9213c;
        return new f0(this.f9211a, this.f9212b, enumC2048l0, this.f9214d);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        f0 f0Var = (f0) abstractC1397o;
        f0Var.f2866C = this.f9211a;
        f0Var.f2867D = this.f9212b;
        EnumC2048l0 enumC2048l0 = f0Var.f2868E;
        EnumC2048l0 enumC2048l02 = this.f9213c;
        if (enumC2048l0 != enumC2048l02) {
            f0Var.f2868E = enumC2048l02;
            AbstractC0347f.o(f0Var);
        }
        boolean z6 = f0Var.f2869F;
        boolean z7 = this.f9214d;
        if (z6 == z7) {
            return;
        }
        f0Var.f2869F = z7;
        f0Var.B0();
        AbstractC0347f.o(f0Var);
    }
}
