package h6;

import f0.C0879c;
import f0.C0912t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13172o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f13173p;

    public /* synthetic */ r(float f7) {
        this.f13173p = f7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13172o) {
            case 0:
                ((Integer) obj2).getClass();
                M3.a.c(this.f13173p, (C0912t) obj, C0879c.B(55));
                return Y4.o.f8736a;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float f7 = 50.0f * this.f13173p;
                float fAbs = Math.abs((fFloatValue2 / 2) + fFloatValue);
                if (fAbs < Float.MIN_VALUE) {
                    fAbs = Float.MIN_VALUE;
                }
                return Float.valueOf(Math.signum(fFloatValue) == Math.signum(fFloatValue2) ? (fFloatValue2 * i6.h.p(f7 / ((float) Math.sqrt(fAbs * f7)), Float.MIN_VALUE, 1.0f)) + fFloatValue : fFloatValue2 + fFloatValue);
        }
    }

    public /* synthetic */ r(int i7, float f7) {
        this.f13173p = f7;
    }
}
