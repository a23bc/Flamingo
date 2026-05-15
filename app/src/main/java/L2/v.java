package L2;

import androidx.datastore.preferences.protobuf.C0535h;
import t2.s0;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a */
    public final C0247a f4222a;

    /* JADX INFO: renamed from: b */
    public final q f4223b;

    /* JADX INFO: renamed from: c */
    public final p f4224c = new p();

    /* JADX INFO: renamed from: d */
    public final d1.e f4225d = new d1.e(4, (byte) 0);

    /* JADX INFO: renamed from: e */
    public final d1.e f4226e = new d1.e(4, (byte) 0);

    /* JADX INFO: renamed from: f */
    public final C0535h f4227f;

    /* JADX INFO: renamed from: g */
    public s0 f4228g;
    public s0 h;

    /* JADX INFO: renamed from: i */
    public long f4229i;

    /* JADX INFO: renamed from: j */
    public long f4230j;

    public v(C0247a c0247a, q qVar) {
        this.f4222a = c0247a;
        this.f4223b = qVar;
        C0535h c0535h = new C0535h(6, (byte) 0);
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c0535h.f9479b = 0;
        c0535h.f9480c = 0;
        c0535h.f9482e = new long[iHighestOneBit];
        c0535h.f9481d = iHighestOneBit - 1;
        this.f4227f = c0535h;
        this.h = s0.f16725e;
        this.f4230j = -9223372036854775807L;
    }

    public final void a() {
        C0535h c0535h = this.f4227f;
        c0535h.f9479b = 0;
        c0535h.f9480c = 0;
        this.f4230j = -9223372036854775807L;
        d1.e eVar = this.f4226e;
        if (eVar.t() > 0) {
            AbstractC1697a.d(eVar.t() > 0);
            while (eVar.t() > 1) {
                eVar.o();
            }
            Object objO = eVar.o();
            objO.getClass();
            eVar.a(0L, (Long) objO);
        }
        s0 s0Var = this.f4228g;
        d1.e eVar2 = this.f4225d;
        if (s0Var != null) {
            eVar2.d();
            return;
        }
        if (eVar2.t() > 0) {
            AbstractC1697a.d(eVar2.t() > 0);
            while (eVar2.t() > 1) {
                eVar2.o();
            }
            Object objO2 = eVar2.o();
            objO2.getClass();
            this.f4228g = (s0) objO2;
        }
    }
}
