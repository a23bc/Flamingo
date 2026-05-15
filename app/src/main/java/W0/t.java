package w0;

import A2.W;
import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f18812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f18813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f18814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f18815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ t[] f18816s;

    static {
        t tVar = new t("Active", 0);
        f18812o = tVar;
        t tVar2 = new t("ActiveParent", 1);
        f18813p = tVar2;
        t tVar3 = new t("Captured", 2);
        f18814q = tVar3;
        t tVar4 = new t("Inactive", 3);
        f18815r = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        f18816s = tVarArr;
        AbstractC1267a.u(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f18816s.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new W();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new W();
            }
        }
        return true;
    }
}
