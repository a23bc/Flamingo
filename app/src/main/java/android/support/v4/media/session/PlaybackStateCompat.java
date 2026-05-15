package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f8922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f8923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f8926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f8928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f8929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f8930y;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new c();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final String f8931o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final CharSequence f8932p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f8933q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Bundle f8934r;

        public CustomAction(Parcel parcel) {
            this.f8931o = parcel.readString();
            this.f8932p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8933q = parcel.readInt();
            this.f8934r = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f8932p) + ", mIcon=" + this.f8933q + ", mExtras=" + this.f8934r;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f8931o);
            TextUtils.writeToParcel(this.f8932p, parcel, i7);
            parcel.writeInt(this.f8933q);
            parcel.writeBundle(this.f8934r);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f8920o = parcel.readInt();
        this.f8921p = parcel.readLong();
        this.f8923r = parcel.readFloat();
        this.f8927v = parcel.readLong();
        this.f8922q = parcel.readLong();
        this.f8924s = parcel.readLong();
        this.f8926u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8928w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f8929x = parcel.readLong();
        this.f8930y = parcel.readBundle(b.class.getClassLoader());
        this.f8925t = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f8920o + ", position=" + this.f8921p + ", buffered position=" + this.f8922q + ", speed=" + this.f8923r + ", updated=" + this.f8927v + ", actions=" + this.f8924s + ", error code=" + this.f8925t + ", error message=" + this.f8926u + ", custom actions=" + this.f8928w + ", active item id=" + this.f8929x + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8920o);
        parcel.writeLong(this.f8921p);
        parcel.writeFloat(this.f8923r);
        parcel.writeLong(this.f8927v);
        parcel.writeLong(this.f8922q);
        parcel.writeLong(this.f8924s);
        TextUtils.writeToParcel(this.f8926u, parcel, i7);
        parcel.writeTypedList(this.f8928w);
        parcel.writeLong(this.f8929x);
        parcel.writeBundle(this.f8930y);
        parcel.writeInt(this.f8925t);
    }
}
