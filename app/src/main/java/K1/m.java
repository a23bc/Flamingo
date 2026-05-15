package K1;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import java.util.Objects;
import m5.AbstractC1209k;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class m implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f3975e = new k(new long[0], new RemoteViews[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteViewsCompatService f3976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f3979d = f3975e;

    public m(RemoteViewsCompatService remoteViewsCompatService, int i7, int i8) {
        this.f3976a = remoteViewsCompatService;
        this.f3977b = i7;
        this.f3978c = i8;
    }

    public final void a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f3976a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        AbstractC1209k.e(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3977b);
        sb.append(':');
        sb.append(this.f3978c);
        k kVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string != null) {
            byte[] bArrDecode = Base64.decode(string, 0);
            AbstractC1209k.e(bArrDecode, "decode(hexString, Base64.DEFAULT)");
            Parcel parcelObtain = Parcel.obtain();
            AbstractC1209k.e(parcelObtain, "obtain()");
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                l lVar = new l(parcelObtain);
                parcelObtain.recycle();
                if (AbstractC1209k.a(Build.VERSION.INCREMENTAL, (String) lVar.f3974c)) {
                    try {
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? B1.d.e(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0)) : r1.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        lValueOf = null;
                    }
                    if (lValueOf != null && lValueOf.longValue() == lVar.f3972a) {
                        try {
                            byte[] bArr = (byte[]) lVar.f3973b;
                            AbstractC1209k.f(bArr, "bytes");
                            parcelObtain = Parcel.obtain();
                            AbstractC1209k.e(parcelObtain, "obtain()");
                            try {
                                parcelObtain.unmarshall(bArr, 0, bArr.length);
                                parcelObtain.setDataPosition(0);
                                k kVar2 = new k(parcelObtain);
                                parcelObtain.recycle();
                                kVar = kVar2;
                            } finally {
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } finally {
            }
        }
        if (kVar == null) {
            kVar = f3975e;
        }
        this.f3979d = kVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.f3979d.f3970q).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i7) {
        try {
            return ((long[]) this.f3979d.f3970q)[i7];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i7) {
        try {
            return ((RemoteViews[]) this.f3979d.f3971r)[i7];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f3976a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f3979d.f3968o;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f3979d.f3969p;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
