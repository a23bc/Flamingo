package L3;

import android.animation.TypeEvaluator;
import j5.AbstractC1110d;
import y1.C1995d;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1995d[] f4257a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        C1995d[] c1995dArr = (C1995d[]) obj;
        C1995d[] c1995dArr2 = (C1995d[]) obj2;
        if (!AbstractC1110d.r(c1995dArr, c1995dArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC1110d.r(this.f4257a, c1995dArr)) {
            this.f4257a = AbstractC1110d.v(c1995dArr);
        }
        for (int i7 = 0; i7 < c1995dArr.length; i7++) {
            C1995d c1995d = this.f4257a[i7];
            C1995d c1995d2 = c1995dArr[i7];
            C1995d c1995d3 = c1995dArr2[i7];
            c1995d.getClass();
            c1995d.f20276a = c1995d2.f20276a;
            int i8 = 0;
            while (true) {
                float[] fArr = c1995d2.f20277b;
                if (i8 < fArr.length) {
                    c1995d.f20277b[i8] = (c1995d3.f20277b[i8] * f7) + ((1.0f - f7) * fArr[i8]);
                    i8++;
                }
            }
        }
        return this.f4257a;
    }
}
