package F5;

import java.util.regex.Pattern;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f2402b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f2403c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2404a;

    public q(String str) {
        this.f2404a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && AbstractC1209k.a(((q) obj).f2404a, this.f2404a);
    }

    public final int hashCode() {
        return this.f2404a.hashCode();
    }

    public final String toString() {
        return this.f2404a;
    }
}
