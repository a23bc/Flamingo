package F2;

import java.nio.ByteBuffer;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends z2.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2216A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2217y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2218z;

    @Override // z2.f
    public final void f() {
        super.f();
        this.f2218z = 0;
    }

    public final boolean k(z2.f fVar) {
        ByteBuffer byteBuffer;
        AbstractC1697a.d(!fVar.c(1073741824));
        AbstractC1697a.d(!fVar.c(268435456));
        AbstractC1697a.d(!fVar.c(4));
        if (l()) {
            if (this.f2218z >= this.f2216A) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f21115s;
            if (byteBuffer2 != null && (byteBuffer = this.f21115s) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i7 = this.f2218z;
        this.f2218z = i7 + 1;
        if (i7 == 0) {
            this.f21117u = fVar.f21117u;
            if (fVar.c(1)) {
                this.f12566p = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f21115s;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f21115s.put(byteBuffer3);
        }
        this.f2217y = fVar.f21117u;
        return true;
    }

    public final boolean l() {
        return this.f2218z > 0;
    }
}
