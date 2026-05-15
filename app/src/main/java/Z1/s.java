package Z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f8788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ s[] f8789p;

    static {
        s sVar = new s("Visible", 0);
        f8788o = sVar;
        f8789p = new s[]{sVar, new s("Invisible", 1), new s("Gone", 2)};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f8789p.clone();
    }
}
