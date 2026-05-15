package H;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: H.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165g implements Parcelable {
    public static final Parcelable.Creator<C0165g> CREATOR = new C0164f();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2873o;

    public C0165g(int i7) {
        this.f2873o = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0165g) && this.f2873o == ((C0165g) obj).f2873o;
    }

    public final int hashCode() {
        return this.f2873o;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("DefaultLazyKey(index="), this.f2873o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f2873o);
    }
}
