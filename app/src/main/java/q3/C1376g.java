package q3;

import android.text.Layout;

/* JADX INFO: renamed from: q3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1376g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15569e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15574k;
    public String l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f15577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f15578p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1371b f15580r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15570f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15571g = -1;
    public int h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15572i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15573j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15575m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15576n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15579q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15581s = Float.MAX_VALUE;

    public final void a(C1376g c1376g) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1376g != null) {
            if (!this.f15567c && c1376g.f15567c) {
                this.f15566b = c1376g.f15566b;
                this.f15567c = true;
            }
            if (this.h == -1) {
                this.h = c1376g.h;
            }
            if (this.f15572i == -1) {
                this.f15572i = c1376g.f15572i;
            }
            if (this.f15565a == null && (str = c1376g.f15565a) != null) {
                this.f15565a = str;
            }
            if (this.f15570f == -1) {
                this.f15570f = c1376g.f15570f;
            }
            if (this.f15571g == -1) {
                this.f15571g = c1376g.f15571g;
            }
            if (this.f15576n == -1) {
                this.f15576n = c1376g.f15576n;
            }
            if (this.f15577o == null && (alignment2 = c1376g.f15577o) != null) {
                this.f15577o = alignment2;
            }
            if (this.f15578p == null && (alignment = c1376g.f15578p) != null) {
                this.f15578p = alignment;
            }
            if (this.f15579q == -1) {
                this.f15579q = c1376g.f15579q;
            }
            if (this.f15573j == -1) {
                this.f15573j = c1376g.f15573j;
                this.f15574k = c1376g.f15574k;
            }
            if (this.f15580r == null) {
                this.f15580r = c1376g.f15580r;
            }
            if (this.f15581s == Float.MAX_VALUE) {
                this.f15581s = c1376g.f15581s;
            }
            if (!this.f15569e && c1376g.f15569e) {
                this.f15568d = c1376g.f15568d;
                this.f15569e = true;
            }
            if (this.f15575m != -1 || (i7 = c1376g.f15575m) == -1) {
                return;
            }
            this.f15575m = i7;
        }
    }
}
