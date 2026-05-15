package androidx.compose.foundation;

import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1883w;
import y0.AbstractC1983p;
import y0.C1952B;
import y0.C1987t;
import y0.InterfaceC1963M;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1983p f9116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1963M f9118d;

    public BackgroundElement(long j3, C1952B c1952b, InterfaceC1963M interfaceC1963M, int i7) {
        j3 = (i7 & 1) != 0 ? C1987t.f20262j : j3;
        c1952b = (i7 & 2) != 0 ? null : c1952b;
        this.f9115a = j3;
        this.f9116b = c1952b;
        this.f9117c = 1.0f;
        this.f9118d = interfaceC1963M;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && C1987t.c(this.f9115a, backgroundElement.f9115a) && AbstractC1209k.a(this.f9116b, backgroundElement.f9116b) && this.f9117c == backgroundElement.f9117c && AbstractC1209k.a(this.f9118d, backgroundElement.f9118d);
    }

    public final int hashCode() {
        int i7 = C1987t.i(this.f9115a) * 31;
        AbstractC1983p abstractC1983p = this.f9116b;
        return this.f9118d.hashCode() + n1.c.n(this.f9117c, (i7 + (abstractC1983p != null ? abstractC1983p.hashCode() : 0)) * 31, 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        C1883w c1883w = new C1883w();
        c1883w.f19846C = this.f9115a;
        c1883w.f19847D = this.f9116b;
        c1883w.f19848E = this.f9117c;
        c1883w.f19849F = this.f9118d;
        c1883w.f19850G = 9205357640488583168L;
        return c1883w;
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1883w c1883w = (C1883w) abstractC1397o;
        c1883w.f19846C = this.f9115a;
        c1883w.f19847D = this.f9116b;
        c1883w.f19848E = this.f9117c;
        c1883w.f19849F = this.f9118d;
        AbstractC0347f.m(c1883w);
    }
}
