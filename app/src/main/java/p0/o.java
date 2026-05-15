package p0;

import android.os.Parcel;
import android.os.Parcelable;
import j0.C1095f;
import q.Z0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14951a;

    public /* synthetic */ o(int i7) {
        this.f14951a = i7;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int i7 = parcel.readInt();
        if (i7 == 0) {
            return new p();
        }
        C1095f c1095fI = j0.i.f13642p.i();
        for (int i8 = 0; i8 < i7; i8++) {
            c1095fI.add(parcel.readValue(classLoader));
        }
        return new p(c1095fI.e());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f14951a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return M1.b.f4756p;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new Z0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f14951a) {
            case 0:
                return new p[i7];
            case 1:
                return new M1.b[i7];
            default:
                return new Z0[i7];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14951a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return M1.b.f4756p;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new Z0(parcel, null);
        }
    }
}
