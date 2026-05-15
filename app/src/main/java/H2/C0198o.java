package H2;

import A2.x0;
import N2.C0294k;
import android.net.Uri;
import d.C0746L;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import t2.C1468A;
import t2.C1469B;
import t2.C1470C;
import t2.C1486o;
import t2.C1487p;
import t2.C1491u;
import t2.C1492v;
import t2.C1494x;
import t2.C1495y;
import t2.C1496z;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: H2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0198o implements InterfaceC0208z {

    /* JADX INFO: renamed from: a */
    public final C0196m f3212a;

    /* JADX INFO: renamed from: b */
    public final V1.a f3213b;

    /* JADX INFO: renamed from: c */
    public C0746L f3214c;

    /* JADX INFO: renamed from: d */
    public final long f3215d;

    /* JADX INFO: renamed from: e */
    public final long f3216e;

    /* JADX INFO: renamed from: f */
    public final long f3217f;

    /* JADX INFO: renamed from: g */
    public final float f3218g;
    public final float h;

    /* JADX INFO: renamed from: i */
    public boolean f3219i;

    public C0198o(YosPlaybackService yosPlaybackService, C0294k c0294k) {
        V1.a aVar = new V1.a(yosPlaybackService);
        this.f3213b = aVar;
        C0746L c0746l = new C0746L(12);
        this.f3214c = c0746l;
        C0196m c0196m = new C0196m(c0294k, c0746l);
        this.f3212a = c0196m;
        if (aVar != ((V1.a) c0196m.f3208f)) {
            c0196m.f3208f = aVar;
            ((HashMap) c0196m.f3206d).clear();
            ((HashMap) c0196m.f3207e).clear();
        }
        this.f3215d = -9223372036854775807L;
        this.f3216e = -9223372036854775807L;
        this.f3217f = -9223372036854775807L;
        this.f3218g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.f3219i = true;
    }

    public static InterfaceC0208z d(Class cls, V1.a aVar) {
        try {
            return (InterfaceC0208z) cls.getConstructor(y2.g.class).newInstance(aVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // H2.InterfaceC0208z
    public final InterfaceC0208z a(boolean z6) {
        this.f3219i = z6;
        C0196m c0196m = this.f3212a;
        c0196m.f3204b = z6;
        C0294k c0294k = (C0294k) c0196m.f3205c;
        synchronized (c0294k) {
            c0294k.f5062p = z6;
        }
        Iterator it = ((HashMap) c0196m.f3207e).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0208z) it.next()).a(z6);
        }
        return this;
    }

    @Override // H2.InterfaceC0208z
    public final InterfaceC0208z b(C0746L c0746l) {
        this.f3214c = c0746l;
        C0196m c0196m = this.f3212a;
        c0196m.f3209g = c0746l;
        C0294k c0294k = (C0294k) c0196m.f3205c;
        synchronized (c0294k) {
            c0294k.f5063q = c0746l;
        }
        Iterator it = ((HashMap) c0196m.f3207e).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC0208z) it.next()).b(c0746l);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H2.InterfaceC0208z
    public final AbstractC0184a c(t2.G g6) {
        boolean z6;
        Uri uri;
        int i7;
        String str;
        long j3;
        List list;
        E4.I i8;
        C2.I i9;
        Uri uri2;
        String str2;
        C1491u c1491u;
        String str3;
        t2.G g7 = g6;
        g7.f16224b.getClass();
        String scheme = g7.f16224b.f16185a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(g7.f16224b.f16186b, "application/x-image-uri")) {
            long j7 = g7.f16224b.h;
            int i10 = w2.t.f18881a;
            throw null;
        }
        C1469B c1469b = g7.f16224b;
        int iY = w2.t.y(c1469b.f16185a, c1469b.f16186b);
        if (g7.f16224b.h != -9223372036854775807L) {
            C0294k c0294k = (C0294k) this.f3212a.f3205c;
            synchronized (c0294k) {
                c0294k.f5064r = 1;
            }
        }
        try {
            C0196m c0196m = this.f3212a;
            HashMap map = (HashMap) c0196m.f3207e;
            InterfaceC0208z interfaceC0208z = (InterfaceC0208z) map.get(Integer.valueOf(iY));
            if (interfaceC0208z == null) {
                interfaceC0208z = (InterfaceC0208z) c0196m.f(iY).get();
                interfaceC0208z.b((C0746L) c0196m.f3209g);
                interfaceC0208z.a(c0196m.f3204b);
                map.put(Integer.valueOf(iY), interfaceC0208z);
            }
            C1496z c1496zA = g7.f16225c.a();
            C1468A c1468a = g7.f16225c;
            if (c1468a.f16173a == -9223372036854775807L) {
                c1496zA.f16772a = this.f3215d;
            }
            if (c1468a.f16176d == -3.4028235E38f) {
                c1496zA.f16775d = this.f3218g;
            }
            if (c1468a.f16177e == -3.4028235E38f) {
                c1496zA.f16776e = this.h;
            }
            if (c1468a.f16174b == -9223372036854775807L) {
                c1496zA.f16773b = this.f3216e;
            }
            if (c1468a.f16175c == -9223372036854775807L) {
                c1496zA.f16774c = this.f3217f;
            }
            C1468A c1468a2 = new C1468A(c1496zA);
            if (c1468a2.equals(g7.f16225c)) {
                z6 = true;
                uri = null;
                i7 = 0;
            } else {
                C2.I i11 = new C2.I(2);
                List list2 = Collections.EMPTY_LIST;
                E4.b0 b0Var = E4.b0.f1913s;
                C1470C c1470c = C1470C.f16192d;
                C1492v c1492v = new C1492v();
                C1494x c1494x = g7.f16227e;
                c1492v.f16739a = c1494x.f16751b;
                c1492v.f16740b = c1494x.f16753d;
                c1492v.f16741c = c1494x.f16754e;
                c1492v.f16742d = c1494x.f16755f;
                c1492v.f16743e = c1494x.f16756g;
                String str4 = g7.f16223a;
                t2.J j8 = g7.f16226d;
                g7.f16225c.a();
                C1470C c1470c2 = g7.f16228f;
                C1469B c1469b2 = g7.f16224b;
                if (c1469b2 != null) {
                    String str5 = c1469b2.f16190f;
                    String str6 = c1469b2.f16186b;
                    Uri uri3 = c1469b2.f16185a;
                    List list3 = c1469b2.f16189e;
                    uri = null;
                    E4.I i12 = c1469b2.f16191g;
                    i7 = 0;
                    C1495y c1495y = c1469b2.f16187c;
                    if (c1495y != null) {
                        z6 = true;
                        i9 = new C2.I();
                        i9.f984d = c1495y.f16765a;
                        i9.f985e = c1495y.f16766b;
                        i9.f986f = c1495y.f16767c;
                        i9.f981a = c1495y.f16768d;
                        i9.f982b = c1495y.f16769e;
                        i9.f983c = c1495y.f16770f;
                        i9.f987g = c1495y.f16771g;
                        i9.h = c1495y.h;
                    } else {
                        z6 = true;
                        i9 = new C2.I(2);
                    }
                    C1491u c1491u2 = c1469b2.f16188d;
                    str = str4;
                    j3 = c1469b2.h;
                    i8 = i12;
                    str3 = str5;
                    str2 = str6;
                    uri2 = uri3;
                    list = list3;
                    c1491u = c1491u2;
                } else {
                    str = str4;
                    uri = null;
                    z6 = true;
                    i7 = 0;
                    j3 = -9223372036854775807L;
                    list = list2;
                    i8 = b0Var;
                    i9 = i11;
                    uri2 = null;
                    str2 = null;
                    c1491u = null;
                    str3 = null;
                }
                C1496z c1496zA2 = c1468a2.a();
                AbstractC1697a.i((((Uri) i9.f985e) == null || ((UUID) i9.f984d) != null) ? z6 : i7);
                C1469B c1469b3 = uri2 != null ? new C1469B(uri2, str2, ((UUID) i9.f984d) != null ? new C1495y(i9) : uri, c1491u, list, str3, i8, j3) : uri;
                String str7 = str != null ? str : "";
                C1494x c1494x2 = new C1494x(c1492v);
                C1468A c1468a3 = new C1468A(c1496zA2);
                if (j8 == null) {
                    j8 = t2.J.f16263J;
                }
                g7 = new t2.G(str7, c1494x2, c1469b3, c1468a3, j8, c1470c2);
            }
            AbstractC0184a abstractC0184aC = interfaceC0208z.c(g7);
            E4.I i13 = g7.f16224b.f16191g;
            if (!i13.isEmpty()) {
                AbstractC0184a[] abstractC0184aArr = new AbstractC0184a[i13.size() + 1];
                abstractC0184aArr[i7] = abstractC0184aC;
                for (int i14 = i7; i14 < i13.size(); i14++) {
                    if (this.f3219i) {
                        C1486o c1486o = new C1486o();
                        c1486o.l = t2.M.j(((t2.F) i13.get(i14)).f16212b);
                        c1486o.f16620d = ((t2.F) i13.get(i14)).f16213c;
                        c1486o.f16621e = ((t2.F) i13.get(i14)).f16214d;
                        c1486o.f16622f = ((t2.F) i13.get(i14)).f16215e;
                        c1486o.f16618b = ((t2.F) i13.get(i14)).f16216f;
                        c1486o.f16617a = ((t2.F) i13.get(i14)).f16217g;
                        P p7 = new P(this.f3213b, new B2.b(this, 2, new C1487p(c1486o)));
                        int i15 = i14 + 1;
                        String string = ((t2.F) i13.get(i14)).f16211a.toString();
                        C1492v c1492v2 = new C1492v();
                        C2.I i16 = new C2.I(2);
                        List list4 = Collections.EMPTY_LIST;
                        E4.b0 b0Var2 = E4.b0.f1913s;
                        C1496z c1496z = new C1496z();
                        C1470C c1470c3 = C1470C.f16192d;
                        Uri uri4 = string == null ? uri : Uri.parse(string);
                        AbstractC1697a.i((((Uri) i16.f985e) == null || ((UUID) i16.f984d) != null) ? z6 : i7);
                        abstractC0184aArr[i15] = p7.c(new t2.G("", new C1494x(c1492v2), uri4 != null ? new C1469B(uri4, null, ((UUID) i16.f984d) != null ? new C1495y(i16) : uri, null, list4, null, b0Var2, -9223372036854775807L) : uri, new C1468A(c1496z), t2.J.f16263J, c1470c3));
                    } else {
                        V1.a aVar = this.f3213b;
                        aVar.getClass();
                        abstractC0184aArr[i14 + 1] = new d0((t2.F) i13.get(i14), aVar, new x0(17));
                    }
                }
                abstractC0184aC = new H(abstractC0184aArr);
            }
            AbstractC0184a c0189f = abstractC0184aC;
            C1494x c1494x3 = g7.f16227e;
            long j9 = c1494x3.f16751b;
            if (j9 != 0 || c1494x3.f16753d != Long.MIN_VALUE || c1494x3.f16755f) {
                c0189f = new C0189f(c0189f, j9, c1494x3.f16753d, !c1494x3.f16756g, c1494x3.f16754e, c1494x3.f16755f);
            }
            g7.f16224b.getClass();
            if (g7.f16224b.f16188d == null) {
                return c0189f;
            }
            AbstractC1697a.w("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return c0189f;
        } catch (ClassNotFoundException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
