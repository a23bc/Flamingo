package M;

import E0.C0095f;
import Q0.AbstractC0347f;
import X.K0;
import d2.C0821i;
import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1107a;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1217s;
import m5.C1219u;
import o5.AbstractC1267a;
import r0.InterfaceC1398p;
import u6.C1563f;
import x0.C1892b;
import yos.music.player.data.libraries.YosMediaItem;
import z.C2057q;
import z.M0;
import z.P0;

/* JADX INFO: renamed from: M.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0271p implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f4649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f4650r;

    public /* synthetic */ C0271p(int i7, int i8, Object obj, Object obj2, Object obj3) {
        this.f4647o = i8;
        this.f4648p = obj;
        this.f4649q = obj2;
        this.f4650r = obj3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4647o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(385);
                V.f((InterfaceC1398p) this.f4648p, (K0) this.f4649q, (n0.d) this.f4650r, (C0912t) obj, iB);
                break;
            case 1:
                ((Integer) obj2).getClass();
                String str = (String) this.f4648p;
                AbstractC1209k.f(str, "$subTitle");
                YosMediaItem yosMediaItem = (YosMediaItem) this.f4649q;
                AbstractC1209k.f(yosMediaItem, "$music");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f4650r;
                AbstractC1209k.f(interfaceC1180a, "$onClick");
                AbstractC1267a.f(str, yosMediaItem, interfaceC1180a, (C0912t) obj, C0879c.B(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                D0.b bVar = (D0.b) this.f4648p;
                AbstractC1209k.f(bVar, "$icon");
                String str2 = (String) this.f4649q;
                AbstractC1209k.f(str2, "$label");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f4650r;
                AbstractC1209k.f(interfaceC1180a2, "$onClick");
                android.support.v4.media.session.b.a(bVar, str2, interfaceC1180a2, (C0912t) obj, C0879c.B(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                String str3 = (String) this.f4648p;
                AbstractC1209k.f(str3, "$label");
                i6.z.c(str3, (C0095f) this.f4649q, (InterfaceC1180a) this.f4650r, (C0912t) obj, C0879c.B(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                String str4 = (String) this.f4648p;
                AbstractC1209k.f(str4, "$content");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f4649q;
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) this.f4650r;
                AbstractC1209k.f(interfaceC1182c2, "$expandedOnChanged");
                i6.g.m(str4, interfaceC1182c, interfaceC1182c2, (C0912t) obj, C0879c.B(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                y3.x xVar = (y3.x) this.f4648p;
                AbstractC1209k.f(xVar, "$navController");
                AbstractC1109c.d(xVar, (List) this.f4649q, (String) this.f4650r, (C0912t) obj, C0879c.B(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n0.d dVar = (n0.d) this.f4650r;
                int iB2 = C0879c.B(385);
                u6.L.a((InterfaceC1398p) this.f4648p, (C1563f) this.f4649q, dVar, (C0912t) obj, iB2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                n0.d dVar2 = (n0.d) this.f4650r;
                int iB3 = C0879c.B(385);
                AbstractC1107a.d((InterfaceC1398p) this.f4648p, (v6.h) this.f4649q, dVar2, (C0912t) obj, iB3);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iB4 = C0879c.B(391);
                AbstractC1110d.j((InterfaceC1398p) this.f4648p, (C0095f) this.f4649q, (InterfaceC1180a) this.f4650r, (C0912t) obj, iB4);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                K0.u uVar = (K0.u) obj;
                C1892b c1892b = (C1892b) obj2;
                z.J j3 = (z.J) this.f4648p;
                long jC = AbstractC0347f.w(j3).c(0L);
                C1219u c1219u = (C1219u) this.f4649q;
                if (!C1892b.b(jC, c1219u.f14438o)) {
                    j3.f20665L = C1892b.h(j3.f20665L, C1892b.g(jC, c1219u.f14438o));
                }
                c1219u.f14438o = jC;
                N5.d.h((K1.l) this.f4650r, uVar, j3.f20665L);
                y5.c cVar = j3.f20662I;
                if (cVar != null) {
                    cVar.k(new C2057q(c1892b.f19867a));
                }
                break;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                C1217s c1217s = (C1217s) this.f4648p;
                float f7 = fFloatValue - c1217s.f14436o;
                P0 p02 = (P0) this.f4649q;
                long jH = p02.h(p02.d(f7));
                P0 p03 = ((M0) this.f4650r).f20688a;
                c1217s.f14436o += p02.d(p02.g(p03.c(p03.f20720k, jH, 1)));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0271p(Object obj, Object obj2, Object obj3, int i7) {
        this.f4647o = i7;
        this.f4648p = obj;
        this.f4649q = obj2;
        this.f4650r = obj3;
    }
}
