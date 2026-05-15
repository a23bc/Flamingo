package w3;

import android.os.Bundle;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: w3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1725g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f19185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f19186g;
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f19187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f19188j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f19193e;

    static {
        int i7 = w2.t.f18881a;
        f19185f = Integer.toString(0, 36);
        f19186g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        f19187i = Integer.toString(3, 36);
        f19188j = Integer.toString(4, 36);
    }

    public C1725g(String str, int i7, Bundle bundle) {
        this(1004000300, 6, str, i7, new Bundle(bundle));
    }

    public static C1725g a(Bundle bundle) {
        int i7 = bundle.getInt(f19185f, 0);
        int i8 = bundle.getInt(f19188j, 0);
        String string = bundle.getString(f19186g);
        string.getClass();
        String str = h;
        AbstractC1697a.d(bundle.containsKey(str));
        int i9 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f19187i);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new C1725g(i7, i8, string, i9, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f19185f, this.f19189a);
        bundle.putString(f19186g, this.f19191c);
        bundle.putInt(h, this.f19192d);
        bundle.putBundle(f19187i, this.f19193e);
        bundle.putInt(f19188j, this.f19190b);
        return bundle;
    }

    public C1725g(int i7, int i8, String str, int i9, Bundle bundle) {
        this.f19189a = i7;
        this.f19190b = i8;
        this.f19191c = str;
        this.f19192d = i9;
        this.f19193e = bundle;
    }
}
