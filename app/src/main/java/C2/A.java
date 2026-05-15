package C2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class A extends u2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f974j;

    @Override // u2.e
    public final u2.b a(u2.b bVar) throws u2.c {
        int[] iArr = this.f973i;
        if (iArr == null) {
            return u2.b.f17204e;
        }
        if (bVar.f17207c != 2) {
            throw new u2.c(bVar);
        }
        int length = iArr.length;
        int i7 = bVar.f17206b;
        boolean z6 = i7 != length;
        int i8 = 0;
        while (i8 < iArr.length) {
            int i9 = iArr[i8];
            if (i9 >= i7) {
                throw new u2.c(bVar);
            }
            z6 |= i9 != i8;
            i8++;
        }
        return z6 ? new u2.b(bVar.f17205a, iArr.length, 2) : u2.b.f17204e;
    }

    @Override // u2.d
    public final void h(ByteBuffer byteBuffer) {
        int[] iArr = this.f974j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f17210b.f17208d) * this.f17211c.f17208d);
        while (iPosition < iLimit) {
            for (int i7 : iArr) {
                byteBufferL.putShort(byteBuffer.getShort((i7 * 2) + iPosition));
            }
            iPosition += this.f17210b.f17208d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // u2.e
    public final void i() {
        this.f974j = this.f973i;
    }

    @Override // u2.e
    public final void k() {
        this.f974j = null;
        this.f973i = null;
    }
}
