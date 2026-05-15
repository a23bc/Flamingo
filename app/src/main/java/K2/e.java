package K2;

import java.util.Arrays;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c */
    public int f3997c;

    /* JADX INFO: renamed from: d */
    public int f3998d;

    /* JADX INFO: renamed from: a */
    public final boolean f3995a = true;

    /* JADX INFO: renamed from: b */
    public final int f3996b = 65536;

    /* JADX INFO: renamed from: e */
    public int f3999e = 0;

    /* JADX INFO: renamed from: f */
    public a[] f4000f = new a[100];

    public final synchronized void a(int i7) {
        boolean z6 = i7 < this.f3997c;
        this.f3997c = i7;
        if (z6) {
            b();
        }
    }

    public final synchronized void b() {
        int iMax = Math.max(0, t.e(this.f3997c, this.f3996b) - this.f3998d);
        int i7 = this.f3999e;
        if (iMax >= i7) {
            return;
        }
        Arrays.fill(this.f4000f, iMax, i7, (Object) null);
        this.f3999e = iMax;
    }
}
