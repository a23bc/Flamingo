package d0;

import e0.AbstractC0846k;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a */
    public final b1.M f10873a;

    /* JADX INFO: renamed from: b */
    public final b1.M f10874b;

    /* JADX INFO: renamed from: c */
    public final b1.M f10875c;

    /* JADX INFO: renamed from: d */
    public final b1.M f10876d;

    /* JADX INFO: renamed from: e */
    public final b1.M f10877e;

    /* JADX INFO: renamed from: f */
    public final b1.M f10878f;

    /* JADX INFO: renamed from: g */
    public final b1.M f10879g;
    public final b1.M h;

    /* JADX INFO: renamed from: i */
    public final b1.M f10880i;

    /* JADX INFO: renamed from: j */
    public final b1.M f10881j;

    /* JADX INFO: renamed from: k */
    public final b1.M f10882k;
    public final b1.M l;

    /* JADX INFO: renamed from: m */
    public final b1.M f10883m;

    /* JADX INFO: renamed from: n */
    public final b1.M f10884n;

    /* JADX INFO: renamed from: o */
    public final b1.M f10885o;

    public I0(b1.M m7, int i7) {
        b1.M m8 = AbstractC0846k.f11519d;
        b1.M m9 = AbstractC0846k.f11520e;
        b1.M m10 = AbstractC0846k.f11521f;
        b1.M m11 = AbstractC0846k.f11522g;
        b1.M m12 = AbstractC0846k.h;
        b1.M m13 = AbstractC0846k.f11523i;
        b1.M m14 = AbstractC0846k.f11526m;
        b1.M m15 = AbstractC0846k.f11527n;
        b1.M m16 = AbstractC0846k.f11528o;
        m7 = (i7 & 512) != 0 ? AbstractC0846k.f11516a : m7;
        b1.M m17 = AbstractC0846k.f11517b;
        b1.M m18 = AbstractC0846k.f11518c;
        b1.M m19 = AbstractC0846k.f11524j;
        b1.M m20 = AbstractC0846k.f11525k;
        b1.M m21 = AbstractC0846k.l;
        this.f10873a = m8;
        this.f10874b = m9;
        this.f10875c = m10;
        this.f10876d = m11;
        this.f10877e = m12;
        this.f10878f = m13;
        this.f10879g = m14;
        this.h = m15;
        this.f10880i = m16;
        this.f10881j = m7;
        this.f10882k = m17;
        this.l = m18;
        this.f10883m = m19;
        this.f10884n = m20;
        this.f10885o = m21;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return AbstractC1209k.a(this.f10873a, i02.f10873a) && AbstractC1209k.a(this.f10874b, i02.f10874b) && AbstractC1209k.a(this.f10875c, i02.f10875c) && AbstractC1209k.a(this.f10876d, i02.f10876d) && AbstractC1209k.a(this.f10877e, i02.f10877e) && AbstractC1209k.a(this.f10878f, i02.f10878f) && AbstractC1209k.a(this.f10879g, i02.f10879g) && AbstractC1209k.a(this.h, i02.h) && AbstractC1209k.a(this.f10880i, i02.f10880i) && AbstractC1209k.a(this.f10881j, i02.f10881j) && AbstractC1209k.a(this.f10882k, i02.f10882k) && AbstractC1209k.a(this.l, i02.l) && AbstractC1209k.a(this.f10883m, i02.f10883m) && AbstractC1209k.a(this.f10884n, i02.f10884n) && AbstractC1209k.a(this.f10885o, i02.f10885o);
    }

    public final int hashCode() {
        return this.f10885o.hashCode() + A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(A0.e.B(this.f10873a.hashCode() * 31, 31, this.f10874b), 31, this.f10875c), 31, this.f10876d), 31, this.f10877e), 31, this.f10878f), 31, this.f10879g), 31, this.h), 31, this.f10880i), 31, this.f10881j), 31, this.f10882k), 31, this.l), 31, this.f10883m), 31, this.f10884n);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f10873a + ", displayMedium=" + this.f10874b + ",displaySmall=" + this.f10875c + ", headlineLarge=" + this.f10876d + ", headlineMedium=" + this.f10877e + ", headlineSmall=" + this.f10878f + ", titleLarge=" + this.f10879g + ", titleMedium=" + this.h + ", titleSmall=" + this.f10880i + ", bodyLarge=" + this.f10881j + ", bodyMedium=" + this.f10882k + ", bodySmall=" + this.l + ", labelLarge=" + this.f10883m + ", labelMedium=" + this.f10884n + ", labelSmall=" + this.f10885o + ')';
    }
}
