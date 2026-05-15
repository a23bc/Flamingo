package android.support.v4.media;

import K1.h;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new h(16);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f8909p;

    public RatingCompat(int i7, float f7) {
        this.f8908o = i7;
        this.f8909p = f7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f8908o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f8908o);
        sb.append(" rating=");
        float f7 = this.f8909p;
        sb.append(f7 < 0.0f ? "unrated" : String.valueOf(f7));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8908o);
        parcel.writeFloat(this.f8909p);
    }
}
