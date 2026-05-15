package C1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o5.AbstractC1267a;
import t.C1465u;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    public static final C1465u f939a = new C1465u(2);

    /* JADX INFO: renamed from: b */
    public static final b f940b = new b(0);

    public static k a(Context context, List list) {
        AbstractC1267a.n("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                f fVar = (f) list.get(i7);
                ProviderInfo providerInfoB = b(context.getPackageManager(), fVar, context.getResources());
                if (providerInfoB == null) {
                    return new k(0);
                }
                arrayList.add(c(context, fVar, providerInfoB.authority));
            }
            return new k(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, f fVar, Resources resources) {
        AbstractC1267a.n("FontProvider.getProvider");
        try {
            List listI = fVar.f944d;
            String str = fVar.f941a;
            String str2 = fVar.f942b;
            if (listI == null) {
                listI = x1.b.i(resources, 0);
            }
            d dVar = new d();
            dVar.f936a = str;
            dVar.f937b = str2;
            dVar.f938c = listI;
            C1465u c1465u = f939a;
            ProviderInfo providerInfo = (ProviderInfo) c1465u.c(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            b bVar = f940b;
            Collections.sort(arrayList, bVar);
            for (int i7 = 0; i7 < listI.size(); i7++) {
                ArrayList arrayList2 = new ArrayList((Collection) listI.get(i7));
                Collections.sort(arrayList2, bVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i8), (byte[]) arrayList2.get(i8))) {
                            break;
                        }
                    }
                    c1465u.d(dVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x006d. Please report as an issue. */
    public static l[] c(Context context, f fVar, String str) {
        Cursor cursorQuery;
        AbstractC1267a.n("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            c cVar = Build.VERSION.SDK_INT < 24 ? new c(context, uriBuild, 0) : new c(context, uriBuild, 1);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC1267a.n("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {fVar.f943c};
                    switch (cVar.f934a) {
                        case 0:
                            ContentProviderClient contentProviderClient = cVar.f935b;
                            if (contentProviderClient != null) {
                                cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            }
                            cursorQuery = null;
                            break;
                        default:
                            ContentProviderClient contentProviderClient2 = cVar.f935b;
                            if (contentProviderClient2 != null) {
                                cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            }
                            cursorQuery = null;
                            break;
                    }
                    Cursor cursor2 = cursorQuery;
                    Trace.endSection();
                    if (cursor2 != null && cursor2.getCount() > 0) {
                        int columnIndex = cursor2.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor2.getColumnIndex("_id");
                        int columnIndex3 = cursor2.getColumnIndex("file_id");
                        int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor2.getColumnIndex("font_weight");
                        int columnIndex6 = cursor2.getColumnIndex("font_italic");
                        while (cursor2.moveToNext()) {
                            int i7 = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                            arrayList2.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursor2.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursor2.getLong(columnIndex3)), columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i7));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    cVar.a();
                    return (l[]) arrayList.toArray(new l[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                cVar.a();
                throw th;
            }
        } finally {
        }
    }
}
