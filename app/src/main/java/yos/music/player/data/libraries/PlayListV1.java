package yos.music.player.data.libraries;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class PlayListV1 implements Parcelable {
    public static final Parcelable.Creator<PlayListV1> CREATOR = new Creator();
    private final List<YosMediaItem> playingMusicList;

    public static final class Creator implements Parcelable.Creator<PlayListV1> {
        @Override // android.os.Parcelable.Creator
        public final PlayListV1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC1209k.f(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList2.add(YosMediaItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PlayListV1(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlayListV1[] newArray(int i7) {
            return new PlayListV1[i7];
        }
    }

    public PlayListV1(List<YosMediaItem> list) {
        this.playingMusicList = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayListV1) && AbstractC1209k.a(this.playingMusicList, ((PlayListV1) obj).playingMusicList);
    }

    public final List<YosMediaItem> getPlayingMusicList() {
        return this.playingMusicList;
    }

    public int hashCode() {
        List<YosMediaItem> list = this.playingMusicList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "PlayListV1(playingMusicList=" + this.playingMusicList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        List<YosMediaItem> list = this.playingMusicList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<YosMediaItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i7);
        }
    }
}
