package b2;

import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: b2.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0664i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10199c;

    public C0664i0(int i7, int i8, Map map) {
        this.f10197a = i7;
        this.f10198b = i8;
        this.f10199c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0664i0)) {
            return false;
        }
        C0664i0 c0664i0 = (C0664i0) obj;
        return this.f10197a == c0664i0.f10197a && this.f10198b == c0664i0.f10198b && AbstractC1209k.a(this.f10199c, c0664i0.f10199c);
    }

    public final int hashCode() {
        return this.f10199c.hashCode() + (((this.f10197a * 31) + this.f10198b) * 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.f10197a + ", complexViewId=" + this.f10198b + ", children=" + this.f10199c + ')';
    }

    public /* synthetic */ C0664i0(int i7, int i8, Map map, int i9) {
        this((i9 & 1) != 0 ? -1 : i7, (i9 & 2) != 0 ? -1 : i8, (i9 & 4) != 0 ? Z4.w.f8819o : map);
    }
}
