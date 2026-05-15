package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8919s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8915o);
        parcel.writeInt(this.f8917q);
        parcel.writeInt(this.f8918r);
        parcel.writeInt(this.f8919s);
        parcel.writeInt(this.f8916p);
    }
}
