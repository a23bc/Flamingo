package N3;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5126b;

    public d(boolean z6, Uri uri) {
        this.f5125a = uri;
        this.f5126b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5126b == dVar.f5126b && this.f5125a.equals(dVar.f5125a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5125a.hashCode() * 31) + (this.f5126b ? 1 : 0);
    }
}
