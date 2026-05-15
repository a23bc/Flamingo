package M;

import l5.InterfaceC1182c;
import p0.C1285b;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4415o;

    /* JADX INFO: renamed from: p */
    public final Object f4416p;

    /* JADX INFO: renamed from: q */
    public final Object f4417q;

    public /* synthetic */ J(Object obj, int i7, Object obj2) {
        this.f4415o = i7;
        this.f4416p = obj;
        this.f4417q = obj2;
    }

    private final Object e(Object obj) {
        long j3;
        p0.j jVar = (p0.j) obj;
        synchronized (p0.l.f14941c) {
            j3 = p0.l.f14943e;
            p0.l.f14943e = ((long) 1) + j3;
        }
        return new C1285b(j3, jVar, (InterfaceC1182c) this.f4416p, (InterfaceC1182c) this.f4417q);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x01b9  */
    @Override // l5.InterfaceC1182c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M.J.b(java.lang.Object):java.lang.Object");
    }

    public J(w0.i iVar, Z z6) {
        this.f4415o = 1;
        this.f4417q = iVar;
        this.f4416p = z6;
    }
}
