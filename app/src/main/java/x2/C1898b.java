package x2;

import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: x2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1898b implements K {
    public static final Parcelable.Creator<C1898b> CREATOR = new c3.b(20);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f19929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f19930p;

    public C1898b(float f7, float f8) {
        AbstractC1697a.c("Invalid latitude or longitude", f7 >= -90.0f && f7 <= 90.0f && f8 >= -180.0f && f8 <= 180.0f);
        this.f19929o = f7;
        this.f19930p = f8;
    }

    @Override // t2.K
    public final /* synthetic */ void b(I i7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1898b.class == obj.getClass()) {
            C1898b c1898b = (C1898b) obj;
            if (this.f19929o == c1898b.f19929o && this.f19930p == c1898b.f19930p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f19930p).hashCode() + ((Float.valueOf(this.f19929o).hashCode() + 527) * 31);
    }

    @Override // t2.K
    public final /* synthetic */ C1487p i() {
        return null;
    }

    @Override // t2.K
    public final /* synthetic */ byte[] n() {
        return null;
    }

    public final String toString() {
        return "xyz: latitude=" + this.f19929o + ", longitude=" + this.f19930p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f19929o);
        parcel.writeFloat(this.f19930p);
    }

    public C1898b(Parcel parcel) {
        this.f19929o = parcel.readFloat();
        this.f19930p = parcel.readFloat();
    }
}
