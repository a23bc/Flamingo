package E5;

import B5.s;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f2022e;

    public k(long j3, k kVar, int i7) {
        super(j3, kVar, i7);
        this.f2022e = new AtomicReferenceArray(j.f2021f);
    }

    @Override // B5.s
    public final int g() {
        return j.f2021f;
    }

    @Override // B5.s
    public final void h(int i7, c5.i iVar) {
        this.f2022e.set(i7, j.f2020e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f916c + ", hashCode=" + hashCode() + ']';
    }
}
