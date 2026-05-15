package d3;

import android.os.Parcel;
import android.os.Parcelable;
import w2.t;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0825a extends AbstractC0826b {
    public static final Parcelable.Creator<C0825a> CREATOR = new c3.b(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f11229q;

    public C0825a(long j3, byte[] bArr, long j7) {
        this.f11227o = j7;
        this.f11228p = j3;
        this.f11229q = bArr;
    }

    @Override // d3.AbstractC0826b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f11227o + ", identifier= " + this.f11228p + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11227o);
        parcel.writeLong(this.f11228p);
        parcel.writeByteArray(this.f11229q);
    }

    public C0825a(Parcel parcel) {
        this.f11227o = parcel.readLong();
        this.f11228p = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i7 = t.f18881a;
        this.f11229q = bArrCreateByteArray;
    }
}
