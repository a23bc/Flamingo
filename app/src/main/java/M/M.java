package M;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M f4421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final M f4422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final M f4423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ M[] f4424r;

    static {
        M m7 = new M("Cursor", 0);
        f4421o = m7;
        M m8 = new M("SelectionStart", 1);
        f4422p = m8;
        M m9 = new M("SelectionEnd", 2);
        f4423q = m9;
        M[] mArr = {m7, m8, m9};
        f4424r = mArr;
        AbstractC1267a.u(mArr);
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f4424r.clone();
    }
}
