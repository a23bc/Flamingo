package x3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new c3.b(28);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20049s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f20045o);
        parcel.writeInt(this.f20047q);
        parcel.writeInt(this.f20048r);
        parcel.writeInt(this.f20049s);
        parcel.writeInt(this.f20046p);
    }
}
