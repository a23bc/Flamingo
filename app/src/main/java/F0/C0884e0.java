package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: f0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884e0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11796a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11796a) {
            case 0:
                return new C0886f0(parcel.readFloat());
            case 1:
                return new C0888g0(parcel.readInt());
            default:
                return new C0890h0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f11796a) {
            case 0:
                return new C0886f0[i7];
            case 1:
                return new C0888g0[i7];
            default:
                return new C0890h0[i7];
        }
    }
}
