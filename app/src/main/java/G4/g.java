package g4;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f12513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12514b;

    public g(BitmapDrawable bitmapDrawable, boolean z6) {
        this.f12513a = bitmapDrawable;
        this.f12514b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12513a.equals(gVar.f12513a) && this.f12514b == gVar.f12514b;
    }

    public final int hashCode() {
        return (this.f12513a.hashCode() * 31) + (this.f12514b ? 1231 : 1237);
    }
}
