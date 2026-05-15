package androidx.versionedparcelable;

import K1.h;
import M3.c;
import M3.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new h(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f9833o;

    public ParcelImpl(d dVar) {
        this.f9833o = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new c(parcel).l(this.f9833o);
    }

    public ParcelImpl(Parcel parcel) {
        this.f9833o = new c(parcel).h();
    }
}
