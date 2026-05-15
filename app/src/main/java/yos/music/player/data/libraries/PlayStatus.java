package yos.music.player.data.libraries;

import Z1.l;
import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class PlayStatus implements Parcelable {
    public static final Parcelable.Creator<PlayStatus> CREATOR = new Creator();
    private final YosMediaItem music;
    private final long position;
    private final int repeatMode;
    private final boolean shuffleModeEnabled;

    public static final class Creator implements Parcelable.Creator<PlayStatus> {
        @Override // android.os.Parcelable.Creator
        public final PlayStatus createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            return new PlayStatus(parcel.readInt() == 0 ? null : YosMediaItem.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PlayStatus[] newArray(int i7) {
            return new PlayStatus[i7];
        }
    }

    public PlayStatus(YosMediaItem yosMediaItem, long j3, boolean z6, int i7) {
        this.music = yosMediaItem;
        this.position = j3;
        this.shuffleModeEnabled = z6;
        this.repeatMode = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayStatus)) {
            return false;
        }
        PlayStatus playStatus = (PlayStatus) obj;
        return AbstractC1209k.a(this.music, playStatus.music) && this.position == playStatus.position && this.shuffleModeEnabled == playStatus.shuffleModeEnabled && this.repeatMode == playStatus.repeatMode;
    }

    public final YosMediaItem getMusic() {
        return this.music;
    }

    public final long getPosition() {
        return this.position;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    public final boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    public int hashCode() {
        YosMediaItem yosMediaItem = this.music;
        int iHashCode = yosMediaItem == null ? 0 : yosMediaItem.hashCode();
        long j3 = this.position;
        return (((((iHashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.shuffleModeEnabled ? 1231 : 1237)) * 31) + this.repeatMode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayStatus(music=");
        sb.append(this.music);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", shuffleModeEnabled=");
        sb.append(this.shuffleModeEnabled);
        sb.append(", repeatMode=");
        return l.r(sb, this.repeatMode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        YosMediaItem yosMediaItem = this.music;
        if (yosMediaItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yosMediaItem.writeToParcel(parcel, i7);
        }
        parcel.writeLong(this.position);
        parcel.writeInt(this.shuffleModeEnabled ? 1 : 0);
        parcel.writeInt(this.repeatMode);
    }
}
