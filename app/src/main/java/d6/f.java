package d6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c3.b(9);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f11290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11291p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f11292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f11293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f11294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f11296u;

    public f(String str, long j3, long j7, String str2, List list, String str3, List list2) {
        AbstractC1209k.f(str, "agent");
        this.f11290o = str;
        this.f11291p = j3;
        this.f11292q = j7;
        this.f11293r = str2;
        this.f11294s = list;
        this.f11295t = str3;
        this.f11296u = list2;
    }

    public static f a(f fVar, long j3, String str, ArrayList arrayList, int i7) {
        String str2 = (i7 & 1) != 0 ? fVar.f11290o : "countdown";
        if ((i7 & 4) != 0) {
            j3 = fVar.f11292q;
        }
        long j7 = j3;
        List list = fVar.f11294s;
        if ((i7 & 32) != 0) {
            str = fVar.f11295t;
        }
        String str3 = str;
        List list2 = arrayList;
        if ((i7 & 64) != 0) {
            list2 = fVar.f11296u;
        }
        AbstractC1209k.f(str2, "agent");
        return new f(str2, fVar.f11291p, j7, fVar.f11293r, list, str3, list2);
    }

    public final boolean c() {
        return AbstractC1209k.a(this.f11290o, "countdown");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC1209k.a(this.f11290o, fVar.f11290o) && this.f11291p == fVar.f11291p && this.f11292q == fVar.f11292q && AbstractC1209k.a(this.f11293r, fVar.f11293r) && AbstractC1209k.a(this.f11294s, fVar.f11294s) && AbstractC1209k.a(this.f11295t, fVar.f11295t) && AbstractC1209k.a(this.f11296u, fVar.f11296u);
    }

    public final int hashCode() {
        int iHashCode = this.f11290o.hashCode() * 31;
        long j3 = this.f11291p;
        int i7 = (iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j7 = this.f11292q;
        int i8 = (i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        String str = this.f11293r;
        int iHashCode2 = (this.f11294s.hashCode() + ((i8 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f11295t;
        return this.f11296u.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "YosLrcEntry(agent=" + this.f11290o + ", begin=" + this.f11291p + ", end=" + this.f11292q + ", lyricsTextLine=" + this.f11293r + ", spans=" + this.f11294s + ", translation=" + this.f11295t + ", otherLrcEntry=" + this.f11296u + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeString(this.f11290o);
        parcel.writeLong(this.f11291p);
        parcel.writeLong(this.f11292q);
        parcel.writeString(this.f11293r);
        List list = this.f11294s;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).writeToParcel(parcel, i7);
        }
        parcel.writeString(this.f11295t);
        List list2 = this.f11296u;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).writeToParcel(parcel, i7);
        }
    }
}
