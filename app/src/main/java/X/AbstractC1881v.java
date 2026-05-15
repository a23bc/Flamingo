package x;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: x.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1881v {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(EdgeEffect edgeEffect, float f7, float f8) {
        try {
            return edgeEffect.onPullDistance(f7, f8);
        } catch (Throwable unused) {
            edgeEffect.onPull(f7, f8);
            return 0.0f;
        }
    }
}
