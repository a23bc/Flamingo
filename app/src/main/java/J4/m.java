package j4;

import F5.x;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f13732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4.f f13734c;

    public m(x xVar, String str, g4.f fVar) {
        this.f13732a = xVar;
        this.f13733b = str;
        this.f13734c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC1209k.a(this.f13732a, mVar.f13732a) && AbstractC1209k.a(this.f13733b, mVar.f13733b) && this.f13734c == mVar.f13734c;
    }

    public final int hashCode() {
        int iHashCode = this.f13732a.hashCode() * 31;
        String str = this.f13733b;
        return this.f13734c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
