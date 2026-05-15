package w5;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends B5.r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ThreadLocal f19490s;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public G0(c5.d dVar, c5.i iVar) {
        H0 h02 = H0.f19491o;
        super(dVar, iVar.n(h02) == null ? iVar.h(h02) : iVar);
        this.f19490s = new ThreadLocal();
        if (dVar.getContext().n(c5.e.f10684o) instanceof AbstractC1805x) {
            return;
        }
        Object objM = B5.a.m(iVar, null);
        B5.a.g(iVar, objM);
        j0(iVar, objM);
    }

    @Override // B5.r, w5.p0
    public final void A(Object obj) {
        if (this.threadLocalIsSet) {
            Y4.h hVar = (Y4.h) this.f19490s.get();
            if (hVar != null) {
                B5.a.g((c5.i) hVar.f8726o, hVar.f8727p);
            }
            this.f19490s.remove();
        }
        Object objV = AbstractC1767D.v(obj);
        c5.d dVar = this.f914r;
        c5.i context = dVar.getContext();
        Object objM = B5.a.m(context, null);
        G0 g0B = objM != B5.a.f881f ? AbstractC1767D.B(dVar, context, objM) : null;
        try {
            this.f914r.resumeWith(objV);
            if (g0B == null || g0B.i0()) {
                B5.a.g(context, objM);
            }
        } catch (Throwable th) {
            if (g0B == null || g0B.i0()) {
                B5.a.g(context, objM);
            }
            throw th;
        }
    }

    public final boolean i0() {
        boolean z6 = this.threadLocalIsSet && this.f19490s.get() == null;
        this.f19490s.remove();
        return !z6;
    }

    public final void j0(c5.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f19490s.set(new Y4.h(iVar, obj));
    }
}
