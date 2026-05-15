package y;

import D.C0078t;
import f0.C0912t;
import f0.C0915u0;
import h6.z0;
import l5.InterfaceC1180a;
import p0.p;

/* JADX INFO: renamed from: y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1948d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20154a = new p();

    public static void b(C1948d c1948d, l5.e eVar, n0.d dVar, InterfaceC1180a interfaceC1180a, int i7) {
        if ((i7 & 8) != 0) {
            dVar = null;
        }
        c1948d.getClass();
        c1948d.f20154a.add(new n0.d(424163756, new z0(eVar, dVar, interfaceC1180a, 6), true));
    }

    public final void a(C1947c c1947c, C0912t c0912t, int i7) {
        c0912t.Z(1320309496);
        int i8 = (c0912t.f(c1947c) ? 4 : 2) | i7 | (c0912t.f(this) ? 32 : 16);
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            p pVar = this.f20154a;
            int size = pVar.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((l5.f) pVar.get(i9)).d(c1947c, c0912t, Integer.valueOf(i8 & 14));
            }
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C0078t(this, c1947c, i7, 24);
        }
    }
}
