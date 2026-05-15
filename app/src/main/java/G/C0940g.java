package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0940g implements Parcelable {
    public static final Parcelable.Creator<C0940g> CREATOR = new c3.b(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IntentSender f12258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Intent f12259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12261r;

    public C0940g(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f12258o = intentSender;
        this.f12259p = intent;
        this.f12260q = i7;
        this.f12261r = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeParcelable(this.f12258o, i7);
        parcel.writeParcelable(this.f12259p, i7);
        parcel.writeInt(this.f12260q);
        parcel.writeInt(this.f12261r);
    }
}
