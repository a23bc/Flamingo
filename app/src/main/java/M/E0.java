package M;

import b1.C0613I;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0613I f4386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O0.C f4387b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.C f4388c;

    public E0(O0.C c7, C0613I c0613i) {
        this.f4386a = c0613i;
        this.f4388c = c7;
    }

    public final long a(long j3) {
        C1893c c1893cM;
        O0.C c7 = this.f4387b;
        C1893c c1893c = C1893c.f19868e;
        if (c7 != null) {
            if (c7.y()) {
                O0.C c8 = this.f4388c;
                c1893cM = c8 != null ? c8.m(c7, true) : null;
            } else {
                c1893cM = c1893c;
            }
            if (c1893cM != null) {
                c1893c = c1893cM;
            }
        }
        int i7 = (int) (j3 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i7);
        float fIntBitsToFloat2 = c1893c.f19869a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i7);
            fIntBitsToFloat2 = c1893c.f19871c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i7);
            }
        }
        int i8 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i8);
        float fIntBitsToFloat5 = c1893c.f19870b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i8);
            fIntBitsToFloat5 = c1893c.f19872d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i8);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j3, boolean z6) {
        if (z6) {
            j3 = a(j3);
        }
        return this.f4386a.f9930b.g(d(j3));
    }

    public final boolean c(long j3) {
        long jD = d(a(j3));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        C0613I c0613i = this.f4386a;
        int iE = c0613i.f9930b.e(fIntBitsToFloat);
        int i7 = (int) (jD >> 32);
        return Float.intBitsToFloat(i7) >= c0613i.f(iE) && Float.intBitsToFloat(i7) <= c0613i.g(iE);
    }

    public final long d(long j3) {
        O0.C c7;
        O0.C c8 = this.f4387b;
        if (c8 == null) {
            return j3;
        }
        if (!c8.y()) {
            c8 = null;
        }
        if (c8 == null || (c7 = this.f4388c) == null) {
            return j3;
        }
        O0.C c9 = c7.y() ? c7 : null;
        return c9 == null ? j3 : c8.K(c9, j3);
    }

    public final long e(long j3) {
        O0.C c7;
        O0.C c8 = this.f4387b;
        if (c8 == null) {
            return j3;
        }
        if (!c8.y()) {
            c8 = null;
        }
        if (c8 == null || (c7 = this.f4388c) == null) {
            return j3;
        }
        O0.C c9 = c7.y() ? c7 : null;
        return c9 == null ? j3 : c9.K(c8, j3);
    }
}
