package e2;

import Z1.n;
import g2.s;
import l5.e;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850a extends AbstractC1210l implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0850a f11558q = new C0850a(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0850a f11559r = new C0850a(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11560p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0850a(int i7, int i8) {
        super(i7);
        this.f11560p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11560p) {
            case 0:
                n nVar = (n) obj2;
                return nVar instanceof s ? nVar : obj;
            default:
                n nVar2 = (n) obj2;
                return nVar2 instanceof g2.n ? nVar2 : obj;
        }
    }
}
