package Y0;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.c f8431b;

    public a(String str, Y4.c cVar) {
        this.f8430a = str;
        this.f8431b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1209k.a(this.f8430a, aVar.f8430a) && AbstractC1209k.a(this.f8431b, aVar.f8431b);
    }

    public final int hashCode() {
        String str = this.f8430a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Y4.c cVar = this.f8431b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f8430a + ", action=" + this.f8431b + ')';
    }
}
