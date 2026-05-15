package K1;

import android.os.Parcel;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public long f3972a;

    /* JADX INFO: renamed from: b */
    public final Object f3973b;

    /* JADX INFO: renamed from: c */
    public final Object f3974c;

    public l() {
        L0.c cVar = L0.c.f4092o;
        this.f3973b = new L0.d();
        this.f3974c = new L0.d();
    }

    public l(Parcel parcel) {
        AbstractC1209k.f(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.f3973b = bArr;
        parcel.readByteArray(bArr);
        String string = parcel.readString();
        AbstractC1209k.c(string);
        this.f3974c = string;
        this.f3972a = parcel.readLong();
    }
}
