package c3;

import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: renamed from: c3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0733a implements K {
    public static final Parcelable.Creator<C0733a> CREATOR = new h(29);

    /* JADX INFO: renamed from: o */
    public final long f10664o;

    /* JADX INFO: renamed from: p */
    public final long f10665p;

    /* JADX INFO: renamed from: q */
    public final long f10666q;

    /* JADX INFO: renamed from: r */
    public final long f10667r;

    /* JADX INFO: renamed from: s */
    public final long f10668s;

    public C0733a(long j3, long j7, long j8, long j9, long j10) {
        this.f10664o = j3;
        this.f10665p = j7;
        this.f10666q = j8;
        this.f10667r = j9;
        this.f10668s = j10;
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
        if (obj != null && C0733a.class == obj.getClass()) {
            C0733a c0733a = (C0733a) obj;
            if (this.f10664o == c0733a.f10664o && this.f10665p == c0733a.f10665p && this.f10666q == c0733a.f10666q && this.f10667r == c0733a.f10667r && this.f10668s == c0733a.f10668s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return I0.c.C(this.f10668s) + ((I0.c.C(this.f10667r) + ((I0.c.C(this.f10666q) + ((I0.c.C(this.f10665p) + ((I0.c.C(this.f10664o) + 527) * 31)) * 31)) * 31)) * 31);
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
        return "Motion photo metadata: photoStartPosition=" + this.f10664o + ", photoSize=" + this.f10665p + ", photoPresentationTimestampUs=" + this.f10666q + ", videoStartPosition=" + this.f10667r + ", videoSize=" + this.f10668s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10664o);
        parcel.writeLong(this.f10665p);
        parcel.writeLong(this.f10666q);
        parcel.writeLong(this.f10667r);
        parcel.writeLong(this.f10668s);
    }

    public C0733a(Parcel parcel) {
        this.f10664o = parcel.readLong();
        this.f10665p = parcel.readLong();
        this.f10666q = parcel.readLong();
        this.f10667r = parcel.readLong();
        this.f10668s = parcel.readLong();
    }
}
