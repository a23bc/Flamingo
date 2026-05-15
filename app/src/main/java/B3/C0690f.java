package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690f extends AbstractC0693i {
    public static final Parcelable.Creator<C0690f> CREATOR = new K1.h(22);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f10379s;

    public C0690f(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.f10376p = str;
        this.f10377q = str2;
        this.f10378r = str3;
        this.f10379s = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0690f.class == obj.getClass()) {
            C0690f c0690f = (C0690f) obj;
            if (t.a(this.f10376p, c0690f.f10376p) && t.a(this.f10377q, c0690f.f10377q) && t.a(this.f10378r, c0690f.f10378r) && Arrays.equals(this.f10379s, c0690f.f10379s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10376p;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10377q;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f10378r;
        return Arrays.hashCode(this.f10379s) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": mimeType=" + this.f10376p + ", filename=" + this.f10377q + ", description=" + this.f10378r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10376p);
        parcel.writeString(this.f10377q);
        parcel.writeString(this.f10378r);
        parcel.writeByteArray(this.f10379s);
    }

    public C0690f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10376p = string;
        this.f10377q = parcel.readString();
        this.f10378r = parcel.readString();
        this.f10379s = parcel.createByteArray();
    }
}
