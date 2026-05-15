package x;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: x.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1824K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19654a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f19655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f19656c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f19655b = dLog;
        f19656c = dLog - 1.0d;
    }
}
