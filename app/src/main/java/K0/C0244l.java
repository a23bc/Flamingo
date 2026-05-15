package K0;

import A2.C0001b;
import t.C1444F;
import t.C1463s;

/* JADX INFO: renamed from: K0.l */
/* JADX INFO: loaded from: classes.dex */
public class C0244l {

    /* JADX INFO: renamed from: a */
    public final h0.e f3894a = new h0.e(new C0243k[16]);

    /* JADX INFO: renamed from: b */
    public final C1444F f3895b = new C1444F(10);

    public boolean a(C1463s c1463s, O0.C c7, C0001b c0001b, boolean z6) {
        h0.e eVar = this.f3894a;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        boolean z7 = false;
        for (int i8 = 0; i8 < i7; i8++) {
            z7 = ((C0243k) objArr[i8]).a(c1463s, c7, c0001b, z6) || z7;
        }
        return z7;
    }

    public void b(C0001b c0001b) {
        h0.e eVar = this.f3894a;
        int i7 = eVar.f12548q;
        while (true) {
            i7--;
            if (-1 >= i7) {
                return;
            }
            if (((C0243k) eVar.f12546o[i7]).f3888d.f4090b == 0) {
                eVar.l(i7);
            }
        }
    }
}
