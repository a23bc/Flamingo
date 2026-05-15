package S;

import A2.W;
import N5.l;
import O0.C;
import k.AbstractC1113a;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements T.e {

    /* JADX INFO: renamed from: o */
    public final long f6704o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ f f6705p;

    public d(f fVar, long j3) {
        this.f6705p = fVar;
        this.f6704o = j3;
    }

    @Override // T.e
    public final long C(C c7) {
        C c8 = (C) this.f6705p.f6711F.getValue();
        if (c8 != null) {
            return c7.K(c8, this.f6704o);
        }
        C.b.d("Tried to open context menu before the anchor was placed.");
        throw new W();
    }

    @Override // T.e
    public final C1893c K(C c7) {
        return AbstractC1113a.o(C(c7), 0L);
    }

    @Override // T.e
    public final P.c j0() {
        return l.q(this.f6705p);
    }
}
