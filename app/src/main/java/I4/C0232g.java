package I4;

/* JADX INFO: renamed from: I4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232g extends I0.c {
    @Override // I0.c
    public final void M(o oVar, o oVar2) {
        oVar.f3523b = oVar2;
    }

    @Override // I0.c
    public final void N(o oVar, Thread thread) {
        oVar.f3522a = thread;
    }

    @Override // I0.c
    public final boolean l(p pVar, C0229d c0229d, C0229d c0229d2) {
        synchronized (pVar) {
            try {
                if (pVar.f3529p != c0229d) {
                    return false;
                }
                pVar.f3529p = c0229d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.c
    public final boolean m(p pVar, Object obj, Object obj2) {
        synchronized (pVar) {
            try {
                if (pVar.f3528o != obj) {
                    return false;
                }
                pVar.f3528o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.c
    public final boolean n(p pVar, o oVar, o oVar2) {
        synchronized (pVar) {
            try {
                if (pVar.f3530q != oVar) {
                    return false;
                }
                pVar.f3530q = oVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // I0.c
    public final C0229d w(p pVar) {
        C0229d c0229d;
        C0229d c0229d2 = C0229d.f3505d;
        synchronized (pVar) {
            c0229d = pVar.f3529p;
            if (c0229d != c0229d2) {
                pVar.f3529p = c0229d2;
            }
        }
        return c0229d;
    }

    @Override // I0.c
    public final o x(p pVar) {
        o oVar;
        o oVar2 = o.f3521c;
        synchronized (pVar) {
            oVar = pVar.f3530q;
            if (oVar != oVar2) {
                pVar.f3530q = oVar2;
            }
        }
        return oVar;
    }
}
