package android.support.v4.media;

import K1.h;
import Z1.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f8907o;

    static {
        C1450e c1450e = new C1450e(0);
        l.x(1, c1450e, "android.media.metadata.TITLE", 1, "android.media.metadata.ARTIST");
        l.x(0, c1450e, "android.media.metadata.DURATION", 1, "android.media.metadata.ALBUM");
        l.x(1, c1450e, "android.media.metadata.AUTHOR", 1, "android.media.metadata.WRITER");
        l.x(1, c1450e, "android.media.metadata.COMPOSER", 1, "android.media.metadata.COMPILATION");
        l.x(1, c1450e, "android.media.metadata.DATE", 0, "android.media.metadata.YEAR");
        l.x(1, c1450e, "android.media.metadata.GENRE", 0, "android.media.metadata.TRACK_NUMBER");
        l.x(0, c1450e, "android.media.metadata.NUM_TRACKS", 0, "android.media.metadata.DISC_NUMBER");
        l.x(1, c1450e, "android.media.metadata.ALBUM_ARTIST", 2, "android.media.metadata.ART");
        l.x(1, c1450e, "android.media.metadata.ART_URI", 2, "android.media.metadata.ALBUM_ART");
        l.x(1, c1450e, "android.media.metadata.ALBUM_ART_URI", 3, "android.media.metadata.USER_RATING");
        l.x(3, c1450e, "android.media.metadata.RATING", 1, "android.media.metadata.DISPLAY_TITLE");
        l.x(1, c1450e, "android.media.metadata.DISPLAY_SUBTITLE", 1, "android.media.metadata.DISPLAY_DESCRIPTION");
        l.x(2, c1450e, "android.media.metadata.DISPLAY_ICON", 1, "android.media.metadata.DISPLAY_ICON_URI");
        l.x(1, c1450e, "android.media.metadata.MEDIA_ID", 0, "android.media.metadata.BT_FOLDER_TYPE");
        l.x(1, c1450e, "android.media.metadata.MEDIA_URI", 0, "android.media.metadata.ADVERTISEMENT");
        c1450e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new h(15);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f8907o = parcel.readBundle(android.support.v4.media.session.b.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f8907o);
    }
}
