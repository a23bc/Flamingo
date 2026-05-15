package b1;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f10017a;

    public w(v vVar) {
        this.f10017a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!AbstractC1209k.a(this.f10017a, wVar.f10017a)) {
            return false;
        }
        wVar.getClass();
        return true;
    }

    public final int hashCode() {
        v vVar = this.f10017a;
        if (vVar != null) {
            return vVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f10017a + ')';
    }

    public w() {
        this(new v());
    }
}
