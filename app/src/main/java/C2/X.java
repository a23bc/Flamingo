package C2;

import java.nio.ByteBuffer;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class X extends u2.e {

    /* JADX INFO: renamed from: n */
    public int f1097n;

    /* JADX INFO: renamed from: o */
    public boolean f1098o;

    /* JADX INFO: renamed from: p */
    public int f1099p;

    /* JADX INFO: renamed from: q */
    public long f1100q;

    /* JADX INFO: renamed from: s */
    public byte[] f1102s;

    /* JADX INFO: renamed from: v */
    public byte[] f1105v;

    /* JADX INFO: renamed from: r */
    public int f1101r = 0;

    /* JADX INFO: renamed from: t */
    public int f1103t = 0;

    /* JADX INFO: renamed from: u */
    public int f1104u = 0;
    public final long l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f1093i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f1096m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f1095k = 10;

    /* JADX INFO: renamed from: j */
    public final short f1094j = 1024;

    public X() {
        byte[] bArr = w2.t.f18886f;
        this.f1102s = bArr;
        this.f1105v = bArr;
    }

    @Override // u2.e
    public final u2.b a(u2.b bVar) throws u2.c {
        if (bVar.f17207c == 2) {
            return bVar.f17205a == -1 ? u2.b.f17204e : bVar;
        }
        throw new u2.c(bVar);
    }

    @Override // u2.e, u2.d
    public final boolean b() {
        return super.b() && this.f1098o;
    }

    @Override // u2.d
    public final void h(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f17215g.hasRemaining()) {
            int i7 = this.f1099p;
            short s7 = this.f1094j;
            if (i7 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f1102s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s7) {
                        int i8 = this.f1097n;
                        iPosition = ((iLimit3 / i8) * i8) + i8;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f1099p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC1697a.i(this.f1103t < this.f1102s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s7) {
                        int i9 = this.f1097n;
                        iLimit = (iPosition2 / i9) * i9;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f1103t;
                int i10 = this.f1104u;
                int length2 = length + i10;
                byte[] bArr = this.f1102s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i10 - (bArr.length - length);
                }
                int i11 = length - length2;
                boolean z6 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i11);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f1102s, length2, iMin);
                int i12 = this.f1104u + iMin;
                this.f1104u = i12;
                AbstractC1697a.i(i12 <= this.f1102s.length);
                boolean z7 = z6 && iPosition3 < i11;
                n(z7);
                if (z7) {
                    this.f1099p = 0;
                    this.f1101r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // u2.e
    public final void i() {
        if (b()) {
            u2.b bVar = this.f17210b;
            int i7 = bVar.f17206b * 2;
            this.f1097n = i7;
            int i8 = ((((int) ((this.l * ((long) bVar.f17205a)) / 1000000)) / 2) / i7) * i7 * 2;
            if (this.f1102s.length != i8) {
                this.f1102s = new byte[i8];
                this.f1105v = new byte[i8];
            }
        }
        this.f1099p = 0;
        this.f1100q = 0L;
        this.f1101r = 0;
        this.f1103t = 0;
        this.f1104u = 0;
    }

    @Override // u2.e
    public final void j() {
        if (this.f1104u > 0) {
            n(true);
            this.f1101r = 0;
        }
    }

    @Override // u2.e
    public final void k() {
        this.f1098o = false;
        byte[] bArr = w2.t.f18886f;
        this.f1102s = bArr;
        this.f1105v = bArr;
    }

    public final int m(int i7) {
        int length = ((((int) ((this.f1096m * ((long) this.f17210b.f17205a)) / 1000000)) - this.f1101r) * this.f1097n) - (this.f1102s.length / 2);
        AbstractC1697a.i(length >= 0);
        int iMin = (int) Math.min((i7 * this.f1093i) + 0.5f, length);
        int i8 = this.f1097n;
        return (iMin / i8) * i8;
    }

    public final void n(boolean z6) {
        int length;
        int iM;
        int i7 = this.f1104u;
        byte[] bArr = this.f1102s;
        if (i7 == bArr.length || z6) {
            if (this.f1101r == 0) {
                if (z6) {
                    o(i7, 3);
                    length = i7;
                } else {
                    AbstractC1697a.i(i7 >= bArr.length / 2);
                    length = this.f1102s.length / 2;
                    o(length, 0);
                }
                iM = length;
            } else if (z6) {
                int length2 = i7 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM2 = m(length2) + (this.f1102s.length / 2);
                o(iM2, 2);
                iM = iM2;
                length = length3;
            } else {
                length = i7 - (bArr.length / 2);
                iM = m(length);
                o(iM, 1);
            }
            AbstractC1697a.h("bytesConsumed is not aligned to frame size: %s" + length, length % this.f1097n == 0);
            AbstractC1697a.i(i7 >= iM);
            this.f1104u -= length;
            int i8 = this.f1103t + length;
            this.f1103t = i8;
            this.f1103t = i8 % this.f1102s.length;
            int i9 = this.f1101r;
            int i10 = this.f1097n;
            this.f1101r = (iM / i10) + i9;
            this.f1100q += (long) ((length - iM) / i10);
        }
    }

    public final void o(int i7, int i8) {
        if (i7 == 0) {
            return;
        }
        AbstractC1697a.d(this.f1104u >= i7);
        if (i8 == 2) {
            int i9 = this.f1103t;
            int i10 = this.f1104u;
            int i11 = i9 + i10;
            byte[] bArr = this.f1102s;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, i11 - i7, this.f1105v, 0, i7);
            } else {
                int length = i10 - (bArr.length - i9);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.f1105v, 0, i7);
                } else {
                    int i12 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i12, this.f1105v, 0, i12);
                    System.arraycopy(this.f1102s, 0, this.f1105v, i12, length);
                }
            }
        } else {
            int i13 = this.f1103t;
            int i14 = i13 + i7;
            byte[] bArr2 = this.f1102s;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.f1105v, 0, i7);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.f1105v, 0, length2);
                System.arraycopy(this.f1102s, 0, this.f1105v, length2, i7 - length2);
            }
        }
        AbstractC1697a.c("sizeToOutput is not aligned to frame size: " + i7, i7 % this.f1097n == 0);
        AbstractC1697a.i(this.f1103t < this.f1102s.length);
        byte[] bArr3 = this.f1105v;
        AbstractC1697a.c("byteOutput size is not aligned to frame size " + i7, i7 % this.f1097n == 0);
        if (i8 != 3) {
            for (int i15 = 0; i15 < i7; i15 += 2) {
                int i16 = i15 + 1;
                int i17 = (bArr3[i16] << 8) | (bArr3[i15] & 255);
                int i18 = this.f1095k;
                if (i8 == 0) {
                    i18 = ((((i15 * 1000) / (i7 - 1)) * (i18 - 100)) / 1000) + 100;
                } else if (i8 == 2) {
                    i18 += (((i15 * 1000) * (100 - i18)) / (i7 - 1)) / 1000;
                }
                int i19 = (i17 * i18) / 100;
                if (i19 >= 32767) {
                    bArr3[i15] = -1;
                    bArr3[i16] = 127;
                } else if (i19 <= -32768) {
                    bArr3[i15] = 0;
                    bArr3[i16] = -128;
                } else {
                    bArr3[i15] = (byte) (i19 & 255);
                    bArr3[i16] = (byte) (i19 >> 8);
                }
            }
        }
        l(i7).put(bArr3, 0, i7).flip();
    }
}
