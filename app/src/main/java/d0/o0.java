package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o0 f11052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final o0 f11053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o0 f11054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ o0[] f11055r;

    static {
        o0 o0Var = new o0("Hidden", 0);
        f11052o = o0Var;
        o0 o0Var2 = new o0("Expanded", 1);
        f11053p = o0Var2;
        o0 o0Var3 = new o0("PartiallyExpanded", 2);
        f11054q = o0Var3;
        f11055r = new o0[]{o0Var, o0Var2, o0Var3};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f11055r.clone();
    }
}
