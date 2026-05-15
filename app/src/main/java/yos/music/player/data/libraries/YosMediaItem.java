package yos.music.player.data.libraries;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class YosMediaItem implements Parcelable {
    public static final Parcelable.Creator<YosMediaItem> CREATOR = new Creator();
    private final Long addDate;
    private final String album;
    private final String albumArtists;
    private final Long albumId;
    private final Long artistId;
    private final String artists;
    private final String author;
    private final Integer cdTrackNumber;
    private final String compilation;
    private final String composer;
    private final Integer discNumber;
    private final long duration;
    private final String genre;
    private final Long genreId;
    private final String mediaId;
    private final String mimeType;
    private final Long modifiedDate;
    private final Integer recordingDay;
    private final Integer recordingMonth;
    private final Integer recordingYear;
    private final Integer releaseYear;
    private final Uri thumb;
    private final String title;
    private final Integer trackNumber;
    private final Uri uri;
    private final String writer;

    public static final class Creator implements Parcelable.Creator<YosMediaItem> {
        @Override // android.os.Parcelable.Creator
        public final YosMediaItem createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            return new YosMediaItem((Uri) parcel.readParcelable(YosMediaItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(YosMediaItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final YosMediaItem[] newArray(int i7) {
            return new YosMediaItem[i7];
        }
    }

    public YosMediaItem(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Uri uri2, Integer num, Integer num2, String str10, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l7, Long l8, String str11, Long l9, long j3, Long l10, Integer num7) {
        this.uri = uri;
        this.mediaId = str;
        this.mimeType = str2;
        this.title = str3;
        this.writer = str4;
        this.compilation = str5;
        this.composer = str6;
        this.artists = str7;
        this.album = str8;
        this.albumArtists = str9;
        this.thumb = uri2;
        this.trackNumber = num;
        this.discNumber = num2;
        this.genre = str10;
        this.recordingDay = num3;
        this.recordingMonth = num4;
        this.recordingYear = num5;
        this.releaseYear = num6;
        this.artistId = l;
        this.albumId = l7;
        this.genreId = l8;
        this.author = str11;
        this.addDate = l9;
        this.duration = j3;
        this.modifiedDate = l10;
        this.cdTrackNumber = num7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YosMediaItem)) {
            return false;
        }
        YosMediaItem yosMediaItem = (YosMediaItem) obj;
        return AbstractC1209k.a(this.uri, yosMediaItem.uri) && AbstractC1209k.a(this.mediaId, yosMediaItem.mediaId) && AbstractC1209k.a(this.mimeType, yosMediaItem.mimeType) && AbstractC1209k.a(this.title, yosMediaItem.title) && AbstractC1209k.a(this.writer, yosMediaItem.writer) && AbstractC1209k.a(this.compilation, yosMediaItem.compilation) && AbstractC1209k.a(this.composer, yosMediaItem.composer) && AbstractC1209k.a(this.artists, yosMediaItem.artists) && AbstractC1209k.a(this.album, yosMediaItem.album) && AbstractC1209k.a(this.albumArtists, yosMediaItem.albumArtists) && AbstractC1209k.a(this.thumb, yosMediaItem.thumb) && AbstractC1209k.a(this.trackNumber, yosMediaItem.trackNumber) && AbstractC1209k.a(this.discNumber, yosMediaItem.discNumber) && AbstractC1209k.a(this.genre, yosMediaItem.genre) && AbstractC1209k.a(this.recordingDay, yosMediaItem.recordingDay) && AbstractC1209k.a(this.recordingMonth, yosMediaItem.recordingMonth) && AbstractC1209k.a(this.recordingYear, yosMediaItem.recordingYear) && AbstractC1209k.a(this.releaseYear, yosMediaItem.releaseYear) && AbstractC1209k.a(this.artistId, yosMediaItem.artistId) && AbstractC1209k.a(this.albumId, yosMediaItem.albumId) && AbstractC1209k.a(this.genreId, yosMediaItem.genreId) && AbstractC1209k.a(this.author, yosMediaItem.author) && AbstractC1209k.a(this.addDate, yosMediaItem.addDate) && this.duration == yosMediaItem.duration && AbstractC1209k.a(this.modifiedDate, yosMediaItem.modifiedDate) && AbstractC1209k.a(this.cdTrackNumber, yosMediaItem.cdTrackNumber);
    }

    public final Long getAddDate() {
        return this.addDate;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getAlbumArtists() {
        return this.albumArtists;
    }

    public final Long getAlbumId() {
        return this.albumId;
    }

    public final Long getArtistId() {
        return this.artistId;
    }

    public final String getArtists() {
        return this.artists;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final Integer getCdTrackNumber() {
        return this.cdTrackNumber;
    }

    public final String getCompilation() {
        return this.compilation;
    }

    public final String getComposer() {
        return this.composer;
    }

    public final Integer getDiscNumber() {
        return this.discNumber;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getGenre() {
        return this.genre;
    }

    public final Long getGenreId() {
        return this.genreId;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Long getModifiedDate() {
        return this.modifiedDate;
    }

    public final Integer getRecordingDay() {
        return this.recordingDay;
    }

    public final Integer getRecordingMonth() {
        return this.recordingMonth;
    }

    public final Integer getRecordingYear() {
        return this.recordingYear;
    }

    public final Integer getReleaseYear() {
        return this.releaseYear;
    }

    public final Uri getThumb() {
        return this.thumb;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTrackNumber() {
        return this.trackNumber;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final String getWriter() {
        return this.writer;
    }

    public int hashCode() {
        Uri uri = this.uri;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.mediaId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.writer;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.compilation;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.composer;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.artists;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.album;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.albumArtists;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Uri uri2 = this.thumb;
        int iHashCode11 = (iHashCode10 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Integer num = this.trackNumber;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.discNumber;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.genre;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.recordingDay;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.recordingMonth;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.recordingYear;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.releaseYear;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.artistId;
        int iHashCode19 = (iHashCode18 + (l == null ? 0 : l.hashCode())) * 31;
        Long l7 = this.albumId;
        int iHashCode20 = (iHashCode19 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.genreId;
        int iHashCode21 = (iHashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str11 = this.author;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l9 = this.addDate;
        int iHashCode23 = (iHashCode22 + (l9 == null ? 0 : l9.hashCode())) * 31;
        long j3 = this.duration;
        int i7 = (iHashCode23 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l10 = this.modifiedDate;
        int iHashCode24 = (i7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num7 = this.cdTrackNumber;
        return iHashCode24 + (num7 != null ? num7.hashCode() : 0);
    }

    public String toString() {
        return "YosMediaItem(uri=" + this.uri + ", mediaId=" + this.mediaId + ", mimeType=" + this.mimeType + ", title=" + this.title + ", writer=" + this.writer + ", compilation=" + this.compilation + ", composer=" + this.composer + ", artists=" + this.artists + ", album=" + this.album + ", albumArtists=" + this.albumArtists + ", thumb=" + this.thumb + ", trackNumber=" + this.trackNumber + ", discNumber=" + this.discNumber + ", genre=" + this.genre + ", recordingDay=" + this.recordingDay + ", recordingMonth=" + this.recordingMonth + ", recordingYear=" + this.recordingYear + ", releaseYear=" + this.releaseYear + ", artistId=" + this.artistId + ", albumId=" + this.albumId + ", genreId=" + this.genreId + ", author=" + this.author + ", addDate=" + this.addDate + ", duration=" + this.duration + ", modifiedDate=" + this.modifiedDate + ", cdTrackNumber=" + this.cdTrackNumber + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeParcelable(this.uri, i7);
        parcel.writeString(this.mediaId);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.title);
        parcel.writeString(this.writer);
        parcel.writeString(this.compilation);
        parcel.writeString(this.composer);
        parcel.writeString(this.artists);
        parcel.writeString(this.album);
        parcel.writeString(this.albumArtists);
        parcel.writeParcelable(this.thumb, i7);
        Integer num = this.trackNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.discNumber;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.genre);
        Integer num3 = this.recordingDay;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.recordingMonth;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.recordingYear;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.releaseYear;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Long l = this.artistId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l7 = this.albumId;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        Long l8 = this.genreId;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        parcel.writeString(this.author);
        Long l9 = this.addDate;
        if (l9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l9.longValue());
        }
        parcel.writeLong(this.duration);
        Long l10 = this.modifiedDate;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        Integer num7 = this.cdTrackNumber;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
    }
}
