package M3;

import Z1.l;
import android.os.Parcel;
import android.util.SparseIntArray;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f4767d;

    /* JADX INFO: renamed from: e */
    public final Parcel f4768e;

    /* JADX INFO: renamed from: f */
    public final int f4769f;

    /* JADX INFO: renamed from: g */
    public final int f4770g;
    public final String h;

    /* JADX INFO: renamed from: i */
    public int f4771i;

    /* JADX INFO: renamed from: j */
    public int f4772j;

    /* JADX INFO: renamed from: k */
    public int f4773k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1450e(0), new C1450e(0), new C1450e(0));
    }

    @Override // M3.b
    public final c a() {
        Parcel parcel = this.f4768e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f4772j;
        if (i7 == this.f4769f) {
            i7 = this.f4770g;
        }
        return new c(parcel, iDataPosition, i7, l.t(new StringBuilder(), this.h, "  "), this.f4764a, this.f4765b, this.f4766c);
    }

    @Override // M3.b
    public final boolean e(int i7) {
        while (this.f4772j < this.f4770g) {
            int i8 = this.f4773k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f4772j;
            Parcel parcel = this.f4768e;
            parcel.setDataPosition(i9);
            int i10 = parcel.readInt();
            this.f4773k = parcel.readInt();
            this.f4772j += i10;
        }
        return this.f4773k == i7;
    }

    @Override // M3.b
    public final void i(int i7) {
        int i8 = this.f4771i;
        SparseIntArray sparseIntArray = this.f4767d;
        Parcel parcel = this.f4768e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(iDataPosition - i9);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4771i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i8, String str, C1450e c1450e, C1450e c1450e2, C1450e c1450e3) {
        super(c1450e, c1450e2, c1450e3);
        this.f4767d = new SparseIntArray();
        this.f4771i = -1;
        this.f4773k = -1;
        this.f4768e = parcel;
        this.f4769f = i7;
        this.f4770g = i8;
        this.f4772j = i7;
        this.h = str;
    }
}
