package y0;

import android.graphics.Shader;

/* JADX INFO: renamed from: y0.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1965O extends AbstractC1983p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20223a;

    public C1965O(long j3) {
        this.f20223a = j3;
    }

    @Override // y0.AbstractC1983p
    public final void a(float f7, long j3, w2.l lVar) {
        lVar.f(1.0f);
        long jB = this.f20223a;
        if (f7 != 1.0f) {
            jB = C1987t.b(jB, C1987t.d(jB) * f7);
        }
        lVar.h(jB);
        if (((Shader) lVar.f18862c) != null) {
            lVar.k(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1965O) {
            return C1987t.c(this.f20223a, ((C1965O) obj).f20223a);
        }
        return false;
    }

    public final int hashCode() {
        return C1987t.i(this.f20223a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C1987t.j(this.f20223a)) + ')';
    }
}
