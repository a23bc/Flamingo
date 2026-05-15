package P2;

import E4.AbstractC0119q;
import E4.C;
import E4.G;
import E4.I;
import E4.b0;
import java.util.Arrays;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;
import w2.m;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f5743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5744b;

    public f(int i7, b0 b0Var) {
        this.f5744b = i7;
        this.f5743a = b0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f c(int i7, m mVar) {
        a gVar;
        String str;
        int i8;
        int i9 = 4;
        AbstractC0119q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = mVar.f18869c;
        int i11 = 0;
        int i12 = -2;
        int i13 = 0;
        while (mVar.a() > 8) {
            int i14 = mVar.i();
            int i15 = mVar.f18868b + mVar.i();
            mVar.F(i15);
            if (i14 != 1414744396) {
                d dVar = null;
                switch (i14) {
                    case 1718776947:
                        if (i12 != 2) {
                            if (i12 == 1) {
                                int iN = mVar.n();
                                String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iN2 = mVar.n();
                                    int i16 = mVar.i();
                                    mVar.H(6);
                                    int iS = t.s(mVar.n());
                                    int iN3 = mVar.a() > 0 ? mVar.n() : i11;
                                    byte[] bArr = new byte[iN3];
                                    mVar.e(bArr, i11, iN3);
                                    C1486o c1486o = new C1486o();
                                    c1486o.l = M.j(str2);
                                    c1486o.f16640z = iN2;
                                    c1486o.f16608A = i16;
                                    if ("audio/raw".equals(str2) && iS != 0) {
                                        c1486o.f16609B = iS;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iN3 > 0) {
                                        c1486o.f16629o = I.t(bArr);
                                    }
                                    gVar = new g(new C1487p(c1486o));
                                } else {
                                    n1.c.x(iN, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                AbstractC1697a.w("Ignoring strf box for unsupported track type: " + t.w(i12));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            mVar.H(i9);
                            int i17 = mVar.i();
                            int i18 = mVar.i();
                            mVar.H(i9);
                            int i19 = mVar.i();
                            switch (i19) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C1486o c1486o2 = new C1486o();
                                c1486o2.f16632r = i17;
                                c1486o2.f16633s = i18;
                                c1486o2.l = M.j(str);
                                gVar = new g(new C1487p(c1486o2));
                            } else {
                                n1.c.x(i19, "Ignoring track with unsupported compression ");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int i20 = mVar.i();
                        mVar.H(8);
                        int i21 = mVar.i();
                        int i22 = mVar.i();
                        mVar.H(i9);
                        mVar.i();
                        mVar.H(12);
                        gVar = new c(i20, i21, i22);
                        break;
                    case 1752331379:
                        int i23 = mVar.i();
                        mVar.H(12);
                        mVar.i();
                        int i24 = mVar.i();
                        int i25 = mVar.i();
                        mVar.H(i9);
                        int i26 = mVar.i();
                        int i27 = mVar.i();
                        mVar.H(8);
                        dVar = new d(i23, i24, i25, i26, i27);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(mVar.s(mVar.a(), D4.d.f1569c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = c(mVar.i(), mVar);
            }
            if (gVar != null) {
                if (gVar.a() == 1752331379) {
                    int i28 = ((d) gVar).f5728a;
                    if (i28 == 1935960438) {
                        i12 = 2;
                    } else if (i28 != 1935963489) {
                        if (i28 != 1937012852) {
                            AbstractC1697a.w("Found unsupported streamType fourCC: " + Integer.toHexString(i28));
                            i8 = -1;
                        } else {
                            i8 = 3;
                        }
                        i12 = i8;
                    } else {
                        i12 = 1;
                    }
                }
                int i29 = i13 + 1;
                if (objArrCopyOf.length < i29) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C.d(objArrCopyOf.length, i29));
                }
                objArrCopyOf[i13] = gVar;
                i13 = i29;
            }
            mVar.G(i15);
            mVar.F(i10);
            i9 = 4;
            i11 = 0;
        }
        return new f(i7, I.n(i13, objArrCopyOf));
    }

    @Override // P2.a
    public final int a() {
        return this.f5744b;
    }

    public final a b(Class cls) {
        G gListIterator = this.f5743a.listIterator(0);
        while (gListIterator.hasNext()) {
            a aVar = (a) gListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }
}
