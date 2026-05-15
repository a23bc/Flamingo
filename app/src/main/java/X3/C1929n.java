package x3;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import t.C1450e;

/* JADX INFO: renamed from: x3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1929n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1931p f20083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f20085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC1940y f20086g;

    public C1929n(AbstractServiceC1940y abstractServiceC1940y, Object obj, C1931p c1931p, String str, Bundle bundle) {
        this.f20086g = abstractServiceC1940y;
        this.f20083d = c1931p;
        this.f20084e = str;
        this.f20085f = bundle;
        this.f20080a = obj;
    }

    public final void a() {
        if (this.f20081b) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f20080a);
        }
        this.f20081b = true;
        C1450e c1450e = this.f20086g.f20128s;
        C1931p c1931p = this.f20083d;
        k.I i7 = c1931p.f20096e;
        i7.getClass();
        if (c1450e.get(((Messenger) i7.f13847p).getBinder()) != c1931p) {
            int i8 = AbstractServiceC1940y.f20123w;
            return;
        }
        int i9 = 1 & this.f20082c;
        Bundle bundle = this.f20085f;
        if (i9 != 0) {
            int i10 = AbstractServiceC1940y.f20123w;
        }
        try {
            String str = this.f20084e;
            i7.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            i7.L(3, bundle2);
        } catch (RemoteException unused) {
        }
    }
}
