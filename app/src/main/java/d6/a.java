package d6;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c3.b(8);

    /* JADX INFO: renamed from: o */
    public final long f11274o;

    /* JADX INFO: renamed from: p */
    public final long f11275p;

    /* JADX INFO: renamed from: q */
    public final String f11276q;

    /* JADX INFO: renamed from: r */
    public final boolean f11277r;

    public a(long j3, long j7, String str, boolean z6) {
        AbstractC1209k.f(str, "word");
        this.f11274o = j3;
        this.f11275p = j7;
        this.f11276q = str;
        this.f11277r = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11274o == aVar.f11274o && this.f11275p == aVar.f11275p && AbstractC1209k.a(this.f11276q, aVar.f11276q) && this.f11277r == aVar.f11277r;
    }

    public final int hashCode() {
        long j3 = this.f11274o;
        long j7 = this.f11275p;
        return A0.e.C(this.f11276q, ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31, 31) + (this.f11277r ? 1231 : 1237);
    }

    public final String toString() {
        return "Span(begin=" + this.f11274o + ", end=" + this.f11275p + ", word=" + this.f11276q + ", hasSpace=" + this.f11277r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeLong(this.f11274o);
        parcel.writeLong(this.f11275p);
        parcel.writeString(this.f11276q);
        parcel.writeInt(this.f11277r ? 1 : 0);
    }
}
