package yos.music.player.data.libraries;

import Z1.l;
import android.os.Parcel;
import android.os.Parcelable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class YosStringWrapper implements Parcelable {
    public static final Parcelable.Creator<YosStringWrapper> CREATOR = new Creator();
    private final String value;

    public static final class Creator implements Parcelable.Creator<YosStringWrapper> {
        @Override // android.os.Parcelable.Creator
        public final YosStringWrapper createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            return new YosStringWrapper(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final YosStringWrapper[] newArray(int i7) {
            return new YosStringWrapper[i7];
        }
    }

    public YosStringWrapper(String str) {
        AbstractC1209k.f(str, "value");
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YosStringWrapper) && AbstractC1209k.a(this.value, ((YosStringWrapper) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return l.s(new StringBuilder("YosStringWrapper(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeString(this.value);
    }
}
