package l4;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import m5.AbstractC1209k;
import p4.l;
import s4.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1179b {
    @Override // l4.InterfaceC1179b
    public final String a(Object obj, l lVar) {
        Uri uri = (Uri) obj;
        if (!AbstractC1209k.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = lVar.f15078a.getResources().getConfiguration();
        Bitmap.Config config = e.f15919a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
