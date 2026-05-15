package Y1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new K1.h(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Bundle f8663A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f8664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f8665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f8666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8668s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8669t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8670u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8671v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f8672w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f8673x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f8674y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8675z;

    public u(Parcel parcel) {
        this.f8664o = parcel.readString();
        this.f8665p = parcel.readString();
        this.f8666q = parcel.readInt() != 0;
        this.f8667r = parcel.readInt();
        this.f8668s = parcel.readInt();
        this.f8669t = parcel.readString();
        this.f8670u = parcel.readInt() != 0;
        this.f8671v = parcel.readInt() != 0;
        this.f8672w = parcel.readInt() != 0;
        this.f8673x = parcel.readBundle();
        this.f8674y = parcel.readInt() != 0;
        this.f8663A = parcel.readBundle();
        this.f8675z = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f8664o);
        sb.append(" (");
        sb.append(this.f8665p);
        sb.append(")}:");
        if (this.f8666q) {
            sb.append(" fromLayout");
        }
        int i7 = this.f8668s;
        if (i7 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i7));
        }
        String str = this.f8669t;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f8670u) {
            sb.append(" retainInstance");
        }
        if (this.f8671v) {
            sb.append(" removing");
        }
        if (this.f8672w) {
            sb.append(" detached");
        }
        if (this.f8674y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f8664o);
        parcel.writeString(this.f8665p);
        parcel.writeInt(this.f8666q ? 1 : 0);
        parcel.writeInt(this.f8667r);
        parcel.writeInt(this.f8668s);
        parcel.writeString(this.f8669t);
        parcel.writeInt(this.f8670u ? 1 : 0);
        parcel.writeInt(this.f8671v ? 1 : 0);
        parcel.writeInt(this.f8672w ? 1 : 0);
        parcel.writeBundle(this.f8673x);
        parcel.writeInt(this.f8674y ? 1 : 0);
        parcel.writeBundle(this.f8663A);
        parcel.writeInt(this.f8675z);
    }
}
