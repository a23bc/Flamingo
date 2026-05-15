package A2;

import H2.InterfaceC0208z;

/* JADX INFO: renamed from: A2.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0014o implements D4.j {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f386o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f387p;

    public /* synthetic */ C0014o(int i7, Object obj) {
        this.f386o = i7;
        this.f387p = obj;
    }

    @Override // D4.j
    public final Object get() {
        switch (this.f386o) {
            case 0:
                return (f6.b) this.f387p;
            case 1:
                return Boolean.valueOf(((V) this.f387p).f180N);
            default:
                try {
                    return (InterfaceC0208z) ((Class) this.f387p).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e7) {
                    throw new IllegalStateException(e7);
                }
        }
    }
}
