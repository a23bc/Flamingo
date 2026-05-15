package C1;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentProviderClient f935b;

    public c(Context context, Uri uri, int i7) {
        this.f934a = i7;
        switch (i7) {
            case 1:
                this.f935b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f935b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    public final void a() {
        switch (this.f934a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f935b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f935b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                }
                break;
        }
    }
}
