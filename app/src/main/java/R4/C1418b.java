package r4;

import f4.q;
import i4.C1087b;
import p4.i;
import p4.n;

/* JADX INFO: renamed from: r4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1418b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15775c;

    public C1418b(q qVar, i iVar, int i7) {
        this.f15773a = qVar;
        this.f15774b = iVar;
        this.f15775c = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // r4.f
    public final void a() {
        this.f15773a.getClass();
        i iVar = this.f15774b;
        boolean z6 = iVar instanceof n;
        new C1087b(iVar.a(), iVar.b().f15075y, this.f15775c, (z6 && ((n) iVar).f15098g) ? false : true);
        if (z6) {
            return;
        }
        boolean z7 = iVar instanceof p4.d;
    }
}
