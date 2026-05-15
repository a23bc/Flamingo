package androidx.compose.foundation;

import B.k;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import r0.AbstractC1383a;
import r0.C1395m;
import r0.InterfaceC1398p;
import x.InterfaceC1844c0;
import x.InterfaceC1852g0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f9151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f9153q;

    public b(boolean z6, String str, InterfaceC1180a interfaceC1180a) {
        this.f9151o = z6;
        this.f9152p = str;
        this.f9153q = interfaceC1180a;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        k kVar;
        InterfaceC1398p interfaceC1398pF;
        C0912t c0912t = (C0912t) obj2;
        ((Number) obj3).intValue();
        c0912t.X(-691633986);
        InterfaceC1844c0 interfaceC1844c0 = (InterfaceC1844c0) c0912t.j(f.f9163a);
        if (interfaceC1844c0 instanceof InterfaceC1852g0) {
            c0912t.X(-1509763983);
            c0912t.p(false);
            kVar = null;
        } else {
            c0912t.X(-1509607061);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = n1.c.q(c0912t);
            }
            kVar = (k) objK;
            c0912t.p(false);
        }
        k kVar2 = kVar;
        boolean z6 = interfaceC1844c0 instanceof InterfaceC1852g0;
        boolean z7 = this.f9151o;
        String str = this.f9152p;
        InterfaceC1180a interfaceC1180a = this.f9153q;
        if (z6) {
            interfaceC1398pF = new ClickableElement(kVar2, (InterfaceC1852g0) interfaceC1844c0, false, z7, str, null, interfaceC1180a);
        } else if (interfaceC1844c0 == null) {
            interfaceC1398pF = new ClickableElement(kVar2, null, false, z7, str, null, interfaceC1180a);
        } else {
            C1395m c1395m = C1395m.f15634a;
            interfaceC1398pF = kVar2 != null ? f.a(c1395m, kVar2, interfaceC1844c0).f(new ClickableElement(kVar2, null, false, z7, str, null, interfaceC1180a)) : AbstractC1383a.a(c1395m, new c(interfaceC1844c0, z7, str, interfaceC1180a));
        }
        c0912t.p(false);
        return interfaceC1398pF;
    }
}
