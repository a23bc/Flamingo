package com.hchen.superlyricapi;

import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public class SuperLyricData implements Parcelable {
    public static final Parcelable.Creator<SuperLyricData> CREATOR = new Parcelable.Creator<SuperLyricData>() { // from class: com.hchen.superlyricapi.SuperLyricData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuperLyricData createFromParcel(Parcel parcel) {
            return new SuperLyricData(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SuperLyricData[] newArray(int i7) {
            return new SuperLyricData[i7];
        }
    };

    @Deprecated(since = "1.8")
    private String base64Icon;
    private int delay;
    private Bundle extra;
    private String lyric;
    private MediaMetadata mediaMetadata;
    private String packageName;
    private PlaybackState playbackState;

    public /* synthetic */ SuperLyricData(Parcel parcel, int i7) {
        this(parcel);
    }

    public static SuperLyricData unmarshall(Parcel parcel) {
        parcel.setDataPosition(0);
        return new SuperLyricData(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SuperLyricData) {
            SuperLyricData superLyricData = (SuperLyricData) obj;
            if (this.delay == superLyricData.delay && Objects.equals(this.lyric, superLyricData.lyric) && Objects.equals(this.packageName, superLyricData.packageName) && Objects.equals(this.base64Icon, superLyricData.base64Icon) && Objects.equals(this.mediaMetadata, superLyricData.mediaMetadata) && Objects.equals(this.playbackState, superLyricData.playbackState) && Objects.equals(this.extra, superLyricData.extra)) {
                return true;
            }
        }
        return false;
    }

    public String getAlbum() {
        MediaMetadata mediaMetadata = this.mediaMetadata;
        return mediaMetadata == null ? "Unknown" : (String) Optional.ofNullable(mediaMetadata.getString("android.media.metadata.ALBUM")).orElse("Unknown");
    }

    public String getArtist() {
        MediaMetadata mediaMetadata = this.mediaMetadata;
        return mediaMetadata == null ? "Unknown" : (String) Optional.ofNullable(mediaMetadata.getString("android.media.metadata.ARTIST")).orElse("Unknown");
    }

    @Deprecated(since = "1.8")
    public String getBase64Icon() {
        return this.base64Icon;
    }

    public int getDelay() {
        return this.delay;
    }

    public Bundle getExtra() {
        return this.extra;
    }

    public String getLyric() {
        return this.lyric;
    }

    public MediaMetadata getMediaMetadata() {
        return this.mediaMetadata;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public PlaybackState getPlaybackState() {
        return this.playbackState;
    }

    public String getTitle() {
        MediaMetadata mediaMetadata = this.mediaMetadata;
        return mediaMetadata == null ? "Unknown" : (String) Optional.ofNullable(mediaMetadata.getString("android.media.metadata.TITLE")).orElse("Unknown");
    }

    public int hashCode() {
        return Objects.hash(this.lyric, this.packageName, this.base64Icon, Integer.valueOf(this.delay), this.mediaMetadata, this.playbackState, this.extra);
    }

    @Deprecated(since = "1.8")
    public boolean isExistBase64Icon() {
        return !this.base64Icon.isEmpty();
    }

    public boolean isExistDelay() {
        return this.delay > 0;
    }

    public boolean isExistExtra() {
        return this.extra != null;
    }

    public boolean isExistLyric() {
        return !this.lyric.isEmpty();
    }

    public boolean isExistMediaMetadata() {
        return this.mediaMetadata != null;
    }

    public boolean isExistPackageName() {
        return !this.packageName.isEmpty();
    }

    public boolean isExistPlaybackState() {
        return this.playbackState != null;
    }

    public Parcel marshall() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        return parcelObtain;
    }

    @Deprecated(since = "1.8")
    public SuperLyricData setBase64Icon(String str) {
        if (str == null) {
            str = "";
        }
        this.base64Icon = str;
        return this;
    }

    public SuperLyricData setDelay(int i7) {
        this.delay = i7;
        return this;
    }

    public SuperLyricData setExtra(Bundle bundle) {
        this.extra = bundle;
        return this;
    }

    public SuperLyricData setLyric(String str) {
        if (str == null) {
            str = "";
        }
        this.lyric = str;
        return this;
    }

    public SuperLyricData setMediaMetadata(MediaMetadata mediaMetadata) {
        this.mediaMetadata = SuperLyricTool.removeMediaMetadataBitmap(mediaMetadata);
        return this;
    }

    public SuperLyricData setPackageName(String str) {
        if (str == null) {
            str = "";
        }
        this.packageName = str;
        return this;
    }

    public SuperLyricData setPlaybackState(PlaybackState playbackState) {
        this.playbackState = playbackState;
        return this;
    }

    public String toString() {
        return "SuperLyricData{lyric='" + this.lyric + "', packageName='" + this.packageName + "', base64Icon='" + this.base64Icon + "', delay=" + this.delay + ", mediaMetadata=" + this.mediaMetadata + ", playbackState=" + this.playbackState + ", extra=" + this.extra + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.lyric);
        parcel.writeString(this.packageName);
        parcel.writeString(this.base64Icon);
        parcel.writeInt(this.delay);
        parcel.writeParcelable(this.mediaMetadata, i7);
        parcel.writeParcelable(this.playbackState, i7);
        parcel.writeBundle(this.extra);
    }

    public SuperLyricData() {
        this.lyric = "";
        this.packageName = "";
        this.base64Icon = "";
        this.delay = 0;
    }

    private SuperLyricData(Parcel parcel) {
        this.lyric = "";
        this.packageName = "";
        this.base64Icon = "";
        this.delay = 0;
        this.lyric = (String) Optional.ofNullable(parcel.readString()).orElse("");
        this.packageName = (String) Optional.ofNullable(parcel.readString()).orElse("");
        this.base64Icon = (String) Optional.ofNullable(parcel.readString()).orElse("");
        this.delay = parcel.readInt();
        this.mediaMetadata = (MediaMetadata) parcel.readParcelable(MediaMetadata.class.getClassLoader());
        this.playbackState = (PlaybackState) parcel.readParcelable(PlaybackState.class.getClassLoader());
        this.extra = parcel.readBundle(getClass().getClassLoader());
    }
}
