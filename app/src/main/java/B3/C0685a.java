package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t2.I;
import w2.t;

/* JADX INFO: renamed from: b3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685a extends AbstractC0693i {
    public static final Parcelable.Creator<C0685a> CREATOR = new K1.h(17);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f10360s;

    public C0685a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f10357p = str;
        this.f10358q = str2;
        this.f10359r = i7;
        this.f10360s = bArr;
    }

    @Override // b3.AbstractC0693i, t2.K
    public final void b(I i7) {
        i7.a(this.f10359r, this.f10360s);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0685a.class == obj.getClass()) {
            C0685a c0685a = (C0685a) obj;
            if (this.f10359r == c0685a.f10359r && t.a(this.f10357p, c0685a.f10357p) && t.a(this.f10358q, c0685a.f10358q) && Arrays.equals(this.f10360s, c0685a.f10360s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (527 + this.f10359r) * 31;
        String str = this.f10357p;
        int iHashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10358q;
        return Arrays.hashCode(this.f10360s) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": mimeType=" + this.f10357p + ", description=" + this.f10358q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10357p);
        parcel.writeString(this.f10358q);
        parcel.writeInt(this.f10359r);
        parcel.writeByteArray(this.f10360s);
    }

    public C0685a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10357p = string;
        this.f10358q = parcel.readString();
        this.f10359r = parcel.readInt();
        this.f10360s = parcel.createByteArray();
    }
}
