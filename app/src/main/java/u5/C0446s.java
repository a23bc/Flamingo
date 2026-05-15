package U5;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1385c;
import v.C1618o;
import w.n0;

/* JADX INFO: renamed from: U5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0446s implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0 f7263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0 f7264q;

    public /* synthetic */ C0446s(n0 n0Var, n0 n0Var2, int i7) {
        this.f7262o = i7;
        this.f7263p = n0Var;
        this.f7264q = n0Var2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1618o c1618o = (C1618o) obj;
        switch (this.f7262o) {
            case 0:
                n0 n0Var = this.f7263p;
                n0 n0Var2 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$AnimatedNavHost");
                return androidx.compose.animation.b.e(n0Var, 2).a(androidx.compose.animation.b.b(n0Var2, C1385c.f15608A, false, new F.g(21)));
            case 1:
                n0 n0Var3 = this.f7263p;
                n0 n0Var4 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$AnimatedNavHost");
                return androidx.compose.animation.b.f(n0Var3, 2).a(androidx.compose.animation.b.k(n0Var4, C1385c.f15610C, false, new F.g(18)));
            case 2:
                n0 n0Var5 = this.f7263p;
                n0 n0Var6 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$AnimatedNavHost");
                return androidx.compose.animation.b.e(n0Var5, 2).a(androidx.compose.animation.b.b(n0Var6, C1385c.f15610C, false, new F.g(20)));
            case 3:
                n0 n0Var7 = this.f7263p;
                n0 n0Var8 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$AnimatedNavHost");
                return androidx.compose.animation.b.f(n0Var7, 2).a(androidx.compose.animation.b.k(n0Var8, C1385c.f15608A, false, new F.g(19)));
            case 4:
                n0 n0Var9 = this.f7263p;
                n0 n0Var10 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$NavHost");
                return androidx.compose.animation.b.e(n0Var9, 2).a(androidx.compose.animation.b.b(n0Var10, C1385c.f15608A, false, new F.g(24)));
            case 5:
                n0 n0Var11 = this.f7263p;
                n0 n0Var12 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$NavHost");
                return androidx.compose.animation.b.f(n0Var11, 2).a(androidx.compose.animation.b.k(n0Var12, C1385c.f15610C, false, new F.g(25)));
            case 6:
                n0 n0Var13 = this.f7263p;
                n0 n0Var14 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$NavHost");
                return androidx.compose.animation.b.e(n0Var13, 2).a(androidx.compose.animation.b.b(n0Var14, C1385c.f15610C, false, new F.g(27)));
            default:
                n0 n0Var15 = this.f7263p;
                n0 n0Var16 = this.f7264q;
                AbstractC1209k.f(c1618o, "$this$NavHost");
                return androidx.compose.animation.b.f(n0Var15, 2).a(androidx.compose.animation.b.k(n0Var16, C1385c.f15608A, false, new F.g(26)));
        }
    }
}
