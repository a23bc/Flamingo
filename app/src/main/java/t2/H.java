package t2;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f16229a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f16230b = "media3.common";

    public static synchronized void a(String str) {
        if (f16229a.add(str)) {
            f16230b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f16230b;
    }
}
