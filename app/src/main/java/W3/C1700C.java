package w3;

import d2.C0821i;
import t2.C1485n;

/* JADX INFO: renamed from: w3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1700C implements S, w2.h, w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f18934p;

    public /* synthetic */ C1700C(U u7, int i7) {
        this.f18933o = i7;
        this.f18934p = u7;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f18933o) {
            case 14:
                v3.d(this.f18934p.f19076t);
                break;
            default:
                v3.d(this.f18934p.f19076t);
                break;
        }
    }

    @Override // w2.h
    public void d(Object obj, C1485n c1485n) {
        U u7 = this.f18934p;
        u7.getClass();
        ((t2.V) obj).t(u7.f19059a, new t2.U(c1485n));
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f18933o) {
            case 0:
                interfaceC1741o.y(this.f18934p.f19061c, i7);
                break;
            case 1:
                interfaceC1741o.i1(this.f18934p.f19061c, i7);
                break;
            case 2:
                interfaceC1741o.U0(this.f18934p.f19061c, i7);
                break;
            case 3:
                interfaceC1741o.m0(this.f18934p.f19061c, i7);
                break;
            case 4:
            default:
                interfaceC1741o.C0(this.f18934p.f19061c, i7);
                break;
            case 5:
                interfaceC1741o.b1(this.f18934p.f19061c, i7);
                break;
            case 6:
                interfaceC1741o.N(this.f18934p.f19061c, i7);
                break;
            case 7:
                interfaceC1741o.d1(this.f18934p.f19061c, i7);
                break;
            case 8:
                interfaceC1741o.k1(this.f18934p.f19061c, i7);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                interfaceC1741o.I(this.f18934p.f19061c, i7);
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                interfaceC1741o.F(this.f18934p.f19061c, i7);
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                interfaceC1741o.r0(this.f18934p.f19061c, i7);
                break;
            case 12:
                interfaceC1741o.h0(this.f18934p.f19061c, i7);
                break;
            case 13:
                interfaceC1741o.c0(this.f18934p.f19061c, i7);
                break;
        }
    }
}
