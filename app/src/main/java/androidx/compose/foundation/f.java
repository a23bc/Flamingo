package androidx.compose.foundation;

import B.k;
import X.C0471d0;
import f0.D;
import r0.AbstractC1383a;
import r0.InterfaceC1398p;
import x.InterfaceC1844c0;
import x.InterfaceC1852g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f9163a = new D(new n6.c(27));

    public static final InterfaceC1398p a(InterfaceC1398p interfaceC1398p, k kVar, InterfaceC1844c0 interfaceC1844c0) {
        return interfaceC1844c0 == null ? interfaceC1398p : interfaceC1844c0 instanceof InterfaceC1852g0 ? interfaceC1398p.f(new IndicationModifierElement(kVar, (InterfaceC1852g0) interfaceC1844c0)) : AbstractC1383a.a(interfaceC1398p, new C0471d0(interfaceC1844c0, 8, kVar));
    }
}
