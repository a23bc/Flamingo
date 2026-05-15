package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0543p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0543p f9509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0543p f9510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0543p[] f9511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0543p[] f9512s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9513o;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0543p EF0;

    static {
        EnumC0551y enumC0551y = EnumC0551y.DOUBLE;
        EnumC0543p enumC0543p = new EnumC0543p("DOUBLE", 0, 0, 1, enumC0551y);
        EnumC0551y enumC0551y2 = EnumC0551y.FLOAT;
        EnumC0543p enumC0543p2 = new EnumC0543p("FLOAT", 1, 1, 1, enumC0551y2);
        EnumC0551y enumC0551y3 = EnumC0551y.LONG;
        EnumC0543p enumC0543p3 = new EnumC0543p("INT64", 2, 2, 1, enumC0551y3);
        EnumC0543p enumC0543p4 = new EnumC0543p("UINT64", 3, 3, 1, enumC0551y3);
        EnumC0551y enumC0551y4 = EnumC0551y.INT;
        EnumC0543p enumC0543p5 = new EnumC0543p("INT32", 4, 4, 1, enumC0551y4);
        EnumC0543p enumC0543p6 = new EnumC0543p("FIXED64", 5, 5, 1, enumC0551y3);
        EnumC0543p enumC0543p7 = new EnumC0543p("FIXED32", 6, 6, 1, enumC0551y4);
        EnumC0551y enumC0551y5 = EnumC0551y.BOOLEAN;
        EnumC0543p enumC0543p8 = new EnumC0543p("BOOL", 7, 7, 1, enumC0551y5);
        EnumC0551y enumC0551y6 = EnumC0551y.STRING;
        EnumC0543p enumC0543p9 = new EnumC0543p("STRING", 8, 8, 1, enumC0551y6);
        EnumC0551y enumC0551y7 = EnumC0551y.MESSAGE;
        EnumC0543p enumC0543p10 = new EnumC0543p("MESSAGE", 9, 9, 1, enumC0551y7);
        EnumC0551y enumC0551y8 = EnumC0551y.BYTE_STRING;
        EnumC0543p enumC0543p11 = new EnumC0543p("BYTES", 10, 10, 1, enumC0551y8);
        EnumC0543p enumC0543p12 = new EnumC0543p("UINT32", 11, 11, 1, enumC0551y4);
        EnumC0551y enumC0551y9 = EnumC0551y.ENUM;
        EnumC0543p enumC0543p13 = new EnumC0543p("ENUM", 12, 12, 1, enumC0551y9);
        EnumC0543p enumC0543p14 = new EnumC0543p("SFIXED32", 13, 13, 1, enumC0551y4);
        EnumC0543p enumC0543p15 = new EnumC0543p("SFIXED64", 14, 14, 1, enumC0551y3);
        EnumC0543p enumC0543p16 = new EnumC0543p("SINT32", 15, 15, 1, enumC0551y4);
        EnumC0543p enumC0543p17 = new EnumC0543p("SINT64", 16, 16, 1, enumC0551y3);
        EnumC0543p enumC0543p18 = new EnumC0543p("GROUP", 17, 17, 1, enumC0551y7);
        EnumC0543p enumC0543p19 = new EnumC0543p("DOUBLE_LIST", 18, 18, 2, enumC0551y);
        EnumC0543p enumC0543p20 = new EnumC0543p("FLOAT_LIST", 19, 19, 2, enumC0551y2);
        EnumC0543p enumC0543p21 = new EnumC0543p("INT64_LIST", 20, 20, 2, enumC0551y3);
        EnumC0543p enumC0543p22 = new EnumC0543p("UINT64_LIST", 21, 21, 2, enumC0551y3);
        EnumC0543p enumC0543p23 = new EnumC0543p("INT32_LIST", 22, 22, 2, enumC0551y4);
        EnumC0543p enumC0543p24 = new EnumC0543p("FIXED64_LIST", 23, 23, 2, enumC0551y3);
        EnumC0543p enumC0543p25 = new EnumC0543p("FIXED32_LIST", 24, 24, 2, enumC0551y4);
        EnumC0543p enumC0543p26 = new EnumC0543p("BOOL_LIST", 25, 25, 2, enumC0551y5);
        EnumC0543p enumC0543p27 = new EnumC0543p("STRING_LIST", 26, 26, 2, enumC0551y6);
        EnumC0543p enumC0543p28 = new EnumC0543p("MESSAGE_LIST", 27, 27, 2, enumC0551y7);
        EnumC0543p enumC0543p29 = new EnumC0543p("BYTES_LIST", 28, 28, 2, enumC0551y8);
        EnumC0543p enumC0543p30 = new EnumC0543p("UINT32_LIST", 29, 29, 2, enumC0551y4);
        EnumC0543p enumC0543p31 = new EnumC0543p("ENUM_LIST", 30, 30, 2, enumC0551y9);
        EnumC0543p enumC0543p32 = new EnumC0543p("SFIXED32_LIST", 31, 31, 2, enumC0551y4);
        EnumC0543p enumC0543p33 = new EnumC0543p("SFIXED64_LIST", 32, 32, 2, enumC0551y3);
        EnumC0543p enumC0543p34 = new EnumC0543p("SINT32_LIST", 33, 33, 2, enumC0551y4);
        EnumC0543p enumC0543p35 = new EnumC0543p("SINT64_LIST", 34, 34, 2, enumC0551y3);
        EnumC0543p enumC0543p36 = new EnumC0543p("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0551y);
        f9509p = enumC0543p36;
        EnumC0543p enumC0543p37 = new EnumC0543p("FLOAT_LIST_PACKED", 36, 36, 3, enumC0551y2);
        EnumC0543p enumC0543p38 = new EnumC0543p("INT64_LIST_PACKED", 37, 37, 3, enumC0551y3);
        EnumC0543p enumC0543p39 = new EnumC0543p("UINT64_LIST_PACKED", 38, 38, 3, enumC0551y3);
        EnumC0543p enumC0543p40 = new EnumC0543p("INT32_LIST_PACKED", 39, 39, 3, enumC0551y4);
        EnumC0543p enumC0543p41 = new EnumC0543p("FIXED64_LIST_PACKED", 40, 40, 3, enumC0551y3);
        EnumC0543p enumC0543p42 = new EnumC0543p("FIXED32_LIST_PACKED", 41, 41, 3, enumC0551y4);
        EnumC0543p enumC0543p43 = new EnumC0543p("BOOL_LIST_PACKED", 42, 42, 3, enumC0551y5);
        EnumC0543p enumC0543p44 = new EnumC0543p("UINT32_LIST_PACKED", 43, 43, 3, enumC0551y4);
        EnumC0543p enumC0543p45 = new EnumC0543p("ENUM_LIST_PACKED", 44, 44, 3, enumC0551y9);
        EnumC0543p enumC0543p46 = new EnumC0543p("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0551y4);
        EnumC0543p enumC0543p47 = new EnumC0543p("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0551y3);
        EnumC0543p enumC0543p48 = new EnumC0543p("SINT32_LIST_PACKED", 47, 47, 3, enumC0551y4);
        EnumC0543p enumC0543p49 = new EnumC0543p("SINT64_LIST_PACKED", 48, 48, 3, enumC0551y3);
        f9510q = enumC0543p49;
        f9512s = new EnumC0543p[]{enumC0543p, enumC0543p2, enumC0543p3, enumC0543p4, enumC0543p5, enumC0543p6, enumC0543p7, enumC0543p8, enumC0543p9, enumC0543p10, enumC0543p11, enumC0543p12, enumC0543p13, enumC0543p14, enumC0543p15, enumC0543p16, enumC0543p17, enumC0543p18, enumC0543p19, enumC0543p20, enumC0543p21, enumC0543p22, enumC0543p23, enumC0543p24, enumC0543p25, enumC0543p26, enumC0543p27, enumC0543p28, enumC0543p29, enumC0543p30, enumC0543p31, enumC0543p32, enumC0543p33, enumC0543p34, enumC0543p35, enumC0543p36, enumC0543p37, enumC0543p38, enumC0543p39, enumC0543p40, enumC0543p41, enumC0543p42, enumC0543p43, enumC0543p44, enumC0543p45, enumC0543p46, enumC0543p47, enumC0543p48, enumC0543p49, new EnumC0543p("GROUP_LIST", 49, 49, 2, enumC0551y7), new EnumC0543p("MAP", 50, 50, 4, EnumC0551y.VOID)};
        EnumC0543p[] enumC0543pArrValues = values();
        f9511r = new EnumC0543p[enumC0543pArrValues.length];
        for (EnumC0543p enumC0543p50 : enumC0543pArrValues) {
            f9511r[enumC0543p50.f9513o] = enumC0543p50;
        }
    }

    public EnumC0543p(String str, int i7, int i8, int i9, EnumC0551y enumC0551y) {
        this.f9513o = i8;
        int iB = AbstractC1676i.b(i9);
        if (iB == 1 || iB == 3) {
            enumC0551y.getClass();
        }
        if (i9 == 1) {
            enumC0551y.ordinal();
        }
    }

    public static EnumC0543p valueOf(String str) {
        return (EnumC0543p) Enum.valueOf(EnumC0543p.class, str);
    }

    public static EnumC0543p[] values() {
        return (EnumC0543p[]) f9512s.clone();
    }
}
