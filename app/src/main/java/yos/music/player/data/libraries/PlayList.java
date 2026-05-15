package yos.music.player.data.libraries;

import A0.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class PlayList implements Parcelable {
    public static final Parcelable.Creator<PlayList> CREATOR = new Creator();
    private final String listID;
    private final String name;
    private final List<Uri> songDataList;

    public static final class Creator implements Parcelable.Creator<PlayList> {
        @Override // android.os.Parcelable.Creator
        public final PlayList createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList.add(parcel.readParcelable(PlayList.class.getClassLoader()));
            }
            return new PlayList(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlayList[] newArray(int i7) {
            return new PlayList[i7];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayList(String str, String str2, List<? extends Uri> list) {
        AbstractC1209k.f(str, "listID");
        AbstractC1209k.f(str2, "name");
        AbstractC1209k.f(list, "songDataList");
        this.listID = str;
        this.name = str2;
        this.songDataList = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayList)) {
            return false;
        }
        PlayList playList = (PlayList) obj;
        return AbstractC1209k.a(this.listID, playList.listID) && AbstractC1209k.a(this.name, playList.name) && AbstractC1209k.a(this.songDataList, playList.songDataList);
    }

    public final String getListID() {
        return this.listID;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Uri> getSongDataList() {
        return this.songDataList;
    }

    public int hashCode() {
        return this.songDataList.hashCode() + e.C(this.name, this.listID.hashCode() * 31, 31);
    }

    public String toString() {
        return "PlayList(listID=" + this.listID + ", name=" + this.name + ", songDataList=" + this.songDataList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeString(this.listID);
        parcel.writeString(this.name);
        List<Uri> list = this.songDataList;
        parcel.writeInt(list.size());
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i7);
        }
    }
}
