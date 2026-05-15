package b3;

import android.os.Parcel;
import android.os.Parcelable;
import w2.t;

/* JADX INFO: renamed from: b3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0695k extends AbstractC0693i {
    public static final Parcelable.Creator<C0695k> CREATOR = new K1.h(23);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10389r;

    public C0695k(String str, String str2, String str3) {
        super("----");
        this.f10387p = str;
        this.f10388q = str2;
        this.f10389r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0695k.class == obj.getClass()) {
            C0695k c0695k = (C0695k) obj;
            if (t.a(this.f10388q, c0695k.f10388q) && t.a(this.f10387p, c0695k.f10387p) && t.a(this.f10389r, c0695k.f10389r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10387p;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10388q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10389r;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": domain=" + this.f10387p + ", description=" + this.f10388q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10385o);
        parcel.writeString(this.f10387p);
        parcel.writeString(this.f10389r);
    }

    public C0695k(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10387p = string;
        this.f10388q = parcel.readString();
        this.f10389r = parcel.readString();
    }
}
