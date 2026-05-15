package y0;

import android.graphics.Paint;
import android.graphics.Shader;
import m5.AbstractC1209k;
import x0.C1895e;

/* JADX INFO: renamed from: y0.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1961K extends AbstractC1983p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k.I f20205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20206b = 9205357640488583168L;

    @Override // y0.AbstractC1983p
    public final void a(float f7, long j3, w2.l lVar) {
        k.I i7 = this.f20205a;
        if (i7 == null || !C1895e.a(this.f20206b, j3)) {
            if (C1895e.e(j3)) {
                this.f20205a = null;
                this.f20206b = 9205357640488583168L;
                i7 = null;
            } else {
                i7 = this.f20205a;
                if (i7 == null) {
                    i7 = new k.I(24);
                    this.f20205a = i7;
                }
                i7.f13847p = b(j3);
                this.f20205a = i7;
                this.f20206b = j3;
            }
        }
        long jC = AbstractC1959I.c(((Paint) lVar.f18861b).getColor());
        long j7 = C1987t.f20255b;
        if (!C1987t.c(jC, j7)) {
            lVar.h(j7);
        }
        if (!AbstractC1209k.a((Shader) lVar.f18862c, i7 != null ? (Shader) i7.f13847p : null)) {
            lVar.k(i7 != null ? (Shader) i7.f13847p : null);
        }
        if (((Paint) lVar.f18861b).getAlpha() / 255.0f == f7) {
            return;
        }
        lVar.f(f7);
    }

    public abstract Shader b(long j3);
}
