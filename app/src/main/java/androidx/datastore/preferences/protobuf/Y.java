package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f9431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f9432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f9433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f9434d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f9431a = cls;
        f9432b = w(false);
        f9433c = w(true);
        f9434d = new g0();
    }

    public static void A(int i7, List list, F f7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0537j) f7.f9391a).G(i7, (C0533f) list.get(i8));
        }
    }

    public static void B(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                double dDoubleValue = ((Double) list.get(i8)).doubleValue();
                c0537j.getClass();
                c0537j.K(Double.doubleToRawLongBits(dDoubleValue), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 8;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.L(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void C(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.M(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iW = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iW += C0537j.w(((Integer) list.get(i9)).intValue());
        }
        c0537j.T(iW);
        while (i8 < list.size()) {
            c0537j.N(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void D(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.I(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 4;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.J(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void E(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.K(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 8;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.L(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void F(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                float fFloatValue = ((Float) list.get(i8)).floatValue();
                c0537j.getClass();
                c0537j.I(i7, Float.floatToRawIntBits(fFloatValue));
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 4;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.J(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void G(int i7, List list, F f7, X x6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            f7.b(i7, list.get(i8), x6);
        }
    }

    public static void H(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.M(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iW = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iW += C0537j.w(((Integer) list.get(i9)).intValue());
        }
        c0537j.T(iW);
        while (i8 < list.size()) {
            c0537j.N(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void I(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.U(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iA = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iA += C0537j.A(((Long) list.get(i9)).longValue());
        }
        c0537j.T(iA);
        while (i8 < list.size()) {
            c0537j.V(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void J(int i7, List list, F f7, X x6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0537j) f7.f9391a).O(i7, (AbstractC0528a) list.get(i8), x6);
        }
    }

    public static void K(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.I(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 4;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.J(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.K(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9 += 8;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.L(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void M(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0537j.S(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iZ = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = ((Integer) list.get(i9)).intValue();
            iZ += C0537j.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0537j.T(iZ);
        while (i8 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i8)).intValue();
            c0537j.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i8++;
        }
    }

    public static void N(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                c0537j.U((jLongValue >> 63) ^ (jLongValue << 1), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iA = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iA += C0537j.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0537j.T(iA);
        while (i8 < list.size()) {
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            c0537j.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i8++;
        }
    }

    public static void O(int i7, List list, F f7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        f7.getClass();
        boolean z6 = list instanceof A;
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.P(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        A a4 = (A) list;
        while (i8 < list.size()) {
            Object objL = a4.l(i8);
            if (objL instanceof String) {
                c0537j.P(i7, (String) objL);
            } else {
                c0537j.G(i7, (C0533f) objL);
            }
            i8++;
        }
    }

    public static void P(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.S(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iZ = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iZ += C0537j.z(((Integer) list.get(i9)).intValue());
        }
        c0537j.T(iZ);
        while (i8 < list.size()) {
            c0537j.T(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void Q(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.U(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int iA = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iA += C0537j.A(((Long) list.get(i9)).longValue());
        }
        c0537j.T(iA);
        while (i8 < list.size()) {
            c0537j.V(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C0537j.y(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iY += C0537j.s((C0533f) list.get(i8));
        }
        return iY;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iW += C0537j.w(((Integer) list.get(i7)).intValue());
        }
        return iW;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0537j.t(i7) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0537j.u(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iW += C0537j.w(((Integer) list.get(i7)).intValue());
        }
        return iW;
    }

    public static int j(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0537j.y(i7) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iA += C0537j.A(((Long) list.get(i7)).longValue());
        }
        return iA;
    }

    public static int l(int i7, List list, X x6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C0537j.y(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int iB = ((AbstractC0528a) list.get(i8)).b(x6);
            iY += C0537j.z(iB) + iB;
        }
        return iY;
    }

    public static int m(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Integer) list.get(i7)).intValue();
            iZ += C0537j.z((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iZ;
    }

    public static int o(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iA += C0537j.A((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iA;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = C0537j.y(i7) * size;
        if (!(list instanceof A)) {
            while (i8 < size) {
                Object obj = list.get(i8);
                iY = (obj instanceof C0533f ? C0537j.s((C0533f) obj) : C0537j.x((String) obj)) + iY;
                i8++;
            }
            return iY;
        }
        A a4 = (A) list;
        while (i8 < size) {
            Object objL = a4.l(i8);
            iY = (objL instanceof C0533f ? C0537j.s((C0533f) objL) : C0537j.x((String) objL)) + iY;
            i8++;
        }
        return iY;
    }

    public static int r(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iZ += C0537j.z(((Integer) list.get(i7)).intValue());
        }
        return iZ;
    }

    public static int t(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0537j.y(i7) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iA += C0537j.A(((Long) list.get(i7)).longValue());
        }
        return iA;
    }

    public static g0 w(boolean z6) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (g0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z6));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(g0 g0Var, AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2) {
        g0Var.getClass();
        f0 f0Var = abstractC0546t.unknownFields;
        f0 f0Var2 = abstractC0546t2.unknownFields;
        if (!f0Var2.equals(f0.f9463f)) {
            int i7 = f0Var.f9464a + f0Var2.f9464a;
            int[] iArrCopyOf = Arrays.copyOf(f0Var.f9465b, i7);
            System.arraycopy(f0Var2.f9465b, 0, iArrCopyOf, f0Var.f9464a, f0Var2.f9464a);
            Object[] objArrCopyOf = Arrays.copyOf(f0Var.f9466c, i7);
            System.arraycopy(f0Var2.f9466c, 0, objArrCopyOf, f0Var.f9464a, f0Var2.f9464a);
            f0Var = new f0(i7, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0546t.unknownFields = f0Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i7, List list, F f7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0537j c0537j = (C0537j) f7.f9391a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0537j.F(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        c0537j.R(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0537j.h;
            i9++;
        }
        c0537j.T(i9);
        while (i8 < list.size()) {
            c0537j.D(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static Object v(int i7, List list, Object obj, g0 g0Var) {
        return obj;
    }
}
