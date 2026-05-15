package androidx.glance.appwidget.protobuf;

import w.AbstractC1676i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0566n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0566n f9647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0566n f9648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0566n[] f9649r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0566n[] f9650s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9651o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0566n EF0;

    static {
        EnumC0575x enumC0575x = EnumC0575x.DOUBLE;
        EnumC0566n enumC0566n = new EnumC0566n("DOUBLE", 0, 0, 1, enumC0575x);
        EnumC0575x enumC0575x2 = EnumC0575x.FLOAT;
        EnumC0566n enumC0566n2 = new EnumC0566n("FLOAT", 1, 1, 1, enumC0575x2);
        EnumC0575x enumC0575x3 = EnumC0575x.LONG;
        EnumC0566n enumC0566n3 = new EnumC0566n("INT64", 2, 2, 1, enumC0575x3);
        EnumC0566n enumC0566n4 = new EnumC0566n("UINT64", 3, 3, 1, enumC0575x3);
        EnumC0575x enumC0575x4 = EnumC0575x.INT;
        EnumC0566n enumC0566n5 = new EnumC0566n("INT32", 4, 4, 1, enumC0575x4);
        EnumC0566n enumC0566n6 = new EnumC0566n("FIXED64", 5, 5, 1, enumC0575x3);
        EnumC0566n enumC0566n7 = new EnumC0566n("FIXED32", 6, 6, 1, enumC0575x4);
        EnumC0575x enumC0575x5 = EnumC0575x.BOOLEAN;
        EnumC0566n enumC0566n8 = new EnumC0566n("BOOL", 7, 7, 1, enumC0575x5);
        EnumC0575x enumC0575x6 = EnumC0575x.STRING;
        EnumC0566n enumC0566n9 = new EnumC0566n("STRING", 8, 8, 1, enumC0575x6);
        EnumC0575x enumC0575x7 = EnumC0575x.MESSAGE;
        EnumC0566n enumC0566n10 = new EnumC0566n("MESSAGE", 9, 9, 1, enumC0575x7);
        EnumC0575x enumC0575x8 = EnumC0575x.BYTE_STRING;
        EnumC0566n enumC0566n11 = new EnumC0566n("BYTES", 10, 10, 1, enumC0575x8);
        EnumC0566n enumC0566n12 = new EnumC0566n("UINT32", 11, 11, 1, enumC0575x4);
        EnumC0575x enumC0575x9 = EnumC0575x.ENUM;
        EnumC0566n enumC0566n13 = new EnumC0566n("ENUM", 12, 12, 1, enumC0575x9);
        EnumC0566n enumC0566n14 = new EnumC0566n("SFIXED32", 13, 13, 1, enumC0575x4);
        EnumC0566n enumC0566n15 = new EnumC0566n("SFIXED64", 14, 14, 1, enumC0575x3);
        EnumC0566n enumC0566n16 = new EnumC0566n("SINT32", 15, 15, 1, enumC0575x4);
        EnumC0566n enumC0566n17 = new EnumC0566n("SINT64", 16, 16, 1, enumC0575x3);
        EnumC0566n enumC0566n18 = new EnumC0566n("GROUP", 17, 17, 1, enumC0575x7);
        EnumC0566n enumC0566n19 = new EnumC0566n("DOUBLE_LIST", 18, 18, 2, enumC0575x);
        EnumC0566n enumC0566n20 = new EnumC0566n("FLOAT_LIST", 19, 19, 2, enumC0575x2);
        EnumC0566n enumC0566n21 = new EnumC0566n("INT64_LIST", 20, 20, 2, enumC0575x3);
        EnumC0566n enumC0566n22 = new EnumC0566n("UINT64_LIST", 21, 21, 2, enumC0575x3);
        EnumC0566n enumC0566n23 = new EnumC0566n("INT32_LIST", 22, 22, 2, enumC0575x4);
        EnumC0566n enumC0566n24 = new EnumC0566n("FIXED64_LIST", 23, 23, 2, enumC0575x3);
        EnumC0566n enumC0566n25 = new EnumC0566n("FIXED32_LIST", 24, 24, 2, enumC0575x4);
        EnumC0566n enumC0566n26 = new EnumC0566n("BOOL_LIST", 25, 25, 2, enumC0575x5);
        EnumC0566n enumC0566n27 = new EnumC0566n("STRING_LIST", 26, 26, 2, enumC0575x6);
        EnumC0566n enumC0566n28 = new EnumC0566n("MESSAGE_LIST", 27, 27, 2, enumC0575x7);
        EnumC0566n enumC0566n29 = new EnumC0566n("BYTES_LIST", 28, 28, 2, enumC0575x8);
        EnumC0566n enumC0566n30 = new EnumC0566n("UINT32_LIST", 29, 29, 2, enumC0575x4);
        EnumC0566n enumC0566n31 = new EnumC0566n("ENUM_LIST", 30, 30, 2, enumC0575x9);
        EnumC0566n enumC0566n32 = new EnumC0566n("SFIXED32_LIST", 31, 31, 2, enumC0575x4);
        EnumC0566n enumC0566n33 = new EnumC0566n("SFIXED64_LIST", 32, 32, 2, enumC0575x3);
        EnumC0566n enumC0566n34 = new EnumC0566n("SINT32_LIST", 33, 33, 2, enumC0575x4);
        EnumC0566n enumC0566n35 = new EnumC0566n("SINT64_LIST", 34, 34, 2, enumC0575x3);
        EnumC0566n enumC0566n36 = new EnumC0566n("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0575x);
        f9647p = enumC0566n36;
        EnumC0566n enumC0566n37 = new EnumC0566n("FLOAT_LIST_PACKED", 36, 36, 3, enumC0575x2);
        EnumC0566n enumC0566n38 = new EnumC0566n("INT64_LIST_PACKED", 37, 37, 3, enumC0575x3);
        EnumC0566n enumC0566n39 = new EnumC0566n("UINT64_LIST_PACKED", 38, 38, 3, enumC0575x3);
        EnumC0566n enumC0566n40 = new EnumC0566n("INT32_LIST_PACKED", 39, 39, 3, enumC0575x4);
        EnumC0566n enumC0566n41 = new EnumC0566n("FIXED64_LIST_PACKED", 40, 40, 3, enumC0575x3);
        EnumC0566n enumC0566n42 = new EnumC0566n("FIXED32_LIST_PACKED", 41, 41, 3, enumC0575x4);
        EnumC0566n enumC0566n43 = new EnumC0566n("BOOL_LIST_PACKED", 42, 42, 3, enumC0575x5);
        EnumC0566n enumC0566n44 = new EnumC0566n("UINT32_LIST_PACKED", 43, 43, 3, enumC0575x4);
        EnumC0566n enumC0566n45 = new EnumC0566n("ENUM_LIST_PACKED", 44, 44, 3, enumC0575x9);
        EnumC0566n enumC0566n46 = new EnumC0566n("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0575x4);
        EnumC0566n enumC0566n47 = new EnumC0566n("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0575x3);
        EnumC0566n enumC0566n48 = new EnumC0566n("SINT32_LIST_PACKED", 47, 47, 3, enumC0575x4);
        EnumC0566n enumC0566n49 = new EnumC0566n("SINT64_LIST_PACKED", 48, 48, 3, enumC0575x3);
        f9648q = enumC0566n49;
        f9650s = new EnumC0566n[]{enumC0566n, enumC0566n2, enumC0566n3, enumC0566n4, enumC0566n5, enumC0566n6, enumC0566n7, enumC0566n8, enumC0566n9, enumC0566n10, enumC0566n11, enumC0566n12, enumC0566n13, enumC0566n14, enumC0566n15, enumC0566n16, enumC0566n17, enumC0566n18, enumC0566n19, enumC0566n20, enumC0566n21, enumC0566n22, enumC0566n23, enumC0566n24, enumC0566n25, enumC0566n26, enumC0566n27, enumC0566n28, enumC0566n29, enumC0566n30, enumC0566n31, enumC0566n32, enumC0566n33, enumC0566n34, enumC0566n35, enumC0566n36, enumC0566n37, enumC0566n38, enumC0566n39, enumC0566n40, enumC0566n41, enumC0566n42, enumC0566n43, enumC0566n44, enumC0566n45, enumC0566n46, enumC0566n47, enumC0566n48, enumC0566n49, new EnumC0566n("GROUP_LIST", 49, 49, 2, enumC0575x7), new EnumC0566n("MAP", 50, 50, 4, EnumC0575x.VOID)};
        EnumC0566n[] enumC0566nArrValues = values();
        f9649r = new EnumC0566n[enumC0566nArrValues.length];
        for (EnumC0566n enumC0566n50 : enumC0566nArrValues) {
            f9649r[enumC0566n50.f9651o] = enumC0566n50;
        }
    }

    public EnumC0566n(String str, int i7, int i8, int i9, EnumC0575x enumC0575x) {
        this.f9651o = i8;
        int iB = AbstractC1676i.b(i9);
        if (iB == 1 || iB == 3) {
            enumC0575x.getClass();
        }
        if (i9 == 1) {
            enumC0575x.ordinal();
        }
    }

    public static EnumC0566n valueOf(String str) {
        return (EnumC0566n) Enum.valueOf(EnumC0566n.class, str);
    }

    public static EnumC0566n[] values() {
        return (EnumC0566n[]) f9650s.clone();
    }
}
