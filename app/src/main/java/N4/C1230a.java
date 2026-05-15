package n4;

import Z4.w;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1230a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C1230a> CREATOR = new c3.b(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f14539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f14540p;

    public C1230a(String str, Map map) {
        this.f14539o = str;
        this.f14540p = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230a)) {
            return false;
        }
        C1230a c1230a = (C1230a) obj;
        return AbstractC1209k.a(this.f14539o, c1230a.f14539o) && AbstractC1209k.a(this.f14540p, c1230a.f14540p);
    }

    public final int hashCode() {
        return this.f14540p.hashCode() + (this.f14539o.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f14539o + ", extras=" + this.f14540p + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14539o);
        Map map = this.f14540p;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ C1230a(String str) {
        this(str, w.f8819o);
    }
}
