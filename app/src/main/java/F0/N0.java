package f0;

import m5.AbstractC1209k;
import p0.AbstractC1280A;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends AbstractC1280A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11725c;

    public N0(long j3, int i7) {
        super(j3);
        this.f11725c = i7;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f11725c = ((N0) abstractC1280A).f11725c;
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new N0(j3, this.f11725c);
    }
}
