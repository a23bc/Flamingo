package androidx.core.app;

import M3.b;
import M3.c;
import M3.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f9334a;
        boolean z6 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f9334a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f9335b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f4768e);
        }
        remoteActionCompat.f9335b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f9336c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f4768e);
        }
        remoteActionCompat.f9336c = charSequence2;
        remoteActionCompat.f9337d = (PendingIntent) bVar.g(remoteActionCompat.f9337d, 4);
        boolean z7 = remoteActionCompat.f9338e;
        if (bVar.e(5)) {
            z7 = ((c) bVar).f4768e.readInt() != 0;
        }
        remoteActionCompat.f9338e = z7;
        boolean z8 = remoteActionCompat.f9339f;
        if (!bVar.e(6)) {
            z6 = z8;
        } else if (((c) bVar).f4768e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f9339f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f9334a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f9335b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f4768e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f9336c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f9337d, 4);
        boolean z6 = remoteActionCompat.f9338e;
        bVar.i(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = remoteActionCompat.f9339f;
        bVar.i(6);
        parcel.writeInt(z7 ? 1 : 0);
    }
}
