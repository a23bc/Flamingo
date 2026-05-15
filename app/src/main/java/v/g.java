package V;

import M.E0;
import M.Z;
import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import g1.C0956B;
import g1.C0959a;
import g1.C0967i;
import g1.C0980v;
import java.util.List;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f7320o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ h f7321p;

    public /* synthetic */ g(h hVar, int i7) {
        this.f7320o = i7;
        this.f7321p = hVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6 = true;
        h hVar = this.f7321p;
        switch (this.f7320o) {
            case 0:
                Z z7 = hVar.f7324G;
                Boolean bool = Boolean.TRUE;
                z7.f4514t.setValue(bool);
                hVar.f7324G.f4513s.setValue(bool);
                h.E0(hVar.f7324G, ((C0622g) obj).f9970p, hVar.f7325H);
                return bool;
            case 1:
                List list = (List) obj;
                if (hVar.f7324G.d() != null) {
                    E0 e0D = hVar.f7324G.d();
                    AbstractC1209k.c(e0D);
                    list.add(e0D.f4386a);
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 2:
                h.E0(hVar.f7324G, ((C0622g) obj).f9970p, hVar.f7325H);
                return Boolean.TRUE;
            default:
                C0622g c0622g = (C0622g) obj;
                hVar.getClass();
                if (hVar.f7325H) {
                    C0956B c0956b = hVar.f7324G.f4501e;
                    if (c0956b != null) {
                        List listE0 = Z4.o.e0(new C0967i(), new C0959a(c0622g, 1));
                        Z z8 = hVar.f7324G;
                        C0980v c0980vU = z8.f4500d.u(listE0);
                        c0956b.a(null, c0980vU);
                        z8.f4516v.b(c0980vU);
                    } else {
                        C0980v c0980v = hVar.f7323F;
                        String str = c0980v.f12384a.f9970p;
                        int i7 = L.f9944c;
                        long j3 = c0980v.f12385b;
                        int i8 = (int) (j3 >> 32);
                        int i9 = (int) (j3 & 4294967295L);
                        AbstractC1209k.f(str, "<this>");
                        AbstractC1209k.f(c0622g, "replacement");
                        if (i9 < i8) {
                            throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) str, 0, i8);
                        sb.append((CharSequence) c0622g);
                        sb.append((CharSequence) str, i9, str.length());
                        String string = sb.toString();
                        int length = c0622g.f9970p.length() + ((int) (hVar.f7323F.f12385b >> 32));
                        hVar.f7324G.f4516v.b(new C0980v(AbstractC0607C.b(length, length), string, 4));
                    }
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
        }
    }

    public /* synthetic */ g(h hVar, Y0.j jVar) {
        this.f7320o = 3;
        this.f7321p = hVar;
    }
}
