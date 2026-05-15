package t2;

import android.os.Looper;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.util.Objects;
import w.InterfaceC1690x;
import w2.AbstractC1697a;
import w3.A0;
import w3.C1747r0;
import w3.C1760y;
import w3.InterfaceC1722e0;
import w3.InterfaceC1746q0;
import w3.InterfaceC1763z0;
import w3.h1;
import w3.r1;
import w3.z1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements D4.e, InterfaceC1690x, w2.g, InterfaceC1722e0, InterfaceC1763z0, h1, w2.c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f16412o;

    public /* synthetic */ c0(int i7) {
        this.f16412o = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x039c A[SYNTHETIC] */
    @Override // D4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c0.apply(java.lang.Object):java.lang.Object");
    }

    @Override // w2.g
    public void b(Object obj) {
        ((V) obj).G(1);
    }

    @Override // w2.c
    public void c(Object obj) {
        r1 r1Var = (r1) obj;
        switch (this.f16412o) {
            case BuildConfig.API_VERSION /* 20 */:
                r1Var.g();
                break;
            case 21:
                r1Var.F();
                break;
            case 22:
                r1Var.q0();
                break;
            case 23:
                r1Var.y0();
                break;
            case 24:
                r1Var.D0();
                break;
            case 25:
                r1Var.Q();
                break;
            case 26:
            default:
                r1Var.w0();
                break;
            case 27:
                r1Var.x0();
                break;
        }
    }

    @Override // w3.InterfaceC1763z0
    public void e(InterfaceC1746q0 interfaceC1746q0, int i7) {
        switch (this.f16412o) {
            case 15:
                interfaceC1746q0.getClass();
                break;
            case 16:
                interfaceC1746q0.getClass();
                break;
            default:
                interfaceC1746q0.h(i7);
                break;
        }
    }

    @Override // w3.InterfaceC1722e0
    public void h(w3.U u7) {
        switch (this.f16412o) {
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                if (u7.H0()) {
                    C1760y c1760y = u7.f19059a;
                    c1760y.getClass();
                    AbstractC1697a.i(Looper.myLooper() == c1760y.f19401e.getLooper());
                    c1760y.f19400d.getClass();
                    return;
                }
                return;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                u7.h.f(26, new A2.r(2));
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                C1760y c1760y2 = u7.f19059a;
                Objects.requireNonNull(c1760y2);
                c1760y2.Q0(new B2.e(23, c1760y2));
                return;
            case 12:
                throw new ClassCastException();
            case 13:
                if (u7.H0()) {
                    C1760y c1760y3 = u7.f19059a;
                    c1760y3.getClass();
                    AbstractC1697a.i(Looper.myLooper() == c1760y3.f19401e.getLooper());
                    c1760y3.f19400d.getClass();
                    return;
                }
                return;
            default:
                if (u7.H0()) {
                    C1760y c1760y4 = u7.f19059a;
                    c1760y4.getClass();
                    AbstractC1697a.i(Looper.myLooper() == c1760y4.f19401e.getLooper());
                    c1760y4.f19400d.getClass();
                    return;
                }
                return;
        }
    }

    @Override // w3.h1
    public Object i(A0 a0, C1747r0 c1747r0, int i7) {
        switch (this.f16412o) {
            case 18:
                a0.getClass();
                throw new ClassCastException();
            case 19:
                a0.getClass();
                throw new ClassCastException();
            case 26:
                a0.getClass();
                throw new ClassCastException();
            default:
                a0.r(c1747r0);
                a0.f18902e.getClass();
                return M3.a.U(new z1(-6));
        }
    }

    @Override // w.InterfaceC1690x
    public float k(float f7) {
        float f8;
        float f9;
        switch (this.f16412o) {
            case 5:
                if (f7 < 0.36363637f) {
                    return 7.5625f * f7 * f7;
                }
                if (f7 < 0.72727275f) {
                    float f10 = f7 - 0.54545456f;
                    f8 = 7.5625f * f10 * f10;
                    f9 = 0.75f;
                } else if (f7 < 0.90909094f) {
                    float f11 = f7 - 0.8181818f;
                    f8 = 7.5625f * f11 * f11;
                    f9 = 0.9375f;
                } else {
                    float f12 = f7 - 0.95454544f;
                    f8 = 7.5625f * f12 * f12;
                    f9 = 0.984375f;
                }
                return f8 + f9;
            default:
                return f7;
        }
    }

    public /* synthetic */ c0(int i7, int i8, Object obj) {
        this.f16412o = i8;
    }

    public /* synthetic */ c0(int i7, Object obj) {
        this.f16412o = i7;
    }

    public /* synthetic */ c0(String str, Y y6) {
        this.f16412o = 29;
    }
}
