package x3;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: renamed from: x3.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1933r extends C1932q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1934s f20102q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1933r(C1934s c1934s, Context context) {
        super(c1934s, context);
        this.f20102q = c1934s;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        Z.a(bundle);
        C1934s c1934s = this.f20102q;
        AbstractServiceC1940y abstractServiceC1940y = c1934s.f20103u;
        k.I i7 = new k.I(20, result);
        abstractServiceC1940y.f20129t = abstractServiceC1940y.f20126q;
        i7.M(null);
        abstractServiceC1940y.f20129t = null;
        c1934s.f20103u.f20129t = null;
    }
}
