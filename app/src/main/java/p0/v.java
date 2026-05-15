package p0;

import j0.AbstractC1092c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC1280A {

    /* JADX INFO: renamed from: c */
    public AbstractC1092c f14980c;

    /* JADX INFO: renamed from: d */
    public int f14981d;

    /* JADX INFO: renamed from: e */
    public int f14982e;

    public v(long j3, AbstractC1092c abstractC1092c) {
        super(j3);
        this.f14980c = abstractC1092c;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        synchronized (q.f14953a) {
            AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f14980c = ((v) abstractC1280A).f14980c;
            this.f14981d = ((v) abstractC1280A).f14981d;
            this.f14982e = ((v) abstractC1280A).f14982e;
        }
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new v(j3, this.f14980c);
    }
}
