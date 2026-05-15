package M5;

import S5.C0427g;
import java.io.IOException;
import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: M5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0283c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S5.y f4840c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4844g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4838a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4839b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0282b[] f4841d = new C0282b[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4842e = 7;

    public C0283c(r rVar) {
        this.f4840c = M3.a.E(rVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f4841d.length;
            while (true) {
                length--;
                i8 = this.f4842e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C0282b c0282b = this.f4841d[length];
                AbstractC1209k.c(c0282b);
                int i10 = c0282b.f4837c;
                i7 -= i10;
                this.f4844g -= i10;
                this.f4843f--;
                i9++;
            }
            C0282b[] c0282bArr = this.f4841d;
            System.arraycopy(c0282bArr, i8 + 1, c0282bArr, i8 + 1 + i9, this.f4843f);
            this.f4842e += i9;
        }
        return i9;
    }

    public final S5.j b(int i7) throws IOException {
        if (i7 >= 0) {
            C0282b[] c0282bArr = e.f4852a;
            if (i7 <= c0282bArr.length - 1) {
                return c0282bArr[i7].f4835a;
            }
        }
        int length = this.f4842e + 1 + (i7 - e.f4852a.length);
        if (length >= 0) {
            C0282b[] c0282bArr2 = this.f4841d;
            if (length < c0282bArr2.length) {
                C0282b c0282b = c0282bArr2[length];
                AbstractC1209k.c(c0282b);
                return c0282b.f4835a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(C0282b c0282b) {
        this.f4839b.add(c0282b);
        int i7 = this.f4838a;
        int i8 = c0282b.f4837c;
        if (i8 > i7) {
            C0282b[] c0282bArr = this.f4841d;
            Z4.l.d0(c0282bArr, 0, c0282bArr.length);
            this.f4842e = this.f4841d.length - 1;
            this.f4843f = 0;
            this.f4844g = 0;
            return;
        }
        a((this.f4844g + i8) - i7);
        int i9 = this.f4843f + 1;
        C0282b[] c0282bArr2 = this.f4841d;
        if (i9 > c0282bArr2.length) {
            C0282b[] c0282bArr3 = new C0282b[c0282bArr2.length * 2];
            System.arraycopy(c0282bArr2, 0, c0282bArr3, c0282bArr2.length, c0282bArr2.length);
            this.f4842e = this.f4841d.length - 1;
            this.f4841d = c0282bArr3;
        }
        int i10 = this.f4842e;
        this.f4842e = i10 - 1;
        this.f4841d[i10] = c0282b;
        this.f4843f++;
        this.f4844g += i8;
    }

    public final S5.j d() {
        int i7;
        S5.y yVar = this.f4840c;
        byte bD = yVar.d();
        byte[] bArr = G5.b.f2765a;
        int i8 = bD & 255;
        int i9 = 0;
        boolean z6 = (bD & 128) == 128;
        long jE = e(i8, 127);
        if (!z6) {
            return yVar.g(jE);
        }
        C0427g c0427g = new C0427g();
        int[] iArr = z.f4952a;
        AbstractC1209k.f(yVar, "source");
        y yVar2 = z.f4954c;
        y yVar3 = yVar2;
        int i10 = 0;
        for (long j3 = 0; j3 < jE; j3++) {
            byte bD2 = yVar.d();
            byte[] bArr2 = G5.b.f2765a;
            i9 = (i9 << 8) | (bD2 & 255);
            i10 += 8;
            while (i10 >= 8) {
                y[] yVarArr = (y[]) yVar3.f4951q;
                AbstractC1209k.c(yVarArr);
                yVar3 = yVarArr[(i9 >>> (i10 - 8)) & 255];
                AbstractC1209k.c(yVar3);
                if (((y[]) yVar3.f4951q) == null) {
                    c0427g.D(yVar3.f4949o);
                    i10 -= yVar3.f4950p;
                    yVar3 = yVar2;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            y[] yVarArr2 = (y[]) yVar3.f4951q;
            AbstractC1209k.c(yVarArr2);
            y yVar4 = yVarArr2[(i9 << (8 - i10)) & 255];
            AbstractC1209k.c(yVar4);
            if (((y[]) yVar4.f4951q) != null || (i7 = yVar4.f4950p) > i10) {
                break;
            }
            c0427g.D(yVar4.f4949o);
            i10 -= i7;
            yVar3 = yVar2;
        }
        return c0427g.q(c0427g.f6785p);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte bD = this.f4840c.d();
            byte[] bArr = G5.b.f2765a;
            int i11 = bD & 255;
            if ((bD & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (bD & 127) << i10;
            i10 += 7;
        }
    }
}
