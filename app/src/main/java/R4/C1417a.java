package r4;

import f4.q;
import p4.i;
import p4.n;

/* JADX INFO: renamed from: r4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1417a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15772b;

    public C1417a(int i7) {
        this.f15772b = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // r4.e
    public final f a(q qVar, i iVar) {
        return !(iVar instanceof n) ? new d(qVar, iVar) : ((n) iVar).f15094c == g4.f.f12508o ? new d(qVar, iVar) : new C1418b(qVar, iVar, this.f15772b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1417a) {
            return this.f15772b == ((C1417a) obj).f15772b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15772b * 31) + 1237;
    }
}
