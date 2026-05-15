package b3;

import android.os.Parcel;
import android.os.Parcelable;
import w2.t;

/* JADX INFO: renamed from: b3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699o extends AbstractC0693i {
    public static final Parcelable.Creator<C0699o> CREATOR = new K1.h(27);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10400q;

    public C0699o(String str, String str2, String str3) {
        super(str);
        this.f10399p = str2;
        this.f10400q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0699o.class == obj.getClass()) {
            C0699o c0699o = (C0699o) obj;
            if (this.f10385o.equals(c0699o.f10385o) && t.a(this.f10399p, c0699o.f10399p) && t.a(this.f10400q, c0699o.f10400q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = A0.e.C(this.f10385o, 527, 31);
        String str = this.f10399p;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10400q;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": url=" + this.f10400q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10385o);
        parcel.writeString(this.f10399p);
        parcel.writeString(this.f10400q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0699o(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f18881a;
        super(string);
        this.f10399p = parcel.readString();
        this.f10400q = parcel.readString();
    }
}
