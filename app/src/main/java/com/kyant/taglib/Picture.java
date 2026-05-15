package com.kyant.taglib;

import A0.e;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class Picture {
    private final byte[] data;
    private final String description;
    private final String mimeType;
    private final String pictureType;

    public Picture(byte[] bArr, String str, String str2, String str3) {
        AbstractC1209k.f(bArr, "data");
        AbstractC1209k.f(str, "description");
        AbstractC1209k.f(str2, "pictureType");
        AbstractC1209k.f(str3, "mimeType");
        this.data = bArr;
        this.description = str;
        this.pictureType = str2;
        this.mimeType = str3;
    }

    public static /* synthetic */ Picture copy$default(Picture picture, byte[] bArr, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr = picture.data;
        }
        if ((i7 & 2) != 0) {
            str = picture.description;
        }
        if ((i7 & 4) != 0) {
            str2 = picture.pictureType;
        }
        if ((i7 & 8) != 0) {
            str3 = picture.mimeType;
        }
        return picture.copy(bArr, str, str2, str3);
    }

    public final byte[] component1() {
        return this.data;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.pictureType;
    }

    public final String component4() {
        return this.mimeType;
    }

    public final Picture copy(byte[] bArr, String str, String str2, String str3) {
        AbstractC1209k.f(bArr, "data");
        AbstractC1209k.f(str, "description");
        AbstractC1209k.f(str2, "pictureType");
        AbstractC1209k.f(str3, "mimeType");
        return new Picture(bArr, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) obj;
        if (Arrays.equals(this.data, picture.data) && AbstractC1209k.a(this.description, picture.description) && AbstractC1209k.a(this.pictureType, picture.pictureType)) {
            return AbstractC1209k.a(this.mimeType, picture.mimeType);
        }
        return false;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getPictureType() {
        return this.pictureType;
    }

    public int hashCode() {
        return this.mimeType.hashCode() + e.C(this.pictureType, e.C(this.description, Arrays.hashCode(this.data) * 31, 31), 31);
    }

    public String toString() {
        return "Picture(data=[" + this.data.length + " bytes], description=" + this.description + ", pictureType=" + this.pictureType + ", mimeType=" + this.mimeType + ")";
    }
}
