package H;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: H.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0164f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0165g(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0165g[i7];
    }
}
