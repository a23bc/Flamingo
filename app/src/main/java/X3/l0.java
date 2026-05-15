package x3;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new k0(0);

    /* JADX INFO: renamed from: o */
    public final String f20061o;

    /* JADX INFO: renamed from: p */
    public final CharSequence f20062p;

    /* JADX INFO: renamed from: q */
    public final int f20063q;

    /* JADX INFO: renamed from: r */
    public final Bundle f20064r;

    /* JADX INFO: renamed from: s */
    public PlaybackState.CustomAction f20065s;

    public l0(String str, CharSequence charSequence, int i7, Bundle bundle) {
        this.f20061o = str;
        this.f20062p = charSequence;
        this.f20063q = i7;
        this.f20064r = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f20062p) + ", mIcon=" + this.f20063q + ", mExtras=" + this.f20064r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f20061o);
        TextUtils.writeToParcel(this.f20062p, parcel, i7);
        parcel.writeInt(this.f20063q);
        parcel.writeBundle(this.f20064r);
    }

    public l0(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.f20061o = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f20062p = charSequence;
        this.f20063q = parcel.readInt();
        this.f20064r = parcel.readBundle(Z.class.getClassLoader());
    }
}
