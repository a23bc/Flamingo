package yos.music.player.data.libraries;

import A0.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Folder implements Parcelable {
    public static final Parcelable.Creator<Folder> CREATOR = new Creator();
    private final String name;
    private final String path;
    private final List<YosMediaItem> songs;

    public static final class Creator implements Parcelable.Creator<Folder> {
        @Override // android.os.Parcelable.Creator
        public final Folder createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList.add(YosMediaItem.CREATOR.createFromParcel(parcel));
            }
            return new Folder(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Folder[] newArray(int i7) {
            return new Folder[i7];
        }
    }

    public Folder(String str, String str2, List<YosMediaItem> list) {
        AbstractC1209k.f(str, "name");
        AbstractC1209k.f(str2, "path");
        AbstractC1209k.f(list, "songs");
        this.name = str;
        this.path = str2;
        this.songs = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Folder)) {
            return false;
        }
        Folder folder = (Folder) obj;
        return AbstractC1209k.a(this.name, folder.name) && AbstractC1209k.a(this.path, folder.path) && AbstractC1209k.a(this.songs, folder.songs);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final List<YosMediaItem> getSongs() {
        return this.songs;
    }

    public int hashCode() {
        return this.songs.hashCode() + e.C(this.path, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        return "Folder(name=" + this.name + ", path=" + this.path + ", songs=" + this.songs + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeString(this.name);
        parcel.writeString(this.path);
        List<YosMediaItem> list = this.songs;
        parcel.writeInt(list.size());
        Iterator<YosMediaItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i7);
        }
    }
}
