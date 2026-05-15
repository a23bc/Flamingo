package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1588F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1588F f17962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1588F f17963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC1588F f17964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1588F[] f17965r;

    static {
        EnumC1588F enumC1588F = new EnumC1588F("PreEnter", 0);
        f17962o = enumC1588F;
        EnumC1588F enumC1588F2 = new EnumC1588F("Visible", 1);
        f17963p = enumC1588F2;
        EnumC1588F enumC1588F3 = new EnumC1588F("PostExit", 2);
        f17964q = enumC1588F3;
        f17965r = new EnumC1588F[]{enumC1588F, enumC1588F2, enumC1588F3};
    }

    public static EnumC1588F valueOf(String str) {
        return (EnumC1588F) Enum.valueOf(EnumC1588F.class, str);
    }

    public static EnumC1588F[] values() {
        return (EnumC1588F[]) f17965r.clone();
    }
}
