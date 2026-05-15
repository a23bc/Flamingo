package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0826b {
    public static final Parcelable.Creator<i> CREATOR = new c3.b(6);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f11261o;

    public i(Parcel parcel) {
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(new h(parcel));
        }
        this.f11261o = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f11261o;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) list.get(i8);
            parcel.writeLong(hVar.f11251a);
            parcel.writeByte(hVar.f11252b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f11253c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f11254d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f11256f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                g gVar = (g) list2.get(i9);
                parcel.writeInt(gVar.f11249a);
                parcel.writeLong(gVar.f11250b);
            }
            parcel.writeLong(hVar.f11255e);
            parcel.writeByte(hVar.f11257g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.f11258i);
            parcel.writeInt(hVar.f11259j);
            parcel.writeInt(hVar.f11260k);
        }
    }

    public i(ArrayList arrayList) {
        this.f11261o = Collections.unmodifiableList(arrayList);
    }
}
