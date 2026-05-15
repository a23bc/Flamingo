package K1;

import E4.I;
import Y1.r;
import Y1.u;
import a3.C0519b;
import a3.C0520c;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.versionedparcelable.ParcelImpl;
import b3.C0685a;
import b3.C0686b;
import b3.C0687c;
import b3.C0688d;
import b3.C0689e;
import b3.C0690f;
import b3.C0695k;
import b3.C0696l;
import b3.C0697m;
import b3.C0698n;
import b3.C0699o;
import c.BinderC0705c;
import c.C0703a;
import c.C0706d;
import c.InterfaceC0704b;
import c3.C0733a;
import com.hchen.superlyricapi.BuildConfig;
import d2.C0821i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3966a;

    public /* synthetic */ h(int i7) {
        this.f3966a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Bundle bundle;
        InterfaceC0704b interfaceC0704b = null;
        switch (this.f3966a) {
            case 0:
                i iVar = new i(parcel);
                iVar.f3967o = parcel.readInt();
                return iVar;
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                String string = parcel.readString();
                string.getClass();
                return new X2.a(parcel.readInt(), string);
            case 3:
                return new Y1.b(parcel);
            case 4:
                return new Y1.c(parcel);
            case 5:
                Y1.p pVar = new Y1.p();
                pVar.f8616o = parcel.readString();
                pVar.f8617p = parcel.readInt();
                return pVar;
            case 6:
                r rVar = new r();
                rVar.f8652s = null;
                rVar.f8653t = new ArrayList();
                rVar.f8654u = new ArrayList();
                rVar.f8648o = parcel.createStringArrayList();
                rVar.f8649p = parcel.createStringArrayList();
                rVar.f8650q = (Y1.b[]) parcel.createTypedArray(Y1.b.CREATOR);
                rVar.f8651r = parcel.readInt();
                rVar.f8652s = parcel.readString();
                rVar.f8653t = parcel.createStringArrayList();
                rVar.f8654u = parcel.createTypedArrayList(Y1.c.CREATOR);
                rVar.f8655v = parcel.createTypedArrayList(Y1.p.CREATOR);
                return rVar;
            case 7:
                return new u(parcel);
            case 8:
                return new Y2.a(parcel);
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return new Z2.a(parcel);
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return new Z2.b(parcel);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new C0519b(parcel);
            case 12:
                return new C0520c(parcel);
            case 13:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 14:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.a.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.a.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.a.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.a.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.a.e(mediaDescription);
                Uri uriF = android.support.v4.media.a.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.a.d(mediaDescription);
                if (bundleD != null) {
                    bundleD.setClassLoader(android.support.v4.media.session.b.class.getClassLoader());
                    try {
                        bundleD.isEmpty();
                    } catch (BadParcelableException unused) {
                        bundleD = null;
                    }
                    break;
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.b.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f8906w = mediaDescription;
                return mediaDescriptionCompat;
            case 15:
                return new MediaMetadataCompat(parcel);
            case 16:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 17:
                return new C0685a(parcel);
            case 18:
                return new C0686b(parcel);
            case 19:
                return new C0687c(parcel);
            case BuildConfig.API_VERSION /* 20 */:
                return new C0688d(parcel);
            case 21:
                return new C0689e(parcel);
            case 22:
                return new C0690f(parcel);
            case 23:
                return new C0695k(parcel);
            case 24:
                return new C0696l(parcel);
            case 25:
                return new C0697m(parcel);
            case 26:
                String string2 = parcel.readString();
                string2.getClass();
                String string3 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C0698n(string2, string3, I.q(strArrCreateStringArray));
            case 27:
                return new C0699o(parcel);
            case 28:
                C0706d c0706d = new C0706d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i7 = BinderC0705c.f10511d;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0704b.f10510b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0704b)) {
                        C0703a c0703a = new C0703a();
                        c0703a.f10509c = strongBinder;
                        interfaceC0704b = c0703a;
                    } else {
                        interfaceC0704b = (InterfaceC0704b) iInterfaceQueryLocalInterface;
                    }
                }
                c0706d.f10513o = interfaceC0704b;
                return c0706d;
            default:
                return new C0733a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f3966a) {
            case 0:
                return new i[i7];
            case 1:
                return new ParcelImpl[i7];
            case 2:
                return new X2.a[i7];
            case 3:
                return new Y1.b[i7];
            case 4:
                return new Y1.c[i7];
            case 5:
                return new Y1.p[i7];
            case 6:
                return new r[i7];
            case 7:
                return new u[i7];
            case 8:
                return new Y2.a[i7];
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                return new Z2.a[i7];
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                return new Z2.b[i7];
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new C0519b[i7];
            case 12:
                return new C0520c[i7];
            case 13:
                return new MediaBrowserCompat$MediaItem[i7];
            case 14:
                return new MediaDescriptionCompat[i7];
            case 15:
                return new MediaMetadataCompat[i7];
            case 16:
                return new RatingCompat[i7];
            case 17:
                return new C0685a[i7];
            case 18:
                return new C0686b[i7];
            case 19:
                return new C0687c[i7];
            case BuildConfig.API_VERSION /* 20 */:
                return new C0688d[i7];
            case 21:
                return new C0689e[i7];
            case 22:
                return new C0690f[i7];
            case 23:
                return new C0695k[i7];
            case 24:
                return new C0696l[i7];
            case 25:
                return new C0697m[i7];
            case 26:
                return new C0698n[i7];
            case 27:
                return new C0699o[i7];
            case 28:
                return new C0706d[i7];
            default:
                return new C0733a[i7];
        }
    }
}
