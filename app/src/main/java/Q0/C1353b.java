package q0;

import c5.i;
import d.C0746L;
import f0.C0912t;
import g0.K;
import java.util.List;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1353b implements K, c5.g {

    /* JADX INFO: renamed from: p */
    public static final C0746L f15440p = new C0746L(18);

    /* JADX INFO: renamed from: o */
    public final C0912t f15441o;

    public C1353b(C0912t c0912t) {
        this.f15441o = c0912t;
    }

    @Override // g0.K
    public final List e(Integer num) {
        return this.f15441o.D();
    }

    @Override // c5.g
    public final c5.h getKey() {
        return f15440p;
    }

    @Override // c5.i
    public final i h(i iVar) {
        return I0.c.L(this, iVar);
    }

    @Override // c5.i
    public final c5.g n(c5.h hVar) {
        return I0.c.z(this, hVar);
    }

    @Override // c5.i
    public final i u(c5.h hVar) {
        return I0.c.H(this, hVar);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
