package K0;

import java.util.ArrayList;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f3931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3932g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f3935k;

    public w(long j3, long j7, long j8, long j9, boolean z6, float f7, int i7, boolean z7, ArrayList arrayList, long j10, long j11) {
        this.f3926a = j3;
        this.f3927b = j7;
        this.f3928c = j8;
        this.f3929d = j9;
        this.f3930e = z6;
        this.f3931f = f7;
        this.f3932g = i7;
        this.h = z7;
        this.f3933i = arrayList;
        this.f3934j = j10;
        this.f3935k = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return t.d(this.f3926a, wVar.f3926a) && this.f3927b == wVar.f3927b && C1892b.b(this.f3928c, wVar.f3928c) && C1892b.b(this.f3929d, wVar.f3929d) && this.f3930e == wVar.f3930e && Float.compare(this.f3931f, wVar.f3931f) == 0 && this.f3932g == wVar.f3932g && this.h == wVar.h && this.f3933i.equals(wVar.f3933i) && C1892b.b(this.f3934j, wVar.f3934j) && C1892b.b(this.f3935k, wVar.f3935k);
    }

    public final int hashCode() {
        long j3 = this.f3926a;
        long j7 = this.f3927b;
        return C1892b.f(this.f3935k) + ((C1892b.f(this.f3934j) + ((this.f3933i.hashCode() + ((((n1.c.n(this.f3931f, (((C1892b.f(this.f3929d) + ((C1892b.f(this.f3928c) + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31)) * 31)) * 31) + (this.f3930e ? 1231 : 1237)) * 31, 31) + this.f3932g) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f3926a + ')'));
        sb.append(", uptime=");
        sb.append(this.f3927b);
        sb.append(", positionOnScreen=");
        sb.append((Object) C1892b.j(this.f3928c));
        sb.append(", position=");
        sb.append((Object) C1892b.j(this.f3929d));
        sb.append(", down=");
        sb.append(this.f3930e);
        sb.append(", pressure=");
        sb.append(this.f3931f);
        sb.append(", type=");
        int i7 = this.f3932g;
        sb.append((Object) (i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.f3933i);
        sb.append(", scrollDelta=");
        sb.append((Object) C1892b.j(this.f3934j));
        sb.append(", originalEventPosition=");
        sb.append((Object) C1892b.j(this.f3935k));
        sb.append(')');
        return sb.toString();
    }
}
