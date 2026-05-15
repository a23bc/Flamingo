package M5;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f4828b = new int[10];

    public final int a() {
        if ((this.f4827a & 128) != 0) {
            return this.f4828b[7];
        }
        return 65535;
    }

    public final void b(B b7) {
        AbstractC1209k.f(b7, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (((1 << i7) & b7.f4827a) != 0) {
                c(i7, b7.f4828b[i7]);
            }
        }
    }

    public final void c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f4828b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f4827a = (1 << i7) | this.f4827a;
            iArr[i7] = i8;
        }
    }
}
