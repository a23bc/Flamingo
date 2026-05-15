package E0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ F f1644q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f7, int i7) {
        super(1);
        this.f1643p = i7;
        this.f1644q = f7;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [l5.a, m5.l] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f1643p) {
            case 0:
                F f7 = this.f1644q;
                f7.f1647d = true;
                f7.f1649f.a();
                return Y4.o.f8736a;
            default:
                A0.f fVar = (A0.f) obj;
                F f8 = this.f1644q;
                C0092c c0092c = f8.f1645b;
                float f9 = f8.f1653k;
                float f10 = f8.l;
                A0.b bVarA = fVar.A();
                long jW = bVarA.W();
                bVarA.S().l();
                try {
                    ((A.b) bVarA.f50p).E(f9, f10, 0L);
                    c0092c.a(fVar);
                    n1.c.A(bVarA, jW);
                    return Y4.o.f8736a;
                } catch (Throwable th) {
                    n1.c.A(bVarA, jW);
                    throw th;
                }
        }
    }
}
