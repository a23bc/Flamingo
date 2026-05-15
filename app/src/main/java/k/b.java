package K;

import B.k;
import E3.e;
import K0.A;
import Y0.g;
import Y0.j;
import Y0.t;
import Y0.v;
import Y0.w;
import a1.EnumC0510a;
import s5.InterfaceC1438c;
import x.C1885x;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C1885x {
    public boolean Z;
    public A a0;
    public final e b0;

    public b(boolean z6, k kVar, boolean z7, g gVar, A a4) {
        super(kVar, null, false, z7, null, gVar, new a(0, a4, z6));
        this.Z = z6;
        this.a0 = a4;
        this.b0 = new e(3, this);
    }

    @Override // x.AbstractC1869p
    public final void E0(j jVar) {
        EnumC0510a enumC0510a = this.Z ? EnumC0510a.f8831o : EnumC0510a.f8832p;
        InterfaceC1438c[] interfaceC1438cArr = v.f8556a;
        w wVar = t.f8523I;
        InterfaceC1438c interfaceC1438c = v.f8556a[24];
        wVar.a(jVar, enumC0510a);
    }
}
