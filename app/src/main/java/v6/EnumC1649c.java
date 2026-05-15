package v6;

import o5.AbstractC1267a;

/* JADX INFO: renamed from: v6.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1649c extends Enum {

    /* JADX INFO: renamed from: o */
    public static final EnumC1649c f18348o;

    /* JADX INFO: renamed from: p */
    public static final EnumC1649c f18349p;

    /* JADX INFO: renamed from: q */
    public static final EnumC1649c f18350q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ EnumC1649c[] f18351r;

    static {
        EnumC1649c enumC1649c = new EnumC1649c("RAW", 0);
        f18348o = enumC1649c;
        EnumC1649c enumC1649c2 = new EnumC1649c("LOW", 1);
        f18349p = enumC1649c2;
        EnumC1649c enumC1649c3 = new EnumC1649c("HIGH", 2);
        f18350q = enumC1649c3;
        EnumC1649c[] enumC1649cArr = {enumC1649c, enumC1649c2, enumC1649c3};
        f18351r = enumC1649cArr;
        AbstractC1267a.u(enumC1649cArr);
    }

    public static EnumC1649c valueOf(String str) {
        return (EnumC1649c) Enum.valueOf(EnumC1649c.class, str);
    }

    public static EnumC1649c[] values() {
        return (EnumC1649c[]) f18351r.clone();
    }
}
