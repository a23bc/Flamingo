package C2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends u2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1109k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f1110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1112o;

    @Override // u2.e
    public final u2.b a(u2.b bVar) throws u2.c {
        if (bVar.f17207c != 2) {
            throw new u2.c(bVar);
        }
        this.f1109k = true;
        return (this.f1107i == 0 && this.f1108j == 0) ? u2.b.f17204e : bVar;
    }

    @Override // u2.e, u2.d
    public final ByteBuffer c() {
        int i7;
        if (super.f() && (i7 = this.f1111n) > 0) {
            l(i7).put(this.f1110m, 0, this.f1111n).flip();
            this.f1111n = 0;
        }
        return super.c();
    }

    @Override // u2.e, u2.d
    public final boolean f() {
        return super.f() && this.f1111n == 0;
    }

    @Override // u2.d
    public final void h(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        if (i7 == 0) {
            return;
        }
        int iMin = Math.min(i7, this.l);
        this.f1112o += (long) (iMin / this.f17210b.f17208d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i8 = i7 - iMin;
        int length = (this.f1111n + i8) - this.f1110m.length;
        ByteBuffer byteBufferL = l(length);
        int iG = w2.t.g(length, 0, this.f1111n);
        byteBufferL.put(this.f1110m, 0, iG);
        int iG2 = w2.t.g(length - iG, 0, i8);
        byteBuffer.limit(byteBuffer.position() + iG2);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i9 = i8 - iG2;
        int i10 = this.f1111n - iG;
        this.f1111n = i10;
        byte[] bArr = this.f1110m;
        System.arraycopy(bArr, iG, bArr, 0, i10);
        byteBuffer.get(this.f1110m, this.f1111n, i9);
        this.f1111n += i9;
        byteBufferL.flip();
    }

    @Override // u2.e
    public final void i() {
        if (this.f1109k) {
            this.f1109k = false;
            int i7 = this.f1108j;
            int i8 = this.f17210b.f17208d;
            this.f1110m = new byte[i7 * i8];
            this.l = this.f1107i * i8;
        }
        this.f1111n = 0;
    }

    @Override // u2.e
    public final void j() {
        if (this.f1109k) {
            int i7 = this.f1111n;
            if (i7 > 0) {
                this.f1112o += (long) (i7 / this.f17210b.f17208d);
            }
            this.f1111n = 0;
        }
    }

    @Override // u2.e
    public final void k() {
        this.f1110m = w2.t.f18886f;
    }
}
