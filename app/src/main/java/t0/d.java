package t0;

import L2.C0247a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f16158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0247a f16159d;

    public d(int i7, long j3, e eVar, C0247a c0247a) {
        this.f16156a = i7;
        this.f16157b = j3;
        this.f16158c = eVar;
        this.f16159d = c0247a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16156a == dVar.f16156a && this.f16157b == dVar.f16157b && this.f16158c == dVar.f16158c && AbstractC1209k.a(this.f16159d, dVar.f16159d);
    }

    public final int hashCode() {
        int i7 = this.f16156a * 31;
        long j3 = this.f16157b;
        int iHashCode = (this.f16158c.hashCode() + ((i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        C0247a c0247a = this.f16159d;
        return iHashCode + (c0247a == null ? 0 : c0247a.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f16156a + ", timestamp=" + this.f16157b + ", type=" + this.f16158c + ", structureCompat=" + this.f16159d + ')';
    }
}
