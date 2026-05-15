package x3;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import q.S0;
import t.C1450e;
import w3.HandlerC1759x0;

/* JADX INFO: renamed from: x3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1925j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f20052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f20053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HandlerC1759x0 f20054d = new HandlerC1759x0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1450e f20055e = new C1450e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V1.a f20056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f20057g;
    public Y h;

    public C1925j(Context context, ComponentName componentName, S0 s02) {
        this.f20051a = context;
        Bundle bundle = new Bundle();
        this.f20053c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        s02.f15226q = this;
        C1924i c1924i = (C1924i) s02.f15225p;
        c1924i.getClass();
        this.f20052b = new MediaBrowser(context, componentName, c1924i, bundle);
    }
}
