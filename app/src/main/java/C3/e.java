package c3;

import android.os.Parcel;
import android.os.Parcelable;
import t2.C1487p;
import t2.I;
import t2.K;

/* JADX INFO: loaded from: classes.dex */
public final class e implements K {
    public static final Parcelable.Creator<e> CREATOR = new b(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f10674o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10675p;

    public e(int i7, float f7) {
        this.f10674o = f7;
        this.f10675p = i7;
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f10674o == eVar.f10674o && this.f10675p == eVar.f10675p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f10674o).hashCode() + 527) * 31) + this.f10675p;
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
        return "smta: captureFrameRate=" + this.f10674o + ", svcTemporalLayerCount=" + this.f10675p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f10674o);
        parcel.writeInt(this.f10675p);
    }

    public e(Parcel parcel) {
        this.f10674o = parcel.readFloat();
        this.f10675p = parcel.readInt();
    }
}
