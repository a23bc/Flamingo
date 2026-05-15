package z5;

import b2.C0676q;
import d5.EnumC0830a;

/* JADX INFO: renamed from: z5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2107b extends A5.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0676q f21275r;

    public C2107b(C0676q c0676q, c5.i iVar, int i7, y5.a aVar) {
        super(iVar, i7, aVar);
        this.f21275r = c0676q;
    }

    @Override // A5.g
    public final Object c(y5.p pVar, A5.f fVar) {
        Object objInvoke = this.f21275r.invoke(pVar, fVar);
        return objInvoke == EnumC0830a.f11264o ? objInvoke : Y4.o.f8736a;
    }

    @Override // A5.g
    public final A5.g d(c5.i iVar, int i7, y5.a aVar) {
        return new C2107b(this.f21275r, iVar, i7, aVar);
    }

    @Override // A5.g
    public final String toString() {
        return "block[" + this.f21275r + "] -> " + super.toString();
    }
}
