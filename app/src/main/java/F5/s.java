package F5;

/* JADX INFO: loaded from: classes.dex */
public enum s {
    f2432p("http/1.0"),
    f2433q("http/1.1"),
    f2434r("spdy/3.1"),
    f2435s("h2"),
    f2436t("h2_prior_knowledge"),
    f2437u("quic");


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2439o;

    s(String str) {
        this.f2439o = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2439o;
    }
}
