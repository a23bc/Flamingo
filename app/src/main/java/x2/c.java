package x2;

import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: loaded from: classes.dex */
public final class c implements K {
    public static final Parcelable.Creator<c> CREATOR = new c3.b(21);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f19931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f19932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f19933q;

    public c(long j3, long j7, long j8) {
        this.f19931o = j3;
        this.f19932p = j7;
        this.f19933q = j8;
    }

    @Override // t2.K
    public final /* synthetic */ void b(I i7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f19931o == cVar.f19931o && this.f19932p == cVar.f19932p && this.f19933q == cVar.f19933q;
    }

    public final int hashCode() {
        return I0.c.C(this.f19933q) + ((I0.c.C(this.f19932p) + ((I0.c.C(this.f19931o) + 527) * 31)) * 31);
    }

    @Override // t2.K
    public final /* synthetic */ C1487p i() {
        return null;
    }

    @Override // t2.K
    public final /* synthetic */ byte[] n() {
        return null;
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f19931o + ", modification time=" + this.f19932p + ", timescale=" + this.f19933q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f19931o);
        parcel.writeLong(this.f19932p);
        parcel.writeLong(this.f19933q);
    }

    public c(Parcel parcel) {
        this.f19931o = parcel.readLong();
        this.f19932p = parcel.readLong();
        this.f19933q = parcel.readLong();
    }
}
