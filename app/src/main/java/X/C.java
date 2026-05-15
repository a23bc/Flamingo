package X;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C f7881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C f7882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C[] f7883q;

    static {
        C c7 = new C("EditableText", 0);
        f7881o = c7;
        C c8 = new C("StaticText", 1);
        f7882p = c8;
        C[] cArr = {c7, c8};
        f7883q = cArr;
        AbstractC1267a.u(cArr);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f7883q.clone();
    }
}
