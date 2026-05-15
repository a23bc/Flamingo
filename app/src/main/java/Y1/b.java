package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new K1.h(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f8577A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f8578B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f8579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f8580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f8581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f8582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8584t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8585u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f8587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f8589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f8590z;

    public b(a aVar) {
        int size = aVar.f8562a.size();
        this.f8579o = new int[size * 6];
        if (!aVar.f8568g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f8580p = new ArrayList(size);
        this.f8581q = new int[size];
        this.f8582r = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            v vVar = (v) aVar.f8562a.get(i8);
            this.f8579o[i7] = vVar.f8676a;
            this.f8580p.add(null);
            int[] iArr = this.f8579o;
            iArr[i7 + 1] = vVar.f8677b ? 1 : 0;
            iArr[i7 + 2] = vVar.f8678c;
            iArr[i7 + 3] = vVar.f8679d;
            int i9 = i7 + 5;
            iArr[i7 + 4] = vVar.f8680e;
            i7 += 6;
            iArr[i9] = vVar.f8681f;
            this.f8581q[i8] = vVar.f8682g.ordinal();
            this.f8582r[i8] = vVar.h.ordinal();
        }
        this.f8583s = aVar.f8567f;
        this.f8584t = aVar.h;
        this.f8585u = aVar.f8576q;
        this.f8586v = aVar.f8569i;
        this.f8587w = aVar.f8570j;
        this.f8588x = aVar.f8571k;
        this.f8589y = aVar.l;
        this.f8590z = aVar.f8572m;
        this.f8577A = aVar.f8573n;
        this.f8578B = aVar.f8574o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f8579o);
        parcel.writeStringList(this.f8580p);
        parcel.writeIntArray(this.f8581q);
        parcel.writeIntArray(this.f8582r);
        parcel.writeInt(this.f8583s);
        parcel.writeString(this.f8584t);
        parcel.writeInt(this.f8585u);
        parcel.writeInt(this.f8586v);
        TextUtils.writeToParcel(this.f8587w, parcel, 0);
        parcel.writeInt(this.f8588x);
        TextUtils.writeToParcel(this.f8589y, parcel, 0);
        parcel.writeStringList(this.f8590z);
        parcel.writeStringList(this.f8577A);
        parcel.writeInt(this.f8578B ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f8579o = parcel.createIntArray();
        this.f8580p = parcel.createStringArrayList();
        this.f8581q = parcel.createIntArray();
        this.f8582r = parcel.createIntArray();
        this.f8583s = parcel.readInt();
        this.f8584t = parcel.readString();
        this.f8585u = parcel.readInt();
        this.f8586v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f8587w = (CharSequence) creator.createFromParcel(parcel);
        this.f8588x = parcel.readInt();
        this.f8589y = (CharSequence) creator.createFromParcel(parcel);
        this.f8590z = parcel.createStringArrayList();
        this.f8577A = parcel.createStringArrayList();
        this.f8578B = parcel.readInt() != 0;
    }
}
