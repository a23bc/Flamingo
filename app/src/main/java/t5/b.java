package T5;

import M4.j;
import N2.z;
import S5.B;
import S5.C0427g;
import S5.u;
import Z4.n;
import Z4.y;
import j0.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import m5.AbstractC1209k;
import m5.C1216r;
import m5.C1219u;
import m5.C1220v;
import u5.AbstractC1545g;
import u5.AbstractC1552n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public static final char[] f6986a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = u.f6810p;
        u uVarN = z.n("/");
        Y4.h[] hVarArr = {new Y4.h(uVarN, new f(uVarN))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.k0(1));
        y.n0(linkedHashMap, hVarArr);
        for (f fVar : n.G0(arrayList, new j(1))) {
            if (((f) linkedHashMap.put(fVar.f6999a, fVar)) == null) {
                while (true) {
                    u uVar = fVar.f6999a;
                    u uVarB = uVar.b();
                    if (uVarB != null) {
                        f fVar2 = (f) linkedHashMap.get(uVarB);
                        if (fVar2 != null) {
                            fVar2.h.add(uVar);
                            break;
                        }
                        f fVar3 = new f(uVarB);
                        linkedHashMap.put(uVarB, fVar3);
                        fVar3.h.add(uVar);
                        fVar = fVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i7) {
        k.p(16);
        String string = Integer.toString(i7, 16);
        AbstractC1209k.e(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final f d(S5.y yVar) throws IOException {
        Long lValueOf;
        int iJ = yVar.j();
        if (iJ != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iJ));
        }
        yVar.u(4L);
        short sQ = yVar.q();
        int i7 = sQ & 65535;
        if ((sQ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        int iQ = yVar.q() & 65535;
        short sQ2 = yVar.q();
        int i8 = sQ2 & 65535;
        short sQ3 = yVar.q();
        int i9 = sQ3 & 65535;
        if (i8 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i9 >> 9) & 127) + 1980, ((i9 >> 5) & 15) - 1, sQ3 & 31, (i8 >> 11) & 31, (i8 >> 5) & 63, (sQ2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = lValueOf;
        yVar.j();
        C1219u c1219u = new C1219u();
        c1219u.f14438o = ((long) yVar.j()) & 4294967295L;
        C1219u c1219u2 = new C1219u();
        c1219u2.f14438o = ((long) yVar.j()) & 4294967295L;
        int iQ2 = yVar.q() & 65535;
        int iQ3 = yVar.q() & 65535;
        int iQ4 = yVar.q() & 65535;
        yVar.u(8L);
        C1219u c1219u3 = new C1219u();
        c1219u3.f14438o = ((long) yVar.j()) & 4294967295L;
        String strR = yVar.r(iQ2);
        if (AbstractC1545g.O(strR, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j3 = c1219u2.f14438o == 4294967295L ? 8 : 0L;
        if (c1219u.f14438o == 4294967295L) {
            j3 += (long) 8;
        }
        if (c1219u3.f14438o == 4294967295L) {
            j3 += (long) 8;
        }
        C1216r c1216r = new C1216r();
        e(yVar, iQ3, new g(c1216r, j3, c1219u2, yVar, c1219u, c1219u3));
        if (j3 > 0 && !c1216r.f14435o) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strR2 = yVar.r(iQ4);
        String str = u.f6810p;
        return new f(z.n("/").d(strR), AbstractC1552n.E(strR, "/", false), strR2, c1219u.f14438o, c1219u2.f14438o, iQ, l, c1219u3.f14438o);
    }

    public static final void e(S5.y yVar, int i7, l5.e eVar) throws IOException {
        long j3 = i7;
        while (j3 != 0) {
            if (j3 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iQ = yVar.q() & 65535;
            long jQ = ((long) yVar.q()) & 65535;
            long j7 = j3 - ((long) 4);
            if (j7 < jQ) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            yVar.t(jQ);
            C0427g c0427g = yVar.f6823p;
            long j8 = c0427g.f6785p;
            eVar.invoke(Integer.valueOf(iQ), Long.valueOf(jQ));
            long j9 = (c0427g.f6785p + jQ) - j8;
            if (j9 < 0) {
                throw new IOException(n1.c.s(iQ, "unsupported zip: too many bytes processed for "));
            }
            if (j9 > 0) {
                c0427g.w(j9);
            }
            j3 = j7 - jQ;
        }
    }

    public static final B3.a f(S5.y yVar, B3.a aVar) throws IOException {
        C1220v c1220v = new C1220v();
        c1220v.f14439o = aVar != null ? (Long) aVar.f817g : null;
        C1220v c1220v2 = new C1220v();
        C1220v c1220v3 = new C1220v();
        int iJ = yVar.j();
        if (iJ != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iJ));
        }
        yVar.u(2L);
        short sQ = yVar.q();
        int i7 = sQ & 65535;
        if ((sQ & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i7));
        }
        yVar.u(18L);
        long jQ = ((long) yVar.q()) & 65535;
        int iQ = 65535 & yVar.q();
        yVar.u(jQ);
        if (aVar == null) {
            yVar.u(iQ);
            return null;
        }
        e(yVar, iQ, new h(yVar, c1220v, c1220v2, c1220v3, 0));
        return new B3.a(aVar.f812b, aVar.f813c, null, (Long) aVar.f815e, (Long) c1220v3.f14439o, (Long) c1220v.f14439o, (Long) c1220v2.f14439o);
    }

    public static final int g(B b7, int i7) {
        int i8;
        AbstractC1209k.f(b7, "<this>");
        int i9 = i7 + 1;
        int length = b7.f6759s.length;
        int[] iArr = b7.f6760t;
        AbstractC1209k.f(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        return i8 >= 0 ? i8 : ~i8;
    }
}
