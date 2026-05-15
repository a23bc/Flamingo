package d3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: d3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829e extends AbstractC0826b {
    public static final Parcelable.Creator<C0829e> CREATOR = new c3.b(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f11236A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11237o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11238p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f11239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f11240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f11242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f11243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f11244v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f11245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11247y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f11248z;

    public C0829e(long j3, boolean z6, boolean z7, boolean z8, boolean z9, long j7, long j8, List list, boolean z10, long j9, int i7, int i8, int i9) {
        this.f11237o = j3;
        this.f11238p = z6;
        this.f11239q = z7;
        this.f11240r = z8;
        this.f11241s = z9;
        this.f11242t = j7;
        this.f11243u = j8;
        this.f11244v = Collections.unmodifiableList(list);
        this.f11245w = z10;
        this.f11246x = j9;
        this.f11247y = i7;
        this.f11248z = i8;
        this.f11236A = i9;
    }

    @Override // d3.AbstractC0826b
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f11242t + ", programSplicePlaybackPositionUs= " + this.f11243u + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f11237o);
        parcel.writeByte(this.f11238p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11239q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11240r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11241s ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11242t);
        parcel.writeLong(this.f11243u);
        List list = this.f11244v;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            C0828d c0828d = (C0828d) list.get(i8);
            parcel.writeInt(c0828d.f11233a);
            parcel.writeLong(c0828d.f11234b);
            parcel.writeLong(c0828d.f11235c);
        }
        parcel.writeByte(this.f11245w ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11246x);
        parcel.writeInt(this.f11247y);
        parcel.writeInt(this.f11248z);
        parcel.writeInt(this.f11236A);
    }

    public C0829e(Parcel parcel) {
        this.f11237o = parcel.readLong();
        this.f11238p = parcel.readByte() == 1;
        this.f11239q = parcel.readByte() == 1;
        this.f11240r = parcel.readByte() == 1;
        this.f11241s = parcel.readByte() == 1;
        this.f11242t = parcel.readLong();
        this.f11243u = parcel.readLong();
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(new C0828d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f11244v = Collections.unmodifiableList(arrayList);
        this.f11245w = parcel.readByte() == 1;
        this.f11246x = parcel.readLong();
        this.f11247y = parcel.readInt();
        this.f11248z = parcel.readInt();
        this.f11236A = parcel.readInt();
    }
}
