package g1;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0982x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0982x f12389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0982x f12390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0982x f12391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0982x f12392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0982x[] f12393s;

    static {
        EnumC0982x enumC0982x = new EnumC0982x("StartInput", 0);
        f12389o = enumC0982x;
        EnumC0982x enumC0982x2 = new EnumC0982x("StopInput", 1);
        f12390p = enumC0982x2;
        EnumC0982x enumC0982x3 = new EnumC0982x("ShowKeyboard", 2);
        f12391q = enumC0982x3;
        EnumC0982x enumC0982x4 = new EnumC0982x("HideKeyboard", 3);
        f12392r = enumC0982x4;
        EnumC0982x[] enumC0982xArr = {enumC0982x, enumC0982x2, enumC0982x3, enumC0982x4};
        f12393s = enumC0982xArr;
        AbstractC1267a.u(enumC0982xArr);
    }

    public static EnumC0982x valueOf(String str) {
        return (EnumC0982x) Enum.valueOf(EnumC0982x.class, str);
    }

    public static EnumC0982x[] values() {
        return (EnumC0982x[]) f12393s.clone();
    }
}
