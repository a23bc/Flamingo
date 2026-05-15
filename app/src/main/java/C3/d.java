package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import t2.C1487p;
import t2.I;
import t2.K;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements K {
    public static final Parcelable.Creator<d> CREATOR = new b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f10673o;

    public d(ArrayList arrayList) {
        this.f10673o = arrayList;
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((c) arrayList.get(0)).f10671p;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i7)).f10670o < j3) {
                    z6 = true;
                    break;
                } else {
                    j3 = ((c) arrayList.get(i7)).f10671p;
                    i7++;
                }
            }
        }
        AbstractC1697a.d(!z6);
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f10673o.equals(((d) obj).f10673o);
    }

    public final int hashCode() {
        return this.f10673o.hashCode();
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
        return "SlowMotion: segments=" + this.f10673o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f10673o);
    }
}
