package Y2;

import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t2.C1486o;
import t2.C1487p;
import t2.I;
import t2.K;
import t2.M;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements K {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1487p f8684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1487p f8685v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f8686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f8688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f8690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8691t;

    static {
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("application/id3");
        f8684u = new C1487p(c1486o);
        C1486o c1486o2 = new C1486o();
        c1486o2.l = M.j("application/x-scte35");
        f8685v = new C1487p(c1486o2);
        CREATOR = new h(8);
    }

    public a(String str, String str2, long j3, long j7, byte[] bArr) {
        this.f8686o = str;
        this.f8687p = str2;
        this.f8688q = j3;
        this.f8689r = j7;
        this.f8690s = bArr;
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8688q == aVar.f8688q && this.f8689r == aVar.f8689r && t.a(this.f8686o, aVar.f8686o) && t.a(this.f8687p, aVar.f8687p) && Arrays.equals(this.f8690s, aVar.f8690s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8691t == 0) {
            String str = this.f8686o;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f8687p;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j3 = this.f8688q;
            int i7 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j7 = this.f8689r;
            this.f8691t = Arrays.hashCode(this.f8690s) + ((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
        }
        return this.f8691t;
    }

    @Override // t2.K
    public final C1487p i() {
        String str = this.f8686o;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f8685v;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f8684u;
            default:
                return null;
        }
    }

    @Override // t2.K
    public final byte[] n() {
        if (i() != null) {
            return this.f8690s;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8686o + ", id=" + this.f8689r + ", durationMs=" + this.f8688q + ", value=" + this.f8687p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8686o);
        parcel.writeString(this.f8687p);
        parcel.writeLong(this.f8688q);
        parcel.writeLong(this.f8689r);
        parcel.writeByteArray(this.f8690s);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f8686o = string;
        this.f8687p = parcel.readString();
        this.f8688q = parcel.readLong();
        this.f8689r = parcel.readLong();
        this.f8690s = parcel.createByteArray();
    }
}
