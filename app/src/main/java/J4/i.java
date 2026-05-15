package j4;

import android.net.Uri;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.m f13713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.m f13714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13715c;

    public i(Y4.m mVar, Y4.m mVar2, boolean z6) {
        this.f13713a = mVar;
        this.f13714b = mVar2;
        this.f13715c = z6;
    }

    @Override // j4.f
    public final g a(Object obj, p4.l lVar) {
        Uri uri = (Uri) obj;
        if (AbstractC1209k.a(uri.getScheme(), "http") || AbstractC1209k.a(uri.getScheme(), "https")) {
            return new l(uri.toString(), lVar, this.f13713a, this.f13714b, this.f13715c);
        }
        return null;
    }
}
