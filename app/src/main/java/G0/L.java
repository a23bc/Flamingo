package g0;

import a.AbstractC0509a;
import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0877b;
import f0.InterfaceC0881d;
import f0.L0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0509a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12274v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12276x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12278z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public J[] f12273u = new J[16];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f12275w = new int[16];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object[] f12277y = new Object[16];

    public final void c0() {
        this.f12274v = 0;
        this.f12276x = 0;
        Z4.l.d0(this.f12277y, 0, this.f12278z);
        this.f12278z = 0;
    }

    public final void d0(InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        if (f0()) {
            C0535h c0535h = new C0535h(this);
            while (true) {
                L l = (L) c0535h.f9482e;
                J j3 = l.f12273u[c0535h.f9479b];
                C0877b c0877bB = j3.b(c0535h);
                InterfaceC0881d interfaceC0881d2 = interfaceC0881d;
                L0 l03 = l02;
                n0.j jVar2 = jVar;
                K k8 = k7;
                try {
                    j3.a(c0535h, interfaceC0881d2, l03, jVar2, k8);
                    int i7 = c0535h.f9479b;
                    int i8 = l.f12274v;
                    if (i7 < i8) {
                        J j7 = l.f12273u[i7];
                        c0535h.f9480c += j7.f12271a;
                        c0535h.f9481d += j7.f12272b;
                        int i9 = i7 + 1;
                        c0535h.f9479b = i9;
                        if (i9 >= i8) {
                            break;
                        }
                        interfaceC0881d = interfaceC0881d2;
                        l02 = l03;
                        jVar = jVar2;
                        k7 = k8;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        c0();
    }

    public final boolean e0() {
        return this.f12274v == 0;
    }

    public final boolean f0() {
        return this.f12274v != 0;
    }

    public final void g0(J j3) {
        int i7 = this.f12274v;
        J[] jArr = this.f12273u;
        if (i7 == jArr.length) {
            J[] jArr2 = new J[(i7 > 1024 ? 1024 : i7) + i7];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f12273u = jArr2;
        }
        int i8 = this.f12276x + j3.f12271a;
        int[] iArr = this.f12275w;
        int length = iArr.length;
        if (i8 > length) {
            int i9 = (length > 1024 ? 1024 : length) + length;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            Z4.l.V(0, 0, length, iArr, iArr2);
            this.f12275w = iArr2;
        }
        int i10 = this.f12278z;
        int i11 = j3.f12272b;
        int i12 = i10 + i11;
        Object[] objArr = this.f12277y;
        int length2 = objArr.length;
        if (i12 > length2) {
            int i13 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i13 >= i12) {
                i12 = i13;
            }
            Object[] objArr2 = new Object[i12];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f12277y = objArr2;
        }
        J[] jArr3 = this.f12273u;
        int i14 = this.f12274v;
        this.f12274v = i14 + 1;
        jArr3[i14] = j3;
        this.f12276x += j3.f12271a;
        this.f12278z += i11;
    }
}
