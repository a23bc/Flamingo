package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new K1.h(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f8591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8592p;

    public c(Parcel parcel) {
        this.f8591o = parcel.createStringArrayList();
        this.f8592p = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f8591o);
        parcel.writeTypedList(this.f8592p);
    }
}
