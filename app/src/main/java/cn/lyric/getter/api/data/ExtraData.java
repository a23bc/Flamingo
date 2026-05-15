package cn.lyric.getter.api.data;

import java.util.HashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class ExtraData {
    private HashMap<String, Object> extra;

    public ExtraData() {
        this.extra = new HashMap<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ExtraData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1209k.d(obj, "null cannot be cast to non-null type cn.lyric.getter.api.data.ExtraData");
        return AbstractC1209k.a(this.extra, ((ExtraData) obj).extra);
    }

    public final String getBase64Icon() {
        return getString("base64Icon", "");
    }

    public final boolean getBoolean(String str, boolean z6) {
        AbstractC1209k.f(str, "key");
        Object objValueOf = this.extra.get(str);
        if (objValueOf == null) {
            objValueOf = Boolean.valueOf(z6);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean getCustomIcon() {
        return getBoolean("customIcon", false);
    }

    public final int getDelay() {
        return getInt("delay", 0);
    }

    public final double getDouble(String str, double d4) {
        AbstractC1209k.f(str, "key");
        Object objValueOf = this.extra.get(str);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(d4);
        }
        return ((Double) objValueOf).doubleValue();
    }

    public final HashMap<String, Object> getExtra() {
        return this.extra;
    }

    public final float getFloat(String str, float f7) {
        AbstractC1209k.f(str, "key");
        Object objValueOf = this.extra.get(str);
        if (objValueOf == null) {
            objValueOf = Float.valueOf(f7);
        }
        return ((Float) objValueOf).floatValue();
    }

    public final int getInt(String str, int i7) {
        AbstractC1209k.f(str, "key");
        Object objValueOf = this.extra.get(str);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(i7);
        }
        return ((Integer) objValueOf).intValue();
    }

    public final long getLong(String str, long j3) {
        AbstractC1209k.f(str, "key");
        Object objValueOf = this.extra.get(str);
        if (objValueOf == null) {
            objValueOf = Long.valueOf(j3);
        }
        return ((Long) objValueOf).longValue();
    }

    public final String getPackageName() {
        return getString("packageName", "");
    }

    public final String getString(String str, String str2) {
        AbstractC1209k.f(str, "key");
        AbstractC1209k.f(str2, "default");
        Object obj = this.extra.get(str);
        Object obj2 = str2;
        if (obj != null) {
            obj2 = obj;
        }
        return obj2.toString();
    }

    public final boolean getUseOwnMusicController() {
        return getBoolean("useOwnMusicController", false);
    }

    public int hashCode() {
        return this.extra.hashCode();
    }

    public final void mergeExtra(ExtraData extraData) {
        AbstractC1209k.f(extraData, "other");
        this.extra.putAll(extraData.extra);
    }

    public final void setBase64Icon(String str) {
        AbstractC1209k.f(str, "value");
        setString("base64Icon", str);
    }

    public final void setBoolean(String str, boolean z6) {
        AbstractC1209k.f(str, "key");
        this.extra.put(str, Boolean.valueOf(z6));
    }

    public final void setCustomIcon(boolean z6) {
        setBoolean("customIcon", z6);
    }

    public final void setDelay(int i7) {
        setInt("delay", i7);
    }

    public final void setDouble(String str, double d4) {
        AbstractC1209k.f(str, "key");
        this.extra.put(str, Double.valueOf(d4));
    }

    public final void setExtra(HashMap<String, Object> map) {
        AbstractC1209k.f(map, "<set-?>");
        this.extra = map;
    }

    public final void setFloat(String str, float f7) {
        AbstractC1209k.f(str, "key");
        this.extra.put(str, Float.valueOf(f7));
    }

    public final void setInt(String str, int i7) {
        AbstractC1209k.f(str, "key");
        this.extra.put(str, Integer.valueOf(i7));
    }

    public final void setLong(String str, long j3) {
        AbstractC1209k.f(str, "key");
        this.extra.put(str, Long.valueOf(j3));
    }

    public final void setPackageName(String str) {
        AbstractC1209k.f(str, "value");
        setString("packageName", str);
    }

    public final void setString(String str, String str2) {
        AbstractC1209k.f(str, "key");
        AbstractC1209k.f(str2, "value");
        this.extra.put(str, str2);
    }

    public final void setUseOwnMusicController(boolean z6) {
        setBoolean("useOwnMusicController", z6);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : this.extra.entrySet()) {
            String key = entry.getKey();
            sb.append(((Object) key) + "=" + entry.getValue() + ",");
        }
        String string = sb.toString();
        AbstractC1209k.e(string, "str.toString()");
        return string;
    }

    public final void mergeExtra(HashMap<String, Object> map) {
        AbstractC1209k.f(map, "other");
        this.extra.putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtraData(boolean z6, String str, boolean z7, String str2, int i7) {
        this();
        AbstractC1209k.f(str, "base64Icon");
        AbstractC1209k.f(str2, "packageName");
        this.extra.put("customIcon", Boolean.valueOf(z6));
        this.extra.put("base64Icon", str);
        this.extra.put("useOwnMusicController", Boolean.valueOf(z7));
        this.extra.put("packageName", str2);
        this.extra.put("delay", Integer.valueOf(i7));
    }
}
