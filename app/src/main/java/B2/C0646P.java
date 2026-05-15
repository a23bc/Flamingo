package b2;

import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b2.P, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0646P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10106b;

    public C0646P(Map map, Map map2) {
        this.f10105a = map;
        this.f10106b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0646P)) {
            return false;
        }
        C0646P c0646p = (C0646P) obj;
        return AbstractC1209k.a(this.f10105a, c0646p.f10105a) && AbstractC1209k.a(this.f10106b, c0646p.f10106b);
    }

    public final int hashCode() {
        return this.f10106b.hashCode() + (this.f10105a.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.f10105a + ", providerNameToReceivers=" + this.f10106b + ')';
    }
}
