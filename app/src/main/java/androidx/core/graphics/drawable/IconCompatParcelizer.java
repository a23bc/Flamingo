package androidx.core.graphics.drawable;

import M3.b;
import M3.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9347a = bVar.f(iconCompat.f9347a, 1);
        byte[] bArr = iconCompat.f9349c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f4768e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f9349c = bArr;
        iconCompat.f9350d = bVar.g(iconCompat.f9350d, 3);
        iconCompat.f9351e = bVar.f(iconCompat.f9351e, 4);
        iconCompat.f9352f = bVar.f(iconCompat.f9352f, 5);
        iconCompat.f9353g = (ColorStateList) bVar.g(iconCompat.f9353g, 6);
        String string = iconCompat.f9354i;
        if (bVar.e(7)) {
            string = ((c) bVar).f4768e.readString();
        }
        iconCompat.f9354i = string;
        String string2 = iconCompat.f9355j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f4768e.readString();
        }
        iconCompat.f9355j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f9354i);
        switch (iconCompat.f9347a) {
            case -1:
                Parcelable parcelable = iconCompat.f9350d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f9348b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f9350d;
                if (parcelable2 != null) {
                    iconCompat.f9348b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f9349c;
                iconCompat.f9348b = bArr3;
                iconCompat.f9347a = 3;
                iconCompat.f9351e = 0;
                iconCompat.f9352f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f9349c, Charset.forName("UTF-16"));
                iconCompat.f9348b = str;
                if (iconCompat.f9347a == 2 && iconCompat.f9355j == null) {
                    iconCompat.f9355j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f9348b = iconCompat.f9349c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f9354i = iconCompat.h.name();
        switch (iconCompat.f9347a) {
            case -1:
                iconCompat.f9350d = (Parcelable) iconCompat.f9348b;
                break;
            case 1:
            case 5:
                iconCompat.f9350d = (Parcelable) iconCompat.f9348b;
                break;
            case 2:
                iconCompat.f9349c = ((String) iconCompat.f9348b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f9349c = (byte[]) iconCompat.f9348b;
                break;
            case 4:
            case 6:
                iconCompat.f9349c = iconCompat.f9348b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f9347a;
        if (-1 != i7) {
            bVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f9349c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f4768e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f9350d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i8 = iconCompat.f9351e;
        if (i8 != 0) {
            bVar.j(i8, 4);
        }
        int i9 = iconCompat.f9352f;
        if (i9 != 0) {
            bVar.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f9353g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f9354i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f4768e.writeString(str);
        }
        String str2 = iconCompat.f9355j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f4768e.writeString(str2);
        }
    }
}
