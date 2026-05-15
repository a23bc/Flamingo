package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: x3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1927l implements Parcelable {
    public static final Parcelable.Creator<C1927l> CREATOR = new c3.b(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f20059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1910L f20060p;

    public C1927l(Parcel parcel) {
        this.f20059o = parcel.readInt();
        this.f20060p = C1910L.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f20059o + ", mDescription=" + this.f20060p + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f20059o);
        this.f20060p.writeToParcel(parcel, i7);
    }
}
