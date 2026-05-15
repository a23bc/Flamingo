package B2;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f810c;

    static {
        if (t.f18881a < 31) {
            new p("");
        } else {
            new p(o.f806b, "");
        }
    }

    public p(String str) {
        AbstractC1697a.i(t.f18881a < 31);
        this.f808a = str;
        this.f809b = null;
        this.f810c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Objects.equals(this.f808a, pVar.f808a) && Objects.equals(this.f809b, pVar.f809b) && Objects.equals(this.f810c, pVar.f810c);
    }

    public final int hashCode() {
        return Objects.hash(this.f808a, this.f809b, this.f810c);
    }

    public p(LogSessionId logSessionId, String str) {
        this(new o(logSessionId), str);
    }

    public p(o oVar, String str) {
        this.f809b = oVar;
        this.f808a = str;
        this.f810c = new Object();
    }
}
