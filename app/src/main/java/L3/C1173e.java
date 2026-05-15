package l3;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: renamed from: l3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final boolean[] f14205A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f14206B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f14207C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f14208D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f14209E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f14210v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f14211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f14212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14213y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f14214z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14215a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f14216b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14221g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14224k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14233u;

    static {
        int iC = c(0, 0, 0, 0);
        f14211w = iC;
        int iC2 = c(0, 0, 0, 3);
        f14212x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f14213y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f14214z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f14205A = new boolean[]{false, false, false, true, true, true, false};
        f14206B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f14207C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f14208D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f14209E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public C1173e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            w2.AbstractC1697a.f(r4, r0)
            w2.AbstractC1697a.f(r5, r0)
            w2.AbstractC1697a.f(r6, r0)
            w2.AbstractC1697a.f(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C1173e.c(int, int, int, int):int");
    }

    public final void a(char c7) {
        SpannableStringBuilder spannableStringBuilder = this.f14216b;
        if (c7 != '\n') {
            spannableStringBuilder.append(c7);
            return;
        }
        ArrayList arrayList = this.f14215a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f14227o != -1) {
            this.f14227o = 0;
        }
        if (this.f14228p != -1) {
            this.f14228p = 0;
        }
        if (this.f14229q != -1) {
            this.f14229q = 0;
        }
        if (this.f14231s != -1) {
            this.f14231s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f14223j && arrayList.size() < 15) {
                this.f14233u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14216b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f14227o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14227o, length, 33);
            }
            if (this.f14228p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14228p, length, 33);
            }
            if (this.f14229q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14230r), this.f14229q, length, 33);
            }
            if (this.f14231s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14232t), this.f14231s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f14215a.clear();
        this.f14216b.clear();
        this.f14227o = -1;
        this.f14228p = -1;
        this.f14229q = -1;
        this.f14231s = -1;
        this.f14233u = 0;
        this.f14217c = false;
        this.f14218d = false;
        this.f14219e = 4;
        this.f14220f = false;
        this.f14221g = 0;
        this.h = 0;
        this.f14222i = 0;
        this.f14223j = 15;
        this.f14224k = 0;
        this.l = 0;
        this.f14225m = 0;
        int i7 = f14211w;
        this.f14226n = i7;
        this.f14230r = f14210v;
        this.f14232t = i7;
    }

    public final void e(boolean z6, boolean z7) {
        int i7 = this.f14227o;
        SpannableStringBuilder spannableStringBuilder = this.f14216b;
        if (i7 != -1) {
            if (!z6) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14227o, spannableStringBuilder.length(), 33);
                this.f14227o = -1;
            }
        } else if (z6) {
            this.f14227o = spannableStringBuilder.length();
        }
        if (this.f14228p == -1) {
            if (z7) {
                this.f14228p = spannableStringBuilder.length();
            }
        } else {
            if (z7) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14228p, spannableStringBuilder.length(), 33);
            this.f14228p = -1;
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f14229q;
        SpannableStringBuilder spannableStringBuilder = this.f14216b;
        if (i9 != -1 && this.f14230r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14230r), this.f14229q, spannableStringBuilder.length(), 33);
        }
        if (i7 != f14210v) {
            this.f14229q = spannableStringBuilder.length();
            this.f14230r = i7;
        }
        if (this.f14231s != -1 && this.f14232t != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14232t), this.f14231s, spannableStringBuilder.length(), 33);
        }
        if (i8 != f14211w) {
            this.f14231s = spannableStringBuilder.length();
            this.f14232t = i8;
        }
    }
}
