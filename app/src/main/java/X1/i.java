package x1;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f19910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f19911b;

    public i(Resources resources, Resources.Theme theme) {
        this.f19910a = resources;
        this.f19911b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f19910a.equals(iVar.f19910a) && Objects.equals(this.f19911b, iVar.f19911b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19910a, this.f19911b);
    }
}
