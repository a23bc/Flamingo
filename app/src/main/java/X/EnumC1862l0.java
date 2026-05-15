package x;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1862l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC1862l0 f19772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC1862l0 f19773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC1862l0[] f19774q;

    static {
        EnumC1862l0 enumC1862l0 = new EnumC1862l0("Default", 0);
        f19772o = enumC1862l0;
        EnumC1862l0 enumC1862l02 = new EnumC1862l0("UserInput", 1);
        f19773p = enumC1862l02;
        EnumC1862l0[] enumC1862l0Arr = {enumC1862l0, enumC1862l02, new EnumC1862l0("PreventUserInput", 2)};
        f19774q = enumC1862l0Arr;
        AbstractC1267a.u(enumC1862l0Arr);
    }

    public static EnumC1862l0 valueOf(String str) {
        return (EnumC1862l0) Enum.valueOf(EnumC1862l0.class, str);
    }

    public static EnumC1862l0[] values() {
        return (EnumC1862l0[]) f19774q.clone();
    }
}
