package l3;

/* JADX INFO: renamed from: l3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1175g extends k3.i implements Comparable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f14242z;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1175g c1175g = (C1175g) obj;
        if (c(4) != c1175g.c(4)) {
            return c(4) ? 1 : -1;
        }
        long j3 = this.f21117u - c1175g.f21117u;
        if (j3 == 0) {
            j3 = this.f14242z - c1175g.f14242z;
            if (j3 == 0) {
                return 0;
            }
        }
        return j3 > 0 ? 1 : -1;
    }
}
