package Q4;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f6153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f6154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f6155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N4.a f6156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N4.a f6157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N4.a f6158f;

    static {
        boolean z6;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f6153a = z6;
        if (z6) {
            f6154b = new b(Date.class, 0);
            f6155c = new b(Timestamp.class, 1);
            f6156d = a.f6147c;
            f6157e = a.f6148d;
            f6158f = a.f6149e;
            return;
        }
        f6154b = null;
        f6155c = null;
        f6156d = null;
        f6157e = null;
        f6158f = null;
    }
}
