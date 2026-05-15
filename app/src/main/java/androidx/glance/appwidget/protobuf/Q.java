package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f9591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f9592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f9593c;

    static {
        Class<?> cls;
        Class<?> cls2;
        M m7 = M.f9581c;
        U u7 = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9591a = cls;
        try {
            M m8 = M.f9581c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                u7 = (U) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f9592b = u7;
        f9593c = new U();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK0 += C0561i.k0(((Integer) list.get(i7)).intValue());
        }
        return iK0;
    }

    public static int b(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0561i.i0(i7) + 4) * size;
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0561i.i0(i7) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK0 += C0561i.k0(((Integer) list.get(i7)).intValue());
        }
        return iK0;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK0 += C0561i.k0(((Long) list.get(i7)).longValue());
        }
        return iK0;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Integer) list.get(i7)).intValue();
            iJ0 += C0561i.j0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iJ0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iK0 += C0561i.k0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iK0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iJ0 += C0561i.j0(((Integer) list.get(i7)).intValue());
        }
        return iJ0;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iK0 += C0561i.k0(((Long) list.get(i7)).longValue());
        }
        return iK0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(U u7, Object obj, Object obj2) {
        u7.getClass();
        r rVar = (r) obj;
        T t7 = rVar.unknownFields;
        T t8 = ((r) obj2).unknownFields;
        T t9 = T.f9594f;
        if (!t9.equals(t8)) {
            if (t9.equals(t7)) {
                int i7 = t7.f9595a + t8.f9595a;
                int[] iArrCopyOf = Arrays.copyOf(t7.f9596b, i7);
                System.arraycopy(t8.f9596b, 0, iArrCopyOf, t7.f9595a, t8.f9595a);
                Object[] objArrCopyOf = Arrays.copyOf(t7.f9597c, i7);
                System.arraycopy(t8.f9597c, 0, objArrCopyOf, t7.f9595a, t8.f9595a);
                t7 = new T(i7, iArrCopyOf, objArrCopyOf, true);
            } else {
                t7.getClass();
                if (!t8.equals(t9)) {
                    if (!t7.f9599e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = t7.f9595a + t8.f9595a;
                    t7.a(i8);
                    System.arraycopy(t8.f9596b, 0, t7.f9596b, t7.f9595a, t8.f9595a);
                    System.arraycopy(t8.f9597c, 0, t7.f9597c, t7.f9595a, t8.f9595a);
                    t7.f9595a = i8;
                }
            }
        }
        rVar.unknownFields = t7;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.o0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9++;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            byte b8 = ((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0;
            if (c0561i.f9640f == c0561i.f9639e) {
                c0561i.l0();
            }
            int i11 = c0561i.f9640f;
            c0561i.f9640f = i11 + 1;
            c0561i.f9638d[i11] = b8;
            i8++;
        }
    }

    public static void n(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                double dDoubleValue = ((Double) list.get(i8)).doubleValue();
                c0561i.getClass();
                c0561i.s0(Double.doubleToRawLongBits(dDoubleValue), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 8;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.t0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void o(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.u0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iK0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK0 += C0561i.k0(((Integer) list.get(i9)).intValue());
        }
        c0561i.A0(iK0);
        while (i8 < list.size()) {
            c0561i.v0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void p(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.q0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 4;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.r0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void q(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.s0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 8;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.t0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void r(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                float fFloatValue = ((Float) list.get(i8)).floatValue();
                c0561i.getClass();
                c0561i.q0(i7, Float.floatToRawIntBits(fFloatValue));
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 4;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.r0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void s(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.u0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iK0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK0 += C0561i.k0(((Integer) list.get(i9)).intValue());
        }
        c0561i.A0(iK0);
        while (i8 < list.size()) {
            c0561i.v0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void t(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.B0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iK0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK0 += C0561i.k0(((Long) list.get(i9)).longValue());
        }
        c0561i.A0(iK0);
        while (i8 < list.size()) {
            c0561i.C0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void u(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.q0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 4;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.r0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void v(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.s0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0561i.h;
            i9 += 8;
        }
        c0561i.A0(i9);
        while (i8 < list.size()) {
            c0561i.t0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void w(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0561i.z0(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iJ0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = ((Integer) list.get(i9)).intValue();
            iJ0 += C0561i.j0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0561i.A0(iJ0);
        while (i8 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i8)).intValue();
            c0561i.A0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i8++;
        }
    }

    public static void x(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                c0561i.B0((jLongValue >> 63) ^ (jLongValue << 1), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iK0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iK0 += C0561i.k0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0561i.A0(iK0);
        while (i8 < list.size()) {
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            c0561i.C0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i8++;
        }
    }

    public static void y(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.z0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iJ0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iJ0 += C0561i.j0(((Integer) list.get(i9)).intValue());
        }
        c0561i.A0(iJ0);
        while (i8 < list.size()) {
            c0561i.A0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void z(int i7, List list, B b7, boolean z6) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0561i c0561i = (C0561i) b7.f9557a;
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                c0561i.B0(((Long) list.get(i8)).longValue(), i7);
                i8++;
            }
            return;
        }
        c0561i.y0(i7, 2);
        int iK0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iK0 += C0561i.k0(((Long) list.get(i9)).longValue());
        }
        c0561i.A0(iK0);
        while (i8 < list.size()) {
            c0561i.C0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static Object j(Object obj, int i7, InterfaceC0571t interfaceC0571t, Object obj2, U u7) {
        return obj2;
    }
}
