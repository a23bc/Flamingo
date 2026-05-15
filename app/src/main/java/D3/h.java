package d3;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11257g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11260k;

    public h(long j3, boolean z6, boolean z7, boolean z8, ArrayList arrayList, long j7, boolean z9, long j8, int i7, int i8, int i9) {
        this.f11251a = j3;
        this.f11252b = z6;
        this.f11253c = z7;
        this.f11254d = z8;
        this.f11256f = Collections.unmodifiableList(arrayList);
        this.f11255e = j7;
        this.f11257g = z9;
        this.h = j8;
        this.f11258i = i7;
        this.f11259j = i8;
        this.f11260k = i9;
    }

    public h(Parcel parcel) {
        this.f11251a = parcel.readLong();
        this.f11252b = parcel.readByte() == 1;
        this.f11253c = parcel.readByte() == 1;
        this.f11254d = parcel.readByte() == 1;
        int i7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(new g(parcel.readLong(), parcel.readInt()));
        }
        this.f11256f = Collections.unmodifiableList(arrayList);
        this.f11255e = parcel.readLong();
        this.f11257g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.f11258i = parcel.readInt();
        this.f11259j = parcel.readInt();
        this.f11260k = parcel.readInt();
    }
}
