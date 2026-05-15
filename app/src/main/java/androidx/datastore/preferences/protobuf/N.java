package androidx.datastore.preferences.protobuf;

import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class N implements X {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f9402o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f9403p = o0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0546t f9408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9410g;
    public final int[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P f9413k;
    public final D l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f9414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final J f9415n;

    public N(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0546t abstractC0546t, boolean z6, int[] iArr2, int i9, int i10, P p7, D d4, g0 g0Var, C0540m c0540m, J j3) {
        this.f9404a = iArr;
        this.f9405b = objArr;
        this.f9406c = i7;
        this.f9407d = i8;
        this.f9409f = abstractC0546t instanceof AbstractC0546t;
        this.f9410g = z6;
        this.h = iArr2;
        this.f9411i = i9;
        this.f9412j = i10;
        this.f9413k = p7;
        this.l = d4;
        this.f9414m = g0Var;
        this.f9408e = abstractC0546t;
        this.f9415n = j3;
    }

    public static int A(long j3, Object obj) {
        return ((Integer) o0.f9505d.i(j3, obj)).intValue();
    }

    public static long B(long j3, Object obj) {
        return ((Long) o0.f9505d.i(j3, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbU = Z1.l.u("Field ", str, " for ");
            sbU.append(cls.getName());
            sbU.append(" not found. Known fields are ");
            sbU.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbU.toString());
        }
    }

    public static int K(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void O(int i7, Object obj, F f7) throws IOException {
        if (!(obj instanceof String)) {
            f7.a(i7, (C0533f) obj);
        } else {
            ((C0537j) f7.f9391a).P(i7, (String) obj);
        }
    }

    public static List s(AbstractC0528a abstractC0528a, long j3) {
        return (List) o0.f9505d.i(j3, abstractC0528a);
    }

    public static N x(W w7, P p7, D d4, g0 g0Var, C0540m c0540m, J j3) {
        if (w7 instanceof W) {
            return y(w7, p7, d4, g0Var, c0540m, j3);
        }
        w7.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.N y(androidx.datastore.preferences.protobuf.W r36, androidx.datastore.preferences.protobuf.P r37, androidx.datastore.preferences.protobuf.D r38, androidx.datastore.preferences.protobuf.g0 r39, androidx.datastore.preferences.protobuf.C0540m r40, androidx.datastore.preferences.protobuf.J r41) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.y(androidx.datastore.preferences.protobuf.W, androidx.datastore.preferences.protobuf.P, androidx.datastore.preferences.protobuf.D, androidx.datastore.preferences.protobuf.g0, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.J):androidx.datastore.preferences.protobuf.N");
    }

    public static long z(int i7) {
        return i7 & 1048575;
    }

    public final int C(int i7) {
        if (i7 >= this.f9406c && i7 <= this.f9407d) {
            int[] iArr = this.f9404a;
            int length = (iArr.length / 3) - 1;
            int i8 = 0;
            while (i8 <= length) {
                int i9 = (length + i8) >>> 1;
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                if (i7 == i11) {
                    return i10;
                }
                if (i7 < i11) {
                    length = i9 - 1;
                } else {
                    i8 = i9 + 1;
                }
            }
        }
        return -1;
    }

    public final void D(Object obj, long j3, C0535h c0535h, X x6, C0539l c0539l) throws C0549w {
        int iZ;
        List listC = this.l.c(j3, obj);
        int i7 = c0535h.f9479b;
        if ((i7 & 7) != 3) {
            throw C0550x.b();
        }
        do {
            listC.add(c0535h.G(x6, c0539l));
            C0534g c0534g = (C0534g) c0535h.f9482e;
            if (c0534g.c() || c0535h.f9481d != 0) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == i7);
        c0535h.f9481d = iZ;
    }

    public final void E(Object obj, int i7, C0535h c0535h, X x6, C0539l c0539l) throws C0549w {
        int iZ;
        List listC = this.l.c(i7 & 1048575, obj);
        int i8 = c0535h.f9479b;
        if ((i8 & 7) != 2) {
            throw C0550x.b();
        }
        do {
            listC.add(c0535h.O(x6, c0539l));
            C0534g c0534g = (C0534g) c0535h.f9482e;
            if (c0534g.c() || c0535h.f9481d != 0) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == i8);
        c0535h.f9481d = iZ;
    }

    public final void F(int i7, C0535h c0535h, Object obj) {
        if ((536870912 & i7) != 0) {
            o0.o(obj, i7 & 1048575, c0535h.f0());
        } else if (this.f9409f) {
            o0.o(obj, i7 & 1048575, c0535h.c0());
        } else {
            o0.o(obj, i7 & 1048575, c0535h.m());
        }
    }

    public final void G(int i7, C0535h c0535h, Object obj) throws C0549w {
        boolean z6 = (536870912 & i7) != 0;
        D d4 = this.l;
        if (z6) {
            c0535h.e0(d4.c(i7 & 1048575, obj), true);
        } else {
            c0535h.e0(d4.c(i7 & 1048575, obj), false);
        }
    }

    public final void I(int i7, Object obj) {
        if (this.f9410g) {
            return;
        }
        int i8 = this.f9404a[i7 + 2];
        long j3 = i8 & 1048575;
        o0.m(o0.f9505d.g(j3, obj) | (1 << (i8 >>> 20)), j3, obj);
    }

    public final void J(int i7, int i8, Object obj) {
        o0.m(i7, this.f9404a[i8 + 2] & 1048575, obj);
    }

    public final int L(int i7) {
        return this.f9404a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, F f7) throws IOException {
        int i7;
        int i8;
        boolean z6;
        int[] iArr = this.f9404a;
        int length = iArr.length;
        Unsafe unsafe = f9403p;
        int i9 = -1;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int iL = L(i11);
            int i12 = iArr[i11];
            int iK = K(iL);
            if (this.f9410g || iK > 17) {
                i7 = 1048575;
                i8 = 0;
            } else {
                int i13 = iArr[i11 + 2];
                i7 = 1048575;
                int i14 = i13 & 1048575;
                if (i14 != i9) {
                    i10 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i8 = 1 << (i13 >>> 20);
            }
            long j3 = iL & i7;
            switch (iK) {
                case 0:
                    if ((i8 & i10) != 0) {
                        double dE = o0.f9505d.e(j3, obj);
                        C0537j c0537j = (C0537j) f7.f9391a;
                        c0537j.getClass();
                        c0537j.K(Double.doubleToRawLongBits(dE), i12);
                    }
                    break;
                case 1:
                    if ((i8 & i10) != 0) {
                        float f8 = o0.f9505d.f(j3, obj);
                        C0537j c0537j2 = (C0537j) f7.f9391a;
                        c0537j2.getClass();
                        c0537j2.I(i12, Float.floatToRawIntBits(f8));
                    }
                    break;
                case 2:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).U(unsafe.getLong(obj, j3), i12);
                    }
                    break;
                case 3:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).U(unsafe.getLong(obj, j3), i12);
                    }
                    break;
                case 4:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).M(i12, unsafe.getInt(obj, j3));
                    }
                    break;
                case 5:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).K(unsafe.getLong(obj, j3), i12);
                    }
                    break;
                case 6:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).I(i12, unsafe.getInt(obj, j3));
                    }
                    break;
                case 7:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).F(i12, o0.f9505d.c(j3, obj));
                    }
                    break;
                case 8:
                    if ((i8 & i10) != 0) {
                        O(i12, unsafe.getObject(obj, j3), f7);
                    }
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).O(i12, (AbstractC0528a) unsafe.getObject(obj, j3), n(i11));
                    }
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if ((i8 & i10) != 0) {
                        f7.a(i12, (C0533f) unsafe.getObject(obj, j3));
                    }
                    break;
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).S(i12, unsafe.getInt(obj, j3));
                    }
                    break;
                case 12:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).M(i12, unsafe.getInt(obj, j3));
                    }
                    break;
                case 13:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).I(i12, unsafe.getInt(obj, j3));
                    }
                    break;
                case 14:
                    if ((i8 & i10) != 0) {
                        ((C0537j) f7.f9391a).K(unsafe.getLong(obj, j3), i12);
                    }
                    break;
                case 15:
                    if ((i8 & i10) != 0) {
                        int i15 = unsafe.getInt(obj, j3);
                        ((C0537j) f7.f9391a).S(i12, (i15 >> 31) ^ (i15 << 1));
                    }
                    break;
                case 16:
                    if ((i8 & i10) != 0) {
                        long j7 = unsafe.getLong(obj, j3);
                        ((C0537j) f7.f9391a).U((j7 << 1) ^ (j7 >> 63), i12);
                    }
                    break;
                case 17:
                    if ((i8 & i10) != 0) {
                        f7.b(i12, unsafe.getObject(obj, j3), n(i11));
                    }
                    break;
                case 18:
                    Y.B(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 19:
                    Y.F(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case BuildConfig.API_VERSION /* 20 */:
                    Y.I(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 21:
                    Y.Q(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 22:
                    Y.H(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 23:
                    Y.E(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 24:
                    Y.D(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 25:
                    Y.z(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 26:
                    Y.O(iArr[i11], (List) unsafe.getObject(obj, j3), f7);
                    break;
                case 27:
                    Y.J(iArr[i11], (List) unsafe.getObject(obj, j3), f7, n(i11));
                    break;
                case 28:
                    Y.A(iArr[i11], (List) unsafe.getObject(obj, j3), f7);
                    break;
                case 29:
                    z6 = false;
                    Y.P(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 30:
                    z6 = false;
                    Y.C(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 31:
                    z6 = false;
                    Y.K(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 32:
                    z6 = false;
                    Y.L(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 33:
                    z6 = false;
                    Y.M(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 34:
                    z6 = false;
                    Y.N(iArr[i11], (List) unsafe.getObject(obj, j3), f7, false);
                    break;
                case 35:
                    Y.B(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 36:
                    Y.F(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 37:
                    Y.I(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 38:
                    Y.Q(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 39:
                    Y.H(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 40:
                    Y.E(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 41:
                    Y.D(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 42:
                    Y.z(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 43:
                    Y.P(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 44:
                    Y.C(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 45:
                    Y.K(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 46:
                    Y.L(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 47:
                    Y.M(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 48:
                    Y.N(iArr[i11], (List) unsafe.getObject(obj, j3), f7, true);
                    break;
                case 49:
                    Y.G(iArr[i11], (List) unsafe.getObject(obj, j3), f7, n(i11));
                    break;
                case 50:
                    N(f7, i12, unsafe.getObject(obj, j3), i11);
                    break;
                case 51:
                    if (r(i12, i11, obj)) {
                        double dDoubleValue = ((Double) o0.f9505d.i(j3, obj)).doubleValue();
                        C0537j c0537j3 = (C0537j) f7.f9391a;
                        c0537j3.getClass();
                        c0537j3.K(Double.doubleToRawLongBits(dDoubleValue), i12);
                    }
                    break;
                case 52:
                    if (r(i12, i11, obj)) {
                        float fFloatValue = ((Float) o0.f9505d.i(j3, obj)).floatValue();
                        C0537j c0537j4 = (C0537j) f7.f9391a;
                        c0537j4.getClass();
                        c0537j4.I(i12, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).U(B(j3, obj), i12);
                    }
                    break;
                case 54:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).U(B(j3, obj), i12);
                    }
                    break;
                case 55:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).M(i12, A(j3, obj));
                    }
                    break;
                case 56:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).K(B(j3, obj), i12);
                    }
                    break;
                case 57:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).I(i12, A(j3, obj));
                    }
                    break;
                case 58:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).F(i12, ((Boolean) o0.f9505d.i(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i12, i11, obj)) {
                        O(i12, unsafe.getObject(obj, j3), f7);
                    }
                    break;
                case 60:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).O(i12, (AbstractC0528a) unsafe.getObject(obj, j3), n(i11));
                    }
                    break;
                case 61:
                    if (r(i12, i11, obj)) {
                        f7.a(i12, (C0533f) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).S(i12, A(j3, obj));
                    }
                    break;
                case 63:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).M(i12, A(j3, obj));
                    }
                    break;
                case 64:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).I(i12, A(j3, obj));
                    }
                    break;
                case 65:
                    if (r(i12, i11, obj)) {
                        ((C0537j) f7.f9391a).K(B(j3, obj), i12);
                    }
                    break;
                case 66:
                    if (r(i12, i11, obj)) {
                        int iA = A(j3, obj);
                        ((C0537j) f7.f9391a).S(i12, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (r(i12, i11, obj)) {
                        long jB = B(j3, obj);
                        ((C0537j) f7.f9391a).U((jB << 1) ^ (jB >> 63), i12);
                    }
                    break;
                case 68:
                    if (r(i12, i11, obj)) {
                        f7.b(i12, unsafe.getObject(obj, j3), n(i11));
                    }
                    break;
            }
        }
        this.f9414m.getClass();
        ((AbstractC0546t) obj).unknownFields.d(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(androidx.datastore.preferences.protobuf.F r23, int r24, java.lang.Object r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.N(androidx.datastore.preferences.protobuf.F, int, java.lang.Object, int):void");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void a(Object obj) {
        int[] iArr;
        int i7;
        int i8 = this.f9411i;
        while (true) {
            iArr = this.h;
            i7 = this.f9412j;
            if (i8 >= i7) {
                break;
            }
            long jL = L(iArr[i8]) & 1048575;
            Object objI = o0.f9505d.i(jL, obj);
            if (objI != null) {
                this.f9415n.getClass();
                ((I) objI).f9397o = false;
                o0.o(obj, jL, objI);
            }
            i8++;
        }
        int length = iArr.length;
        while (i7 < length) {
            this.l.a(iArr[i7], obj);
            i7++;
        }
        this.f9414m.getClass();
        ((AbstractC0546t) obj).unknownFields.f9468e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.b(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final Object c() {
        this.f9413k.getClass();
        return this.f9408e.d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void d(Object obj, F f7) throws IOException {
        f7.getClass();
        if (!this.f9410g) {
            M(obj, f7);
            return;
        }
        int[] iArr = this.f9404a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iL = L(i7);
            int i8 = iArr[i7];
            int iK = K(iL);
            C0537j c0537j = (C0537j) f7.f9391a;
            switch (iK) {
                case 0:
                    if (q(i7, obj)) {
                        double dE = o0.f9505d.e(iL & 1048575, obj);
                        c0537j.getClass();
                        c0537j.K(Double.doubleToRawLongBits(dE), i8);
                    }
                    break;
                case 1:
                    if (q(i7, obj)) {
                        float f8 = o0.f9505d.f(iL & 1048575, obj);
                        c0537j.getClass();
                        c0537j.I(i8, Float.floatToRawIntBits(f8));
                    }
                    break;
                case 2:
                    if (q(i7, obj)) {
                        c0537j.U(o0.f9505d.h(iL & 1048575, obj), i8);
                    }
                    break;
                case 3:
                    if (q(i7, obj)) {
                        c0537j.U(o0.f9505d.h(iL & 1048575, obj), i8);
                    }
                    break;
                case 4:
                    if (q(i7, obj)) {
                        c0537j.M(i8, o0.f9505d.g(iL & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i7, obj)) {
                        c0537j.K(o0.f9505d.h(iL & 1048575, obj), i8);
                    }
                    break;
                case 6:
                    if (q(i7, obj)) {
                        c0537j.I(i8, o0.f9505d.g(iL & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i7, obj)) {
                        c0537j.F(i8, o0.f9505d.c(iL & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i7, obj)) {
                        O(i8, o0.f9505d.i(iL & 1048575, obj), f7);
                    }
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    if (q(i7, obj)) {
                        c0537j.O(i8, (AbstractC0528a) o0.f9505d.i(iL & 1048575, obj), n(i7));
                    }
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if (q(i7, obj)) {
                        f7.a(i8, (C0533f) o0.f9505d.i(iL & 1048575, obj));
                    }
                    break;
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (q(i7, obj)) {
                        c0537j.S(i8, o0.f9505d.g(iL & 1048575, obj));
                    }
                    break;
                case 12:
                    if (q(i7, obj)) {
                        c0537j.M(i8, o0.f9505d.g(iL & 1048575, obj));
                    }
                    break;
                case 13:
                    if (q(i7, obj)) {
                        c0537j.I(i8, o0.f9505d.g(iL & 1048575, obj));
                    }
                    break;
                case 14:
                    if (q(i7, obj)) {
                        c0537j.K(o0.f9505d.h(iL & 1048575, obj), i8);
                    }
                    break;
                case 15:
                    if (q(i7, obj)) {
                        int iG = o0.f9505d.g(iL & 1048575, obj);
                        c0537j.S(i8, (iG >> 31) ^ (iG << 1));
                    }
                    break;
                case 16:
                    if (q(i7, obj)) {
                        long jH = o0.f9505d.h(iL & 1048575, obj);
                        c0537j.U((jH >> 63) ^ (jH << 1), i8);
                    }
                    break;
                case 17:
                    if (q(i7, obj)) {
                        f7.b(i8, o0.f9505d.i(iL & 1048575, obj), n(i7));
                    }
                    break;
                case 18:
                    Y.B(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 19:
                    Y.F(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case BuildConfig.API_VERSION /* 20 */:
                    Y.I(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 21:
                    Y.Q(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 22:
                    Y.H(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 23:
                    Y.E(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 24:
                    Y.D(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 25:
                    Y.z(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 26:
                    Y.O(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7);
                    break;
                case 27:
                    Y.J(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, n(i7));
                    break;
                case 28:
                    Y.A(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7);
                    break;
                case 29:
                    Y.P(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 30:
                    Y.C(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 31:
                    Y.K(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 32:
                    Y.L(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 33:
                    Y.M(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 34:
                    Y.N(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, false);
                    break;
                case 35:
                    Y.B(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 36:
                    Y.F(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 37:
                    Y.I(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 38:
                    Y.Q(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 39:
                    Y.H(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 40:
                    Y.E(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 41:
                    Y.D(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 42:
                    Y.z(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 43:
                    Y.P(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 44:
                    Y.C(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 45:
                    Y.K(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 46:
                    Y.L(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 47:
                    Y.M(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 48:
                    Y.N(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, true);
                    break;
                case 49:
                    Y.G(iArr[i7], (List) o0.f9505d.i(iL & 1048575, obj), f7, n(i7));
                    break;
                case 50:
                    N(f7, i8, o0.f9505d.i(iL & 1048575, obj), i7);
                    break;
                case 51:
                    if (r(i8, i7, obj)) {
                        double dDoubleValue = ((Double) o0.f9505d.i(iL & 1048575, obj)).doubleValue();
                        c0537j.getClass();
                        c0537j.K(Double.doubleToRawLongBits(dDoubleValue), i8);
                    }
                    break;
                case 52:
                    if (r(i8, i7, obj)) {
                        float fFloatValue = ((Float) o0.f9505d.i(iL & 1048575, obj)).floatValue();
                        c0537j.getClass();
                        c0537j.I(i8, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(i8, i7, obj)) {
                        c0537j.U(B(iL & 1048575, obj), i8);
                    }
                    break;
                case 54:
                    if (r(i8, i7, obj)) {
                        c0537j.U(B(iL & 1048575, obj), i8);
                    }
                    break;
                case 55:
                    if (r(i8, i7, obj)) {
                        c0537j.M(i8, A(iL & 1048575, obj));
                    }
                    break;
                case 56:
                    if (r(i8, i7, obj)) {
                        c0537j.K(B(iL & 1048575, obj), i8);
                    }
                    break;
                case 57:
                    if (r(i8, i7, obj)) {
                        c0537j.I(i8, A(iL & 1048575, obj));
                    }
                    break;
                case 58:
                    if (r(i8, i7, obj)) {
                        c0537j.F(i8, ((Boolean) o0.f9505d.i(iL & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i8, i7, obj)) {
                        O(i8, o0.f9505d.i(iL & 1048575, obj), f7);
                    }
                    break;
                case 60:
                    if (r(i8, i7, obj)) {
                        c0537j.O(i8, (AbstractC0528a) o0.f9505d.i(iL & 1048575, obj), n(i7));
                    }
                    break;
                case 61:
                    if (r(i8, i7, obj)) {
                        f7.a(i8, (C0533f) o0.f9505d.i(iL & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(i8, i7, obj)) {
                        c0537j.S(i8, A(iL & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(i8, i7, obj)) {
                        c0537j.M(i8, A(iL & 1048575, obj));
                    }
                    break;
                case 64:
                    if (r(i8, i7, obj)) {
                        c0537j.I(i8, A(iL & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(i8, i7, obj)) {
                        c0537j.K(B(iL & 1048575, obj), i8);
                    }
                    break;
                case 66:
                    if (r(i8, i7, obj)) {
                        int iA = A(iL & 1048575, obj);
                        c0537j.S(i8, (iA >> 31) ^ (iA << 1));
                    }
                    break;
                case 67:
                    if (r(i8, i7, obj)) {
                        long jB = B(iL & 1048575, obj);
                        c0537j.U((jB >> 63) ^ (jB << 1), i8);
                    }
                    break;
                case 68:
                    if (r(i8, i7, obj)) {
                        f7.b(i8, o0.f9505d.i(iL & 1048575, obj), n(i7));
                    }
                    break;
            }
        }
        this.f9414m.getClass();
        ((AbstractC0546t) obj).unknownFields.d(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0546t r12) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.e(androidx.datastore.preferences.protobuf.t):int");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final int f(AbstractC0528a abstractC0528a) {
        return this.f9410g ? p(abstractC0528a) : o(abstractC0528a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.datastore.preferences.protobuf.AbstractC0546t r12, androidx.datastore.preferences.protobuf.AbstractC0546t r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.g(androidx.datastore.preferences.protobuf.t, androidx.datastore.preferences.protobuf.t):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final void h(Object obj, C0535h c0535h, C0539l c0539l) throws Throwable {
        c0539l.getClass();
        t(this.f9414m, obj, c0535h, c0539l);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(androidx.datastore.preferences.protobuf.AbstractC0546t r11, androidx.datastore.preferences.protobuf.AbstractC0546t r12) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.i(androidx.datastore.preferences.protobuf.t, androidx.datastore.preferences.protobuf.t):void");
    }

    public final boolean j(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2, int i7) {
        return q(i7, abstractC0546t) == q(i7, abstractC0546t2);
    }

    public final void k(Object obj, int i7, Object obj2) {
        int i8 = this.f9404a[i7];
        if (o0.f9505d.i(L(i7) & 1048575, obj) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.f9405b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i7) {
        return this.f9405b[(i7 / 3) * 2];
    }

    public final X n(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f9405b;
        X x6 = (X) objArr[i8];
        if (x6 != null) {
            return x6;
        }
        X xA = U.f9421c.a((Class) objArr[i8 + 1]);
        objArr[i8] = xA;
        return xA;
    }

    public final int o(AbstractC0528a abstractC0528a) {
        int i7;
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iV;
        Unsafe unsafe = f9403p;
        int i8 = -1;
        int i9 = 0;
        int iH = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f9404a;
            if (i9 >= iArr.length) {
                this.f9414m.getClass();
                return ((AbstractC0546t) abstractC0528a).unknownFields.a() + iH;
            }
            int iL = L(i9);
            int i11 = iArr[i9];
            int iK = K(iL);
            if (iK <= 17) {
                int i12 = iArr[i9 + 2];
                int i13 = i12 & 1048575;
                i7 = 1 << (i12 >>> 20);
                if (i13 != i8) {
                    i10 = unsafe.getInt(abstractC0528a, i13);
                    i8 = i13;
                }
            } else {
                i7 = 0;
            }
            long j3 = iL & 1048575;
            switch (iK) {
                case 0:
                    if ((i7 & i10) != 0) {
                        iH = Z1.l.h(i11, 8, iH);
                    }
                    break;
                case 1:
                    if ((i10 & i7) != 0) {
                        iH = Z1.l.h(i11, 4, iH);
                    }
                    break;
                case 2:
                    if ((i10 & i7) != 0) {
                        long j7 = unsafe.getLong(abstractC0528a, j3);
                        iY = C0537j.y(i11);
                        iA = C0537j.A(j7);
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 3:
                    if ((i10 & i7) != 0) {
                        long j8 = unsafe.getLong(abstractC0528a, j3);
                        iY = C0537j.y(i11);
                        iA = C0537j.A(j8);
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 4:
                    if ((i10 & i7) != 0) {
                        int i14 = unsafe.getInt(abstractC0528a, j3);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.w(i14);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 5:
                    if ((i10 & i7) != 0) {
                        iU = C0537j.u(i11);
                        iH += iU;
                    }
                    break;
                case 6:
                    if ((i10 & i7) != 0) {
                        iU = C0537j.t(i11);
                        iH += iU;
                    }
                    break;
                case 7:
                    if ((i10 & i7) != 0) {
                        iH = Z1.l.h(i11, 1, iH);
                    }
                    break;
                case 8:
                    if ((i10 & i7) != 0) {
                        Object object = unsafe.getObject(abstractC0528a, j3);
                        if (object instanceof C0533f) {
                            iR = C0537j.r(i11, (C0533f) object);
                            iH = iR + iH;
                        } else {
                            iY3 = C0537j.y(i11);
                            iX = C0537j.x((String) object);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    if ((i10 & i7) != 0) {
                        Object object2 = unsafe.getObject(abstractC0528a, j3);
                        X xN = n(i9);
                        Class cls = Y.f9431a;
                        int iY5 = C0537j.y(i11);
                        int iB = ((AbstractC0528a) object2).b(xN);
                        iH = Z1.l.i(iB, iB, iY5, iH);
                    }
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if ((i10 & i7) != 0) {
                        iU = C0537j.r(i11, (C0533f) unsafe.getObject(abstractC0528a, j3));
                        iH += iU;
                    }
                    break;
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if ((i10 & i7) != 0) {
                        int i15 = unsafe.getInt(abstractC0528a, j3);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.z(i15);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 12:
                    if ((i10 & i7) != 0) {
                        int i16 = unsafe.getInt(abstractC0528a, j3);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.w(i16);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 13:
                    if ((i10 & i7) != 0) {
                        iH = Z1.l.h(i11, 4, iH);
                    }
                    break;
                case 14:
                    if ((i7 & i10) != 0) {
                        iH = Z1.l.h(i11, 8, iH);
                    }
                    break;
                case 15:
                    if ((i10 & i7) != 0) {
                        int i17 = unsafe.getInt(abstractC0528a, j3);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.z((i17 >> 31) ^ (i17 << 1));
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 16:
                    if ((i10 & i7) != 0) {
                        long j9 = unsafe.getLong(abstractC0528a, j3);
                        iY = C0537j.y(i11);
                        iA = C0537j.A((j9 >> 63) ^ (j9 << 1));
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 17:
                    if ((i10 & i7) != 0) {
                        iU = C0537j.v(i11, (AbstractC0528a) unsafe.getObject(abstractC0528a, j3), n(i9));
                        iH += iU;
                    }
                    break;
                case 18:
                    iU = Y.f(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 19:
                    iU = Y.d(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case BuildConfig.API_VERSION /* 20 */:
                    iU = Y.j(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 21:
                    iU = Y.t(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 22:
                    iU = Y.h(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 23:
                    iU = Y.f(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 24:
                    iU = Y.d(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC0528a, j3);
                    Class cls2 = Y.f9431a;
                    int size = list.size();
                    iY4 = size == 0 ? 0 : (C0537j.y(i11) + 1) * size;
                    iH += iY4;
                    break;
                case 26:
                    iU = Y.q(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 27:
                    iU = Y.l(i11, (List) unsafe.getObject(abstractC0528a, j3), n(i9));
                    iH += iU;
                    break;
                case 28:
                    iU = Y.a(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 29:
                    iU = Y.r(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 30:
                    iU = Y.b(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 31:
                    iU = Y.d(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 32:
                    iU = Y.f(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 33:
                    iU = Y.m(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 34:
                    iU = Y.o(i11, (List) unsafe.getObject(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 35:
                    int iG = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG > 0) {
                        iH = Z1.l.i(iG, C0537j.y(i11), iG, iH);
                    }
                    break;
                case 36:
                    int iE = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE > 0) {
                        iH = Z1.l.i(iE, C0537j.y(i11), iE, iH);
                    }
                    break;
                case 37:
                    int iK2 = Y.k((List) unsafe.getObject(abstractC0528a, j3));
                    if (iK2 > 0) {
                        iH = Z1.l.i(iK2, C0537j.y(i11), iK2, iH);
                    }
                    break;
                case 38:
                    int iU2 = Y.u((List) unsafe.getObject(abstractC0528a, j3));
                    if (iU2 > 0) {
                        iH = Z1.l.i(iU2, C0537j.y(i11), iU2, iH);
                    }
                    break;
                case 39:
                    int i18 = Y.i((List) unsafe.getObject(abstractC0528a, j3));
                    if (i18 > 0) {
                        iH = Z1.l.i(i18, C0537j.y(i11), i18, iH);
                    }
                    break;
                case 40:
                    int iG2 = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG2 > 0) {
                        iH = Z1.l.i(iG2, C0537j.y(i11), iG2, iH);
                    }
                    break;
                case 41:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE2 > 0) {
                        iH = Z1.l.i(iE2, C0537j.y(i11), iE2, iH);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC0528a, j3);
                    Class cls3 = Y.f9431a;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        iH = Z1.l.i(size2, C0537j.y(i11), size2, iH);
                    }
                    break;
                case 43:
                    int iS = Y.s((List) unsafe.getObject(abstractC0528a, j3));
                    if (iS > 0) {
                        iH = Z1.l.i(iS, C0537j.y(i11), iS, iH);
                    }
                    break;
                case 44:
                    int iC = Y.c((List) unsafe.getObject(abstractC0528a, j3));
                    if (iC > 0) {
                        iH = Z1.l.i(iC, C0537j.y(i11), iC, iH);
                    }
                    break;
                case 45:
                    int iE3 = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE3 > 0) {
                        iH = Z1.l.i(iE3, C0537j.y(i11), iE3, iH);
                    }
                    break;
                case 46:
                    int iG3 = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG3 > 0) {
                        iH = Z1.l.i(iG3, C0537j.y(i11), iG3, iH);
                    }
                    break;
                case 47:
                    int iN = Y.n((List) unsafe.getObject(abstractC0528a, j3));
                    if (iN > 0) {
                        iH = Z1.l.i(iN, C0537j.y(i11), iN, iH);
                    }
                    break;
                case 48:
                    int iP = Y.p((List) unsafe.getObject(abstractC0528a, j3));
                    if (iP > 0) {
                        iH = Z1.l.i(iP, C0537j.y(i11), iP, iH);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC0528a, j3);
                    X xN2 = n(i9);
                    Class cls4 = Y.f9431a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i19 = 0; i19 < size3; i19++) {
                            iV += C0537j.v(i11, (AbstractC0528a) list3.get(i19), xN2);
                        }
                    }
                    iH += iV;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0528a, j3);
                    Object objM = m(i9);
                    this.f9415n.getClass();
                    iU = J.a(object3, i11, objM);
                    iH += iU;
                    break;
                case 51:
                    if (r(i11, i9, abstractC0528a)) {
                        iH = Z1.l.h(i11, 8, iH);
                    }
                    break;
                case 52:
                    if (r(i11, i9, abstractC0528a)) {
                        iH = Z1.l.h(i11, 4, iH);
                    }
                    break;
                case 53:
                    if (r(i11, i9, abstractC0528a)) {
                        long jB = B(j3, abstractC0528a);
                        iY = C0537j.y(i11);
                        iA = C0537j.A(jB);
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 54:
                    if (r(i11, i9, abstractC0528a)) {
                        long jB2 = B(j3, abstractC0528a);
                        iY = C0537j.y(i11);
                        iA = C0537j.A(jB2);
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 55:
                    if (r(i11, i9, abstractC0528a)) {
                        int iA2 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.w(iA2);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 56:
                    if (r(i11, i9, abstractC0528a)) {
                        iU = C0537j.u(i11);
                        iH += iU;
                    }
                    break;
                case 57:
                    if (r(i11, i9, abstractC0528a)) {
                        iU = C0537j.t(i11);
                        iH += iU;
                    }
                    break;
                case 58:
                    if (r(i11, i9, abstractC0528a)) {
                        iH = Z1.l.h(i11, 1, iH);
                    }
                    break;
                case 59:
                    if (r(i11, i9, abstractC0528a)) {
                        Object object4 = unsafe.getObject(abstractC0528a, j3);
                        if (object4 instanceof C0533f) {
                            iR = C0537j.r(i11, (C0533f) object4);
                            iH = iR + iH;
                        } else {
                            iY3 = C0537j.y(i11);
                            iX = C0537j.x((String) object4);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                    break;
                case 60:
                    if (r(i11, i9, abstractC0528a)) {
                        Object object5 = unsafe.getObject(abstractC0528a, j3);
                        X xN3 = n(i9);
                        Class cls5 = Y.f9431a;
                        int iY6 = C0537j.y(i11);
                        int iB2 = ((AbstractC0528a) object5).b(xN3);
                        iH = Z1.l.i(iB2, iB2, iY6, iH);
                    }
                    break;
                case 61:
                    if (r(i11, i9, abstractC0528a)) {
                        iU = C0537j.r(i11, (C0533f) unsafe.getObject(abstractC0528a, j3));
                        iH += iU;
                    }
                    break;
                case 62:
                    if (r(i11, i9, abstractC0528a)) {
                        int iA3 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.z(iA3);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 63:
                    if (r(i11, i9, abstractC0528a)) {
                        int iA4 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.w(iA4);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 64:
                    if (r(i11, i9, abstractC0528a)) {
                        iH = Z1.l.h(i11, 4, iH);
                    }
                    break;
                case 65:
                    if (r(i11, i9, abstractC0528a)) {
                        iH = Z1.l.h(i11, 8, iH);
                    }
                    break;
                case 66:
                    if (r(i11, i9, abstractC0528a)) {
                        int iA5 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i11);
                        iW = C0537j.z((iA5 >> 31) ^ (iA5 << 1));
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 67:
                    if (r(i11, i9, abstractC0528a)) {
                        long jB3 = B(j3, abstractC0528a);
                        iY = C0537j.y(i11);
                        iA = C0537j.A((jB3 >> 63) ^ (jB3 << 1));
                        iY4 = iA + iY;
                        iH += iY4;
                    }
                    break;
                case 68:
                    if (r(i11, i9, abstractC0528a)) {
                        iU = C0537j.v(i11, (AbstractC0528a) unsafe.getObject(abstractC0528a, j3), n(i9));
                        iH += iU;
                    }
                    break;
            }
            i9 += 3;
        }
    }

    public final int p(AbstractC0528a abstractC0528a) {
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iA2;
        int iV;
        Unsafe unsafe = f9403p;
        int i7 = 0;
        int iH = 0;
        while (true) {
            int[] iArr = this.f9404a;
            if (i7 >= iArr.length) {
                this.f9414m.getClass();
                return ((AbstractC0546t) abstractC0528a).unknownFields.a() + iH;
            }
            int iL = L(i7);
            int iK = K(iL);
            int i8 = iArr[i7];
            long j3 = iL & 1048575;
            if (iK >= EnumC0543p.f9509p.f9513o && iK <= EnumC0543p.f9510q.f9513o) {
                int i9 = iArr[i7 + 2];
            }
            switch (iK) {
                case 0:
                    if (q(i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 8, iH);
                    }
                    break;
                case 1:
                    if (q(i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 4, iH);
                    }
                    break;
                case 2:
                    if (q(i7, abstractC0528a)) {
                        long jH = o0.f9505d.h(j3, abstractC0528a);
                        iY = C0537j.y(i8);
                        iA = C0537j.A(jH);
                        iU = iA + iY;
                        iH += iU;
                    }
                    break;
                case 3:
                    if (q(i7, abstractC0528a)) {
                        long jH2 = o0.f9505d.h(j3, abstractC0528a);
                        iY = C0537j.y(i8);
                        iA = C0537j.A(jH2);
                        iU = iA + iY;
                        iH += iU;
                    }
                    break;
                case 4:
                    if (q(i7, abstractC0528a)) {
                        int iG = o0.f9505d.g(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.w(iG);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 5:
                    if (q(i7, abstractC0528a)) {
                        iU = C0537j.u(i8);
                        iH += iU;
                    }
                    break;
                case 6:
                    if (q(i7, abstractC0528a)) {
                        iU = C0537j.t(i8);
                        iH += iU;
                    }
                    break;
                case 7:
                    if (q(i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 1, iH);
                    }
                    break;
                case 8:
                    if (q(i7, abstractC0528a)) {
                        Object objI = o0.f9505d.i(j3, abstractC0528a);
                        if (objI instanceof C0533f) {
                            iR = C0537j.r(i8, (C0533f) objI);
                            iH = iR + iH;
                        } else {
                            iY3 = C0537j.y(i8);
                            iX = C0537j.x((String) objI);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                    break;
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    if (q(i7, abstractC0528a)) {
                        Object objI2 = o0.f9505d.i(j3, abstractC0528a);
                        X xN = n(i7);
                        Class cls = Y.f9431a;
                        int iY5 = C0537j.y(i8);
                        int iB = ((AbstractC0528a) objI2).b(xN);
                        iH = Z1.l.i(iB, iB, iY5, iH);
                    }
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    if (q(i7, abstractC0528a)) {
                        iU = C0537j.r(i8, (C0533f) o0.f9505d.i(j3, abstractC0528a));
                        iH += iU;
                    }
                    break;
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (q(i7, abstractC0528a)) {
                        int iG2 = o0.f9505d.g(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.z(iG2);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 12:
                    if (q(i7, abstractC0528a)) {
                        int iG3 = o0.f9505d.g(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.w(iG3);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 13:
                    if (q(i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 4, iH);
                    }
                    break;
                case 14:
                    if (q(i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 8, iH);
                    }
                    break;
                case 15:
                    if (q(i7, abstractC0528a)) {
                        int iG4 = o0.f9505d.g(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.z((iG4 >> 31) ^ (iG4 << 1));
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 16:
                    if (q(i7, abstractC0528a)) {
                        long jH3 = o0.f9505d.h(j3, abstractC0528a);
                        iY4 = C0537j.y(i8);
                        iA2 = C0537j.A((jH3 >> 63) ^ (jH3 << 1));
                        iU = iA2 + iY4;
                        iH += iU;
                    }
                    break;
                case 17:
                    if (q(i7, abstractC0528a)) {
                        iU = C0537j.v(i8, (AbstractC0528a) o0.f9505d.i(j3, abstractC0528a), n(i7));
                        iH += iU;
                    }
                    break;
                case 18:
                    iU = Y.f(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 19:
                    iU = Y.d(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case BuildConfig.API_VERSION /* 20 */:
                    iU = Y.j(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 21:
                    iU = Y.t(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 22:
                    iU = Y.h(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 23:
                    iU = Y.f(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 24:
                    iU = Y.d(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 25:
                    List listS = s(abstractC0528a, j3);
                    Class cls2 = Y.f9431a;
                    int size = listS.size();
                    iH += size == 0 ? 0 : (C0537j.y(i8) + 1) * size;
                    break;
                case 26:
                    iU = Y.q(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 27:
                    iU = Y.l(i8, s(abstractC0528a, j3), n(i7));
                    iH += iU;
                    break;
                case 28:
                    iU = Y.a(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 29:
                    iU = Y.r(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 30:
                    iU = Y.b(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 31:
                    iU = Y.d(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 32:
                    iU = Y.f(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 33:
                    iU = Y.m(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 34:
                    iU = Y.o(i8, s(abstractC0528a, j3));
                    iH += iU;
                    break;
                case 35:
                    int iG5 = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG5 > 0) {
                        iH = Z1.l.i(iG5, C0537j.y(i8), iG5, iH);
                    }
                    break;
                case 36:
                    int iE = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE > 0) {
                        iH = Z1.l.i(iE, C0537j.y(i8), iE, iH);
                    }
                    break;
                case 37:
                    int iK2 = Y.k((List) unsafe.getObject(abstractC0528a, j3));
                    if (iK2 > 0) {
                        iH = Z1.l.i(iK2, C0537j.y(i8), iK2, iH);
                    }
                    break;
                case 38:
                    int iU2 = Y.u((List) unsafe.getObject(abstractC0528a, j3));
                    if (iU2 > 0) {
                        iH = Z1.l.i(iU2, C0537j.y(i8), iU2, iH);
                    }
                    break;
                case 39:
                    int i10 = Y.i((List) unsafe.getObject(abstractC0528a, j3));
                    if (i10 > 0) {
                        iH = Z1.l.i(i10, C0537j.y(i8), i10, iH);
                    }
                    break;
                case 40:
                    int iG6 = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG6 > 0) {
                        iH = Z1.l.i(iG6, C0537j.y(i8), iG6, iH);
                    }
                    break;
                case 41:
                    int iE2 = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE2 > 0) {
                        iH = Z1.l.i(iE2, C0537j.y(i8), iE2, iH);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(abstractC0528a, j3);
                    Class cls3 = Y.f9431a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        iH = Z1.l.i(size2, C0537j.y(i8), size2, iH);
                    }
                    break;
                case 43:
                    int iS = Y.s((List) unsafe.getObject(abstractC0528a, j3));
                    if (iS > 0) {
                        iH = Z1.l.i(iS, C0537j.y(i8), iS, iH);
                    }
                    break;
                case 44:
                    int iC = Y.c((List) unsafe.getObject(abstractC0528a, j3));
                    if (iC > 0) {
                        iH = Z1.l.i(iC, C0537j.y(i8), iC, iH);
                    }
                    break;
                case 45:
                    int iE3 = Y.e((List) unsafe.getObject(abstractC0528a, j3));
                    if (iE3 > 0) {
                        iH = Z1.l.i(iE3, C0537j.y(i8), iE3, iH);
                    }
                    break;
                case 46:
                    int iG7 = Y.g((List) unsafe.getObject(abstractC0528a, j3));
                    if (iG7 > 0) {
                        iH = Z1.l.i(iG7, C0537j.y(i8), iG7, iH);
                    }
                    break;
                case 47:
                    int iN = Y.n((List) unsafe.getObject(abstractC0528a, j3));
                    if (iN > 0) {
                        iH = Z1.l.i(iN, C0537j.y(i8), iN, iH);
                    }
                    break;
                case 48:
                    int iP = Y.p((List) unsafe.getObject(abstractC0528a, j3));
                    if (iP > 0) {
                        iH = Z1.l.i(iP, C0537j.y(i8), iP, iH);
                    }
                    break;
                case 49:
                    List listS2 = s(abstractC0528a, j3);
                    X xN2 = n(i7);
                    Class cls4 = Y.f9431a;
                    int size3 = listS2.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i11 = 0; i11 < size3; i11++) {
                            iV += C0537j.v(i8, (AbstractC0528a) listS2.get(i11), xN2);
                        }
                    }
                    iH += iV;
                    break;
                case 50:
                    Object objI3 = o0.f9505d.i(j3, abstractC0528a);
                    Object objM = m(i7);
                    this.f9415n.getClass();
                    iU = J.a(objI3, i8, objM);
                    iH += iU;
                    break;
                case 51:
                    if (r(i8, i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 8, iH);
                    }
                    break;
                case 52:
                    if (r(i8, i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 4, iH);
                    }
                    break;
                case 53:
                    if (r(i8, i7, abstractC0528a)) {
                        long jB = B(j3, abstractC0528a);
                        iY = C0537j.y(i8);
                        iA = C0537j.A(jB);
                        iU = iA + iY;
                        iH += iU;
                    }
                    break;
                case 54:
                    if (r(i8, i7, abstractC0528a)) {
                        long jB2 = B(j3, abstractC0528a);
                        iY = C0537j.y(i8);
                        iA = C0537j.A(jB2);
                        iU = iA + iY;
                        iH += iU;
                    }
                    break;
                case 55:
                    if (r(i8, i7, abstractC0528a)) {
                        int iA3 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.w(iA3);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 56:
                    if (r(i8, i7, abstractC0528a)) {
                        iU = C0537j.u(i8);
                        iH += iU;
                    }
                    break;
                case 57:
                    if (r(i8, i7, abstractC0528a)) {
                        iU = C0537j.t(i8);
                        iH += iU;
                    }
                    break;
                case 58:
                    if (r(i8, i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 1, iH);
                    }
                    break;
                case 59:
                    if (r(i8, i7, abstractC0528a)) {
                        Object objI4 = o0.f9505d.i(j3, abstractC0528a);
                        if (objI4 instanceof C0533f) {
                            iR = C0537j.r(i8, (C0533f) objI4);
                            iH = iR + iH;
                        } else {
                            iY3 = C0537j.y(i8);
                            iX = C0537j.x((String) objI4);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                    break;
                case 60:
                    if (r(i8, i7, abstractC0528a)) {
                        Object objI5 = o0.f9505d.i(j3, abstractC0528a);
                        X xN3 = n(i7);
                        Class cls5 = Y.f9431a;
                        int iY6 = C0537j.y(i8);
                        int iB2 = ((AbstractC0528a) objI5).b(xN3);
                        iH = Z1.l.i(iB2, iB2, iY6, iH);
                    }
                    break;
                case 61:
                    if (r(i8, i7, abstractC0528a)) {
                        iU = C0537j.r(i8, (C0533f) o0.f9505d.i(j3, abstractC0528a));
                        iH += iU;
                    }
                    break;
                case 62:
                    if (r(i8, i7, abstractC0528a)) {
                        int iA4 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.z(iA4);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 63:
                    if (r(i8, i7, abstractC0528a)) {
                        int iA5 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.w(iA5);
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 64:
                    if (r(i8, i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 4, iH);
                    }
                    break;
                case 65:
                    if (r(i8, i7, abstractC0528a)) {
                        iH = Z1.l.h(i8, 8, iH);
                    }
                    break;
                case 66:
                    if (r(i8, i7, abstractC0528a)) {
                        int iA6 = A(j3, abstractC0528a);
                        iY2 = C0537j.y(i8);
                        iW = C0537j.z((iA6 >> 31) ^ (iA6 << 1));
                        iU = iW + iY2;
                        iH += iU;
                    }
                    break;
                case 67:
                    if (r(i8, i7, abstractC0528a)) {
                        long jB3 = B(j3, abstractC0528a);
                        iY4 = C0537j.y(i8);
                        iA2 = C0537j.A((jB3 >> 63) ^ (jB3 << 1));
                        iU = iA2 + iY4;
                        iH += iU;
                    }
                    break;
                case 68:
                    if (r(i8, i7, abstractC0528a)) {
                        iU = C0537j.v(i8, (AbstractC0528a) o0.f9505d.i(j3, abstractC0528a), n(i7));
                        iH += iU;
                    }
                    break;
            }
            i7 += 3;
        }
    }

    public final boolean q(int i7, Object obj) {
        if (this.f9410g) {
            int iL = L(i7);
            long j3 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (o0.f9505d.e(j3, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (o0.f9505d.f(j3, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (o0.f9505d.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o0.f9505d.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o0.f9505d.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o0.f9505d.c(j3, obj);
                case 8:
                    Object objI = o0.f9505d.i(j3, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof C0533f) {
                        return !C0533f.f9459q.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                    if (o0.f9505d.i(j3, obj) == null) {
                        return false;
                    }
                    break;
                case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    return !C0533f.f9459q.equals(o0.f9505d.i(j3, obj));
                case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o0.f9505d.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o0.f9505d.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o0.f9505d.h(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o0.f9505d.i(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((o0.f9505d.g(r6 & 1048575, obj) & (1 << (this.f9404a[i7 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(int i7, int i8, Object obj) {
        return o0.f9505d.g((long) (this.f9404a[i8 + 2] & 1048575), obj) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        ((androidx.datastore.preferences.protobuf.AbstractC0546t) r2).unknownFields = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0609 A[Catch: all -> 0x04c5, TryCatch #2 {all -> 0x04c5, blocks: (B:160:0x0604, B:162:0x0609, B:164:0x0610, B:166:0x0617, B:125:0x045e, B:126:0x046a, B:127:0x0480, B:128:0x0496, B:129:0x04ac, B:132:0x04c8, B:133:0x04de, B:134:0x04f4, B:136:0x0500, B:137:0x051f, B:138:0x0533, B:139:0x0541, B:140:0x0559, B:141:0x056f, B:142:0x0585, B:143:0x059b, B:144:0x05b1, B:145:0x05c7, B:146:0x05de, B:152:0x05f5), top: B:184:0x0604 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x063a A[LOOP:3: B:174:0x0638->B:175:0x063a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x061d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(androidx.datastore.preferences.protobuf.g0 r17, java.lang.Object r18, androidx.datastore.preferences.protobuf.C0535h r19, androidx.datastore.preferences.protobuf.C0539l r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.t(androidx.datastore.preferences.protobuf.g0, java.lang.Object, androidx.datastore.preferences.protobuf.h, androidx.datastore.preferences.protobuf.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0539l r12, androidx.datastore.preferences.protobuf.C0535h r13) throws androidx.datastore.preferences.protobuf.C0549w {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.n0 r10 = androidx.datastore.preferences.protobuf.o0.f9505d
            java.lang.Object r10 = r10.i(r0, r9)
            androidx.datastore.preferences.protobuf.J r2 = r8.f9415n
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.I r10 = androidx.datastore.preferences.protobuf.I.f9396p
            androidx.datastore.preferences.protobuf.I r10 = r10.c()
            androidx.datastore.preferences.protobuf.o0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.I r3 = (androidx.datastore.preferences.protobuf.I) r3
            boolean r3 = r3.f9397o
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.I r3 = androidx.datastore.preferences.protobuf.I.f9396p
            androidx.datastore.preferences.protobuf.I r3 = r3.c()
            androidx.datastore.preferences.protobuf.J.b(r3, r10)
            androidx.datastore.preferences.protobuf.o0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.I r10 = (androidx.datastore.preferences.protobuf.I) r10
            androidx.datastore.preferences.protobuf.H r11 = (androidx.datastore.preferences.protobuf.H) r11
            androidx.datastore.preferences.protobuf.G r9 = r11.f9395a
            r11 = 2
            r13.q0(r11)
            java.lang.Object r0 = r13.f9482e
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0534g) r0
            int r1 = r0.A()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            Q1.i r3 = r9.f9394c
            r4 = r3
        L55:
            int r5 = r13.d()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.r0()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.x r5 = new androidx.datastore.preferences.protobuf.x     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.u0 r5 = r9.f9393b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            java.lang.Object r4 = r13.w(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.s0 r5 = r9.f9392a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            r6 = 0
            java.lang.Object r2 = r13.w(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0549w -> L8e
            goto L55
        L8e:
            boolean r5 = r13.r0()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.x r9 = new androidx.datastore.preferences.protobuf.x     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.d(r1)
            return
        La2:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.u(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.l, androidx.datastore.preferences.protobuf.h):void");
    }

    public final void v(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2, int i7) {
        long jL = L(i7) & 1048575;
        if (q(i7, abstractC0546t2)) {
            n0 n0Var = o0.f9505d;
            Object objI = n0Var.i(jL, abstractC0546t);
            Object objI2 = n0Var.i(jL, abstractC0546t2);
            if (objI != null && objI2 != null) {
                o0.o(abstractC0546t, jL, AbstractC0548v.c(objI, objI2));
                I(i7, abstractC0546t);
            } else if (objI2 != null) {
                o0.o(abstractC0546t, jL, objI2);
                I(i7, abstractC0546t);
            }
        }
    }

    public final void w(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2, int i7) {
        int iL = L(i7);
        int i8 = this.f9404a[i7];
        long j3 = iL & 1048575;
        if (r(i8, i7, abstractC0546t2)) {
            n0 n0Var = o0.f9505d;
            Object objI = n0Var.i(j3, abstractC0546t);
            Object objI2 = n0Var.i(j3, abstractC0546t2);
            if (objI != null && objI2 != null) {
                o0.o(abstractC0546t, j3, AbstractC0548v.c(objI, objI2));
                J(i8, i7, abstractC0546t);
            } else if (objI2 != null) {
                o0.o(abstractC0546t, j3, objI2);
                J(i8, i7, abstractC0546t);
            }
        }
    }
}
