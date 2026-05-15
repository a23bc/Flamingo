package B3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f826e;

    public d(int i7) {
        long[] jArr = new long[i7];
        this.f822a = jArr;
        boolean[] zArr = new boolean[i7];
        this.f823b = zArr;
        this.f824c = new int[i7];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (this.f825d && !this.f826e) {
                    int length = this.f822a.length;
                    int i7 = 0;
                    while (true) {
                        int i8 = 1;
                        if (i7 >= length) {
                            this.f826e = true;
                            this.f825d = false;
                            return this.f824c;
                        }
                        boolean z6 = this.f822a[i7] > 0;
                        boolean[] zArr = this.f823b;
                        if (z6 != zArr[i7]) {
                            int[] iArr = this.f824c;
                            if (!z6) {
                                i8 = 2;
                            }
                            iArr[i7] = i8;
                        } else {
                            this.f824c[i7] = 0;
                        }
                        zArr[i7] = z6;
                        i7++;
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
