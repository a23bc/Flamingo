package com.kyant.taglib;

import Z1.l;
import Z4.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata {
    private final Picture[] pictures;
    private final HashMap<String, String[]> propertyMap;

    public Metadata(HashMap<String, String[]> map, Picture[] pictureArr) {
        AbstractC1209k.f(map, "propertyMap");
        AbstractC1209k.f(pictureArr, "pictures");
        this.propertyMap = map;
        this.pictures = pictureArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, HashMap map, Picture[] pictureArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            map = metadata.propertyMap;
        }
        if ((i7 & 2) != 0) {
            pictureArr = metadata.pictures;
        }
        return metadata.copy(map, pictureArr);
    }

    public final HashMap<String, String[]> component1() {
        return this.propertyMap;
    }

    public final Picture[] component2() {
        return this.pictures;
    }

    public final Metadata copy(HashMap<String, String[]> map, Picture[] pictureArr) {
        AbstractC1209k.f(map, "propertyMap");
        AbstractC1209k.f(pictureArr, "pictures");
        return new Metadata(map, pictureArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        if (AbstractC1209k.a(this.propertyMap, metadata.propertyMap)) {
            return Arrays.equals(this.pictures, metadata.pictures);
        }
        return false;
    }

    public final Picture[] getPictures() {
        return this.pictures;
    }

    public final HashMap<String, String[]> getPropertyMap() {
        return this.propertyMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictures) + (this.propertyMap.hashCode() * 31);
    }

    public String toString() {
        HashMap<String, String[]> map = this.propertyMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.k0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String string = Arrays.toString((Object[]) entry.getValue());
            AbstractC1209k.e(string, "toString(...)");
            linkedHashMap.put(key, string);
        }
        String string2 = Arrays.toString(this.pictures);
        AbstractC1209k.e(string2, "toString(...)");
        StringBuilder sb = new StringBuilder("Metadata(propertyMap=");
        sb.append(linkedHashMap);
        sb.append(", pictures=");
        return l.t(sb, string2, ")");
    }
}
