package N2;

import java.io.EOFException;
import t2.C1487p;
import t2.InterfaceC1481j;

/* JADX INFO: loaded from: classes.dex */
public final class l implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5065a = new byte[4096];

    @Override // N2.H
    public final int a(InterfaceC1481j interfaceC1481j, int i7, boolean z6) {
        return b(interfaceC1481j, i7, z6);
    }

    @Override // N2.H
    public final int b(InterfaceC1481j interfaceC1481j, int i7, boolean z6) throws EOFException {
        byte[] bArr = this.f5065a;
        int iN = interfaceC1481j.n(bArr, 0, Math.min(bArr.length, i7));
        if (iN != -1) {
            return iN;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // N2.H
    public final void c(int i7, w2.m mVar) {
        mVar.H(i7);
    }

    @Override // N2.H
    public final void d(w2.m mVar, int i7, int i8) {
        mVar.H(i7);
    }

    @Override // N2.H
    public final void e(C1487p c1487p) {
    }

    @Override // N2.H
    public final void f(long j3, int i7, int i8, int i9, G g6) {
    }
}
