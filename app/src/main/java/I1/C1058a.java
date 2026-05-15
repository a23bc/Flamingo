package i1;

import java.util.Locale;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: i1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1058a {

    /* JADX INFO: renamed from: a */
    public final Locale f13288a;

    public C1058a(Locale locale) {
        this.f13288a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1058a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC1209k.a(this.f13288a.toLanguageTag(), ((C1058a) obj).f13288a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f13288a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f13288a.toLanguageTag();
    }
}
