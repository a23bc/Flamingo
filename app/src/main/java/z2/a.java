package Z2;

import A0.e;
import D4.d;
import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t2.C1487p;
import t2.I;
import t2.K;
import t2.M;
import w2.m;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements K {
    public static final Parcelable.Creator<a> CREATOR = new h(9);

    /* JADX INFO: renamed from: o */
    public final int f8790o;

    /* JADX INFO: renamed from: p */
    public final String f8791p;

    /* JADX INFO: renamed from: q */
    public final String f8792q;

    /* JADX INFO: renamed from: r */
    public final int f8793r;

    /* JADX INFO: renamed from: s */
    public final int f8794s;

    /* JADX INFO: renamed from: t */
    public final int f8795t;

    /* JADX INFO: renamed from: u */
    public final int f8796u;

    /* JADX INFO: renamed from: v */
    public final byte[] f8797v;

    public a(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f8790o = i7;
        this.f8791p = str;
        this.f8792q = str2;
        this.f8793r = i8;
        this.f8794s = i9;
        this.f8795t = i10;
        this.f8796u = i11;
        this.f8797v = bArr;
    }

    public static a a(m mVar) {
        int iG = mVar.g();
        String strJ = M.j(mVar.s(mVar.g(), d.f1567a));
        String strS = mVar.s(mVar.g(), d.f1569c);
        int iG2 = mVar.g();
        int iG3 = mVar.g();
        int iG4 = mVar.g();
        int iG5 = mVar.g();
        int iG6 = mVar.g();
        byte[] bArr = new byte[iG6];
        mVar.e(bArr, 0, iG6);
        return new a(iG, strJ, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // t2.K
    public final void b(I i7) {
        i7.a(this.f8790o, this.f8797v);
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
            if (this.f8790o == aVar.f8790o && this.f8791p.equals(aVar.f8791p) && this.f8792q.equals(aVar.f8792q) && this.f8793r == aVar.f8793r && this.f8794s == aVar.f8794s && this.f8795t == aVar.f8795t && this.f8796u == aVar.f8796u && Arrays.equals(this.f8797v, aVar.f8797v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8797v) + ((((((((e.C(this.f8792q, e.C(this.f8791p, (527 + this.f8790o) * 31, 31), 31) + this.f8793r) * 31) + this.f8794s) * 31) + this.f8795t) * 31) + this.f8796u) * 31);
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
        return "Picture: mimeType=" + this.f8791p + ", description=" + this.f8792q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8790o);
        parcel.writeString(this.f8791p);
        parcel.writeString(this.f8792q);
        parcel.writeInt(this.f8793r);
        parcel.writeInt(this.f8794s);
        parcel.writeInt(this.f8795t);
        parcel.writeInt(this.f8796u);
        parcel.writeByteArray(this.f8797v);
    }

    public a(Parcel parcel) {
        this.f8790o = parcel.readInt();
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f8791p = string;
        this.f8792q = parcel.readString();
        this.f8793r = parcel.readInt();
        this.f8794s = parcel.readInt();
        this.f8795t = parcel.readInt();
        this.f8796u = parcel.readInt();
        this.f8797v = parcel.createByteArray();
    }
}
