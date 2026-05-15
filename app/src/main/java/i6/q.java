package i6;

import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import f0.U;
import f0.W;
import f0.Z0;
import java.util.List;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public final class q implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13565p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z0 f13567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f13568s;

    public q(InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, Z0 z02, List list) {
        this.f13564o = 1;
        this.f13565p = interfaceC0878b0;
        this.f13566q = interfaceC0878b02;
        this.f13567r = z02;
        this.f13568s = list;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13564o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    Object value = this.f13565p.getValue();
                    SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
                    Integer numValueOf = Integer.valueOf(settingsLibrary.getSongSort());
                    Boolean boolValueOf = Boolean.valueOf(settingsLibrary.getEnableDescending());
                    c0912t.X(1399523001);
                    boolean zF = c0912t.f(this.f13568s);
                    Object objK = c0912t.K();
                    W w7 = C0903o.f11850a;
                    if (zF || objK == w7) {
                        p pVar = new p(this.f13566q, this.f13567r, this.f13568s, this.f13565p, null);
                        c0912t.i0(pVar);
                        objK = pVar;
                    }
                    l5.e eVar = (l5.e) objK;
                    c0912t.p(false);
                    boolean zF2 = c0912t.f(value) | c0912t.f(numValueOf) | c0912t.f(boolValueOf);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new U(c0912t.f11889R, eVar);
                        c0912t.i0(objK2);
                    }
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    Object value2 = this.f13565p.getValue();
                    c0912t2.X(-1253832434);
                    Object objK3 = c0912t2.K();
                    if (objK3 == C0903o.f11850a) {
                        j6.n nVar = new j6.n(this.f13566q, this.f13567r, this.f13568s, this.f13565p, null);
                        c0912t2.i0(nVar);
                        objK3 = nVar;
                    }
                    c0912t2.p(false);
                    C0879c.e(c0912t2, value2, (l5.e) objK3);
                }
                break;
            default:
                C0912t c0912t3 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t3.z()) {
                    c0912t3.Q();
                } else {
                    Object value3 = this.f13565p.getValue();
                    c0912t3.X(476102608);
                    boolean zF3 = c0912t3.f(this.f13568s);
                    Object objK4 = c0912t3.K();
                    if (zF3 || objK4 == C0903o.f11850a) {
                        k6.d dVar = new k6.d(this.f13566q, this.f13567r, this.f13568s, this.f13565p, null);
                        c0912t3.i0(dVar);
                        objK4 = dVar;
                    }
                    c0912t3.p(false);
                    C0879c.e(c0912t3, value3, (l5.e) objK4);
                }
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ q(InterfaceC0878b0 interfaceC0878b0, List list, InterfaceC0878b0 interfaceC0878b02, Z0 z02, int i7) {
        this.f13564o = i7;
        this.f13565p = interfaceC0878b0;
        this.f13568s = list;
        this.f13566q = interfaceC0878b02;
        this.f13567r = z02;
    }
}
