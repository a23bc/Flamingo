package X2;

import N2.J;
import N5.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import t2.L;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8266a;

    @Override // N5.d
    public final L z(W2.a aVar, ByteBuffer byteBuffer) {
        boolean z6 = true;
        switch (this.f8266a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                J j3 = new J(byteBuffer.limit(), byteBuffer.array());
                int i7 = 12;
                j3.t(12);
                int iF = (j3.f() + j3.i(12)) - 4;
                j3.t(44);
                j3.u(j3.i(12));
                j3.t(16);
                ArrayList arrayList = new ArrayList();
                while (j3.f() < iF) {
                    j3.t(48);
                    int i8 = j3.i(8);
                    j3.t(4);
                    int iF2 = j3.f() + j3.i(i7);
                    String str = null;
                    String str2 = null;
                    while (j3.f() < iF2) {
                        int i9 = j3.i(8);
                        int i10 = j3.i(8);
                        boolean z7 = z6;
                        int iF3 = j3.f() + i10;
                        if (i9 == 2) {
                            int i11 = j3.i(16);
                            j3.t(8);
                            if (i11 == 3) {
                                while (j3.f() < iF3) {
                                    int i12 = j3.i(8);
                                    Charset charset = D4.d.f1567a;
                                    byte[] bArr = new byte[i12];
                                    j3.l(i12, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i13 = j3.i(8);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        j3.u(j3.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i9 == 21) {
                            Charset charset2 = D4.d.f1567a;
                            byte[] bArr2 = new byte[i10];
                            j3.l(i10, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        j3.q(iF3 * 8);
                        z6 = z7;
                    }
                    boolean z8 = z6;
                    j3.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i8, str.concat(str2)));
                    }
                    z6 = z8;
                    i7 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new L(arrayList);
            default:
                m mVar = new m(byteBuffer.limit(), byteBuffer.array());
                String strP = mVar.p();
                strP.getClass();
                String strP2 = mVar.p();
                strP2.getClass();
                return new L(new Y2.a(strP, strP2, mVar.o(), mVar.o(), Arrays.copyOfRange(mVar.f18867a, mVar.f18868b, mVar.f18869c)));
        }
    }
}
