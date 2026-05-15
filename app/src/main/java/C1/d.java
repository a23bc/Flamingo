package C1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f938c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f936a, dVar.f936a) && Objects.equals(this.f937b, dVar.f937b) && Objects.equals(this.f938c, dVar.f938c);
    }

    public final int hashCode() {
        return Objects.hash(this.f936a, this.f937b, this.f938c);
    }
}
