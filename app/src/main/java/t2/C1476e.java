package t2;

import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: renamed from: t2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1476e {

    /* JADX INFO: renamed from: g */
    public static final C1476e f16413g = new C1476e(0, 0, 1, 1, 0);
    public static final String h;

    /* JADX INFO: renamed from: i */
    public static final String f16414i;

    /* JADX INFO: renamed from: j */
    public static final String f16415j;

    /* JADX INFO: renamed from: k */
    public static final String f16416k;
    public static final String l;

    /* JADX INFO: renamed from: a */
    public final int f16417a;

    /* JADX INFO: renamed from: b */
    public final int f16418b;

    /* JADX INFO: renamed from: c */
    public final int f16419c;

    /* JADX INFO: renamed from: d */
    public final int f16420d;

    /* JADX INFO: renamed from: e */
    public final int f16421e;

    /* JADX INFO: renamed from: f */
    public S f16422f;

    static {
        int i7 = w2.t.f18881a;
        h = Integer.toString(0, 36);
        f16414i = Integer.toString(1, 36);
        f16415j = Integer.toString(2, 36);
        f16416k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public C1476e(int i7, int i8, int i9, int i10, int i11) {
        this.f16417a = i7;
        this.f16418b = i8;
        this.f16419c = i9;
        this.f16420d = i10;
        this.f16421e = i11;
    }

    public static C1476e a(Bundle bundle) {
        String str = h;
        int i7 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = f16414i;
        int i8 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = f16415j;
        int i9 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = f16416k;
        int i10 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = l;
        return new C1476e(i7, i8, i9, i10, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
    }

    public final S b() {
        if (this.f16422f == null) {
            S s7 = new S();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f16417a).setFlags(this.f16418b).setUsage(this.f16419c);
            int i7 = w2.t.f18881a;
            if (i7 >= 29) {
                AbstractC1474c.a(usage, this.f16420d);
            }
            if (i7 >= 32) {
                AbstractC1475d.a(usage, this.f16421e);
            }
            s7.f16352a = usage.build();
            this.f16422f = s7;
        }
        return this.f16422f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.f16417a);
        bundle.putInt(f16414i, this.f16418b);
        bundle.putInt(f16415j, this.f16419c);
        bundle.putInt(f16416k, this.f16420d);
        bundle.putInt(l, this.f16421e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1476e.class == obj.getClass()) {
            C1476e c1476e = (C1476e) obj;
            if (this.f16417a == c1476e.f16417a && this.f16418b == c1476e.f16418b && this.f16419c == c1476e.f16419c && this.f16420d == c1476e.f16420d && this.f16421e == c1476e.f16421e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f16417a) * 31) + this.f16418b) * 31) + this.f16419c) * 31) + this.f16420d) * 31) + this.f16421e;
    }
}
