package androidx.compose.foundation.layout;

import D.EnumC0057b0;
import D.k0;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import z4.C2088g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static k0 a(float f7, float f8, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        if ((i7 & 4) != 0) {
            f9 = 0;
        }
        if ((i7 & 8) != 0) {
            f10 = 0;
        }
        return new k0(f7, f8, f9, f10);
    }

    public static InterfaceC1398p b(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new AspectRatioElement(f7));
    }

    public static final InterfaceC1398p c(InterfaceC1398p interfaceC1398p) {
        EnumC0057b0 enumC0057b0 = EnumC0057b0.f1299o;
        return interfaceC1398p.f(new IntrinsicHeightElement());
    }

    public static final boolean d(int i7, int i8, long j3) {
        int iJ = n1.a.j(j3);
        if (i7 > n1.a.h(j3) || iJ > i7) {
            return false;
        }
        return i8 <= n1.a.g(j3) && n1.a.i(j3) <= i8;
    }

    public static final InterfaceC1398p e(InterfaceC1398p interfaceC1398p, InterfaceC1182c interfaceC1182c) {
        return interfaceC1398p.f(new OffsetPxElement(interfaceC1182c));
    }

    public static final InterfaceC1398p f(InterfaceC1398p interfaceC1398p, C2088g c2088g) {
        return interfaceC1398p.f(new PaddingValuesElement(c2088g));
    }

    public static final InterfaceC1398p g(InterfaceC1398p interfaceC1398p, float f7) {
        return interfaceC1398p.f(new PaddingElement(f7, f7, f7, f7));
    }

    public static final InterfaceC1398p h(InterfaceC1398p interfaceC1398p, float f7, float f8) {
        return interfaceC1398p.f(new PaddingElement(f7, f8, f7, f8));
    }

    public static InterfaceC1398p i(InterfaceC1398p interfaceC1398p, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        return h(interfaceC1398p, f7, f8);
    }

    public static InterfaceC1398p j(InterfaceC1398p interfaceC1398p, float f7, float f8, float f9, float f10, int i7) {
        if ((i7 & 1) != 0) {
            f7 = 0;
        }
        if ((i7 & 2) != 0) {
            f8 = 0;
        }
        if ((i7 & 4) != 0) {
            f9 = 0;
        }
        if ((i7 & 8) != 0) {
            f10 = 0;
        }
        return interfaceC1398p.f(new PaddingElement(f7, f8, f9, f10));
    }

    public static final InterfaceC1398p k(InterfaceC1398p interfaceC1398p) {
        EnumC0057b0 enumC0057b0 = EnumC0057b0.f1299o;
        return interfaceC1398p.f(new IntrinsicWidthElement());
    }
}
