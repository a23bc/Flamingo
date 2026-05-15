package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new K1.h(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f8648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f8649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b[] f8650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f8653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f8654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f8655v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8648o);
        parcel.writeStringList(this.f8649p);
        parcel.writeTypedArray(this.f8650q, i7);
        parcel.writeInt(this.f8651r);
        parcel.writeString(this.f8652s);
        parcel.writeStringList(this.f8653t);
        parcel.writeTypedList(this.f8654u);
        parcel.writeTypedList(this.f8655v);
    }
}
