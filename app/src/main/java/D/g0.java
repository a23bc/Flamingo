package D;

import O0.InterfaceC0298b0;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0054a f1323a;

    public g0(C0054a c0054a) {
        this.f1323a = c0054a;
    }

    @Override // D.x0
    public final int a(InterfaceC0298b0 interfaceC0298b0) {
        if ((AbstractC0060d.h & 32) != 0) {
            return this.f1323a.e().f20274d;
        }
        return 0;
    }

    @Override // D.x0
    public final int b(InterfaceC0298b0 interfaceC0298b0) {
        if ((AbstractC0060d.h & 16) != 0) {
            return this.f1323a.e().f20272b;
        }
        return 0;
    }

    @Override // D.x0
    public final int c(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        if (((nVar == n1.n.f14521o ? 8 : 2) & AbstractC0060d.h) != 0) {
            return this.f1323a.e().f20271a;
        }
        return 0;
    }

    @Override // D.x0
    public final int d(InterfaceC0298b0 interfaceC0298b0, n1.n nVar) {
        if (((nVar == n1.n.f14521o ? 4 : 1) & AbstractC0060d.h) != 0) {
            return this.f1323a.e().f20273c;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return AbstractC1209k.a(this.f1323a, ((g0) obj).f1323a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1323a.hashCode() * 31) + AbstractC0060d.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f1323a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i7 = AbstractC0060d.h;
        int i8 = AbstractC0060d.f1307d;
        if ((i7 & i8) == i8) {
            AbstractC0060d.o(sb3, "Start");
        }
        int i9 = AbstractC0060d.f1309f;
        if ((i7 & i9) == i9) {
            AbstractC0060d.o(sb3, "Left");
        }
        if ((i7 & 16) == 16) {
            AbstractC0060d.o(sb3, "Top");
        }
        int i10 = AbstractC0060d.f1308e;
        if ((i7 & i10) == i10) {
            AbstractC0060d.o(sb3, "End");
        }
        int i11 = AbstractC0060d.f1310g;
        if ((i7 & i11) == i11) {
            AbstractC0060d.o(sb3, "Right");
        }
        if ((i7 & 32) == 32) {
            AbstractC0060d.o(sb3, "Bottom");
        }
        String string = sb3.toString();
        AbstractC1209k.e(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
