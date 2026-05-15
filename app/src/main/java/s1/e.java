package s1;

import k.AbstractC1113a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1113a {
    @Override // k.AbstractC1113a
    public final void K(f fVar, f fVar2) {
        fVar.f15855b = fVar2;
    }

    @Override // k.AbstractC1113a
    public final void L(f fVar, Thread thread) {
        fVar.f15854a = thread;
    }

    @Override // k.AbstractC1113a
    public final boolean t(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15861p != cVar) {
                    return false;
                }
                gVar.f15861p = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k.AbstractC1113a
    public final boolean u(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f15860o != obj) {
                    return false;
                }
                gVar.f15860o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k.AbstractC1113a
    public final boolean v(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f15862q != fVar) {
                    return false;
                }
                gVar.f15862q = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
