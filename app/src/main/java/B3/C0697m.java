package b3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w2.t;

/* JADX INFO: renamed from: b3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0697m extends AbstractC0693i {
    public static final Parcelable.Creator<C0697m> CREATOR = new K1.h(25);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f10396q;

    public C0697m(String str, byte[] bArr) {
        super("PRIV");
        this.f10395p = str;
        this.f10396q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0697m.class == obj.getClass()) {
            C0697m c0697m = (C0697m) obj;
            if (t.a(this.f10395p, c0697m.f10395p) && Arrays.equals(this.f10396q, c0697m.f10396q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f10395p;
        return Arrays.hashCode(this.f10396q) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b3.AbstractC0693i
    public final String toString() {
        return this.f10385o + ": owner=" + this.f10395p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10395p);
        parcel.writeByteArray(this.f10396q);
    }

    public C0697m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i7 = t.f18881a;
        this.f10395p = string;
        this.f10396q = parcel.createByteArray();
    }
}
