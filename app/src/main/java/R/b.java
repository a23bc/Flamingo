package R;

import O0.C;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.C1220v;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1180a {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6161o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ h f6162p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ T.e f6163q;

    public /* synthetic */ b(h hVar, T.e eVar, int i7) {
        this.f6161o = i7;
        this.f6162p = hVar;
        this.f6163q = eVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f6161o) {
            case 0:
                h hVar = this.f6162p;
                a aVar = hVar.f6183f;
                E3.e eVar = new E3.e(7, this.f6163q);
                C1220v c1220v = new C1220v();
                hVar.f6182e.d("dataBuilder", aVar, new G.i(c1220v, 4, eVar));
                Object obj = c1220v.f14439o;
                if (obj != null) {
                    return (P.c) obj;
                }
                AbstractC1209k.m("result");
                throw null;
            case 1:
                h hVar2 = this.f6162p;
                a aVar2 = hVar2.f6184g;
                b bVar = new b(hVar2, this.f6163q, 2);
                C1220v c1220v2 = new C1220v();
                hVar2.f6182e.d("positioner", aVar2, new G.i(c1220v2, 4, bVar));
                Object obj2 = c1220v2.f14439o;
                if (obj2 != null) {
                    return (C1893c) obj2;
                }
                AbstractC1209k.m("result");
                throw null;
            default:
                C c7 = (C) this.f6162p.f6180c.a();
                return this.f6163q.K(c7).i(c7.I(0L));
        }
    }
}
