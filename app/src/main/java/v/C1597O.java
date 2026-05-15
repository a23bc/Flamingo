package v;

import D.AbstractC0059c0;
import r0.InterfaceC1386d;

/* JADX INFO: renamed from: v.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1597O extends AbstractC0059c0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public w.j0 f17994D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public w.c0 f17995E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w.c0 f17996F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1598P f17997G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C1599Q f17998H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1589G f17999I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f18000J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC1386d f18001K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C1596N f18002L;

    public C1597O(w.j0 j0Var, w.c0 c0Var, w.c0 c0Var2, C1598P c1598p, C1599Q c1599q, C1589G c1589g) {
        super(1);
        this.f17994D = j0Var;
        this.f17995E = c0Var;
        this.f17996F = c0Var2;
        this.f17997G = c1598p;
        this.f17998H = c1599q;
        this.f17999I = c1589g;
        this.f18000J = androidx.compose.animation.a.f9110a;
        n1.b.b(0, 0, 15);
        this.f18002L = new C1596N(this, 0);
        new C1596N(this, 1);
    }

    public final InterfaceC1386d D0() {
        InterfaceC1386d interfaceC1386d;
        InterfaceC1386d interfaceC1386d2;
        if (this.f17994D.f().b(EnumC1588F.f17962o, EnumC1588F.f17963p)) {
            C1584B c1584b = this.f17997G.f18004a.f18187b;
            if (c1584b != null && (interfaceC1386d2 = c1584b.f17945a) != null) {
                return interfaceC1386d2;
            }
            C1584B c1584b2 = this.f17998H.f18007a.f18187b;
            if (c1584b2 != null) {
                return c1584b2.f17945a;
            }
            return null;
        }
        C1584B c1584b3 = this.f17998H.f18007a.f18187b;
        if (c1584b3 != null && (interfaceC1386d = c1584b3.f17945a) != null) {
            return interfaceC1386d;
        }
        C1584B c1584b4 = this.f17997G.f18004a.f18187b;
        if (c1584b4 != null) {
            return c1584b4.f17945a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    @Override // D.AbstractC0059c0, Q0.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O0.InterfaceC0296a0 e(O0.InterfaceC0298b0 r25, O0.Y r26, long r27) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1597O.e(O0.b0, O0.Y, long):O0.a0");
    }

    @Override // r0.AbstractC1397o
    public final void r0() {
        this.f18000J = androidx.compose.animation.a.f9110a;
    }
}
