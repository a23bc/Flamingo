package B3;

import S5.u;
import Z4.w;
import Z4.y;
import android.content.Context;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f811a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f817g;
    public final Object h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f818i;

    public a(boolean z6, boolean z7, u uVar, Long l, Long l7, Long l8, Long l9, Map map) {
        AbstractC1209k.f(map, "extras");
        this.f812b = z6;
        this.f813c = z7;
        this.f814d = uVar;
        this.f815e = l;
        this.f816f = l7;
        this.f817g = l8;
        this.h = l9;
        this.f818i = y.p0(map);
    }

    public String toString() {
        switch (this.f811a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f812b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f813c) {
                    arrayList.add("isDirectory");
                }
                Long l = (Long) this.f815e;
                if (l != null) {
                    arrayList.add("byteCount=" + l);
                }
                Long l7 = (Long) this.f816f;
                if (l7 != null) {
                    arrayList.add("createdAt=" + l7);
                }
                Long l8 = (Long) this.f817g;
                if (l8 != null) {
                    arrayList.add("lastModifiedAt=" + l8);
                }
                Long l9 = (Long) this.h;
                if (l9 != null) {
                    arrayList.add("lastAccessedAt=" + l9);
                }
                Map map = (Map) this.f818i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return Z4.n.w0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z6, boolean z7, u uVar, Long l, Long l7, Long l8, Long l9) {
        this(z6, z7, uVar, l, l7, l8, l9, w.f8819o);
    }

    public a(Context context, String str, H3.a aVar, j jVar, ArrayList arrayList, boolean z6, int i7, Executor executor, Executor executor2, boolean z7, boolean z8) {
        this.f814d = aVar;
        this.f815e = context;
        this.f816f = str;
        this.f817g = jVar;
        this.h = executor;
        this.f818i = executor2;
        this.f812b = z7;
        this.f813c = z8;
    }
}
