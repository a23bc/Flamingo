package M2;

import A0.e;
import A2.AbstractC0006g;
import A2.L;
import V.o;
import java.nio.ByteBuffer;
import t2.C1487p;
import w2.m;
import w2.t;
import z2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0006g {

    /* JADX INFO: renamed from: F */
    public final f f4758F;

    /* JADX INFO: renamed from: G */
    public final m f4759G;

    /* JADX INFO: renamed from: H */
    public L f4760H;

    /* JADX INFO: renamed from: I */
    public long f4761I;

    public a() {
        super(6);
        this.f4758F = new f(1, 0);
        this.f4759G = new m();
    }

    @Override // A2.AbstractC0006g
    public final int A(C1487p c1487p) {
        return "application/x-camera-motion".equals(c1487p.f16701m) ? e.r(4, 0, 0, 0) : e.r(0, 0, 0, 0);
    }

    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) {
        if (i7 == 8) {
            this.f4760H = (L) obj;
        }
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "CameraMotionRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return f();
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        return true;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        L l = this.f4760H;
        if (l != null) {
            l.c();
        }
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) {
        this.f4761I = Long.MIN_VALUE;
        L l = this.f4760H;
        if (l != null) {
            l.c();
        }
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) {
        float[] fArr;
        while (!f() && this.f4761I < 100000 + j3) {
            f fVar = this.f4758F;
            fVar.f();
            o oVar = this.f282q;
            oVar.e();
            if (v(oVar, fVar, 0) != -4 || fVar.c(4)) {
                return;
            }
            long j8 = fVar.f21117u;
            this.f4761I = j8;
            boolean z6 = j8 < this.f291z;
            if (this.f4760H != null && !z6) {
                fVar.i();
                ByteBuffer byteBuffer = fVar.f21115s;
                int i7 = t.f18881a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    m mVar = this.f4759G;
                    mVar.E(iLimit, bArrArray);
                    mVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i8 = 0; i8 < 3; i8++) {
                        fArr2[i8] = Float.intBitsToFloat(mVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f4760H.b();
                }
            }
        }
    }

    @Override // A2.AbstractC0006g
    public final void u(C1487p[] c1487pArr, long j3, long j7) {
    }
}
