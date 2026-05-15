package d1;

import android.text.SegmentFinder;

/* JADX INFO: renamed from: d1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0811a extends SegmentFinder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ V1.a f11179a;

    public C0811a(V1.a aVar) {
        this.f11179a = aVar;
    }

    public final int nextEndBoundary(int i7) {
        return this.f11179a.j(i7);
    }

    public final int nextStartBoundary(int i7) {
        return this.f11179a.n(i7);
    }

    public final int previousEndBoundary(int i7) {
        return this.f11179a.o(i7);
    }

    public final int previousStartBoundary(int i7) {
        return this.f11179a.f(i7);
    }
}
