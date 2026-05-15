package t2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: t2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1483l implements Parcelable {
    public static final Parcelable.Creator<C1483l> CREATOR = new c3.b(16);

    /* JADX INFO: renamed from: o */
    public int f16510o;

    /* JADX INFO: renamed from: p */
    public final UUID f16511p;

    /* JADX INFO: renamed from: q */
    public final String f16512q;

    /* JADX INFO: renamed from: r */
    public final String f16513r;

    /* JADX INFO: renamed from: s */
    public final byte[] f16514s;

    public C1483l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16511p = uuid;
        this.f16512q = str;
        str2.getClass();
        this.f16513r = M.j(str2);
        this.f16514s = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC1479h.f16467a;
        UUID uuid3 = this.f16511p;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1483l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1483l c1483l = (C1483l) obj;
        return w2.t.a(this.f16512q, c1483l.f16512q) && w2.t.a(this.f16513r, c1483l.f16513r) && w2.t.a(this.f16511p, c1483l.f16511p) && Arrays.equals(this.f16514s, c1483l.f16514s);
    }

    public final int hashCode() {
        if (this.f16510o == 0) {
            int iHashCode = this.f16511p.hashCode() * 31;
            String str = this.f16512q;
            this.f16510o = Arrays.hashCode(this.f16514s) + A0.e.C(this.f16513r, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f16510o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f16511p;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16512q);
        parcel.writeString(this.f16513r);
        parcel.writeByteArray(this.f16514s);
    }

    public C1483l(Parcel parcel) {
        this.f16511p = new UUID(parcel.readLong(), parcel.readLong());
        this.f16512q = parcel.readString();
        String string = parcel.readString();
        int i7 = w2.t.f18881a;
        this.f16513r = string;
        this.f16514s = parcel.createByteArray();
    }
}
