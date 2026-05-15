package H;

import F.C0130c;
import O0.B0;
import X.AbstractC0498r0;
import X.InterfaceC0494p;
import d2.C0821i;
import f0.C0879c;
import f0.C0888g0;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1220v;
import o0.C1249f;
import r0.InterfaceC1386d;
import r0.InterfaceC1398p;
import y.AbstractC1950f;
import y.C1947c;
import yos.music.player.data.libraries.PlayList;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2794o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2798s;

    public /* synthetic */ I(int i7, int i8, Object obj, Object obj2, Object obj3) {
        this.f2794o = i8;
        this.f2797r = obj;
        this.f2795p = obj2;
        this.f2798s = obj3;
        this.f2796q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2796q;
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f2795p;
        Object obj4 = this.f2798s;
        Object obj5 = this.f2797r;
        switch (this.f2794o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(1);
                E.f((K) obj5, this.f2795p, this.f2796q, this.f2798s, (C0912t) obj, iB);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((g0) obj5).a(obj3, (n0.d) obj4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                R.p.c((P.g) obj5, (T.e) obj3, (InterfaceC1180a) obj4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iB2 = C0879c.B(i7 | 1);
                n0.d dVar = R.l.f6197a;
                N5.l.h((InterfaceC1398p) obj5, (f0.D) obj3, (n0.d) obj4, (C0912t) obj, iB2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0498r0.a((InterfaceC0494p) obj5, (InterfaceC1386d) obj3, (n0.d) obj4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                C0130c c0130c = (C0130c) obj5;
                AbstractC1209k.f(c0130c, "$this_SmallMusicListItem");
                YosMediaItem yosMediaItem = (YosMediaItem) obj3;
                AbstractC1209k.f(yosMediaItem, "$music");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj4;
                AbstractC1209k.f(interfaceC1180a, "$itemClick");
                M3.a.u(c0130c, yosMediaItem, interfaceC1180a, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) obj5;
                AbstractC1209k.f(interfaceC0878b0, "$musicList");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a2, "$shuffleModeEnabledLambda");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) obj4;
                AbstractC1209k.f(interfaceC1180a3, "$thisMusicPlayingLambda");
                M3.a.n(interfaceC0878b0, interfaceC1180a2, interfaceC1180a3, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                C0130c c0130c2 = (C0130c) obj5;
                AbstractC1209k.f(c0130c2, "$this_PlayListItem");
                PlayList playList = (PlayList) obj3;
                AbstractC1209k.f(playList, "$playList");
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) obj4;
                AbstractC1209k.f(interfaceC1180a4, "$itemClick");
                i6.h.g(c0130c2, playList, interfaceC1180a4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                ((n0.d) obj5).j(obj3, obj4, (C0912t) obj, C0879c.B(i7) | 1);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                ((Integer) obj2).getClass();
                ((C1249f) obj5).a(obj3, (n0.d) obj4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                v6.i iVar = (v6.i) obj5;
                AbstractC1209k.f(iVar, "$item");
                InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) obj3;
                AbstractC1209k.f(interfaceC1180a5, "$nowLabel");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) obj4;
                AbstractC1209k.f(interfaceC1182c, "$onLabelChange");
                j0.k.h(iVar, interfaceC1180a5, interfaceC1182c, (C0912t) obj, C0879c.B(i7 | 1));
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                B0 b0 = (B0) obj;
                n1.a aVar = (n1.a) obj2;
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) obj5;
                n0.d dVar2 = (n0.d) obj3;
                C0888g0 c0888g0 = (C0888g0) obj4;
                AbstractC1209k.f(c0888g0, "$xOffset$delegate");
                AbstractC1209k.f(b0, "$this$SubcomposeLayout");
                long jA = n1.a.a(aVar.f14505a, 0, Integer.MAX_VALUE, 0, 0, 13);
                C1220v c1220v = new C1220v();
                O0.m0 m0VarD = ((O0.Y) Z4.n.q0(b0.D(v6.f.f18362o, new n0.d(-2140035542, new D.M(3, dVar2), true)))).d(jA);
                c1220v.f14439o = m0VarD;
                C1220v c1220v2 = new C1220v();
                int i8 = m0VarD.f5416o + i7;
                long j3 = aVar.f14505a;
                if (i8 <= n1.a.h(j3)) {
                    c1220v.f14439o = ((O0.Y) Z4.n.q0(b0.D(v6.f.f18363p, new n0.d(1350200368, new D.M(1, dVar2), true)))).d(j3);
                    interfaceC0878b02.setValue(null);
                } else {
                    int iL = b0.L(30);
                    interfaceC0878b02.setValue(new v6.g(((O0.m0) c1220v.f14439o).f5416o + iL, n1.a.h(j3)));
                    int iH = c0888g0.h() + ((O0.m0) c1220v.f14439o).f5416o + iL;
                    if (n1.a.h(j3) - iH > 0) {
                        c1220v2.f14439o = new Y4.h(((O0.Y) Z4.n.q0(b0.D(v6.f.f18363p, new n0.d(2062820203, new D.M(2, dVar2), true)))).d(jA), Integer.valueOf(iH));
                    }
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC1950f.b((InterfaceC1398p) obj5, (C1947c) obj3, (InterfaceC1182c) obj4, (C0912t) obj, C0879c.B(1), this.f2796q);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1950f.a((C1947c) obj5, (InterfaceC1398p) obj3, (n0.d) obj4, (C0912t) obj, C0879c.B(i7 | 1));
                break;
        }
        return oVar;
    }

    public /* synthetic */ I(int i7, InterfaceC0878b0 interfaceC0878b0, n0.d dVar, C0888g0 c0888g0) {
        this.f2794o = 11;
        this.f2796q = i7;
        this.f2797r = interfaceC0878b0;
        this.f2795p = dVar;
        this.f2798s = c0888g0;
    }

    public /* synthetic */ I(K k7, Object obj, int i7, Object obj2, int i8) {
        this.f2794o = 0;
        this.f2797r = k7;
        this.f2795p = obj;
        this.f2796q = i7;
        this.f2798s = obj2;
    }

    public /* synthetic */ I(InterfaceC1398p interfaceC1398p, f0.D d4, n0.d dVar, int i7) {
        this.f2794o = 3;
        n0.d dVar2 = R.l.f6197a;
        this.f2797r = interfaceC1398p;
        this.f2795p = d4;
        this.f2798s = dVar;
        this.f2796q = i7;
    }

    public /* synthetic */ I(InterfaceC1398p interfaceC1398p, C1947c c1947c, InterfaceC1182c interfaceC1182c, int i7, int i8) {
        this.f2794o = 12;
        this.f2797r = interfaceC1398p;
        this.f2795p = c1947c;
        this.f2798s = interfaceC1182c;
        this.f2796q = i8;
    }
}
