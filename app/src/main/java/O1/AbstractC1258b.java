package o1;

import n1.j;
import t.AbstractC1464t;
import t.U;
import u.AbstractC1525a;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1258b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f14655a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile U f14656b = new U(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f14657c;

    static {
        Object[] objArr = new Object[0];
        f14657c = objArr;
        synchronized (objArr) {
            f14656b.g((int) 115.0f, new C1259c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f14656b.g((int) 130.0f, new C1259c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f14656b.g((int) 150.0f, new C1259c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f14656b.g((int) 180.0f, new C1259c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f14656b.g((int) 200.0f, new C1259c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f14656b.f(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        j.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static InterfaceC1257a a(float f7) {
        float f8;
        InterfaceC1257a c1259c;
        if (f7 < 1.03f) {
            return null;
        }
        int i7 = (int) (f7 * 100.0f);
        InterfaceC1257a interfaceC1257a = (InterfaceC1257a) f14656b.e(i7);
        if (interfaceC1257a != null) {
            return interfaceC1257a;
        }
        U u7 = f14656b;
        if (u7.f16037o) {
            AbstractC1464t.a(u7);
        }
        int iA = AbstractC1525a.a(u7.f16040r, i7, u7.f16038p);
        if (iA >= 0) {
            return (InterfaceC1257a) f14656b.i(iA);
        }
        int i8 = -(iA + 1);
        int i9 = i8 - 1;
        if (i8 >= f14656b.h()) {
            C1259c c1259c2 = new C1259c(new float[]{1.0f}, new float[]{f7});
            b(f7, c1259c2);
            return c1259c2;
        }
        float[] fArr = f14655a;
        if (i9 < 0) {
            c1259c = new C1259c(fArr, fArr);
            f8 = 1.0f;
        } else {
            f8 = f14656b.f(i9) / 100.0f;
            c1259c = (InterfaceC1257a) f14656b.i(i9);
        }
        float f9 = f14656b.f(i8) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f8 == f9 ? 0.0f : (f7 - f8) / (f9 - f8))) * 1.0f) + 0.0f;
        InterfaceC1257a interfaceC1257a2 = (InterfaceC1257a) f14656b.i(i8);
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f10 = fArr[i10];
            float fB = c1259c.b(f10);
            fArr2[i10] = ((interfaceC1257a2.b(f10) - fB) * fMax) + fB;
        }
        C1259c c1259c3 = new C1259c(fArr, fArr2);
        b(f7, c1259c3);
        return c1259c3;
    }

    public static void b(float f7, C1259c c1259c) {
        synchronized (f14657c) {
            U uClone = f14656b.clone();
            uClone.g((int) (f7 * 100.0f), c1259c);
            f14656b = uClone;
        }
    }
}
