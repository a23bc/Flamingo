package N3;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public final HashSet f5127a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f5127a.equals(((e) obj).f5127a);
    }

    public final int hashCode() {
        return this.f5127a.hashCode();
    }
}
