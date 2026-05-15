package E2;

import java.nio.ByteBuffer;
import k3.j;
import k3.m;
import w2.AbstractC1697a;
import z2.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements k3.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1823o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f1824p;

    public b(String str, m mVar) {
        super(new k3.i[2], new j[2]);
        int i7 = this.f21131g;
        z2.f[] fVarArr = this.f21129e;
        AbstractC1697a.i(i7 == fVarArr.length);
        for (z2.f fVar : fVarArr) {
            fVar.h(1024);
        }
        this.f1824p = mVar;
    }

    @Override // z2.i
    public final z2.f g() {
        switch (this.f1823o) {
            case 0:
                return new z2.f(1, 0);
            default:
                return new k3.i();
        }
    }

    @Override // z2.i
    public final z2.g h() {
        switch (this.f1823o) {
            case 0:
                return new a(this);
            default:
                return new k3.c(this);
        }
    }

    @Override // z2.i
    public final z2.d i(Throwable th) {
        switch (this.f1823o) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new k3.f("Unexpected decode error", th);
        }
    }

    @Override // z2.i
    public final z2.d j(z2.f fVar, z2.g gVar, boolean z6) {
        switch (this.f1823o) {
            case 0:
                a aVar = (a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f21115s;
                    byteBuffer.getClass();
                    AbstractC1697a.i(byteBuffer.hasArray());
                    AbstractC1697a.d(byteBuffer.arrayOffset() == 0);
                    B2.g gVar2 = (B2.g) this.f1824p;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    gVar2.getClass();
                    aVar.f1821t = B2.g.d(iRemaining, bArrArray);
                    aVar.f21121q = fVar.f21117u;
                    return null;
                } catch (d e7) {
                    return e7;
                }
            default:
                k3.i iVar = (k3.i) fVar;
                j jVar = (j) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f21115s;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    m mVar = (m) this.f1824p;
                    if (z6) {
                        mVar.d();
                    }
                    k3.d dVarI = mVar.i(bArrArray2, 0, iLimit);
                    long j3 = iVar.f21117u;
                    long j7 = iVar.f14040y;
                    jVar.f21121q = j3;
                    jVar.f14041t = dVarI;
                    if (j7 != Long.MAX_VALUE) {
                        j3 = j7;
                    }
                    jVar.f14042u = j3;
                    jVar.f21123s = false;
                    return null;
                } catch (k3.f e8) {
                    return e8;
                }
        }
    }

    public b(B2.g gVar) {
        super(new z2.f[1], new a[1]);
        this.f1824p = gVar;
    }

    @Override // k3.e
    public void d(long j3) {
    }
}
