package U5;

import D.A0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1110d;
import o0.AbstractC1256m;
import y3.AbstractC2010C;
import yos.music.player.SettingsActivity;
import z4.AbstractC2102u;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f7216p;

    public /* synthetic */ Z(SettingsActivity settingsActivity, int i7) {
        this.f7215o = i7;
        this.f7216p = settingsActivity;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        int i7 = 0;
        switch (this.f7215o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    y3.x xVarG = AbstractC1110d.G(new AbstractC2010C[0], c0912t);
                    c0912t.X(-483061216);
                    Object objK = c0912t.K();
                    f0.W w7 = C0903o.f11850a;
                    if (objK == w7) {
                        objK = C0879c.t(null);
                        c0912t.i0(objK);
                    }
                    InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) objK;
                    c0912t.p(false);
                    InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) AbstractC1256m.e(new Object[]{"error"}, new A0(12), c0912t, 48);
                    c0912t.X(-483053382);
                    boolean zF = c0912t.f(interfaceC0878b02);
                    SettingsActivity settingsActivity = this.f7216p;
                    boolean zF2 = zF | c0912t.f(settingsActivity);
                    Object objK2 = c0912t.K();
                    if (zF2 || objK2 == w7) {
                        objK2 = new V(null, interfaceC0878b0, interfaceC0878b02, settingsActivity);
                        c0912t.i0(objK2);
                    }
                    c0912t.p(false);
                    C0879c.e(c0912t, oVar, (l5.e) objK2);
                    AbstractC2102u.a(false, false, n0.e.e(1210271905, new Y(xVarG, settingsActivity, interfaceC0878b02, interfaceC0878b0, 1), c0912t), c0912t, 384);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    t6.b.a(false, n0.e.e(-362036037, new Z(this.f7216p, i7), c0912t2), c0912t2, 384);
                }
                break;
        }
        return oVar;
    }
}
