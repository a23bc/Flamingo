package D;

import O0.InterfaceC0298b0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f1402b;

    public u0(x0 x0Var, x0 x0Var2) {
        this.f1401a = x0Var;
        this.f1402b = x0Var2;
    }

    @Override // D.x0
    public final int a(InterfaceC0298b0 interfaceC0298b0) {
        return Math.max(this.f1401a.a(interfaceC0298b0), this.f1402b.a(interfaceC0298b0));
    }

    @Override // D.x0
    public final int b(InterfaceC0298b0 interfaceC0298b0) {
        return Math.max(this.f1401a.b(interfaceC0298b0), this.f1402b.b(interfaceC0298b0));
    }

    @Override // D.x0
    public final int c(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return Math.max(this.f1401a.c(interfaceC0298b0, nVar), this.f1402b.c(interfaceC0298b0, nVar));
    }

    @Override // D.x0
    public final int d(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return Math.max(this.f1401a.d(interfaceC0298b0, nVar), this.f1402b.d(interfaceC0298b0, nVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return AbstractC1209k.a(u0Var.f1401a, this.f1401a) && AbstractC1209k.a(u0Var.f1402b, this.f1402b);
    }

    public final int hashCode() {
        return (this.f1402b.hashCode() * 31) + this.f1401a.hashCode();
    }

    public final String toString() {
        return "(" + this.f1401a + " ∪ " + this.f1402b + ')';
    }
}
