package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0696l extends AbstractC0693i {
    public static final Parcelable.Creator<C0696l> CREATOR = new K1.h(24);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f10393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f10394t;

    public C0696l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f10390p = i7;
        this.f10391q = i8;
        this.f10392r = i9;
        this.f10393s = iArr;
        this.f10394t = iArr2;
    }

    @Override // b3.AbstractC0693i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0696l.class == obj.getClass()) {
            C0696l c0696l = (C0696l) obj;
            if (this.f10390p == c0696l.f10390p && this.f10391q == c0696l.f10391q && this.f10392r == c0696l.f10392r && Arrays.equals(this.f10393s, c0696l.f10393s) && Arrays.equals(this.f10394t, c0696l.f10394t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10394t) + ((Arrays.hashCode(this.f10393s) + ((((((527 + this.f10390p) * 31) + this.f10391q) * 31) + this.f10392r) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f10390p);
        parcel.writeInt(this.f10391q);
        parcel.writeInt(this.f10392r);
        parcel.writeIntArray(this.f10393s);
        parcel.writeIntArray(this.f10394t);
    }

    public C0696l(Parcel parcel) {
        super("MLLT");
        this.f10390p = parcel.readInt();
        this.f10391q = parcel.readInt();
        this.f10392r = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i7 = t.f18881a;
        this.f10393s = iArrCreateIntArray;
        this.f10394t = parcel.createIntArray();
    }
}
