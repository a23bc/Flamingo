package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0539l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0539l f9493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0539l f9494b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        C0539l c0539l = new C0539l();
        Map map = Collections.EMPTY_MAP;
        f9494b = c0539l;
    }

    public static C0539l a() {
        C0539l c0539l;
        C0539l c0539l2 = f9493a;
        if (c0539l2 != null) {
            return c0539l2;
        }
        synchronized (C0539l.class) {
            try {
                c0539l = f9493a;
                if (c0539l == null) {
                    Class cls = AbstractC0538k.f9492a;
                    if (cls != null) {
                        try {
                            c0539l = (C0539l) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            c0539l = f9494b;
                        }
                        f9493a = c0539l;
                    } else {
                        c0539l = f9494b;
                        f9493a = c0539l;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0539l;
    }
}
