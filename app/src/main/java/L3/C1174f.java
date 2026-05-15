package l3;

import N2.J;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k.I;
import w2.AbstractC1697a;
import w2.m;

/* JADX INFO: renamed from: l3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1174f extends AbstractC1177i {
    public final m h = new m();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f14234i = new J();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14235j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14236k;
    public final C1173e[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1173e f14237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f14238n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f14239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public J f14240p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14241q;

    public C1174f(int i7, List list) {
        this.f14236k = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b7 = ((byte[]) list.get(0))[0];
        }
        this.l = new C1173e[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.l[i8] = new C1173e();
        }
        this.f14237m = this.l[0];
    }

    @Override // l3.AbstractC1177i, z2.c
    public final void flush() {
        super.flush();
        this.f14238n = null;
        this.f14239o = null;
        this.f14241q = 0;
        this.f14237m = this.l[0];
        m();
        this.f14240p = null;
    }

    @Override // l3.AbstractC1177i
    public final I g() {
        List list = this.f14238n;
        this.f14239o = list;
        list.getClass();
        return new I(1, list);
    }

    @Override // l3.AbstractC1177i
    public final void h(C1175g c1175g) {
        ByteBuffer byteBuffer = c1175g.f21115s;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        m mVar = this.h;
        mVar.E(iLimit, bArrArray);
        while (mVar.a() >= 3) {
            int iU = mVar.u();
            int i7 = iU & 3;
            boolean z6 = (iU & 4) == 4;
            byte bU = (byte) mVar.u();
            byte bU2 = (byte) mVar.u();
            if (i7 == 2 || i7 == 3) {
                if (z6) {
                    if (i7 == 3) {
                        k();
                        int i8 = (bU & 192) >> 6;
                        int i9 = this.f14235j;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            m();
                            AbstractC1697a.w("Sequence number discontinuity. previous=" + this.f14235j + " current=" + i8);
                        }
                        this.f14235j = i8;
                        int i10 = bU & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        J j3 = new J(i8, i10);
                        this.f14240p = j3;
                        j3.f4990e = 1;
                        j3.f4989d[0] = bU2;
                    } else {
                        AbstractC1697a.d(i7 == 2);
                        J j7 = this.f14240p;
                        if (j7 == null) {
                            AbstractC1697a.m("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = j7.f4989d;
                            int i11 = j7.f4990e;
                            int i12 = i11 + 1;
                            j7.f4990e = i12;
                            bArr[i11] = bU;
                            j7.f4990e = i11 + 2;
                            bArr[i12] = bU2;
                        }
                    }
                    J j8 = this.f14240p;
                    if (j8.f4990e == (j8.f4988c * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // l3.AbstractC1177i
    public final boolean j() {
        return this.f14238n != this.f14239o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        int i7;
        boolean z6;
        int i8;
        int i9;
        char c7;
        J j3 = this.f14240p;
        if (j3 == null) {
            return;
        }
        int i10 = 2;
        boolean z7 = true;
        if (j3.f4990e != (j3.f4988c * 2) - 1) {
            AbstractC1697a.l("DtvCcPacket ended prematurely; size is " + ((this.f14240p.f4988c * 2) - 1) + ", but current index is " + this.f14240p.f4990e + " (sequence number " + this.f14240p.f4987b + ");");
        }
        J j7 = this.f14240p;
        byte[] bArr = j7.f4989d;
        int i11 = j7.f4990e;
        J j8 = this.f14234i;
        j8.o(i11, bArr);
        boolean z8 = false;
        while (true) {
            if (j8.b() > 0) {
                int i12 = 3;
                int i13 = j8.i(3);
                int i14 = j8.i(5);
                int i15 = 7;
                if (i13 == 7) {
                    j8.t(i10);
                    i13 = j8.i(6);
                    if (i13 < 7) {
                        n1.c.x(i13, "Invalid extended service number: ");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        AbstractC1697a.w("serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f14236k) {
                    j8.u(i14);
                } else {
                    int iG = (i14 * 8) + j8.g();
                    while (j8.g() < iG) {
                        int i16 = j8.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 == i12) {
                                        this.f14238n = l();
                                    } else if (i16 != 8) {
                                        switch (i16) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.f14237m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i16 >= 17 && i16 <= 23) {
                                                    AbstractC1697a.w("Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                    j8.t(8);
                                                } else if (i16 < 24 || i16 > 31) {
                                                    n1.c.x(i16, "Invalid C0 command: ");
                                                } else {
                                                    AbstractC1697a.w("Currently unsupported COMMAND_P16 Command: " + i16);
                                                    j8.t(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f14237m.f14216b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = i15;
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f14237m.a((char) 9835);
                                } else {
                                    this.f14237m.a((char) (i16 & 255));
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = i15;
                                z8 = true;
                            } else {
                                if (i16 <= 159) {
                                    C1173e[] c1173eArr = this.l;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i7 = i12;
                                            z6 = true;
                                            int i17 = i16 - 128;
                                            if (this.f14241q != i17) {
                                                this.f14241q = i17;
                                                this.f14237m = c1173eArr[i17];
                                            }
                                            break;
                                        case 136:
                                            i7 = i12;
                                            z6 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (j8.h()) {
                                                    C1173e c1173e = c1173eArr[8 - i18];
                                                    c1173e.f14215a.clear();
                                                    c1173e.f14216b.clear();
                                                    c1173e.f14227o = -1;
                                                    c1173e.f14228p = -1;
                                                    c1173e.f14229q = -1;
                                                    c1173e.f14231s = -1;
                                                    c1173e.f14233u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i7 = i12;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (j8.h()) {
                                                    c1173eArr[8 - i19].f14218d = true;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 138:
                                            i7 = i12;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (j8.h()) {
                                                    c1173eArr[8 - i20].f14218d = false;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 139:
                                            i7 = i12;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (j8.h()) {
                                                    c1173eArr[8 - i21].f14218d = !r1.f14218d;
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 140:
                                            i7 = i12;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (j8.h()) {
                                                    c1173eArr[8 - i22].d();
                                                }
                                            }
                                            z6 = true;
                                            break;
                                        case 141:
                                            i7 = i12;
                                            j8.t(8);
                                            z6 = true;
                                            break;
                                        case 142:
                                            i7 = i12;
                                            z6 = true;
                                            break;
                                        case 143:
                                            i7 = i12;
                                            m();
                                            z6 = true;
                                            break;
                                        case 144:
                                            if (this.f14237m.f14217c) {
                                                j8.i(4);
                                                j8.i(2);
                                                j8.i(2);
                                                boolean zH = j8.h();
                                                boolean zH2 = j8.h();
                                                i7 = 3;
                                                j8.i(3);
                                                j8.i(3);
                                                this.f14237m.e(zH, zH2);
                                                z6 = true;
                                            } else {
                                                j8.t(16);
                                                i7 = 3;
                                                z6 = true;
                                            }
                                            break;
                                        case 145:
                                            if (this.f14237m.f14217c) {
                                                int iC = C1173e.c(j8.i(2), j8.i(2), j8.i(2), j8.i(2));
                                                int iC2 = C1173e.c(j8.i(2), j8.i(2), j8.i(2), j8.i(2));
                                                j8.t(2);
                                                C1173e.c(j8.i(2), j8.i(2), j8.i(2), 0);
                                                this.f14237m.f(iC, iC2);
                                            } else {
                                                j8.t(24);
                                            }
                                            i7 = 3;
                                            z6 = true;
                                            break;
                                        case 146:
                                            if (this.f14237m.f14217c) {
                                                j8.t(4);
                                                int i23 = j8.i(4);
                                                j8.t(2);
                                                j8.i(6);
                                                C1173e c1173e2 = this.f14237m;
                                                if (c1173e2.f14233u != i23) {
                                                    c1173e2.a('\n');
                                                }
                                                c1173e2.f14233u = i23;
                                            } else {
                                                j8.t(16);
                                            }
                                            i7 = 3;
                                            z6 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            n1.c.x(i16, "Invalid C1 command: ");
                                            i7 = i12;
                                            z6 = true;
                                            break;
                                        case 151:
                                            if (this.f14237m.f14217c) {
                                                int iC3 = C1173e.c(j8.i(2), j8.i(2), j8.i(2), j8.i(2));
                                                j8.i(2);
                                                C1173e.c(j8.i(2), j8.i(2), j8.i(2), 0);
                                                j8.h();
                                                j8.h();
                                                j8.i(2);
                                                j8.i(2);
                                                int i24 = j8.i(2);
                                                j8.t(8);
                                                C1173e c1173e3 = this.f14237m;
                                                c1173e3.f14226n = iC3;
                                                c1173e3.f14224k = i24;
                                            } else {
                                                j8.t(32);
                                            }
                                            i7 = 3;
                                            z6 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = i16 - 152;
                                            C1173e c1173e4 = c1173eArr[i25];
                                            j8.t(i10);
                                            boolean zH3 = j8.h();
                                            j8.t(i10);
                                            int i26 = j8.i(i12);
                                            boolean zH4 = j8.h();
                                            int i27 = j8.i(i15);
                                            int i28 = j8.i(8);
                                            int i29 = j8.i(4);
                                            int i30 = j8.i(4);
                                            j8.t(i10);
                                            j8.t(6);
                                            j8.t(i10);
                                            int i31 = j8.i(i12);
                                            int i32 = j8.i(i12);
                                            c1173e4.f14217c = true;
                                            c1173e4.f14218d = zH3;
                                            c1173e4.f14219e = i26;
                                            c1173e4.f14220f = zH4;
                                            c1173e4.f14221g = i27;
                                            c1173e4.h = i28;
                                            c1173e4.f14222i = i29;
                                            int i33 = i30 + 1;
                                            if (c1173e4.f14223j != i33) {
                                                c1173e4.f14223j = i33;
                                                while (true) {
                                                    ArrayList arrayList = c1173e4.f14215a;
                                                    if (arrayList.size() >= c1173e4.f14223j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i31 != 0 && c1173e4.l != i31) {
                                                c1173e4.l = i31;
                                                int i34 = i31 - 1;
                                                int i35 = C1173e.f14206B[i34];
                                                boolean z9 = C1173e.f14205A[i34];
                                                int i36 = C1173e.f14213y[i34];
                                                int i37 = C1173e.f14214z[i34];
                                                int i38 = C1173e.f14212x[i34];
                                                c1173e4.f14226n = i35;
                                                c1173e4.f14224k = i38;
                                            }
                                            if (i32 != 0 && c1173e4.f14225m != i32) {
                                                c1173e4.f14225m = i32;
                                                int i39 = i32 - 1;
                                                int i40 = C1173e.f14208D[i39];
                                                int i41 = C1173e.f14207C[i39];
                                                c1173e4.e(false, false);
                                                c1173e4.f(C1173e.f14210v, C1173e.f14209E[i39]);
                                            }
                                            if (this.f14241q != i25) {
                                                this.f14241q = i25;
                                                this.f14237m = c1173eArr[i25];
                                            }
                                            i7 = 3;
                                            z6 = true;
                                            break;
                                    }
                                } else {
                                    i7 = i12;
                                    z6 = true;
                                    if (i16 <= 255) {
                                        this.f14237m.a((char) (i16 & 255));
                                    } else {
                                        n1.c.x(i16, "Invalid base command: ");
                                        i9 = 2;
                                        i8 = 7;
                                    }
                                }
                                z8 = z6;
                                i9 = 2;
                                i8 = 7;
                            }
                            z6 = true;
                        } else {
                            i7 = i12;
                            z6 = true;
                            int i42 = j8.i(8);
                            if (i42 <= 31) {
                                i8 = 7;
                                if (i42 > 7) {
                                    if (i42 <= 15) {
                                        j8.t(8);
                                    } else if (i42 <= 23) {
                                        j8.t(16);
                                    } else if (i42 <= 31) {
                                        j8.t(24);
                                    }
                                }
                            } else {
                                i8 = 7;
                                if (i42 <= 127) {
                                    if (i42 == 32) {
                                        this.f14237m.a(' ');
                                    } else if (i42 == 33) {
                                        this.f14237m.a((char) 160);
                                    } else if (i42 == 37) {
                                        this.f14237m.a((char) 8230);
                                    } else if (i42 == 42) {
                                        this.f14237m.a((char) 352);
                                    } else if (i42 == 44) {
                                        this.f14237m.a((char) 338);
                                    } else if (i42 == 63) {
                                        this.f14237m.a((char) 376);
                                    } else if (i42 == 57) {
                                        this.f14237m.a((char) 8482);
                                    } else if (i42 == 58) {
                                        this.f14237m.a((char) 353);
                                    } else if (i42 == 60) {
                                        this.f14237m.a((char) 339);
                                    } else if (i42 != 61) {
                                        switch (i42) {
                                            case 48:
                                                this.f14237m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f14237m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f14237m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f14237m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f14237m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f14237m.a((char) 8226);
                                                break;
                                            default:
                                                switch (i42) {
                                                    case 118:
                                                        this.f14237m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f14237m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f14237m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f14237m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f14237m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f14237m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f14237m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f14237m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f14237m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f14237m.a((char) 9484);
                                                        break;
                                                    default:
                                                        n1.c.x(i42, "Invalid G2 character: ");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f14237m.a((char) 8480);
                                    }
                                    z8 = true;
                                } else {
                                    if (i42 > 159) {
                                        i9 = 2;
                                        c7 = 6;
                                        if (i42 <= 255) {
                                            if (i42 == 160) {
                                                this.f14237m.a((char) 13252);
                                            } else {
                                                n1.c.x(i42, "Invalid G3 character: ");
                                                this.f14237m.a('_');
                                            }
                                            z8 = true;
                                        } else {
                                            n1.c.x(i42, "Invalid extended command: ");
                                        }
                                    } else if (i42 <= 135) {
                                        j8.t(32);
                                    } else if (i42 <= 143) {
                                        j8.t(40);
                                    } else if (i42 <= 159) {
                                        i9 = 2;
                                        j8.t(2);
                                        c7 = 6;
                                        j8.t(j8.i(6) * 8);
                                    }
                                    i12 = i7;
                                    i10 = i9;
                                    z7 = z6;
                                    i15 = i8;
                                }
                            }
                            i9 = 2;
                        }
                        c7 = 6;
                        i12 = i7;
                        i10 = i9;
                        z7 = z6;
                        i15 = i8;
                    }
                }
            }
        }
        if (z8) {
            this.f14238n = l();
        }
        this.f14240p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C1174f.l():java.util.List");
    }

    public final void m() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.l[i7].d();
        }
    }
}
