package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0686b extends AbstractC0693i {
    public static final Parcelable.Creator<C0686b> CREATOR = new K1.h(18);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f10361p;

    public C0686b(String str, byte[] bArr) {
        super(str);
        this.f10361p = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0686b.class == obj.getClass()) {
            C0686b c0686b = (C0686b) obj;
            if (this.f10385o.equals(c0686b.f10385o) && Arrays.equals(this.f10361p, c0686b.f10361p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10361p) + A0.e.C(this.f10385o, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10385o);
        parcel.writeByteArray(this.f10361p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0686b(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f18881a;
        super(string);
        this.f10361p = parcel.createByteArray();
    }
}
