package j4;

import android.graphics.drawable.Drawable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f13709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4.f f13711c;

    public d(Drawable drawable, boolean z6, g4.f fVar) {
        this.f13709a = drawable;
        this.f13710b = z6;
        this.f13711c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC1209k.a(this.f13709a, dVar.f13709a) && this.f13710b == dVar.f13710b && this.f13711c == dVar.f13711c;
    }

    public final int hashCode() {
        return this.f13711c.hashCode() + (((this.f13709a.hashCode() * 31) + (this.f13710b ? 1231 : 1237)) * 31);
    }
}
