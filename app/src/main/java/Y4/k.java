package Y4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Serializable {
    public static final Throwable a(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f8728o;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof j;
    }
}
