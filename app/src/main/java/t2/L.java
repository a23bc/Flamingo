package t2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new c3.b(17);

    /* JADX INFO: renamed from: o */
    public final K[] f16328o;

    /* JADX INFO: renamed from: p */
    public final long f16329p;

    public L(K... kArr) {
        this(-9223372036854775807L, kArr);
    }

    public final L a(K... kArr) {
        if (kArr.length == 0) {
            return this;
        }
        int i7 = w2.t.f18881a;
        K[] kArr2 = this.f16328o;
        Object[] objArrCopyOf = Arrays.copyOf(kArr2, kArr2.length + kArr.length);
        System.arraycopy(kArr, 0, objArrCopyOf, kArr2.length, kArr.length);
        return new L(this.f16329p, (K[]) objArrCopyOf);
    }

    public final L c(L l) {
        return l == null ? this : a(l.f16328o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            L l = (L) obj;
            if (Arrays.equals(this.f16328o, l.f16328o) && this.f16329p == l.f16329p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return I0.c.C(this.f16329p) + (Arrays.hashCode(this.f16328o) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f16328o));
        long j3 = this.f16329p;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        K[] kArr = this.f16328o;
        parcel.writeInt(kArr.length);
        for (K k7 : kArr) {
            parcel.writeParcelable(k7, 0);
        }
        parcel.writeLong(this.f16329p);
    }

    public L(long j3, K... kArr) {
        this.f16329p = j3;
        this.f16328o = kArr;
    }

    public L(List list) {
        this((K[]) list.toArray(new K[0]));
    }

    public L(Parcel parcel) {
        this.f16328o = new K[parcel.readInt()];
        int i7 = 0;
        while (true) {
            K[] kArr = this.f16328o;
            if (i7 < kArr.length) {
                kArr[i7] = (K) parcel.readParcelable(K.class.getClassLoader());
                i7++;
            } else {
                this.f16329p = parcel.readLong();
                return;
            }
        }
    }
}
