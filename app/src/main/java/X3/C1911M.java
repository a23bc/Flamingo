package x3;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t.C1450e;

/* JADX INFO: renamed from: x3.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1911M implements Parcelable {
    public static final Parcelable.Creator<C1911M> CREATOR;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1450e f19993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f19994r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f19995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MediaMetadata f19996p;

    static {
        C1450e c1450e = new C1450e(0);
        f19993q = c1450e;
        Z1.l.x(1, c1450e, "android.media.metadata.TITLE", 1, "android.media.metadata.ARTIST");
        Z1.l.x(0, c1450e, "android.media.metadata.DURATION", 1, "android.media.metadata.ALBUM");
        Z1.l.x(1, c1450e, "android.media.metadata.AUTHOR", 1, "android.media.metadata.WRITER");
        Z1.l.x(1, c1450e, "android.media.metadata.COMPOSER", 1, "android.media.metadata.COMPILATION");
        Z1.l.x(1, c1450e, "android.media.metadata.DATE", 0, "android.media.metadata.YEAR");
        Z1.l.x(1, c1450e, "android.media.metadata.GENRE", 0, "android.media.metadata.TRACK_NUMBER");
        Z1.l.x(0, c1450e, "android.media.metadata.NUM_TRACKS", 0, "android.media.metadata.DISC_NUMBER");
        Z1.l.x(1, c1450e, "android.media.metadata.ALBUM_ARTIST", 2, "android.media.metadata.ART");
        Z1.l.x(1, c1450e, "android.media.metadata.ART_URI", 2, "android.media.metadata.ALBUM_ART");
        Z1.l.x(1, c1450e, "android.media.metadata.ALBUM_ART_URI", 3, "android.media.metadata.USER_RATING");
        Z1.l.x(3, c1450e, "android.media.metadata.RATING", 1, "android.media.metadata.DISPLAY_TITLE");
        Z1.l.x(1, c1450e, "android.media.metadata.DISPLAY_SUBTITLE", 1, "android.media.metadata.DISPLAY_DESCRIPTION");
        Z1.l.x(2, c1450e, "android.media.metadata.DISPLAY_ICON", 1, "android.media.metadata.DISPLAY_ICON_URI");
        Z1.l.x(1, c1450e, "android.media.metadata.MEDIA_ID", 0, "android.media.metadata.BT_FOLDER_TYPE");
        Z1.l.x(1, c1450e, "android.media.metadata.MEDIA_URI", 0, "android.media.metadata.ADVERTISEMENT");
        c1450e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f19994r = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        CREATOR = new c3.b(24);
    }

    public C1911M(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f19995o = bundle2;
        Z.a(bundle2);
    }

    public final long a(String str) {
        return this.f19995o.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeBundle(this.f19995o);
    }

    public C1911M(Parcel parcel) {
        Bundle bundle = parcel.readBundle(Z.class.getClassLoader());
        bundle.getClass();
        this.f19995o = bundle;
    }
}
