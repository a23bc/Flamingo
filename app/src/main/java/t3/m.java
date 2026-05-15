package t3;

import N2.H;
import N2.J;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f16921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16923c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f16926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f16927g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16929j;
    public long l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16937s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f16924d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f16925e = new SparseArray();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f16931m = new l();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f16932n = new l();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16930k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16933o = false;

    public m(H h, boolean z6, boolean z7) {
        this.f16921a = h;
        this.f16922b = z6;
        this.f16923c = z7;
        byte[] bArr = new byte[128];
        this.f16927g = bArr;
        this.f16926f = new J(bArr, 0, 0);
        l lVar = this.f16932n;
        lVar.f16908b = false;
        lVar.f16907a = false;
    }

    public final void a() {
        boolean z6;
        int i7;
        boolean z7 = false;
        if (this.f16922b) {
            l lVar = this.f16932n;
            z6 = lVar.f16908b && ((i7 = lVar.f16911e) == 7 || i7 == 2);
        } else {
            z6 = this.f16937s;
        }
        boolean z8 = this.f16936r;
        int i8 = this.f16928i;
        if (i8 == 5 || (z6 && i8 == 1)) {
            z7 = true;
        }
        this.f16936r = z8 | z7;
    }
}
