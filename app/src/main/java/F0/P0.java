package f0;

import m5.AbstractC1209k;
import p0.AbstractC1280A;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractC1280A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11731c;

    public P0(long j3, Object obj) {
        super(j3);
        this.f11731c = obj;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f11731c = ((P0) abstractC1280A).f11731c;
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new P0(p0.l.k().g(), this.f11731c);
    }
}
