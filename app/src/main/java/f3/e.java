package f3;

import N2.C0293j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f12163d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12164a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12166c;

    public static long a(int i7, boolean z6, byte[] bArr) {
        long j3 = ((long) bArr[0]) & 255;
        if (z6) {
            j3 &= ~f12163d[i7 - 1];
        }
        for (int i8 = 1; i8 < i7; i8++) {
            j3 = (j3 << 8) | (((long) bArr[i8]) & 255);
        }
        return j3;
    }

    public static int b(int i7) {
        for (int i8 = 0; i8 < 8; i8++) {
            if ((f12163d[i8] & ((long) i7)) != 0) {
                return i8 + 1;
            }
        }
        return -1;
    }

    public final long c(C0293j c0293j, boolean z6, boolean z7, int i7) {
        int i8 = this.f12165b;
        byte[] bArr = this.f12164a;
        if (i8 == 0) {
            if (!c0293j.b(bArr, 0, 1, z6)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.f12166c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f12165b = 1;
        }
        int i9 = this.f12166c;
        if (i9 > i7) {
            this.f12165b = 0;
            return -2L;
        }
        if (i9 != 1) {
            c0293j.b(bArr, 1, i9 - 1, false);
        }
        this.f12165b = 0;
        return a(this.f12166c, z7, bArr);
    }
}
