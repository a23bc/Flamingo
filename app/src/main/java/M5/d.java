package M5;

import S5.C0427g;
import java.io.EOFException;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public final C0427g f4845a;

    /* JADX INFO: renamed from: c */
    public boolean f4847c;

    /* JADX INFO: renamed from: g */
    public int f4851g;
    public int h;

    /* JADX INFO: renamed from: b */
    public int f4846b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f4848d = 4096;

    /* JADX INFO: renamed from: e */
    public C0282b[] f4849e = new C0282b[8];

    /* JADX INFO: renamed from: f */
    public int f4850f = 7;

    public d(C0427g c0427g) {
        this.f4845a = c0427g;
    }

    public final void a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f4849e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f4850f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C0282b c0282b = this.f4849e[length];
                AbstractC1209k.c(c0282b);
                i7 -= c0282b.f4837c;
                int i10 = this.h;
                C0282b c0282b2 = this.f4849e[length];
                AbstractC1209k.c(c0282b2);
                this.h = i10 - c0282b2.f4837c;
                this.f4851g--;
                i9++;
                length--;
            }
            C0282b[] c0282bArr = this.f4849e;
            int i11 = i8 + 1;
            System.arraycopy(c0282bArr, i11, c0282bArr, i11 + i9, this.f4851g);
            C0282b[] c0282bArr2 = this.f4849e;
            int i12 = this.f4850f + 1;
            Arrays.fill(c0282bArr2, i12, i12 + i9, (Object) null);
            this.f4850f += i9;
        }
    }

    public final void b(C0282b c0282b) {
        int i7 = this.f4848d;
        int i8 = c0282b.f4837c;
        if (i8 > i7) {
            C0282b[] c0282bArr = this.f4849e;
            Z4.l.d0(c0282bArr, 0, c0282bArr.length);
            this.f4850f = this.f4849e.length - 1;
            this.f4851g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i8) - i7);
        int i9 = this.f4851g + 1;
        C0282b[] c0282bArr2 = this.f4849e;
        if (i9 > c0282bArr2.length) {
            C0282b[] c0282bArr3 = new C0282b[c0282bArr2.length * 2];
            System.arraycopy(c0282bArr2, 0, c0282bArr3, c0282bArr2.length, c0282bArr2.length);
            this.f4850f = this.f4849e.length - 1;
            this.f4849e = c0282bArr3;
        }
        int i10 = this.f4850f;
        this.f4850f = i10 - 1;
        this.f4849e[i10] = c0282b;
        this.f4851g++;
        this.h += i8;
    }

    public final void c(S5.j jVar) throws EOFException {
        AbstractC1209k.f(jVar, "data");
        C0427g c0427g = this.f4845a;
        int[] iArr = z.f4952a;
        int iC = jVar.c();
        long j3 = 0;
        for (int i7 = 0; i7 < iC; i7++) {
            byte bH = jVar.h(i7);
            byte[] bArr = G5.b.f2765a;
            j3 += (long) z.f4953b[bH & 255];
        }
        if (((int) ((j3 + ((long) 7)) >> 3)) >= jVar.c()) {
            e(jVar.c(), 127, 0);
            c0427g.B(jVar);
            return;
        }
        C0427g c0427g2 = new C0427g();
        int[] iArr2 = z.f4952a;
        int iC2 = jVar.c();
        long j7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iC2; i9++) {
            byte bH2 = jVar.h(i9);
            byte[] bArr2 = G5.b.f2765a;
            int i10 = bH2 & 255;
            int i11 = z.f4952a[i10];
            byte b7 = z.f4953b[i10];
            j7 = (j7 << b7) | ((long) i11);
            i8 += b7;
            while (i8 >= 8) {
                i8 -= 8;
                c0427g2.D((int) (j7 >> i8));
            }
        }
        if (i8 > 0) {
            c0427g2.D((int) ((255 >>> i8) | (j7 << (8 - i8))));
        }
        S5.j jVarQ = c0427g2.q(c0427g2.f6785p);
        e(jVarQ.c(), 127, 128);
        c0427g.B(jVarQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.d.d(java.util.ArrayList):void");
    }

    public final void e(int i7, int i8, int i9) {
        C0427g c0427g = this.f4845a;
        if (i7 < i8) {
            c0427g.D(i7 | i9);
            return;
        }
        c0427g.D(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            c0427g.D(128 | (i10 & 127));
            i10 >>>= 7;
        }
        c0427g.D(i10);
    }
}
