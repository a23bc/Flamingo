package yos.music.player.ui.settingpages.others;

import Z1.l;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Developer {
    public static final int $stable = 0;
    private final String name;

    public Developer(String str) {
        this.name = str;
    }

    public static /* synthetic */ Developer copy$default(Developer developer, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = developer.name;
        }
        return developer.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final Developer copy(String str) {
        return new Developer(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Developer) && AbstractC1209k.a(this.name, ((Developer) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return l.s(new StringBuilder("Developer(name="), this.name, ')');
    }
}
