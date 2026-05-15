package X;

import o5.AbstractC1267a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W f8008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W f8009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W f8010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ W[] f8011r;

    static {
        W w7 = new W("Left", 0);
        f8008o = w7;
        W w8 = new W("Middle", 1);
        f8009p = w8;
        W w9 = new W("Right", 2);
        f8010q = w9;
        W[] wArr = {w7, w8, w9};
        f8011r = wArr;
        AbstractC1267a.u(wArr);
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f8011r.clone();
    }
}
