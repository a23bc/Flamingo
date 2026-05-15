package androidx.compose.foundation;

import B.k;
import K0.N;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Y0.g;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import x.C1820G;
import x.InterfaceC1852g0;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1852g0 f9127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f9131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1180a f9132g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1180a f9133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1180a f9134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9135k;

    public CombinedClickableElement(k kVar, g gVar, String str, String str2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1852g0 interfaceC1852g0, boolean z6, boolean z7, boolean z8) {
        this.f9126a = kVar;
        this.f9127b = interfaceC1852g0;
        this.f9128c = z6;
        this.f9129d = z7;
        this.f9130e = str;
        this.f9131f = gVar;
        this.f9132g = interfaceC1180a;
        this.h = str2;
        this.f9133i = interfaceC1180a2;
        this.f9134j = interfaceC1180a3;
        this.f9135k = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC1209k.a(this.f9126a, combinedClickableElement.f9126a) && AbstractC1209k.a(this.f9127b, combinedClickableElement.f9127b) && this.f9128c == combinedClickableElement.f9128c && this.f9129d == combinedClickableElement.f9129d && AbstractC1209k.a(this.f9130e, combinedClickableElement.f9130e) && AbstractC1209k.a(this.f9131f, combinedClickableElement.f9131f) && this.f9132g == combinedClickableElement.f9132g && AbstractC1209k.a(this.h, combinedClickableElement.h) && this.f9133i == combinedClickableElement.f9133i && this.f9134j == combinedClickableElement.f9134j && this.f9135k == combinedClickableElement.f9135k;
    }

    public final int hashCode() {
        k kVar = this.f9126a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        InterfaceC1852g0 interfaceC1852g0 = this.f9127b;
        int iHashCode2 = (((((iHashCode + (interfaceC1852g0 != null ? interfaceC1852g0.hashCode() : 0)) * 31) + (this.f9128c ? 1231 : 1237)) * 31) + (this.f9129d ? 1231 : 1237)) * 31;
        String str = this.f9130e;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        g gVar = this.f9131f;
        int iHashCode4 = (this.f9132g.hashCode() + ((iHashCode3 + (gVar != null ? gVar.f8444a : 0)) * 31)) * 31;
        String str2 = this.h;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC1180a interfaceC1180a = this.f9133i;
        int iHashCode6 = (iHashCode5 + (interfaceC1180a != null ? interfaceC1180a.hashCode() : 0)) * 31;
        InterfaceC1180a interfaceC1180a2 = this.f9134j;
        return ((iHashCode6 + (interfaceC1180a2 != null ? interfaceC1180a2.hashCode() : 0)) * 31) + (this.f9135k ? 1231 : 1237);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        boolean z6 = this.f9128c;
        g gVar = this.f9131f;
        InterfaceC1180a interfaceC1180a = this.f9132g;
        String str = this.h;
        InterfaceC1180a interfaceC1180a2 = this.f9133i;
        InterfaceC1180a interfaceC1180a3 = this.f9134j;
        boolean z7 = this.f9135k;
        return new C1820G(this.f9126a, gVar, str, this.f9130e, interfaceC1180a, interfaceC1180a2, interfaceC1180a3, this.f9127b, z7, z6, this.f9129d);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        boolean z6;
        N n7;
        C1820G c1820g = (C1820G) abstractC1397o;
        c1820g.b0 = this.f9135k;
        String str = c1820g.f19644Y;
        String str2 = this.h;
        if (!AbstractC1209k.a(str, str2)) {
            c1820g.f19644Y = str2;
            AbstractC0347f.o(c1820g);
        }
        boolean z7 = c1820g.Z == null;
        InterfaceC1180a interfaceC1180a = this.f9133i;
        if (z7 != (interfaceC1180a == null)) {
            c1820g.H0();
            AbstractC0347f.o(c1820g);
            z6 = true;
        } else {
            z6 = false;
        }
        c1820g.Z = interfaceC1180a;
        boolean z8 = c1820g.a0 == null;
        InterfaceC1180a interfaceC1180a2 = this.f9134j;
        if (z8 != (interfaceC1180a2 == null)) {
            z6 = true;
        }
        c1820g.a0 = interfaceC1180a2;
        boolean z9 = c1820g.f19795J;
        boolean z10 = this.f9129d;
        if (z9 != z10) {
            z6 = true;
        }
        c1820g.N0(this.f9126a, this.f9127b, this.f9128c, z10, this.f9130e, this.f9131f, this.f9132g);
        if (!z6 || (n7 = c1820g.f19799N) == null) {
            return;
        }
        n7.D0();
    }
}
