package I4;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f3540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f3541b;

    public x(Class cls) {
        this.f3540a = cls.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.f3541b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.f3541b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f3540a);
                this.f3541b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public x() {
        this.f3540a = new CopyOnWriteArraySet();
    }
}
