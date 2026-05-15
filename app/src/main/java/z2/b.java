package Z2;

import A0.e;
import I0.c;
import K1.h;
import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public class b implements K {
    public static final Parcelable.Creator<b> CREATOR = new h(10);

    /* JADX INFO: renamed from: o */
    public final String f8798o;

    /* JADX INFO: renamed from: p */
    public final String f8799p;

    public b(String str, String str2) {
        this.f8798o = c.W(str);
        this.f8799p = str2;
    }

    @Override // t2.K
    public final void b(I i7) {
        String str;
        String str2 = this.f8798o;
        str2.getClass();
        str = this.f8799p;
        switch (str2) {
            case "ALBUM":
                i7.f16241c = str;
                break;
            case "TITLE":
                i7.f16239a = str;
                break;
            case "DESCRIPTION":
                i7.f16245g = str;
                break;
            case "ALBUMARTIST":
                i7.f16242d = str;
                break;
            case "ARTIST":
                i7.f16240b = str;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8798o.equals(bVar.f8798o) && this.f8799p.equals(bVar.f8799p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8799p.hashCode() + e.C(this.f8798o, 527, 31);
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
        return "VC: " + this.f8798o + "=" + this.f8799p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8798o);
        parcel.writeString(this.f8799p);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f8798o = string;
        this.f8799p = parcel.readString();
    }
}
