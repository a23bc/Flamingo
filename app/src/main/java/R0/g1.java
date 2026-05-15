package R0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y5.c f6462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(y5.c cVar, Handler handler) {
        super(handler);
        this.f6462a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6, Uri uri) {
        this.f6462a.k(Y4.o.f8736a);
    }
}
