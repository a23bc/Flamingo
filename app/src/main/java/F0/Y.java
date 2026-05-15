package f0;

import l5.InterfaceC1182c;
import p0.C1288e;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f11782p;

    public /* synthetic */ Y(InterfaceC1182c interfaceC1182c, int i7) {
        this.f11781o = i7;
        this.f11782p = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        long j3;
        switch (this.f11781o) {
            case 0:
                return this.f11782p.b(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                p0.j jVar = (p0.j) obj;
                synchronized (p0.l.f14941c) {
                    j3 = p0.l.f14943e;
                    p0.l.f14943e = ((long) 1) + j3;
                }
                return new C1288e(j3, jVar, this.f11782p);
        }
    }
}
