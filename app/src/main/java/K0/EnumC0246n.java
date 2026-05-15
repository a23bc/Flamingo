package K0;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0246n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0246n f3901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0246n f3902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0246n f3903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0246n[] f3904r;

    static {
        EnumC0246n enumC0246n = new EnumC0246n("Initial", 0);
        f3901o = enumC0246n;
        EnumC0246n enumC0246n2 = new EnumC0246n("Main", 1);
        f3902p = enumC0246n2;
        EnumC0246n enumC0246n3 = new EnumC0246n("Final", 2);
        f3903q = enumC0246n3;
        EnumC0246n[] enumC0246nArr = {enumC0246n, enumC0246n2, enumC0246n3};
        f3904r = enumC0246nArr;
        AbstractC1267a.u(enumC0246nArr);
    }

    public static EnumC0246n valueOf(String str) {
        return (EnumC0246n) Enum.valueOf(EnumC0246n.class, str);
    }

    public static EnumC0246n[] values() {
        return (EnumC0246n[]) f3904r.clone();
    }
}
