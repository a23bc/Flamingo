package i3;

import E4.I;
import N2.AbstractC0285b;
import java.util.ArrayList;
import java.util.Arrays;
import t2.C1486o;
import t2.C1487p;
import t2.L;
import t2.M;
import w2.AbstractC1697a;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f13480o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f13481p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13482n;

    public static boolean e(m mVar, byte[] bArr) {
        if (mVar.a() < bArr.length) {
            return false;
        }
        int i7 = mVar.f18868b;
        byte[] bArr2 = new byte[bArr.length];
        mVar.e(bArr2, 0, bArr.length);
        mVar.G(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // i3.i
    public final long b(m mVar) {
        byte[] bArr = mVar.f18867a;
        return (((long) this.f13490i) * AbstractC0285b.j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // i3.i
    public final boolean c(m mVar, long j3, V1.a aVar) {
        if (e(mVar, f13480o)) {
            byte[] bArrCopyOf = Arrays.copyOf(mVar.f18867a, mVar.f18869c);
            int i7 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = AbstractC0285b.a(bArrCopyOf);
            if (((C1487p) aVar.f7389o) == null) {
                C1486o c1486o = new C1486o();
                c1486o.l = M.j("audio/opus");
                c1486o.f16640z = i7;
                c1486o.f16608A = 48000;
                c1486o.f16629o = arrayListA;
                aVar.f7389o = new C1487p(c1486o);
                return true;
            }
        } else {
            if (!e(mVar, f13481p)) {
                AbstractC1697a.j((C1487p) aVar.f7389o);
                return false;
            }
            AbstractC1697a.j((C1487p) aVar.f7389o);
            if (!this.f13482n) {
                this.f13482n = true;
                mVar.H(8);
                L lP = AbstractC0285b.p(I.q((String[]) AbstractC0285b.s(mVar, false, false).f4105p));
                if (lP != null) {
                    C1486o c1486oA = ((C1487p) aVar.f7389o).a();
                    c1486oA.f16625j = lP.c(((C1487p) aVar.f7389o).f16700k);
                    aVar.f7389o = new C1487p(c1486oA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // i3.i
    public final void d(boolean z6) {
        super.d(z6);
        if (z6) {
            this.f13482n = false;
        }
    }
}
