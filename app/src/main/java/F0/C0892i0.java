package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: f0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892i0 implements Parcelable.ClassLoaderCreator {
    public static C0894j0 a(Parcel parcel, ClassLoader classLoader) {
        W w7;
        if (classLoader == null) {
            classLoader = C0892i0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i7 = parcel.readInt();
        if (i7 == 0) {
            w7 = W.f11764q;
        } else if (i7 == 1) {
            w7 = W.f11767t;
        } else {
            if (i7 != 2) {
                throw new IllegalStateException(Z1.l.o(i7, "Unsupported MutableState policy ", " was restored"));
            }
            w7 = W.f11765r;
        }
        return new C0894j0(value, w7);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0894j0[i7];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
