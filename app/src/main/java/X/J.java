package X;

import f0.C0894j0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import x0.C1892b;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7926o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0495p0 f7927p;

    public /* synthetic */ J(C0495p0 c0495p0, int i7) {
        this.f7926o = i7;
        this.f7927p = c0495p0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        D d4;
        D d7;
        switch (this.f7926o) {
            case 0:
                return new H.F(9, this.f7927p);
            case 1:
                long jLongValue = ((Long) obj).longValue();
                C0495p0 c0495p0 = this.f7927p;
                if (c0495p0.f8126a.a().b(jLongValue)) {
                    c0495p0.j();
                    c0495p0.m(null);
                }
                return Y4.o.f8736a;
            case 2:
                long jLongValue2 = ((Long) obj).longValue();
                C0495p0 c0495p02 = this.f7927p;
                E eG = c0495p02.g();
                if (eG != null && (d7 = eG.f7891a) != null && jLongValue2 == d7.f7889c) {
                    c0495p02.f8139p.setValue(null);
                }
                E eG2 = c0495p02.g();
                if (eG2 != null && (d4 = eG2.f7892b) != null && jLongValue2 == d4.f7889c) {
                    c0495p02.f8140q.setValue(null);
                }
                if (c0495p02.f8126a.a().b(jLongValue2)) {
                    c0495p02.p();
                }
                return Y4.o.f8736a;
            case 3:
                O0.C c7 = (O0.C) obj;
                C0495p0 c0495p03 = this.f7927p;
                C1893c c1893c = (C1893c) c0495p03.f8134j.getValue();
                if (c1893c == null) {
                    return null;
                }
                O0.C c8 = c0495p03.l;
                if (c8 != null) {
                    return androidx.compose.foundation.text.contextmenu.modifier.a.d(c1893c, c8, c7);
                }
                C.b.d("Required value was null.");
                throw new A2.W();
            case 4:
                O0.C c9 = (O0.C) obj;
                C0495p0 c0495p04 = this.f7927p;
                c0495p04.l = c9;
                if (((Boolean) c0495p04.f8133i.getValue()).booleanValue() && c0495p04.g() != null) {
                    C1892b c1892b = c9 != null ? new C1892b(c9.h(0L)) : null;
                    if (!AbstractC1209k.a(c0495p04.f8135k, c1892b)) {
                        c0495p04.f8135k = c1892b;
                        c0495p04.n();
                        c0495p04.p();
                    }
                }
                return Y4.o.f8736a;
            case 5:
                w0.t tVar = (w0.t) ((w0.s) obj);
                boolean zA = tVar.a();
                C0495p0 c0495p05 = this.f7927p;
                C0894j0 c0894j0 = c0495p05.f8133i;
                if (!zA && ((Boolean) c0894j0.getValue()).booleanValue()) {
                    c0495p05.j();
                }
                c0894j0.setValue(Boolean.valueOf(tVar.a()));
                return Y4.o.f8736a;
            case 6:
                this.f7927p.l(((Boolean) obj).booleanValue());
                return Y4.o.f8736a;
            case 7:
                this.f7927p.m((E) obj);
                return Y4.o.f8736a;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                C0495p0 c0495p06 = this.f7927p;
                boolean zB = c0495p06.f8126a.a().b(jLongValue3);
                Y4.o oVar = Y4.o.f8736a;
                if (zB) {
                    c0495p06.f8136m.setValue(oVar);
                    c0495p06.n();
                    c0495p06.p();
                }
                return oVar;
        }
    }
}
