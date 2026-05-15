package H;

import java.util.concurrent.CancellationException;
import r5.C1423d;
import w5.InterfaceC1791j;
import z.C2033e;

/* JADX INFO: renamed from: H.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0170l {

    /* JADX INFO: renamed from: a */
    public final h0.e f2906a;

    public C0170l(int i7) {
        switch (i7) {
            case 1:
                this.f2906a = new h0.e(new C2033e[16]);
                break;
            default:
                this.f2906a = new h0.e(new C0169k[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        h0.e eVar = this.f2906a;
        int i7 = eVar.f12548q;
        InterfaceC1791j[] interfaceC1791jArr = new InterfaceC1791j[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            interfaceC1791jArr[i8] = ((C2033e) eVar.f12546o[i8]).f20801b;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            interfaceC1791jArr[i9].l(cancellationException);
        }
        if (eVar.f12548q == 0) {
            return;
        }
        C.b.c("uncancelled requests present");
    }

    public void b() {
        h0.e eVar = this.f2906a;
        C1423d c1423dM = i6.h.M(0, eVar.f12548q);
        int i7 = c1423dM.f15781o;
        int i8 = c1423dM.f15782p;
        if (i7 <= i8) {
            while (true) {
                ((C2033e) eVar.f12546o[i7]).f20801b.resumeWith(Y4.o.f8736a);
                if (i7 == i8) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        eVar.h();
    }
}
