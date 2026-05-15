package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688d extends AbstractC0693i {
    public static final Parcelable.Creator<C0688d> CREATOR = new K1.h(20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f10370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String[] f10371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0693i[] f10372t;

    public C0688d(String str, boolean z6, boolean z7, String[] strArr, AbstractC0693i[] abstractC0693iArr) {
        super("CTOC");
        this.f10368p = str;
        this.f10369q = z6;
        this.f10370r = z7;
        this.f10371s = strArr;
        this.f10372t = abstractC0693iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0688d.class == obj.getClass()) {
            C0688d c0688d = (C0688d) obj;
            if (this.f10369q == c0688d.f10369q && this.f10370r == c0688d.f10370r && t.a(this.f10368p, c0688d.f10368p) && Arrays.equals(this.f10371s, c0688d.f10371s) && Arrays.equals(this.f10372t, c0688d.f10372t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((527 + (this.f10369q ? 1 : 0)) * 31) + (this.f10370r ? 1 : 0)) * 31;
        String str = this.f10368p;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10368p);
        parcel.writeByte(this.f10369q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f10370r ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f10371s);
        AbstractC0693i[] abstractC0693iArr = this.f10372t;
        parcel.writeInt(abstractC0693iArr.length);
        for (AbstractC0693i abstractC0693i : abstractC0693iArr) {
            parcel.writeParcelable(abstractC0693i, 0);
        }
    }

    public C0688d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10368p = string;
        this.f10369q = parcel.readByte() != 0;
        this.f10370r = parcel.readByte() != 0;
        this.f10371s = parcel.createStringArray();
        int i8 = parcel.readInt();
        this.f10372t = new AbstractC0693i[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            this.f10372t[i9] = (AbstractC0693i) parcel.readParcelable(AbstractC0693i.class.getClassLoader());
        }
    }
}
