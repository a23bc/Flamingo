package androidx.compose.foundation;

import B.k;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import r0.C1395m;
import r0.InterfaceC1398p;
import x.InterfaceC1844c0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1844c0 f9154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f9155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f9156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f9157r;

    public c(InterfaceC1844c0 interfaceC1844c0, boolean z6, String str, InterfaceC1180a interfaceC1180a) {
        this.f9154o = interfaceC1844c0;
        this.f9155p = z6;
        this.f9156q = str;
        this.f9157r = interfaceC1180a;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(-1525724089);
        Object objK = c0912t.K();
        if (objK == C0903o.f11850a) {
            objK = n1.c.q(c0912t);
        }
        k kVar = (k) objK;
        InterfaceC1398p interfaceC1398pF = f.a(C1395m.f15634a, kVar, this.f9154o).f(new ClickableElement(kVar, null, false, this.f9155p, this.f9156q, null, this.f9157r));
        c0912t.p(false);
        return interfaceC1398pF;
    }
}
