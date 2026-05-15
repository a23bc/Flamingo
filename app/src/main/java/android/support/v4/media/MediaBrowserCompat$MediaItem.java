package android.support.v4.media;

import K1.h;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new h(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MediaDescriptionCompat f8897p;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        if (TextUtils.isEmpty(mediaDescriptionCompat.f8898o)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f8896o = i7;
        this.f8897p = mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f8896o + ", mDescription=" + this.f8897p + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f8896o);
        this.f8897p.writeToParcel(parcel, i7);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f8896o = parcel.readInt();
        this.f8897p = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
