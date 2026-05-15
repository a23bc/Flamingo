package p2;

import java.util.LinkedHashMap;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: p2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1292b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14994a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1292b) && AbstractC1209k.a(this.f14994a, ((AbstractC1292b) obj).f14994a);
    }

    public final int hashCode() {
        return this.f14994a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f14994a + ')';
    }
}
