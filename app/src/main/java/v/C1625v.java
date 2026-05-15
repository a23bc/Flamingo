package v;

import f0.C0912t;
import m5.AbstractC1210l;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1625v extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1627x f18183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1598P f18184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1599Q f18185r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625v(C1627x c1627x, C1598P c1598p, C1599Q c1599q) {
        super(3);
        this.f18183p = c1627x;
        this.f18184q = c1598p;
        this.f18185r = c1599q;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(1840112047);
        InterfaceC1398p interfaceC1398pF = ((InterfaceC1398p) obj).f(androidx.compose.animation.b.a(this.f18183p.f18191a, this.f18184q, this.f18185r, "animateEnterExit", c0912t, 0));
        c0912t.p(false);
        return interfaceC1398pF;
    }
}
