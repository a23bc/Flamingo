package d0;

import f0.C0894j0;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0792i extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0801p f11015q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0792i(C0801p c0801p, int i7) {
        super(0);
        this.f11014p = i7;
        this.f11015q = c0801p;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f11014p) {
            case 0:
                return this.f11015q.d();
            case 1:
                C0801p c0801p = this.f11015q;
                return new Y4.h(c0801p.d(), c0801p.f11062g.getValue());
            case 2:
                C0801p c0801p2 = this.f11015q;
                Object value = c0801p2.f11065k.getValue();
                if (value != null) {
                    return value;
                }
                float fH = c0801p2.f11063i.h();
                boolean zIsNaN = Float.isNaN(fH);
                C0894j0 c0894j0 = c0801p2.f11061f;
                if (zIsNaN) {
                    return c0894j0.getValue();
                }
                Object value2 = c0894j0.getValue();
                F fD = c0801p2.d();
                float fD2 = fD.d(value2);
                if (fD2 != fH && !Float.isNaN(fD2)) {
                    if (fD2 < fH) {
                        Object objB = fD.b(fH, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = fD.b(fH, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 3:
                C0801p c0801p3 = this.f11015q;
                float fD3 = c0801p3.d().d(c0801p3.f11061f.getValue());
                float fD4 = c0801p3.d().d(c0801p3.h.getValue()) - fD3;
                float fAbs = Math.abs(fD4);
                float f7 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float f8 = (c0801p3.f() - fD3) / fD4;
                    if (f8 < 1.0E-6f) {
                        f7 = 0.0f;
                    } else if (f8 <= 0.999999f) {
                        f7 = f8;
                    }
                }
                return Float.valueOf(f7);
            default:
                C0801p c0801p4 = this.f11015q;
                Object value3 = c0801p4.f11065k.getValue();
                if (value3 != null) {
                    return value3;
                }
                float fH2 = c0801p4.f11063i.h();
                boolean zIsNaN2 = Float.isNaN(fH2);
                C0894j0 c0894j02 = c0801p4.f11061f;
                return !zIsNaN2 ? c0801p4.c(fH2, 0.0f, c0894j02.getValue()) : c0894j02.getValue();
        }
    }
}
