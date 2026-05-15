package x3;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Parcelable {
    public static final Parcelable.Creator<W> CREATOR = new c3.b(25);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1910L f20016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f20017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MediaSession.QueueItem f20018q;

    public W(MediaSession.QueueItem queueItem, C1910L c1910l, long j3) {
        if (c1910l == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j3 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f20016o = c1910l;
        this.f20017p = j3;
        this.f20018q = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new W(queueItem, C1910L.a(V.b(queueItem)), V.c(queueItem)));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f20016o + ", Id=" + this.f20017p + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        this.f20016o.writeToParcel(parcel, i7);
        parcel.writeLong(this.f20017p);
    }

    public W(Parcel parcel) {
        this.f20016o = C1910L.CREATOR.createFromParcel(parcel);
        this.f20017p = parcel.readLong();
    }
}
