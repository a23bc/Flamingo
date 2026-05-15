package B4;

import android.view.View;
import android.view.Window;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    public final Window f871a;

    /* JADX INFO: renamed from: b */
    public final A.b f872b;

    public a(View view, Window window) {
        AbstractC1209k.f(view, "view");
        this.f871a = window;
        this.f872b = window != null ? new A.b(view, window) : null;
    }
}
