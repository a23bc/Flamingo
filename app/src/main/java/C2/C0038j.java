package C2;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: C2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038j extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f1123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f1124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0040l f1125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038j(C0040l c0040l, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f1125c = c0040l;
        this.f1123a = contentResolver;
        this.f1124b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        C0040l c0040l = this.f1125c;
        c0040l.a(C0035g.c(c0040l.f1128a, c0040l.f1135i, c0040l.h));
    }
}
