package h6;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12747o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f12755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12756x;

    public /* synthetic */ A(Z5.b bVar, Z5.c cVar, y3.x xVar, InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1182c interfaceC1182c2, InterfaceC1180a interfaceC1180a4, int i7) {
        this.f12751s = bVar;
        this.f12752t = cVar;
        this.f12753u = xVar;
        this.f12748p = interfaceC1180a;
        this.f12755w = interfaceC1182c;
        this.f12749q = interfaceC1180a2;
        this.f12750r = interfaceC1180a3;
        this.f12756x = interfaceC1182c2;
        this.f12754v = interfaceC1180a4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f12755w;
        Object obj4 = this.f12752t;
        Object obj5 = this.f12756x;
        Object obj6 = this.f12753u;
        Object obj7 = this.f12754v;
        Object obj8 = this.f12751s;
        switch (this.f12747o) {
            case 0:
                ((Integer) obj2).getClass();
                Z5.b bVar = (Z5.b) obj8;
                Z5.c cVar = (Z5.c) obj4;
                AbstractC1209k.f(cVar, "$mediaViewModel");
                y3.x xVar = (y3.x) obj6;
                AbstractC1209k.f(xVar, "$navController");
                InterfaceC1180a interfaceC1180a = this.f12748p;
                AbstractC1209k.f(interfaceC1180a, "$isPlayingStatusLambda");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) obj3;
                AbstractC1209k.f(interfaceC1182c, "$isPlayingOnChanged");
                InterfaceC1180a interfaceC1180a2 = this.f12749q;
                AbstractC1209k.f(interfaceC1180a2, "$nowPageLambda");
                InterfaceC1180a interfaceC1180a3 = this.f12750r;
                AbstractC1209k.f(interfaceC1180a3, "$showMiniPlayer");
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) obj5;
                AbstractC1209k.f(interfaceC1182c2, "$nowPageOnChanged");
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) obj7;
                AbstractC1209k.f(interfaceC1180a4, "$expandNowPlaying");
                M3.a.i(bVar, cVar, xVar, interfaceC1180a, interfaceC1182c, interfaceC1180a2, interfaceC1180a3, interfaceC1182c2, interfaceC1180a4, (C0912t) obj, C0879c.B(1));
                break;
            default:
                ((Integer) obj2).getClass();
                n0.d dVar = s6.b.f15945a;
                String str = (String) obj8;
                AbstractC1209k.f(str, "$title");
                String str2 = (String) obj7;
                AbstractC1209k.f(str2, "$positiveContent");
                InterfaceC1180a interfaceC1180a5 = this.f12749q;
                AbstractC1209k.f(interfaceC1180a5, "$onPositive");
                InterfaceC1180a interfaceC1180a6 = this.f12750r;
                AbstractC1209k.f(interfaceC1180a6, "$onDismissRequest");
                int iB = C0879c.B(100666375);
                String str3 = (String) obj4;
                d0.n0 n0Var = (d0.n0) obj3;
                AbstractC1113a.n(str, str3, (n0.d) obj6, str2, n0Var, (d0.K) obj5, this.f12748p, interfaceC1180a5, interfaceC1180a6, (C0912t) obj, iB);
                break;
        }
        return oVar;
    }

    public /* synthetic */ A(String str, String str2, n0.d dVar, String str3, d0.n0 n0Var, d0.K k7, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, int i7) {
        n0.d dVar2 = s6.b.f15945a;
        this.f12751s = str;
        this.f12752t = str2;
        this.f12753u = dVar;
        this.f12754v = str3;
        this.f12755w = n0Var;
        this.f12756x = k7;
        this.f12748p = interfaceC1180a;
        this.f12749q = interfaceC1180a2;
        this.f12750r = interfaceC1180a3;
    }
}
