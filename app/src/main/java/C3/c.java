package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w2.AbstractC1697a;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f10671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10672q;

    public c(int i7, long j3, long j7) {
        AbstractC1697a.d(j3 < j7);
        this.f10670o = j3;
        this.f10671p = j7;
        this.f10672q = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f10670o == cVar.f10670o && this.f10671p == cVar.f10671p && this.f10672q == cVar.f10672q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10670o), Long.valueOf(this.f10671p), Integer.valueOf(this.f10672q)});
    }

    public final String toString() {
        int i7 = t.f18881a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f10670o + ", endTimeMs=" + this.f10671p + ", speedDivisor=" + this.f10672q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10670o);
        parcel.writeLong(this.f10671p);
        parcel.writeInt(this.f10672q);
    }
}
