package u5;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1544f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ EnumC1544f[] f17324o;

    static {
        EnumC1544f[] enumC1544fArr = {new EnumC1544f("IGNORE_CASE", 0), new EnumC1544f("MULTILINE", 1), new EnumC1544f("LITERAL", 2), new EnumC1544f("UNIX_LINES", 3), new EnumC1544f("COMMENTS", 4), new EnumC1544f("DOT_MATCHES_ALL", 5), new EnumC1544f("CANON_EQ", 6)};
        f17324o = enumC1544fArr;
        AbstractC1267a.u(enumC1544fArr);
    }

    public static EnumC1544f valueOf(String str) {
        return (EnumC1544f) Enum.valueOf(EnumC1544f.class, str);
    }

    public static EnumC1544f[] values() {
        return (EnumC1544f[]) f17324o.clone();
    }
}
