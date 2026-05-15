package f0;

import m5.AbstractC1209k;
import p0.AbstractC1280A;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends AbstractC1280A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11719c;

    public M0(long j3, float f7) {
        super(j3);
        this.f11719c = f7;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f11719c = ((M0) abstractC1280A).f11719c;
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new M0(j3, this.f11719c);
    }
}
