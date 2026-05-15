package E0;

import java.util.ArrayList;
import y0.C1965O;
import y0.C1987t;

/* JADX INFO: renamed from: E0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1729g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0093d f1731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1732k;

    public C0094e(String str, float f7, float f8, float f9, float f10, long j3, int i7, boolean z6, int i8) {
        str = (i8 & 1) != 0 ? "" : str;
        long j7 = (i8 & 32) != 0 ? C1987t.f20262j : j3;
        int i9 = (i8 & 64) != 0 ? 5 : i7;
        boolean z7 = (i8 & 128) != 0 ? false : z6;
        this.f1723a = str;
        this.f1724b = f7;
        this.f1725c = f8;
        this.f1726d = f9;
        this.f1727e = f10;
        this.f1728f = j7;
        this.f1729g = i9;
        this.h = z7;
        ArrayList arrayList = new ArrayList();
        this.f1730i = arrayList;
        C0093d c0093d = new C0093d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f1731j = c0093d;
        arrayList.add(c0093d);
    }

    public static void a(C0094e c0094e, ArrayList arrayList, C1965O c1965o, float f7, float f8, float f9, int i7, float f10) {
        if (c0094e.f1732k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C0093d) c0094e.f1730i.get(r0.size() - 1)).f1722j.add(new M("", arrayList, 0, c1965o, f7, null, f8, f9, 0, i7, f10, 0.0f, 1.0f, 0.0f));
    }

    public final C0095f b() {
        if (this.f1732k) {
            N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f1730i;
            if (arrayList.size() <= 1) {
                C0093d c0093d = this.f1731j;
                C0095f c0095f = new C0095f(this.f1723a, this.f1724b, this.f1725c, this.f1726d, this.f1727e, new H(c0093d.f1714a, c0093d.f1715b, c0093d.f1716c, c0093d.f1717d, c0093d.f1718e, c0093d.f1719f, c0093d.f1720g, c0093d.h, c0093d.f1721i, c0093d.f1722j), this.f1728f, this.f1729g, this.h);
                this.f1732k = true;
                return c0095f;
            }
            if (this.f1732k) {
                N0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C0093d c0093d2 = (C0093d) arrayList.remove(arrayList.size() - 1);
            ((C0093d) arrayList.get(arrayList.size() - 1)).f1722j.add(new H(c0093d2.f1714a, c0093d2.f1715b, c0093d2.f1716c, c0093d2.f1717d, c0093d2.f1718e, c0093d2.f1719f, c0093d2.f1720g, c0093d2.h, c0093d2.f1721i, c0093d2.f1722j));
        }
    }
}
