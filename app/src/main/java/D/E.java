package D;

import O0.InterfaceC0298b0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class E implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f1219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f1220b;

    public E(x0 x0Var, x0 x0Var2) {
        this.f1219a = x0Var;
        this.f1220b = x0Var2;
    }

    @Override // D.x0
    public final int a(InterfaceC0298b0 interfaceC0298b0) {
        int iA = this.f1219a.a(interfaceC0298b0) - this.f1220b.a(interfaceC0298b0);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // D.x0
    public final int b(InterfaceC0298b0 interfaceC0298b0) {
        int iB = this.f1219a.b(interfaceC0298b0) - this.f1220b.b(interfaceC0298b0);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // D.x0
    public final int c(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        int iC = this.f1219a.c(interfaceC0298b0, nVar) - this.f1220b.c(interfaceC0298b0, nVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // D.x0
    public final int d(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        int iD = this.f1219a.d(interfaceC0298b0, nVar) - this.f1220b.d(interfaceC0298b0, nVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return AbstractC1209k.a(e7.f1219a, this.f1219a) && AbstractC1209k.a(e7.f1220b, this.f1220b);
    }

    public final int hashCode() {
        return this.f1220b.hashCode() + (this.f1219a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f1219a + " - " + this.f1220b + ')';
    }
}
