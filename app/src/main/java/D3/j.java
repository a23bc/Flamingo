package d3;

import android.os.Parcel;
import android.os.Parcelable;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0826b {
    public static final Parcelable.Creator<j> CREATOR = new c3.b(7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11263p;

    public j(long j3, long j7) {
        this.f11262o = j3;
        this.f11263p = j7;
    }

    public static long a(long j3, m mVar) {
        long jU = mVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | mVar.w()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override // d3.AbstractC0826b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f11262o + ", playbackPositionUs= " + this.f11263p + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11262o);
        parcel.writeLong(this.f11263p);
    }
}
