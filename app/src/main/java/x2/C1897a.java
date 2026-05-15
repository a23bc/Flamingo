package x2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o5.AbstractC1267a;
import t2.C1487p;
import t2.I;
import t2.K;
import w2.t;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1897a implements K {
    public static final Parcelable.Creator<C1897a> CREATOR = new c3.b(19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f19925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f19926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f19927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19928r;

    public C1897a(String str, byte[] bArr, int i7, int i8) {
        this.f19925o = str;
        this.f19926p = bArr;
        this.f19927q = i7;
        this.f19928r = i8;
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
        if (obj != null && C1897a.class == obj.getClass()) {
            C1897a c1897a = (C1897a) obj;
            if (this.f19925o.equals(c1897a.f19925o) && Arrays.equals(this.f19926p, c1897a.f19926p) && this.f19927q == c1897a.f19927q && this.f19928r == c1897a.f19928r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f19926p) + A0.e.C(this.f19925o, 527, 31)) * 31) + this.f19927q) * 31) + this.f19928r;
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
        String strK;
        byte[] bArr = this.f19926p;
        int i7 = this.f19928r;
        if (i7 == 1) {
            strK = t.k(bArr);
        } else if (i7 == 23) {
            strK = String.valueOf(Float.intBitsToFloat(AbstractC1267a.v(bArr)));
        } else if (i7 != 67) {
            int i8 = t.f18881a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i9 = 0; i9 < bArr.length; i9++) {
                sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i9] & 15, 16));
            }
            strK = sb.toString();
        } else {
            strK = String.valueOf(AbstractC1267a.v(bArr));
        }
        return "mdta: key=" + this.f19925o + ", value=" + strK;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19925o);
        parcel.writeByteArray(this.f19926p);
        parcel.writeInt(this.f19927q);
        parcel.writeInt(this.f19928r);
    }

    public C1897a(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f19925o = string;
        this.f19926p = parcel.createByteArray();
        this.f19927q = parcel.readInt();
        this.f19928r = parcel.readInt();
    }
}
