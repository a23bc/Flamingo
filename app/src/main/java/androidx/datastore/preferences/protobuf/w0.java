package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s0 f9523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t0 f9524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u0 f9525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ w0[] f9526t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x0 f9527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9528p;

    /* JADX INFO: Fake field, exist only in values array */
    w0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    w0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    w0 EF12;

    static {
        w0 w0Var = new w0("DOUBLE", 0, x0.DOUBLE, 1);
        w0 w0Var2 = new w0("FLOAT", 1, x0.FLOAT, 5);
        x0 x0Var = x0.LONG;
        w0 w0Var3 = new w0("INT64", 2, x0Var, 0);
        w0 w0Var4 = new w0("UINT64", 3, x0Var, 0);
        x0 x0Var2 = x0.INT;
        w0 w0Var5 = new w0("INT32", 4, x0Var2, 0);
        w0 w0Var6 = new w0("FIXED64", 5, x0Var, 1);
        w0 w0Var7 = new w0("FIXED32", 6, x0Var2, 5);
        w0 w0Var8 = new w0("BOOL", 7, x0.BOOLEAN, 0);
        s0 s0Var = new s0("STRING", 8, x0.STRING, 2);
        f9523q = s0Var;
        x0 x0Var3 = x0.MESSAGE;
        t0 t0Var = new t0("GROUP", 9, x0Var3, 3);
        f9524r = t0Var;
        u0 u0Var = new u0("MESSAGE", 10, x0Var3, 2);
        f9525s = u0Var;
        f9526t = new w0[]{w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, s0Var, t0Var, u0Var, new v0("BYTES", 11, x0.BYTE_STRING, 2), new w0("UINT32", 12, x0Var2, 0), new w0("ENUM", 13, x0.ENUM, 0), new w0("SFIXED32", 14, x0Var2, 5), new w0("SFIXED64", 15, x0Var, 1), new w0("SINT32", 16, x0Var2, 0), new w0("SINT64", 17, x0Var, 0)};
    }

    public w0(String str, int i7, x0 x0Var, int i8) {
        this.f9527o = x0Var;
        this.f9528p = i8;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f9526t.clone();
    }
}
