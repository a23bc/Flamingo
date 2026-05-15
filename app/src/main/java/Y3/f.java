package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N5.d {
    @Override // N5.d
    public final void R(g gVar, g gVar2) {
        gVar.f8711b = gVar2;
    }

    @Override // N5.d
    public final void S(g gVar, Thread thread) {
        gVar.f8710a = thread;
    }

    @Override // N5.d
    public final boolean l(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f8717p != cVar) {
                    return false;
                }
                hVar.f8717p = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N5.d
    public final boolean m(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f8716o != obj) {
                    return false;
                }
                hVar.f8716o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N5.d
    public final boolean n(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f8718q != gVar) {
                    return false;
                }
                hVar.f8718q = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
