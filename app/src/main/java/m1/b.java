package M1;

import android.os.Parcel;
import android.os.Parcelable;
import p0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Parcelable f4757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f4756p = new a();
    public static final Parcelable.Creator<b> CREATOR = new o(1);

    public b() {
        this.f4757o = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4757o, i7);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4757o = parcelable == f4756p ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4757o = parcelable == null ? f4756p : parcelable;
    }
}
