package P0;

import N5.l;
import f0.C0879c;
import f0.C0894j0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l {

    /* JADX INFO: renamed from: g */
    public final f f5710g;
    public final C0894j0 h = C0879c.t(null);

    public g(f fVar) {
        this.f5710g = fVar;
    }

    public final void V(f fVar, Object obj) {
        if (fVar != this.f5710g) {
            N0.a.b("Check failed.");
        }
        this.h.setValue(obj);
    }

    @Override // N5.l
    public final boolean s(f fVar) {
        return fVar == this.f5710g;
    }

    @Override // N5.l
    public final Object z(f fVar) {
        if (fVar != this.f5710g) {
            N0.a.b("Check failed.");
        }
        Object value = this.h.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
