package b2;

import android.os.Build;
import android.widget.RemoteViews;
import l2.AbstractC1166f;
import l2.C1162b;
import l2.C1163c;
import l2.C1164d;
import l2.C1165e;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f10284a = new r();

    public final void a(RemoteViews remoteViews, int i7, AbstractC1166f abstractC1166f) {
        AbstractC1209k.f(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
        }
        remoteViews.setBoolean(i7, "setClipToOutline", true);
        if (abstractC1166f instanceof C1162b) {
            remoteViews.setViewOutlinePreferredRadius(i7, ((C1162b) abstractC1166f).f14162a, 1);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + abstractC1166f.getClass().getCanonicalName()).toString());
        }
    }

    public final void b(RemoteViews remoteViews, int i7, AbstractC1166f abstractC1166f) {
        if (abstractC1166f instanceof C1165e) {
            remoteViews.setViewLayoutHeight(i7, -2.0f, 0);
            return;
        }
        if (abstractC1166f instanceof C1163c) {
            remoteViews.setViewLayoutHeight(i7, 0.0f, 0);
        } else if (abstractC1166f instanceof C1162b) {
            remoteViews.setViewLayoutHeight(i7, ((C1162b) abstractC1166f).f14162a, 1);
        } else {
            if (!AbstractC1209k.a(abstractC1166f, C1164d.f14164a)) {
                throw new A2.W();
            }
            remoteViews.setViewLayoutHeight(i7, -1.0f, 0);
        }
    }

    public final void c(RemoteViews remoteViews, int i7, AbstractC1166f abstractC1166f) {
        if (abstractC1166f instanceof C1165e) {
            remoteViews.setViewLayoutWidth(i7, -2.0f, 0);
            return;
        }
        if (abstractC1166f instanceof C1163c) {
            remoteViews.setViewLayoutWidth(i7, 0.0f, 0);
        } else if (abstractC1166f instanceof C1162b) {
            remoteViews.setViewLayoutWidth(i7, ((C1162b) abstractC1166f).f14162a, 1);
        } else {
            if (!AbstractC1209k.a(abstractC1166f, C1164d.f14164a)) {
                throw new A2.W();
            }
            remoteViews.setViewLayoutWidth(i7, -1.0f, 0);
        }
    }
}
