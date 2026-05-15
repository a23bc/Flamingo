package N2;

import b3.C0692h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import k3.C1145a;
import t2.L;
import v2.C1634a;
import v2.C1635b;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class w implements k3.m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.m f5094o;

    public w(int i7) {
        switch (i7) {
            case 1:
                this.f5094o = new w2.m();
                break;
            default:
                this.f5094o = new w2.m(10);
                break;
        }
    }

    public L a(C0293j c0293j, B2.g gVar) {
        w2.m mVar = this.f5094o;
        L lZ = null;
        int i7 = 0;
        while (true) {
            try {
                c0293j.i(mVar.f18867a, 0, 10, false);
                mVar.G(0);
                if (mVar.x() != 4801587) {
                    break;
                }
                mVar.H(3);
                int iT = mVar.t();
                int i8 = iT + 10;
                if (lZ == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(mVar.f18867a, 0, bArr, 0, 10);
                    c0293j.i(bArr, 10, iT, false);
                    lZ = new C0692h(gVar).Z(i8, bArr);
                } else {
                    c0293j.k(iT, false);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        c0293j.f5056t = 0;
        c0293j.k(i7, false);
        return lZ;
    }

    @Override // k3.m
    public /* synthetic */ void d() {
    }

    @Override // k3.m
    public /* synthetic */ k3.d i(byte[] bArr, int i7, int i8) {
        return Z1.l.e(this, bArr, i8);
    }

    @Override // k3.m
    public void l(byte[] bArr, int i7, int i8, k3.l lVar, w2.c cVar) {
        C1635b c1635bA;
        w2.m mVar = this.f5094o;
        mVar.E(i7 + i8, bArr);
        mVar.G(i7);
        ArrayList arrayList = new ArrayList();
        while (mVar.a() > 0) {
            AbstractC1697a.c("Incomplete Mp4Webvtt Top Level box header found.", mVar.a() >= 8);
            int iG = mVar.g();
            if (mVar.g() == 1987343459) {
                int i9 = iG - 8;
                CharSequence charSequenceF = null;
                C1634a c1634aA = null;
                while (i9 > 0) {
                    AbstractC1697a.c("Incomplete vtt cue box header found.", i9 >= 8);
                    int iG2 = mVar.g();
                    int iG3 = mVar.g();
                    int i10 = iG2 - 8;
                    byte[] bArr2 = mVar.f18867a;
                    int i11 = mVar.f18868b;
                    int i12 = w2.t.f18881a;
                    String str = new String(bArr2, i11, i10, D4.d.f1569c);
                    mVar.H(i10);
                    i9 = (i9 - 8) - i10;
                    if (iG3 == 1937011815) {
                        s3.g gVar = new s3.g();
                        s3.h.e(str, gVar);
                        c1634aA = gVar.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = s3.h.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (c1634aA != null) {
                    c1634aA.f18222a = charSequenceF;
                    c1635bA = c1634aA.a();
                } else {
                    Pattern pattern = s3.h.f15908a;
                    s3.g gVar2 = new s3.g();
                    gVar2.f15900c = charSequenceF;
                    c1635bA = gVar2.a().a();
                }
                arrayList.add(c1635bA);
            } else {
                mVar.H(iG - 8);
            }
        }
        cVar.c(new C1145a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // k3.m
    public /* synthetic */ void r(byte[] bArr, k3.l lVar, A2.I i7) {
        Z1.l.d(this, bArr, lVar, i7);
    }

    @Override // k3.m
    public int s() {
        return 2;
    }
}
