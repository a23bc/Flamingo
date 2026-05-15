package n4;

import android.graphics.Bitmap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: n4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1231b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f14541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14542b;

    public C1231b(Bitmap bitmap, Map map) {
        this.f14541a = bitmap;
        this.f14542b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1231b)) {
            return false;
        }
        C1231b c1231b = (C1231b) obj;
        return AbstractC1209k.a(this.f14541a, c1231b.f14541a) && AbstractC1209k.a(this.f14542b, c1231b.f14542b);
    }

    public final int hashCode() {
        return this.f14542b.hashCode() + (this.f14541a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f14541a + ", extras=" + this.f14542b + ')';
    }
}
