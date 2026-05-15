package d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q0 f11078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q0 f11079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ q0[] f11080q;

    static {
        q0 q0Var = new q0("THUMB", 0);
        f11078o = q0Var;
        q0 q0Var2 = new q0("TRACK", 1);
        f11079p = q0Var2;
        f11080q = new q0[]{q0Var, q0Var2};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f11080q.clone();
    }
}
