package b2;

import android.widget.RemoteViews;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteViews f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0664i0 f10351b;

    public x0(RemoteViews remoteViews, C0664i0 c0664i0) {
        this.f10350a = remoteViews;
        this.f10351b = c0664i0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return AbstractC1209k.a(this.f10350a, x0Var.f10350a) && AbstractC1209k.a(this.f10351b, x0Var.f10351b);
    }

    public final int hashCode() {
        return this.f10351b.hashCode() + (this.f10350a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f10350a + ", view=" + this.f10351b + ')';
    }
}
