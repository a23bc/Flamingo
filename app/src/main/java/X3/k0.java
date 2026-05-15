package x3;

import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;
import y3.C2020i;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20058a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20058a) {
            case 0:
                return new l0(parcel);
            case 1:
                return new n0(parcel.readInt(), parcel.readFloat());
            default:
                AbstractC1209k.f(parcel, "inParcel");
                return new C2020i(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f20058a) {
            case 0:
                return new l0[i7];
            case 1:
                return new n0[i7];
            default:
                return new C2020i[i7];
        }
    }
}
