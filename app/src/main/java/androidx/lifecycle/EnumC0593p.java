package androidx.lifecycle;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0593p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0593p f9745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0593p f9746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0593p f9747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0593p f9748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final EnumC0593p f9749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC0593p[] f9750t;

    static {
        EnumC0593p enumC0593p = new EnumC0593p("DESTROYED", 0);
        f9745o = enumC0593p;
        EnumC0593p enumC0593p2 = new EnumC0593p("INITIALIZED", 1);
        f9746p = enumC0593p2;
        EnumC0593p enumC0593p3 = new EnumC0593p("CREATED", 2);
        f9747q = enumC0593p3;
        EnumC0593p enumC0593p4 = new EnumC0593p("STARTED", 3);
        f9748r = enumC0593p4;
        EnumC0593p enumC0593p5 = new EnumC0593p("RESUMED", 4);
        f9749s = enumC0593p5;
        EnumC0593p[] enumC0593pArr = {enumC0593p, enumC0593p2, enumC0593p3, enumC0593p4, enumC0593p5};
        f9750t = enumC0593pArr;
        AbstractC1267a.u(enumC0593pArr);
    }

    public static EnumC0593p valueOf(String str) {
        return (EnumC0593p) Enum.valueOf(EnumC0593p.class, str);
    }

    public static EnumC0593p[] values() {
        return (EnumC0593p[]) f9750t.clone();
    }
}
