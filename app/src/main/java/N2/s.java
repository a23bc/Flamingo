package N2;

import java.util.Collections;
import t2.C1486o;
import t2.C1487p;
import t2.L;
import t2.M;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public final int f5071a;

    /* JADX INFO: renamed from: b */
    public final int f5072b;

    /* JADX INFO: renamed from: c */
    public final int f5073c;

    /* JADX INFO: renamed from: d */
    public final int f5074d;

    /* JADX INFO: renamed from: e */
    public final int f5075e;

    /* JADX INFO: renamed from: f */
    public final int f5076f;

    /* JADX INFO: renamed from: g */
    public final int f5077g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final int f5078i;

    /* JADX INFO: renamed from: j */
    public final long f5079j;

    /* JADX INFO: renamed from: k */
    public final V.o f5080k;
    public final L l;

    public s(int i7, byte[] bArr) {
        J j3 = new J(bArr.length, bArr);
        j3.q(i7 * 8);
        this.f5071a = j3.i(16);
        this.f5072b = j3.i(16);
        this.f5073c = j3.i(24);
        this.f5074d = j3.i(24);
        int i8 = j3.i(20);
        this.f5075e = i8;
        this.f5076f = d(i8);
        this.f5077g = j3.i(3) + 1;
        int i9 = j3.i(5) + 1;
        this.h = i9;
        this.f5078i = a(i9);
        this.f5079j = j3.k(36);
        this.f5080k = null;
        this.l = null;
    }

    public static int a(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j3 = this.f5079j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / ((long) this.f5075e);
    }

    public final C1487p c(byte[] bArr, L l) {
        bArr[4] = -128;
        int i7 = this.f5074d;
        if (i7 <= 0) {
            i7 = -1;
        }
        L l7 = this.l;
        if (l7 != null) {
            l = l7.c(l);
        }
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("audio/flac");
        c1486o.f16627m = i7;
        c1486o.f16640z = this.f5077g;
        c1486o.f16608A = this.f5075e;
        c1486o.f16609B = w2.t.s(this.h);
        c1486o.f16629o = Collections.singletonList(bArr);
        c1486o.f16625j = l;
        return new C1487p(c1486o);
    }

    public s(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j3, V.o oVar, L l) {
        this.f5071a = i7;
        this.f5072b = i8;
        this.f5073c = i9;
        this.f5074d = i10;
        this.f5075e = i11;
        this.f5076f = d(i11);
        this.f5077g = i12;
        this.h = i13;
        this.f5078i = a(i13);
        this.f5079j = j3;
        this.f5080k = oVar;
        this.l = l;
    }
}
