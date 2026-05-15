package androidx.compose.foundation;

import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Y0.w;
import android.view.View;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n1.g;
import r0.AbstractC1397o;
import x.AbstractC1860k0;
import x.C1858j0;
import x.InterfaceC1884w0;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1182c f9140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1182c f9141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1884w0 f9142c;

    public MagnifierElement(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1884w0 interfaceC1884w0) {
        this.f9140a = interfaceC1182c;
        this.f9141b = interfaceC1182c2;
        this.f9142c = interfaceC1884w0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        InterfaceC1182c interfaceC1182c = ((MagnifierElement) obj).f9140a;
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 9205357638345293824L;
        return this.f9142c.hashCode() + ((this.f9141b.hashCode() + ((((Float.floatToIntBits(Float.NaN) + n1.c.n(Float.NaN, (i7 + ((((Float.floatToIntBits(Float.NaN) + (this.f9140a.hashCode() * 961)) * 31) + 1231) * 31)) * 31, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new C1858j0(this.f9140a, this.f9141b, this.f9142c);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        C1858j0 c1858j0 = (C1858j0) abstractC1397o;
        c1858j0.getClass();
        InterfaceC1884w0 interfaceC1884w0 = c1858j0.f19756E;
        View view = c1858j0.f19757F;
        n1.d dVar = c1858j0.f19758G;
        c1858j0.f19754C = this.f9140a;
        c1858j0.f19755D = this.f9141b;
        InterfaceC1884w0 interfaceC1884w02 = this.f9142c;
        c1858j0.f19756E = interfaceC1884w02;
        View viewZ = AbstractC0347f.z(c1858j0);
        n1.d dVar2 = AbstractC0347f.x(c1858j0).f5814M;
        if (c1858j0.f19759H != null) {
            w wVar = AbstractC1860k0.f19768a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC1884w02.a()) || !g.a(Float.NaN, Float.NaN) || !g.a(Float.NaN, Float.NaN) || !interfaceC1884w02.equals(interfaceC1884w0) || !viewZ.equals(view) || !AbstractC1209k.a(dVar2, dVar)) {
                c1858j0.C0();
            }
        }
        c1858j0.D0();
    }
}
