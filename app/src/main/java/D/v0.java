package D;

import O0.InterfaceC0298b0;
import f0.C0879c;
import f0.C0894j0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0894j0 f1407b;

    public v0(Z z6, String str) {
        this.f1406a = str;
        this.f1407b = C0879c.t(z6);
    }

    @Override // D.x0
    public final int a(InterfaceC0298b0 interfaceC0298b0) {
        return e().f1291d;
    }

    @Override // D.x0
    public final int b(InterfaceC0298b0 interfaceC0298b0) {
        return e().f1289b;
    }

    @Override // D.x0
    public final int c(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return e().f1288a;
    }

    @Override // D.x0
    public final int d(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        return e().f1290c;
    }

    public final Z e() {
        return (Z) this.f1407b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0) {
            return AbstractC1209k.a(e(), ((v0) obj).e());
        }
        return false;
    }

    public final void f(Z z6) {
        this.f1407b.setValue(z6);
    }

    public final int hashCode() {
        return this.f1406a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1406a);
        sb.append("(left=");
        sb.append(e().f1288a);
        sb.append(", top=");
        sb.append(e().f1289b);
        sb.append(", right=");
        sb.append(e().f1290c);
        sb.append(", bottom=");
        return Z1.l.r(sb, e().f1291d, ')');
    }
}
