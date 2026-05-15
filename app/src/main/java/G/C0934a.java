package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0934a implements Parcelable {
    public static final Parcelable.Creator<C0934a> CREATOR = new c3.b(11);

    /* JADX INFO: renamed from: o */
    public final int f12250o;

    /* JADX INFO: renamed from: p */
    public final Intent f12251p;

    public C0934a(Intent intent, int i7) {
        this.f12250o = i7;
        this.f12251p = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f12250o;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f12251p);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeInt(this.f12250o);
        Intent intent = this.f12251p;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
