package b2;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v0 f10340d = new v0(new long[0], new RemoteViews[0], 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteViews[] f10342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10343c;

    public v0(long[] jArr, RemoteViews[] remoteViewsArr, int i7) {
        this.f10341a = jArr;
        this.f10342b = remoteViewsArr;
        this.f10343c = i7;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i7 < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = Z4.n.K0(Z4.n.N0(arrayList)).size();
        if (size <= this.f10343c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f10343c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
