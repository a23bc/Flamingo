package p4;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: p4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1297c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4.i f15015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4.g f15016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4.e f15017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q4.d f15018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f15019e;

    public C1297c(q4.i iVar, q4.g gVar, r4.e eVar, q4.d dVar, Boolean bool) {
        this.f15015a = iVar;
        this.f15016b = gVar;
        this.f15017c = eVar;
        this.f15018d = dVar;
        this.f15019e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1297c)) {
            return false;
        }
        C1297c c1297c = (C1297c) obj;
        c1297c.getClass();
        return AbstractC1209k.a(this.f15015a, c1297c.f15015a) && this.f15016b == c1297c.f15016b && AbstractC1209k.a(this.f15017c, c1297c.f15017c) && this.f15018d == c1297c.f15018d && AbstractC1209k.a(this.f15019e, c1297c.f15019e);
    }

    public final int hashCode() {
        q4.i iVar = this.f15015a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        q4.g gVar = this.f15016b;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 28629151;
        r4.e eVar = this.f15017c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        q4.d dVar = this.f15018d;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 961;
        Boolean bool = this.f15019e;
        return (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
