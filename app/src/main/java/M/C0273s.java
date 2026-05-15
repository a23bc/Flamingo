package M;

import X.K0;
import f0.C0879c;
import f0.C0912t;

/* JADX INFO: renamed from: M.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0273s implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4671o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4673q;

    public /* synthetic */ C0273s(K0 k02, boolean z6, int i7) {
        this.f4673q = k02;
        this.f4672p = z6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4671o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                V.g((K0) this.f4673q, this.f4672p, c0912t, C0879c.B(1));
                break;
            default:
                t6.b.a(this.f4672p, (n0.d) this.f4673q, c0912t, C0879c.B(385));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0273s(boolean z6, n0.d dVar, int i7) {
        this.f4672p = z6;
        this.f4673q = dVar;
    }
}
