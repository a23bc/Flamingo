package T4;

import Q0.N;
import a.AbstractC0509a;
import android.os.Build;
import m5.AbstractC1209k;
import y0.AbstractC1970c;
import y0.AbstractC1983p;
import y0.C1980m;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    public static final boolean f6975a;

    /* JADX INFO: renamed from: b */
    public static final j f6976b;

    static {
        f6975a = Build.VERSION.SDK_INT >= 32;
        f6976b = new j(3, 0);
    }

    public static final void a(d dVar, N n7, f fVar, B0.d dVar2) {
        AbstractC1209k.f(dVar, "<this>");
        AbstractC1209k.f(fVar, "effect");
        if (dVar2 != null && AbstractC1970c.a(n7.f5853o.f54p.S()).isHardwareAccelerated()) {
            AbstractC0509a.t(n7, dVar2);
            return;
        }
        AbstractC1983p abstractC1983p = fVar.f6964i;
        long j3 = fVar.f6966k;
        float fD = C1987t.d(j3) * ((fVar.f6963g / 72.0f) + 1);
        if (fD > 1.0f) {
            fD = 1.0f;
        }
        long jB = C1987t.b(j3, fD);
        if (abstractC1983p != null) {
            A0.e.w(n7, abstractC1983p, 0L, 0L, 0.0f, null, new C1980m(jB, 5), 94);
        } else {
            A0.e.x(0.0f, 126, jB, 0L, n7);
        }
    }
}
