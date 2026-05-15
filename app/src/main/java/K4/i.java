package K4;

import H2.C0196m;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class i extends x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4049a;

    public /* synthetic */ i(int i7) {
        this.f4049a = i7;
    }

    public static n c(R4.a aVar, int i7) {
        int iB = AbstractC1676i.b(i7);
        if (iB == 5) {
            return new r(aVar.C());
        }
        if (iB == 6) {
            return new r(new M4.i(aVar.C()));
        }
        if (iB == 7) {
            return new r(Boolean.valueOf(aVar.s()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(A0.e.O(i7)));
        }
        aVar.A();
        return p.f4065o;
    }

    public static void d(R4.b bVar, n nVar) {
        if (nVar == null || (nVar instanceof p)) {
            bVar.o();
            return;
        }
        boolean z6 = nVar instanceof r;
        if (z6) {
            if (!z6) {
                throw new IllegalStateException("Not a JSON Primitive: " + nVar);
            }
            r rVar = (r) nVar;
            Serializable serializable = rVar.f4067o;
            if (serializable instanceof Number) {
                bVar.u(rVar.a());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.y(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(rVar.b()));
                return;
            } else {
                bVar.w(rVar.b());
                return;
            }
        }
        boolean z7 = nVar instanceof m;
        if (z7) {
            bVar.c();
            if (!z7) {
                throw new IllegalStateException("Not a JSON Array: " + nVar);
            }
            Iterator it = ((m) nVar).f4064o.iterator();
            while (it.hasNext()) {
                d(bVar, (n) it.next());
            }
            bVar.h();
            return;
        }
        boolean z8 = nVar instanceof q;
        if (!z8) {
            throw new IllegalArgumentException("Couldn't write " + nVar.getClass());
        }
        bVar.d();
        if (!z8) {
            throw new IllegalStateException("Not a JSON Object: " + nVar);
        }
        Iterator it2 = ((M4.l) ((q) nVar).f4066o.entrySet()).iterator();
        while (((M4.k) it2).hasNext()) {
            M4.m mVarB = ((M4.k) it2).b();
            bVar.j((String) mVarB.getKey());
            d(bVar, (n) mVarB.getValue());
        }
        bVar.i();
    }

    @Override // K4.x
    public final Object a(R4.a aVar) {
        n mVar;
        n mVar2;
        boolean zS;
        switch (this.f4049a) {
            case 0:
                if (aVar.E() != 9) {
                    return Double.valueOf(aVar.t());
                }
                aVar.A();
                return null;
            case 1:
                if (aVar.E() != 9) {
                    return Float.valueOf((float) aVar.t());
                }
                aVar.A();
                return null;
            case 2:
                if (aVar.E() != 9) {
                    return Long.valueOf(aVar.w());
                }
                aVar.A();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.o()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.u()));
                    } catch (NumberFormatException e7) {
                        throw new o(e7);
                    }
                }
                aVar.h();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i7 = 0; i7 < size; i7++) {
                    atomicIntegerArray.set(i7, ((Integer) arrayList.get(i7)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.w());
                } catch (NumberFormatException e8) {
                    throw new o(e8);
                }
            case 5:
                if (aVar.E() != 9) {
                    return Float.valueOf((float) aVar.t());
                }
                aVar.A();
                return null;
            case 6:
                if (aVar.E() != 9) {
                    return Double.valueOf(aVar.t());
                }
                aVar.A();
                return null;
            case 7:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC = aVar.C();
                if (strC.length() == 1) {
                    return Character.valueOf(strC.charAt(0));
                }
                StringBuilder sbU = Z1.l.u("Expecting character, got: ", strC, "; at ");
                sbU.append(aVar.n(true));
                throw new o(sbU.toString());
            case 8:
                int iE = aVar.E();
                if (iE != 9) {
                    return iE == 8 ? Boolean.toString(aVar.s()) : aVar.C();
                }
                aVar.A();
                return null;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC2 = aVar.C();
                try {
                    return new BigDecimal(strC2);
                } catch (NumberFormatException e9) {
                    StringBuilder sbU2 = Z1.l.u("Failed parsing '", strC2, "' as BigDecimal; at path ");
                    sbU2.append(aVar.n(true));
                    throw new o(sbU2.toString(), e9);
                }
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC3 = aVar.C();
                try {
                    return new BigInteger(strC3);
                } catch (NumberFormatException e10) {
                    StringBuilder sbU3 = Z1.l.u("Failed parsing '", strC3, "' as BigInteger; at path ");
                    sbU3.append(aVar.n(true));
                    throw new o(sbU3.toString(), e10);
                }
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (aVar.E() != 9) {
                    return new M4.i(aVar.C());
                }
                aVar.A();
                return null;
            case 12:
                if (aVar.E() != 9) {
                    return new StringBuilder(aVar.C());
                }
                aVar.A();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (aVar.E() != 9) {
                    return new StringBuffer(aVar.C());
                }
                aVar.A();
                return null;
            case 15:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC4 = aVar.C();
                if ("null".equals(strC4)) {
                    return null;
                }
                return new URL(strC4);
            case 16:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                try {
                    String strC5 = aVar.C();
                    if ("null".equals(strC5)) {
                        return null;
                    }
                    return new URI(strC5);
                } catch (URISyntaxException e11) {
                    throw new o(e11);
                }
            case 17:
                if (aVar.E() != 9) {
                    return InetAddress.getByName(aVar.C());
                }
                aVar.A();
                return null;
            case 18:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                String strC6 = aVar.C();
                try {
                    return UUID.fromString(strC6);
                } catch (IllegalArgumentException e12) {
                    StringBuilder sbU4 = Z1.l.u("Failed parsing '", strC6, "' as UUID; at path ");
                    sbU4.append(aVar.n(true));
                    throw new o(sbU4.toString(), e12);
                }
            case 19:
                String strC7 = aVar.C();
                try {
                    return Currency.getInstance(strC7);
                } catch (IllegalArgumentException e13) {
                    StringBuilder sbU5 = Z1.l.u("Failed parsing '", strC7, "' as Currency; at path ");
                    sbU5.append(aVar.n(true));
                    throw new o(sbU5.toString(), e13);
                }
            case BuildConfig.API_VERSION /* 20 */:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                aVar.c();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (aVar.E() != 4) {
                    String strY = aVar.y();
                    int iU = aVar.u();
                    if ("year".equals(strY)) {
                        i8 = iU;
                    } else if ("month".equals(strY)) {
                        i9 = iU;
                    } else if ("dayOfMonth".equals(strY)) {
                        i10 = iU;
                    } else if ("hourOfDay".equals(strY)) {
                        i11 = iU;
                    } else if ("minute".equals(strY)) {
                        i12 = iU;
                    } else if ("second".equals(strY)) {
                        i13 = iU;
                    }
                }
                aVar.i();
                return new GregorianCalendar(i8, i9, i10, i11, i12, i13);
            case 21:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.C(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                int iE2 = aVar.E();
                int iB = AbstractC1676i.b(iE2);
                if (iB == 0) {
                    aVar.b();
                    mVar = new m();
                } else if (iB != 2) {
                    mVar = null;
                } else {
                    aVar.c();
                    mVar = new q();
                }
                if (mVar == null) {
                    return c(aVar, iE2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.o()) {
                        String strY2 = mVar instanceof q ? aVar.y() : null;
                        int iE3 = aVar.E();
                        int iB2 = AbstractC1676i.b(iE3);
                        if (iB2 == 0) {
                            aVar.b();
                            mVar2 = new m();
                        } else if (iB2 != 2) {
                            mVar2 = null;
                        } else {
                            aVar.c();
                            mVar2 = new q();
                        }
                        boolean z6 = mVar2 != null;
                        if (mVar2 == null) {
                            mVar2 = c(aVar, iE3);
                        }
                        if (mVar instanceof m) {
                            ((m) mVar).f4064o.add(mVar2);
                        } else {
                            ((q) mVar).f4066o.put(strY2, mVar2);
                        }
                        if (z6) {
                            arrayDeque.addLast(mVar);
                            mVar = mVar2;
                        }
                    } else {
                        if (mVar instanceof m) {
                            aVar.h();
                        } else {
                            aVar.i();
                        }
                        if (arrayDeque.isEmpty()) {
                            return mVar;
                        }
                        mVar = (n) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                aVar.b();
                int iE4 = aVar.E();
                int i14 = 0;
                while (iE4 != 2) {
                    int iB3 = AbstractC1676i.b(iE4);
                    if (iB3 == 5 || iB3 == 6) {
                        int iU2 = aVar.u();
                        if (iU2 == 0) {
                            zS = false;
                        } else {
                            if (iU2 != 1) {
                                StringBuilder sbV = n1.c.v(iU2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                sbV.append(aVar.n(true));
                                throw new o(sbV.toString());
                            }
                            zS = true;
                        }
                    } else {
                        if (iB3 != 7) {
                            throw new o("Invalid bitset value type: " + A0.e.O(iE4) + "; at path " + aVar.n(false));
                        }
                        zS = aVar.s();
                    }
                    if (zS) {
                        bitSet.set(i14);
                    }
                    i14++;
                    iE4 = aVar.E();
                }
                aVar.h();
                return bitSet;
            case 24:
                int iE5 = aVar.E();
                if (iE5 != 9) {
                    return iE5 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.C())) : Boolean.valueOf(aVar.s());
                }
                aVar.A();
                return null;
            case 25:
                if (aVar.E() != 9) {
                    return Boolean.valueOf(aVar.C());
                }
                aVar.A();
                return null;
            case 26:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                try {
                    int iU3 = aVar.u();
                    if (iU3 <= 255 && iU3 >= -128) {
                        return Byte.valueOf((byte) iU3);
                    }
                    StringBuilder sbV2 = n1.c.v(iU3, "Lossy conversion from ", " to byte; at path ");
                    sbV2.append(aVar.n(true));
                    throw new o(sbV2.toString());
                } catch (NumberFormatException e14) {
                    throw new o(e14);
                }
            case 27:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                try {
                    int iU4 = aVar.u();
                    if (iU4 <= 65535 && iU4 >= -32768) {
                        return Short.valueOf((short) iU4);
                    }
                    StringBuilder sbV3 = n1.c.v(iU4, "Lossy conversion from ", " to short; at path ");
                    sbV3.append(aVar.n(true));
                    throw new o(sbV3.toString());
                } catch (NumberFormatException e15) {
                    throw new o(e15);
                }
            case 28:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.u());
                } catch (NumberFormatException e16) {
                    throw new o(e16);
                }
            default:
                try {
                    return new AtomicInteger(aVar.u());
                } catch (NumberFormatException e17) {
                    throw new o(e17);
                }
        }
    }

    @Override // K4.x
    public final void b(R4.b bVar, Object obj) throws IOException {
        switch (this.f4049a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.o();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C0196m.a(dDoubleValue);
                bVar.s(dDoubleValue);
                return;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    bVar.o();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C0196m.a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                bVar.u(numberValueOf);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.w(number2.toString());
                    return;
                }
            case 3:
                bVar.c();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i7 = 0; i7 < length; i7++) {
                    bVar.t(r6.get(i7));
                }
                bVar.h();
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.t(number3.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    bVar.o();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                bVar.u(numberValueOf2);
                return;
            case 6:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.s(number4.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                bVar.w(ch == null ? null : String.valueOf(ch));
                return;
            case 8:
                bVar.w((String) obj);
                return;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                bVar.u((BigDecimal) obj);
                return;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                bVar.u((BigInteger) obj);
                return;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                bVar.u((M4.i) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                bVar.w(sb == null ? null : sb.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                bVar.w(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                bVar.w(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                bVar.w(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                bVar.w(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                bVar.w(uuid == null ? null : uuid.toString());
                return;
            case 19:
                bVar.w(((Currency) obj).getCurrencyCode());
                return;
            case BuildConfig.API_VERSION /* 20 */:
                if (((Calendar) obj) == null) {
                    bVar.o();
                    return;
                }
                bVar.d();
                bVar.j("year");
                bVar.t(r6.get(1));
                bVar.j("month");
                bVar.t(r6.get(2));
                bVar.j("dayOfMonth");
                bVar.t(r6.get(5));
                bVar.j("hourOfDay");
                bVar.t(r6.get(11));
                bVar.j("minute");
                bVar.t(r6.get(12));
                bVar.j("second");
                bVar.t(r6.get(13));
                bVar.i();
                return;
            case 21:
                Locale locale = (Locale) obj;
                bVar.w(locale == null ? null : locale.toString());
                return;
            case 22:
                d(bVar, (n) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                bVar.c();
                int length2 = bitSet.length();
                for (int i8 = 0; i8 < length2; i8++) {
                    bVar.t(bitSet.get(i8) ? 1L : 0L);
                }
                bVar.h();
                return;
            case 24:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.o();
                    return;
                }
                bVar.z();
                bVar.b();
                bVar.f6690o.write(bool.booleanValue() ? "true" : "false");
                return;
            case 25:
                Boolean bool2 = (Boolean) obj;
                bVar.w(bool2 == null ? "null" : bool2.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.t(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.t(r6.shortValue());
                    return;
                }
            case 28:
                if (((Number) obj) == null) {
                    bVar.o();
                    return;
                } else {
                    bVar.t(r6.intValue());
                    return;
                }
            default:
                bVar.t(((AtomicInteger) obj).get());
                return;
        }
    }
}
