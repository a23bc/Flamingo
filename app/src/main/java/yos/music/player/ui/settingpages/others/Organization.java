package yos.music.player.ui.settingpages.others;

import Z1.l;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Organization {
    public static final int $stable = 0;
    private final String name;

    public Organization(String str) {
        AbstractC1209k.f(str, "name");
        this.name = str;
    }

    public static /* synthetic */ Organization copy$default(Organization organization, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = organization.name;
        }
        return organization.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final Organization copy(String str) {
        AbstractC1209k.f(str, "name");
        return new Organization(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Organization) && AbstractC1209k.a(this.name, ((Organization) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return l.s(new StringBuilder("Organization(name="), this.name, ')');
    }
}
