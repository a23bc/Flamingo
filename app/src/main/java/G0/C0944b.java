package g0;

import Q0.C0366w;
import f0.AbstractC0876a0;
import f0.AbstractC0914u;
import f0.AbstractC0918w;
import f0.C0912t;
import f0.Z;
import java.util.ArrayList;

/* JADX INFO: renamed from: g0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0912t f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0943a f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12282c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12286g;
    public int l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0366w f12283d = new C0366w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12284e = true;
    public final ArrayList h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12287i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12288j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12289k = -1;

    public C0944b(C0912t c0912t, C0943a c0943a) {
        this.f12280a = c0912t;
        this.f12281b = c0943a;
    }

    public final void a(Z z6, AbstractC0918w abstractC0918w, AbstractC0876a0 abstractC0876a0, AbstractC0876a0 abstractC0876a02) {
        C0943a c0943a = this.f12281b;
        c0943a.getClass();
        C0950h c0950h = C0950h.f12296c;
        L l = c0943a.f12279u;
        l.g0(c0950h);
        int i7 = l.f12278z - l.f12273u[l.f12274v - 1].f12272b;
        Object[] objArr = l.f12277y;
        objArr[i7] = z6;
        objArr[i7 + 1] = abstractC0918w;
        objArr[i7 + 3] = abstractC0876a02;
        objArr[i7 + 2] = abstractC0876a0;
    }

    public final void b() {
        d();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.f12286g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void c() {
        int i7 = this.f12286g;
        if (i7 > 0) {
            C0943a c0943a = this.f12281b;
            c0943a.getClass();
            H h = H.f12269c;
            L l = c0943a.f12279u;
            l.g0(h);
            l.f12275w[l.f12276x - l.f12273u[l.f12274v - 1].f12271a] = i7;
            this.f12286g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        C0943a c0943a2 = this.f12281b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = arrayList.get(i8);
        }
        c0943a2.getClass();
        if (size != 0) {
            C0953k c0953k = C0953k.f12299c;
            L l7 = c0943a2.f12279u;
            l7.g0(c0953k);
            N5.l.P(l7, 0, objArr);
        }
        arrayList.clear();
    }

    public final void d() {
        int i7 = this.l;
        if (i7 > 0) {
            int i8 = this.f12287i;
            if (i8 >= 0) {
                c();
                C0943a c0943a = this.f12281b;
                c0943a.getClass();
                z zVar = z.f12318c;
                L l = c0943a.f12279u;
                l.g0(zVar);
                int i9 = l.f12276x - l.f12273u[l.f12274v - 1].f12271a;
                int[] iArr = l.f12275w;
                iArr[i9] = i8;
                iArr[i9 + 1] = i7;
                this.f12287i = -1;
            } else {
                int i10 = this.f12289k;
                int i11 = this.f12288j;
                c();
                C0943a c0943a2 = this.f12281b;
                c0943a2.getClass();
                v vVar = v.f12314c;
                L l7 = c0943a2.f12279u;
                l7.g0(vVar);
                int i12 = l7.f12276x - l7.f12273u[l7.f12274v - 1].f12271a;
                int[] iArr2 = l7.f12275w;
                iArr2[i12 + 1] = i10;
                iArr2[i12] = i11;
                iArr2[i12 + 2] = i7;
                this.f12288j = -1;
                this.f12289k = -1;
            }
            this.l = 0;
        }
    }

    public final void e(boolean z6) {
        C0912t c0912t = this.f12280a;
        int i7 = z6 ? c0912t.f11878G.f11674i : c0912t.f11878G.f11673g;
        int i8 = i7 - this.f12285f;
        if (i8 < 0) {
            AbstractC0914u.c("Tried to seek backward");
        }
        if (i8 > 0) {
            C0943a c0943a = this.f12281b;
            c0943a.getClass();
            C0946d c0946d = C0946d.f12292c;
            L l = c0943a.f12279u;
            l.g0(c0946d);
            l.f12275w[l.f12276x - l.f12273u[l.f12274v - 1].f12271a] = i8;
            this.f12285f = i7;
        }
    }

    public final void f(int i7, int i8) {
        if (i8 > 0) {
            if (!(i7 >= 0)) {
                AbstractC0914u.c("Invalid remove index " + i7);
            }
            if (this.f12287i == i7) {
                this.l += i8;
                return;
            }
            d();
            this.f12287i = i7;
            this.l = i8;
        }
    }
}
