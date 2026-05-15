package yos.music.player.ui.settingpages.others;

import Z1.l;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Scm {
    public static final int $stable = 0;
    private final String connection;
    private final String url;

    public Scm(String str, String str2) {
        AbstractC1209k.f(str, "connection");
        AbstractC1209k.f(str2, "url");
        this.connection = str;
        this.url = str2;
    }

    public static /* synthetic */ Scm copy$default(Scm scm, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = scm.connection;
        }
        if ((i7 & 2) != 0) {
            str2 = scm.url;
        }
        return scm.copy(str, str2);
    }

    public final String component1() {
        return this.connection;
    }

    public final String component2() {
        return this.url;
    }

    public final Scm copy(String str, String str2) {
        AbstractC1209k.f(str, "connection");
        AbstractC1209k.f(str2, "url");
        return new Scm(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scm)) {
            return false;
        }
        Scm scm = (Scm) obj;
        return AbstractC1209k.a(this.connection, scm.connection) && AbstractC1209k.a(this.url, scm.url);
    }

    public final String getConnection() {
        return this.connection;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.connection.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scm(connection=");
        sb.append(this.connection);
        sb.append(", url=");
        return l.s(sb, this.url, ')');
    }
}
