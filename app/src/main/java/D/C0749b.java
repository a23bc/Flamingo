package d;

import android.window.BackEvent;

/* JADX INFO: renamed from: d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10755d;

    public C0749b(BackEvent backEvent) {
        C0748a c0748a = C0748a.f10751a;
        float fD = c0748a.d(backEvent);
        float fE = c0748a.e(backEvent);
        float fB = c0748a.b(backEvent);
        int iC = c0748a.c(backEvent);
        this.f10752a = fD;
        this.f10753b = fE;
        this.f10754c = fB;
        this.f10755d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f10752a);
        sb.append(", touchY=");
        sb.append(this.f10753b);
        sb.append(", progress=");
        sb.append(this.f10754c);
        sb.append(", swipeEdge=");
        return Z1.l.r(sb, this.f10755d, '}');
    }
}
