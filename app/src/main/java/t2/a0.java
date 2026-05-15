package t2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new c3.b(18);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f16394t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f16397q;

    static {
        int i7 = w2.t.f18881a;
        f16392r = Integer.toString(0, 36);
        f16393s = Integer.toString(1, 36);
        f16394t = Integer.toString(2, 36);
    }

    public a0(int i7, int i8, int i9) {
        this.f16395o = i7;
        this.f16396p = i8;
        this.f16397q = i9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        int i7 = this.f16395o - a0Var.f16395o;
        if (i7 != 0) {
            return i7;
        }
        int i8 = this.f16396p - a0Var.f16396p;
        return i8 == 0 ? this.f16397q - a0Var.f16397q : i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f16395o == a0Var.f16395o && this.f16396p == a0Var.f16396p && this.f16397q == a0Var.f16397q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f16395o * 31) + this.f16396p) * 31) + this.f16397q;
    }

    public final String toString() {
        return this.f16395o + "." + this.f16396p + "." + this.f16397q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f16395o);
        parcel.writeInt(this.f16396p);
        parcel.writeInt(this.f16397q);
    }

    public a0(Parcel parcel) {
        this.f16395o = parcel.readInt();
        this.f16396p = parcel.readInt();
        this.f16397q = parcel.readInt();
    }
}
