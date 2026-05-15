package u2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: b */
    public int f17236b;

    /* JADX INFO: renamed from: c */
    public float f17237c;

    /* JADX INFO: renamed from: d */
    public float f17238d;

    /* JADX INFO: renamed from: e */
    public b f17239e;

    /* JADX INFO: renamed from: f */
    public b f17240f;

    /* JADX INFO: renamed from: g */
    public b f17241g;
    public b h;

    /* JADX INFO: renamed from: i */
    public boolean f17242i;

    /* JADX INFO: renamed from: j */
    public f f17243j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f17244k;
    public ShortBuffer l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f17245m;

    /* JADX INFO: renamed from: n */
    public long f17246n;

    /* JADX INFO: renamed from: o */
    public long f17247o;

    /* JADX INFO: renamed from: p */
    public boolean f17248p;

    @Override // u2.d
    public final boolean b() {
        if (this.f17240f.f17205a != -1) {
            return Math.abs(this.f17237c - 1.0f) >= 1.0E-4f || Math.abs(this.f17238d - 1.0f) >= 1.0E-4f || this.f17240f.f17205a != this.f17239e.f17205a;
        }
        return false;
    }

    @Override // u2.d
    public final ByteBuffer c() {
        f fVar = this.f17243j;
        if (fVar != null) {
            int i7 = fVar.f17226m;
            int i8 = fVar.f17217b;
            int i9 = i7 * i8 * 2;
            if (i9 > 0) {
                if (this.f17244k.capacity() < i9) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
                    this.f17244k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f17244k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i8, fVar.f17226m);
                int i10 = iMin * i8;
                shortBuffer.put(fVar.l, 0, i10);
                int i11 = fVar.f17226m - iMin;
                fVar.f17226m = i11;
                short[] sArr = fVar.l;
                System.arraycopy(sArr, i10, sArr, 0, i11 * i8);
                this.f17247o += (long) i9;
                this.f17244k.limit(i9);
                this.f17245m = this.f17244k;
            }
        }
        ByteBuffer byteBuffer = this.f17245m;
        this.f17245m = d.f17209a;
        return byteBuffer;
    }

    @Override // u2.d
    public final void d() {
        this.f17237c = 1.0f;
        this.f17238d = 1.0f;
        b bVar = b.f17204e;
        this.f17239e = bVar;
        this.f17240f = bVar;
        this.f17241g = bVar;
        this.h = bVar;
        ByteBuffer byteBuffer = d.f17209a;
        this.f17244k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.f17245m = byteBuffer;
        this.f17236b = -1;
        this.f17242i = false;
        this.f17243j = null;
        this.f17246n = 0L;
        this.f17247o = 0L;
        this.f17248p = false;
    }

    @Override // u2.d
    public final void e() {
        f fVar = this.f17243j;
        if (fVar != null) {
            int i7 = fVar.f17225k;
            float f7 = fVar.f17218c;
            float f8 = fVar.f17219d;
            int i8 = fVar.f17226m + ((int) ((((i7 / (f7 / f8)) + fVar.f17228o) / (fVar.f17220e * f8)) + 0.5f));
            short[] sArr = fVar.f17224j;
            int i9 = fVar.h * 2;
            fVar.f17224j = fVar.c(sArr, i7, i9 + i7);
            int i10 = 0;
            while (true) {
                int i11 = fVar.f17217b;
                if (i10 >= i9 * i11) {
                    break;
                }
                fVar.f17224j[(i11 * i7) + i10] = 0;
                i10++;
            }
            fVar.f17225k = i9 + fVar.f17225k;
            fVar.f();
            if (fVar.f17226m > i8) {
                fVar.f17226m = i8;
            }
            fVar.f17225k = 0;
            fVar.f17231r = 0;
            fVar.f17228o = 0;
        }
        this.f17248p = true;
    }

    @Override // u2.d
    public final boolean f() {
        if (!this.f17248p) {
            return false;
        }
        f fVar = this.f17243j;
        return fVar == null || (fVar.f17226m * fVar.f17217b) * 2 == 0;
    }

    @Override // u2.d
    public final void flush() {
        if (b()) {
            b bVar = this.f17239e;
            this.f17241g = bVar;
            b bVar2 = this.f17240f;
            this.h = bVar2;
            if (this.f17242i) {
                int i7 = bVar.f17205a;
                this.f17243j = new f(this.f17237c, this.f17238d, i7, bVar.f17206b, bVar2.f17205a);
            } else {
                f fVar = this.f17243j;
                if (fVar != null) {
                    fVar.f17225k = 0;
                    fVar.f17226m = 0;
                    fVar.f17228o = 0;
                    fVar.f17229p = 0;
                    fVar.f17230q = 0;
                    fVar.f17231r = 0;
                    fVar.f17232s = 0;
                    fVar.f17233t = 0;
                    fVar.f17234u = 0;
                    fVar.f17235v = 0;
                }
            }
        }
        this.f17245m = d.f17209a;
        this.f17246n = 0L;
        this.f17247o = 0L;
        this.f17248p = false;
    }

    @Override // u2.d
    public final b g(b bVar) throws c {
        if (bVar.f17207c != 2) {
            throw new c(bVar);
        }
        int i7 = this.f17236b;
        if (i7 == -1) {
            i7 = bVar.f17205a;
        }
        this.f17239e = bVar;
        b bVar2 = new b(i7, bVar.f17206b, 2);
        this.f17240f = bVar2;
        this.f17242i = true;
        return bVar2;
    }

    @Override // u2.d
    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f17243j;
            fVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f17246n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i7 = fVar.f17217b;
            int i8 = iRemaining2 / i7;
            short[] sArrC = fVar.c(fVar.f17224j, fVar.f17225k, i8);
            fVar.f17224j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, fVar.f17225k * i7, ((i8 * i7) * 2) / 2);
            fVar.f17225k += i8;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }
}
