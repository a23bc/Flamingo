package Y4;

import java.io.Serializable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Throwable f8728o;

    public j(Throwable th) {
        AbstractC1209k.f(th, "exception");
        this.f8728o = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return AbstractC1209k.a(this.f8728o, ((j) obj).f8728o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8728o.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f8728o + ')';
    }
}
