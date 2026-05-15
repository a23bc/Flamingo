package a3;

import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: renamed from: a3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0520c implements K {
    public static final Parcelable.Creator<C0520c> CREATOR = new h(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f8847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f8849q;

    public C0520c(String str, String str2, byte[] bArr) {
        this.f8847o = bArr;
        this.f8848p = str;
        this.f8849q = str2;
    }

    @Override // t2.K
    public final void b(I i7) {
        String str = this.f8848p;
        if (str != null) {
            i7.f16239a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0520c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8847o, ((C0520c) obj).f8847o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8847o);
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
        return "ICY: title=\"" + this.f8848p + "\", url=\"" + this.f8849q + "\", rawMetadata.length=\"" + this.f8847o.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f8847o);
        parcel.writeString(this.f8848p);
        parcel.writeString(this.f8849q);
    }

    public C0520c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f8847o = bArrCreateByteArray;
        this.f8848p = parcel.readString();
        this.f8849q = parcel.readString();
    }
}
