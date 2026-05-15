package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0734a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0734a f10676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0734a[] f10677p;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0734a EF2;

    static {
        EnumC0734a enumC0734a = new EnumC0734a("STOP", 0);
        EnumC0734a enumC0734a2 = new EnumC0734a("UPDATE", 1);
        f10676o = enumC0734a2;
        f10677p = new EnumC0734a[]{enumC0734a, enumC0734a2};
    }

    public static EnumC0734a valueOf(String str) {
        return (EnumC0734a) Enum.valueOf(EnumC0734a.class, str);
    }

    public static EnumC0734a[] values() {
        return (EnumC0734a[]) f10677p.clone();
    }
}
