package Q0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m0 f6052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m0 f6053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ m0[] f6054q;

    static {
        m0 m0Var = new m0("Width", 0);
        f6052o = m0Var;
        m0 m0Var2 = new m0("Height", 1);
        f6053p = m0Var2;
        m0[] m0VarArr = {m0Var, m0Var2};
        f6054q = m0VarArr;
        AbstractC1267a.u(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f6054q.clone();
    }
}
