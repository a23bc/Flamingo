package J2;

import E4.AbstractC0126y;
import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3649p;

    public g(C1487p c1487p, int i7) {
        this.f3648o = (c1487p.f16695e & 1) != 0;
        this.f3649p = A0.e.y(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return AbstractC0126y.f1997a.c(this.f3649p, gVar.f3649p).c(this.f3648o, gVar.f3648o).e();
    }
}
