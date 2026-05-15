package a6;

import m5.AbstractC1209k;
import p0.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f8890b;

    static {
        p pVar = new p();
        f8889a = pVar;
        f8890b = pVar;
    }

    public static void a(String str) {
        AbstractC1209k.f(str, "content");
        f8889a.add(str);
    }
}
