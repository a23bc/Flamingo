package b3;

import android.os.Parcel;
import android.os.Parcelable;
import w2.t;

/* JADX INFO: renamed from: b3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689e extends AbstractC0693i {
    public static final Parcelable.Creator<C0689e> CREATOR = new K1.h(21);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10375r;

    public C0689e(String str, String str2, String str3) {
        super("COMM");
        this.f10373p = str;
        this.f10374q = str2;
        this.f10375r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0689e.class == obj.getClass()) {
            C0689e c0689e = (C0689e) obj;
            if (t.a(this.f10374q, c0689e.f10374q) && t.a(this.f10373p, c0689e.f10373p) && t.a(this.f10375r, c0689e.f10375r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10373p;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10374q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10375r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": language=" + this.f10373p + ", description=" + this.f10374q + ", text=" + this.f10375r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10385o);
        parcel.writeString(this.f10373p);
        parcel.writeString(this.f10375r);
    }

    public C0689e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10373p = string;
        this.f10374q = parcel.readString();
        this.f10375r = parcel.readString();
    }
}
