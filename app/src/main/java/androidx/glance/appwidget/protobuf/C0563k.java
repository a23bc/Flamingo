package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0563k f9643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0563k f9644b;

    static {
        C0563k c0563k = new C0563k();
        Map map = Collections.EMPTY_MAP;
        f9644b = c0563k;
    }

    public static C0563k a() {
        C0563k c0563k;
        M m7 = M.f9581c;
        C0563k c0563k2 = f9643a;
        if (c0563k2 != null) {
            return c0563k2;
        }
        synchronized (C0563k.class) {
            try {
                c0563k = f9643a;
                if (c0563k == null) {
                    Class cls = AbstractC0562j.f9642a;
                    C0563k c0563k3 = null;
                    if (cls != null) {
                        try {
                            c0563k3 = (C0563k) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c0563k = c0563k3 != null ? c0563k3 : f9644b;
                    f9643a = c0563k;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0563k;
    }
}
