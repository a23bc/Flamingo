package androidx.compose.foundation;

import B.k;
import Q0.AbstractC0344d0;
import Y0.g;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1885x;
import x.InterfaceC1852g0;

/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1852g0 f9120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f9124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1180a f9125g;

    public ClickableElement(k kVar, InterfaceC1852g0 interfaceC1852g0, boolean z6, boolean z7, String str, g gVar, InterfaceC1180a interfaceC1180a) {
        this.f9119a = kVar;
        this.f9120b = interfaceC1852g0;
        this.f9121c = z6;
        this.f9122d = z7;
        this.f9123e = str;
        this.f9124f = gVar;
        this.f9125g = interfaceC1180a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return AbstractC1209k.a(this.f9119a, clickableElement.f9119a) && AbstractC1209k.a(this.f9120b, clickableElement.f9120b) && this.f9121c == clickableElement.f9121c && this.f9122d == clickableElement.f9122d && AbstractC1209k.a(this.f9123e, clickableElement.f9123e) && AbstractC1209k.a(this.f9124f, clickableElement.f9124f) && this.f9125g == clickableElement.f9125g;
    }

    public final int hashCode() {
        k kVar = this.f9119a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        InterfaceC1852g0 interfaceC1852g0 = this.f9120b;
        int iHashCode2 = (((((iHashCode + (interfaceC1852g0 != null ? interfaceC1852g0.hashCode() : 0)) * 31) + (this.f9121c ? 1231 : 1237)) * 31) + (this.f9122d ? 1231 : 1237)) * 31;
        String str = this.f9123e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f9124f;
        return this.f9125g.hashCode() + ((iHashCode3 + (gVar != null ? gVar.f8444a : 0)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new C1885x(this.f9119a, this.f9120b, this.f9121c, this.f9122d, this.f9123e, this.f9124f, this.f9125g);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        ((C1885x) abstractC1397o).N0(this.f9119a, this.f9120b, this.f9121c, this.f9122d, this.f9123e, this.f9124f, this.f9125g);
    }
}
