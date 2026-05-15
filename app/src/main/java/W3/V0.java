package w3;

import d2.C0821i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V0 implements g1, w2.c, h1, z0.i {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f19088o;

    public /* synthetic */ V0(int i7) {
        this.f19088o = i7;
    }

    @Override // w3.g1
    public void a(r1 r1Var, C1747r0 c1747r0, List list) {
        switch (this.f19088o) {
            case 0:
                r1Var.k0(list);
                break;
            default:
                r1Var.k0(list);
                break;
        }
    }

    @Override // z0.i
    public double b(double d4) {
        switch (this.f19088o) {
            case 13:
                double d7 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d7 >= 0.0031308049535603718d ? (Math.pow(d7, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d7 / 0.07739938080495357d, d4);
            case 14:
                double d8 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d8, d4);
            case 15:
                float[] fArr = z0.d.f21033a;
                return z0.d.b(z0.d.f21035c, d4);
            case 16:
                float[] fArr2 = z0.d.f21033a;
                return z0.d.a(z0.d.f21035c, d4);
            case 17:
                float[] fArr3 = z0.d.f21033a;
                return z0.d.d(z0.d.f21036d, d4);
            case 18:
                float[] fArr4 = z0.d.f21033a;
                return z0.d.c(z0.d.f21036d, d4);
            default:
                return d4;
        }
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f19088o) {
            case 1:
                r1Var.Y();
                break;
            case 2:
            case 3:
            case 5:
            default:
                r1Var.D();
                break;
            case 4:
                r1Var.stop();
                break;
            case 6:
                r1Var.b();
                break;
            case 7:
                r1Var.S();
                break;
        }
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        switch (this.f19088o) {
            case 3:
                a0.getClass();
                throw new ClassCastException();
            case 5:
                a0.getClass();
                throw new ClassCastException();
            case 8:
                a0.getClass();
                throw new ClassCastException();
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                a0.getClass();
                throw new ClassCastException();
            default:
                C1751t0 c1751t0 = a0.f18907k;
                a0.r(c1747r0);
                a0.f18902e.getClass();
                return M3.a.U(new z1(-6));
        }
    }

    public /* synthetic */ V0(t2.Y y6) {
        this.f19088o = 12;
    }
}
