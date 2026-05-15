package Y1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new K1.h(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f8616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8617p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8616o);
        parcel.writeInt(this.f8617p);
    }
}
