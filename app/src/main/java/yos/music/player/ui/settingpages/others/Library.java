package yos.music.player.ui.settingpages.others;

import A0.e;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Library {
    public static final int $stable = 8;
    private final String artifactVersion;
    private final String description;
    private final List<Developer> developers;
    private final List<Object> funding;
    private final List<String> licenses;
    private final String name;
    private final Organization organization;
    private final Scm scm;
    private final String uniqueId;
    private final String website;

    public Library(String str, List<? extends Object> list, List<Developer> list2, String str2, String str3, Scm scm, String str4, String str5, List<String> list3, Organization organization) {
        AbstractC1209k.f(str, "uniqueId");
        AbstractC1209k.f(list, "funding");
        AbstractC1209k.f(list2, "developers");
        AbstractC1209k.f(str2, "artifactVersion");
        AbstractC1209k.f(str3, "description");
        AbstractC1209k.f(scm, "scm");
        AbstractC1209k.f(str4, "name");
        AbstractC1209k.f(str5, "website");
        AbstractC1209k.f(list3, "licenses");
        AbstractC1209k.f(organization, "organization");
        this.uniqueId = str;
        this.funding = list;
        this.developers = list2;
        this.artifactVersion = str2;
        this.description = str3;
        this.scm = scm;
        this.name = str4;
        this.website = str5;
        this.licenses = list3;
        this.organization = organization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Library copy$default(Library library, String str, List list, List list2, String str2, String str3, Scm scm, String str4, String str5, List list3, Organization organization, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = library.uniqueId;
        }
        if ((i7 & 2) != 0) {
            list = library.funding;
        }
        if ((i7 & 4) != 0) {
            list2 = library.developers;
        }
        if ((i7 & 8) != 0) {
            str2 = library.artifactVersion;
        }
        if ((i7 & 16) != 0) {
            str3 = library.description;
        }
        if ((i7 & 32) != 0) {
            scm = library.scm;
        }
        if ((i7 & 64) != 0) {
            str4 = library.name;
        }
        if ((i7 & 128) != 0) {
            str5 = library.website;
        }
        if ((i7 & 256) != 0) {
            list3 = library.licenses;
        }
        if ((i7 & 512) != 0) {
            organization = library.organization;
        }
        List list4 = list3;
        Organization organization2 = organization;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        Scm scm2 = scm;
        return library.copy(str, list, list2, str2, str8, scm2, str6, str7, list4, organization2);
    }

    public final String component1() {
        return this.uniqueId;
    }

    public final Organization component10() {
        return this.organization;
    }

    public final List<Object> component2() {
        return this.funding;
    }

    public final List<Developer> component3() {
        return this.developers;
    }

    public final String component4() {
        return this.artifactVersion;
    }

    public final String component5() {
        return this.description;
    }

    public final Scm component6() {
        return this.scm;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.website;
    }

    public final List<String> component9() {
        return this.licenses;
    }

    public final Library copy(String str, List<? extends Object> list, List<Developer> list2, String str2, String str3, Scm scm, String str4, String str5, List<String> list3, Organization organization) {
        AbstractC1209k.f(str, "uniqueId");
        AbstractC1209k.f(list, "funding");
        AbstractC1209k.f(list2, "developers");
        AbstractC1209k.f(str2, "artifactVersion");
        AbstractC1209k.f(str3, "description");
        AbstractC1209k.f(scm, "scm");
        AbstractC1209k.f(str4, "name");
        AbstractC1209k.f(str5, "website");
        AbstractC1209k.f(list3, "licenses");
        AbstractC1209k.f(organization, "organization");
        return new Library(str, list, list2, str2, str3, scm, str4, str5, list3, organization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Library)) {
            return false;
        }
        Library library = (Library) obj;
        return AbstractC1209k.a(this.uniqueId, library.uniqueId) && AbstractC1209k.a(this.funding, library.funding) && AbstractC1209k.a(this.developers, library.developers) && AbstractC1209k.a(this.artifactVersion, library.artifactVersion) && AbstractC1209k.a(this.description, library.description) && AbstractC1209k.a(this.scm, library.scm) && AbstractC1209k.a(this.name, library.name) && AbstractC1209k.a(this.website, library.website) && AbstractC1209k.a(this.licenses, library.licenses) && AbstractC1209k.a(this.organization, library.organization);
    }

    public final String getArtifactVersion() {
        return this.artifactVersion;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<Developer> getDevelopers() {
        return this.developers;
    }

    public final List<Object> getFunding() {
        return this.funding;
    }

    public final List<String> getLicenses() {
        return this.licenses;
    }

    public final String getName() {
        return this.name;
    }

    public final Organization getOrganization() {
        return this.organization;
    }

    public final Scm getScm() {
        return this.scm;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return this.organization.hashCode() + ((this.licenses.hashCode() + e.C(this.website, e.C(this.name, (this.scm.hashCode() + e.C(this.description, e.C(this.artifactVersion, (this.developers.hashCode() + ((this.funding.hashCode() + (this.uniqueId.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    public String toString() {
        return "Library(uniqueId=" + this.uniqueId + ", funding=" + this.funding + ", developers=" + this.developers + ", artifactVersion=" + this.artifactVersion + ", description=" + this.description + ", scm=" + this.scm + ", name=" + this.name + ", website=" + this.website + ", licenses=" + this.licenses + ", organization=" + this.organization + ')';
    }
}
