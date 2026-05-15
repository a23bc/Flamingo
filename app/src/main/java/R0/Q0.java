package R0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ Q0[] f6370o;

    static {
        Q0[] q0Arr = {new Q0("Shown", 0), new Q0("Hidden", 1)};
        f6370o = q0Arr;
        AbstractC1267a.u(q0Arr);
    }

    public static Q0 valueOf(String str) {
        return (Q0) Enum.valueOf(Q0.class, str);
    }

    public static Q0[] values() {
        return (Q0[]) f6370o.clone();
    }
}
