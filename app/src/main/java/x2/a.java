package X2;

import K1.h;
import Z1.l;
import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: loaded from: classes.dex */
public final class a implements K {
    public static final Parcelable.Creator<a> CREATOR = new h(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8265p;

    public a(int i7, String str) {
        this.f8264o = i7;
        this.f8265p = str;
    }

    @Override // t2.K
    public final /* synthetic */ void b(I i7) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f8264o);
        sb.append(",url=");
        return l.t(sb, this.f8265p, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8265p);
        parcel.writeInt(this.f8264o);
    }
}
