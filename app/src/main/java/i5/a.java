package I5;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    public final String f3542a;

    /* JADX INFO: renamed from: b */
    public final boolean f3543b;

    /* JADX INFO: renamed from: c */
    public c f3544c;

    /* JADX INFO: renamed from: d */
    public long f3545d;

    public a(String str, boolean z6) {
        AbstractC1209k.f(str, "name");
        this.f3542a = str;
        this.f3543b = z6;
        this.f3545d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f3542a;
    }
}
