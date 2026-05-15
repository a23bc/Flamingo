package p0;

import i0.InterfaceC1056d;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1280A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1056d f14955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14956d;

    public r(long j3, InterfaceC1056d interfaceC1056d) {
        super(j3);
        this.f14955c = interfaceC1056d;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        r rVar = (r) abstractC1280A;
        synchronized (q.f14954b) {
            this.f14955c = rVar.f14955c;
            this.f14956d = rVar.f14956d;
        }
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new r(j3, this.f14955c);
    }
}
