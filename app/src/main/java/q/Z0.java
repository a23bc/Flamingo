package q;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends M1.b {
    public static final Parcelable.Creator<Z0> CREATOR = new p0.o(2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15250r;

    public Z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15249q = parcel.readInt();
        this.f15250r = parcel.readInt() != 0;
    }

    @Override // M1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f15249q);
        parcel.writeInt(this.f15250r ? 1 : 0);
    }
}
