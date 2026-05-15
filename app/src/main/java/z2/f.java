package z2;

import h3.AbstractC1001c;
import java.nio.ByteBuffer;
import t2.C1487p;
import t2.H;

/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC1001c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1487p f21113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2081b f21114r = new C2081b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ByteBuffer f21115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f21117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ByteBuffer f21118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f21119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f21120x;

    static {
        H.a("media3.decoder");
    }

    public f(int i7, int i8) {
        this.f21119w = i7;
        this.f21120x = i8;
    }

    public void f() {
        this.f12566p = 0;
        ByteBuffer byteBuffer = this.f21115s;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f21118v;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f21116t = false;
    }

    public final ByteBuffer g(int i7) {
        int i8 = this.f21119w;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f21115s;
        throw new e("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i7 + ")");
    }

    public final void h(int i7) {
        int i8 = i7 + this.f21120x;
        ByteBuffer byteBuffer = this.f21115s;
        if (byteBuffer == null) {
            this.f21115s = g(i8);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i9 = i8 + iPosition;
        if (iCapacity >= i9) {
            this.f21115s = byteBuffer;
            return;
        }
        ByteBuffer byteBufferG = g(i9);
        byteBufferG.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferG.put(byteBuffer);
        }
        this.f21115s = byteBufferG;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.f21115s;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f21118v;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
