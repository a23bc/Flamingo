package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687c extends AbstractC0693i {
    public static final Parcelable.Creator<C0687c> CREATOR = new K1.h(19);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f10366t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0693i[] f10367u;

    public C0687c(String str, int i7, int i8, long j3, long j7, AbstractC0693i[] abstractC0693iArr) {
        super("CHAP");
        this.f10362p = str;
        this.f10363q = i7;
        this.f10364r = i8;
        this.f10365s = j3;
        this.f10366t = j7;
        this.f10367u = abstractC0693iArr;
    }

    @Override // b3.AbstractC0693i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0687c.class == obj.getClass()) {
            C0687c c0687c = (C0687c) obj;
            if (this.f10363q == c0687c.f10363q && this.f10364r == c0687c.f10364r && this.f10365s == c0687c.f10365s && this.f10366t == c0687c.f10366t && t.a(this.f10362p, c0687c.f10362p) && Arrays.equals(this.f10367u, c0687c.f10367u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (((((((527 + this.f10363q) * 31) + this.f10364r) * 31) + ((int) this.f10365s)) * 31) + ((int) this.f10366t)) * 31;
        String str = this.f10362p;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10362p);
        parcel.writeInt(this.f10363q);
        parcel.writeInt(this.f10364r);
        parcel.writeLong(this.f10365s);
        parcel.writeLong(this.f10366t);
        AbstractC0693i[] abstractC0693iArr = this.f10367u;
        parcel.writeInt(abstractC0693iArr.length);
        for (AbstractC0693i abstractC0693i : abstractC0693iArr) {
            parcel.writeParcelable(abstractC0693i, 0);
        }
    }

    public C0687c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10362p = string;
        this.f10363q = parcel.readInt();
        this.f10364r = parcel.readInt();
        this.f10365s = parcel.readLong();
        this.f10366t = parcel.readLong();
        int i8 = parcel.readInt();
        this.f10367u = new AbstractC0693i[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            this.f10367u[i9] = (AbstractC0693i) parcel.readParcelable(AbstractC0693i.class.getClassLoader());
        }
    }
}
