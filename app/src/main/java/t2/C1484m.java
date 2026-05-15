package t2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: t2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1484m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1484m> CREATOR = new c3.b(15);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1483l[] f16522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f16524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16525r;

    public C1484m(String str, boolean z6, C1483l... c1483lArr) {
        this.f16524q = str;
        c1483lArr = z6 ? (C1483l[]) c1483lArr.clone() : c1483lArr;
        this.f16522o = c1483lArr;
        this.f16525r = c1483lArr.length;
        Arrays.sort(c1483lArr, this);
    }

    public final C1484m a(String str) {
        return w2.t.a(this.f16524q, str) ? this : new C1484m(str, false, this.f16522o);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1483l c1483l = (C1483l) obj;
        C1483l c1483l2 = (C1483l) obj2;
        UUID uuid = AbstractC1479h.f16467a;
        return uuid.equals(c1483l.f16511p) ? uuid.equals(c1483l2.f16511p) ? 0 : 1 : c1483l.f16511p.compareTo(c1483l2.f16511p);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1484m.class == obj.getClass()) {
            C1484m c1484m = (C1484m) obj;
            if (w2.t.a(this.f16524q, c1484m.f16524q) && Arrays.equals(this.f16522o, c1484m.f16522o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16523p == 0) {
            String str = this.f16524q;
            this.f16523p = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f16522o);
        }
        return this.f16523p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16524q);
        parcel.writeTypedArray(this.f16522o, 0);
    }

    public C1484m(Parcel parcel) {
        this.f16524q = parcel.readString();
        C1483l[] c1483lArr = (C1483l[]) parcel.createTypedArray(C1483l.CREATOR);
        int i7 = w2.t.f18881a;
        this.f16522o = c1483lArr;
        this.f16525r = c1483lArr.length;
    }
}
