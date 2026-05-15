package x3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: x3.q */
/* JADX INFO: loaded from: classes.dex */
public class C1932q extends MediaBrowserService {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ F5.t f20100o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ F5.t f20101p;

    public C1932q(F5.t tVar, Context context) {
        this.f20101p = tVar;
        this.f20100o = tVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
        Bundle bundle2;
        C1930o c1930o;
        Z.a(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        F5.t tVar = this.f20100o;
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) tVar.f2444s;
        int i8 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            tVar.f2443r = new Messenger(abstractServiceC1940y.f20130u);
            bundle2 = new Bundle();
            bundle2.putInt("extra_service_version", 2);
            bundle2.putBinder("extra_messenger", ((Messenger) tVar.f2443r).getBinder());
            Y y6 = abstractServiceC1940y.f20131v;
            if (y6 != null) {
                InterfaceC1923h interfaceC1923hA = y6.a();
                bundle2.putBinder("extra_session_binder", interfaceC1923hA == null ? null : interfaceC1923hA.asBinder());
            } else {
                ((ArrayList) tVar.f2441p).add(bundle2);
            }
            i8 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
        }
        C1931p c1931p = new C1931p((AbstractServiceC1940y) tVar.f2444s, str, i8, i7, null);
        abstractServiceC1940y.f20129t = c1931p;
        C1930o c1930oA = abstractServiceC1940y.a(bundle3);
        abstractServiceC1940y.f20129t = null;
        if (c1930oA == null) {
            c1930o = null;
        } else {
            if (((Messenger) tVar.f2443r) != null) {
                abstractServiceC1940y.f20127r.add(c1931p);
            }
            Bundle bundle4 = c1930oA.f20090a;
            if (bundle2 == null) {
                bundle2 = bundle4;
            } else if (bundle4 != null) {
                bundle2.putAll(bundle4);
            }
            c1930o = new C1930o(bundle2);
        }
        if (c1930o == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", c1930o.f20090a);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        k.I i7 = new k.I(20, result);
        F5.t tVar = this.f20100o;
        tVar.getClass();
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) tVar.f2444s;
        abstractServiceC1940y.f20129t = abstractServiceC1940y.f20126q;
        i7.M(Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST);
        abstractServiceC1940y.f20129t = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        k.I i7 = new k.I(20, result);
        AbstractServiceC1940y abstractServiceC1940y = (AbstractServiceC1940y) this.f20101p.f2445t;
        abstractServiceC1940y.f20129t = abstractServiceC1940y.f20126q;
        i7.M(null);
        abstractServiceC1940y.f20129t = null;
    }
}
