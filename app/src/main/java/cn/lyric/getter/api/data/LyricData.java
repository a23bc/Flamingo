package cn.lyric.getter.api.data;

import A0.e;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c4.EnumC0734a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1204f;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelClassLoader"})
public final class LyricData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private ExtraData extraData;
    private String lyric;
    private EnumC0734a type;

    public static final class CREATOR implements Parcelable.Creator<LyricData> {
        public /* synthetic */ CREATOR(AbstractC1204f abstractC1204f) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LyricData createFromParcel(Parcel parcel) {
            AbstractC1209k.f(parcel, "parcel");
            return new LyricData(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LyricData[] newArray(int i7) {
            return new LyricData[i7];
        }
    }

    public /* synthetic */ LyricData(Parcel parcel, AbstractC1204f abstractC1204f) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LyricData) {
            LyricData lyricData = (LyricData) obj;
            if (this.type == lyricData.type && AbstractC1209k.a(this.lyric, lyricData.lyric)) {
                return true;
            }
        }
        return false;
    }

    public final ExtraData getExtraData() {
        return this.extraData;
    }

    public final String getLyric() {
        return this.lyric;
    }

    public final EnumC0734a getType() {
        return this.type;
    }

    public int hashCode() {
        return this.extraData.hashCode() + e.C(this.lyric, this.type.hashCode() * 31, 31);
    }

    public final void setExtraData(ExtraData extraData) {
        AbstractC1209k.f(extraData, "<set-?>");
        this.extraData = extraData;
    }

    public final void setLyric(String str) {
        AbstractC1209k.f(str, "<set-?>");
        this.lyric = str;
    }

    public final void setType(EnumC0734a enumC0734a) {
        AbstractC1209k.f(enumC0734a, "<set-?>");
        this.type = enumC0734a;
    }

    public String toString() {
        return "{\"type\":\"" + this.type + "\",\"lyric\":\"" + this.lyric + "\",\"extra\":\"" + this.extraData + "\"}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        AbstractC1209k.f(parcel, "dest");
        parcel.writeInt(this.type.ordinal());
        parcel.writeString(this.lyric);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : this.extraData.getExtra().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                bundle.putFloat(key, ((Number) value).floatValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            }
        }
        parcel.writeBundle(bundle);
    }

    private LyricData(Parcel parcel) {
        Set<String> setKeySet;
        this.type = EnumC0734a.f10676o;
        this.lyric = "";
        this.extraData = new ExtraData();
        this.type = EnumC0734a.values()[parcel.readInt()];
        String string = parcel.readString();
        this.lyric = string != null ? string : "";
        ExtraData extraData = this.extraData;
        Bundle bundle = parcel.readBundle();
        HashMap<String, Object> map = new HashMap<>();
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                AbstractC1209k.e(str, "key");
                Object obj = bundle.get(str);
                AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Any");
                map.put(str, obj);
            }
        }
        extraData.setExtra(map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LyricData() {
        Parcel parcelObtain = Parcel.obtain();
        AbstractC1209k.e(parcelObtain, "obtain()");
        this(parcelObtain);
    }
}
