package J2;

import t2.C1487p;
import t2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3647t;

    public f(int i7, i0 i0Var, int i8, i iVar, int i9) {
        int i10;
        super(i7, i0Var, i8);
        this.f3646s = A0.e.y(i9, iVar.f3683n0) ? 1 : 0;
        C1487p c1487p = this.f3700r;
        int i11 = c1487p.f16707s;
        int i12 = -1;
        if (i11 != -1 && (i10 = c1487p.f16708t) != -1) {
            i12 = i11 * i10;
        }
        this.f3647t = i12;
    }

    @Override // J2.m
    public final int a() {
        return this.f3646s;
    }

    @Override // J2.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f3647t, ((f) obj).f3647t);
    }
}
