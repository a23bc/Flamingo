package i3;

import H2.S;
import N2.AbstractC0285b;
import N2.s;
import V.o;
import java.util.Arrays;
import t2.C1487p;
import w2.m;

/* JADX INFO: renamed from: i3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1082c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f13462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S f13463o;

    @Override // i3.i
    public final long b(m mVar) {
        byte[] bArr = mVar.f18867a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            mVar.H(4);
            mVar.B();
        }
        int iQ = AbstractC0285b.q(i7, mVar);
        mVar.G(0);
        return iQ;
    }

    @Override // i3.i
    public final boolean c(m mVar, long j3, V1.a aVar) {
        byte[] bArr = mVar.f18867a;
        s sVar = this.f13462n;
        if (sVar == null) {
            s sVar2 = new s(17, bArr);
            this.f13462n = sVar2;
            aVar.f7389o = sVar2.c(Arrays.copyOfRange(bArr, 9, mVar.f18869c), null);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & 127) != 3) {
            if (b7 != -1) {
                return true;
            }
            S s7 = this.f13463o;
            if (s7 != null) {
                s7.f3074o = j3;
                aVar.f7390p = s7;
            }
            ((C1487p) aVar.f7389o).getClass();
            return false;
        }
        o oVarR = AbstractC0285b.r(mVar);
        s sVar3 = new s(sVar.f5071a, sVar.f5072b, sVar.f5073c, sVar.f5074d, sVar.f5075e, sVar.f5077g, sVar.h, sVar.f5079j, oVarR, sVar.l);
        this.f13462n = sVar3;
        S s8 = new S();
        s8.f3076q = sVar3;
        s8.f3077r = oVarR;
        s8.f3074o = -1L;
        s8.f3075p = -1L;
        this.f13463o = s8;
        return true;
    }

    @Override // i3.i
    public final void d(boolean z6) {
        super.d(z6);
        if (z6) {
            this.f13462n = null;
            this.f13463o = null;
        }
    }
}
