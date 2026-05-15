package D;

import f0.EnumC0917v0;
import java.util.concurrent.CancellationException;
import l5.InterfaceC1182c;
import p0.AbstractC1289f;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f1236o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1237p;

    public /* synthetic */ J(int i7, Object obj) {
        this.f1236o = i7;
        this.f1237p = obj;
    }

    private final Object e(Object obj) {
        f0.B0 b0 = (f0.B0) this.f1237p;
        Throwable th = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (b0.f11623c) {
            try {
                InterfaceC1786g0 interfaceC1786g0 = b0.f11624d;
                if (interfaceC1786g0 != null) {
                    z5.J j3 = b0.f11639u;
                    EnumC0917v0 enumC0917v0 = EnumC0917v0.f11937p;
                    j3.getClass();
                    j3.j(null, enumC0917v0);
                    interfaceC1786g0.c(cancellationException);
                    b0.f11636r = null;
                    interfaceC1786g0.t(new h0(b0, 18, th));
                } else {
                    b0.f11625e = cancellationException;
                    z5.J j7 = b0.f11639u;
                    EnumC0917v0 enumC0917v02 = EnumC0917v0.f11936o;
                    j7.getClass();
                    j7.j(null, enumC0917v02);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Y4.o.f8736a;
    }

    private final Object f(Object obj) {
        AbstractC1289f abstractC1289f = (AbstractC1289f) ((InterfaceC1182c) this.f1237p).b((p0.j) obj);
        synchronized (p0.l.f14941c) {
            p0.l.f14942d = p0.l.f14942d.i(abstractC1289f.g());
        }
        return abstractC1289f;
    }

    /* JADX WARN: Removed duplicated region for block: B:423:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x04c4  */
    @Override // l5.InterfaceC1182c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.J.b(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ J(Object obj, int i7, Object obj2) {
        this.f1236o = i7;
        this.f1237p = obj;
    }
}
