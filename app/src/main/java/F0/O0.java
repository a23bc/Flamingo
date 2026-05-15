package f0;

import m5.AbstractC1209k;
import p0.AbstractC1280A;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractC1280A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11727c;

    public O0(long j3, long j7) {
        super(j3);
        this.f11727c = j7;
    }

    @Override // p0.AbstractC1280A
    public final void a(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f11727c = ((O0) abstractC1280A).f11727c;
    }

    @Override // p0.AbstractC1280A
    public final AbstractC1280A b(long j3) {
        return new O0(j3, this.f11727c);
    }
}
